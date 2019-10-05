package typings.cassandraDashDriver.cassandraDashDriverMod.types

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Integer extends js.Object {
  def abs(): Integer = js.native
  def add(other: Integer): Integer = js.native
  def and(other: Integer): Integer = js.native
  def compare(other: Integer): Double = js.native
  def divide(other: Integer): Integer = js.native
  def equals(other: Integer): Boolean = js.native
  def getBits(index: Double): Double = js.native
  def getBitsUnsigned(index: Double): Double = js.native
  def getSign(): Double = js.native
  def greaterThan(other: Integer): Boolean = js.native
  def greaterThanOrEqual(other: Integer): Boolean = js.native
  def inspect(): String = js.native
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

@JSImport("cassandra-driver", "types.Integer")
@js.native
object Integer extends TopLevel[IntegerStatic]

