package typings
package decorumLib.decorumMod.decorumNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LengthValidator extends BaseValidator {
  var length: scala.Double
  def isValid(value: js.Any): scala.Boolean
}

object LengthValidator {
  @scala.inline
  def apply(
    getCustomMessage: IMessageOpts => java.lang.String,
    getKey: () => java.lang.String,
    getMessage: IMessageOpts => java.lang.String,
    hasCustomMessage: scala.Boolean,
    isValid: js.Any => scala.Boolean,
    length: scala.Double,
    validatesEmptyValue: () => scala.Boolean
  ): LengthValidator = {
    val __obj = js.Dynamic.literal(getCustomMessage = js.Any.fromFunction1(getCustomMessage), getKey = js.Any.fromFunction0(getKey), getMessage = js.Any.fromFunction1(getMessage), hasCustomMessage = hasCustomMessage, isValid = js.Any.fromFunction1(isValid), length = length, validatesEmptyValue = js.Any.fromFunction0(validatesEmptyValue))
  
    __obj.asInstanceOf[LengthValidator]
  }
}

