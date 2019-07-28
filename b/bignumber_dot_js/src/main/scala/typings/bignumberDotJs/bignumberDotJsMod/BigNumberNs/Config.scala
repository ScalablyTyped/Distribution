package typings.bignumberDotJs.bignumberDotJsMod.BigNumberNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** See `BigNumber.config` (alias `BigNumber.set`) and `BigNumber.clone`. */
trait Config extends js.Object {
  /**
    * The alphabet used for base conversion. The length of the alphabet corresponds to the maximum
    * value of the base argument that can be passed to the BigNumber constructor or `toString`.
    *
    * Default value: `'0123456789abcdefghijklmnopqrstuvwxyz'`.
    *
    * There is no maximum length for the alphabet, but it must be at least 2 characters long,
    * and it must not contain whitespace or a repeated character, or the sign indicators '+' and
    * '-', or the decimal separator '.'.
    *
    * ```ts
    * // duodecimal (base 12)
    * BigNumber.config({ ALPHABET: '0123456789TE' })
    * x = new BigNumber('T', 12)
    * x.toString()                // '10'
    * x.toString(12)              // 'T'
    * ```
    */
  var ALPHABET: js.UndefOr[String] = js.undefined
  /**
    * A boolean: `true` or `false`. Default value: `false`.
    *
    * The value that determines whether cryptographically-secure pseudo-random number generation is
    * used. If `CRYPTO` is set to true then the random method will generate random digits using
    * `crypto.getRandomValues` in browsers that support it, or `crypto.randomBytes` if using a
    * version of Node.js that supports it.
    *
    * If neither function is supported by the host environment then attempting to set `CRYPTO` to
    * `true` will fail and an exception will be thrown.
    *
    * If `CRYPTO` is `false` then the source of randomness used will be `Math.random` (which is
    * assumed to generate at least 30 bits of randomness).
    *
    * See `BigNumber.random`.
    *
    * ```ts
    * // Node.js
    * global.crypto = require('crypto')
    *
    * BigNumber.config({ CRYPTO: true })
    * BigNumber.config().CRYPTO       // true
    * BigNumber.random()              // 0.54340758610486147524
    * ```
    */
  var CRYPTO: js.UndefOr[Boolean] = js.undefined
  /**
    * An integer, 0 to 1e+9. Default value: 20.
    *
    * The maximum number of decimal places of the result of operations involving division, i.e.
    * division, square root and base conversion operations, and exponentiation when the exponent is
    * negative.
    *
    * ```ts
    * BigNumber.config({ DECIMAL_PLACES: 5 })
    * BigNumber.set({ DECIMAL_PLACES: 5 })
    * ```
    */
  var DECIMAL_PLACES: js.UndefOr[Double] = js.undefined
  /**
    * An integer, 0 to 1e+9, or an array, [-1e+9 to 0, 0 to 1e+9].
    * Default value: `[-7, 20]`.
    *
    * The exponent value(s) at which `toString` returns exponential notation.
    *
    * If a single number is assigned, the value is the exponent magnitude.
    *
    * If an array of two numbers is assigned then the first number is the negative exponent value at
    * and beneath which exponential notation is used, and the second number is the positive exponent
    * value at and above which exponential notation is used.
    *
    * For example, to emulate JavaScript numbers in terms of the exponent values at which they begin
    * to use exponential notation, use `[-7, 20]`.
    *
    * ```ts
    * BigNumber.config({ EXPONENTIAL_AT: 2 })
    * new BigNumber(12.3)         // '12.3'        e is only 1
    * new BigNumber(123)          // '1.23e+2'
    * new BigNumber(0.123)        // '0.123'       e is only -1
    * new BigNumber(0.0123)       // '1.23e-2'
    *
    * BigNumber.config({ EXPONENTIAL_AT: [-7, 20] })
    * new BigNumber(123456789)    // '123456789'   e is only 8
    * new BigNumber(0.000000123)  // '1.23e-7'
    *
    * // Almost never return exponential notation:
    * BigNumber.config({ EXPONENTIAL_AT: 1e+9 })
    *
    * // Always return exponential notation:
    * BigNumber.config({ EXPONENTIAL_AT: 0 })
    * ```
    *
    * Regardless of the value of `EXPONENTIAL_AT`, the `toFixed` method will always return a value in
    * normal notation and the `toExponential` method will always return a value in exponential form.
    * Calling `toString` with a base argument, e.g. `toString(10)`, will also always return normal
    * notation.
    */
  var EXPONENTIAL_AT: js.UndefOr[Double | (js.Tuple2[Double, Double])] = js.undefined
  /**
    * An object including any number of the properties shown below.
    *
    * The object configures the format of the string returned by the `toFormat` method.
    * The example below shows the properties of the object that are recognised, and
    * their default values.
    *
    * Unlike the other configuration properties, the values of the properties of the `FORMAT` object
    * will not be checked for validity - the existing object will simply be replaced by the object
    * that is passed in.
    *
    * See `toFormat`.
    *
    * ```ts
    * BigNumber.config({
    *   FORMAT: {
    *     // string to prepend
    *     prefix: '',
    *     // the decimal separator
    *     decimalSeparator: '.',
    *     // the grouping separator of the integer part
    *     groupSeparator: ',',
    *     // the primary grouping size of the integer part
    *     groupSize: 3,
    *     // the secondary grouping size of the integer part
    *     secondaryGroupSize: 0,
    *     // the grouping separator of the fraction part
    *     fractionGroupSeparator: ' ',
    *     // the grouping size of the fraction part
    *     fractionGroupSize: 0,
    *     // string to append
    *     suffix: ''
    *   }
    * })
    * ```
    */
  var FORMAT: js.UndefOr[Format] = js.undefined
  /**
    * An integer, 0, 1, 3, 6 or 9. Default value: `BigNumber.ROUND_DOWN` (1).
    *
    * The modulo mode used when calculating the modulus: `a mod n`.
    * The quotient, `q = a / n`, is calculated according to the `ROUNDING_MODE` that corresponds to
    * the chosen `MODULO_MODE`.
    * The remainder, `r`, is calculated as: `r = a - n * q`.
    *
    * The modes that are most commonly used for the modulus/remainder operation are shown in the
    * following table. Although the other rounding modes can be used, they may not give useful
    * results.
    *
    * Property           | Value | Description
    * :------------------|:------|:------------------------------------------------------------------
    *  `ROUND_UP`        |   0   | The remainder is positive if the dividend is negative.
    *  `ROUND_DOWN`      |   1   | The remainder has the same sign as the dividend.
    *                    |       | Uses 'truncating division' and matches JavaScript's `%` operator .
    *  `ROUND_FLOOR`     |   3   | The remainder has the same sign as the divisor.
    *                    |       | This matches Python's `%` operator.
    *  `ROUND_HALF_EVEN` |   6   | The IEEE 754 remainder function.
    *  `EUCLID`          |   9   | The remainder is always positive.
    *                    |       | Euclidian division: `q = sign(n) * floor(a / abs(n))`
    *
    * The rounding/modulo modes are available as enumerated properties of the BigNumber constructor.
    *
    * See `modulo`.
    *
    * ```ts
    * BigNumber.config({ MODULO_MODE: BigNumber.EUCLID })
    * BigNumber.set({ MODULO_MODE: 9 })          // equivalent
    * ```
    */
  var MODULO_MODE: js.UndefOr[ModuloMode] = js.undefined
  /**
    * An integer, 0 to 1e+9. Default value: 0.
    *
    * The maximum precision, i.e. number of significant digits, of the result of the power operation
    * - unless a modulus is specified.
    *
    * If set to 0, the number of significant digits will not be limited.
    *
    * See `exponentiatedBy`.
    *
    * ```ts
    * BigNumber.config({ POW_PRECISION: 100 })
    * ```
    */
  var POW_PRECISION: js.UndefOr[Double] = js.undefined
  /**
    * An integer, magnitude 1 to 1e+9, or an array, [-1e+9 to -1, 1 to 1e+9].
    * Default value: `[-1e+9, 1e+9]`.
    *
    * The exponent value(s) beyond which overflow to Infinity and underflow to zero occurs.
    *
    * If a single number is assigned, it is the maximum exponent magnitude: values wth a positive
    * exponent of greater magnitude become Infinity and those with a negative exponent of greater
    * magnitude become zero.
    *
    * If an array of two numbers is assigned then the first number is the negative exponent limit and
    * the second number is the positive exponent limit.
    *
    * For example, to emulate JavaScript numbers in terms of the exponent values at which they
    * become zero and Infinity, use [-324, 308].
    *
    * ```ts
    * BigNumber.config({ RANGE: 500 })
    * BigNumber.config().RANGE     // [ -500, 500 ]
    * new BigNumber('9.999e499')   // '9.999e+499'
    * new BigNumber('1e500')       // 'Infinity'
    * new BigNumber('1e-499')      // '1e-499'
    * new BigNumber('1e-500')      // '0'
    *
    * BigNumber.config({ RANGE: [-3, 4] })
    * new BigNumber(99999)         // '99999'      e is only 4
    * new BigNumber(100000)        // 'Infinity'   e is 5
    * new BigNumber(0.001)         // '0.01'       e is only -3
    * new BigNumber(0.0001)        // '0'          e is -4
    * ```
    * The largest possible magnitude of a finite BigNumber is 9.999...e+1000000000.
    * The smallest possible magnitude of a non-zero BigNumber is 1e-1000000000.
    */
  var RANGE: js.UndefOr[Double | (js.Tuple2[Double, Double])] = js.undefined
  /**
    * An integer, 0 to 8. Default value: `BigNumber.ROUND_HALF_UP` (4).
    *
    * The rounding mode used in operations that involve division (see `DECIMAL_PLACES`) and the
    * default rounding mode of the `decimalPlaces`, `precision`, `toExponential`, `toFixed`,
    * `toFormat` and `toPrecision` methods.
    *
    * The modes are available as enumerated properties of the BigNumber constructor.
    *
    * ```ts
    * BigNumber.config({ ROUNDING_MODE: 0 })
    * BigNumber.set({ ROUNDING_MODE: BigNumber.ROUND_UP })
    * ```
    */
  var ROUNDING_MODE: js.UndefOr[RoundingMode] = js.undefined
}

object Config {
  @scala.inline
  def apply(
    ALPHABET: String = null,
    CRYPTO: js.UndefOr[Boolean] = js.undefined,
    DECIMAL_PLACES: Int | Double = null,
    EXPONENTIAL_AT: Double | (js.Tuple2[Double, Double]) = null,
    FORMAT: Format = null,
    MODULO_MODE: ModuloMode = null,
    POW_PRECISION: Int | Double = null,
    RANGE: Double | (js.Tuple2[Double, Double]) = null,
    ROUNDING_MODE: RoundingMode = null
  ): Config = {
    val __obj = js.Dynamic.literal()
    if (ALPHABET != null) __obj.updateDynamic("ALPHABET")(ALPHABET)
    if (!js.isUndefined(CRYPTO)) __obj.updateDynamic("CRYPTO")(CRYPTO)
    if (DECIMAL_PLACES != null) __obj.updateDynamic("DECIMAL_PLACES")(DECIMAL_PLACES.asInstanceOf[js.Any])
    if (EXPONENTIAL_AT != null) __obj.updateDynamic("EXPONENTIAL_AT")(EXPONENTIAL_AT.asInstanceOf[js.Any])
    if (FORMAT != null) __obj.updateDynamic("FORMAT")(FORMAT)
    if (MODULO_MODE != null) __obj.updateDynamic("MODULO_MODE")(MODULO_MODE)
    if (POW_PRECISION != null) __obj.updateDynamic("POW_PRECISION")(POW_PRECISION.asInstanceOf[js.Any])
    if (RANGE != null) __obj.updateDynamic("RANGE")(RANGE.asInstanceOf[js.Any])
    if (ROUNDING_MODE != null) __obj.updateDynamic("ROUNDING_MODE")(ROUNDING_MODE)
    __obj.asInstanceOf[Config]
  }
}

