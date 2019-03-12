package typings
package decorumLib.decorumMod.decorumNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MinLengthValidator extends BaseValidator {
  var minLength: scala.Double
  def isValid(value: java.lang.String): scala.Boolean
}

object MinLengthValidator {
  @scala.inline
  def apply(
    getCustomMessage: IMessageOpts => java.lang.String,
    getKey: () => java.lang.String,
    getMessage: IMessageOpts => java.lang.String,
    hasCustomMessage: scala.Boolean,
    isValid: java.lang.String => scala.Boolean,
    minLength: scala.Double,
    validatesEmptyValue: () => scala.Boolean
  ): MinLengthValidator = {
    val __obj = js.Dynamic.literal(getCustomMessage = js.Any.fromFunction1(getCustomMessage), getKey = js.Any.fromFunction0(getKey), getMessage = js.Any.fromFunction1(getMessage), hasCustomMessage = hasCustomMessage, isValid = js.Any.fromFunction1(isValid), minLength = minLength, validatesEmptyValue = js.Any.fromFunction0(validatesEmptyValue))
  
    __obj.asInstanceOf[MinLengthValidator]
  }
}

