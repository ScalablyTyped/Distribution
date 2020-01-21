package typings.bignumberJs.mod

import typings.bignumberJs.bignumberJsBooleans.`true`
import typings.bignumberJs.mod.BigNumber.Format
import typings.bignumberJs.mod.BigNumber.Instance
import typings.bignumberJs.mod.BigNumber.RoundingMode
import typings.bignumberJs.mod.BigNumber.Value
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("bignumber.js", "BigNumber")
@js.native
class BigNumber_ protected () extends Instance {
  /**
    * Returns a new instance of a BigNumber object with value `n`, where `n` is a numeric value in
    * the specified `base`, or base 10 if `base` is omitted or is `null` or `undefined`.
    *
    * ```ts
    * x = new BigNumber(123.4567)              // '123.4567'
    * // 'new' is optional
    * y = BigNumber(x)                         // '123.4567'
    * ```
    *
    * If `n` is a base 10 value it can be in normal (fixed-point) or exponential notation.
    * Values in other bases must be in normal notation. Values in any base can have fraction digits,
    * i.e. digits after the decimal point.
    *
    * ```ts
    * new BigNumber(43210)                     // '43210'
    * new BigNumber('4.321e+4')                // '43210'
    * new BigNumber('-735.0918e-430')          // '-7.350918e-428'
    * new BigNumber('123412421.234324', 5)     // '607236.557696'
    * ```
    *
    * Signed `0`, signed `Infinity` and `NaN` are supported.
    *
    * ```ts
    * new BigNumber('-Infinity')               // '-Infinity'
    * new BigNumber(NaN)                       // 'NaN'
    * new BigNumber(-0)                        // '0'
    * new BigNumber('.5')                      // '0.5'
    * new BigNumber('+2')                      // '2'
    * ```
    *
    * String values in hexadecimal literal form, e.g. `'0xff'`, are valid, as are string values with
    * the octal and binary prefixs `'0o'` and `'0b'`. String values in octal literal form without the
    * prefix will be interpreted as decimals, e.g. `'011'` is interpreted as 11, not 9.
    *
    * ```ts
    * new BigNumber(-10110100.1, 2)            // '-180.5'
    * new BigNumber('-0b10110100.1')           // '-180.5'
    * new BigNumber('ff.8', 16)                // '255.5'
    * new BigNumber('0xff.8')                  // '255.5'
    * ```
    *
    * If a base is specified, `n` is rounded according to the current `DECIMAL_PLACES` and
    * `ROUNDING_MODE` settings. This includes base 10, so don't include a `base` parameter for decimal
    * values unless this behaviour is desired.
    *
    * ```ts
    * BigNumber.config({ DECIMAL_PLACES: 5 })
    * new BigNumber(1.23456789)                // '1.23456789'
    * new BigNumber(1.23456789, 10)            // '1.23457'
    * ```
    *
    * An error is thrown if `base` is invalid.
    *
    * There is no limit to the number of digits of a value of type string (other than that of
    * JavaScript's maximum array size). See `RANGE` to set the maximum and minimum possible exponent
    * value of a BigNumber.
    *
    * ```ts
    * new BigNumber('5032485723458348569331745.33434346346912144534543')
    * new BigNumber('4.321e10000000')
    * ```
    *
    * BigNumber `NaN` is returned if `n` is invalid (unless `BigNumber.DEBUG` is `true`, see below).
    *
    * ```ts
    * new BigNumber('.1*')                    // 'NaN'
    * new BigNumber('blurgh')                 // 'NaN'
    * new BigNumber(9, 2)                     // 'NaN'
    * ```
    *
    * To aid in debugging, if `BigNumber.DEBUG` is `true` then an error will be thrown on an
    * invalid `n`. An error will also be thrown if `n` is of type number with more than 15
    * significant digits, as calling `toString` or `valueOf` on these numbers may not result in the
    * intended value.
    *
    * ```ts
    * console.log(823456789123456.3)          //  823456789123456.2
    * new BigNumber(823456789123456.3)        // '823456789123456.2'
    * BigNumber.DEBUG = true
    * // 'Error: Number has more than 15 significant digits'
    * new BigNumber(823456789123456.3)
    * // 'Error: Not a base 2 number'
    * new BigNumber(9, 2)
    * ```
    *
    * A BigNumber can also be created from an object literal.
    * Use `isBigNumber` to check that it is well-formed.
    *
    * ```ts
    * new BigNumber({ s: 1, e: 2, c: [ 777, 12300000000000 ], _isBigNumber: true })    // '777.123'
    * ```
    *
    * @param n A numeric value.
    * @param base The base of `n`, integer, 2 to 36 (or `ALPHABET.length`, see `ALPHABET`).
    */
  def this(n: Value) = this()
  def this(n: Value, base: Double) = this()
  /** Used internally to identify a BigNumber instance. */
  val _isBigNumber: `true` = js.native
  /** The coefficient of the value of this BigNumber, an array of base 1e14 integer numbers, or null. */
  /* CompleteClass */
  override val c: js.Array[Double] | Null = js.native
  /** The exponent of the value of this BigNumber, an integer number, -1000000000 to 1000000000, or null. */
  /* CompleteClass */
  override val e: Double | Null = js.native
  /** The sign of the value of this BigNumber, -1, 1, or null. */
  /* CompleteClass */
  override val s: Double | Null = js.native
  /**
    * Returns a BigNumber whose value is the absolute value, i.e. the magnitude, of the value of this
    * BigNumber.
    *
    * The return value is always exact and unrounded.
    *
    * ```ts
    * x = new BigNumber(-0.8)
    * x.abs()                     // '0.8'
    * ```
    */
  def abs(): BigNumber = js.native
  /**
    * Returns a BigNumber whose value is the absolute value, i.e. the magnitude, of the value of this
    * BigNumber.
    *
    * The return value is always exact and unrounded.
    *
    * ```ts
    * x = new BigNumber(-0.8)
    * x.absoluteValue()           // '0.8'
    * ```
    */
  def absoluteValue(): BigNumber = js.native
  /**
    *  Returns |                                                               |
    * :-------:|:--------------------------------------------------------------|
    *     1    | If the value of this BigNumber is greater than the value of `n`
    *    -1    | If the value of this BigNumber is less than the value of `n`
    *     0    | If this BigNumber and `n` have the same value
    *  `null`  | If the value of either this BigNumber or `n` is `NaN`
    *
    * ```ts
    *
    * x = new BigNumber(Infinity)
    * y = new BigNumber(5)
    * x.comparedTo(y)                 // 1
    * x.comparedTo(x.minus(1))        // 0
    * y.comparedTo(NaN)               // null
    * y.comparedTo('110', 2)          // -1
    * ```
    * @param n A numeric value.
    * @param [base] The base of n.
    */
  def comparedTo(n: Value): Double = js.native
  def comparedTo(n: Value, base: Double): Double = js.native
  /**
    * Returns a BigNumber whose value is the value of this BigNumber rounded by rounding mode
    * `roundingMode` to a maximum of `decimalPlaces` decimal places.
    *
    * If `decimalPlaces` is omitted, or is `null` or `undefined`, the return value is the number of
    * decimal places of the value of this BigNumber, or `null` if the value of this BigNumber is
    * ±`Infinity` or `NaN`.
    *
    * If `roundingMode` is omitted, or is `null` or `undefined`, `ROUNDING_MODE` is used.
    *
    * Throws if `decimalPlaces` or `roundingMode` is invalid.
    *
    * ```ts
    * x = new BigNumber(1234.56)
    * x.decimalPlaces()                      // 2
    * x.decimalPlaces(1)                     // '1234.6'
    * x.decimalPlaces(2)                     // '1234.56'
    * x.decimalPlaces(10)                    // '1234.56'
    * x.decimalPlaces(0, 1)                  // '1234'
    * x.decimalPlaces(0, 6)                  // '1235'
    * x.decimalPlaces(1, 1)                  // '1234.5'
    * x.decimalPlaces(1, BigNumber.ROUND_HALF_EVEN)     // '1234.6'
    * x                                      // '1234.56'
    * y = new BigNumber('9.9e-101')
    * y.decimalPlaces()                      // 102
    * ```
    *
    * @param [decimalPlaces] Decimal places, integer, 0 to 1e+9.
    * @param [roundingMode] Rounding mode, integer, 0 to 8.
    */
  def decimalPlaces(): Double = js.native
  def decimalPlaces(decimalPlaces: Double): BigNumber = js.native
  def decimalPlaces(decimalPlaces: Double, roundingMode: RoundingMode): BigNumber = js.native
  /**
    * Returns a BigNumber whose value is the value of this BigNumber divided by `n`, rounded
    * according to the current `DECIMAL_PLACES` and `ROUNDING_MODE` settings.
    *
    * ```ts
    * x = new BigNumber(355)
    * y = new BigNumber(113)
    * x.div(y)                    // '3.14159292035398230088'
    * x.div(5)                    // '71'
    * x.div(47, 16)               // '5'
    * ```
    *
    * @param n A numeric value.
    * @param [base] The base of n.
    */
  def div(n: Value): BigNumber = js.native
  def div(n: Value, base: Double): BigNumber = js.native
  /**
    * Returns a BigNumber whose value is the value of this BigNumber divided by `n`, rounded
    * according to the current `DECIMAL_PLACES` and `ROUNDING_MODE` settings.
    *
    * ```ts
    * x = new BigNumber(355)
    * y = new BigNumber(113)
    * x.dividedBy(y)                  // '3.14159292035398230088'
    * x.dividedBy(5)                  // '71'
    * x.dividedBy(47, 16)             // '5'
    * ```
    *
    * @param n A numeric value.
    * @param [base] The base of n.
    */
  def dividedBy(n: Value): BigNumber = js.native
  def dividedBy(n: Value, base: Double): BigNumber = js.native
  /**
    * Returns a BigNumber whose value is the integer part of dividing the value of this BigNumber by
    * `n`.
    *
    * ```ts
    * x = new BigNumber(5)
    * y = new BigNumber(3)
    * x.dividedToIntegerBy(y)              // '1'
    * x.dividedToIntegerBy(0.7)            // '7'
    * x.dividedToIntegerBy('0.f', 16)      // '5'
    * ```
    *
    * @param n A numeric value.
    * @param [base] The base of n.
    */
  def dividedToIntegerBy(n: Value): BigNumber = js.native
  def dividedToIntegerBy(n: Value, base: Double): BigNumber = js.native
  /**
    * Returns a BigNumber whose value is the value of this BigNumber rounded by rounding mode
    * `roundingMode` to a maximum of `decimalPlaces` decimal places.
    *
    * If `decimalPlaces` is omitted, or is `null` or `undefined`, the return value is the number of
    * decimal places of the value of this BigNumber, or `null` if the value of this BigNumber is
    * ±`Infinity` or `NaN`.
    *
    * If `roundingMode` is omitted, or is `null` or `undefined`, `ROUNDING_MODE` is used.
    *
    * Throws if `decimalPlaces` or `roundingMode` is invalid.
    *
    * ```ts
    * x = new BigNumber(1234.56)
    * x.dp()                                 // 2
    * x.dp(1)                                // '1234.6'
    * x.dp(2)                                // '1234.56'
    * x.dp(10)                               // '1234.56'
    * x.dp(0, 1)                             // '1234'
    * x.dp(0, 6)                             // '1235'
    * x.dp(1, 1)                             // '1234.5'
    * x.dp(1, BigNumber.ROUND_HALF_EVEN)     // '1234.6'
    * x                                      // '1234.56'
    * y = new BigNumber('9.9e-101')
    * y.dp()                                 // 102
    * ```
    *
    * @param [decimalPlaces] Decimal places, integer, 0 to 1e+9.
    * @param [roundingMode] Rounding mode, integer, 0 to 8.
    */
  def dp(): Double = js.native
  def dp(decimalPlaces: Double): BigNumber = js.native
  def dp(decimalPlaces: Double, roundingMode: RoundingMode): BigNumber = js.native
  /**
    * Returns `true` if the value of this BigNumber is equal to the value of `n`, otherwise returns
    * `false`.
    *
    * As with JavaScript, `NaN` does not equal `NaN`.
    *
    * ```ts
    * 0 === 1e-324                    // true
    * x = new BigNumber(0)
    * x.eq('1e-324')                  // false
    * BigNumber(-0).eq(x)             // true  ( -0 === 0 )
    * BigNumber(255).eq('ff', 16)     // true
    *
    * y = new BigNumber(NaN)
    * y.eq(NaN)                       // false
    * ```
    *
    * @param n A numeric value.
    * @param [base] The base of n.
    */
  def eq(n: Value): Boolean = js.native
  def eq(n: Value, base: Double): Boolean = js.native
  def exponentiatedBy(n: Double): BigNumber = js.native
  def exponentiatedBy(n: Double, m: Value): BigNumber = js.native
  /**
    * Returns a BigNumber whose value is the value of this BigNumber exponentiated by `n`, i.e.
    * raised to the power `n`, and optionally modulo a modulus `m`.
    *
    * If `n` is negative the result is rounded according to the current `DECIMAL_PLACES` and
    * `ROUNDING_MODE` settings.
    *
    * As the number of digits of the result of the power operation can grow so large so quickly,
    * e.g. 123.456**10000 has over 50000 digits, the number of significant digits calculated is
    * limited to the value of the `POW_PRECISION` setting (unless a modulus `m` is specified).
    *
    * By default `POW_PRECISION` is set to 0. This means that an unlimited number of significant
    * digits will be calculated, and that the method's performance will decrease dramatically for
    * larger exponents.
    *
    * If `m` is specified and the value of `m`, `n` and this BigNumber are integers and `n` is
    * positive, then a fast modular exponentiation algorithm is used, otherwise the operation will
    * be performed as `x.exponentiatedBy(n).modulo(m)` with a `POW_PRECISION` of 0.
    *
    * Throws if `n` is not an integer.
    *
    * ```ts
    * Math.pow(0.7, 2)                    // 0.48999999999999994
    * x = new BigNumber(0.7)
    * x.exponentiatedBy(2)                // '0.49'
    * BigNumber(3).exponentiatedBy(-2)    // '0.11111111111111111111'
    * ```
    *
    * @param n The exponent, an integer.
    * @param [m] The modulus.
    */
  def exponentiatedBy(n: Value): BigNumber = js.native
  def exponentiatedBy(n: Value, m: Value): BigNumber = js.native
  /**
    * Returns `true` if the value of this BigNumber is greater than the value of `n`, otherwise
    * returns `false`.
    *
    * ```ts
    * 0.1 > (0.3 - 0                     // true
    * x = new BigNumber(0.1)
    * x.gt(BigNumber(0.3).minus(0.2))    // false
    * BigNumber(0).gt(x)                 // false
    * BigNumber(11, 3).gt(11.1, 2)       // true
    * ```
    *
    * @param n A numeric value.
    * @param [base] The base of n.
    */
  def gt(n: Value): Boolean = js.native
  def gt(n: Value, base: Double): Boolean = js.native
  /**
    * Returns `true` if the value of this BigNumber is greater than or equal to the value of `n`,
    * otherwise returns `false`.
    *
    * ```ts
    * (0.3 - 0.2) >= 0.1                    // false
    * x = new BigNumber(0.3).minus(0.2)
    * x.gte(0.1)                            // true
    * BigNumber(1).gte(x)                   // true
    * BigNumber(10, 18).gte('i', 36)        // true
    * ```
    *
    * @param n A numeric value.
    * @param [base] The base of n.
    */
  def gte(n: Value): Boolean = js.native
  def gte(n: Value, base: Double): Boolean = js.native
  /**
    * Returns a BigNumber whose value is the integer part of dividing the value of this BigNumber by
    * `n`.
    *
    * ```ts
    * x = new BigNumber(5)
    * y = new BigNumber(3)
    * x.idiv(y)                       // '1'
    * x.idiv(0.7)                     // '7'
    * x.idiv('0.f', 16)               // '5'
    * ```
    *
    * @param n A numeric value.
    * @param [base] The base of n.
    */
  def idiv(n: Value): BigNumber = js.native
  def idiv(n: Value, base: Double): BigNumber = js.native
  /**
    * Returns a BigNumber whose value is the value of this BigNumber rounded to an integer using
    * rounding mode `rm`.
    *
    * If `rm` is omitted, or is `null` or `undefined`, `ROUNDING_MODE` is used.
    *
    * Throws if `rm` is invalid.
    *
    * ```ts
    * x = new BigNumber(123.456)
    * x.integerValue()                        // '123'
    * x.integerValue(BigNumber.ROUND_CEIL)    // '124'
    * y = new BigNumber(-12.7)
    * y.integerValue()                        // '-13'
    * x.integerValue(BigNumber.ROUND_DOWN)    // '-12'
    * ```
    *
    * @param {BigNumber.RoundingMode} [rm] The roundng mode, an integer, 0 to 8.
    */
  def integerValue(): BigNumber = js.native
  def integerValue(rm: RoundingMode): BigNumber = js.native
  /**
    * Returns `true` if the value of this BigNumber is equal to the value of `n`, otherwise returns
    * `false`.
    *
    * As with JavaScript, `NaN` does not equal `NaN`.
    *
    * ```ts
    * 0 === 1e-324                           // true
    * x = new BigNumber(0)
    * x.isEqualTo('1e-324')                  // false
    * BigNumber(-0).isEqualTo(x)             // true  ( -0 === 0 )
    * BigNumber(255).isEqualTo('ff', 16)     // true
    *
    * y = new BigNumber(NaN)
    * y.isEqualTo(NaN)                // false
    * ```
    *
    * @param n A numeric value.
    * @param [base] The base of n.
    */
  def isEqualTo(n: Value): Boolean = js.native
  def isEqualTo(n: Value, base: Double): Boolean = js.native
  /**
    * Returns `true` if the value of this BigNumber is a finite number, otherwise returns `false`.
    *
    * The only possible non-finite values of a BigNumber are `NaN`, `Infinity` and `-Infinity`.
    *
    * ```ts
    * x = new BigNumber(1)
    * x.isFinite()                    // true
    * y = new BigNumber(Infinity)
    * y.isFinite()                    // false
    * ```
    */
  def isFinite(): Boolean = js.native
  /**
    * Returns `true` if the value of this BigNumber is greater than the value of `n`, otherwise
    * returns `false`.
    *
    * ```ts
    * 0.1 > (0.3 - 0.2)                             // true
    * x = new BigNumber(0.1)
    * x.isGreaterThan(BigNumber(0.3).minus(0.2))    // false
    * BigNumber(0).isGreaterThan(x)                 // false
    * BigNumber(11, 3).isGreaterThan(11.1, 2)       // true
    * ```
    *
    * @param n A numeric value.
    * @param [base] The base of n.
    */
  def isGreaterThan(n: Value): Boolean = js.native
  def isGreaterThan(n: Value, base: Double): Boolean = js.native
  /**
    * Returns `true` if the value of this BigNumber is greater than or equal to the value of `n`,
    * otherwise returns `false`.
    *
    * ```ts
    * (0.3 - 0.2) >= 0.1                                  // false
    * x = new BigNumber(0.3).minus(0.2)
    * x.isGreaterThanOrEqualTo(0.1)                       // true
    * BigNumber(1).isGreaterThanOrEqualTo(x)              // true
    * BigNumber(10, 18).isGreaterThanOrEqualTo('i', 36)   // true
    * ```
    *
    * @param n A numeric value.
    * @param [base] The base of n.
    */
  def isGreaterThanOrEqualTo(n: Value): Boolean = js.native
  def isGreaterThanOrEqualTo(n: Value, base: Double): Boolean = js.native
  /**
    * Returns `true` if the value of this BigNumber is an integer, otherwise returns `false`.
    *
    * ```ts
    * x = new BigNumber(1)
    * x.isInteger()                   // true
    * y = new BigNumber(123.456)
    * y.isInteger()                   // false
    * ```
    */
  def isInteger(): Boolean = js.native
  /**
    * Returns `true` if the value of this BigNumber is less than the value of `n`, otherwise returns
    * `false`.
    *
    * ```ts
    * (0.3 - 0.2) < 0.1                       // true
    * x = new BigNumber(0.3).minus(0.2)
    * x.isLessThan(0.1)                       // false
    * BigNumber(0).isLessThan(x)              // true
    * BigNumber(11.1, 2).isLessThan(11, 3)    // true
    * ```
    *
    * @param n A numeric value.
    * @param [base] The base of n.
    */
  def isLessThan(n: Value): Boolean = js.native
  def isLessThan(n: Value, base: Double): Boolean = js.native
  /**
    * Returns `true` if the value of this BigNumber is less than or equal to the value of `n`,
    * otherwise returns `false`.
    *
    * ```ts
    * 0.1 <= (0.3 - 0.2)                                 // false
    * x = new BigNumber(0.1)
    * x.isLessThanOrEqualTo(BigNumber(0.3).minus(0.2))   // true
    * BigNumber(-1).isLessThanOrEqualTo(x)               // true
    * BigNumber(10, 18).isLessThanOrEqualTo('i', 36)     // true
    * ```
    *
    * @param n A numeric value.
    * @param [base] The base of n.
    */
  def isLessThanOrEqualTo(n: Value): Boolean = js.native
  def isLessThanOrEqualTo(n: Value, base: Double): Boolean = js.native
  /**
    * Returns `true` if the value of this BigNumber is `NaN`, otherwise returns `false`.
    *
    * ```ts
    * x = new BigNumber(NaN)
    * x.isNaN()                       // true
    * y = new BigNumber('Infinity')
    * y.isNaN()                       // false
    * ```
    */
  def isNaN(): Boolean = js.native
  /**
    * Returns `true` if the value of this BigNumber is negative, otherwise returns `false`.
    *
    * ```ts
    * x = new BigNumber(-0)
    * x.isNegative()                  // true
    * y = new BigNumber(2)
    * y.isNegative()                  // false
    * ```
    */
  def isNegative(): Boolean = js.native
  /**
    * Returns `true` if the value of this BigNumber is positive, otherwise returns `false`.
    *
    * ```ts
    * x = new BigNumber(-0)
    * x.isPositive()                  // false
    * y = new BigNumber(2)
    * y.isPositive()                  // true
    * ```
    */
  def isPositive(): Boolean = js.native
  /**
    * Returns `true` if the value of this BigNumber is zero or minus zero, otherwise returns `false`.
    *
    * ```ts
    * x = new BigNumber(-0)
    * x.isZero()                 // true
    * ```
    */
  def isZero(): Boolean = js.native
  /**
    * Returns `true` if the value of this BigNumber is less than the value of `n`, otherwise returns
    * `false`.
    *
    * ```ts
    * (0.3 - 0.2) < 0.1                       // true
    * x = new BigNumber(0.3).minus(0.2)
    * x.lt(0.1)                               // false
    * BigNumber(0).lt(x)                      // true
    * BigNumber(11.1, 2).lt(11, 3)            // true
    * ```
    *
    * @param n A numeric value.
    * @param [base] The base of n.
    */
  def lt(n: Value): Boolean = js.native
  def lt(n: Value, base: Double): Boolean = js.native
  /**
    * Returns `true` if the value of this BigNumber is less than or equal to the value of `n`,
    * otherwise returns `false`.
    *
    * ```ts
    * 0.1 <= (0.3 - 0.2)                  // false
    * x = new BigNumber(0.1)
    * x.lte(BigNumber(0.3).minus(0.2))    // true
    * BigNumber(-1).lte(x)                // true
    * BigNumber(10, 18).lte('i', 36)      // true
    * ```
    *
    * @param n A numeric value.
    * @param [base] The base of n.
    */
  def lte(n: Value): Boolean = js.native
  def lte(n: Value, base: Double): Boolean = js.native
  /**
    * Returns a BigNumber whose value is the value of this BigNumber minus `n`.
    *
    * The return value is always exact and unrounded.
    *
    * ```ts
    * 0.3 - 0.1                       // 0.19999999999999998
    * x = new BigNumber(0.3)
    * x.minus(0.1)                    // '0.2'
    * x.minus(0.6, 20)                // '0'
    * ```
    *
    * @param n A numeric value.
    * @param [base] The base of n.
    */
  def minus(n: Value): BigNumber = js.native
  def minus(n: Value, base: Double): BigNumber = js.native
  /**
    * Returns a BigNumber whose value is the value of this BigNumber modulo `n`, i.e. the integer
    * remainder of dividing this BigNumber by `n`.
    *
    * The value returned, and in particular its sign, is dependent on the value of the `MODULO_MODE`
    * setting of this BigNumber constructor. If it is 1 (default value), the result will have the
    * same sign as this BigNumber, and it will match that of Javascript's `%` operator (within the
    * limits of double precision) and BigDecimal's `remainder` method.
    *
    * The return value is always exact and unrounded.
    *
    * See `MODULO_MODE` for a description of the other modulo modes.
    *
    * ```ts
    * 1 % 0.9                      // 0.09999999999999998
    * x = new BigNumber(1)
    * x.mod(0.9)                   // '0.1'
    * y = new BigNumber(33)
    * y.mod('a', 33)               // '3'
    * ```
    *
    * @param n A numeric value.
    * @param [base] The base of n.
    */
  def mod(n: Value): BigNumber = js.native
  def mod(n: Value, base: Double): BigNumber = js.native
  /**
    * Returns a BigNumber whose value is the value of this BigNumber modulo `n`, i.e. the integer
    * remainder of dividing this BigNumber by `n`.
    *
    * The value returned, and in particular its sign, is dependent on the value of the `MODULO_MODE`
    * setting of this BigNumber constructor. If it is 1 (default value), the result will have the
    * same sign as this BigNumber, and it will match that of Javascript's `%` operator (within the
    * limits of double precision) and BigDecimal's `remainder` method.
    *
    * The return value is always exact and unrounded.
    *
    * See `MODULO_MODE` for a description of the other modulo modes.
    *
    * ```ts
    * 1 % 0.9                         // 0.09999999999999998
    * x = new BigNumber(1)
    * x.modulo(0.9)                   // '0.1'
    * y = new BigNumber(33)
    * y.modulo('a', 33)               // '3'
    * ```
    *
    * @param n A numeric value.
    * @param [base] The base of n.
    */
  def modulo(n: Value): BigNumber = js.native
  def modulo(n: Value, base: Double): BigNumber = js.native
  /**
    * Returns a BigNumber whose value is the value of this BigNumber multiplied by `n`.
    *
    * The return value is always exact and unrounded.
    *
    * ```ts
    * 0.6 * 3                                // 1.7999999999999998
    * x = new BigNumber(0.6)
    * y = x.multipliedBy(3)                  // '1.8'
    * BigNumber('7e+500').multipliedBy(y)    // '1.26e+501'
    * x.multipliedBy('-a', 16)               // '-6'
    * ```
    *
    * @param n A numeric value.
    * @param [base] The base of n.
    */
  def multipliedBy(n: Value): BigNumber = js.native
  def multipliedBy(n: Value, base: Double): BigNumber = js.native
  /**
    * Returns a BigNumber whose value is the value of this BigNumber negated, i.e. multiplied by -1.
    *
    * ```ts
    * x = new BigNumber(1.8)
    * x.negated()                     // '-1.8'
    * y = new BigNumber(-1.3)
    * y.negated()                     // '1.3'
    * ```
    */
  def negated(): BigNumber = js.native
  /**
    * Returns a BigNumber whose value is the value of this BigNumber plus `n`.
    *
    * The return value is always exact and unrounded.
    *
    * ```ts
    * 0.1 + 0.2                       // 0.30000000000000004
    * x = new BigNumber(0.1)
    * y = x.plus(0.2)                 // '0.3'
    * BigNumber(0.7).plus(x).plus(y)  // '1'
    * x.plus('0.1', 8)                // '0.225'
    * ```
    *
    * @param n A numeric value.
    * @param [base] The base of n.
    */
  def plus(n: Value): BigNumber = js.native
  def plus(n: Value, base: Double): BigNumber = js.native
  def pow(n: Double): BigNumber = js.native
  def pow(n: Double, m: Value): BigNumber = js.native
  /**
    * Returns a BigNumber whose value is the value of this BigNumber exponentiated by `n`, i.e.
    * raised to the power `n`, and optionally modulo a modulus `m`.
    *
    * If `n` is negative the result is rounded according to the current `DECIMAL_PLACES` and
    * `ROUNDING_MODE` settings.
    *
    * As the number of digits of the result of the power operation can grow so large so quickly,
    * e.g. 123.456**10000 has over 50000 digits, the number of significant digits calculated is
    * limited to the value of the `POW_PRECISION` setting (unless a modulus `m` is specified).
    *
    * By default `POW_PRECISION` is set to 0. This means that an unlimited number of significant
    * digits will be calculated, and that the method's performance will decrease dramatically for
    * larger exponents.
    *
    * If `m` is specified and the value of `m`, `n` and this BigNumber are integers and `n` is
    * positive, then a fast modular exponentiation algorithm is used, otherwise the operation will
    * be performed as `x.pow(n).modulo(m)` with a `POW_PRECISION` of 0.
    *
    * Throws if `n` is not an integer.
    *
    * ```ts
    * Math.pow(0.7, 2)                   // 0.48999999999999994
    * x = new BigNumber(0.7)
    * x.pow(2)                           // '0.49'
    * BigNumber(3).pow(-2)               // '0.11111111111111111111'
    * ```
    *
    * @param n The exponent, an integer.
    * @param [m] The modulus.
    */
  def pow(n: Value): BigNumber = js.native
  def pow(n: Value, m: Value): BigNumber = js.native
  /**
    * Returns the number of significant digits of the value of this BigNumber, or `null` if the value
    * of this BigNumber is ±`Infinity` or `NaN`.
    *
    * If `includeZeros` is true then any trailing zeros of the integer part of the value of this
    * BigNumber are counted as significant digits, otherwise they are not.
    *
    * Throws if `includeZeros` is invalid.
    *
    * ```ts
    * x = new BigNumber(9876.54321)
    * x.precision()                         // 9
    * y = new BigNumber(987000)
    * y.precision(false)                    // 3
    * y.precision(true)                     // 6
    * ```
    *
    * @param [includeZeros] Whether to include integer trailing zeros in the significant digit count.
    */
  def precision(): Double = js.native
  def precision(includeZeros: Boolean): Double = js.native
  /**
    * Returns a BigNumber whose value is the value of this BigNumber rounded to a precision of
    * `significantDigits` significant digits using rounding mode `roundingMode`.
    *
    * If `roundingMode` is omitted or is `null` or `undefined`, `ROUNDING_MODE` will be used.
    *
    * Throws if `significantDigits` or `roundingMode` is invalid.
    *
    * ```ts
    * x = new BigNumber(9876.54321)
    * x.precision(6)                         // '9876.54'
    * x.precision(6, BigNumber.ROUND_UP)     // '9876.55'
    * x.precision(2)                         // '9900'
    * x.precision(2, 1)                      // '9800'
    * x                                      // '9876.54321'
    * ```
    *
    * @param significantDigits Significant digits, integer, 1 to 1e+9.
    * @param [roundingMode] Rounding mode, integer, 0 to 8.
    */
  def precision(significantDigits: Double): BigNumber = js.native
  def precision(significantDigits: Double, roundingMode: RoundingMode): BigNumber = js.native
  /**
    * Returns the number of significant digits of the value of this BigNumber,
    * or `null` if the value of this BigNumber is ±`Infinity` or `NaN`.
    *
    * If `includeZeros` is true then any trailing zeros of the integer part of
    * the value of this BigNumber are counted as significant digits, otherwise
    * they are not.
    *
    * Throws if `includeZeros` is invalid.
    *
    * ```ts
    * x = new BigNumber(9876.54321)
    * x.sd()                         // 9
    * y = new BigNumber(987000)
    * y.sd(false)                    // 3
    * y.sd(true)                     // 6
    * ```
    *
    * @param [includeZeros] Whether to include integer trailing zeros in the significant digit count.
    */
  def sd(): Double = js.native
  def sd(includeZeros: Boolean): Double = js.native
  /**
    * Returns a BigNumber whose value is the value of this BigNumber rounded to a precision of
    * `significantDigits` significant digits using rounding mode `roundingMode`.
    *
    * If `roundingMode` is omitted or is `null` or `undefined`, `ROUNDING_MODE` will be used.
    *
    * Throws if `significantDigits` or `roundingMode` is invalid.
    *
    * ```ts
    * x = new BigNumber(9876.54321)
    * x.sd(6)                           // '9876.54'
    * x.sd(6, BigNumber.ROUND_UP)       // '9876.55'
    * x.sd(2)                           // '9900'
    * x.sd(2, 1)                        // '9800'
    * x                                 // '9876.54321'
    * ```
    *
    * @param significantDigits Significant digits, integer, 1 to 1e+9.
    * @param [roundingMode] Rounding mode, integer, 0 to 8.
    */
  def sd(significantDigits: Double): BigNumber = js.native
  def sd(significantDigits: Double, roundingMode: RoundingMode): BigNumber = js.native
  /**
    * Returns a BigNumber whose value is the value of this BigNumber shifted by `n` places.
    *
    * The shift is of the decimal point, i.e. of powers of ten, and is to the left if `n` is negative
    * or to the right if `n` is positive.
    *
    * The return value is always exact and unrounded.
    *
    * Throws if `n` is invalid.
    *
    * ```ts
    * x = new BigNumber(1.23)
    * x.shiftedBy(3)                      // '1230'
    * x.shiftedBy(-3)                     // '0.00123'
    * ```
    *
    * @param n The shift value, integer, -9007199254740991 to 9007199254740991.
    */
  def shiftedBy(n: Double): BigNumber = js.native
  /**
    * Returns a BigNumber whose value is the square root of the value of this BigNumber, rounded
    * according to the current `DECIMAL_PLACES` and `ROUNDING_MODE` settings.
    *
    * The return value will be correctly rounded, i.e. rounded as if the result was first calculated
    * to an infinite number of correct digits before rounding.
    *
    * ```ts
    * x = new BigNumber(16)
    * x.sqrt()                  // '4'
    * y = new BigNumber(3)
    * y.sqrt()                  // '1.73205080756887729353'
    * ```
    */
  def sqrt(): BigNumber = js.native
  /**
    * Returns a BigNumber whose value is the square root of the value of this BigNumber, rounded
    * according to the current `DECIMAL_PLACES` and `ROUNDING_MODE` settings.
    *
    * The return value will be correctly rounded, i.e. rounded as if the result was first calculated
    * to an infinite number of correct digits before rounding.
    *
    * ```ts
    * x = new BigNumber(16)
    * x.squareRoot()                  // '4'
    * y = new BigNumber(3)
    * y.squareRoot()                  // '1.73205080756887729353'
    * ```
    */
  def squareRoot(): BigNumber = js.native
  /**
    * Returns a BigNumber whose value is the value of this BigNumber multiplied by `n`.
    *
    * The return value is always exact and unrounded.
    *
    * ```ts
    * 0.6 * 3                         // 1.7999999999999998
    * x = new BigNumber(0.6)
    * y = x.times(3)                  // '1.8'
    * BigNumber('7e+500').times(y)    // '1.26e+501'
    * x.times('-a', 16)               // '-6'
    * ```
    *
    * @param n A numeric value.
    * @param [base] The base of n.
    */
  def times(n: Value): BigNumber = js.native
  def times(n: Value, base: Double): BigNumber = js.native
  def toExponential(): String = js.native
  /**
    * Returns a string representing the value of this BigNumber in exponential notation rounded using
    * rounding mode `roundingMode` to `decimalPlaces` decimal places, i.e with one digit before the
    * decimal point and `decimalPlaces` digits after it.
    *
    * If the value of this BigNumber in exponential notation has fewer than `decimalPlaces` fraction
    * digits, the return value will be appended with zeros accordingly.
    *
    * If `decimalPlaces` is omitted, or is `null` or `undefined`, the number of digits after the
    * decimal point defaults to the minimum number of digits necessary to represent the value
    * exactly.
    *
    * If `roundingMode` is omitted or is `null` or `undefined`, `ROUNDING_MODE` is used.
    *
    * Throws if `decimalPlaces` or `roundingMode` is invalid.
    *
    * ```ts
    * x = 45.6
    * y = new BigNumber(x)
    * x.toExponential()               // '4.56e+1'
    * y.toExponential()               // '4.56e+1'
    * x.toExponential(0)              // '5e+1'
    * y.toExponential(0)              // '5e+1'
    * x.toExponential(1)              // '4.6e+1'
    * y.toExponential(1)              // '4.6e+1'
    * y.toExponential(1, 1)           // '4.5e+1'  (ROUND_DOWN)
    * x.toExponential(3)              // '4.560e+1'
    * y.toExponential(3)              // '4.560e+1'
    * ```
    *
    * @param [decimalPlaces] Decimal places, integer, 0 to 1e+9.
    * @param [roundingMode] Rounding mode, integer, 0 to 8.
    */
  def toExponential(decimalPlaces: Double): String = js.native
  def toExponential(decimalPlaces: Double, roundingMode: RoundingMode): String = js.native
  def toFixed(): String = js.native
  /**
    * Returns a string representing the value of this BigNumber in normal (fixed-point) notation
    * rounded to `decimalPlaces` decimal places using rounding mode `roundingMode`.
    *
    * If the value of this BigNumber in normal notation has fewer than `decimalPlaces` fraction
    * digits, the return value will be appended with zeros accordingly.
    *
    * Unlike `Number.prototype.toFixed`, which returns exponential notation if a number is greater or
    * equal to 10**21, this method will always return normal notation.
    *
    * If `decimalPlaces` is omitted or is `null` or `undefined`, the return value will be unrounded
    * and in normal notation. This is also unlike `Number.prototype.toFixed`, which returns the value
    * to zero decimal places. It is useful when normal notation is required and the current
    * `EXPONENTIAL_AT` setting causes `toString` to return exponential notation.
    *
    * If `roundingMode` is omitted or is `null` or `undefined`, `ROUNDING_MODE` is used.
    *
    * Throws if `decimalPlaces` or `roundingMode` is invalid.
    *
    * ```ts
    * x = 3.456
    * y = new BigNumber(x)
    * x.toFixed()                     // '3'
    * y.toFixed()                     // '3.456'
    * y.toFixed(0)                    // '3'
    * x.toFixed(2)                    // '3.46'
    * y.toFixed(2)                    // '3.46'
    * y.toFixed(2, 1)                 // '3.45'  (ROUND_DOWN)
    * x.toFixed(5)                    // '3.45600'
    * y.toFixed(5)                    // '3.45600'
    * ```
    *
    * @param [decimalPlaces] Decimal places, integer, 0 to 1e+9.
    * @param [roundingMode] Rounding mode, integer, 0 to 8.
    */
  def toFixed(decimalPlaces: Double): String = js.native
  def toFixed(decimalPlaces: Double, roundingMode: RoundingMode): String = js.native
  def toFormat(): String = js.native
  def toFormat(decimalPlaces: Double): String = js.native
  def toFormat(decimalPlaces: Double, format: Format): String = js.native
  /**
    * Returns a string representing the value of this BigNumber in normal (fixed-point) notation
    * rounded to `decimalPlaces` decimal places using rounding mode `roundingMode`, and formatted
    * according to the properties of the `format` or `FORMAT` object.
    *
    * The formatting object may contain some or all of the properties shown in the examples below.
    *
    * If `decimalPlaces` is omitted or is `null` or `undefined`, then the return value is not
    * rounded to a fixed number of decimal places.
    *
    * If `roundingMode` is omitted or is `null` or `undefined`, `ROUNDING_MODE` is used.
    *
    * If `format` is omitted or is `null` or `undefined`, `FORMAT` is used.
    *
    * Throws if `decimalPlaces`, `roundingMode`, or `format` is invalid.
    *
    * ```ts
    * fmt = {
    *   decimalSeparator: '.',
    *   groupSeparator: ',',
    *   groupSize: 3,
    *   secondaryGroupSize: 0,
    *   fractionGroupSeparator: ' ',
    *   fractionGroupSize: 0
    * }
    *
    * x = new BigNumber('123456789.123456789')
    *
    * // Set the global formatting options
    * BigNumber.config({ FORMAT: fmt })
    *
    * x.toFormat()                              // '123,456,789.123456789'
    * x.toFormat(3)                             // '123,456,789.123'
    *
    * // If a reference to the object assigned to FORMAT has been retained,
    * // the format properties can be changed directly
    * fmt.groupSeparator = ' '
    * fmt.fractionGroupSize = 5
    * x.toFormat()                              // '123 456 789.12345 6789'
    *
    * // Alternatively, pass the formatting options as an argument
    * fmt = {
    *   decimalSeparator: ',',
    *   groupSeparator: '.',
    *   groupSize: 3,
    *   secondaryGroupSize: 2
    * }
    *
    * x.toFormat()                              // '123 456 789.12345 6789'
    * x.toFormat(fmt)                           // '12.34.56.789,123456789'
    * x.toFormat(2, fmt)                        // '12.34.56.789,12'
    * x.toFormat(3, BigNumber.ROUND_UP, fmt)    // '12.34.56.789,124'
    * ```
    *
    * @param [decimalPlaces] Decimal places, integer, 0 to 1e+9.
    * @param [roundingMode] Rounding mode, integer, 0 to 8.
    * @param [format] Formatting options object. See `BigNumber.Format`.
    */
  def toFormat(decimalPlaces: Double, roundingMode: RoundingMode): String = js.native
  def toFormat(decimalPlaces: Double, roundingMode: RoundingMode, format: Format): String = js.native
  def toFormat(format: Format): String = js.native
  /**
    * Returns an array of two BigNumbers representing the value of this BigNumber as a simple
    * fraction with an integer numerator and an integer denominator.
    * The denominator will be a positive non-zero value less than or equal to `max_denominator`.
    * If a maximum denominator, `max_denominator`, is not specified, or is `null` or `undefined`, the
    * denominator will be the lowest value necessary to represent the number exactly.
    *
    * Throws if `max_denominator` is invalid.
    *
    * ```ts
    * x = new BigNumber(1.75)
    * x.toFraction()                  // '7, 4'
    *
    * pi = new BigNumber('3.14159265358')
    * pi.toFraction()                 // '157079632679,50000000000'
    * pi.toFraction(100000)           // '312689, 99532'
    * pi.toFraction(10000)            // '355, 113'
    * pi.toFraction(100)              // '311, 99'
    * pi.toFraction(10)               // '22, 7'
    * pi.toFraction(1)                // '3, 1'
    * ```
    *
    * @param [max_denominator] The maximum denominator, integer > 0, or Infinity.
    */
  def toFraction(): js.Tuple2[BigNumber, BigNumber] = js.native
  def toFraction(max_denominator: Value): js.Tuple2[BigNumber, BigNumber] = js.native
  /** As `valueOf`. */
  def toJSON(): String = js.native
  /**
    * Returns the value of this BigNumber as a JavaScript primitive number.
    *
    * Using the unary plus operator gives the same result.
    *
    * ```ts
    * x = new BigNumber(456.789)
    * x.toNumber()                    // 456.789
    * +x                              // 456.789
    *
    * y = new BigNumber('45987349857634085409857349856430985')
    * y.toNumber()                    // 4.598734985763409e+34
    *
    * z = new BigNumber(-0)
    * 1 / z.toNumber()                // -Infinity
    * 1 / +z                          // -Infinity
    * ```
    */
  def toNumber(): Double = js.native
  def toPrecision(): String = js.native
  /**
    * Returns a string representing the value of this BigNumber rounded to `significantDigits`
    * significant digits using rounding mode `roundingMode`.
    *
    * If `significantDigits` is less than the number of digits necessary to represent the integer
    * part of the value in normal (fixed-point) notation, then exponential notation is used.
    *
    * If `significantDigits` is omitted, or is `null` or `undefined`, then the return value is the
    * same as `n.toString()`.
    *
    * If `roundingMode` is omitted or is `null` or `undefined`, `ROUNDING_MODE` is used.
    *
    * Throws if `significantDigits` or `roundingMode` is invalid.
    *
    * ```ts
    * x = 45.6
    * y = new BigNumber(x)
    * x.toPrecision()                 // '45.6'
    * y.toPrecision()                 // '45.6'
    * x.toPrecision(1)                // '5e+1'
    * y.toPrecision(1)                // '5e+1'
    * y.toPrecision(2, 0)             // '4.6e+1'  (ROUND_UP)
    * y.toPrecision(2, 1)             // '4.5e+1'  (ROUND_DOWN)
    * x.toPrecision(5)                // '45.600'
    * y.toPrecision(5)                // '45.600'
    * ```
    *
    * @param [significantDigits] Significant digits, integer, 1 to 1e+9.
    * @param [roundingMode] Rounding mode, integer 0 to 8.
    */
  def toPrecision(significantDigits: Double): String = js.native
  def toPrecision(significantDigits: Double, roundingMode: RoundingMode): String = js.native
  def toString(base: Double): String = js.native
}

