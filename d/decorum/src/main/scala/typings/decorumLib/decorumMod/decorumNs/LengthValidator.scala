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
    getCustomMessage: js.Function1[IMessageOpts, java.lang.String],
    getKey: js.Function0[java.lang.String],
    getMessage: js.Function1[IMessageOpts, java.lang.String],
    hasCustomMessage: scala.Boolean,
    isValid: js.Function1[js.Any, scala.Boolean],
    length: scala.Double,
    validatesEmptyValue: js.Function0[scala.Boolean]
  ): LengthValidator = {
    val __obj = js.Dynamic.literal(getCustomMessage = getCustomMessage, getKey = getKey, getMessage = getMessage, hasCustomMessage = hasCustomMessage, isValid = isValid, length = length, validatesEmptyValue = validatesEmptyValue)
  
    __obj.asInstanceOf[LengthValidator]
  }
}

