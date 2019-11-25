package typings.businessDashRulesDashEngine.businessDashRulesDashEngineMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IValidationFailure extends IError {
  var Error: IError
  var IsAsync: Boolean
}

object IValidationFailure {
  @scala.inline
  def apply(
    Error: IError,
    ErrorMessage: String,
    HasError: Boolean,
    IsAsync: Boolean,
    TranslateArgs: IErrorTranslateArgs = null
  ): IValidationFailure = {
    val __obj = js.Dynamic.literal(Error = Error.asInstanceOf[js.Any], ErrorMessage = ErrorMessage.asInstanceOf[js.Any], HasError = HasError.asInstanceOf[js.Any], IsAsync = IsAsync.asInstanceOf[js.Any])
    if (TranslateArgs != null) __obj.updateDynamic("TranslateArgs")(TranslateArgs.asInstanceOf[js.Any])
    __obj.asInstanceOf[IValidationFailure]
  }
}

