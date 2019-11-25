package typings.businessDashRulesDashEngine.businessDashRulesDashEngineMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IError extends js.Object {
  var ErrorMessage: String
  var HasError: Boolean
  var TranslateArgs: js.UndefOr[IErrorTranslateArgs] = js.undefined
}

object IError {
  @scala.inline
  def apply(ErrorMessage: String, HasError: Boolean, TranslateArgs: IErrorTranslateArgs = null): IError = {
    val __obj = js.Dynamic.literal(ErrorMessage = ErrorMessage.asInstanceOf[js.Any], HasError = HasError.asInstanceOf[js.Any])
    if (TranslateArgs != null) __obj.updateDynamic("TranslateArgs")(TranslateArgs.asInstanceOf[js.Any])
    __obj.asInstanceOf[IError]
  }
}

