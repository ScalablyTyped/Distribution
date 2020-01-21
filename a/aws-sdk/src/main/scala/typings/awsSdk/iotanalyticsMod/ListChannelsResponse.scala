package typings.awsSdk.iotanalyticsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListChannelsResponse extends js.Object {
  /**
    * A list of "ChannelSummary" objects.
    */
  var channelSummaries: js.UndefOr[ChannelSummaries] = js.native
  /**
    * The token to retrieve the next set of results, or null if there are no more results.
    */
  var nextToken: js.UndefOr[NextToken] = js.native
}

object ListChannelsResponse {
  @scala.inline
  def apply(channelSummaries: ChannelSummaries = null, nextToken: NextToken = null): ListChannelsResponse = {
    val __obj = js.Dynamic.literal()
    if (channelSummaries != null) __obj.updateDynamic("channelSummaries")(channelSummaries.asInstanceOf[js.Any])
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListChannelsResponse]
  }
}

