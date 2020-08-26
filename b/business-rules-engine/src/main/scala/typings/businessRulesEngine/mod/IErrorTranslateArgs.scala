package typings.businessRulesEngine.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IErrorTranslateArgs extends js.Object {
  var CustomMessage: js.UndefOr[IErrorCustomMessage] = js.native
  var MessageArgs: js.Any = js.native
  var TranslateId: String = js.native
}

object IErrorTranslateArgs {
  @scala.inline
  def apply(MessageArgs: js.Any, TranslateId: String): IErrorTranslateArgs = {
    val __obj = js.Dynamic.literal(MessageArgs = MessageArgs.asInstanceOf[js.Any], TranslateId = TranslateId.asInstanceOf[js.Any])
    __obj.asInstanceOf[IErrorTranslateArgs]
  }
  @scala.inline
  implicit class IErrorTranslateArgsOps[Self <: IErrorTranslateArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setMessageArgs(value: js.Any): Self = this.set("MessageArgs", value.asInstanceOf[js.Any])
    @scala.inline
    def setTranslateId(value: String): Self = this.set("TranslateId", value.asInstanceOf[js.Any])
    @scala.inline
    def setCustomMessage(value: (/* config */ js.Any, /* args */ js.Any) => String): Self = this.set("CustomMessage", js.Any.fromFunction2(value))
    @scala.inline
    def deleteCustomMessage: Self = this.set("CustomMessage", js.undefined)
  }
  
}

