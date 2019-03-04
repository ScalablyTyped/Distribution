package typings
package decorumLib.decorumMod.decorumNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CustomValidator[TModel] extends BaseValidator

object CustomValidator {
  @scala.inline
  def apply[TModel](
    getCustomMessage: js.Function1[IMessageOpts, java.lang.String],
    getKey: js.Function0[java.lang.String],
    getMessage: js.Function1[IMessageOpts, java.lang.String],
    hasCustomMessage: scala.Boolean,
    isValid: js.Function2[js.Any, js.Any, scala.Boolean],
    validatesEmptyValue: js.Function0[scala.Boolean]
  ): CustomValidator[TModel] = {
    val __obj = js.Dynamic.literal(getCustomMessage = getCustomMessage, getKey = getKey, getMessage = getMessage, hasCustomMessage = hasCustomMessage, isValid = isValid, validatesEmptyValue = validatesEmptyValue)
  
    __obj.asInstanceOf[CustomValidator[TModel]]
  }
}

