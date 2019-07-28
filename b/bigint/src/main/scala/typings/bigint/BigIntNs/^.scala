package typings.bigint.BigIntNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("BigInt")
@js.native
object ^ extends js.Object {
  def GCD(x: BigInt, y: BigInt): BigInt = js.native
  def GCD_(x: BigInt, y: BigInt): Unit = js.native
  def add(x: BigInt, y: BigInt): BigInt = js.native
  def addInt(x: BigInt, n: Double): BigInt = js.native
  def addInt_(x: BigInt, n: Double): Unit = js.native
  def addShift_(x: BigInt, y: BigInt, ys: Double): Unit = js.native
  def add_(x: BigInt, y: BigInt): Unit = js.native
  def bigInt2str(x: BigInt, base: String): String = js.native
  def bigInt2str(x: BigInt, base: Double): String = js.native
  def bitSize(x: BigInt): Double = js.native
  def carry_(x: BigInt): Unit = js.native
  def copyInt_(x: BigInt, n: Double): Unit = js.native
  def copy_(x: BigInt, y: BigInt): Unit = js.native
  def divInt_(x: BigInt, n: Double): Double = js.native
  def divide_(x: BigInt, y: BigInt, q: BigInt, r: BigInt): Unit = js.native
  def dup(x: BigInt): BigInt = js.native
  def eGCD_(x: BigInt, y: BigInt, d: BigInt, a: BigInt, b: BigInt): Unit = js.native
  def equals(x: BigInt, y: BigInt): Boolean = js.native
  def equalsInt(x: BigInt, y: Double): Boolean = js.native
  def expand(value: BigInt, n: Double): BigInt = js.native
  def findPrimes(n: Double): js.Array[Double] = js.native
  def greater(x: BigInt, y: BigInt): Boolean = js.native
  def greaterShift(x: BigInt, y: BigInt, shift: Double): Boolean = js.native
  def halve_(x: BigInt): Unit = js.native
  def int2bigInt(t: Double): BigInt = js.native
  def int2bigInt(t: Double, n: Double): BigInt = js.native
  def int2bigInt(t: Double, n: Double, m: Double): BigInt = js.native
  def inverseMod(x: BigInt, n: BigInt): BigInt = js.native
  def inverseModInt(x: Double, n: Double): BigInt = js.native
  def inverseMod_(x: BigInt, n: BigInt): Boolean = js.native
  def isZero(x: BigInt): Boolean = js.native
  def leftShift_(x: BigInt, n: Double): Unit = js.native
  def linCombShift_(x: BigInt, y: BigInt, b: Double, ys: Double): Unit = js.native
  def linComb_(x: BigInt, y: BigInt, a: Double, b: Double): Unit = js.native
  def millerRabin(x: BigInt, b: BigInt): Boolean = js.native
  def millerRabinInt(x: Double, b: Double): Boolean = js.native
  def mod(x: BigInt, n: BigInt): BigInt = js.native
  def modInt(x: BigInt, n: Double): Double = js.native
  def mod_(x: BigInt, n: BigInt): Unit = js.native
  def mont_(x: BigInt, y: BigInt, n: BigInt, np: Double): Unit = js.native
  def mult(x: BigInt, y: BigInt): BigInt = js.native
  def multInt_(x: BigInt, n: Double): Unit = js.native
  def multMod(x: BigInt, y: BigInt, n: BigInt): BigInt = js.native
  def multMod_(x: BigInt, y: BigInt, n: BigInt): Unit = js.native
  def mult_(x: BigInt, y: BigInt): Unit = js.native
  def negative(x: BigInt): Boolean = js.native
  def powMod(x: BigInt, y: BigInt, n: BigInt): BigInt = js.native
  def powMod_(x: BigInt, y: BigInt, n: BigInt): Unit = js.native
  def randBigInt(n: Double, s: Double): BigInt = js.native
  def randBigInt_(b: BigInt, n: Double, s: Double): Unit = js.native
  def randProbPrime(k: Double): BigInt = js.native
  def randTruePrime(k: Double): BigInt = js.native
  def randTruePrime_(ans: BigInt, k: Double): Unit = js.native
  def rightShift_(x: BigInt, n: Double): Unit = js.native
  def setRandom(random: IRandom): Unit = js.native
  def squareMod_(x: BigInt, n: BigInt): Unit = js.native
  def str2bigInt(s: String, b: String): BigInt = js.native
  def str2bigInt(s: String, b: String, n: Double): BigInt = js.native
  def str2bigInt(s: String, b: String, n: Double, m: Double): BigInt = js.native
  def str2bigInt(s: String, b: Double): BigInt = js.native
  def str2bigInt(s: String, b: Double, n: Double): BigInt = js.native
  def str2bigInt(s: String, b: Double, n: Double, m: Double): BigInt = js.native
  def sub(x: BigInt, y: BigInt): BigInt = js.native
  def subShift_(x: BigInt, y: BigInt, ys: Double): Unit = js.native
  def sub_(x: BigInt, y: BigInt): Unit = js.native
  def trim(x: BigInt, k: Double): BigInt = js.native
}

