package typings.bigint

import typings.bigint.BigInt.IRandom
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("BigInt")
@js.native
object BigInt extends js.Object {
  def GCD(x: typings.bigint.BigInt.BigInt, y: typings.bigint.BigInt.BigInt): typings.bigint.BigInt.BigInt = js.native
  def GCD_(x: typings.bigint.BigInt.BigInt, y: typings.bigint.BigInt.BigInt): Unit = js.native
  def add(x: typings.bigint.BigInt.BigInt, y: typings.bigint.BigInt.BigInt): typings.bigint.BigInt.BigInt = js.native
  def addInt(x: typings.bigint.BigInt.BigInt, n: Double): typings.bigint.BigInt.BigInt = js.native
  def addInt_(x: typings.bigint.BigInt.BigInt, n: Double): Unit = js.native
  def addShift_(x: typings.bigint.BigInt.BigInt, y: typings.bigint.BigInt.BigInt, ys: Double): Unit = js.native
  def add_(x: typings.bigint.BigInt.BigInt, y: typings.bigint.BigInt.BigInt): Unit = js.native
  def bigInt2str(x: typings.bigint.BigInt.BigInt, base: String): String = js.native
  def bigInt2str(x: typings.bigint.BigInt.BigInt, base: Double): String = js.native
  def bitSize(x: typings.bigint.BigInt.BigInt): Double = js.native
  def carry_(x: typings.bigint.BigInt.BigInt): Unit = js.native
  def copyInt_(x: typings.bigint.BigInt.BigInt, n: Double): Unit = js.native
  def copy_(x: typings.bigint.BigInt.BigInt, y: typings.bigint.BigInt.BigInt): Unit = js.native
  def divInt_(x: typings.bigint.BigInt.BigInt, n: Double): Double = js.native
  def divide_(
    x: typings.bigint.BigInt.BigInt,
    y: typings.bigint.BigInt.BigInt,
    q: typings.bigint.BigInt.BigInt,
    r: typings.bigint.BigInt.BigInt
  ): Unit = js.native
  def dup(x: typings.bigint.BigInt.BigInt): typings.bigint.BigInt.BigInt = js.native
  def eGCD_(
    x: typings.bigint.BigInt.BigInt,
    y: typings.bigint.BigInt.BigInt,
    d: typings.bigint.BigInt.BigInt,
    a: typings.bigint.BigInt.BigInt,
    b: typings.bigint.BigInt.BigInt
  ): Unit = js.native
  def equals(x: typings.bigint.BigInt.BigInt, y: typings.bigint.BigInt.BigInt): Boolean = js.native
  def equalsInt(x: typings.bigint.BigInt.BigInt, y: Double): Boolean = js.native
  def expand(value: typings.bigint.BigInt.BigInt, n: Double): typings.bigint.BigInt.BigInt = js.native
  def findPrimes(n: Double): js.Array[Double] = js.native
  def greater(x: typings.bigint.BigInt.BigInt, y: typings.bigint.BigInt.BigInt): Boolean = js.native
  def greaterShift(x: typings.bigint.BigInt.BigInt, y: typings.bigint.BigInt.BigInt, shift: Double): Boolean = js.native
  def halve_(x: typings.bigint.BigInt.BigInt): Unit = js.native
  def int2bigInt(t: Double): typings.bigint.BigInt.BigInt = js.native
  def int2bigInt(t: Double, n: Double): typings.bigint.BigInt.BigInt = js.native
  def int2bigInt(t: Double, n: Double, m: Double): typings.bigint.BigInt.BigInt = js.native
  def inverseMod(x: typings.bigint.BigInt.BigInt, n: typings.bigint.BigInt.BigInt): typings.bigint.BigInt.BigInt = js.native
  def inverseModInt(x: Double, n: Double): typings.bigint.BigInt.BigInt = js.native
  def inverseMod_(x: typings.bigint.BigInt.BigInt, n: typings.bigint.BigInt.BigInt): Boolean = js.native
  def isZero(x: typings.bigint.BigInt.BigInt): Boolean = js.native
  def leftShift_(x: typings.bigint.BigInt.BigInt, n: Double): Unit = js.native
  def linCombShift_(x: typings.bigint.BigInt.BigInt, y: typings.bigint.BigInt.BigInt, b: Double, ys: Double): Unit = js.native
  def linComb_(x: typings.bigint.BigInt.BigInt, y: typings.bigint.BigInt.BigInt, a: Double, b: Double): Unit = js.native
  def millerRabin(x: typings.bigint.BigInt.BigInt, b: typings.bigint.BigInt.BigInt): Boolean = js.native
  def millerRabinInt(x: Double, b: Double): Boolean = js.native
  def mod(x: typings.bigint.BigInt.BigInt, n: typings.bigint.BigInt.BigInt): typings.bigint.BigInt.BigInt = js.native
  def modInt(x: typings.bigint.BigInt.BigInt, n: Double): Double = js.native
  def mod_(x: typings.bigint.BigInt.BigInt, n: typings.bigint.BigInt.BigInt): Unit = js.native
  def mont_(
    x: typings.bigint.BigInt.BigInt,
    y: typings.bigint.BigInt.BigInt,
    n: typings.bigint.BigInt.BigInt,
    np: Double
  ): Unit = js.native
  def mult(x: typings.bigint.BigInt.BigInt, y: typings.bigint.BigInt.BigInt): typings.bigint.BigInt.BigInt = js.native
  def multInt_(x: typings.bigint.BigInt.BigInt, n: Double): Unit = js.native
  def multMod(x: typings.bigint.BigInt.BigInt, y: typings.bigint.BigInt.BigInt, n: typings.bigint.BigInt.BigInt): typings.bigint.BigInt.BigInt = js.native
  def multMod_(x: typings.bigint.BigInt.BigInt, y: typings.bigint.BigInt.BigInt, n: typings.bigint.BigInt.BigInt): Unit = js.native
  def mult_(x: typings.bigint.BigInt.BigInt, y: typings.bigint.BigInt.BigInt): Unit = js.native
  def negative(x: typings.bigint.BigInt.BigInt): Boolean = js.native
  def powMod(x: typings.bigint.BigInt.BigInt, y: typings.bigint.BigInt.BigInt, n: typings.bigint.BigInt.BigInt): typings.bigint.BigInt.BigInt = js.native
  def powMod_(x: typings.bigint.BigInt.BigInt, y: typings.bigint.BigInt.BigInt, n: typings.bigint.BigInt.BigInt): Unit = js.native
  def randBigInt(n: Double, s: Double): typings.bigint.BigInt.BigInt = js.native
  def randBigInt_(b: typings.bigint.BigInt.BigInt, n: Double, s: Double): Unit = js.native
  def randProbPrime(k: Double): typings.bigint.BigInt.BigInt = js.native
  def randTruePrime(k: Double): typings.bigint.BigInt.BigInt = js.native
  def randTruePrime_(ans: typings.bigint.BigInt.BigInt, k: Double): Unit = js.native
  def rightShift_(x: typings.bigint.BigInt.BigInt, n: Double): Unit = js.native
  def setRandom(random: IRandom): Unit = js.native
  def squareMod_(x: typings.bigint.BigInt.BigInt, n: typings.bigint.BigInt.BigInt): Unit = js.native
  def str2bigInt(s: String, b: String): typings.bigint.BigInt.BigInt = js.native
  def str2bigInt(s: String, b: String, n: Double): typings.bigint.BigInt.BigInt = js.native
  def str2bigInt(s: String, b: String, n: Double, m: Double): typings.bigint.BigInt.BigInt = js.native
  def str2bigInt(s: String, b: Double): typings.bigint.BigInt.BigInt = js.native
  def str2bigInt(s: String, b: Double, n: Double): typings.bigint.BigInt.BigInt = js.native
  def str2bigInt(s: String, b: Double, n: Double, m: Double): typings.bigint.BigInt.BigInt = js.native
  def sub(x: typings.bigint.BigInt.BigInt, y: typings.bigint.BigInt.BigInt): typings.bigint.BigInt.BigInt = js.native
  def subShift_(x: typings.bigint.BigInt.BigInt, y: typings.bigint.BigInt.BigInt, ys: Double): Unit = js.native
  def sub_(x: typings.bigint.BigInt.BigInt, y: typings.bigint.BigInt.BigInt): Unit = js.native
  def trim(x: typings.bigint.BigInt.BigInt, k: Double): typings.bigint.BigInt.BigInt = js.native
  type BigInt = js.Array[Double]
  type IRandom = js.Function0[Double]
}

