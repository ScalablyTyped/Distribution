package typings.awsSdk.medialiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeScheduleRequest extends js.Object {
  /**
    * Id of the channel whose schedule is being updated.
    */
  var ChannelId: string = js.native
  var MaxResults: js.UndefOr[typings.awsSdk.medialiveMod.MaxResults] = js.native
  var NextToken: js.UndefOr[string] = js.native
}

object DescribeScheduleRequest {
  @scala.inline
  def apply(ChannelId: string, MaxResults: js.UndefOr[MaxResults] = js.undefined, NextToken: string = null): DescribeScheduleRequest = {
    val __obj = js.Dynamic.literal(ChannelId = ChannelId.asInstanceOf[js.Any])
    if (!js.isUndefined(MaxResults)) __obj.updateDynamic("MaxResults")(MaxResults.get.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeScheduleRequest]
  }
}

