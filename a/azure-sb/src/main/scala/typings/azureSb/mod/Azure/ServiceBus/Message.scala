package typings.azureSb.mod.Azure.ServiceBus

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Message extends js.Object {
  var body: String = js.native
  var brokerProperties: js.UndefOr[BrokerProperties] = js.native
  var contentType: js.UndefOr[String] = js.native
  var customProperties: js.UndefOr[Dictionary[_]] = js.native
}

object Message {
  @scala.inline
  def apply(body: String): Message = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any])
    __obj.asInstanceOf[Message]
  }
  @scala.inline
  implicit class MessageOps[Self <: Message] (val x: Self) extends AnyVal {
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
    def setBody(value: String): Self = this.set("body", value.asInstanceOf[js.Any])
    @scala.inline
    def setBrokerProperties(value: BrokerProperties): Self = this.set("brokerProperties", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBrokerProperties: Self = this.set("brokerProperties", js.undefined)
    @scala.inline
    def setContentType(value: String): Self = this.set("contentType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContentType: Self = this.set("contentType", js.undefined)
    @scala.inline
    def setCustomProperties(value: Dictionary[_]): Self = this.set("customProperties", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCustomProperties: Self = this.set("customProperties", js.undefined)
  }
  
}

