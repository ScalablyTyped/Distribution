package typings.bignumberJs

import org.scalablytyped.runtime.StringDictionary
import typings.bignumberJs.bignumberJsBooleans.`true`
import typings.bignumberJs.bignumberJsInts.`0`
import typings.bignumberJs.bignumberJsInts.`1`
import typings.bignumberJs.bignumberJsInts.`2`
import typings.bignumberJs.bignumberJsInts.`3`
import typings.bignumberJs.bignumberJsInts.`4`
import typings.bignumberJs.bignumberJsInts.`5`
import typings.bignumberJs.bignumberJsInts.`6`
import typings.bignumberJs.bignumberJsInts.`7`
import typings.bignumberJs.bignumberJsInts.`8`
import typings.bignumberJs.bignumberJsInts.`9`
import typings.bignumberJs.mod.BigNumber.Config
import typings.bignumberJs.mod.BigNumber.Constructor
import typings.bignumberJs.mod.BigNumber.Format
import typings.bignumberJs.mod.BigNumber.Instance
import typings.bignumberJs.mod.BigNumber.RoundingMode
import typings.bignumberJs.mod.BigNumber.Value
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("bignumber.js", JSImport.Default)
  @js.native
  open class default protected () extends BigNumber {
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
  object default {
    
    inline def apply(n: Value): typings.bignumberJs.mod.BigNumber = ^.asInstanceOf[js.Dynamic].apply(n.asInstanceOf[js.Any]).asInstanceOf[typings.bignumberJs.mod.BigNumber]
    inline def apply(n: Value, base: Double): typings.bignumberJs.mod.BigNumber = (^.asInstanceOf[js.Dynamic].apply(n.asInstanceOf[js.Any], base.asInstanceOf[js.Any])).asInstanceOf[typings.bignumberJs.mod.BigNumber]
    
    @JSImport("bignumber.js", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    /** Helps ES6 import. */
    @JSImport("bignumber.js", "default.default")
    @js.native
    val default: js.UndefOr[Constructor] = js.native
    
    /** Helps ES6 import. */
    @JSImport("bignumber.js", "default.BigNumber")
    @js.native
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
    @JSImport("bignumber.js", "default.DEBUG")
    @js.native
    def DEBUG: js.UndefOr[Boolean] = js.native
    inline def DEBUG_=(x: js.UndefOr[Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DEBUG")(x.asInstanceOf[js.Any])
    
    /** See `MODULO_MODE`. */
    @JSImport("bignumber.js", "default.EUCLID")
    @js.native
    val EUCLID: `9` = js.native
    
    /** Rounds towards Infinity. */
    @JSImport("bignumber.js", "default.ROUND_CEIL")
    @js.native
    val ROUND_CEIL: `2` = js.native
    
    /** Rounds towards zero. */
    @JSImport("bignumber.js", "default.ROUND_DOWN")
    @js.native
    val ROUND_DOWN: `1` = js.native
    
    /** Rounds towards -Infinity. */
    @JSImport("bignumber.js", "default.ROUND_FLOOR")
    @js.native
    val ROUND_FLOOR: `3` = js.native
    
    /** Rounds towards nearest neighbour. If equidistant, rounds towards Infinity. */
    @JSImport("bignumber.js", "default.ROUND_HALF_CEIL")
    @js.native
    val ROUND_HALF_CEIL: `7` = js.native
    
    /** Rounds towards nearest neighbour. If equidistant, rounds towards zero. */
    @JSImport("bignumber.js", "default.ROUND_HALF_DOWN")
    @js.native
    val ROUND_HALF_DOWN: `5` = js.native
    
    /** Rounds towards nearest neighbour. If equidistant, rounds towards even neighbour. */
    @JSImport("bignumber.js", "default.ROUND_HALF_EVEN")
    @js.native
    val ROUND_HALF_EVEN: `6` = js.native
    
    /** Rounds towards nearest neighbour. If equidistant, rounds towards -Infinity. */
    @JSImport("bignumber.js", "default.ROUND_HALF_FLOOR")
    @js.native
    val ROUND_HALF_FLOOR: `8` = js.native
    
    /** Rounds towards nearest neighbour. If equidistant, rounds away from zero . */
    @JSImport("bignumber.js", "default.ROUND_HALF_UP")
    @js.native
    val ROUND_HALF_UP: `4` = js.native
    
    /** Rounds away from zero. */
    @JSImport("bignumber.js", "default.ROUND_UP")
    @js.native
    val ROUND_UP: `0` = js.native
    
    inline def clone(`object`: Config): Constructor = ^.asInstanceOf[js.Dynamic].applyDynamic("clone")(`object`.asInstanceOf[js.Any]).asInstanceOf[Constructor]
    
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
    inline def config(`object`: Config): Config = ^.asInstanceOf[js.Dynamic].applyDynamic("config")(`object`.asInstanceOf[js.Any]).asInstanceOf[Config]
    
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
    inline def isBigNumber(value: Any): /* is bignumber.js.bignumber.js.BigNumber */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isBigNumber")(value.asInstanceOf[js.Any]).asInstanceOf[/* is bignumber.js.bignumber.js.BigNumber */ Boolean]
    
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
    inline def max(n: Value*): typings.bignumberJs.mod.BigNumber = ^.asInstanceOf[js.Dynamic].applyDynamic("max")(n.asInstanceOf[Seq[js.Any]]*).asInstanceOf[typings.bignumberJs.mod.BigNumber]
    
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
    inline def maximum(n: Value*): typings.bignumberJs.mod.BigNumber = ^.asInstanceOf[js.Dynamic].applyDynamic("maximum")(n.asInstanceOf[Seq[js.Any]]*).asInstanceOf[typings.bignumberJs.mod.BigNumber]
    
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
    inline def min(n: Value*): typings.bignumberJs.mod.BigNumber = ^.asInstanceOf[js.Dynamic].applyDynamic("min")(n.asInstanceOf[Seq[js.Any]]*).asInstanceOf[typings.bignumberJs.mod.BigNumber]
    
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
    inline def minimum(n: Value*): typings.bignumberJs.mod.BigNumber = ^.asInstanceOf[js.Dynamic].applyDynamic("minimum")(n.asInstanceOf[Seq[js.Any]]*).asInstanceOf[typings.bignumberJs.mod.BigNumber]
    
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
    inline def random(): typings.bignumberJs.mod.BigNumber = ^.asInstanceOf[js.Dynamic].applyDynamic("random")().asInstanceOf[typings.bignumberJs.mod.BigNumber]
    inline def random(decimalPlaces: Double): typings.bignumberJs.mod.BigNumber = ^.asInstanceOf[js.Dynamic].applyDynamic("random")(decimalPlaces.asInstanceOf[js.Any]).asInstanceOf[typings.bignumberJs.mod.BigNumber]
    
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
    inline def set(`object`: Config): Config = ^.asInstanceOf[js.Dynamic].applyDynamic("set")(`object`.asInstanceOf[js.Any]).asInstanceOf[Config]
    
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
    inline def sum(n: Value*): typings.bignumberJs.mod.BigNumber = ^.asInstanceOf[js.Dynamic].applyDynamic("sum")(n.asInstanceOf[Seq[js.Any]]*).asInstanceOf[typings.bignumberJs.mod.BigNumber]
  }
  
  @JSImport("bignumber.js", "BigNumber")
  @js.native
  open class BigNumber protected ()
    extends StObject
       with Instance {
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
    /* private */ val _isBigNumber: `true` = js.native
    
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
    
    /** The coefficient of the value of this BigNumber, an array of base 1e14 integer numbers, or null. */
    /* CompleteClass */
    override val c: js.Array[Double] | Null = js.native
    
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
    def decimalPlaces(): Double | Null = js.native
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
    def dp(): Double | Null = js.native
    def dp(decimalPlaces: Double): BigNumber = js.native
    def dp(decimalPlaces: Double, roundingMode: RoundingMode): BigNumber = js.native
    
    /** The exponent of the value of this BigNumber, an integer number, -1000000000 to 1000000000, or null. */
    /* CompleteClass */
    override val e: Double | Null = js.native
    
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
      * BigNumber(0.7).plus(x).plus(y)  // '1.1'
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
    
    /** The sign of the value of this BigNumber, -1, 1, or null. */
    /* CompleteClass */
    override val s: Double | Null = js.native
    
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
  /* static members */
  object BigNumber {
    
    inline def apply(n: Value): typings.bignumberJs.mod.BigNumber = ^.asInstanceOf[js.Dynamic].apply(n.asInstanceOf[js.Any]).asInstanceOf[typings.bignumberJs.mod.BigNumber]
    inline def apply(n: Value, base: Double): typings.bignumberJs.mod.BigNumber = (^.asInstanceOf[js.Dynamic].apply(n.asInstanceOf[js.Any], base.asInstanceOf[js.Any])).asInstanceOf[typings.bignumberJs.mod.BigNumber]
    
    @JSImport("bignumber.js", "BigNumber")
    @js.native
    val ^ : js.Any = js.native
    
    /** Helps ES6 import. */
    @JSImport("bignumber.js", "BigNumber.default")
    @js.native
    val default: js.UndefOr[Constructor] = js.native
    
    /** Helps ES6 import. */
    @JSImport("bignumber.js", "BigNumber.BigNumber")
    @js.native
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
    @JSImport("bignumber.js", "BigNumber.DEBUG")
    @js.native
    def DEBUG: js.UndefOr[Boolean] = js.native
    inline def DEBUG_=(x: js.UndefOr[Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DEBUG")(x.asInstanceOf[js.Any])
    
    /** See `MODULO_MODE`. */
    @JSImport("bignumber.js", "BigNumber.EUCLID")
    @js.native
    val EUCLID: `9` = js.native
    
    /** Rounds towards Infinity. */
    @JSImport("bignumber.js", "BigNumber.ROUND_CEIL")
    @js.native
    val ROUND_CEIL: `2` = js.native
    
    /** Rounds towards zero. */
    @JSImport("bignumber.js", "BigNumber.ROUND_DOWN")
    @js.native
    val ROUND_DOWN: `1` = js.native
    
    /** Rounds towards -Infinity. */
    @JSImport("bignumber.js", "BigNumber.ROUND_FLOOR")
    @js.native
    val ROUND_FLOOR: `3` = js.native
    
    /** Rounds towards nearest neighbour. If equidistant, rounds towards Infinity. */
    @JSImport("bignumber.js", "BigNumber.ROUND_HALF_CEIL")
    @js.native
    val ROUND_HALF_CEIL: `7` = js.native
    
    /** Rounds towards nearest neighbour. If equidistant, rounds towards zero. */
    @JSImport("bignumber.js", "BigNumber.ROUND_HALF_DOWN")
    @js.native
    val ROUND_HALF_DOWN: `5` = js.native
    
    /** Rounds towards nearest neighbour. If equidistant, rounds towards even neighbour. */
    @JSImport("bignumber.js", "BigNumber.ROUND_HALF_EVEN")
    @js.native
    val ROUND_HALF_EVEN: `6` = js.native
    
    /** Rounds towards nearest neighbour. If equidistant, rounds towards -Infinity. */
    @JSImport("bignumber.js", "BigNumber.ROUND_HALF_FLOOR")
    @js.native
    val ROUND_HALF_FLOOR: `8` = js.native
    
    /** Rounds towards nearest neighbour. If equidistant, rounds away from zero . */
    @JSImport("bignumber.js", "BigNumber.ROUND_HALF_UP")
    @js.native
    val ROUND_HALF_UP: `4` = js.native
    
    /** Rounds away from zero. */
    @JSImport("bignumber.js", "BigNumber.ROUND_UP")
    @js.native
    val ROUND_UP: `0` = js.native
    
    inline def clone(`object`: Config): Constructor = ^.asInstanceOf[js.Dynamic].applyDynamic("clone")(`object`.asInstanceOf[js.Any]).asInstanceOf[Constructor]
    
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
    inline def config(`object`: Config): Config = ^.asInstanceOf[js.Dynamic].applyDynamic("config")(`object`.asInstanceOf[js.Any]).asInstanceOf[Config]
    
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
    inline def isBigNumber(value: Any): /* is bignumber.js.bignumber.js.BigNumber */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isBigNumber")(value.asInstanceOf[js.Any]).asInstanceOf[/* is bignumber.js.bignumber.js.BigNumber */ Boolean]
    
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
    inline def max(n: Value*): typings.bignumberJs.mod.BigNumber = ^.asInstanceOf[js.Dynamic].applyDynamic("max")(n.asInstanceOf[Seq[js.Any]]*).asInstanceOf[typings.bignumberJs.mod.BigNumber]
    
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
    inline def maximum(n: Value*): typings.bignumberJs.mod.BigNumber = ^.asInstanceOf[js.Dynamic].applyDynamic("maximum")(n.asInstanceOf[Seq[js.Any]]*).asInstanceOf[typings.bignumberJs.mod.BigNumber]
    
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
    inline def min(n: Value*): typings.bignumberJs.mod.BigNumber = ^.asInstanceOf[js.Dynamic].applyDynamic("min")(n.asInstanceOf[Seq[js.Any]]*).asInstanceOf[typings.bignumberJs.mod.BigNumber]
    
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
    inline def minimum(n: Value*): typings.bignumberJs.mod.BigNumber = ^.asInstanceOf[js.Dynamic].applyDynamic("minimum")(n.asInstanceOf[Seq[js.Any]]*).asInstanceOf[typings.bignumberJs.mod.BigNumber]
    
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
    inline def random(): typings.bignumberJs.mod.BigNumber = ^.asInstanceOf[js.Dynamic].applyDynamic("random")().asInstanceOf[typings.bignumberJs.mod.BigNumber]
    inline def random(decimalPlaces: Double): typings.bignumberJs.mod.BigNumber = ^.asInstanceOf[js.Dynamic].applyDynamic("random")(decimalPlaces.asInstanceOf[js.Any]).asInstanceOf[typings.bignumberJs.mod.BigNumber]
    
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
    inline def set(`object`: Config): Config = ^.asInstanceOf[js.Dynamic].applyDynamic("set")(`object`.asInstanceOf[js.Any]).asInstanceOf[Config]
    
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
    inline def sum(n: Value*): typings.bignumberJs.mod.BigNumber = ^.asInstanceOf[js.Dynamic].applyDynamic("sum")(n.asInstanceOf[Seq[js.Any]]*).asInstanceOf[typings.bignumberJs.mod.BigNumber]
    
    /** See `BigNumber.config` (alias `BigNumber.set`) and `BigNumber.clone`. */
    trait Config extends StObject {
      
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
      
      inline def apply(): Config = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[Config]
      }
      
      extension [Self <: Config](x: Self) {
        
        inline def setALPHABET(value: String): Self = StObject.set(x, "ALPHABET", value.asInstanceOf[js.Any])
        
        inline def setALPHABETUndefined: Self = StObject.set(x, "ALPHABET", js.undefined)
        
        inline def setCRYPTO(value: Boolean): Self = StObject.set(x, "CRYPTO", value.asInstanceOf[js.Any])
        
        inline def setCRYPTOUndefined: Self = StObject.set(x, "CRYPTO", js.undefined)
        
        inline def setDECIMAL_PLACES(value: Double): Self = StObject.set(x, "DECIMAL_PLACES", value.asInstanceOf[js.Any])
        
        inline def setDECIMAL_PLACESUndefined: Self = StObject.set(x, "DECIMAL_PLACES", js.undefined)
        
        inline def setEXPONENTIAL_AT(value: Double | (js.Tuple2[Double, Double])): Self = StObject.set(x, "EXPONENTIAL_AT", value.asInstanceOf[js.Any])
        
        inline def setEXPONENTIAL_ATUndefined: Self = StObject.set(x, "EXPONENTIAL_AT", js.undefined)
        
        inline def setFORMAT(value: Format): Self = StObject.set(x, "FORMAT", value.asInstanceOf[js.Any])
        
        inline def setFORMATUndefined: Self = StObject.set(x, "FORMAT", js.undefined)
        
        inline def setMODULO_MODE(value: ModuloMode): Self = StObject.set(x, "MODULO_MODE", value.asInstanceOf[js.Any])
        
        inline def setMODULO_MODEUndefined: Self = StObject.set(x, "MODULO_MODE", js.undefined)
        
        inline def setPOW_PRECISION(value: Double): Self = StObject.set(x, "POW_PRECISION", value.asInstanceOf[js.Any])
        
        inline def setPOW_PRECISIONUndefined: Self = StObject.set(x, "POW_PRECISION", js.undefined)
        
        inline def setRANGE(value: Double | (js.Tuple2[Double, Double])): Self = StObject.set(x, "RANGE", value.asInstanceOf[js.Any])
        
        inline def setRANGEUndefined: Self = StObject.set(x, "RANGE", js.undefined)
        
        inline def setROUNDING_MODE(value: RoundingMode): Self = StObject.set(x, "ROUNDING_MODE", value.asInstanceOf[js.Any])
        
        inline def setROUNDING_MODEUndefined: Self = StObject.set(x, "ROUNDING_MODE", js.undefined)
      }
    }
    
    type Constructor = js.Function2[/* n */ Value, /* base */ js.UndefOr[Double], typings.bignumberJs.mod.BigNumber]
    
    /** See `FORMAT` and `toFormat`. */
    trait Format extends StObject {
      
      /** The decimal separator. */
      var decimalSeparator: js.UndefOr[String] = js.undefined
      
      /** The grouping separator of the fraction part. */
      var fractionGroupSeparator: js.UndefOr[String] = js.undefined
      
      /** The grouping size of the fraction part. */
      var fractionGroupSize: js.UndefOr[Double] = js.undefined
      
      /** The grouping separator of the integer part. */
      var groupSeparator: js.UndefOr[String] = js.undefined
      
      /** The primary grouping size of the integer part. */
      var groupSize: js.UndefOr[Double] = js.undefined
      
      /** The string to prepend. */
      var prefix: js.UndefOr[String] = js.undefined
      
      /** The secondary grouping size of the integer part. */
      var secondaryGroupSize: js.UndefOr[Double] = js.undefined
      
      /** The string to append. */
      var suffix: js.UndefOr[String] = js.undefined
    }
    object Format {
      
      inline def apply(): Format = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[Format]
      }
      
      extension [Self <: Format](x: Self) {
        
        inline def setDecimalSeparator(value: String): Self = StObject.set(x, "decimalSeparator", value.asInstanceOf[js.Any])
        
        inline def setDecimalSeparatorUndefined: Self = StObject.set(x, "decimalSeparator", js.undefined)
        
        inline def setFractionGroupSeparator(value: String): Self = StObject.set(x, "fractionGroupSeparator", value.asInstanceOf[js.Any])
        
        inline def setFractionGroupSeparatorUndefined: Self = StObject.set(x, "fractionGroupSeparator", js.undefined)
        
        inline def setFractionGroupSize(value: Double): Self = StObject.set(x, "fractionGroupSize", value.asInstanceOf[js.Any])
        
        inline def setFractionGroupSizeUndefined: Self = StObject.set(x, "fractionGroupSize", js.undefined)
        
        inline def setGroupSeparator(value: String): Self = StObject.set(x, "groupSeparator", value.asInstanceOf[js.Any])
        
        inline def setGroupSeparatorUndefined: Self = StObject.set(x, "groupSeparator", js.undefined)
        
        inline def setGroupSize(value: Double): Self = StObject.set(x, "groupSize", value.asInstanceOf[js.Any])
        
        inline def setGroupSizeUndefined: Self = StObject.set(x, "groupSize", js.undefined)
        
        inline def setPrefix(value: String): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
        
        inline def setPrefixUndefined: Self = StObject.set(x, "prefix", js.undefined)
        
        inline def setSecondaryGroupSize(value: Double): Self = StObject.set(x, "secondaryGroupSize", value.asInstanceOf[js.Any])
        
        inline def setSecondaryGroupSizeUndefined: Self = StObject.set(x, "secondaryGroupSize", js.undefined)
        
        inline def setSuffix(value: String): Self = StObject.set(x, "suffix", value.asInstanceOf[js.Any])
        
        inline def setSuffixUndefined: Self = StObject.set(x, "suffix", js.undefined)
      }
    }
    
    trait Instance
      extends StObject
         with /* key */ StringDictionary[Any] {
      
      /** The coefficient of the value of this BigNumber, an array of base 1e14 integer numbers, or null. */
      val c: js.Array[Double] | Null
      
      /** The exponent of the value of this BigNumber, an integer number, -1000000000 to 1000000000, or null. */
      val e: Double | Null
      
      /** The sign of the value of this BigNumber, -1, 1, or null. */
      val s: Double | Null
    }
    object Instance {
      
      inline def apply(): Instance = {
        val __obj = js.Dynamic.literal(c = null, e = null, s = null)
        __obj.asInstanceOf[Instance]
      }
      
      extension [Self <: Instance](x: Self) {
        
        inline def setC(value: js.Array[Double]): Self = StObject.set(x, "c", value.asInstanceOf[js.Any])
        
        inline def setCNull: Self = StObject.set(x, "c", null)
        
        inline def setCVarargs(value: Double*): Self = StObject.set(x, "c", js.Array(value*))
        
        inline def setE(value: Double): Self = StObject.set(x, "e", value.asInstanceOf[js.Any])
        
        inline def setENull: Self = StObject.set(x, "e", null)
        
        inline def setS(value: Double): Self = StObject.set(x, "s", value.asInstanceOf[js.Any])
        
        inline def setSNull: Self = StObject.set(x, "s", null)
      }
    }
    
    /* Rewritten from type alias, can be one of: 
      - typings.bignumberJs.bignumberJsInts.`0`
      - typings.bignumberJs.bignumberJsInts.`1`
      - typings.bignumberJs.bignumberJsInts.`3`
      - typings.bignumberJs.bignumberJsInts.`6`
      - typings.bignumberJs.bignumberJsInts.`9`
    */
    trait ModuloMode extends StObject
    object ModuloMode {
      
      inline def `0`: typings.bignumberJs.bignumberJsInts.`0` = 0.asInstanceOf[typings.bignumberJs.bignumberJsInts.`0`]
      
      inline def `1`: typings.bignumberJs.bignumberJsInts.`1` = 1.asInstanceOf[typings.bignumberJs.bignumberJsInts.`1`]
      
      inline def `3`: typings.bignumberJs.bignumberJsInts.`3` = 3.asInstanceOf[typings.bignumberJs.bignumberJsInts.`3`]
      
      inline def `6`: typings.bignumberJs.bignumberJsInts.`6` = 6.asInstanceOf[typings.bignumberJs.bignumberJsInts.`6`]
      
      inline def `9`: typings.bignumberJs.bignumberJsInts.`9` = 9.asInstanceOf[typings.bignumberJs.bignumberJsInts.`9`]
    }
    
    /* Rewritten from type alias, can be one of: 
      - typings.bignumberJs.bignumberJsInts.`0`
      - typings.bignumberJs.bignumberJsInts.`1`
      - typings.bignumberJs.bignumberJsInts.`2`
      - typings.bignumberJs.bignumberJsInts.`3`
      - typings.bignumberJs.bignumberJsInts.`4`
      - typings.bignumberJs.bignumberJsInts.`5`
      - typings.bignumberJs.bignumberJsInts.`6`
      - typings.bignumberJs.bignumberJsInts.`7`
      - typings.bignumberJs.bignumberJsInts.`8`
    */
    trait RoundingMode extends StObject
    object RoundingMode {
      
      inline def `0`: typings.bignumberJs.bignumberJsInts.`0` = 0.asInstanceOf[typings.bignumberJs.bignumberJsInts.`0`]
      
      inline def `1`: typings.bignumberJs.bignumberJsInts.`1` = 1.asInstanceOf[typings.bignumberJs.bignumberJsInts.`1`]
      
      inline def `2`: typings.bignumberJs.bignumberJsInts.`2` = 2.asInstanceOf[typings.bignumberJs.bignumberJsInts.`2`]
      
      inline def `3`: typings.bignumberJs.bignumberJsInts.`3` = 3.asInstanceOf[typings.bignumberJs.bignumberJsInts.`3`]
      
      inline def `4`: typings.bignumberJs.bignumberJsInts.`4` = 4.asInstanceOf[typings.bignumberJs.bignumberJsInts.`4`]
      
      inline def `5`: typings.bignumberJs.bignumberJsInts.`5` = 5.asInstanceOf[typings.bignumberJs.bignumberJsInts.`5`]
      
      inline def `6`: typings.bignumberJs.bignumberJsInts.`6` = 6.asInstanceOf[typings.bignumberJs.bignumberJsInts.`6`]
      
      inline def `7`: typings.bignumberJs.bignumberJsInts.`7` = 7.asInstanceOf[typings.bignumberJs.bignumberJsInts.`7`]
      
      inline def `8`: typings.bignumberJs.bignumberJsInts.`8` = 8.asInstanceOf[typings.bignumberJs.bignumberJsInts.`8`]
    }
    
    type Value = String | Double | Instance
  }
}
