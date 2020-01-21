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
}

