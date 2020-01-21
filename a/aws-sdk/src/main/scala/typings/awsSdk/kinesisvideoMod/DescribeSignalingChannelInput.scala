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
  def apply(ChannelARN: ResourceARN = null, ChannelName: ChannelName = null): DescribeSignalingChannelInput = {
    val __obj = js.Dynamic.literal()
    if (ChannelARN != null) __obj.updateDynamic("ChannelARN")(ChannelARN.asInstanceOf[js.Any])
    if (ChannelName != null) __obj.updateDynamic("ChannelName")(ChannelName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeSignalingChannelInput]
  }
}

