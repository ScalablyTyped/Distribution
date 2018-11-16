package typings
package bigintLib.BigIntNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("BigInt")
@js.native
object BigIntNsMembers extends js.Object {
  def GCD(x: BigInt, y: BigInt): BigInt = js.native
  def `GCD_`(x: BigInt, y: BigInt): scala.Unit = js.native
  def add(x: BigInt, y: BigInt): BigInt = js.native
  def addInt(x: BigInt, n: scala.Double): BigInt = js.native
  def `addInt_`(x: BigInt, n: scala.Double): scala.Unit = js.native
  def `addShift_`(x: BigInt, y: BigInt, ys: scala.Double): scala.Unit = js.native
  def `add_`(x: BigInt, y: BigInt): scala.Unit = js.native
  def bigInt2str(x: BigInt, base: java.lang.String): java.lang.String = js.native
  def bigInt2str(x: BigInt, base: scala.Double): java.lang.String = js.native
  def bitSize(x: BigInt): scala.Double = js.native
  def `carry_`(x: BigInt): scala.Unit = js.native
  def `copyInt_`(x: BigInt, n: scala.Double): scala.Unit = js.native
  def `copy_`(x: BigInt, y: BigInt): scala.Unit = js.native
  def `divInt_`(x: BigInt, n: scala.Double): scala.Double = js.native
  def `divide_`(x: BigInt, y: BigInt, q: BigInt, r: BigInt): scala.Unit = js.native
  def dup(x: BigInt): BigInt = js.native
  def `eGCD_`(x: BigInt, y: BigInt, d: BigInt, a: BigInt, b: BigInt): scala.Unit = js.native
  def equals(x: BigInt, y: BigInt): scala.Boolean = js.native
  def equalsInt(x: BigInt, y: scala.Double): scala.Boolean = js.native
  def expand(value: BigInt, n: scala.Double): BigInt = js.native
  def findPrimes(n: scala.Double): js.Array[scala.Double] = js.native
  def greater(x: BigInt, y: BigInt): scala.Boolean = js.native
  def greaterShift(x: BigInt, y: BigInt, shift: scala.Double): scala.Boolean = js.native
  def `halve_`(x: BigInt): scala.Unit = js.native
  def int2bigInt(t: scala.Double): BigInt = js.native
  def int2bigInt(t: scala.Double, n: scala.Double): BigInt = js.native
  def int2bigInt(t: scala.Double, n: scala.Double, m: scala.Double): BigInt = js.native
  def inverseMod(x: BigInt, n: BigInt): BigInt = js.native
  def inverseModInt(x: scala.Double, n: scala.Double): BigInt = js.native
  def `inverseMod_`(x: BigInt, n: BigInt): scala.Boolean = js.native
  def isZero(x: BigInt): scala.Boolean = js.native
  def `leftShift_`(x: BigInt, n: scala.Double): scala.Unit = js.native
  def `linCombShift_`(x: BigInt, y: BigInt, b: scala.Double, ys: scala.Double): scala.Unit = js.native
  def `linComb_`(x: BigInt, y: BigInt, a: scala.Double, b: scala.Double): scala.Unit = js.native
  def millerRabin(x: BigInt, b: BigInt): scala.Boolean = js.native
  def millerRabinInt(x: scala.Double, b: scala.Double): scala.Boolean = js.native
  def mod(x: BigInt, n: BigInt): BigInt = js.native
  def modInt(x: BigInt, n: scala.Double): scala.Double = js.native
  def `mod_`(x: BigInt, n: BigInt): scala.Unit = js.native
  def `mont_`(x: BigInt, y: BigInt, n: BigInt, np: scala.Double): scala.Unit = js.native
  def mult(x: BigInt, y: BigInt): BigInt = js.native
  def `multInt_`(x: BigInt, n: scala.Double): scala.Unit = js.native
  def multMod(x: BigInt, y: BigInt, n: BigInt): BigInt = js.native
  def `multMod_`(x: BigInt, y: BigInt, n: BigInt): scala.Unit = js.native
  def `mult_`(x: BigInt, y: BigInt): scala.Unit = js.native
  def negative(x: BigInt): scala.Boolean = js.native
  def powMod(x: BigInt, y: BigInt, n: BigInt): BigInt = js.native
  def `powMod_`(x: BigInt, y: BigInt, n: BigInt): scala.Unit = js.native
  def randBigInt(n: scala.Double, s: scala.Double): BigInt = js.native
  def `randBigInt_`(b: BigInt, n: scala.Double, s: scala.Double): scala.Unit = js.native
  def randProbPrime(k: scala.Double): BigInt = js.native
  def randTruePrime(k: scala.Double): BigInt = js.native
  def `randTruePrime_`(ans: BigInt, k: scala.Double): scala.Unit = js.native
  def `rightShift_`(x: BigInt, n: scala.Double): scala.Unit = js.native
  def setRandom(random: IRandom): scala.Unit = js.native
  def `squareMod_`(x: BigInt, n: BigInt): scala.Unit = js.native
  def str2bigInt(s: java.lang.String, b: java.lang.String): BigInt = js.native
  def str2bigInt(s: java.lang.String, b: java.lang.String, n: scala.Double): BigInt = js.native
  def str2bigInt(s: java.lang.String, b: java.lang.String, n: scala.Double, m: scala.Double): BigInt = js.native
  def str2bigInt(s: java.lang.String, b: scala.Double): BigInt = js.native
  def str2bigInt(s: java.lang.String, b: scala.Double, n: scala.Double): BigInt = js.native
  def str2bigInt(s: java.lang.String, b: scala.Double, n: scala.Double, m: scala.Double): BigInt = js.native
  def sub(x: BigInt, y: BigInt): BigInt = js.native
  def `subShift_`(x: BigInt, y: BigInt, ys: scala.Double): scala.Unit = js.native
  def `sub_`(x: BigInt, y: BigInt): scala.Unit = js.native
  def trim(x: BigInt, k: scala.Double): BigInt = js.native
}

