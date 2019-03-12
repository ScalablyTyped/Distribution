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
    getCustomMessage: IMessageOpts => java.lang.String,
    getKey: () => java.lang.String,
    getMessage: IMessageOpts => java.lang.String,
    hasCustomMessage: scala.Boolean,
    isValid: js.Any => scala.Boolean,
    validatesEmptyValue: () => scala.Boolean
  ): RequiredFieldValidator = {
    val __obj = js.Dynamic.literal(getCustomMessage = js.Any.fromFunction1(getCustomMessage), getKey = js.Any.fromFunction0(getKey), getMessage = js.Any.fromFunction1(getMessage), hasCustomMessage = hasCustomMessage, isValid = js.Any.fromFunction1(isValid), validatesEmptyValue = js.Any.fromFunction0(validatesEmptyValue))
  
    __obj.asInstanceOf[RequiredFieldValidator]
  }
}

