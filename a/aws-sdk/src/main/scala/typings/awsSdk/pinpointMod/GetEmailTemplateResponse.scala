package typings.awsSdk.pinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetEmailTemplateResponse extends js.Object {
  var EmailTemplateResponse: typings.awsSdk.pinpointMod.EmailTemplateResponse = js.native
}

object GetEmailTemplateResponse {
  @scala.inline
  def apply(EmailTemplateResponse: EmailTemplateResponse): GetEmailTemplateResponse = {
    val __obj = js.Dynamic.literal(EmailTemplateResponse = EmailTemplateResponse.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GetEmailTemplateResponse]
  }
}

