package typings.bson.bsonMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("bson", "Timestamp")
@js.native
class Timestamp () extends LongLike[Timestamp]

/* static members */
@JSImport("bson", "Timestamp")
@js.native
object Timestamp extends js.Object {
  val MAX_VALUE: Timestamp = js.native
  val MIN_VALUE: Timestamp = js.native
  val NEG_ONE: Timestamp = js.native
  val ONE: Timestamp = js.native
  val ZERO: Timestamp = js.native
  /**
    * Returns a Timestamp for the given high and low bits. Each is assumed to use 32 bits.
    * @param lowBits The low 32-bits.
    * @param highBits The high 32-bits.
    */
  def fromBits(lowBits: scala.Double, highBits: scala.Double): Timestamp = js.native
  /** Returns a Timestamp represented by the given (32-bit) integer value */
  def fromInt(value: scala.Double): Timestamp = js.native
  /** Returns a Timestamp representing the given number value, provided that it is a finite number. */
  def fromNumber(value: scala.Double): Timestamp = js.native
  /**
    * Returns a Timestamp from the given string.
    * @param opt_radix The radix in which the text is written. {default:10}
    */
  def fromString(str: String): Timestamp = js.native
  def fromString(str: String, opt_radix: scala.Double): Timestamp = js.native
}

