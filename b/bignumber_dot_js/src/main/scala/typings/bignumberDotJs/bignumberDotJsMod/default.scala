package typings.bignumberDotJs.bignumberDotJsMod

import typings.bignumberDotJs.bignumberDotJsMod.BigNumberNs.Config
import typings.bignumberDotJs.bignumberDotJsMod.BigNumberNs.Constructor
import typings.bignumberDotJs.bignumberDotJsMod.BigNumberNs.Value
import typings.bignumberDotJs.bignumberDotJsNumbers.`0`
import typings.bignumberDotJs.bignumberDotJsNumbers.`1`
import typings.bignumberDotJs.bignumberDotJsNumbers.`2`
import typings.bignumberDotJs.bignumberDotJsNumbers.`3`
import typings.bignumberDotJs.bignumberDotJsNumbers.`4`
import typings.bignumberDotJs.bignumberDotJsNumbers.`5`
import typings.bignumberDotJs.bignumberDotJsNumbers.`6`
import typings.bignumberDotJs.bignumberDotJsNumbers.`7`
import typings.bignumberDotJs.bignumberDotJsNumbers.`8`
import typings.bignumberDotJs.bignumberDotJsNumbers.`9`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("bignumber.js", JSImport.Default)
@js.native
class default protected () extends BigNumber {
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
}

/* static members */
@JSImport("bignumber.js", JSImport.Default)
@js.native
object default extends js.Object {
  /** Helps ES6 import. */
  val BigNumber: js.UndefOr[Constructor] = js.native
  /**
    * To aid in debugging, if a `BigNumber.DEBUG` property is `true` then an error will be thrown
    * if the BigNumber constructor receives an invalid `BigNumber.Value`, or if `BigNumber.isBigNumber`
    * receives a BigNumber instance that is malformed.
    *
    * ```ts
    * // No error, and BigNumber NaN is returned.
    * new BigNumber('blurgh')    // 'NaN'
    * new BigNumber(9, 2)        // 'NaN'
    * BigNumber.DEBUG = true
    * new BigNumber('blurgh')    // '[BigNumber Error] Not a number'
    * new BigNumber(9, 2)        // '[BigNumber Error] Not a base 2 number'
    * ```
    *
    * An error will also be thrown if a `BigNumber.Value` is of type number with more than 15
    * significant digits, as calling `toString` or `valueOf` on such numbers may not result
    * in the intended value.
    *
    * ```ts
    * console.log(823456789123456.3)       //  823456789123456.2
    * // No error, and the returned BigNumber does not have the same value as the number literal.
    * new BigNumber(823456789123456.3)     // '823456789123456.2'
    * BigNumber.DEBUG = true
    * new BigNumber(823456789123456.3)
    * // '[BigNumber Error] Number primitive has more than 15 significant digits'
    * ```
    *
    * Check that a BigNumber instance is well-formed:
    *
    * ```ts
    * x = new BigNumber(10)
    *
    * BigNumber.DEBUG = false
    * // Change x.c to an illegitimate value.
    * x.c = NaN
    * // No error, as BigNumber.DEBUG is false.
    * BigNumber.isBigNumber(x)    // true
    *
    * BigNumber.DEBUG = true
    * BigNumber.isBigNumber(x)    // '[BigNumber Error] Invalid BigNumber'
    * ```
    */
  var DEBUG: js.UndefOr[Boolean] = js.native
  /** See `MODULO_MODE`. */
  val EUCLID: `9` = js.native
  /** Rounds towards Infinity. */
  val ROUND_CEIL: `2` = js.native
  /** Rounds towards zero. */
  val ROUND_DOWN: `1` = js.native
  /** Rounds towards -Infinity. */
  val ROUND_FLOOR: `3` = js.native
  /** Rounds towards nearest neighbour. If equidistant, rounds towards Infinity. */
  val ROUND_HALF_CEIL: `7` = js.native
  /** Rounds towards nearest neighbour. If equidistant, rounds towards zero. */
  val ROUND_HALF_DOWN: `5` = js.native
  /** Rounds towards nearest neighbour. If equidistant, rounds towards even neighbour. */
  val ROUND_HALF_EVEN: `6` = js.native
  /** Rounds towards nearest neighbour. If equidistant, rounds towards -Infinity. */
  val ROUND_HALF_FLOOR: `8` = js.native
  /** Rounds towards nearest neighbour. If equidistant, rounds away from zero . */
  val ROUND_HALF_UP: `4` = js.native
  /** Rounds away from zero. */
  val ROUND_UP: `0` = js.native
  /** Helps ES6 import. */
  val default: js.UndefOr[Constructor] = js.native
  def clone(`object`: Config): Constructor = js.native
  /**
    * Configures the settings that apply to this BigNumber constructor.
    *
    * The configuration object, `object`, contains any number of the properties shown in the example
    * below.
    *
    * Returns an object with the above properties and their current values.
    *
    * Throws if `object` is not an object, or if an invalid value is assigned to one or more of the
    * properties.
    *
    * ```ts
    * BigNumber.config({
    *     DECIMAL_PLACES: 40,
    *     ROUNDING_MODE: BigNumber.ROUND_HALF_CEIL,
    *     EXPONENTIAL_AT: [-10, 20],
    *     RANGE: [-500, 500],
    *     CRYPTO: true,
    *     MODULO_MODE: BigNumber.ROUND_FLOOR,
    *     POW_PRECISION: 80,
    *     FORMAT: {
    *         groupSize: 3,
    *         groupSeparator: ' ',
    *         decimalSeparator: ','
    *     },
    *     ALPHABET: '0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ$_'
    * });
    *
    * BigNumber.config().DECIMAL_PLACES        // 40
    * ```
    *
    * @param object The configuration object.
    */
  def config(`object`: Config): Config = js.native
  /**
    * Returns `true` if `value` is a BigNumber instance, otherwise returns `false`.
    *
    * If `BigNumber.DEBUG` is `true`, throws if a BigNumber instance is not well-formed.
    *
    * ```ts
    * x = 42
    * y = new BigNumber(x)
    *
    * BigNumber.isBigNumber(x)             // false
    * y instanceof BigNumber               // true
    * BigNumber.isBigNumber(y)             // true
    *
    * BN = BigNumber.clone();
    * z = new BN(x)
    * z instanceof BigNumber               // false
    * BigNumber.isBigNumber(z)             // true
    * ```
    *
    * @param value The value to test.
    */
  def isBigNumber(value: js.Any): /* is bignumber.js.bignumber.js.BigNumber */ Boolean = js.native
  /**
    * Returns a BigNumber whose value is the maximum of the arguments.
    *
    * The return value is always exact and unrounded.
    *
    * ```ts
    * x = new BigNumber('3257869345.0378653')
    * BigNumber.max(4e9, x, '123456789.9')      // '4000000000'
    *
    * arr = [12, '13', new BigNumber(14)]
    * BigNumber.max.apply(null, arr)            // '14'
    * ```
    *
    * @param n A numeric value.
    */
  def max(n: Value*): typings.bignumberDotJs.bignumberDotJsMod.BigNumber = js.native
  /**
    * Returns a BigNumber whose value is the maximum of the arguments.
    *
    * The return value is always exact and unrounded.
    *
    * ```ts
    * x = new BigNumber('3257869345.0378653')
    * BigNumber.maximum(4e9, x, '123456789.9')      // '4000000000'
    *
    * arr = [12, '13', new BigNumber(14)]
    * BigNumber.maximum.apply(null, arr)            // '14'
    * ```
    *
    * @param n A numeric value.
    */
  def maximum(n: Value*): typings.bignumberDotJs.bignumberDotJsMod.BigNumber = js.native
  /**
    * Returns a BigNumber whose value is the minimum of the arguments.
    *
    * The return value is always exact and unrounded.
    *
    * ```ts
    * x = new BigNumber('3257869345.0378653')
    * BigNumber.min(4e9, x, '123456789.9')             // '123456789.9'
    *
    * arr = [2, new BigNumber(-14), '-15.9999', -12]
    * BigNumber.min.apply(null, arr)                   // '-15.9999'
    * ```
    *
    * @param n A numeric value.
    */
  def min(n: Value*): typings.bignumberDotJs.bignumberDotJsMod.BigNumber = js.native
  /**
    * Returns a BigNumber whose value is the minimum of the arguments.
    *
    * The return value is always exact and unrounded.
    *
    * ```ts
    * x = new BigNumber('3257869345.0378653')
    * BigNumber.minimum(4e9, x, '123456789.9')          // '123456789.9'
    *
    * arr = [2, new BigNumber(-14), '-15.9999', -12]
    * BigNumber.minimum.apply(null, arr)                // '-15.9999'
    * ```
    *
    * @param n A numeric value.
    */
  def minimum(n: Value*): typings.bignumberDotJs.bignumberDotJsMod.BigNumber = js.native
  /**
    * Returns a new BigNumber with a pseudo-random value equal to or greater than 0 and less than 1.
    *
    * The return value will have `decimalPlaces` decimal places, or less if trailing zeros are
    * produced. If `decimalPlaces` is omitted, the current `DECIMAL_PLACES` setting will be used.
    *
    * Depending on the value of this BigNumber constructor's `CRYPTO` setting and the support for the
    * `crypto` object in the host environment, the random digits of the return value are generated by
    * either `Math.random` (fastest), `crypto.getRandomValues` (Web Cryptography API in recent
    * browsers) or `crypto.randomBytes` (Node.js).
    *
    * To be able to set `CRYPTO` to true when using Node.js, the `crypto` object must be available
    * globally:
    *
    * ```ts
    * global.crypto = require('crypto')
    * ```
    *
    * If `CRYPTO` is true, i.e. one of the `crypto` methods is to be used, the value of a returned
    * BigNumber should be cryptographically secure and statistically indistinguishable from a random
    * value.
    *
    * Throws if `decimalPlaces` is invalid.
    *
    * ```ts
    * BigNumber.config({ DECIMAL_PLACES: 10 })
    * BigNumber.random()              // '0.4117936847'
    * BigNumber.random(20)            // '0.78193327636914089009'
    * ```
    *
    * @param [decimalPlaces] Decimal places, integer, 0 to 1e+9.
    */
  def random(): typings.bignumberDotJs.bignumberDotJsMod.BigNumber = js.native
  def random(decimalPlaces: Double): typings.bignumberDotJs.bignumberDotJsMod.BigNumber = js.native
  /**
    * Configures the settings that apply to this BigNumber constructor.
    *
    * The configuration object, `object`, contains any number of the properties shown in the example
    * below.
    *
    * Returns an object with the above properties and their current values.
    *
    * Throws if `object` is not an object, or if an invalid value is assigned to one or more of the
    * properties.
    *
    * ```ts
    * BigNumber.set({
    *     DECIMAL_PLACES: 40,
    *     ROUNDING_MODE: BigNumber.ROUND_HALF_CEIL,
    *     EXPONENTIAL_AT: [-10, 20],
    *     RANGE: [-500, 500],
    *     CRYPTO: true,
    *     MODULO_MODE: BigNumber.ROUND_FLOOR,
    *     POW_PRECISION: 80,
    *     FORMAT: {
    *         groupSize: 3,
    *         groupSeparator: ' ',
    *         decimalSeparator: ','
    *     },
    *     ALPHABET: '0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ$_'
    * });
    *
    * BigNumber.set().DECIMAL_PLACES        // 40
    * ```
    *
    * @param object The configuration object.
    */
  def set(`object`: Config): Config = js.native
  /**
    * Returns a BigNumber whose value is the sum of the arguments.
    *
    * The return value is always exact and unrounded.
    *
    * ```ts
    * x = new BigNumber('3257869345.0378653')
    * BigNumber.sum(4e9, x, '123456789.9')      // '7381326134.9378653'
    *
    * arr = [2, new BigNumber(14), '15.9999', 12]
    * BigNumber.sum.apply(null, arr)            // '43.9999'
    * ```
    *
    * @param n A numeric value.
    */
  def sum(n: Value*): typings.bignumberDotJs.bignumberDotJsMod.BigNumber = js.native
}

