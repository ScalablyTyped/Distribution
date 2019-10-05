package typings.breeze.breeze

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ValidatorFunctionContext extends js.Object {
  var displayName: String
  var message: js.UndefOr[String] = js.undefined
  var messageTemplate: String
  var validatorName: String
  var value: js.Any
}

object ValidatorFunctionContext {
  @scala.inline
  def apply(
    displayName: String,
    messageTemplate: String,
    validatorName: String,
    value: js.Any,
    message: String = null
  ): ValidatorFunctionContext = {
    val __obj = js.Dynamic.literal(displayName = displayName, messageTemplate = messageTemplate, validatorName = validatorName, value = value)
    if (message != null) __obj.updateDynamic("message")(message)
    __obj.asInstanceOf[ValidatorFunctionContext]
  }
}

