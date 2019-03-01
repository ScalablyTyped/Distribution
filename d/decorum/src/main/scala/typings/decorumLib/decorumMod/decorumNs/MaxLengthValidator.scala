package typings
package decorumLib.decorumMod.decorumNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MaxLengthValidator extends BaseValidator {
  var maxLength: scala.Double
  def isValid(value: java.lang.String): scala.Boolean
}

object MaxLengthValidator {
  @scala.inline
  def apply(
    getCustomMessage: js.Function1[IMessageOpts, java.lang.String],
    getKey: js.Function0[java.lang.String],
    getMessage: js.Function1[IMessageOpts, java.lang.String],
    hasCustomMessage: scala.Boolean,
    isValid: js.Function1[java.lang.String, scala.Boolean],
    maxLength: scala.Double,
    validatesEmptyValue: js.Function0[scala.Boolean]
  ): MaxLengthValidator = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getCustomMessage")(getCustomMessage)
    __obj.updateDynamic("getKey")(getKey)
    __obj.updateDynamic("getMessage")(getMessage)
    __obj.updateDynamic("hasCustomMessage")(hasCustomMessage)
    __obj.updateDynamic("isValid")(isValid)
    __obj.updateDynamic("maxLength")(maxLength)
    __obj.updateDynamic("validatesEmptyValue")(validatesEmptyValue)
    __obj.asInstanceOf[MaxLengthValidator]
  }
}

