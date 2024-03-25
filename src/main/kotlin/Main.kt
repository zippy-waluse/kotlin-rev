fun main() {
  myString("drew gold digger dug out the gold")
    println(myNumbers(arrayOf(2,3,4)).contentToString())
    println()
}

fun myString(sentence:String){
    println(sentence.replace("d"," "))
}

fun myNumbers(values:Array<Int>): Array<Any>{
    return arrayOf(values.sum(), values.average(), values.count())
}

data class Numbers(
    var sum: Int,
    var count: Int,
    var average: Double
)

//fun calculate(nums:Array<Int>): Numbers{
// var sum = nums.sum()
//    var count = nums.count()
//    var average = nums.average()
//}