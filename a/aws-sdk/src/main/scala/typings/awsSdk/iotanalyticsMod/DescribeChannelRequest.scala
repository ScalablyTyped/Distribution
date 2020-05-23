package typings.awsSdk.iotanalyticsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeChannelRequest extends js.Object {
  /**
    * The name of the channel whose information is retrieved.
    */
  var channelName: ChannelName = js.native
  /**
    * If true, additional statistical information about the channel is included in the response. This feature cannot be used with a channel whose S3 storage is customer-managed.
    */
  var includeStatistics: js.UndefOr[IncludeStatisticsFlag] = js.native
}

object DescribeChannelRequest {
  @scala.inline
  def apply(channelName: ChannelName, includeStatistics: js.UndefOr[IncludeStatisticsFlag] = js.undefined): DescribeChannelRequest = {
    val __obj = js.Dynamic.literal(channelName = channelName.asInstanceOf[js.Any])
    if (!js.isUndefined(includeStatistics)) __obj.updateDynamic("includeStatistics")(includeStatistics.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeChannelRequest]
  }
}

