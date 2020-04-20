package typings.awsSdk.pinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetEmailChannelResponse extends js.Object {
  var EmailChannelResponse: typings.awsSdk.pinpointMod.EmailChannelResponse = js.native
}

object GetEmailChannelResponse {
  @scala.inline
  def apply(EmailChannelResponse: EmailChannelResponse): GetEmailChannelResponse = {
    val __obj = js.Dynamic.literal(EmailChannelResponse = EmailChannelResponse.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetEmailChannelResponse]
  }
}

