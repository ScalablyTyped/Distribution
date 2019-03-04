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
    getCustomMessage: js.Function1[IMessageOpts, java.lang.String],
    getKey: js.Function0[java.lang.String],
    getMessage: js.Function1[IMessageOpts, java.lang.String],
    hasCustomMessage: scala.Boolean,
    isValid: js.Function1[java.lang.String, scala.Boolean],
    minLength: scala.Double,
    validatesEmptyValue: js.Function0[scala.Boolean]
  ): MinLengthValidator = {
    val __obj = js.Dynamic.literal(getCustomMessage = getCustomMessage, getKey = getKey, getMessage = getMessage, hasCustomMessage = hasCustomMessage, isValid = isValid, minLength = minLength, validatesEmptyValue = validatesEmptyValue)
  
    __obj.asInstanceOf[MinLengthValidator]
  }
}

