package typings.awsSdk.pinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetSmsTemplateResponse extends js.Object {
  var SMSTemplateResponse: typings.awsSdk.pinpointMod.SMSTemplateResponse = js.native
}

object GetSmsTemplateResponse {
  @scala.inline
  def apply(SMSTemplateResponse: SMSTemplateResponse): GetSmsTemplateResponse = {
    val __obj = js.Dynamic.literal(SMSTemplateResponse = SMSTemplateResponse.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetSmsTemplateResponse]
  }
  @scala.inline
  implicit class GetSmsTemplateResponseOps[Self <: GetSmsTemplateResponse] (val x: Self) extends AnyVal {
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
    def setSMSTemplateResponse(value: SMSTemplateResponse): Self = this.set("SMSTemplateResponse", value.asInstanceOf[js.Any])
  }
  
}

