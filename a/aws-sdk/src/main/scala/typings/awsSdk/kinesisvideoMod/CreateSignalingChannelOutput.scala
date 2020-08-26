package typings.awsSdk.kinesisvideoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateSignalingChannelOutput extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the created channel.
    */
  var ChannelARN: js.UndefOr[ResourceARN] = js.native
}

object CreateSignalingChannelOutput {
  @scala.inline
  def apply(): CreateSignalingChannelOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateSignalingChannelOutput]
  }
  @scala.inline
  implicit class CreateSignalingChannelOutputOps[Self <: CreateSignalingChannelOutput] (val x: Self) extends AnyVal {
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
    def setChannelARN(value: ResourceARN): Self = this.set("ChannelARN", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChannelARN: Self = this.set("ChannelARN", js.undefined)
  }
  
}

