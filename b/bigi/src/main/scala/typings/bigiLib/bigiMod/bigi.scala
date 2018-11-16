package typings
package bigiLib.bigiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait bigi extends js.Object {
  def abs(): js.Any = js.native
  def add(a: bigi): bigi = js.native
  def addTo(a: bigi, r: scala.Double): scala.Unit = js.native
  def am(i: js.Any, x: js.Any, w: js.Any, j: js.Any, c: js.Any, n: js.Any): js.Any = js.native
  def and(a: bigi): bigi = js.native
  def andNot(a: js.Any): js.Any = js.native
  def bitCount(): js.Any = js.native
  def bitLength(): js.Any = js.native
  def bitwiseTo(a: js.Any, op: js.Any, r: js.Any): scala.Unit = js.native
  def byteLength(): js.Any = js.native
  def byteValue(): js.Any = js.native
  def changeBit(n: js.Any, op: js.Any): js.Any = js.native
  def chunkSize(r: js.Any): js.Any = js.native
  def clamp(): scala.Unit = js.native
  def clearBit(n: scala.Double): bigi = js.native
  def compareTo(a: bigi): scala.Double = js.native
  def copyTo(r: js.Any): scala.Unit = js.native
  def dAddOffset(n: js.Any, w: js.Any): scala.Unit = js.native
  def dMultiply(n: scala.Double): scala.Unit = js.native
  def divRemTo(m: js.Any, q: js.Any, r: js.Any): scala.Unit = js.native
  def divide(a: js.Any): js.Any = js.native
  def divideAndRemainder(a: bigi): bigi = js.native
  def dlShiftTo(n: bigi, r: scala.Double): scala.Unit = js.native
  def drShiftTo(n: bigi, r: scala.Double): scala.Unit = js.native
  def equals(a: bigi): scala.Boolean = js.native
  def exp(e: js.Any, z: js.Any): js.Any = js.native
  def flipBit(n: scala.Double): bigi = js.native
  def fromInt(x: js.Any): scala.Unit = js.native
  def fromNumber(a: js.Any, b: js.Any, c: js.Any): scala.Unit = js.native
  def fromRadix(s: js.Any, b: js.Any): scala.Unit = js.native
  def fromString(s: js.Any, b: js.Any): scala.Unit = js.native
  def gcd(a: js.Any): js.Any = js.native
  def getLowestSetBit(): js.Any = js.native
  def intValue(): scala.Double = js.native
  def invDigit(): js.Any = js.native
  def isEven(): scala.Boolean = js.native
  def isProbablePrime(t: js.Any): scala.Boolean = js.native
  def lShiftTo(n: js.Any, r: js.Any): scala.Unit = js.native
  def max(a: js.Any): js.Any = js.native
  def millerRabin(t: bigi): bigi = js.native
  def min(a: bigi): bigi = js.native
  def mod(a: bigi): bigi = js.native
  def modInt(n: scala.Double): bigi = js.native
  def modInverse(m: scala.Double): bigi = js.native
  def modPow(e: js.Any, m: js.Any): js.Any = js.native
  def modPowInt(e: js.Any, m: js.Any): js.Any = js.native
  def multiply(a: bigi): bigi = js.native
  def multiplyLowerTo(a: bigi, n: js.Any, r: js.Any): scala.Unit = js.native
  def multiplyTo(a: bigi, r: js.Any): scala.Unit = js.native
  def multiplyUpperTo(a: bigi, n: js.Any, r: js.Any): scala.Unit = js.native
  def negate(): bigi = js.native
  def not(): bigi = js.native
  def or(a: bigi): bigi = js.native
  def pow(e: bigi): bigi = js.native
  def rShiftTo(n: bigi, r: js.Any): scala.Unit = js.native
  def remainder(a: bigi): bigi = js.native
  def setBit(n: scala.Double): bigi = js.native
  def shiftLeft(n: scala.Double): bigi = js.native
  def shiftRight(n: scala.Double): bigi = js.native
  def shortValue(): bigi = js.native
  def signum(): bigi = js.native
  def square(): bigi = js.native
  def squareTo(r: js.Any): scala.Unit = js.native
  def subTo(a: js.Any, r: js.Any): scala.Unit = js.native
  def subtract(a: bigi): bigi = js.native
  def testBit(n: js.Any): js.Any = js.native
  def toBuffer(size: scala.Double): js.Any = js.native
  def toByteArray(): js.Any = js.native
  def toByteArrayUnsigned(): js.Any = js.native
  def toDERInteger(): js.Any = js.native
  def toHex(): java.lang.String = js.native
  def toHex(size: scala.Double): java.lang.String = js.native
  def toRadix(b: scala.Double): java.lang.String = js.native
  def toString(b: js.Any): java.lang.String = js.native
  def xor(a: js.Any): js.Any = js.native
}

