package typings.awsSdk.pinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateEmailChannelRequest extends js.Object {
  /**
    * The unique identifier for the application. This identifier is displayed as the Project ID on the Amazon Pinpoint console.
    */
  var ApplicationId: string = js.native
  var EmailChannelRequest: typings.awsSdk.pinpointMod.EmailChannelRequest = js.native
}

object UpdateEmailChannelRequest {
  @scala.inline
  def apply(ApplicationId: string, EmailChannelRequest: EmailChannelRequest): UpdateEmailChannelRequest = {
    val __obj = js.Dynamic.literal(ApplicationId = ApplicationId.asInstanceOf[js.Any], EmailChannelRequest = EmailChannelRequest.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateEmailChannelRequest]
  }
  @scala.inline
  implicit class UpdateEmailChannelRequestOps[Self <: UpdateEmailChannelRequest] (val x: Self) extends AnyVal {
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
    def setApplicationId(value: string): Self = this.set("ApplicationId", value.asInstanceOf[js.Any])
    @scala.inline
    def setEmailChannelRequest(value: EmailChannelRequest): Self = this.set("EmailChannelRequest", value.asInstanceOf[js.Any])
  }
  
}

