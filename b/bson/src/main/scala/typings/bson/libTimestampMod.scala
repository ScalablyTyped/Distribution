package typings.bson

import org.scalablytyped.runtime.Instantiable3
import typings.bson.anon.I
import typings.bson.anon.PinExcludekeyofLongTimestAdd
import typings.bson.bsonInts.`-1`
import typings.bson.bsonInts.`0`
import typings.bson.bsonInts.`1`
import typings.bson.libLongMod.Long
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTimestampMod {
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("bson/lib/timestamp", "LongWithoutOverridesClass")
  @js.native
  open class LongWithoutOverridesClass protected ()
    extends StObject
       with PinExcludekeyofLongTimestAdd {
    def this(low: Any) = this()
    def this(low: Any, high: Boolean) = this()
    def this(low: Any, high: Double) = this()
    def this(low: Any, high: Boolean, unsigned: Boolean) = this()
    def this(low: Any, high: Double, unsigned: Boolean) = this()
    def this(low: Any, high: Unit, unsigned: Boolean) = this()
    
    /* CompleteClass */
    override def __isLong__(): Boolean = js.native
    /* CompleteClass */
    @JSName("__isLong__")
    var __isLong___Original: js.Function0[Boolean] = js.native
    
    /* CompleteClass */
    override def add(addend: String): Long = js.native
    /* CompleteClass */
    override def add(addend: Double): Long = js.native
    /* CompleteClass */
    override def add(addend: Long): Long = js.native
    /* CompleteClass */
    override def add(addend: Timestamp): Long = js.native
    /* CompleteClass */
    @JSName("add")
    var add_Original: js.Function1[/* addend */ String | Double | Long | Timestamp, Long] = js.native
    
    /* CompleteClass */
    override def and(other: String): Long = js.native
    /* CompleteClass */
    override def and(other: Double): Long = js.native
    /* CompleteClass */
    override def and(other: Long): Long = js.native
    /* CompleteClass */
    override def and(other: Timestamp): Long = js.native
    /* CompleteClass */
    @JSName("and")
    var and_Original: js.Function1[/* other */ String | Double | Long | Timestamp, Long] = js.native
    
    /* CompleteClass */
    override def comp(other: String): `0` | `1` | `-1` = js.native
    /* CompleteClass */
    override def comp(other: Double): `0` | `1` | `-1` = js.native
    /* CompleteClass */
    override def comp(other: Long): `0` | `1` | `-1` = js.native
    /* CompleteClass */
    override def comp(other: Timestamp): `0` | `1` | `-1` = js.native
    /* CompleteClass */
    @JSName("comp")
    var comp_Original: js.Function1[/* other */ String | Double | Long | Timestamp, `0` | `1` | `-1`] = js.native
    
    /* CompleteClass */
    override def compare(other: String): `0` | `1` | `-1` = js.native
    /* CompleteClass */
    override def compare(other: Double): `0` | `1` | `-1` = js.native
    /* CompleteClass */
    override def compare(other: Long): `0` | `1` | `-1` = js.native
    /* CompleteClass */
    override def compare(other: Timestamp): `0` | `1` | `-1` = js.native
    /* CompleteClass */
    @JSName("compare")
    var compare_Original: js.Function1[/* other */ String | Double | Long | Timestamp, `0` | `1` | `-1`] = js.native
    
    /* CompleteClass */
    @JSName("constructor")
    var constructor_Original: js.Function3[
        /* low */ js.UndefOr[Double | js.BigInt | String], 
        /* high */ js.UndefOr[Double | Boolean], 
        /* unsigned */ js.UndefOr[Boolean], 
        Any
      ] = js.native
    
    /* CompleteClass */
    override def div(divisor: String): Long = js.native
    /* CompleteClass */
    override def div(divisor: Double): Long = js.native
    /* CompleteClass */
    override def div(divisor: Long): Long = js.native
    /* CompleteClass */
    override def div(divisor: Timestamp): Long = js.native
    /* CompleteClass */
    @JSName("div")
    var div_Original: js.Function1[/* divisor */ String | Double | Long | Timestamp, Long] = js.native
    
    /* CompleteClass */
    override def divide(divisor: String): Long = js.native
    /* CompleteClass */
    override def divide(divisor: Double): Long = js.native
    /* CompleteClass */
    override def divide(divisor: Long): Long = js.native
    /* CompleteClass */
    override def divide(divisor: Timestamp): Long = js.native
    /* CompleteClass */
    @JSName("divide")
    var divide_Original: js.Function1[/* divisor */ String | Double | Long | Timestamp, Long] = js.native
    
    /* CompleteClass */
    override def eq(other: String): Boolean = js.native
    /* CompleteClass */
    override def eq(other: Double): Boolean = js.native
    /* CompleteClass */
    override def eq(other: Long): Boolean = js.native
    /* CompleteClass */
    override def eq(other: Timestamp): Boolean = js.native
    /* CompleteClass */
    @JSName("eq")
    var eq_Original: js.Function1[/* other */ String | Double | Long | Timestamp, Boolean] = js.native
    
    /* CompleteClass */
    override def equals(other: String): Boolean = js.native
    /* CompleteClass */
    override def equals(other: Double): Boolean = js.native
    /* CompleteClass */
    override def equals(other: Long): Boolean = js.native
    /* CompleteClass */
    override def equals(other: Timestamp): Boolean = js.native
    /* CompleteClass */
    @JSName("equals")
    var equals_Original: js.Function1[/* other */ String | Double | Long | Timestamp, Boolean] = js.native
    
    /* CompleteClass */
    override def eqz(): Boolean = js.native
    /* CompleteClass */
    @JSName("eqz")
    var eqz_Original: js.Function0[Boolean] = js.native
    
    /* CompleteClass */
    override def ge(other: String): Boolean = js.native
    /* CompleteClass */
    override def ge(other: Double): Boolean = js.native
    /* CompleteClass */
    override def ge(other: Long): Boolean = js.native
    /* CompleteClass */
    override def ge(other: Timestamp): Boolean = js.native
    /* CompleteClass */
    @JSName("ge")
    var ge_Original: js.Function1[/* other */ String | Double | Long | Timestamp, Boolean] = js.native
    
    /* CompleteClass */
    override def getHighBits(): Double = js.native
    
    /* CompleteClass */
    override def getHighBitsUnsigned(): Double = js.native
    /* CompleteClass */
    @JSName("getHighBitsUnsigned")
    var getHighBitsUnsigned_Original: js.Function0[Double] = js.native
    
    /* CompleteClass */
    @JSName("getHighBits")
    var getHighBits_Original: js.Function0[Double] = js.native
    
    /* CompleteClass */
    override def getLowBits(): Double = js.native
    
    /* CompleteClass */
    override def getLowBitsUnsigned(): Double = js.native
    /* CompleteClass */
    @JSName("getLowBitsUnsigned")
    var getLowBitsUnsigned_Original: js.Function0[Double] = js.native
    
    /* CompleteClass */
    @JSName("getLowBits")
    var getLowBits_Original: js.Function0[Double] = js.native
    
    /* CompleteClass */
    override def getNumBitsAbs(): Double = js.native
    /* CompleteClass */
    @JSName("getNumBitsAbs")
    var getNumBitsAbs_Original: js.Function0[Double] = js.native
    
    /* CompleteClass */
    override def greaterThan(other: String): Boolean = js.native
    /* CompleteClass */
    override def greaterThan(other: Double): Boolean = js.native
    /* CompleteClass */
    override def greaterThan(other: Long): Boolean = js.native
    /* CompleteClass */
    override def greaterThan(other: Timestamp): Boolean = js.native
    
    /* CompleteClass */
    override def greaterThanOrEqual(other: String): Boolean = js.native
    /* CompleteClass */
    override def greaterThanOrEqual(other: Double): Boolean = js.native
    /* CompleteClass */
    override def greaterThanOrEqual(other: Long): Boolean = js.native
    /* CompleteClass */
    override def greaterThanOrEqual(other: Timestamp): Boolean = js.native
    /* CompleteClass */
    @JSName("greaterThanOrEqual")
    var greaterThanOrEqual_Original: js.Function1[/* other */ String | Double | Long | Timestamp, Boolean] = js.native
    
    /* CompleteClass */
    @JSName("greaterThan")
    var greaterThan_Original: js.Function1[/* other */ String | Double | Long | Timestamp, Boolean] = js.native
    
    /* CompleteClass */
    override def gt(other: String): Boolean = js.native
    /* CompleteClass */
    override def gt(other: Double): Boolean = js.native
    /* CompleteClass */
    override def gt(other: Long): Boolean = js.native
    /* CompleteClass */
    override def gt(other: Timestamp): Boolean = js.native
    /* CompleteClass */
    @JSName("gt")
    var gt_Original: js.Function1[/* other */ String | Double | Long | Timestamp, Boolean] = js.native
    
    /* CompleteClass */
    override def gte(other: String): Boolean = js.native
    /* CompleteClass */
    override def gte(other: Double): Boolean = js.native
    /* CompleteClass */
    override def gte(other: Long): Boolean = js.native
    /* CompleteClass */
    override def gte(other: Timestamp): Boolean = js.native
    /* CompleteClass */
    @JSName("gte")
    var gte_Original: js.Function1[/* other */ String | Double | Long | Timestamp, Boolean] = js.native
    
    /* CompleteClass */
    var high: Double = js.native
    
    /* CompleteClass */
    override def isEven(): Boolean = js.native
    /* CompleteClass */
    @JSName("isEven")
    var isEven_Original: js.Function0[Boolean] = js.native
    
    /* CompleteClass */
    override def isNegative(): Boolean = js.native
    /* CompleteClass */
    @JSName("isNegative")
    var isNegative_Original: js.Function0[Boolean] = js.native
    
    /* CompleteClass */
    override def isOdd(): Boolean = js.native
    /* CompleteClass */
    @JSName("isOdd")
    var isOdd_Original: js.Function0[Boolean] = js.native
    
    /* CompleteClass */
    override def isPositive(): Boolean = js.native
    /* CompleteClass */
    @JSName("isPositive")
    var isPositive_Original: js.Function0[Boolean] = js.native
    
    /* CompleteClass */
    override def isZero(): Boolean = js.native
    /* CompleteClass */
    @JSName("isZero")
    var isZero_Original: js.Function0[Boolean] = js.native
    
    /* CompleteClass */
    override def le(other: String): Boolean = js.native
    /* CompleteClass */
    override def le(other: Double): Boolean = js.native
    /* CompleteClass */
    override def le(other: Long): Boolean = js.native
    /* CompleteClass */
    override def le(other: Timestamp): Boolean = js.native
    /* CompleteClass */
    @JSName("le")
    var le_Original: js.Function1[/* other */ String | Double | Long | Timestamp, Boolean] = js.native
    
    /* CompleteClass */
    override def lessThan(other: String): Boolean = js.native
    /* CompleteClass */
    override def lessThan(other: Double): Boolean = js.native
    /* CompleteClass */
    override def lessThan(other: Long): Boolean = js.native
    /* CompleteClass */
    override def lessThan(other: Timestamp): Boolean = js.native
    
    /* CompleteClass */
    override def lessThanOrEqual(other: String): Boolean = js.native
    /* CompleteClass */
    override def lessThanOrEqual(other: Double): Boolean = js.native
    /* CompleteClass */
    override def lessThanOrEqual(other: Long): Boolean = js.native
    /* CompleteClass */
    override def lessThanOrEqual(other: Timestamp): Boolean = js.native
    /* CompleteClass */
    @JSName("lessThanOrEqual")
    var lessThanOrEqual_Original: js.Function1[/* other */ String | Double | Long | Timestamp, Boolean] = js.native
    
    /* CompleteClass */
    @JSName("lessThan")
    var lessThan_Original: js.Function1[/* other */ String | Double | Long | Timestamp, Boolean] = js.native
    
    /* CompleteClass */
    var low: Double = js.native
    
    /* CompleteClass */
    override def lt(other: String): Boolean = js.native
    /* CompleteClass */
    override def lt(other: Double): Boolean = js.native
    /* CompleteClass */
    override def lt(other: Long): Boolean = js.native
    /* CompleteClass */
    override def lt(other: Timestamp): Boolean = js.native
    /* CompleteClass */
    @JSName("lt")
    var lt_Original: js.Function1[/* other */ String | Double | Long | Timestamp, Boolean] = js.native
    
    /* CompleteClass */
    override def lte(other: String): Boolean = js.native
    /* CompleteClass */
    override def lte(other: Double): Boolean = js.native
    /* CompleteClass */
    override def lte(other: Long): Boolean = js.native
    /* CompleteClass */
    override def lte(other: Timestamp): Boolean = js.native
    /* CompleteClass */
    @JSName("lte")
    var lte_Original: js.Function1[/* other */ String | Double | Long | Timestamp, Boolean] = js.native
    
    /* CompleteClass */
    override def mod(divisor: String): Long = js.native
    /* CompleteClass */
    override def mod(divisor: Double): Long = js.native
    /* CompleteClass */
    override def mod(divisor: Long): Long = js.native
    /* CompleteClass */
    override def mod(divisor: Timestamp): Long = js.native
    /* CompleteClass */
    @JSName("mod")
    var mod_Original: js.Function1[/* divisor */ String | Double | Long | Timestamp, Long] = js.native
    
    /* CompleteClass */
    override def modulo(divisor: String): Long = js.native
    /* CompleteClass */
    override def modulo(divisor: Double): Long = js.native
    /* CompleteClass */
    override def modulo(divisor: Long): Long = js.native
    /* CompleteClass */
    override def modulo(divisor: Timestamp): Long = js.native
    /* CompleteClass */
    @JSName("modulo")
    var modulo_Original: js.Function1[/* divisor */ String | Double | Long | Timestamp, Long] = js.native
    
    /* CompleteClass */
    override def mul(multiplier: String): Long = js.native
    /* CompleteClass */
    override def mul(multiplier: Double): Long = js.native
    /* CompleteClass */
    override def mul(multiplier: Long): Long = js.native
    /* CompleteClass */
    override def mul(multiplier: Timestamp): Long = js.native
    /* CompleteClass */
    @JSName("mul")
    var mul_Original: js.Function1[/* multiplier */ String | Double | Long | Timestamp, Long] = js.native
    
    /* CompleteClass */
    override def multiply(multiplier: String): Long = js.native
    /* CompleteClass */
    override def multiply(multiplier: Double): Long = js.native
    /* CompleteClass */
    override def multiply(multiplier: Long): Long = js.native
    /* CompleteClass */
    override def multiply(multiplier: Timestamp): Long = js.native
    /* CompleteClass */
    @JSName("multiply")
    var multiply_Original: js.Function1[/* multiplier */ String | Double | Long | Timestamp, Long] = js.native
    
    /* CompleteClass */
    override def ne(other: String): Boolean = js.native
    /* CompleteClass */
    override def ne(other: Double): Boolean = js.native
    /* CompleteClass */
    override def ne(other: Long): Boolean = js.native
    /* CompleteClass */
    override def ne(other: Timestamp): Boolean = js.native
    /* CompleteClass */
    @JSName("ne")
    var ne_Original: js.Function1[/* other */ String | Double | Long | Timestamp, Boolean] = js.native
    
    /* CompleteClass */
    override def neg(): Long = js.native
    /* CompleteClass */
    @JSName("neg")
    var neg_Original: js.Function0[Long] = js.native
    
    /* CompleteClass */
    override def negate(): Long = js.native
    /* CompleteClass */
    @JSName("negate")
    var negate_Original: js.Function0[Long] = js.native
    
    /* CompleteClass */
    override def neq(other: String): Boolean = js.native
    /* CompleteClass */
    override def neq(other: Double): Boolean = js.native
    /* CompleteClass */
    override def neq(other: Long): Boolean = js.native
    /* CompleteClass */
    override def neq(other: Timestamp): Boolean = js.native
    /* CompleteClass */
    @JSName("neq")
    var neq_Original: js.Function1[/* other */ String | Double | Long | Timestamp, Boolean] = js.native
    
    /* CompleteClass */
    override def not(): Long = js.native
    
    /* CompleteClass */
    override def notEquals(other: String): Boolean = js.native
    /* CompleteClass */
    override def notEquals(other: Double): Boolean = js.native
    /* CompleteClass */
    override def notEquals(other: Long): Boolean = js.native
    /* CompleteClass */
    override def notEquals(other: Timestamp): Boolean = js.native
    /* CompleteClass */
    @JSName("notEquals")
    var notEquals_Original: js.Function1[/* other */ String | Double | Long | Timestamp, Boolean] = js.native
    
    /* CompleteClass */
    @JSName("not")
    var not_Original: js.Function0[Long] = js.native
    
    /* CompleteClass */
    override def or(other: String): Long = js.native
    /* CompleteClass */
    override def or(other: Double): Long = js.native
    /* CompleteClass */
    override def or(other: Long): Long = js.native
    /* CompleteClass */
    @JSName("or")
    var or_Original: js.Function1[/* other */ Double | String | Long, Long] = js.native
    
    /* CompleteClass */
    override def rem(divisor: String): Long = js.native
    /* CompleteClass */
    override def rem(divisor: Double): Long = js.native
    /* CompleteClass */
    override def rem(divisor: Long): Long = js.native
    /* CompleteClass */
    override def rem(divisor: Timestamp): Long = js.native
    /* CompleteClass */
    @JSName("rem")
    var rem_Original: js.Function1[/* divisor */ String | Double | Long | Timestamp, Long] = js.native
    
    /* CompleteClass */
    override def shiftLeft(numBits: Double): Long = js.native
    /* CompleteClass */
    override def shiftLeft(numBits: Long): Long = js.native
    /* CompleteClass */
    @JSName("shiftLeft")
    var shiftLeft_Original: js.Function1[/* numBits */ Double | Long, Long] = js.native
    
    /* CompleteClass */
    override def shiftRight(numBits: Double): Long = js.native
    /* CompleteClass */
    override def shiftRight(numBits: Long): Long = js.native
    
    /* CompleteClass */
    override def shiftRightUnsigned(numBits: Double): Long = js.native
    /* CompleteClass */
    override def shiftRightUnsigned(numBits: Long): Long = js.native
    /* CompleteClass */
    @JSName("shiftRightUnsigned")
    var shiftRightUnsigned_Original: js.Function1[/* numBits */ Long | Double, Long] = js.native
    
    /* CompleteClass */
    @JSName("shiftRight")
    var shiftRight_Original: js.Function1[/* numBits */ Double | Long, Long] = js.native
    
    /* CompleteClass */
    override def shl(numBits: Double): Long = js.native
    /* CompleteClass */
    override def shl(numBits: Long): Long = js.native
    /* CompleteClass */
    @JSName("shl")
    var shl_Original: js.Function1[/* numBits */ Double | Long, Long] = js.native
    
    /* CompleteClass */
    override def shr(numBits: Double): Long = js.native
    /* CompleteClass */
    override def shr(numBits: Long): Long = js.native
    /* CompleteClass */
    @JSName("shr")
    var shr_Original: js.Function1[/* numBits */ Double | Long, Long] = js.native
    
    /* CompleteClass */
    override def shr_u(numBits: Double): Long = js.native
    /* CompleteClass */
    override def shr_u(numBits: Long): Long = js.native
    /* CompleteClass */
    @JSName("shr_u")
    var shr_u_Original: js.Function1[/* numBits */ Double | Long, Long] = js.native
    
    /* CompleteClass */
    override def shru(numBits: Double): Long = js.native
    /* CompleteClass */
    override def shru(numBits: Long): Long = js.native
    /* CompleteClass */
    @JSName("shru")
    var shru_Original: js.Function1[/* numBits */ Double | Long, Long] = js.native
    
    /* CompleteClass */
    override def sub(subtrahend: String): Long = js.native
    /* CompleteClass */
    override def sub(subtrahend: Double): Long = js.native
    /* CompleteClass */
    override def sub(subtrahend: Long): Long = js.native
    /* CompleteClass */
    override def sub(subtrahend: Timestamp): Long = js.native
    /* CompleteClass */
    @JSName("sub")
    var sub_Original: js.Function1[/* subtrahend */ String | Double | Long | Timestamp, Long] = js.native
    
    /* CompleteClass */
    override def subtract(subtrahend: String): Long = js.native
    /* CompleteClass */
    override def subtract(subtrahend: Double): Long = js.native
    /* CompleteClass */
    override def subtract(subtrahend: Long): Long = js.native
    /* CompleteClass */
    override def subtract(subtrahend: Timestamp): Long = js.native
    /* CompleteClass */
    @JSName("subtract")
    var subtract_Original: js.Function1[/* subtrahend */ String | Double | Long | Timestamp, Long] = js.native
    
    /* CompleteClass */
    override def toBigInt(): js.BigInt = js.native
    /* CompleteClass */
    @JSName("toBigInt")
    var toBigInt_Original: js.Function0[js.BigInt] = js.native
    
    /* CompleteClass */
    override def toBytes(): js.Array[Double] = js.native
    /* CompleteClass */
    override def toBytes(le: Boolean): js.Array[Double] = js.native
    
    /* CompleteClass */
    override def toBytesBE(): js.Array[Double] = js.native
    /* CompleteClass */
    @JSName("toBytesBE")
    var toBytesBE_Original: js.Function0[js.Array[Double]] = js.native
    
    /* CompleteClass */
    override def toBytesLE(): js.Array[Double] = js.native
    /* CompleteClass */
    @JSName("toBytesLE")
    var toBytesLE_Original: js.Function0[js.Array[Double]] = js.native
    
    /* CompleteClass */
    @JSName("toBytes")
    var toBytes_Original: js.Function1[/* le */ js.UndefOr[Boolean], js.Array[Double]] = js.native
    
    /* CompleteClass */
    override def toInt(): Double = js.native
    /* CompleteClass */
    @JSName("toInt")
    var toInt_Original: js.Function0[Double] = js.native
    
    /* CompleteClass */
    override def toNumber(): Double = js.native
    /* CompleteClass */
    @JSName("toNumber")
    var toNumber_Original: js.Function0[Double] = js.native
    
    /* CompleteClass */
    override def toSigned(): Long = js.native
    /* CompleteClass */
    @JSName("toSigned")
    var toSigned_Original: js.Function0[Long] = js.native
    
    /* CompleteClass */
    override def toString(radix: Double): String = js.native
    /* CompleteClass */
    @JSName("toString")
    var toString_Original: js.Function1[/* radix */ js.UndefOr[Double], String] = js.native
    
    /* CompleteClass */
    override def toUnsigned(): Long = js.native
    /* CompleteClass */
    @JSName("toUnsigned")
    var toUnsigned_Original: js.Function0[Long] = js.native
    
    /* CompleteClass */
    var unsigned: Boolean = js.native
    
    /* CompleteClass */
    override def xor(other: String): Long = js.native
    /* CompleteClass */
    override def xor(other: Double): Long = js.native
    /* CompleteClass */
    override def xor(other: Long): Long = js.native
    /* CompleteClass */
    @JSName("xor")
    var xor_Original: js.Function1[/* other */ Long | Double | String, Long] = js.native
  }
  @JSImport("bson/lib/timestamp", "LongWithoutOverridesClass")
  @js.native
  val LongWithoutOverridesClass: LongWithoutOverrides = js.native
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped new (low : unknown, high : number | boolean | undefined, unsigned : boolean | undefined): bson.anon.PinExcludekeyofLongTimestAdd */ @JSImport("bson/lib/timestamp", "Timestamp")
  @js.native
  open class Timestamp protected () extends StObject {
    /**
      * @param int - A 64-bit bigint representing the Timestamp.
      */
    def this(int: js.BigInt) = this()
    /**
      * @param long - A 64-bit Long representing the Timestamp.
      */
    def this(long: Long) = this()
    /**
      * @param value - A pair of two values indicating timestamp and increment.
      */
    def this(value: I) = this()
    
    def _bsontype: typings.bson.bsonStrings.Timestamp = js.native
    
    def inspect(): String = js.native
    
    /** @internal */
    def toExtendedJSON(): TimestampExtended = js.native
    
    def toJSON(): typings.bson.anon.Timestamp = js.native
  }
  /* static members */
  object Timestamp {
    
    @JSImport("bson/lib/timestamp", "Timestamp")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("bson/lib/timestamp", "Timestamp.MAX_VALUE")
    @js.native
    val MAX_VALUE: Long = js.native
    
    /**
      * Returns a Timestamp for the given high and low bits. Each is assumed to use 32 bits.
      *
      * @param lowBits - the low 32-bits.
      * @param highBits - the high 32-bits.
      */
    inline def fromBits(lowBits: Double, highBits: Double): Timestamp = (^.asInstanceOf[js.Dynamic].applyDynamic("fromBits")(lowBits.asInstanceOf[js.Any], highBits.asInstanceOf[js.Any])).asInstanceOf[Timestamp]
    
    /** @internal */
    inline def fromExtendedJSON(doc: TimestampExtended): Timestamp = ^.asInstanceOf[js.Dynamic].applyDynamic("fromExtendedJSON")(doc.asInstanceOf[js.Any]).asInstanceOf[Timestamp]
    
    /** Returns a Timestamp represented by the given (32-bit) integer value. */
    inline def fromInt(value: Double): Timestamp = ^.asInstanceOf[js.Dynamic].applyDynamic("fromInt")(value.asInstanceOf[js.Any]).asInstanceOf[Timestamp]
    
    /** Returns a Timestamp representing the given number value, provided that it is a finite number. Otherwise, zero is returned. */
    inline def fromNumber(value: Double): Timestamp = ^.asInstanceOf[js.Dynamic].applyDynamic("fromNumber")(value.asInstanceOf[js.Any]).asInstanceOf[Timestamp]
    
    /**
      * Returns a Timestamp from the given string, optionally using the given radix.
      *
      * @param str - the textual representation of the Timestamp.
      * @param optRadix - the radix in which the text is written.
      */
    inline def fromString(str: String, optRadix: Double): Timestamp = (^.asInstanceOf[js.Dynamic].applyDynamic("fromString")(str.asInstanceOf[js.Any], optRadix.asInstanceOf[js.Any])).asInstanceOf[Timestamp]
  }
  
  type LongWithoutOverrides = Instantiable3[
    /* low */ Any, 
    /* high */ js.UndefOr[Double | Boolean], 
    /* unsigned */ js.UndefOr[Boolean], 
    PinExcludekeyofLongTimestAdd
  ]
  
  trait TimestampExtended extends StObject {
    
    @JSName("$timestamp")
    var $timestamp: I
  }
  object TimestampExtended {
    
    inline def apply($timestamp: I): TimestampExtended = {
      val __obj = js.Dynamic.literal($timestamp = $timestamp.asInstanceOf[js.Any])
      __obj.asInstanceOf[TimestampExtended]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TimestampExtended] (val x: Self) extends AnyVal {
      
      inline def set$timestamp(value: I): Self = StObject.set(x, "$timestamp", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.bson.bsonStrings._bsontype
    - typings.bson.bsonStrings.toExtendedJSON
    - typings.bson.bsonStrings.fromExtendedJSON
    - typings.bson.bsonStrings.inspect
  */
  trait TimestampOverrides extends StObject
  object TimestampOverrides {
    
    inline def _bsontype: typings.bson.bsonStrings._bsontype = "_bsontype".asInstanceOf[typings.bson.bsonStrings._bsontype]
    
    inline def fromExtendedJSON: typings.bson.bsonStrings.fromExtendedJSON = "fromExtendedJSON".asInstanceOf[typings.bson.bsonStrings.fromExtendedJSON]
    
    inline def inspect: typings.bson.bsonStrings.inspect = "inspect".asInstanceOf[typings.bson.bsonStrings.inspect]
    
    inline def toExtendedJSON: typings.bson.bsonStrings.toExtendedJSON = "toExtendedJSON".asInstanceOf[typings.bson.bsonStrings.toExtendedJSON]
  }
}
