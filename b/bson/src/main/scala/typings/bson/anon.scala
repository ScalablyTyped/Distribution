package typings.bson

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.Instantiable3
import typings.bson.bsonBooleans.`false`
import typings.bson.bsonBooleans.`true`
import typings.bson.bsonNumbers.`-1`
import typings.bson.bsonNumbers.`0`
import typings.bson.bsonNumbers.`1`
import typings.bson.mod.BSONRegExp
import typings.bson.mod.Binary
import typings.bson.mod.BinarySequence
import typings.bson.mod.Decimal128
import typings.bson.mod.Document
import typings.bson.mod.EJSON.SerializableTypes
import typings.bson.mod.EJSONOptions
import typings.bson.mod.Long
import typings.bson.mod.ObjectId
import typings.bson.mod.ObjectIdLike
import typings.bson.mod.UUID
import typings.buffer.mod.Buffer
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Base64 extends StObject {
    
    var base64: String
    
    var subType: String
  }
  object Base64 {
    
    inline def apply(base64: String, subType: String): Base64 = {
      val __obj = js.Dynamic.literal(base64 = base64.asInstanceOf[js.Any], subType = subType.asInstanceOf[js.Any])
      __obj.asInstanceOf[Base64]
    }
    
    extension [Self <: Base64](x: Self) {
      
      inline def setBase64(value: String): Self = StObject.set(x, "base64", value.asInstanceOf[js.Any])
      
      inline def setSubType(value: String): Self = StObject.set(x, "subType", value.asInstanceOf[js.Any])
    }
  }
  
  trait Code extends StObject {
    
    var code: String | js.Function
    
    var scope: js.UndefOr[Document] = js.undefined
  }
  object Code {
    
    inline def apply(code: String | js.Function): Code = {
      val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any])
      __obj.asInstanceOf[Code]
    }
    
    extension [Self <: Code](x: Self) {
      
      inline def setCode(value: String | js.Function): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
      
      inline def setScope(value: Document): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
      
      inline def setScopeUndefined: Self = StObject.set(x, "scope", js.undefined)
    }
  }
  
  trait High extends StObject {
    
    var high: Double
    
    var low: Double
    
    var unsigned: js.UndefOr[Boolean] = js.undefined
  }
  object High {
    
    inline def apply(high: Double, low: Double): High = {
      val __obj = js.Dynamic.literal(high = high.asInstanceOf[js.Any], low = low.asInstanceOf[js.Any])
      __obj.asInstanceOf[High]
    }
    
    extension [Self <: High](x: Self) {
      
      inline def setHigh(value: Double): Self = StObject.set(x, "high", value.asInstanceOf[js.Any])
      
      inline def setLow(value: Double): Self = StObject.set(x, "low", value.asInstanceOf[js.Any])
      
      inline def setUnsigned(value: Boolean): Self = StObject.set(x, "unsigned", value.asInstanceOf[js.Any])
      
      inline def setUnsignedUndefined: Self = StObject.set(x, "unsigned", js.undefined)
    }
  }
  
  trait I extends StObject {
    
    var i: Double
    
    var t: Double
  }
  object I {
    
    inline def apply(i: Double, t: Double): I = {
      val __obj = js.Dynamic.literal(i = i.asInstanceOf[js.Any], t = t.asInstanceOf[js.Any])
      __obj.asInstanceOf[I]
    }
    
    extension [Self <: I](x: Self) {
      
      inline def setI(value: Double): Self = StObject.set(x, "i", value.asInstanceOf[js.Any])
      
      inline def setT(value: Double): Self = StObject.set(x, "t", value.asInstanceOf[js.Any])
    }
  }
  
  trait NumberLong extends StObject {
    
    @JSName("$numberLong")
    var $numberLong: String
  }
  object NumberLong {
    
    inline def apply($numberLong: String): NumberLong = {
      val __obj = js.Dynamic.literal($numberLong = $numberLong.asInstanceOf[js.Any])
      __obj.asInstanceOf[NumberLong]
    }
    
    extension [Self <: NumberLong](x: Self) {
      
      inline def set$numberLong(value: String): Self = StObject.set(x, "$numberLong", value.asInstanceOf[js.Any])
    }
  }
  
  trait Options extends StObject {
    
    var options: String
    
    var pattern: String
  }
  object Options {
    
    inline def apply(options: String, pattern: String): Options = {
      val __obj = js.Dynamic.literal(options = options.asInstanceOf[js.Any], pattern = pattern.asInstanceOf[js.Any])
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setOptions(value: String): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      inline def setPattern(value: String): Self = StObject.set(x, "pattern", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined {[ P in std.Exclude<keyof bson.bson.Long, bson.bson.TimestampOverrides> ]: bson.bson.Long[P]} */
  trait PinExcludekeyofLongTimest extends StObject {
    
    var MAX_UNSIGNED_VALUE: js.UndefOr[Any] = js.undefined
    
    var MAX_VALUE: js.UndefOr[Any] = js.undefined
    
    var MIN_VALUE: js.UndefOr[Any] = js.undefined
    
    var NEG_ONE: js.UndefOr[Any] = js.undefined
    
    var ONE: js.UndefOr[Any] = js.undefined
    
    var TWO_PWR_24: js.UndefOr[Any] = js.undefined
    
    var UONE: js.UndefOr[Any] = js.undefined
    
    var UZERO: js.UndefOr[Any] = js.undefined
    
    var ZERO: js.UndefOr[Any] = js.undefined
    
    var __isLong__ : `true`
    
    def add(addend: String): Long
    def add(addend: Double): Long
    def add(addend: Long): Long
    def add(addend: typings.bson.mod.Timestamp): Long
    @JSName("add")
    var add_Original: js.Function1[/* addend */ String | Double | Long | typings.bson.mod.Timestamp, Long]
    
    def and(other: String): Long
    def and(other: Double): Long
    def and(other: Long): Long
    def and(other: typings.bson.mod.Timestamp): Long
    @JSName("and")
    var and_Original: js.Function1[/* other */ String | Double | Long | typings.bson.mod.Timestamp, Long]
    
    def comp(other: String): `0` | `1` | `-1`
    def comp(other: Double): `0` | `1` | `-1`
    def comp(other: Long): `0` | `1` | `-1`
    def comp(other: typings.bson.mod.Timestamp): `0` | `1` | `-1`
    @JSName("comp")
    var comp_Original: js.Function1[/* other */ String | Double | Long | typings.bson.mod.Timestamp, `0` | `1` | `-1`]
    
    def compare(other: String): `0` | `1` | `-1`
    def compare(other: Double): `0` | `1` | `-1`
    def compare(other: Long): `0` | `1` | `-1`
    def compare(other: typings.bson.mod.Timestamp): `0` | `1` | `-1`
    @JSName("compare")
    var compare_Original: js.Function1[/* other */ String | Double | Long | typings.bson.mod.Timestamp, `0` | `1` | `-1`]
    
    @JSName("constructor")
    var constructor_Original: js.Function3[
        /* low */ js.UndefOr[Double | js.BigInt | String], 
        /* high */ js.UndefOr[Double | Boolean], 
        /* unsigned */ js.UndefOr[Boolean], 
        Any
      ]
    
    def div(divisor: String): Long
    def div(divisor: Double): Long
    def div(divisor: Long): Long
    def div(divisor: typings.bson.mod.Timestamp): Long
    @JSName("div")
    var div_Original: js.Function1[/* divisor */ String | Double | Long | typings.bson.mod.Timestamp, Long]
    
    def divide(divisor: String): Long
    def divide(divisor: Double): Long
    def divide(divisor: Long): Long
    def divide(divisor: typings.bson.mod.Timestamp): Long
    @JSName("divide")
    var divide_Original: js.Function1[/* divisor */ String | Double | Long | typings.bson.mod.Timestamp, Long]
    
    def eq(other: String): Boolean
    def eq(other: Double): Boolean
    def eq(other: Long): Boolean
    def eq(other: typings.bson.mod.Timestamp): Boolean
    @JSName("eq")
    var eq_Original: js.Function1[/* other */ String | Double | Long | typings.bson.mod.Timestamp, Boolean]
    
    def equals(other: String): Boolean
    def equals(other: Double): Boolean
    def equals(other: Long): Boolean
    def equals(other: typings.bson.mod.Timestamp): Boolean
    @JSName("equals")
    var equals_Original: js.Function1[/* other */ String | Double | Long | typings.bson.mod.Timestamp, Boolean]
    
    def eqz(): Boolean
    @JSName("eqz")
    var eqz_Original: js.Function0[Boolean]
    
    var fromBigInt: js.UndefOr[Any] = js.undefined
    
    var fromBits: js.UndefOr[Any] = js.undefined
    
    var fromBytes: js.UndefOr[Any] = js.undefined
    
    var fromBytesBE: js.UndefOr[Any] = js.undefined
    
    var fromBytesLE: js.UndefOr[Any] = js.undefined
    
    var fromInt: js.UndefOr[Any] = js.undefined
    
    var fromNumber: js.UndefOr[Any] = js.undefined
    
    var fromString: js.UndefOr[Any] = js.undefined
    
    var fromValue: js.UndefOr[Any] = js.undefined
    
    def ge(other: String): Boolean
    def ge(other: Double): Boolean
    def ge(other: Long): Boolean
    def ge(other: typings.bson.mod.Timestamp): Boolean
    @JSName("ge")
    var ge_Original: js.Function1[/* other */ String | Double | Long | typings.bson.mod.Timestamp, Boolean]
    
    def getHighBits(): Double
    
    def getHighBitsUnsigned(): Double
    @JSName("getHighBitsUnsigned")
    var getHighBitsUnsigned_Original: js.Function0[Double]
    
    @JSName("getHighBits")
    var getHighBits_Original: js.Function0[Double]
    
    def getLowBits(): Double
    
    def getLowBitsUnsigned(): Double
    @JSName("getLowBitsUnsigned")
    var getLowBitsUnsigned_Original: js.Function0[Double]
    
    @JSName("getLowBits")
    var getLowBits_Original: js.Function0[Double]
    
    def getNumBitsAbs(): Double
    @JSName("getNumBitsAbs")
    var getNumBitsAbs_Original: js.Function0[Double]
    
    def greaterThan(other: String): Boolean
    def greaterThan(other: Double): Boolean
    def greaterThan(other: Long): Boolean
    def greaterThan(other: typings.bson.mod.Timestamp): Boolean
    
    def greaterThanOrEqual(other: String): Boolean
    def greaterThanOrEqual(other: Double): Boolean
    def greaterThanOrEqual(other: Long): Boolean
    def greaterThanOrEqual(other: typings.bson.mod.Timestamp): Boolean
    @JSName("greaterThanOrEqual")
    var greaterThanOrEqual_Original: js.Function1[/* other */ String | Double | Long | typings.bson.mod.Timestamp, Boolean]
    
    @JSName("greaterThan")
    var greaterThan_Original: js.Function1[/* other */ String | Double | Long | typings.bson.mod.Timestamp, Boolean]
    
    def gt(other: String): Boolean
    def gt(other: Double): Boolean
    def gt(other: Long): Boolean
    def gt(other: typings.bson.mod.Timestamp): Boolean
    @JSName("gt")
    var gt_Original: js.Function1[/* other */ String | Double | Long | typings.bson.mod.Timestamp, Boolean]
    
    def gte(other: String): Boolean
    def gte(other: Double): Boolean
    def gte(other: Long): Boolean
    def gte(other: typings.bson.mod.Timestamp): Boolean
    @JSName("gte")
    var gte_Original: js.Function1[/* other */ String | Double | Long | typings.bson.mod.Timestamp, Boolean]
    
    var high: Double
    
    def isEven(): Boolean
    @JSName("isEven")
    var isEven_Original: js.Function0[Boolean]
    
    var isLong: js.UndefOr[Any] = js.undefined
    
    def isNegative(): Boolean
    @JSName("isNegative")
    var isNegative_Original: js.Function0[Boolean]
    
    def isOdd(): Boolean
    @JSName("isOdd")
    var isOdd_Original: js.Function0[Boolean]
    
    def isPositive(): Boolean
    @JSName("isPositive")
    var isPositive_Original: js.Function0[Boolean]
    
    def isZero(): Boolean
    @JSName("isZero")
    var isZero_Original: js.Function0[Boolean]
    
    def le(other: String): Boolean
    def le(other: Double): Boolean
    def le(other: Long): Boolean
    def le(other: typings.bson.mod.Timestamp): Boolean
    @JSName("le")
    var le_Original: js.Function1[/* other */ String | Double | Long | typings.bson.mod.Timestamp, Boolean]
    
    def lessThan(other: String): Boolean
    def lessThan(other: Double): Boolean
    def lessThan(other: Long): Boolean
    def lessThan(other: typings.bson.mod.Timestamp): Boolean
    
    def lessThanOrEqual(other: String): Boolean
    def lessThanOrEqual(other: Double): Boolean
    def lessThanOrEqual(other: Long): Boolean
    def lessThanOrEqual(other: typings.bson.mod.Timestamp): Boolean
    @JSName("lessThanOrEqual")
    var lessThanOrEqual_Original: js.Function1[/* other */ String | Double | Long | typings.bson.mod.Timestamp, Boolean]
    
    @JSName("lessThan")
    var lessThan_Original: js.Function1[/* other */ String | Double | Long | typings.bson.mod.Timestamp, Boolean]
    
    var low: Double
    
    def lt(other: String): Boolean
    def lt(other: Double): Boolean
    def lt(other: Long): Boolean
    def lt(other: typings.bson.mod.Timestamp): Boolean
    @JSName("lt")
    var lt_Original: js.Function1[/* other */ String | Double | Long | typings.bson.mod.Timestamp, Boolean]
    
    def lte(other: String): Boolean
    def lte(other: Double): Boolean
    def lte(other: Long): Boolean
    def lte(other: typings.bson.mod.Timestamp): Boolean
    @JSName("lte")
    var lte_Original: js.Function1[/* other */ String | Double | Long | typings.bson.mod.Timestamp, Boolean]
    
    def mod(divisor: String): Long
    def mod(divisor: Double): Long
    def mod(divisor: Long): Long
    def mod(divisor: typings.bson.mod.Timestamp): Long
    @JSName("mod")
    var mod_Original: js.Function1[/* divisor */ String | Double | Long | typings.bson.mod.Timestamp, Long]
    
    def modulo(divisor: String): Long
    def modulo(divisor: Double): Long
    def modulo(divisor: Long): Long
    def modulo(divisor: typings.bson.mod.Timestamp): Long
    @JSName("modulo")
    var modulo_Original: js.Function1[/* divisor */ String | Double | Long | typings.bson.mod.Timestamp, Long]
    
    def mul(multiplier: String): Long
    def mul(multiplier: Double): Long
    def mul(multiplier: Long): Long
    def mul(multiplier: typings.bson.mod.Timestamp): Long
    @JSName("mul")
    var mul_Original: js.Function1[/* multiplier */ String | Double | Long | typings.bson.mod.Timestamp, Long]
    
    def multiply(multiplier: String): Long
    def multiply(multiplier: Double): Long
    def multiply(multiplier: Long): Long
    def multiply(multiplier: typings.bson.mod.Timestamp): Long
    @JSName("multiply")
    var multiply_Original: js.Function1[/* multiplier */ String | Double | Long | typings.bson.mod.Timestamp, Long]
    
    def ne(other: String): Boolean
    def ne(other: Double): Boolean
    def ne(other: Long): Boolean
    def ne(other: typings.bson.mod.Timestamp): Boolean
    @JSName("ne")
    var ne_Original: js.Function1[/* other */ String | Double | Long | typings.bson.mod.Timestamp, Boolean]
    
    def neg(): Long
    @JSName("neg")
    var neg_Original: js.Function0[Long]
    
    def negate(): Long
    @JSName("negate")
    var negate_Original: js.Function0[Long]
    
    def neq(other: String): Boolean
    def neq(other: Double): Boolean
    def neq(other: Long): Boolean
    def neq(other: typings.bson.mod.Timestamp): Boolean
    @JSName("neq")
    var neq_Original: js.Function1[/* other */ String | Double | Long | typings.bson.mod.Timestamp, Boolean]
    
    def not(): Long
    
    def notEquals(other: String): Boolean
    def notEquals(other: Double): Boolean
    def notEquals(other: Long): Boolean
    def notEquals(other: typings.bson.mod.Timestamp): Boolean
    @JSName("notEquals")
    var notEquals_Original: js.Function1[/* other */ String | Double | Long | typings.bson.mod.Timestamp, Boolean]
    
    @JSName("not")
    var not_Original: js.Function0[Long]
    
    def or(other: String): Long
    def or(other: Double): Long
    def or(other: Long): Long
    @JSName("or")
    var or_Original: js.Function1[/* other */ Double | String | Long, Long]
    
    def rem(divisor: String): Long
    def rem(divisor: Double): Long
    def rem(divisor: Long): Long
    def rem(divisor: typings.bson.mod.Timestamp): Long
    @JSName("rem")
    var rem_Original: js.Function1[/* divisor */ String | Double | Long | typings.bson.mod.Timestamp, Long]
    
    def shiftLeft(numBits: Double): Long
    def shiftLeft(numBits: Long): Long
    @JSName("shiftLeft")
    var shiftLeft_Original: js.Function1[/* numBits */ Double | Long, Long]
    
    def shiftRight(numBits: Double): Long
    def shiftRight(numBits: Long): Long
    
    def shiftRightUnsigned(numBits: Double): Long
    def shiftRightUnsigned(numBits: Long): Long
    @JSName("shiftRightUnsigned")
    var shiftRightUnsigned_Original: js.Function1[/* numBits */ Long | Double, Long]
    
    @JSName("shiftRight")
    var shiftRight_Original: js.Function1[/* numBits */ Double | Long, Long]
    
    def shl(numBits: Double): Long
    def shl(numBits: Long): Long
    @JSName("shl")
    var shl_Original: js.Function1[/* numBits */ Double | Long, Long]
    
    def shr(numBits: Double): Long
    def shr(numBits: Long): Long
    @JSName("shr")
    var shr_Original: js.Function1[/* numBits */ Double | Long, Long]
    
    def shr_u(numBits: Double): Long
    def shr_u(numBits: Long): Long
    @JSName("shr_u")
    var shr_u_Original: js.Function1[/* numBits */ Double | Long, Long]
    
    def shru(numBits: Double): Long
    def shru(numBits: Long): Long
    @JSName("shru")
    var shru_Original: js.Function1[/* numBits */ Double | Long, Long]
    
    def sub(subtrahend: String): Long
    def sub(subtrahend: Double): Long
    def sub(subtrahend: Long): Long
    def sub(subtrahend: typings.bson.mod.Timestamp): Long
    @JSName("sub")
    var sub_Original: js.Function1[/* subtrahend */ String | Double | Long | typings.bson.mod.Timestamp, Long]
    
    def subtract(subtrahend: String): Long
    def subtract(subtrahend: Double): Long
    def subtract(subtrahend: Long): Long
    def subtract(subtrahend: typings.bson.mod.Timestamp): Long
    @JSName("subtract")
    var subtract_Original: js.Function1[/* subtrahend */ String | Double | Long | typings.bson.mod.Timestamp, Long]
    
    def toBigInt(): js.BigInt
    @JSName("toBigInt")
    var toBigInt_Original: js.Function0[js.BigInt]
    
    def toBytes(): js.Array[Double]
    def toBytes(le: Boolean): js.Array[Double]
    
    def toBytesBE(): js.Array[Double]
    @JSName("toBytesBE")
    var toBytesBE_Original: js.Function0[js.Array[Double]]
    
    def toBytesLE(): js.Array[Double]
    @JSName("toBytesLE")
    var toBytesLE_Original: js.Function0[js.Array[Double]]
    
    @JSName("toBytes")
    var toBytes_Original: js.Function1[/* le */ js.UndefOr[Boolean], js.Array[Double]]
    
    def toInt(): Double
    @JSName("toInt")
    var toInt_Original: js.Function0[Double]
    
    def toNumber(): Double
    @JSName("toNumber")
    var toNumber_Original: js.Function0[Double]
    
    def toSigned(): Long
    @JSName("toSigned")
    var toSigned_Original: js.Function0[Long]
    
    def toString(radix: Double): String
    @JSName("toString")
    var toString_Original: js.Function1[/* radix */ js.UndefOr[Double], String]
    
    def toUnsigned(): Long
    @JSName("toUnsigned")
    var toUnsigned_Original: js.Function0[Long]
    
    var unsigned: Boolean
    
    def xor(other: String): Long
    def xor(other: Double): Long
    def xor(other: Long): Long
    @JSName("xor")
    var xor_Original: js.Function1[/* other */ Long | Double | String, Long]
  }
  object PinExcludekeyofLongTimest {
    
    inline def apply(
      add: /* addend */ String | Double | Long | typings.bson.mod.Timestamp => Long,
      and: /* other */ String | Double | Long | typings.bson.mod.Timestamp => Long,
      comp: /* other */ String | Double | Long | typings.bson.mod.Timestamp => `0` | `1` | `-1`,
      compare: /* other */ String | Double | Long | typings.bson.mod.Timestamp => `0` | `1` | `-1`,
      constructor: (/* low */ js.UndefOr[Double | js.BigInt | String], /* high */ js.UndefOr[Double | Boolean], /* unsigned */ js.UndefOr[Boolean]) => Any,
      div: /* divisor */ String | Double | Long | typings.bson.mod.Timestamp => Long,
      divide: /* divisor */ String | Double | Long | typings.bson.mod.Timestamp => Long,
      eq_ : /* other */ String | Double | Long | typings.bson.mod.Timestamp => Boolean,
      equals_ : /* other */ String | Double | Long | typings.bson.mod.Timestamp => Boolean,
      eqz: () => Boolean,
      ge: /* other */ String | Double | Long | typings.bson.mod.Timestamp => Boolean,
      getHighBits: () => Double,
      getHighBitsUnsigned: () => Double,
      getLowBits: () => Double,
      getLowBitsUnsigned: () => Double,
      getNumBitsAbs: () => Double,
      greaterThan: /* other */ String | Double | Long | typings.bson.mod.Timestamp => Boolean,
      greaterThanOrEqual: /* other */ String | Double | Long | typings.bson.mod.Timestamp => Boolean,
      gt: /* other */ String | Double | Long | typings.bson.mod.Timestamp => Boolean,
      gte: /* other */ String | Double | Long | typings.bson.mod.Timestamp => Boolean,
      high: Double,
      isEven: () => Boolean,
      isNegative: () => Boolean,
      isOdd: () => Boolean,
      isPositive: () => Boolean,
      isZero: () => Boolean,
      le: /* other */ String | Double | Long | typings.bson.mod.Timestamp => Boolean,
      lessThan: /* other */ String | Double | Long | typings.bson.mod.Timestamp => Boolean,
      lessThanOrEqual: /* other */ String | Double | Long | typings.bson.mod.Timestamp => Boolean,
      low: Double,
      lt: /* other */ String | Double | Long | typings.bson.mod.Timestamp => Boolean,
      lte: /* other */ String | Double | Long | typings.bson.mod.Timestamp => Boolean,
      mod: /* divisor */ String | Double | Long | typings.bson.mod.Timestamp => Long,
      modulo: /* divisor */ String | Double | Long | typings.bson.mod.Timestamp => Long,
      mul: /* multiplier */ String | Double | Long | typings.bson.mod.Timestamp => Long,
      multiply: /* multiplier */ String | Double | Long | typings.bson.mod.Timestamp => Long,
      ne_ : /* other */ String | Double | Long | typings.bson.mod.Timestamp => Boolean,
      neg: () => Long,
      negate: () => Long,
      neq: /* other */ String | Double | Long | typings.bson.mod.Timestamp => Boolean,
      not: () => Long,
      notEquals: /* other */ String | Double | Long | typings.bson.mod.Timestamp => Boolean,
      or: /* other */ Double | String | Long => Long,
      rem: /* divisor */ String | Double | Long | typings.bson.mod.Timestamp => Long,
      shiftLeft: /* numBits */ Double | Long => Long,
      shiftRight: /* numBits */ Double | Long => Long,
      shiftRightUnsigned: /* numBits */ Long | Double => Long,
      shl: /* numBits */ Double | Long => Long,
      shr: /* numBits */ Double | Long => Long,
      shr_u: /* numBits */ Double | Long => Long,
      shru: /* numBits */ Double | Long => Long,
      sub: /* subtrahend */ String | Double | Long | typings.bson.mod.Timestamp => Long,
      subtract: /* subtrahend */ String | Double | Long | typings.bson.mod.Timestamp => Long,
      toBigInt: () => js.BigInt,
      toBytes: /* le */ js.UndefOr[Boolean] => js.Array[Double],
      toBytesBE: () => js.Array[Double],
      toBytesLE: () => js.Array[Double],
      toInt: () => Double,
      toNumber: () => Double,
      toSigned: () => Long,
      toString_ : /* radix */ js.UndefOr[Double] => String,
      toUnsigned: () => Long,
      unsigned: Boolean,
      xor: /* other */ Long | Double | String => Long
    ): PinExcludekeyofLongTimest = {
      val __obj = js.Dynamic.literal(__isLong__ = true, add = js.Any.fromFunction1(add), and = js.Any.fromFunction1(and), comp = js.Any.fromFunction1(comp), compare = js.Any.fromFunction1(compare), constructor = js.Any.fromFunction3(constructor), div = js.Any.fromFunction1(div), divide = js.Any.fromFunction1(divide), eqz = js.Any.fromFunction0(eqz), ge = js.Any.fromFunction1(ge), getHighBits = js.Any.fromFunction0(getHighBits), getHighBitsUnsigned = js.Any.fromFunction0(getHighBitsUnsigned), getLowBits = js.Any.fromFunction0(getLowBits), getLowBitsUnsigned = js.Any.fromFunction0(getLowBitsUnsigned), getNumBitsAbs = js.Any.fromFunction0(getNumBitsAbs), greaterThan = js.Any.fromFunction1(greaterThan), greaterThanOrEqual = js.Any.fromFunction1(greaterThanOrEqual), gt = js.Any.fromFunction1(gt), gte = js.Any.fromFunction1(gte), high = high.asInstanceOf[js.Any], isEven = js.Any.fromFunction0(isEven), isNegative = js.Any.fromFunction0(isNegative), isOdd = js.Any.fromFunction0(isOdd), isPositive = js.Any.fromFunction0(isPositive), isZero = js.Any.fromFunction0(isZero), le = js.Any.fromFunction1(le), lessThan = js.Any.fromFunction1(lessThan), lessThanOrEqual = js.Any.fromFunction1(lessThanOrEqual), low = low.asInstanceOf[js.Any], lt = js.Any.fromFunction1(lt), lte = js.Any.fromFunction1(lte), mod = js.Any.fromFunction1(mod), modulo = js.Any.fromFunction1(modulo), mul = js.Any.fromFunction1(mul), multiply = js.Any.fromFunction1(multiply), neg = js.Any.fromFunction0(neg), negate = js.Any.fromFunction0(negate), neq = js.Any.fromFunction1(neq), not = js.Any.fromFunction0(not), notEquals = js.Any.fromFunction1(notEquals), or = js.Any.fromFunction1(or), rem = js.Any.fromFunction1(rem), shiftLeft = js.Any.fromFunction1(shiftLeft), shiftRight = js.Any.fromFunction1(shiftRight), shiftRightUnsigned = js.Any.fromFunction1(shiftRightUnsigned), shl = js.Any.fromFunction1(shl), shr = js.Any.fromFunction1(shr), shr_u = js.Any.fromFunction1(shr_u), shru = js.Any.fromFunction1(shru), sub = js.Any.fromFunction1(sub), subtract = js.Any.fromFunction1(subtract), toBigInt = js.Any.fromFunction0(toBigInt), toBytes = js.Any.fromFunction1(toBytes), toBytesBE = js.Any.fromFunction0(toBytesBE), toBytesLE = js.Any.fromFunction0(toBytesLE), toInt = js.Any.fromFunction0(toInt), toNumber = js.Any.fromFunction0(toNumber), toSigned = js.Any.fromFunction0(toSigned), toUnsigned = js.Any.fromFunction0(toUnsigned), unsigned = unsigned.asInstanceOf[js.Any], xor = js.Any.fromFunction1(xor))
      __obj.updateDynamic("eq")(js.Any.fromFunction1(eq_))
      __obj.updateDynamic("equals")(js.Any.fromFunction1(equals_))
      __obj.updateDynamic("ne")(js.Any.fromFunction1(ne_))
      __obj.updateDynamic("toString")(js.Any.fromFunction1(toString_))
      __obj.asInstanceOf[PinExcludekeyofLongTimest]
    }
    
    extension [Self <: PinExcludekeyofLongTimest](x: Self) {
      
      inline def setAdd(value: /* addend */ String | Double | Long | typings.bson.mod.Timestamp => Long): Self = StObject.set(x, "add", js.Any.fromFunction1(value))
      
      inline def setAnd(value: /* other */ String | Double | Long | typings.bson.mod.Timestamp => Long): Self = StObject.set(x, "and", js.Any.fromFunction1(value))
      
      inline def setComp(value: /* other */ String | Double | Long | typings.bson.mod.Timestamp => `0` | `1` | `-1`): Self = StObject.set(x, "comp", js.Any.fromFunction1(value))
      
      inline def setCompare(value: /* other */ String | Double | Long | typings.bson.mod.Timestamp => `0` | `1` | `-1`): Self = StObject.set(x, "compare", js.Any.fromFunction1(value))
      
      inline def setConstructor(
        value: (/* low */ js.UndefOr[Double | js.BigInt | String], /* high */ js.UndefOr[Double | Boolean], /* unsigned */ js.UndefOr[Boolean]) => Any
      ): Self = StObject.set(x, "constructor", js.Any.fromFunction3(value))
      
      inline def setDiv(value: /* divisor */ String | Double | Long | typings.bson.mod.Timestamp => Long): Self = StObject.set(x, "div", js.Any.fromFunction1(value))
      
      inline def setDivide(value: /* divisor */ String | Double | Long | typings.bson.mod.Timestamp => Long): Self = StObject.set(x, "divide", js.Any.fromFunction1(value))
      
      inline def setEq_(value: /* other */ String | Double | Long | typings.bson.mod.Timestamp => Boolean): Self = StObject.set(x, "eq", js.Any.fromFunction1(value))
      
      inline def setEquals_(value: /* other */ String | Double | Long | typings.bson.mod.Timestamp => Boolean): Self = StObject.set(x, "equals", js.Any.fromFunction1(value))
      
      inline def setEqz(value: () => Boolean): Self = StObject.set(x, "eqz", js.Any.fromFunction0(value))
      
      inline def setFromBigInt(value: Any): Self = StObject.set(x, "fromBigInt", value.asInstanceOf[js.Any])
      
      inline def setFromBigIntUndefined: Self = StObject.set(x, "fromBigInt", js.undefined)
      
      inline def setFromBits(value: Any): Self = StObject.set(x, "fromBits", value.asInstanceOf[js.Any])
      
      inline def setFromBitsUndefined: Self = StObject.set(x, "fromBits", js.undefined)
      
      inline def setFromBytes(value: Any): Self = StObject.set(x, "fromBytes", value.asInstanceOf[js.Any])
      
      inline def setFromBytesBE(value: Any): Self = StObject.set(x, "fromBytesBE", value.asInstanceOf[js.Any])
      
      inline def setFromBytesBEUndefined: Self = StObject.set(x, "fromBytesBE", js.undefined)
      
      inline def setFromBytesLE(value: Any): Self = StObject.set(x, "fromBytesLE", value.asInstanceOf[js.Any])
      
      inline def setFromBytesLEUndefined: Self = StObject.set(x, "fromBytesLE", js.undefined)
      
      inline def setFromBytesUndefined: Self = StObject.set(x, "fromBytes", js.undefined)
      
      inline def setFromInt(value: Any): Self = StObject.set(x, "fromInt", value.asInstanceOf[js.Any])
      
      inline def setFromIntUndefined: Self = StObject.set(x, "fromInt", js.undefined)
      
      inline def setFromNumber(value: Any): Self = StObject.set(x, "fromNumber", value.asInstanceOf[js.Any])
      
      inline def setFromNumberUndefined: Self = StObject.set(x, "fromNumber", js.undefined)
      
      inline def setFromString(value: Any): Self = StObject.set(x, "fromString", value.asInstanceOf[js.Any])
      
      inline def setFromStringUndefined: Self = StObject.set(x, "fromString", js.undefined)
      
      inline def setFromValue(value: Any): Self = StObject.set(x, "fromValue", value.asInstanceOf[js.Any])
      
      inline def setFromValueUndefined: Self = StObject.set(x, "fromValue", js.undefined)
      
      inline def setGe(value: /* other */ String | Double | Long | typings.bson.mod.Timestamp => Boolean): Self = StObject.set(x, "ge", js.Any.fromFunction1(value))
      
      inline def setGetHighBits(value: () => Double): Self = StObject.set(x, "getHighBits", js.Any.fromFunction0(value))
      
      inline def setGetHighBitsUnsigned(value: () => Double): Self = StObject.set(x, "getHighBitsUnsigned", js.Any.fromFunction0(value))
      
      inline def setGetLowBits(value: () => Double): Self = StObject.set(x, "getLowBits", js.Any.fromFunction0(value))
      
      inline def setGetLowBitsUnsigned(value: () => Double): Self = StObject.set(x, "getLowBitsUnsigned", js.Any.fromFunction0(value))
      
      inline def setGetNumBitsAbs(value: () => Double): Self = StObject.set(x, "getNumBitsAbs", js.Any.fromFunction0(value))
      
      inline def setGreaterThan(value: /* other */ String | Double | Long | typings.bson.mod.Timestamp => Boolean): Self = StObject.set(x, "greaterThan", js.Any.fromFunction1(value))
      
      inline def setGreaterThanOrEqual(value: /* other */ String | Double | Long | typings.bson.mod.Timestamp => Boolean): Self = StObject.set(x, "greaterThanOrEqual", js.Any.fromFunction1(value))
      
      inline def setGt(value: /* other */ String | Double | Long | typings.bson.mod.Timestamp => Boolean): Self = StObject.set(x, "gt", js.Any.fromFunction1(value))
      
      inline def setGte(value: /* other */ String | Double | Long | typings.bson.mod.Timestamp => Boolean): Self = StObject.set(x, "gte", js.Any.fromFunction1(value))
      
      inline def setHigh(value: Double): Self = StObject.set(x, "high", value.asInstanceOf[js.Any])
      
      inline def setIsEven(value: () => Boolean): Self = StObject.set(x, "isEven", js.Any.fromFunction0(value))
      
      inline def setIsLong(value: Any): Self = StObject.set(x, "isLong", value.asInstanceOf[js.Any])
      
      inline def setIsLongUndefined: Self = StObject.set(x, "isLong", js.undefined)
      
      inline def setIsNegative(value: () => Boolean): Self = StObject.set(x, "isNegative", js.Any.fromFunction0(value))
      
      inline def setIsOdd(value: () => Boolean): Self = StObject.set(x, "isOdd", js.Any.fromFunction0(value))
      
      inline def setIsPositive(value: () => Boolean): Self = StObject.set(x, "isPositive", js.Any.fromFunction0(value))
      
      inline def setIsZero(value: () => Boolean): Self = StObject.set(x, "isZero", js.Any.fromFunction0(value))
      
      inline def setLe(value: /* other */ String | Double | Long | typings.bson.mod.Timestamp => Boolean): Self = StObject.set(x, "le", js.Any.fromFunction1(value))
      
      inline def setLessThan(value: /* other */ String | Double | Long | typings.bson.mod.Timestamp => Boolean): Self = StObject.set(x, "lessThan", js.Any.fromFunction1(value))
      
      inline def setLessThanOrEqual(value: /* other */ String | Double | Long | typings.bson.mod.Timestamp => Boolean): Self = StObject.set(x, "lessThanOrEqual", js.Any.fromFunction1(value))
      
      inline def setLow(value: Double): Self = StObject.set(x, "low", value.asInstanceOf[js.Any])
      
      inline def setLt(value: /* other */ String | Double | Long | typings.bson.mod.Timestamp => Boolean): Self = StObject.set(x, "lt", js.Any.fromFunction1(value))
      
      inline def setLte(value: /* other */ String | Double | Long | typings.bson.mod.Timestamp => Boolean): Self = StObject.set(x, "lte", js.Any.fromFunction1(value))
      
      inline def setMAX_UNSIGNED_VALUE(value: Any): Self = StObject.set(x, "MAX_UNSIGNED_VALUE", value.asInstanceOf[js.Any])
      
      inline def setMAX_UNSIGNED_VALUEUndefined: Self = StObject.set(x, "MAX_UNSIGNED_VALUE", js.undefined)
      
      inline def setMAX_VALUE(value: Any): Self = StObject.set(x, "MAX_VALUE", value.asInstanceOf[js.Any])
      
      inline def setMAX_VALUEUndefined: Self = StObject.set(x, "MAX_VALUE", js.undefined)
      
      inline def setMIN_VALUE(value: Any): Self = StObject.set(x, "MIN_VALUE", value.asInstanceOf[js.Any])
      
      inline def setMIN_VALUEUndefined: Self = StObject.set(x, "MIN_VALUE", js.undefined)
      
      inline def setMod(value: /* divisor */ String | Double | Long | typings.bson.mod.Timestamp => Long): Self = StObject.set(x, "mod", js.Any.fromFunction1(value))
      
      inline def setModulo(value: /* divisor */ String | Double | Long | typings.bson.mod.Timestamp => Long): Self = StObject.set(x, "modulo", js.Any.fromFunction1(value))
      
      inline def setMul(value: /* multiplier */ String | Double | Long | typings.bson.mod.Timestamp => Long): Self = StObject.set(x, "mul", js.Any.fromFunction1(value))
      
      inline def setMultiply(value: /* multiplier */ String | Double | Long | typings.bson.mod.Timestamp => Long): Self = StObject.set(x, "multiply", js.Any.fromFunction1(value))
      
      inline def setNEG_ONE(value: Any): Self = StObject.set(x, "NEG_ONE", value.asInstanceOf[js.Any])
      
      inline def setNEG_ONEUndefined: Self = StObject.set(x, "NEG_ONE", js.undefined)
      
      inline def setNe_(value: /* other */ String | Double | Long | typings.bson.mod.Timestamp => Boolean): Self = StObject.set(x, "ne", js.Any.fromFunction1(value))
      
      inline def setNeg(value: () => Long): Self = StObject.set(x, "neg", js.Any.fromFunction0(value))
      
      inline def setNegate(value: () => Long): Self = StObject.set(x, "negate", js.Any.fromFunction0(value))
      
      inline def setNeq(value: /* other */ String | Double | Long | typings.bson.mod.Timestamp => Boolean): Self = StObject.set(x, "neq", js.Any.fromFunction1(value))
      
      inline def setNot(value: () => Long): Self = StObject.set(x, "not", js.Any.fromFunction0(value))
      
      inline def setNotEquals(value: /* other */ String | Double | Long | typings.bson.mod.Timestamp => Boolean): Self = StObject.set(x, "notEquals", js.Any.fromFunction1(value))
      
      inline def setONE(value: Any): Self = StObject.set(x, "ONE", value.asInstanceOf[js.Any])
      
      inline def setONEUndefined: Self = StObject.set(x, "ONE", js.undefined)
      
      inline def setOr(value: /* other */ Double | String | Long => Long): Self = StObject.set(x, "or", js.Any.fromFunction1(value))
      
      inline def setRem(value: /* divisor */ String | Double | Long | typings.bson.mod.Timestamp => Long): Self = StObject.set(x, "rem", js.Any.fromFunction1(value))
      
      inline def setShiftLeft(value: /* numBits */ Double | Long => Long): Self = StObject.set(x, "shiftLeft", js.Any.fromFunction1(value))
      
      inline def setShiftRight(value: /* numBits */ Double | Long => Long): Self = StObject.set(x, "shiftRight", js.Any.fromFunction1(value))
      
      inline def setShiftRightUnsigned(value: /* numBits */ Long | Double => Long): Self = StObject.set(x, "shiftRightUnsigned", js.Any.fromFunction1(value))
      
      inline def setShl(value: /* numBits */ Double | Long => Long): Self = StObject.set(x, "shl", js.Any.fromFunction1(value))
      
      inline def setShr(value: /* numBits */ Double | Long => Long): Self = StObject.set(x, "shr", js.Any.fromFunction1(value))
      
      inline def setShr_u(value: /* numBits */ Double | Long => Long): Self = StObject.set(x, "shr_u", js.Any.fromFunction1(value))
      
      inline def setShru(value: /* numBits */ Double | Long => Long): Self = StObject.set(x, "shru", js.Any.fromFunction1(value))
      
      inline def setSub(value: /* subtrahend */ String | Double | Long | typings.bson.mod.Timestamp => Long): Self = StObject.set(x, "sub", js.Any.fromFunction1(value))
      
      inline def setSubtract(value: /* subtrahend */ String | Double | Long | typings.bson.mod.Timestamp => Long): Self = StObject.set(x, "subtract", js.Any.fromFunction1(value))
      
      inline def setTWO_PWR_24(value: Any): Self = StObject.set(x, "TWO_PWR_24", value.asInstanceOf[js.Any])
      
      inline def setTWO_PWR_24Undefined: Self = StObject.set(x, "TWO_PWR_24", js.undefined)
      
      inline def setToBigInt(value: () => js.BigInt): Self = StObject.set(x, "toBigInt", js.Any.fromFunction0(value))
      
      inline def setToBytes(value: /* le */ js.UndefOr[Boolean] => js.Array[Double]): Self = StObject.set(x, "toBytes", js.Any.fromFunction1(value))
      
      inline def setToBytesBE(value: () => js.Array[Double]): Self = StObject.set(x, "toBytesBE", js.Any.fromFunction0(value))
      
      inline def setToBytesLE(value: () => js.Array[Double]): Self = StObject.set(x, "toBytesLE", js.Any.fromFunction0(value))
      
      inline def setToInt(value: () => Double): Self = StObject.set(x, "toInt", js.Any.fromFunction0(value))
      
      inline def setToNumber(value: () => Double): Self = StObject.set(x, "toNumber", js.Any.fromFunction0(value))
      
      inline def setToSigned(value: () => Long): Self = StObject.set(x, "toSigned", js.Any.fromFunction0(value))
      
      inline def setToString_(value: /* radix */ js.UndefOr[Double] => String): Self = StObject.set(x, "toString", js.Any.fromFunction1(value))
      
      inline def setToUnsigned(value: () => Long): Self = StObject.set(x, "toUnsigned", js.Any.fromFunction0(value))
      
      inline def setUONE(value: Any): Self = StObject.set(x, "UONE", value.asInstanceOf[js.Any])
      
      inline def setUONEUndefined: Self = StObject.set(x, "UONE", js.undefined)
      
      inline def setUZERO(value: Any): Self = StObject.set(x, "UZERO", value.asInstanceOf[js.Any])
      
      inline def setUZEROUndefined: Self = StObject.set(x, "UZERO", js.undefined)
      
      inline def setUnsigned(value: Boolean): Self = StObject.set(x, "unsigned", value.asInstanceOf[js.Any])
      
      inline def setXor(value: /* other */ Long | Double | String => Long): Self = StObject.set(x, "xor", js.Any.fromFunction1(value))
      
      inline def setZERO(value: Any): Self = StObject.set(x, "ZERO", value.asInstanceOf[js.Any])
      
      inline def setZEROUndefined: Self = StObject.set(x, "ZERO", js.undefined)
      
      inline def set__isLong__(value: `true`): Self = StObject.set(x, "__isLong__", value.asInstanceOf[js.Any])
    }
  }
  
  trait Timestamp extends StObject {
    
    @JSName("$timestamp")
    var $timestamp: String
  }
  object Timestamp {
    
    inline def apply($timestamp: String): Timestamp = {
      val __obj = js.Dynamic.literal($timestamp = $timestamp.asInstanceOf[js.Any])
      __obj.asInstanceOf[Timestamp]
    }
    
    extension [Self <: Timestamp](x: Self) {
      
      inline def set$timestamp(value: String): Self = StObject.set(x, "$timestamp", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait TypeofBSONRegExp
    extends StObject
       with Instantiable1[/* pattern */ String, BSONRegExp]
       with Instantiable2[/* pattern */ String, /* options */ String, BSONRegExp] {
    
    def parseOptions(): String = js.native
    def parseOptions(options: String): String = js.native
  }
  
  @js.native
  trait TypeofBinary
    extends StObject
       with Instantiable0[Binary]
       with Instantiable1[(/* buffer */ BinarySequence) | (/* buffer */ String), Binary]
       with Instantiable2[
          (/* buffer */ BinarySequence) | (/* buffer */ String) | (/* buffer */ Unit), 
          /* subType */ Double, 
          Binary
        ] {
    
    /* Excluded from this release type: BSON_BINARY_SUBTYPE_DEFAULT */
    /** Initial buffer default size */
    val BUFFER_SIZE: /* 256 */ Double = js.native
    
    /** Byte Array BSON type */
    val SUBTYPE_BYTE_ARRAY: /* 2 */ Double = js.native
    
    /** Column BSON type */
    val SUBTYPE_COLUMN: /* 7 */ Double = js.native
    
    /** Default BSON type */
    val SUBTYPE_DEFAULT: /* 0 */ Double = js.native
    
    /** Encrypted BSON type */
    val SUBTYPE_ENCRYPTED: /* 6 */ Double = js.native
    
    /** Function BSON type */
    val SUBTYPE_FUNCTION: /* 1 */ Double = js.native
    
    /** MD5 BSON type */
    val SUBTYPE_MD5: /* 5 */ Double = js.native
    
    /** User BSON type */
    val SUBTYPE_USER_DEFINED: /* 128 */ Double = js.native
    
    /** UUID BSON type */
    val SUBTYPE_UUID: /* 4 */ Double = js.native
    
    /** Deprecated UUID BSON type @deprecated Please use SUBTYPE_UUID */
    val SUBTYPE_UUID_OLD: /* 3 */ Double = js.native
  }
  
  @js.native
  trait TypeofDecimal128
    extends StObject
       with Instantiable1[(/* bytes */ Buffer) | (/* bytes */ String), Decimal128] {
    
    /**
      * Create a Decimal128 instance from a string representation
      *
      * @param representation - a numeric string representation.
      */
    def fromString(representation: String): Decimal128 = js.native
  }
  
  @js.native
  trait TypeofEJSON extends StObject {
    
    def deserialize(ejson: Document): SerializableTypes = js.native
    def deserialize(ejson: Document, options: typings.bson.mod.EJSON.Options): SerializableTypes = js.native
    
    def parse(text: String): SerializableTypes = js.native
    def parse(text: String, options: typings.bson.mod.EJSON.Options): SerializableTypes = js.native
    
    def serialize(value: SerializableTypes): Document = js.native
    def serialize(value: SerializableTypes, options: typings.bson.mod.EJSON.Options): Document = js.native
    
    def stringify(value: SerializableTypes): String = js.native
    def stringify(value: SerializableTypes, replacer: js.Array[Double | String]): String = js.native
    def stringify(value: SerializableTypes, replacer: js.Array[Double | String], space: String): String = js.native
    def stringify(
      value: SerializableTypes,
      replacer: js.Array[Double | String],
      space: String,
      options: typings.bson.mod.EJSON.Options
    ): String = js.native
    def stringify(value: SerializableTypes, replacer: js.Array[Double | String], space: Double): String = js.native
    def stringify(
      value: SerializableTypes,
      replacer: js.Array[Double | String],
      space: Double,
      options: typings.bson.mod.EJSON.Options
    ): String = js.native
    def stringify(
      value: SerializableTypes,
      replacer: js.Array[Double | String],
      space: Unit,
      options: typings.bson.mod.EJSON.Options
    ): String = js.native
    def stringify(
      value: SerializableTypes,
      replacer: js.ThisFunction2[/* this */ Any, /* key */ String, /* value */ Any, Any]
    ): String = js.native
    def stringify(
      value: SerializableTypes,
      replacer: js.ThisFunction2[/* this */ Any, /* key */ String, /* value */ Any, Any],
      space: String
    ): String = js.native
    def stringify(
      value: SerializableTypes,
      replacer: js.ThisFunction2[/* this */ Any, /* key */ String, /* value */ Any, Any],
      space: String,
      options: typings.bson.mod.EJSON.Options
    ): String = js.native
    def stringify(
      value: SerializableTypes,
      replacer: js.ThisFunction2[/* this */ Any, /* key */ String, /* value */ Any, Any],
      space: Double
    ): String = js.native
    def stringify(
      value: SerializableTypes,
      replacer: js.ThisFunction2[/* this */ Any, /* key */ String, /* value */ Any, Any],
      space: Double,
      options: typings.bson.mod.EJSON.Options
    ): String = js.native
    def stringify(
      value: SerializableTypes,
      replacer: js.ThisFunction2[/* this */ Any, /* key */ String, /* value */ Any, Any],
      space: Unit,
      options: typings.bson.mod.EJSON.Options
    ): String = js.native
    def stringify(value: SerializableTypes, replacer: Unit, space: String): String = js.native
    def stringify(value: SerializableTypes, replacer: Unit, space: String, options: typings.bson.mod.EJSON.Options): String = js.native
    def stringify(value: SerializableTypes, replacer: Unit, space: Double): String = js.native
    def stringify(value: SerializableTypes, replacer: Unit, space: Double, options: typings.bson.mod.EJSON.Options): String = js.native
    def stringify(value: SerializableTypes, replacer: Unit, space: Unit, options: typings.bson.mod.EJSON.Options): String = js.native
    def stringify(value: SerializableTypes, replacer: typings.bson.mod.EJSON.Options): String = js.native
    def stringify(value: SerializableTypes, replacer: typings.bson.mod.EJSON.Options, space: String): String = js.native
    def stringify(
      value: SerializableTypes,
      replacer: typings.bson.mod.EJSON.Options,
      space: String,
      options: typings.bson.mod.EJSON.Options
    ): String = js.native
    def stringify(value: SerializableTypes, replacer: typings.bson.mod.EJSON.Options, space: Double): String = js.native
    def stringify(
      value: SerializableTypes,
      replacer: typings.bson.mod.EJSON.Options,
      space: Double,
      options: typings.bson.mod.EJSON.Options
    ): String = js.native
    def stringify(
      value: SerializableTypes,
      replacer: typings.bson.mod.EJSON.Options,
      space: Unit,
      options: typings.bson.mod.EJSON.Options
    ): String = js.native
  }
  
  @js.native
  trait TypeofLong
    extends StObject
       with Instantiable0[Long]
       with Instantiable1[(/* low */ js.BigInt) | (/* low */ Double) | (/* low */ String), Long]
       with Instantiable2[
          (/* low */ js.BigInt) | (/* low */ Double) | (/* low */ String) | (/* low */ Unit), 
          (/* high */ Boolean) | (/* high */ Double), 
          Long
        ]
       with Instantiable3[
          (/* low */ js.BigInt) | (/* low */ Double) | (/* low */ String) | (/* low */ Unit), 
          (/* high */ Boolean) | (/* high */ Double) | (/* high */ Unit), 
          /* unsigned */ Boolean, 
          Long
        ] {
    
    /** Maximum unsigned value. */
    var MAX_UNSIGNED_VALUE: Long = js.native
    
    /** Maximum signed value. */
    var MAX_VALUE: Long = js.native
    
    /** Minimum signed value. */
    var MIN_VALUE: Long = js.native
    
    /** Signed negative one. */
    var NEG_ONE: Long = js.native
    
    /** Signed one. */
    var ONE: Long = js.native
    
    var TWO_PWR_24: Long = js.native
    
    /** Unsigned one. */
    var UONE: Long = js.native
    
    /** Unsigned zero. */
    var UZERO: Long = js.native
    
    /** Signed zero */
    var ZERO: Long = js.native
    
    /**
      * Returns a Long representing the given value, provided that it is a finite number. Otherwise, zero is returned.
      * @param value - The number in question
      * @param unsigned - Whether unsigned or not, defaults to signed
      * @returns The corresponding Long value
      */
    def fromBigInt(value: js.BigInt): Long = js.native
    def fromBigInt(value: js.BigInt, unsigned: Boolean): Long = js.native
    
    /**
      * Returns a Long representing the 64 bit integer that comes by concatenating the given low and high bits.
      * Each is assumed to use 32 bits.
      * @param lowBits - The low 32 bits
      * @param highBits - The high 32 bits
      * @param unsigned - Whether unsigned or not, defaults to signed
      * @returns The corresponding Long value
      */
    def fromBits(lowBits: Double, highBits: Double): Long = js.native
    def fromBits(lowBits: Double, highBits: Double, unsigned: Boolean): Long = js.native
    
    /**
      * Creates a Long from its byte representation.
      * @param bytes - Byte representation
      * @param unsigned - Whether unsigned or not, defaults to signed
      * @param le - Whether little or big endian, defaults to big endian
      * @returns The corresponding Long value
      */
    def fromBytes(bytes: js.Array[Double]): Long = js.native
    def fromBytes(bytes: js.Array[Double], unsigned: Boolean): Long = js.native
    def fromBytes(bytes: js.Array[Double], unsigned: Boolean, le: Boolean): Long = js.native
    def fromBytes(bytes: js.Array[Double], unsigned: Unit, le: Boolean): Long = js.native
    
    /**
      * Creates a Long from its big endian byte representation.
      * @param bytes - Big endian byte representation
      * @param unsigned - Whether unsigned or not, defaults to signed
      * @returns The corresponding Long value
      */
    def fromBytesBE(bytes: js.Array[Double]): Long = js.native
    def fromBytesBE(bytes: js.Array[Double], unsigned: Boolean): Long = js.native
    
    /**
      * Creates a Long from its little endian byte representation.
      * @param bytes - Little endian byte representation
      * @param unsigned - Whether unsigned or not, defaults to signed
      * @returns The corresponding Long value
      */
    def fromBytesLE(bytes: js.Array[Double]): Long = js.native
    def fromBytesLE(bytes: js.Array[Double], unsigned: Boolean): Long = js.native
    
    def fromExtendedJSON(doc: NumberLong): Double | Long = js.native
    def fromExtendedJSON(doc: NumberLong, options: EJSONOptions): Double | Long = js.native
    
    /**
      * Returns a Long representing the given 32 bit integer value.
      * @param value - The 32 bit integer in question
      * @param unsigned - Whether unsigned or not, defaults to signed
      * @returns The corresponding Long value
      */
    def fromInt(value: Double): Long = js.native
    def fromInt(value: Double, unsigned: Boolean): Long = js.native
    
    /**
      * Returns a Long representing the given value, provided that it is a finite number. Otherwise, zero is returned.
      * @param value - The number in question
      * @param unsigned - Whether unsigned or not, defaults to signed
      * @returns The corresponding Long value
      */
    def fromNumber(value: Double): Long = js.native
    def fromNumber(value: Double, unsigned: Boolean): Long = js.native
    
    /**
      * Returns a Long representation of the given string, written using the specified radix.
      * @param str - The textual representation of the Long
      * @param unsigned - Whether unsigned or not, defaults to signed
      * @param radix - The radix in which the text is written (2-36), defaults to 10
      * @returns The corresponding Long value
      */
    def fromString(str: String): Long = js.native
    def fromString(str: String, unsigned: Boolean): Long = js.native
    def fromString(str: String, unsigned: Boolean, radix: Double): Long = js.native
    def fromString(str: String, unsigned: Unit, radix: Double): Long = js.native
    
    def fromValue(`val`: String): Long = js.native
    def fromValue(`val`: String, unsigned: Boolean): Long = js.native
    /**
      * Converts the specified value to a Long.
      * @param unsigned - Whether unsigned or not, defaults to signed
      */
    def fromValue(`val`: Double): Long = js.native
    def fromValue(`val`: Double, unsigned: Boolean): Long = js.native
    def fromValue(`val`: High): Long = js.native
    def fromValue(`val`: High, unsigned: Boolean): Long = js.native
    
    /**
      * Tests if the specified object is a Long.
      */
    def isLong(value: Any): /* is bson.bson.Long */ Boolean = js.native
  }
  
  @js.native
  trait TypeofObjectId extends StObject {
    
    /* Excluded from this release type: index */
    /* static member */
    var cacheHexString: Boolean = js.native
    
    /**
      * Creates an ObjectId from a hex string representation of an ObjectId.
      *
      * @param hexString - create a ObjectId from a passed in 24 character hexstring.
      */
    /* static member */
    def createFromHexString(hexString: String): ObjectId = js.native
    
    /* Excluded from this release type: createPk */
    /**
      * Creates an ObjectId from a second based number, with the rest of the ObjectId zeroed out. Used for comparisons or sorting the ObjectId.
      *
      * @param time - an integer number representing a number of seconds.
      */
    /* static member */
    def createFromTime(time: Double): ObjectId = js.native
    
    /* Excluded from this release type: getInc */
    /**
      * Generate a 12 byte id buffer used in ObjectId's
      *
      * @param time - pass in a second based timestamp.
      */
    /* static member */
    def generate(): Buffer = js.native
    def generate(time: Double): Buffer = js.native
    
    /**
      * Checks if a value is a valid bson ObjectId
      *
      * @param id - ObjectId instance to validate.
      */
    /* static member */
    def isValid(id: String): Boolean = js.native
    def isValid(id: js.typedarray.Uint8Array): Boolean = js.native
    def isValid(id: Double): Boolean = js.native
    def isValid(id: ObjectId): Boolean = js.native
    def isValid(id: ObjectIdLike): Boolean = js.native
    def isValid(id: Buffer): Boolean = js.native
  }
  
  @js.native
  trait TypeofTimestamp
    extends StObject
       with Instantiable1[/* long */ Long, typings.bson.mod.Timestamp] {
    
    val MAX_VALUE: Long = js.native
    
    /**
      * Returns a Timestamp for the given high and low bits. Each is assumed to use 32 bits.
      *
      * @param lowBits - the low 32-bits.
      * @param highBits - the high 32-bits.
      */
    def fromBits(lowBits: Double, highBits: Double): typings.bson.mod.Timestamp = js.native
    
    /** Returns a Timestamp represented by the given (32-bit) integer value. */
    def fromInt(value: Double): typings.bson.mod.Timestamp = js.native
    
    /** Returns a Timestamp representing the given number value, provided that it is a finite number. Otherwise, zero is returned. */
    def fromNumber(value: Double): typings.bson.mod.Timestamp = js.native
    
    /**
      * Returns a Timestamp from the given string, optionally using the given radix.
      *
      * @param str - the textual representation of the Timestamp.
      * @param optRadix - the radix in which the text is written.
      */
    def fromString(str: String, optRadix: Double): typings.bson.mod.Timestamp = js.native
  }
  
  @js.native
  trait TypeofUUID
    extends StObject
       with Instantiable0[UUID]
       with Instantiable1[(/* input */ Buffer) | (/* input */ String) | (/* input */ UUID), UUID] {
    
    var cacheHexString: Boolean = js.native
    
    /**
      * Creates an UUID from a hex string representation of an UUID.
      * @param hexString - 32 or 36 character hex string (dashes excluded/included).
      */
    def createFromHexString(hexString: String): UUID = js.native
    
    /**
      * Generates a populated buffer containing a v4 uuid
      */
    def generate(): Buffer = js.native
    
    /**
      * Checks if a value is a valid bson UUID
      * @param input - UUID, string or Buffer to validate.
      */
    def isValid(input: String): Boolean = js.native
    def isValid(input: UUID): Boolean = js.native
    def isValid(input: Buffer): Boolean = js.native
  }
  
  trait Utf8 extends StObject {
    
    var utf8: Boolean | (Record[String, `true` | `false`])
  }
  object Utf8 {
    
    inline def apply(utf8: Boolean | (Record[String, `true` | `false`])): Utf8 = {
      val __obj = js.Dynamic.literal(utf8 = utf8.asInstanceOf[js.Any])
      __obj.asInstanceOf[Utf8]
    }
    
    extension [Self <: Utf8](x: Self) {
      
      inline def setUtf8(value: Boolean | (Record[String, `true` | `false`])): Self = StObject.set(x, "utf8", value.asInstanceOf[js.Any])
    }
  }
}
