package typings.awsSdk.kinesisvideoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeSignalingChannelInput extends js.Object {
  /**
    * The ARN of the signaling channel that you want to describe.
    */
  var ChannelARN: js.UndefOr[ResourceARN] = js.native
  /**
    * The name of the signaling channel that you want to describe.
    */
  var ChannelName: js.UndefOr[typings.awsSdk.kinesisvideoMod.ChannelName] = js.native
}

object DescribeSignalingChannelInput {
  @scala.inline
  def apply(): DescribeSignalingChannelInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeSignalingChannelInput]
  }
  @scala.inline
  implicit class DescribeSignalingChannelInputOps[Self <: DescribeSignalingChannelInput] (val x: Self) extends AnyVal {
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
    @scala.inline
    def setChannelName(value: ChannelName): Self = this.set("ChannelName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChannelName: Self = this.set("ChannelName", js.undefined)
  }
  
}

