package typings
package decorumLib.decorumMod.decorumNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RequiredFieldValidator extends BaseValidator {
  def isValid(value: js.Any): scala.Boolean
}

object RequiredFieldValidator {
  @scala.inline
  def apply(
    getCustomMessage: js.Function1[IMessageOpts, java.lang.String],
    getKey: js.Function0[java.lang.String],
    getMessage: js.Function1[IMessageOpts, java.lang.String],
    hasCustomMessage: scala.Boolean,
    isValid: js.Function1[js.Any, scala.Boolean],
    validatesEmptyValue: js.Function0[scala.Boolean]
  ): RequiredFieldValidator = {
    val __obj = js.Dynamic.literal(getCustomMessage = getCustomMessage, getKey = getKey, getMessage = getMessage, hasCustomMessage = hasCustomMessage, isValid = isValid, validatesEmptyValue = validatesEmptyValue)
  
    __obj.asInstanceOf[RequiredFieldValidator]
  }
}

