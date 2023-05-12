package typings.bson.libMod

import typings.bson.anon.High
import typings.bson.anon.NumberLong
import typings.bson.libExtendedJsonMod.EJSONOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("bson/lib", "Long")
@js.native
/**
  * Constructs a 64 bit two's-complement integer, given its low and high 32 bit values as *signed* integers.
  *  See the from* functions below for more convenient ways of constructing Longs.
  *
  * Acceptable signatures are:
  * - Long(low, high, unsigned?)
  * - Long(bigint, unsigned?)
  * - Long(string, unsigned?)
  *
  * @param low - The low (signed) 32 bits of the long
  * @param high - The high (signed) 32 bits of the long
  * @param unsigned - Whether unsigned or not, defaults to signed
  */
open class Long ()
  extends typings.bson.libBsonMod.Long {
  def this(low: String) = this()
  def this(low: js.BigInt) = this()
  def this(low: scala.Double) = this()
  def this(low: String, high: Boolean) = this()
  def this(low: String, high: scala.Double) = this()
  def this(low: js.BigInt, high: Boolean) = this()
  def this(low: js.BigInt, high: scala.Double) = this()
  def this(low: scala.Double, high: Boolean) = this()
  def this(low: scala.Double, high: scala.Double) = this()
  def this(low: Unit, high: Boolean) = this()
  def this(low: Unit, high: scala.Double) = this()
  def this(low: String, high: Boolean, unsigned: Boolean) = this()
  def this(low: String, high: scala.Double, unsigned: Boolean) = this()
  def this(low: String, high: Unit, unsigned: Boolean) = this()
  def this(low: js.BigInt, high: Boolean, unsigned: Boolean) = this()
  def this(low: js.BigInt, high: scala.Double, unsigned: Boolean) = this()
  def this(low: js.BigInt, high: Unit, unsigned: Boolean) = this()
  def this(low: scala.Double, high: Boolean, unsigned: Boolean) = this()
  def this(low: scala.Double, high: scala.Double, unsigned: Boolean) = this()
  def this(low: scala.Double, high: Unit, unsigned: Boolean) = this()
  def this(low: Unit, high: Boolean, unsigned: Boolean) = this()
  def this(low: Unit, high: scala.Double, unsigned: Boolean) = this()
  def this(low: Unit, high: Unit, unsigned: Boolean) = this()
}
/* static members */
object Long {
  
  @JSImport("bson/lib", "Long")
  @js.native
  val ^ : js.Any = js.native
  
  /** Maximum unsigned value. */
  @JSImport("bson/lib", "Long.MAX_UNSIGNED_VALUE")
  @js.native
  def MAX_UNSIGNED_VALUE: typings.bson.libLongMod.Long = js.native
  inline def MAX_UNSIGNED_VALUE_=(x: typings.bson.libLongMod.Long): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MAX_UNSIGNED_VALUE")(x.asInstanceOf[js.Any])
  
  /** Maximum signed value. */
  @JSImport("bson/lib", "Long.MAX_VALUE")
  @js.native
  def MAX_VALUE: typings.bson.libLongMod.Long = js.native
  inline def MAX_VALUE_=(x: typings.bson.libLongMod.Long): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MAX_VALUE")(x.asInstanceOf[js.Any])
  
  /** Minimum signed value. */
  @JSImport("bson/lib", "Long.MIN_VALUE")
  @js.native
  def MIN_VALUE: typings.bson.libLongMod.Long = js.native
  inline def MIN_VALUE_=(x: typings.bson.libLongMod.Long): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MIN_VALUE")(x.asInstanceOf[js.Any])
  
  /** Signed negative one. */
  @JSImport("bson/lib", "Long.NEG_ONE")
  @js.native
  def NEG_ONE: typings.bson.libLongMod.Long = js.native
  inline def NEG_ONE_=(x: typings.bson.libLongMod.Long): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("NEG_ONE")(x.asInstanceOf[js.Any])
  
  /** Signed one. */
  @JSImport("bson/lib", "Long.ONE")
  @js.native
  def ONE: typings.bson.libLongMod.Long = js.native
  inline def ONE_=(x: typings.bson.libLongMod.Long): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ONE")(x.asInstanceOf[js.Any])
  
  @JSImport("bson/lib", "Long.TWO_PWR_24")
  @js.native
  def TWO_PWR_24: typings.bson.libLongMod.Long = js.native
  inline def TWO_PWR_24_=(x: typings.bson.libLongMod.Long): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TWO_PWR_24")(x.asInstanceOf[js.Any])
  
  /** Unsigned one. */
  @JSImport("bson/lib", "Long.UONE")
  @js.native
  def UONE: typings.bson.libLongMod.Long = js.native
  inline def UONE_=(x: typings.bson.libLongMod.Long): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("UONE")(x.asInstanceOf[js.Any])
  
  /** Unsigned zero. */
  @JSImport("bson/lib", "Long.UZERO")
  @js.native
  def UZERO: typings.bson.libLongMod.Long = js.native
  inline def UZERO_=(x: typings.bson.libLongMod.Long): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("UZERO")(x.asInstanceOf[js.Any])
  
  /** Signed zero */
  @JSImport("bson/lib", "Long.ZERO")
  @js.native
  def ZERO: typings.bson.libLongMod.Long = js.native
  inline def ZERO_=(x: typings.bson.libLongMod.Long): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ZERO")(x.asInstanceOf[js.Any])
  
  /**
    * Returns a Long representing the given value, provided that it is a finite number. Otherwise, zero is returned.
    * @param value - The number in question
    * @param unsigned - Whether unsigned or not, defaults to signed
    * @returns The corresponding Long value
    */
  inline def fromBigInt(value: js.BigInt): typings.bson.libLongMod.Long = ^.asInstanceOf[js.Dynamic].applyDynamic("fromBigInt")(value.asInstanceOf[js.Any]).asInstanceOf[typings.bson.libLongMod.Long]
  inline def fromBigInt(value: js.BigInt, unsigned: Boolean): typings.bson.libLongMod.Long = (^.asInstanceOf[js.Dynamic].applyDynamic("fromBigInt")(value.asInstanceOf[js.Any], unsigned.asInstanceOf[js.Any])).asInstanceOf[typings.bson.libLongMod.Long]
  
  /**
    * Returns a Long representing the 64 bit integer that comes by concatenating the given low and high bits.
    * Each is assumed to use 32 bits.
    * @param lowBits - The low 32 bits
    * @param highBits - The high 32 bits
    * @param unsigned - Whether unsigned or not, defaults to signed
    * @returns The corresponding Long value
    */
  inline def fromBits(lowBits: scala.Double, highBits: scala.Double): typings.bson.libLongMod.Long = (^.asInstanceOf[js.Dynamic].applyDynamic("fromBits")(lowBits.asInstanceOf[js.Any], highBits.asInstanceOf[js.Any])).asInstanceOf[typings.bson.libLongMod.Long]
  inline def fromBits(lowBits: scala.Double, highBits: scala.Double, unsigned: Boolean): typings.bson.libLongMod.Long = (^.asInstanceOf[js.Dynamic].applyDynamic("fromBits")(lowBits.asInstanceOf[js.Any], highBits.asInstanceOf[js.Any], unsigned.asInstanceOf[js.Any])).asInstanceOf[typings.bson.libLongMod.Long]
  
  /**
    * Creates a Long from its byte representation.
    * @param bytes - Byte representation
    * @param unsigned - Whether unsigned or not, defaults to signed
    * @param le - Whether little or big endian, defaults to big endian
    * @returns The corresponding Long value
    */
  inline def fromBytes(bytes: js.Array[scala.Double]): typings.bson.libLongMod.Long = ^.asInstanceOf[js.Dynamic].applyDynamic("fromBytes")(bytes.asInstanceOf[js.Any]).asInstanceOf[typings.bson.libLongMod.Long]
  inline def fromBytes(bytes: js.Array[scala.Double], unsigned: Boolean): typings.bson.libLongMod.Long = (^.asInstanceOf[js.Dynamic].applyDynamic("fromBytes")(bytes.asInstanceOf[js.Any], unsigned.asInstanceOf[js.Any])).asInstanceOf[typings.bson.libLongMod.Long]
  inline def fromBytes(bytes: js.Array[scala.Double], unsigned: Boolean, le: Boolean): typings.bson.libLongMod.Long = (^.asInstanceOf[js.Dynamic].applyDynamic("fromBytes")(bytes.asInstanceOf[js.Any], unsigned.asInstanceOf[js.Any], le.asInstanceOf[js.Any])).asInstanceOf[typings.bson.libLongMod.Long]
  inline def fromBytes(bytes: js.Array[scala.Double], unsigned: Unit, le: Boolean): typings.bson.libLongMod.Long = (^.asInstanceOf[js.Dynamic].applyDynamic("fromBytes")(bytes.asInstanceOf[js.Any], unsigned.asInstanceOf[js.Any], le.asInstanceOf[js.Any])).asInstanceOf[typings.bson.libLongMod.Long]
  
  /**
    * Creates a Long from its big endian byte representation.
    * @param bytes - Big endian byte representation
    * @param unsigned - Whether unsigned or not, defaults to signed
    * @returns The corresponding Long value
    */
  inline def fromBytesBE(bytes: js.Array[scala.Double]): typings.bson.libLongMod.Long = ^.asInstanceOf[js.Dynamic].applyDynamic("fromBytesBE")(bytes.asInstanceOf[js.Any]).asInstanceOf[typings.bson.libLongMod.Long]
  inline def fromBytesBE(bytes: js.Array[scala.Double], unsigned: Boolean): typings.bson.libLongMod.Long = (^.asInstanceOf[js.Dynamic].applyDynamic("fromBytesBE")(bytes.asInstanceOf[js.Any], unsigned.asInstanceOf[js.Any])).asInstanceOf[typings.bson.libLongMod.Long]
  
  /**
    * Creates a Long from its little endian byte representation.
    * @param bytes - Little endian byte representation
    * @param unsigned - Whether unsigned or not, defaults to signed
    * @returns The corresponding Long value
    */
  inline def fromBytesLE(bytes: js.Array[scala.Double]): typings.bson.libLongMod.Long = ^.asInstanceOf[js.Dynamic].applyDynamic("fromBytesLE")(bytes.asInstanceOf[js.Any]).asInstanceOf[typings.bson.libLongMod.Long]
  inline def fromBytesLE(bytes: js.Array[scala.Double], unsigned: Boolean): typings.bson.libLongMod.Long = (^.asInstanceOf[js.Dynamic].applyDynamic("fromBytesLE")(bytes.asInstanceOf[js.Any], unsigned.asInstanceOf[js.Any])).asInstanceOf[typings.bson.libLongMod.Long]
  
  inline def fromExtendedJSON(doc: NumberLong): scala.Double | typings.bson.libLongMod.Long | js.BigInt = ^.asInstanceOf[js.Dynamic].applyDynamic("fromExtendedJSON")(doc.asInstanceOf[js.Any]).asInstanceOf[scala.Double | typings.bson.libLongMod.Long | js.BigInt]
  inline def fromExtendedJSON(doc: NumberLong, options: EJSONOptions): scala.Double | typings.bson.libLongMod.Long | js.BigInt = (^.asInstanceOf[js.Dynamic].applyDynamic("fromExtendedJSON")(doc.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[scala.Double | typings.bson.libLongMod.Long | js.BigInt]
  
  /**
    * Returns a Long representing the given 32 bit integer value.
    * @param value - The 32 bit integer in question
    * @param unsigned - Whether unsigned or not, defaults to signed
    * @returns The corresponding Long value
    */
  inline def fromInt(value: scala.Double): typings.bson.libLongMod.Long = ^.asInstanceOf[js.Dynamic].applyDynamic("fromInt")(value.asInstanceOf[js.Any]).asInstanceOf[typings.bson.libLongMod.Long]
  inline def fromInt(value: scala.Double, unsigned: Boolean): typings.bson.libLongMod.Long = (^.asInstanceOf[js.Dynamic].applyDynamic("fromInt")(value.asInstanceOf[js.Any], unsigned.asInstanceOf[js.Any])).asInstanceOf[typings.bson.libLongMod.Long]
  
  /**
    * Returns a Long representing the given value, provided that it is a finite number. Otherwise, zero is returned.
    * @param value - The number in question
    * @param unsigned - Whether unsigned or not, defaults to signed
    * @returns The corresponding Long value
    */
  inline def fromNumber(value: scala.Double): typings.bson.libLongMod.Long = ^.asInstanceOf[js.Dynamic].applyDynamic("fromNumber")(value.asInstanceOf[js.Any]).asInstanceOf[typings.bson.libLongMod.Long]
  inline def fromNumber(value: scala.Double, unsigned: Boolean): typings.bson.libLongMod.Long = (^.asInstanceOf[js.Dynamic].applyDynamic("fromNumber")(value.asInstanceOf[js.Any], unsigned.asInstanceOf[js.Any])).asInstanceOf[typings.bson.libLongMod.Long]
  
  /**
    * Returns a Long representation of the given string, written using the specified radix.
    * @param str - The textual representation of the Long
    * @param unsigned - Whether unsigned or not, defaults to signed
    * @param radix - The radix in which the text is written (2-36), defaults to 10
    * @returns The corresponding Long value
    */
  inline def fromString(str: String): typings.bson.libLongMod.Long = ^.asInstanceOf[js.Dynamic].applyDynamic("fromString")(str.asInstanceOf[js.Any]).asInstanceOf[typings.bson.libLongMod.Long]
  inline def fromString(str: String, unsigned: Boolean): typings.bson.libLongMod.Long = (^.asInstanceOf[js.Dynamic].applyDynamic("fromString")(str.asInstanceOf[js.Any], unsigned.asInstanceOf[js.Any])).asInstanceOf[typings.bson.libLongMod.Long]
  inline def fromString(str: String, unsigned: Boolean, radix: scala.Double): typings.bson.libLongMod.Long = (^.asInstanceOf[js.Dynamic].applyDynamic("fromString")(str.asInstanceOf[js.Any], unsigned.asInstanceOf[js.Any], radix.asInstanceOf[js.Any])).asInstanceOf[typings.bson.libLongMod.Long]
  inline def fromString(str: String, unsigned: Unit, radix: scala.Double): typings.bson.libLongMod.Long = (^.asInstanceOf[js.Dynamic].applyDynamic("fromString")(str.asInstanceOf[js.Any], unsigned.asInstanceOf[js.Any], radix.asInstanceOf[js.Any])).asInstanceOf[typings.bson.libLongMod.Long]
  
  inline def fromValue(`val`: String): typings.bson.libLongMod.Long = ^.asInstanceOf[js.Dynamic].applyDynamic("fromValue")(`val`.asInstanceOf[js.Any]).asInstanceOf[typings.bson.libLongMod.Long]
  inline def fromValue(`val`: String, unsigned: Boolean): typings.bson.libLongMod.Long = (^.asInstanceOf[js.Dynamic].applyDynamic("fromValue")(`val`.asInstanceOf[js.Any], unsigned.asInstanceOf[js.Any])).asInstanceOf[typings.bson.libLongMod.Long]
  /**
    * Converts the specified value to a Long.
    * @param unsigned - Whether unsigned or not, defaults to signed
    */
  inline def fromValue(`val`: scala.Double): typings.bson.libLongMod.Long = ^.asInstanceOf[js.Dynamic].applyDynamic("fromValue")(`val`.asInstanceOf[js.Any]).asInstanceOf[typings.bson.libLongMod.Long]
  inline def fromValue(`val`: scala.Double, unsigned: Boolean): typings.bson.libLongMod.Long = (^.asInstanceOf[js.Dynamic].applyDynamic("fromValue")(`val`.asInstanceOf[js.Any], unsigned.asInstanceOf[js.Any])).asInstanceOf[typings.bson.libLongMod.Long]
  inline def fromValue(`val`: High): typings.bson.libLongMod.Long = ^.asInstanceOf[js.Dynamic].applyDynamic("fromValue")(`val`.asInstanceOf[js.Any]).asInstanceOf[typings.bson.libLongMod.Long]
  inline def fromValue(`val`: High, unsigned: Boolean): typings.bson.libLongMod.Long = (^.asInstanceOf[js.Dynamic].applyDynamic("fromValue")(`val`.asInstanceOf[js.Any], unsigned.asInstanceOf[js.Any])).asInstanceOf[typings.bson.libLongMod.Long]
  
  /**
    * Tests if the specified object is a Long.
    */
  inline def isLong(value: Any): /* is bson.bson/lib/long.Long */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isLong")(value.asInstanceOf[js.Any]).asInstanceOf[/* is bson.bson/lib/long.Long */ Boolean]
}
