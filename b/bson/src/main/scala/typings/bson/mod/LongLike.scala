package typings.bson.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Base class for Long and Timestamp.
  * In original js-node@1.0.x code 'Timestamp' is a 100% copy-paste of 'Long'
  * with 'Long' replaced by 'Timestamp' (changed to inheritance in js-node@2.0.0)
  */
@js.native
trait LongLike[T] extends js.Object {
  /** Returns the sum of `this` and the `other`. */
  def add(other: T): T = js.native
  /** Returns the bitwise-AND of `this` and the `other`. */
  def and(other: T): T = js.native
  /**
    * Compares `this` with the given `other`.
    * @returns 0 if they are the same, 1 if the this is greater, and -1 if the given one is greater.
    */
  def compare(other: T): scala.Double = js.native
  /** Returns `this` divided by the given `other`. */
  def div(other: T): T = js.native
  /** Return the high 32-bits value. */
  def getHighBits(): scala.Double = js.native
  /** Return the low 32-bits value. */
  def getLowBits(): scala.Double = js.native
  /** Return the low unsigned 32-bits value. */
  def getLowBitsUnsigned(): scala.Double = js.native
  /** Returns the number of bits needed to represent the absolute value of `this`. */
  def getNumBitsAbs(): scala.Double = js.native
  /** Return whether `this` is greater than the `other`. */
  def greaterThan(other: T): Boolean = js.native
  /** Return whether `this` is greater than or equal to the `other`. */
  def greaterThanOrEqual(other: T): Boolean = js.native
  /** Return whether `this` value is negative. */
  def isNegative(): Boolean = js.native
  /** Return whether `this` value is odd. */
  def isOdd(): Boolean = js.native
  /** Return whether `this` value is zero. */
  def isZero(): Boolean = js.native
  /** Return whether `this` is less than the `other`. */
  def lessThan(other: T): Boolean = js.native
  /** Return whether `this` is less than or equal to the `other`. */
  def lessThanOrEqual(other: T): Boolean = js.native
  /** Returns `this` modulo the given `other`. */
  def modulo(other: T): T = js.native
  /** Returns the product of `this` and the given `other`. */
  def multiply(other: T): T = js.native
  /** The negation of this value. */
  def negate(): T = js.native
  /** The bitwise-NOT of this value. */
  def not(): T = js.native
  /** Return whether `this` does not equal to the `other`. */
  def notEquals(other: T): Boolean = js.native
  /** Returns the bitwise-OR of `this` and the given `other`. */
  def or(other: T): T = js.native
  /**
    * Returns `this` with bits shifted to the left by the given amount.
    * @param numBits The number of bits by which to shift.
    */
  def shiftLeft(numBits: scala.Double): T = js.native
  /**
    * Returns `this` with bits shifted to the right by the given amount.
    * @param numBits The number of bits by which to shift.
    */
  def shiftRight(numBits: scala.Double): T = js.native
  /**
    * Returns `this` with bits shifted to the right by the given amount, with the new top bits matching the current sign bit.
    * @param numBits The number of bits by which to shift.
    */
  def shiftRightUnsigned(numBits: scala.Double): T = js.native
  /** Returns the difference of `this` and the given `other`. */
  def subtract(other: T): T = js.native
  /** Return the int value (low 32 bits). */
  def toInt(): scala.Double = js.native
  /** Return the JSON value. */
  def toJSON(): String = js.native
  /** Returns closest floating-point representation to `this` value */
  def toNumber(): scala.Double = js.native
  def toString(radix: scala.Double): String = js.native
  /** Returns the bitwise-XOR of `this` and the given `other`. */
  def xor(other: T): T = js.native
}

