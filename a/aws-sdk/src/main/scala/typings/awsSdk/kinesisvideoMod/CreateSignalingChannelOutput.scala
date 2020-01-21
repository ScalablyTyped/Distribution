package typings.awsSdk.kinesisvideoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateSignalingChannelOutput extends js.Object {
  /**
    * The ARN of the created channel.
    */
  var ChannelARN: js.UndefOr[ResourceARN] = js.native
}

object CreateSignalingChannelOutput {
  @scala.inline
  def apply(ChannelARN: ResourceARN = null): CreateSignalingChannelOutput = {
    val __obj = js.Dynamic.literal()
    if (ChannelARN != null) __obj.updateDynamic("ChannelARN")(ChannelARN.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateSignalingChannelOutput]
  }
}

