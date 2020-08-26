package typings.awsSdk.pinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateSmsTemplateRequest extends js.Object {
  var SMSTemplateRequest: typings.awsSdk.pinpointMod.SMSTemplateRequest = js.native
  /**
    * The name of the message template. A template name must start with an alphanumeric character and can contain a maximum of 128 characters. The characters can be alphanumeric characters, underscores (_), or hyphens (-). Template names are case sensitive.
    */
  var TemplateName: string = js.native
}

object CreateSmsTemplateRequest {
  @scala.inline
  def apply(SMSTemplateRequest: SMSTemplateRequest, TemplateName: string): CreateSmsTemplateRequest = {
    val __obj = js.Dynamic.literal(SMSTemplateRequest = SMSTemplateRequest.asInstanceOf[js.Any], TemplateName = TemplateName.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateSmsTemplateRequest]
  }
  @scala.inline
  implicit class CreateSmsTemplateRequestOps[Self <: CreateSmsTemplateRequest] (val x: Self) extends AnyVal {
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
    def setSMSTemplateRequest(value: SMSTemplateRequest): Self = this.set("SMSTemplateRequest", value.asInstanceOf[js.Any])
    @scala.inline
    def setTemplateName(value: string): Self = this.set("TemplateName", value.asInstanceOf[js.Any])
  }
  
}

