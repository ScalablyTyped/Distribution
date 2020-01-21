package typings.awsSdk.pinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteSmsChannelResponse extends js.Object {
  var SMSChannelResponse: typings.awsSdk.pinpointMod.SMSChannelResponse = js.native
}

object DeleteSmsChannelResponse {
  @scala.inline
  def apply(SMSChannelResponse: SMSChannelResponse): DeleteSmsChannelResponse = {
    val __obj = js.Dynamic.literal(SMSChannelResponse = SMSChannelResponse.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DeleteSmsChannelResponse]
  }
}

