package typings.awsSdk.ivsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StopStreamRequest extends js.Object {
  /**
    * ARN of the channel for which the stream is to be stopped.
    */
  var channelArn: ChannelArn = js.native
}

object StopStreamRequest {
  @scala.inline
  def apply(channelArn: ChannelArn): StopStreamRequest = {
    val __obj = js.Dynamic.literal(channelArn = channelArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[StopStreamRequest]
  }
  @scala.inline
  implicit class StopStreamRequestOps[Self <: StopStreamRequest] (val x: Self) extends AnyVal {
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
    def setChannelArn(value: ChannelArn): Self = this.set("channelArn", value.asInstanceOf[js.Any])
  }
  
}

