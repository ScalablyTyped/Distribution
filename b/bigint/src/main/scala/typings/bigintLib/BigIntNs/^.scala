package typings
package bigintLib.BigIntNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("BigInt")
@js.native
object ^ extends js.Object {
  def GCD(x: bigintLib.BigIntNs.BigInt, y: bigintLib.BigIntNs.BigInt): bigintLib.BigIntNs.BigInt = js.native
  def `GCD_`(x: bigintLib.BigIntNs.BigInt, y: bigintLib.BigIntNs.BigInt): scala.Unit = js.native
  def add(x: bigintLib.BigIntNs.BigInt, y: bigintLib.BigIntNs.BigInt): bigintLib.BigIntNs.BigInt = js.native
  def addInt(x: bigintLib.BigIntNs.BigInt, n: scala.Double): bigintLib.BigIntNs.BigInt = js.native
  def `addInt_`(x: bigintLib.BigIntNs.BigInt, n: scala.Double): scala.Unit = js.native
  def `addShift_`(x: bigintLib.BigIntNs.BigInt, y: bigintLib.BigIntNs.BigInt, ys: scala.Double): scala.Unit = js.native
  def `add_`(x: bigintLib.BigIntNs.BigInt, y: bigintLib.BigIntNs.BigInt): scala.Unit = js.native
  def bigInt2str(x: bigintLib.BigIntNs.BigInt, base: java.lang.String): java.lang.String = js.native
  def bigInt2str(x: bigintLib.BigIntNs.BigInt, base: scala.Double): java.lang.String = js.native
  def bitSize(x: bigintLib.BigIntNs.BigInt): scala.Double = js.native
  def `carry_`(x: bigintLib.BigIntNs.BigInt): scala.Unit = js.native
  def `copyInt_`(x: bigintLib.BigIntNs.BigInt, n: scala.Double): scala.Unit = js.native
  def `copy_`(x: bigintLib.BigIntNs.BigInt, y: bigintLib.BigIntNs.BigInt): scala.Unit = js.native
  def `divInt_`(x: bigintLib.BigIntNs.BigInt, n: scala.Double): scala.Double = js.native
  def `divide_`(
    x: bigintLib.BigIntNs.BigInt,
    y: bigintLib.BigIntNs.BigInt,
    q: bigintLib.BigIntNs.BigInt,
    r: bigintLib.BigIntNs.BigInt
  ): scala.Unit = js.native
  def dup(x: bigintLib.BigIntNs.BigInt): bigintLib.BigIntNs.BigInt = js.native
  def `eGCD_`(
    x: bigintLib.BigIntNs.BigInt,
    y: bigintLib.BigIntNs.BigInt,
    d: bigintLib.BigIntNs.BigInt,
    a: bigintLib.BigIntNs.BigInt,
    b: bigintLib.BigIntNs.BigInt
  ): scala.Unit = js.native
  def equals(x: bigintLib.BigIntNs.BigInt, y: bigintLib.BigIntNs.BigInt): scala.Boolean = js.native
  def equalsInt(x: bigintLib.BigIntNs.BigInt, y: scala.Double): scala.Boolean = js.native
  def expand(value: bigintLib.BigIntNs.BigInt, n: scala.Double): bigintLib.BigIntNs.BigInt = js.native
  def findPrimes(n: scala.Double): js.Array[scala.Double] = js.native
  def greater(x: bigintLib.BigIntNs.BigInt, y: bigintLib.BigIntNs.BigInt): scala.Boolean = js.native
  def greaterShift(x: bigintLib.BigIntNs.BigInt, y: bigintLib.BigIntNs.BigInt, shift: scala.Double): scala.Boolean = js.native
  def `halve_`(x: bigintLib.BigIntNs.BigInt): scala.Unit = js.native
  def int2bigInt(t: scala.Double): bigintLib.BigIntNs.BigInt = js.native
  def int2bigInt(t: scala.Double, n: scala.Double): bigintLib.BigIntNs.BigInt = js.native
  def int2bigInt(t: scala.Double, n: scala.Double, m: scala.Double): bigintLib.BigIntNs.BigInt = js.native
  def inverseMod(x: bigintLib.BigIntNs.BigInt, n: bigintLib.BigIntNs.BigInt): bigintLib.BigIntNs.BigInt = js.native
  def inverseModInt(x: scala.Double, n: scala.Double): bigintLib.BigIntNs.BigInt = js.native
  def `inverseMod_`(x: bigintLib.BigIntNs.BigInt, n: bigintLib.BigIntNs.BigInt): scala.Boolean = js.native
  def isZero(x: bigintLib.BigIntNs.BigInt): scala.Boolean = js.native
  def `leftShift_`(x: bigintLib.BigIntNs.BigInt, n: scala.Double): scala.Unit = js.native
  def `linCombShift_`(x: bigintLib.BigIntNs.BigInt, y: bigintLib.BigIntNs.BigInt, b: scala.Double, ys: scala.Double): scala.Unit = js.native
  def `linComb_`(x: bigintLib.BigIntNs.BigInt, y: bigintLib.BigIntNs.BigInt, a: scala.Double, b: scala.Double): scala.Unit = js.native
  def millerRabin(x: bigintLib.BigIntNs.BigInt, b: bigintLib.BigIntNs.BigInt): scala.Boolean = js.native
  def millerRabinInt(x: scala.Double, b: scala.Double): scala.Boolean = js.native
  def mod(x: bigintLib.BigIntNs.BigInt, n: bigintLib.BigIntNs.BigInt): bigintLib.BigIntNs.BigInt = js.native
  def modInt(x: bigintLib.BigIntNs.BigInt, n: scala.Double): scala.Double = js.native
  def `mod_`(x: bigintLib.BigIntNs.BigInt, n: bigintLib.BigIntNs.BigInt): scala.Unit = js.native
  def `mont_`(
    x: bigintLib.BigIntNs.BigInt,
    y: bigintLib.BigIntNs.BigInt,
    n: bigintLib.BigIntNs.BigInt,
    np: scala.Double
  ): scala.Unit = js.native
  def mult(x: bigintLib.BigIntNs.BigInt, y: bigintLib.BigIntNs.BigInt): bigintLib.BigIntNs.BigInt = js.native
  def `multInt_`(x: bigintLib.BigIntNs.BigInt, n: scala.Double): scala.Unit = js.native
  def multMod(x: bigintLib.BigIntNs.BigInt, y: bigintLib.BigIntNs.BigInt, n: bigintLib.BigIntNs.BigInt): bigintLib.BigIntNs.BigInt = js.native
  def `multMod_`(x: bigintLib.BigIntNs.BigInt, y: bigintLib.BigIntNs.BigInt, n: bigintLib.BigIntNs.BigInt): scala.Unit = js.native
  def `mult_`(x: bigintLib.BigIntNs.BigInt, y: bigintLib.BigIntNs.BigInt): scala.Unit = js.native
  def negative(x: bigintLib.BigIntNs.BigInt): scala.Boolean = js.native
  def powMod(x: bigintLib.BigIntNs.BigInt, y: bigintLib.BigIntNs.BigInt, n: bigintLib.BigIntNs.BigInt): bigintLib.BigIntNs.BigInt = js.native
  def `powMod_`(x: bigintLib.BigIntNs.BigInt, y: bigintLib.BigIntNs.BigInt, n: bigintLib.BigIntNs.BigInt): scala.Unit = js.native
  def randBigInt(n: scala.Double, s: scala.Double): bigintLib.BigIntNs.BigInt = js.native
  def `randBigInt_`(b: bigintLib.BigIntNs.BigInt, n: scala.Double, s: scala.Double): scala.Unit = js.native
  def randProbPrime(k: scala.Double): bigintLib.BigIntNs.BigInt = js.native
  def randTruePrime(k: scala.Double): bigintLib.BigIntNs.BigInt = js.native
  def `randTruePrime_`(ans: bigintLib.BigIntNs.BigInt, k: scala.Double): scala.Unit = js.native
  def `rightShift_`(x: bigintLib.BigIntNs.BigInt, n: scala.Double): scala.Unit = js.native
  def setRandom(random: bigintLib.BigIntNs.IRandom): scala.Unit = js.native
  def `squareMod_`(x: bigintLib.BigIntNs.BigInt, n: bigintLib.BigIntNs.BigInt): scala.Unit = js.native
  def str2bigInt(s: java.lang.String, b: java.lang.String): bigintLib.BigIntNs.BigInt = js.native
  def str2bigInt(s: java.lang.String, b: java.lang.String, n: scala.Double): bigintLib.BigIntNs.BigInt = js.native
  def str2bigInt(s: java.lang.String, b: java.lang.String, n: scala.Double, m: scala.Double): bigintLib.BigIntNs.BigInt = js.native
  def str2bigInt(s: java.lang.String, b: scala.Double): bigintLib.BigIntNs.BigInt = js.native
  def str2bigInt(s: java.lang.String, b: scala.Double, n: scala.Double): bigintLib.BigIntNs.BigInt = js.native
  def str2bigInt(s: java.lang.String, b: scala.Double, n: scala.Double, m: scala.Double): bigintLib.BigIntNs.BigInt = js.native
  def sub(x: bigintLib.BigIntNs.BigInt, y: bigintLib.BigIntNs.BigInt): bigintLib.BigIntNs.BigInt = js.native
  def `subShift_`(x: bigintLib.BigIntNs.BigInt, y: bigintLib.BigIntNs.BigInt, ys: scala.Double): scala.Unit = js.native
  def `sub_`(x: bigintLib.BigIntNs.BigInt, y: bigintLib.BigIntNs.BigInt): scala.Unit = js.native
  def trim(x: bigintLib.BigIntNs.BigInt, k: scala.Double): bigintLib.BigIntNs.BigInt = js.native
}

