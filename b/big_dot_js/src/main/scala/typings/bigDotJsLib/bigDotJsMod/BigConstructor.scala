package typings
package bigDotJsLib.bigDotJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BigConstructor
  extends /**
     * Returns a new instance of a Big number object
     *
     * String values may be in exponential, as well as normal (non-exponential) notation.
     * There is no limit to the number of digits of a string value (other than that of Javascript's maximum array size), but the largest recommended exponent magnitude is 1e+6.
     * Infinity, NaN and hexadecimal literal strings, e.g. '0xff', are not valid.
     * String values in octal literal form will be interpreted as decimals, e.g. '011' is 11, not 9.
     *
     * @throws `NaN` on an invalid value.
     */
ScalablyTyped.runtime.Instantiable1[/* value */ BigSource, Big] {
  /**
       * The maximum number of decimal places of the results of operations involving division.
       * It is relevant only to the div and sqrt methods, and the pow method when the exponent is negative.
       *
       * 0 to 1e+6 inclusive
       * Default value: 20
       */
  var DP: scala.Double = js.native
  /**
       * The negative exponent value at and below which toString returns exponential notation.
       *
       * -1e+6 to 0 inclusive
       * Default value: -7
       */
  var NE: scala.Double = js.native
  /**
       * The positive exponent value at and above which toString returns exponential notation.
       *
       * 0 to 1e+6 inclusive
       * Default value: 21
       */
  var PE: scala.Double = js.native
  /**
       * The rounding mode used in the above operations and by round, toExponential, toFixed and toPrecision.
       * Default value: 1
       */
  var RM: scala.Double = js.native
  /**
       * Create an additional Big number constructor
       *
       * Values created with the returned constructor will have a separate set of configuration values.
       * This can be used to create Big objects with different DP and RM values.
       * Big numbers created by different constructors can be used together in operations, and it is the DP and RM setting of the Big number that an operation is called upon that will apply.
       * In the interest of memory efficiency, all Big number constructors share the same prototype object,
       * so while the DP and RM (and any other own properties) of a constructor are isolated and untouchable by another, its prototype methods are not.
       */
  def apply(): BigConstructor = js.native
  /**
       * Returns a new instance of a Big number object
       *
       * String values may be in exponential, as well as normal (non-exponential) notation.
       * There is no limit to the number of digits of a string value (other than that of Javascript's maximum array size), but the largest recommended exponent magnitude is 1e+6.
       * Infinity, NaN and hexadecimal literal strings, e.g. '0xff', are not valid.
       * String values in octal literal form will be interpreted as decimals, e.g. '011' is 11, not 9.
       *
       * @throws `NaN` on an invalid value.
       */
  def apply(value: BigSource): Big = js.native
}

