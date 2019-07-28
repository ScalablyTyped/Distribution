package typings.businessDashRulesDashEngine.businessDashRulesDashEngineMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IErrorTranslateArgs extends js.Object {
  var CustomMessage: js.UndefOr[IErrorCustomMessage] = js.undefined
  var MessageArgs: js.Any
  var TranslateId: String
}

object IErrorTranslateArgs {
  @scala.inline
  def apply(MessageArgs: js.Any, TranslateId: String, CustomMessage: IErrorCustomMessage = null): IErrorTranslateArgs = {
    val __obj = js.Dynamic.literal(MessageArgs = MessageArgs, TranslateId = TranslateId)
    if (CustomMessage != null) __obj.updateDynamic("CustomMessage")(CustomMessage)
    __obj.asInstanceOf[IErrorTranslateArgs]
  }
}

