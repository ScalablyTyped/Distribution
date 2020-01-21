package typings.awsSdk.pinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteEmailChannelResponse extends js.Object {
  var EmailChannelResponse: typings.awsSdk.pinpointMod.EmailChannelResponse = js.native
}

object DeleteEmailChannelResponse {
  @scala.inline
  def apply(EmailChannelResponse: EmailChannelResponse): DeleteEmailChannelResponse = {
    val __obj = js.Dynamic.literal(EmailChannelResponse = EmailChannelResponse.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DeleteEmailChannelResponse]
  }
}

