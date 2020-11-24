package typings.bigJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("big.js", "Big")
@js.native
class BigCls protected () extends Big {
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
  def this(value: BigSource) = this()
}
