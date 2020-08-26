package typings.awsSdk.medialiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StartChannelRequest extends js.Object {
  /**
    * A request to start a channel
    */
  var ChannelId: string = js.native
}

object StartChannelRequest {
  @scala.inline
  def apply(ChannelId: string): StartChannelRequest = {
    val __obj = js.Dynamic.literal(ChannelId = ChannelId.asInstanceOf[js.Any])
    __obj.asInstanceOf[StartChannelRequest]
  }
  @scala.inline
  implicit class StartChannelRequestOps[Self <: StartChannelRequest] (val x: Self) extends AnyVal {
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
    def setChannelId(value: string): Self = this.set("ChannelId", value.asInstanceOf[js.Any])
  }
  
}

