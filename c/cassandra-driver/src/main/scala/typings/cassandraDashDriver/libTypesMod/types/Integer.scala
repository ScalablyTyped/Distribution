package typings.cassandraDashDriver.libTypesMod.types

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cassandra-driver/lib/types", "types.Integer")
@js.native
class Integer protected () extends js.Object {
  def this(bits: js.Array[Double], sign: Double) = this()
  def abs(): Integer = js.native
  def add(other: Integer): Integer = js.native
  def compare(other: Integer): Double = js.native
  def divide(other: Integer): Integer = js.native
  def equals(other: Integer): Boolean = js.native
  def getBits(index: Double): Double = js.native
  def getBitsUnsigned(index: Double): Double = js.native
  def getSign(): Double = js.native
  def greaterThan(other: Integer): Boolean = js.native
  def greaterThanOrEqual(other: Integer): Boolean = js.native
  def isNegative(): Boolean = js.native
  def isOdd(): Boolean = js.native
  def isZero(): Boolean = js.native
  def lessThan(other: Integer): Boolean = js.native
  def lessThanOrEqual(other: Integer): Boolean = js.native
  def modulo(other: Integer): Integer = js.native
  def multiply(other: Integer): Integer = js.native
  def negate(): Integer = js.native
  def not(): Integer = js.native
  def notEquals(other: Integer): Boolean = js.native
  def or(other: Integer): Integer = js.native
  def shiftLeft(numBits: Double): Integer = js.native
  def shiftRight(numBits: Double): Integer = js.native
  def shorten(numBits: Double): Integer = js.native
  def subtract(other: Integer): Integer = js.native
  def toInt(): Double = js.native
  def toJSON(): String = js.native
  def toNumber(): Double = js.native
  def toString(opt_radix: Double): String = js.native
  def xor(other: Integer): Integer = js.native
}

/* static members */
@JSImport("cassandra-driver/lib/types", "types.Integer")
@js.native
object Integer extends js.Object {
  var ONE: Integer = js.native
  var ZERO: Integer = js.native
  def fromBits(bits: js.Array[Double]): Integer = js.native
  def fromBuffer(bits: Buffer): Integer = js.native
  def fromInt(value: Double): Integer = js.native
  def fromNumber(value: Double): Integer = js.native
  def fromString(str: String): Integer = js.native
  def fromString(str: String, opt_radix: Double): Integer = js.native
  def toBuffer(value: Integer): Buffer = js.native
}

