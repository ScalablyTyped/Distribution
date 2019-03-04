package typings
package decorumLib.decorumMod.decorumNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PatternValidator extends BaseValidator {
  var pattern: stdLib.RegExp
  def isValid(value: js.Any): scala.Boolean
}

object PatternValidator {
  @scala.inline
  def apply(
    getCustomMessage: js.Function1[IMessageOpts, java.lang.String],
    getKey: js.Function0[java.lang.String],
    getMessage: js.Function1[IMessageOpts, java.lang.String],
    hasCustomMessage: scala.Boolean,
    isValid: js.Function1[js.Any, scala.Boolean],
    pattern: stdLib.RegExp,
    validatesEmptyValue: js.Function0[scala.Boolean]
  ): PatternValidator = {
    val __obj = js.Dynamic.literal(getCustomMessage = getCustomMessage, getKey = getKey, getMessage = getMessage, hasCustomMessage = hasCustomMessage, isValid = isValid, pattern = pattern, validatesEmptyValue = validatesEmptyValue)
  
    __obj.asInstanceOf[PatternValidator]
  }
}

