package typings.awsSdk.ivsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateChannelResponse extends js.Object {
  var channel: js.UndefOr[Channel] = js.native
  var streamKey: js.UndefOr[StreamKey] = js.native
}

object CreateChannelResponse {
  @scala.inline
  def apply(): CreateChannelResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateChannelResponse]
  }
  @scala.inline
  implicit class CreateChannelResponseOps[Self <: CreateChannelResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setChannel(value: Channel): Self = this.set("channel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChannel: Self = this.set("channel", js.undefined)
    @scala.inline
    def setStreamKey(value: StreamKey): Self = this.set("streamKey", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStreamKey: Self = this.set("streamKey", js.undefined)
  }
  
}

