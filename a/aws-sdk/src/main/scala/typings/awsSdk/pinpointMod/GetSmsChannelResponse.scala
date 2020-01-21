package typings.awsSdk.pinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetSmsChannelResponse extends js.Object {
  var SMSChannelResponse: typings.awsSdk.pinpointMod.SMSChannelResponse = js.native
}

object GetSmsChannelResponse {
  @scala.inline
  def apply(SMSChannelResponse: SMSChannelResponse): GetSmsChannelResponse = {
    val __obj = js.Dynamic.literal(SMSChannelResponse = SMSChannelResponse.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GetSmsChannelResponse]
  }
}

