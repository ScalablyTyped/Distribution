package typings
package breezeLib.breezeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ValidatorFunctionContext extends js.Object {
  var displayName: java.lang.String
  var message: js.UndefOr[java.lang.String] = js.undefined
  var messageTemplate: java.lang.String
  var validatorName: java.lang.String
  var value: js.Any
}

object ValidatorFunctionContext {
  @scala.inline
  def apply(
    displayName: java.lang.String,
    messageTemplate: java.lang.String,
    validatorName: java.lang.String,
    value: js.Any,
    message: java.lang.String = null
  ): ValidatorFunctionContext = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("displayName")(displayName)
    __obj.updateDynamic("messageTemplate")(messageTemplate)
    __obj.updateDynamic("validatorName")(validatorName)
    __obj.updateDynamic("value")(value)
    if (message != null) __obj.updateDynamic("message")(message)
    __obj.asInstanceOf[ValidatorFunctionContext]
  }
}

