package typings.awsSdk.pinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateEmailChannelResponse extends js.Object {
  var EmailChannelResponse: typings.awsSdk.pinpointMod.EmailChannelResponse = js.native
}

object UpdateEmailChannelResponse {
  @scala.inline
  def apply(EmailChannelResponse: EmailChannelResponse): UpdateEmailChannelResponse = {
    val __obj = js.Dynamic.literal(EmailChannelResponse = EmailChannelResponse.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateEmailChannelResponse]
  }
}

