package typings.awsSdk.pinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetApnsChannelResponse extends js.Object {
  var APNSChannelResponse: typings.awsSdk.pinpointMod.APNSChannelResponse = js.native
}

object GetApnsChannelResponse {
  @scala.inline
  def apply(APNSChannelResponse: APNSChannelResponse): GetApnsChannelResponse = {
    val __obj = js.Dynamic.literal(APNSChannelResponse = APNSChannelResponse.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GetApnsChannelResponse]
  }
}

