package typings.bigi.bigiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait bigi extends js.Object {
  def abs(): js.Any = js.native
  def add(a: typings.bigi.bigiMod.bigi): typings.bigi.bigiMod.bigi = js.native
  def addTo(a: typings.bigi.bigiMod.bigi, r: Double): Unit = js.native
  def am(i: js.Any, x: js.Any, w: js.Any, j: js.Any, c: js.Any, n: js.Any): js.Any = js.native
  def and(a: typings.bigi.bigiMod.bigi): typings.bigi.bigiMod.bigi = js.native
  def andNot(a: js.Any): js.Any = js.native
  def bitCount(): js.Any = js.native
  def bitLength(): js.Any = js.native
  def bitwiseTo(a: js.Any, op: js.Any, r: js.Any): Unit = js.native
  def byteLength(): js.Any = js.native
  def byteValue(): js.Any = js.native
  def changeBit(n: js.Any, op: js.Any): js.Any = js.native
  def chunkSize(r: js.Any): js.Any = js.native
  def clamp(): Unit = js.native
  def clearBit(n: Double): typings.bigi.bigiMod.bigi = js.native
  def compareTo(a: typings.bigi.bigiMod.bigi): Double = js.native
  def copyTo(r: js.Any): Unit = js.native
  def dAddOffset(n: js.Any, w: js.Any): Unit = js.native
  def dMultiply(n: Double): Unit = js.native
  def divRemTo(m: js.Any, q: js.Any, r: js.Any): Unit = js.native
  def divide(a: js.Any): js.Any = js.native
  def divideAndRemainder(a: typings.bigi.bigiMod.bigi): typings.bigi.bigiMod.bigi = js.native
  def dlShiftTo(n: typings.bigi.bigiMod.bigi, r: Double): Unit = js.native
  def drShiftTo(n: typings.bigi.bigiMod.bigi, r: Double): Unit = js.native
  def equals(a: typings.bigi.bigiMod.bigi): Boolean = js.native
  def exp(e: js.Any, z: js.Any): js.Any = js.native
  def flipBit(n: Double): typings.bigi.bigiMod.bigi = js.native
  def fromInt(x: js.Any): Unit = js.native
  def fromNumber(a: js.Any, b: js.Any, c: js.Any): Unit = js.native
  def fromRadix(s: js.Any, b: js.Any): Unit = js.native
  def fromString(s: js.Any, b: js.Any): Unit = js.native
  def gcd(a: js.Any): js.Any = js.native
  def getLowestSetBit(): js.Any = js.native
  def intValue(): Double = js.native
  def invDigit(): js.Any = js.native
  def isEven(): Boolean = js.native
  def isProbablePrime(t: js.Any): Boolean = js.native
  def lShiftTo(n: js.Any, r: js.Any): Unit = js.native
  def max(a: js.Any): js.Any = js.native
  def millerRabin(t: typings.bigi.bigiMod.bigi): typings.bigi.bigiMod.bigi = js.native
  def min(a: typings.bigi.bigiMod.bigi): typings.bigi.bigiMod.bigi = js.native
  def mod(a: typings.bigi.bigiMod.bigi): typings.bigi.bigiMod.bigi = js.native
  def modInt(n: Double): typings.bigi.bigiMod.bigi = js.native
  def modInverse(m: Double): typings.bigi.bigiMod.bigi = js.native
  def modPow(e: js.Any, m: js.Any): js.Any = js.native
  def modPowInt(e: js.Any, m: js.Any): js.Any = js.native
  def multiply(a: typings.bigi.bigiMod.bigi): typings.bigi.bigiMod.bigi = js.native
  def multiplyLowerTo(a: typings.bigi.bigiMod.bigi, n: js.Any, r: js.Any): Unit = js.native
  def multiplyTo(a: typings.bigi.bigiMod.bigi, r: js.Any): Unit = js.native
  def multiplyUpperTo(a: typings.bigi.bigiMod.bigi, n: js.Any, r: js.Any): Unit = js.native
  def negate(): typings.bigi.bigiMod.bigi = js.native
  def not(): typings.bigi.bigiMod.bigi = js.native
  def or(a: typings.bigi.bigiMod.bigi): typings.bigi.bigiMod.bigi = js.native
  def pow(e: typings.bigi.bigiMod.bigi): typings.bigi.bigiMod.bigi = js.native
  def rShiftTo(n: typings.bigi.bigiMod.bigi, r: js.Any): Unit = js.native
  def remainder(a: typings.bigi.bigiMod.bigi): typings.bigi.bigiMod.bigi = js.native
  def setBit(n: Double): typings.bigi.bigiMod.bigi = js.native
  def shiftLeft(n: Double): typings.bigi.bigiMod.bigi = js.native
  def shiftRight(n: Double): typings.bigi.bigiMod.bigi = js.native
  def shortValue(): typings.bigi.bigiMod.bigi = js.native
  def signum(): typings.bigi.bigiMod.bigi = js.native
  def square(): typings.bigi.bigiMod.bigi = js.native
  def squareTo(r: js.Any): Unit = js.native
  def subTo(a: js.Any, r: js.Any): Unit = js.native
  def subtract(a: typings.bigi.bigiMod.bigi): typings.bigi.bigiMod.bigi = js.native
  def testBit(n: js.Any): js.Any = js.native
  def toBuffer(size: Double): js.Any = js.native
  def toByteArray(): js.Any = js.native
  def toByteArrayUnsigned(): js.Any = js.native
  def toDERInteger(): js.Any = js.native
  def toHex(): String = js.native
  def toHex(size: Double): String = js.native
  def toRadix(b: Double): String = js.native
  def toString(b: js.Any): String = js.native
  def xor(a: js.Any): js.Any = js.native
}

