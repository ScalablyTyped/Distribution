package typings.awsSdk.kinesisvideoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListSignalingChannelsInput extends js.Object {
  /**
    * Optional: Returns only the channels that satisfy a specific condition.
    */
  var ChannelNameCondition: js.UndefOr[typings.awsSdk.kinesisvideoMod.ChannelNameCondition] = js.native
  /**
    * The maximum number of channels to return in the response. The default is 500.
    */
  var MaxResults: js.UndefOr[ListStreamsInputLimit] = js.native
  /**
    * If you specify this parameter, when the result of a ListSignalingChannels operation is truncated, the call returns the NextToken in the response. To get another batch of channels, provide this token in your next request.
    */
  var NextToken: js.UndefOr[typings.awsSdk.kinesisvideoMod.NextToken] = js.native
}

object ListSignalingChannelsInput {
  @scala.inline
  def apply(
    ChannelNameCondition: ChannelNameCondition = null,
    MaxResults: js.UndefOr[ListStreamsInputLimit] = js.undefined,
    NextToken: NextToken = null
  ): ListSignalingChannelsInput = {
    val __obj = js.Dynamic.literal()
    if (ChannelNameCondition != null) __obj.updateDynamic("ChannelNameCondition")(ChannelNameCondition.asInstanceOf[js.Any])
    if (!js.isUndefined(MaxResults)) __obj.updateDynamic("MaxResults")(MaxResults.get.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListSignalingChannelsInput]
  }
}

