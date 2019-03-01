package typings
package businessDashRulesDashEngineLib.businessDashRulesDashEngineMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IValidationFailure extends IError {
  var Error: IError
  var IsAsync: scala.Boolean
}

object IValidationFailure {
  @scala.inline
  def apply(
    Error: IError,
    ErrorMessage: java.lang.String,
    HasError: scala.Boolean,
    IsAsync: scala.Boolean,
    TranslateArgs: IErrorTranslateArgs = null
  ): IValidationFailure = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("Error")(Error)
    __obj.updateDynamic("ErrorMessage")(ErrorMessage)
    __obj.updateDynamic("HasError")(HasError)
    __obj.updateDynamic("IsAsync")(IsAsync)
    if (TranslateArgs != null) __obj.updateDynamic("TranslateArgs")(TranslateArgs)
    __obj.asInstanceOf[IValidationFailure]
  }
}

