package typings.cassandraDashDriver.cassandraDashDriverMod.types

import org.scalablytyped.runtime.Instantiable1
import typings.long.Anon_High
import typings.long.longMod.^
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cassandra-driver", "types.Long")
@js.native
class Long protected () extends ^ {
  /**
    * Constructs a 64 bit two's-complement integer, given its low and high 32 bit values as signed integers. See the from* functions below for more convenient ways of constructing Longs.
    */
  def this(low: Double) = this()
}

@JSImport("cassandra-driver", "types.Long")
@js.native
object Long extends Instantiable1[/* low */ Double, ^] {
  /**
    * Maximum unsigned value.
    */
  var MAX_UNSIGNED_VALUE: typings.long.longMod.Long = js.native
  /**
    * Maximum signed value.
    */
  var MAX_VALUE: typings.long.longMod.Long = js.native
  /**
    * Minimum signed value.
    */
  var MIN_VALUE: typings.long.longMod.Long = js.native
  /**
    * Signed negative one.
    */
  var NEG_ONE: typings.long.longMod.Long = js.native
  /**
    * Signed one.
    */
  var ONE: typings.long.longMod.Long = js.native
  /**
    * Unsigned one.
    */
  var UONE: typings.long.longMod.Long = js.native
  /**
    * Unsigned zero.
    */
  var UZERO: typings.long.longMod.Long = js.native
  /**
    * Signed zero
    */
  var ZERO: typings.long.longMod.Long = js.native
  /**
    * Returns a Long representing the 64 bit integer that comes by concatenating the given low and high bits. Each is assumed to use 32 bits.
    */
  def fromBits(lowBits: Double, highBits: Double): typings.long.longMod.Long = js.native
  def fromBits(lowBits: Double, highBits: Double, unsigned: Boolean): typings.long.longMod.Long = js.native
  /**
    * Creates a Long from its byte representation.
    */
  def fromBytes(bytes: js.Array[Double]): typings.long.longMod.Long = js.native
  def fromBytes(bytes: js.Array[Double], unsigned: Boolean): typings.long.longMod.Long = js.native
  def fromBytes(bytes: js.Array[Double], unsigned: Boolean, le: Boolean): typings.long.longMod.Long = js.native
  /**
    * Creates a Long from its little endian byte representation.
    */
  def fromBytesBE(bytes: js.Array[Double]): typings.long.longMod.Long = js.native
  def fromBytesBE(bytes: js.Array[Double], unsigned: Boolean): typings.long.longMod.Long = js.native
  /**
    * Creates a Long from its little endian byte representation.
    */
  def fromBytesLE(bytes: js.Array[Double]): typings.long.longMod.Long = js.native
  def fromBytesLE(bytes: js.Array[Double], unsigned: Boolean): typings.long.longMod.Long = js.native
  /**
    * Returns a Long representing the given 32 bit integer value.
    */
  def fromInt(value: Double): typings.long.longMod.Long = js.native
  def fromInt(value: Double, unsigned: Boolean): typings.long.longMod.Long = js.native
  /**
    * Returns a Long representing the given value, provided that it is a finite number. Otherwise, zero is returned.
    */
  def fromNumber(value: Double): typings.long.longMod.Long = js.native
  def fromNumber(value: Double, unsigned: Boolean): typings.long.longMod.Long = js.native
  /**
    * Returns a Long representation of the given string, written using the specified radix.
    */
  def fromString(str: String): typings.long.longMod.Long = js.native
  def fromString(str: String, unsigned: Boolean): typings.long.longMod.Long = js.native
  def fromString(str: String, unsigned: Boolean, radix: Double): typings.long.longMod.Long = js.native
  def fromString(str: String, unsigned: Double): typings.long.longMod.Long = js.native
  def fromString(str: String, unsigned: Double, radix: Double): typings.long.longMod.Long = js.native
  def fromValue(`val`: String): typings.long.longMod.Long = js.native
  def fromValue(`val`: Double): typings.long.longMod.Long = js.native
  def fromValue(`val`: Anon_High): typings.long.longMod.Long = js.native
  /**
    * Converts the specified value to a Long.
    */
  def fromValue(`val`: typings.long.longMod.Long): typings.long.longMod.Long = js.native
  /**
    * Tests if the specified object is a Long.
    */
  def isLong(obj: js.Any): Boolean = js.native
}

