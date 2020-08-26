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
  @scala.inline
  implicit class DeleteGcmChannelResponseOps[Self <: DeleteGcmChannelResponse] (val x: Self) extends AnyVal {
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
    def setGCMChannelResponse(value: GCMChannelResponse): Self = this.set("GCMChannelResponse", value.asInstanceOf[js.Any])
  }
  
}

