package typings.awsSdk.kinesisvideoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListSignalingChannelsOutput extends js.Object {
  /**
    * An array of ChannelInfo objects.
    */
  var ChannelInfoList: js.UndefOr[typings.awsSdk.kinesisvideoMod.ChannelInfoList] = js.native
  /**
    * If the response is truncated, the call returns this element with a token. To get the next batch of streams, use this token in your next request.
    */
  var NextToken: js.UndefOr[typings.awsSdk.kinesisvideoMod.NextToken] = js.native
}

object ListSignalingChannelsOutput {
  @scala.inline
  def apply(ChannelInfoList: ChannelInfoList = null, NextToken: NextToken = null): ListSignalingChannelsOutput = {
    val __obj = js.Dynamic.literal()
    if (ChannelInfoList != null) __obj.updateDynamic("ChannelInfoList")(ChannelInfoList.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListSignalingChannelsOutput]
  }
}

