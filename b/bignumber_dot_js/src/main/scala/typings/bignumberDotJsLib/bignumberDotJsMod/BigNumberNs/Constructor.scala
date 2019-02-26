package typings
package bignumberDotJsLib.bignumberDotJsMod.BigNumberNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Constructor
  extends org.scalablytyped.runtime.Instantiable1[/* n */ Value, bignumberDotJsLib.bignumberDotJsMod.BigNumber]
     with org.scalablytyped.runtime.Instantiable2[
      /* n */ Value, 
      /* base */ scala.Double, 
      bignumberDotJsLib.bignumberDotJsMod.BigNumber
    ] {
  /** Helps ES6 import. */
  val BigNumber: /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt $anonfun#applyOrElse Simplified recursive type alias bignumber.js.bignumber.js.BigNumber.Constructor */ js.UndefOr[
    /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt $anonfun#applyOrElse Simplified recursive type alias bignumber.js.bignumber.js.BigNumber.Constructor */ js.Object
  ] = js.native
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
  var DEBUG: js.UndefOr[scala.Boolean] = js.native
  /** See `MODULO_MODE`. */
  val EUCLID: bignumberDotJsLib.bignumberDotJsLibNumbers.`9` = js.native
  /** Rounds towards Infinity. */
  val ROUND_CEIL: bignumberDotJsLib.bignumberDotJsLibNumbers.`2` = js.native
  /** Rounds towards zero. */
  val ROUND_DOWN: bignumberDotJsLib.bignumberDotJsLibNumbers.`1` = js.native
  /** Rounds towards -Infinity. */
  val ROUND_FLOOR: bignumberDotJsLib.bignumberDotJsLibNumbers.`3` = js.native
  /** Rounds towards nearest neighbour. If equidistant, rounds towards Infinity. */
  val ROUND_HALF_CEIL: bignumberDotJsLib.bignumberDotJsLibNumbers.`7` = js.native
  /** Rounds towards nearest neighbour. If equidistant, rounds towards zero. */
  val ROUND_HALF_DOWN: bignumberDotJsLib.bignumberDotJsLibNumbers.`5` = js.native
  /** Rounds towards nearest neighbour. If equidistant, rounds towards even neighbour. */
  val ROUND_HALF_EVEN: bignumberDotJsLib.bignumberDotJsLibNumbers.`6` = js.native
  /** Rounds towards nearest neighbour. If equidistant, rounds towards -Infinity. */
  val ROUND_HALF_FLOOR: bignumberDotJsLib.bignumberDotJsLibNumbers.`8` = js.native
  /** Rounds towards nearest neighbour. If equidistant, rounds away from zero . */
  val ROUND_HALF_UP: bignumberDotJsLib.bignumberDotJsLibNumbers.`4` = js.native
  /** Rounds away from zero. */
  val ROUND_UP: bignumberDotJsLib.bignumberDotJsLibNumbers.`0` = js.native
  /** Helps ES6 import. */
  val default: /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt $anonfun#applyOrElse Simplified recursive type alias bignumber.js.bignumber.js.BigNumber.Constructor */ js.UndefOr[
    /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt $anonfun#applyOrElse Simplified recursive type alias bignumber.js.bignumber.js.BigNumber.Constructor */ js.Object
  ] = js.native
  def clone(`object`: Config): /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt $anonfun#applyOrElse Simplified recursive type alias bignumber.js.bignumber.js.BigNumber.Constructor */ js.Object = js.native
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
  def isBigNumber(value: js.Any): /* is bignumber.js.bignumber.js.BigNumber */ scala.Boolean = js.native
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
  def max(n: Value*): bignumberDotJsLib.bignumberDotJsMod.BigNumber = js.native
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
  def maximum(n: Value*): bignumberDotJsLib.bignumberDotJsMod.BigNumber = js.native
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
  def min(n: Value*): bignumberDotJsLib.bignumberDotJsMod.BigNumber = js.native
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
  def minimum(n: Value*): bignumberDotJsLib.bignumberDotJsMod.BigNumber = js.native
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
  def random(): bignumberDotJsLib.bignumberDotJsMod.BigNumber = js.native
  def random(decimalPlaces: scala.Double): bignumberDotJsLib.bignumberDotJsMod.BigNumber = js.native
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
  def sum(n: Value*): bignumberDotJsLib.bignumberDotJsMod.BigNumber = js.native
}

