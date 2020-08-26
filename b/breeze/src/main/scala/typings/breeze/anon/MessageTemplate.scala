package typings.breeze.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MessageTemplate extends js.Object {
  var messageTemplate: js.UndefOr[String] = js.native
}

object MessageTemplate {
  @scala.inline
  def apply(): MessageTemplate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MessageTemplate]
  }
  @scala.inline
  implicit class MessageTemplateOps[Self <: MessageTemplate] (val x: Self) extends AnyVal {
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
    def setMessageTemplate(value: String): Self = this.set("messageTemplate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMessageTemplate: Self = this.set("messageTemplate", js.undefined)
  }
  
}

