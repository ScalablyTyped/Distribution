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
  def apply(channelName: ChannelName): DescribeChannelRequest = {
    val __obj = js.Dynamic.literal(channelName = channelName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeChannelRequest]
  }
  @scala.inline
  implicit class DescribeChannelRequestOps[Self <: DescribeChannelRequest] (val x: Self) extends AnyVal {
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
    def setChannelName(value: ChannelName): Self = this.set("channelName", value.asInstanceOf[js.Any])
    @scala.inline
    def setIncludeStatistics(value: IncludeStatisticsFlag): Self = this.set("includeStatistics", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIncludeStatistics: Self = this.set("includeStatistics", js.undefined)
  }
  
}

