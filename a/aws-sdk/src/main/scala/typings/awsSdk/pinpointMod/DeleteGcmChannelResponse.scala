package typings.awsSdk.pinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteGcmChannelResponse extends js.Object {
  var GCMChannelResponse: typings.awsSdk.pinpointMod.GCMChannelResponse = js.native
}

object DeleteGcmChannelResponse {
  @scala.inline
  def apply(GCMChannelResponse: GCMChannelResponse): DeleteGcmChannelResponse = {
    val __obj = js.Dynamic.literal(GCMChannelResponse = GCMChannelResponse.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteGcmChannelResponse]
  }
}

