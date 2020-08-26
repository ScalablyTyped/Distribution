package typings.awsSdk.pinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateVoiceTemplateResponse extends js.Object {
  var CreateTemplateMessageBody: typings.awsSdk.pinpointMod.CreateTemplateMessageBody = js.native
}

object CreateVoiceTemplateResponse {
  @scala.inline
  def apply(CreateTemplateMessageBody: CreateTemplateMessageBody): CreateVoiceTemplateResponse = {
    val __obj = js.Dynamic.literal(CreateTemplateMessageBody = CreateTemplateMessageBody.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateVoiceTemplateResponse]
  }
  @scala.inline
  implicit class CreateVoiceTemplateResponseOps[Self <: CreateVoiceTemplateResponse] (val x: Self) extends AnyVal {
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
    def setCreateTemplateMessageBody(value: CreateTemplateMessageBody): Self = this.set("CreateTemplateMessageBody", value.asInstanceOf[js.Any])
  }
  
}

