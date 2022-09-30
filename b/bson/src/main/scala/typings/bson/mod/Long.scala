package typings.bson.mod

import typings.bson.anon.High
import typings.bson.anon.NumberLong
import typings.bson.bsonBooleans.`true`
import typings.bson.bsonInts.`-1`
import typings.bson.bsonInts.`0`
import typings.bson.bsonInts.`1`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("bson", "Long")
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
open class Long () extends StObject {
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
  
  /** An indicator used to reliably determine if an object is a Long or not. */
  var __isLong__ : `true` = js.native
  
  var _bsontype: typings.bson.bsonStrings.Long = js.native
  
  /** Returns the sum of this and the specified Long. */
  def add(addend: String): Long = js.native
  def add(addend: scala.Double): Long = js.native
  def add(addend: Long): Long = js.native
  def add(addend: Timestamp): Long = js.native
  
  /**
    * Returns the sum of this and the specified Long.
    * @returns Sum
    */
  def and(other: String): Long = js.native
  def and(other: scala.Double): Long = js.native
  def and(other: Long): Long = js.native
  def and(other: Timestamp): Long = js.native
  
  /** This is an alias of {@link Long.compare} */
  def comp(other: String): `0` | `1` | `-1` = js.native
  def comp(other: scala.Double): `0` | `1` | `-1` = js.native
  def comp(other: Long): `0` | `1` | `-1` = js.native
  def comp(other: Timestamp): `0` | `1` | `-1` = js.native
  
  /**
    * Compares this Long's value with the specified's.
    * @returns 0 if they are the same, 1 if the this is greater and -1 if the given one is greater
    */
  def compare(other: String): `0` | `1` | `-1` = js.native
  def compare(other: scala.Double): `0` | `1` | `-1` = js.native
  def compare(other: Long): `0` | `1` | `-1` = js.native
  def compare(other: Timestamp): `0` | `1` | `-1` = js.native
  
  /**This is an alias of {@link Long.divide} */
  def div(divisor: String): Long = js.native
  def div(divisor: scala.Double): Long = js.native
  def div(divisor: Long): Long = js.native
  def div(divisor: Timestamp): Long = js.native
  
  /**
    * Returns this Long divided by the specified. The result is signed if this Long is signed or unsigned if this Long is unsigned.
    * @returns Quotient
    */
  def divide(divisor: String): Long = js.native
  def divide(divisor: scala.Double): Long = js.native
  def divide(divisor: Long): Long = js.native
  def divide(divisor: Timestamp): Long = js.native
  
  /** This is an alias of {@link Long.equals} */
  def eq(other: String): Boolean = js.native
  def eq(other: scala.Double): Boolean = js.native
  def eq(other: Long): Boolean = js.native
  def eq(other: Timestamp): Boolean = js.native
  
  /**
    * Tests if this Long's value equals the specified's.
    * @param other - Other value
    */
  def equals(other: String): Boolean = js.native
  def equals(other: scala.Double): Boolean = js.native
  def equals(other: Long): Boolean = js.native
  def equals(other: Timestamp): Boolean = js.native
  
  /** This is an alias of {@link Long.isZero} */
  def eqz(): Boolean = js.native
  
  /** This is an alias of {@link Long.greaterThanOrEqual} */
  def ge(other: String): Boolean = js.native
  def ge(other: scala.Double): Boolean = js.native
  def ge(other: Long): Boolean = js.native
  def ge(other: Timestamp): Boolean = js.native
  
  /** Gets the high 32 bits as a signed integer. */
  def getHighBits(): scala.Double = js.native
  
  /** Gets the high 32 bits as an unsigned integer. */
  def getHighBitsUnsigned(): scala.Double = js.native
  
  /** Gets the low 32 bits as a signed integer. */
  def getLowBits(): scala.Double = js.native
  
  /** Gets the low 32 bits as an unsigned integer. */
  def getLowBitsUnsigned(): scala.Double = js.native
  
  /** Gets the number of bits needed to represent the absolute value of this Long. */
  def getNumBitsAbs(): scala.Double = js.native
  
  /** Tests if this Long's value is greater than the specified's. */
  def greaterThan(other: String): Boolean = js.native
  def greaterThan(other: scala.Double): Boolean = js.native
  def greaterThan(other: Long): Boolean = js.native
  def greaterThan(other: Timestamp): Boolean = js.native
  
  /** Tests if this Long's value is greater than or equal the specified's. */
  def greaterThanOrEqual(other: String): Boolean = js.native
  def greaterThanOrEqual(other: scala.Double): Boolean = js.native
  def greaterThanOrEqual(other: Long): Boolean = js.native
  def greaterThanOrEqual(other: Timestamp): Boolean = js.native
  
  /** This is an alias of {@link Long.greaterThan} */
  def gt(other: String): Boolean = js.native
  def gt(other: scala.Double): Boolean = js.native
  def gt(other: Long): Boolean = js.native
  def gt(other: Timestamp): Boolean = js.native
  
  /** This is an alias of {@link Long.greaterThanOrEqual} */
  def gte(other: String): Boolean = js.native
  def gte(other: scala.Double): Boolean = js.native
  def gte(other: Long): Boolean = js.native
  def gte(other: Timestamp): Boolean = js.native
  
  /**
    * The high 32 bits as a signed value.
    */
  var high: scala.Double = js.native
  
  def inspect(): String = js.native
  
  /** Tests if this Long's value is even. */
  def isEven(): Boolean = js.native
  
  /** Tests if this Long's value is negative. */
  def isNegative(): Boolean = js.native
  
  /** Tests if this Long's value is odd. */
  def isOdd(): Boolean = js.native
  
  /** Tests if this Long's value is positive. */
  def isPositive(): Boolean = js.native
  
  /** Tests if this Long's value equals zero. */
  def isZero(): Boolean = js.native
  
  /** This is an alias of {@link Long.lessThanOrEqual} */
  def le(other: String): Boolean = js.native
  def le(other: scala.Double): Boolean = js.native
  def le(other: Long): Boolean = js.native
  def le(other: Timestamp): Boolean = js.native
  
  /** Tests if this Long's value is less than the specified's. */
  def lessThan(other: String): Boolean = js.native
  def lessThan(other: scala.Double): Boolean = js.native
  def lessThan(other: Long): Boolean = js.native
  def lessThan(other: Timestamp): Boolean = js.native
  
  /** Tests if this Long's value is less than or equal the specified's. */
  def lessThanOrEqual(other: String): Boolean = js.native
  def lessThanOrEqual(other: scala.Double): Boolean = js.native
  def lessThanOrEqual(other: Long): Boolean = js.native
  def lessThanOrEqual(other: Timestamp): Boolean = js.native
  
  /**
    * The low 32 bits as a signed value.
    */
  var low: scala.Double = js.native
  
  /** This is an alias of {@link Long#lessThan}. */
  def lt(other: String): Boolean = js.native
  def lt(other: scala.Double): Boolean = js.native
  def lt(other: Long): Boolean = js.native
  def lt(other: Timestamp): Boolean = js.native
  
  /** This is an alias of {@link Long.lessThanOrEqual} */
  def lte(other: String): Boolean = js.native
  def lte(other: scala.Double): Boolean = js.native
  def lte(other: Long): Boolean = js.native
  def lte(other: Timestamp): Boolean = js.native
  
  /** This is an alias of {@link Long.modulo} */
  def mod(divisor: String): Long = js.native
  def mod(divisor: scala.Double): Long = js.native
  def mod(divisor: Long): Long = js.native
  def mod(divisor: Timestamp): Long = js.native
  
  /** Returns this Long modulo the specified. */
  def modulo(divisor: String): Long = js.native
  def modulo(divisor: scala.Double): Long = js.native
  def modulo(divisor: Long): Long = js.native
  def modulo(divisor: Timestamp): Long = js.native
  
  /** This is an alias of {@link Long.multiply} */
  def mul(multiplier: String): Long = js.native
  def mul(multiplier: scala.Double): Long = js.native
  def mul(multiplier: Long): Long = js.native
  def mul(multiplier: Timestamp): Long = js.native
  
  /**
    * Returns the product of this and the specified Long.
    * @param multiplier - Multiplier
    * @returns Product
    */
  def multiply(multiplier: String): Long = js.native
  def multiply(multiplier: scala.Double): Long = js.native
  def multiply(multiplier: Long): Long = js.native
  def multiply(multiplier: Timestamp): Long = js.native
  
  /** This is an alias of {@link Long.notEquals} */
  def ne(other: String): Boolean = js.native
  def ne(other: scala.Double): Boolean = js.native
  def ne(other: Long): Boolean = js.native
  def ne(other: Timestamp): Boolean = js.native
  
  /** This is an alias of {@link Long.negate} */
  def neg(): Long = js.native
  
  /** Returns the Negation of this Long's value. */
  def negate(): Long = js.native
  
  /** This is an alias of {@link Long.notEquals} */
  def neq(other: String): Boolean = js.native
  def neq(other: scala.Double): Boolean = js.native
  def neq(other: Long): Boolean = js.native
  def neq(other: Timestamp): Boolean = js.native
  
  /** Returns the bitwise NOT of this Long. */
  def not(): Long = js.native
  
  /** Tests if this Long's value differs from the specified's. */
  def notEquals(other: String): Boolean = js.native
  def notEquals(other: scala.Double): Boolean = js.native
  def notEquals(other: Long): Boolean = js.native
  def notEquals(other: Timestamp): Boolean = js.native
  
  def or(other: String): Long = js.native
  /**
    * Returns the bitwise OR of this Long and the specified.
    */
  def or(other: scala.Double): Long = js.native
  def or(other: Long): Long = js.native
  
  /** This is an alias of {@link Long.modulo} */
  def rem(divisor: String): Long = js.native
  def rem(divisor: scala.Double): Long = js.native
  def rem(divisor: Long): Long = js.native
  def rem(divisor: Timestamp): Long = js.native
  
  /**
    * Returns this Long with bits shifted to the left by the given amount.
    * @param numBits - Number of bits
    * @returns Shifted Long
    */
  def shiftLeft(numBits: scala.Double): Long = js.native
  def shiftLeft(numBits: Long): Long = js.native
  
  /**
    * Returns this Long with bits arithmetically shifted to the right by the given amount.
    * @param numBits - Number of bits
    * @returns Shifted Long
    */
  def shiftRight(numBits: scala.Double): Long = js.native
  def shiftRight(numBits: Long): Long = js.native
  
  def shiftRightUnsigned(numBits: scala.Double): Long = js.native
  /**
    * Returns this Long with bits logically shifted to the right by the given amount.
    * @param numBits - Number of bits
    * @returns Shifted Long
    */
  def shiftRightUnsigned(numBits: Long): Long = js.native
  
  /** This is an alias of {@link Long.shiftLeft} */
  def shl(numBits: scala.Double): Long = js.native
  def shl(numBits: Long): Long = js.native
  
  /** This is an alias of {@link Long.shiftRight} */
  def shr(numBits: scala.Double): Long = js.native
  def shr(numBits: Long): Long = js.native
  
  /** This is an alias of {@link Long.shiftRightUnsigned} */
  def shr_u(numBits: scala.Double): Long = js.native
  def shr_u(numBits: Long): Long = js.native
  
  /** This is an alias of {@link Long.shiftRightUnsigned} */
  def shru(numBits: scala.Double): Long = js.native
  def shru(numBits: Long): Long = js.native
  
  /** This is an alias of {@link Long.subtract} */
  def sub(subtrahend: String): Long = js.native
  def sub(subtrahend: scala.Double): Long = js.native
  def sub(subtrahend: Long): Long = js.native
  def sub(subtrahend: Timestamp): Long = js.native
  
  /**
    * Returns the difference of this and the specified Long.
    * @param subtrahend - Subtrahend
    * @returns Difference
    */
  def subtract(subtrahend: String): Long = js.native
  def subtract(subtrahend: scala.Double): Long = js.native
  def subtract(subtrahend: Long): Long = js.native
  def subtract(subtrahend: Timestamp): Long = js.native
  
  /** Converts the Long to a BigInt (arbitrary precision). */
  def toBigInt(): js.BigInt = js.native
  
  /**
    * Converts this Long to its byte representation.
    * @param le - Whether little or big endian, defaults to big endian
    * @returns Byte representation
    */
  def toBytes(): js.Array[scala.Double] = js.native
  def toBytes(le: Boolean): js.Array[scala.Double] = js.native
  
  /**
    * Converts this Long to its big endian byte representation.
    * @returns Big endian byte representation
    */
  def toBytesBE(): js.Array[scala.Double] = js.native
  
  /**
    * Converts this Long to its little endian byte representation.
    * @returns Little endian byte representation
    */
  def toBytesLE(): js.Array[scala.Double] = js.native
  
  def toExtendedJSON(): scala.Double | LongExtended = js.native
  def toExtendedJSON(options: EJSONOptions): scala.Double | LongExtended = js.native
  
  /** Converts the Long to a 32 bit integer, assuming it is a 32 bit integer. */
  def toInt(): scala.Double = js.native
  
  /** Converts the Long to a the nearest floating-point representation of this value (double, 53 bit mantissa). */
  def toNumber(): scala.Double = js.native
  
  /**
    * Converts this Long to signed.
    */
  def toSigned(): Long = js.native
  
  def toString(radix: scala.Double): String = js.native
  
  /** Converts this Long to unsigned. */
  def toUnsigned(): Long = js.native
  
  /**
    * Whether unsigned or not.
    */
  var unsigned: Boolean = js.native
  
  def xor(other: String): Long = js.native
  def xor(other: scala.Double): Long = js.native
  /** Returns the bitwise XOR of this Long and the given one. */
  def xor(other: Long): Long = js.native
}
/* static members */
object Long {
  
  @JSImport("bson", "Long")
  @js.native
  val ^ : js.Any = js.native
  
  /** Maximum unsigned value. */
  @JSImport("bson", "Long.MAX_UNSIGNED_VALUE")
  @js.native
  def MAX_UNSIGNED_VALUE: Long = js.native
  inline def MAX_UNSIGNED_VALUE_=(x: Long): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MAX_UNSIGNED_VALUE")(x.asInstanceOf[js.Any])
  
  /** Maximum signed value. */
  @JSImport("bson", "Long.MAX_VALUE")
  @js.native
  def MAX_VALUE: Long = js.native
  inline def MAX_VALUE_=(x: Long): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MAX_VALUE")(x.asInstanceOf[js.Any])
  
  /** Minimum signed value. */
  @JSImport("bson", "Long.MIN_VALUE")
  @js.native
  def MIN_VALUE: Long = js.native
  inline def MIN_VALUE_=(x: Long): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MIN_VALUE")(x.asInstanceOf[js.Any])
  
  /** Signed negative one. */
  @JSImport("bson", "Long.NEG_ONE")
  @js.native
  def NEG_ONE: Long = js.native
  inline def NEG_ONE_=(x: Long): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("NEG_ONE")(x.asInstanceOf[js.Any])
  
  /** Signed one. */
  @JSImport("bson", "Long.ONE")
  @js.native
  def ONE: Long = js.native
  inline def ONE_=(x: Long): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ONE")(x.asInstanceOf[js.Any])
  
  @JSImport("bson", "Long.TWO_PWR_24")
  @js.native
  def TWO_PWR_24: Long = js.native
  inline def TWO_PWR_24_=(x: Long): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TWO_PWR_24")(x.asInstanceOf[js.Any])
  
  /** Unsigned one. */
  @JSImport("bson", "Long.UONE")
  @js.native
  def UONE: Long = js.native
  inline def UONE_=(x: Long): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("UONE")(x.asInstanceOf[js.Any])
  
  /** Unsigned zero. */
  @JSImport("bson", "Long.UZERO")
  @js.native
  def UZERO: Long = js.native
  inline def UZERO_=(x: Long): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("UZERO")(x.asInstanceOf[js.Any])
  
  /** Signed zero */
  @JSImport("bson", "Long.ZERO")
  @js.native
  def ZERO: Long = js.native
  inline def ZERO_=(x: Long): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ZERO")(x.asInstanceOf[js.Any])
  
  /**
    * Returns a Long representing the given value, provided that it is a finite number. Otherwise, zero is returned.
    * @param value - The number in question
    * @param unsigned - Whether unsigned or not, defaults to signed
    * @returns The corresponding Long value
    */
  inline def fromBigInt(value: js.BigInt): Long = ^.asInstanceOf[js.Dynamic].applyDynamic("fromBigInt")(value.asInstanceOf[js.Any]).asInstanceOf[Long]
  inline def fromBigInt(value: js.BigInt, unsigned: Boolean): Long = (^.asInstanceOf[js.Dynamic].applyDynamic("fromBigInt")(value.asInstanceOf[js.Any], unsigned.asInstanceOf[js.Any])).asInstanceOf[Long]
  
  /**
    * Returns a Long representing the 64 bit integer that comes by concatenating the given low and high bits.
    * Each is assumed to use 32 bits.
    * @param lowBits - The low 32 bits
    * @param highBits - The high 32 bits
    * @param unsigned - Whether unsigned or not, defaults to signed
    * @returns The corresponding Long value
    */
  inline def fromBits(lowBits: scala.Double, highBits: scala.Double): Long = (^.asInstanceOf[js.Dynamic].applyDynamic("fromBits")(lowBits.asInstanceOf[js.Any], highBits.asInstanceOf[js.Any])).asInstanceOf[Long]
  inline def fromBits(lowBits: scala.Double, highBits: scala.Double, unsigned: Boolean): Long = (^.asInstanceOf[js.Dynamic].applyDynamic("fromBits")(lowBits.asInstanceOf[js.Any], highBits.asInstanceOf[js.Any], unsigned.asInstanceOf[js.Any])).asInstanceOf[Long]
  
  /**
    * Creates a Long from its byte representation.
    * @param bytes - Byte representation
    * @param unsigned - Whether unsigned or not, defaults to signed
    * @param le - Whether little or big endian, defaults to big endian
    * @returns The corresponding Long value
    */
  inline def fromBytes(bytes: js.Array[scala.Double]): Long = ^.asInstanceOf[js.Dynamic].applyDynamic("fromBytes")(bytes.asInstanceOf[js.Any]).asInstanceOf[Long]
  inline def fromBytes(bytes: js.Array[scala.Double], unsigned: Boolean): Long = (^.asInstanceOf[js.Dynamic].applyDynamic("fromBytes")(bytes.asInstanceOf[js.Any], unsigned.asInstanceOf[js.Any])).asInstanceOf[Long]
  inline def fromBytes(bytes: js.Array[scala.Double], unsigned: Boolean, le: Boolean): Long = (^.asInstanceOf[js.Dynamic].applyDynamic("fromBytes")(bytes.asInstanceOf[js.Any], unsigned.asInstanceOf[js.Any], le.asInstanceOf[js.Any])).asInstanceOf[Long]
  inline def fromBytes(bytes: js.Array[scala.Double], unsigned: Unit, le: Boolean): Long = (^.asInstanceOf[js.Dynamic].applyDynamic("fromBytes")(bytes.asInstanceOf[js.Any], unsigned.asInstanceOf[js.Any], le.asInstanceOf[js.Any])).asInstanceOf[Long]
  
  /**
    * Creates a Long from its big endian byte representation.
    * @param bytes - Big endian byte representation
    * @param unsigned - Whether unsigned or not, defaults to signed
    * @returns The corresponding Long value
    */
  inline def fromBytesBE(bytes: js.Array[scala.Double]): Long = ^.asInstanceOf[js.Dynamic].applyDynamic("fromBytesBE")(bytes.asInstanceOf[js.Any]).asInstanceOf[Long]
  inline def fromBytesBE(bytes: js.Array[scala.Double], unsigned: Boolean): Long = (^.asInstanceOf[js.Dynamic].applyDynamic("fromBytesBE")(bytes.asInstanceOf[js.Any], unsigned.asInstanceOf[js.Any])).asInstanceOf[Long]
  
  /**
    * Creates a Long from its little endian byte representation.
    * @param bytes - Little endian byte representation
    * @param unsigned - Whether unsigned or not, defaults to signed
    * @returns The corresponding Long value
    */
  inline def fromBytesLE(bytes: js.Array[scala.Double]): Long = ^.asInstanceOf[js.Dynamic].applyDynamic("fromBytesLE")(bytes.asInstanceOf[js.Any]).asInstanceOf[Long]
  inline def fromBytesLE(bytes: js.Array[scala.Double], unsigned: Boolean): Long = (^.asInstanceOf[js.Dynamic].applyDynamic("fromBytesLE")(bytes.asInstanceOf[js.Any], unsigned.asInstanceOf[js.Any])).asInstanceOf[Long]
  
  inline def fromExtendedJSON(doc: NumberLong): scala.Double | Long = ^.asInstanceOf[js.Dynamic].applyDynamic("fromExtendedJSON")(doc.asInstanceOf[js.Any]).asInstanceOf[scala.Double | Long]
  inline def fromExtendedJSON(doc: NumberLong, options: EJSONOptions): scala.Double | Long = (^.asInstanceOf[js.Dynamic].applyDynamic("fromExtendedJSON")(doc.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[scala.Double | Long]
  
  /**
    * Returns a Long representing the given 32 bit integer value.
    * @param value - The 32 bit integer in question
    * @param unsigned - Whether unsigned or not, defaults to signed
    * @returns The corresponding Long value
    */
  inline def fromInt(value: scala.Double): Long = ^.asInstanceOf[js.Dynamic].applyDynamic("fromInt")(value.asInstanceOf[js.Any]).asInstanceOf[Long]
  inline def fromInt(value: scala.Double, unsigned: Boolean): Long = (^.asInstanceOf[js.Dynamic].applyDynamic("fromInt")(value.asInstanceOf[js.Any], unsigned.asInstanceOf[js.Any])).asInstanceOf[Long]
  
  /**
    * Returns a Long representing the given value, provided that it is a finite number. Otherwise, zero is returned.
    * @param value - The number in question
    * @param unsigned - Whether unsigned or not, defaults to signed
    * @returns The corresponding Long value
    */
  inline def fromNumber(value: scala.Double): Long = ^.asInstanceOf[js.Dynamic].applyDynamic("fromNumber")(value.asInstanceOf[js.Any]).asInstanceOf[Long]
  inline def fromNumber(value: scala.Double, unsigned: Boolean): Long = (^.asInstanceOf[js.Dynamic].applyDynamic("fromNumber")(value.asInstanceOf[js.Any], unsigned.asInstanceOf[js.Any])).asInstanceOf[Long]
  
  /**
    * Returns a Long representation of the given string, written using the specified radix.
    * @param str - The textual representation of the Long
    * @param unsigned - Whether unsigned or not, defaults to signed
    * @param radix - The radix in which the text is written (2-36), defaults to 10
    * @returns The corresponding Long value
    */
  inline def fromString(str: String): Long = ^.asInstanceOf[js.Dynamic].applyDynamic("fromString")(str.asInstanceOf[js.Any]).asInstanceOf[Long]
  inline def fromString(str: String, unsigned: Boolean): Long = (^.asInstanceOf[js.Dynamic].applyDynamic("fromString")(str.asInstanceOf[js.Any], unsigned.asInstanceOf[js.Any])).asInstanceOf[Long]
  inline def fromString(str: String, unsigned: Boolean, radix: scala.Double): Long = (^.asInstanceOf[js.Dynamic].applyDynamic("fromString")(str.asInstanceOf[js.Any], unsigned.asInstanceOf[js.Any], radix.asInstanceOf[js.Any])).asInstanceOf[Long]
  inline def fromString(str: String, unsigned: Unit, radix: scala.Double): Long = (^.asInstanceOf[js.Dynamic].applyDynamic("fromString")(str.asInstanceOf[js.Any], unsigned.asInstanceOf[js.Any], radix.asInstanceOf[js.Any])).asInstanceOf[Long]
  
  inline def fromValue(`val`: String): Long = ^.asInstanceOf[js.Dynamic].applyDynamic("fromValue")(`val`.asInstanceOf[js.Any]).asInstanceOf[Long]
  inline def fromValue(`val`: String, unsigned: Boolean): Long = (^.asInstanceOf[js.Dynamic].applyDynamic("fromValue")(`val`.asInstanceOf[js.Any], unsigned.asInstanceOf[js.Any])).asInstanceOf[Long]
  /**
    * Converts the specified value to a Long.
    * @param unsigned - Whether unsigned or not, defaults to signed
    */
  inline def fromValue(`val`: scala.Double): Long = ^.asInstanceOf[js.Dynamic].applyDynamic("fromValue")(`val`.asInstanceOf[js.Any]).asInstanceOf[Long]
  inline def fromValue(`val`: scala.Double, unsigned: Boolean): Long = (^.asInstanceOf[js.Dynamic].applyDynamic("fromValue")(`val`.asInstanceOf[js.Any], unsigned.asInstanceOf[js.Any])).asInstanceOf[Long]
  inline def fromValue(`val`: High): Long = ^.asInstanceOf[js.Dynamic].applyDynamic("fromValue")(`val`.asInstanceOf[js.Any]).asInstanceOf[Long]
  inline def fromValue(`val`: High, unsigned: Boolean): Long = (^.asInstanceOf[js.Dynamic].applyDynamic("fromValue")(`val`.asInstanceOf[js.Any], unsigned.asInstanceOf[js.Any])).asInstanceOf[Long]
  
  /**
    * Tests if the specified object is a Long.
    */
  inline def isLong(value: Any): /* is bson.bson.Long */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isLong")(value.asInstanceOf[js.Any]).asInstanceOf[/* is bson.bson.Long */ Boolean]
}
