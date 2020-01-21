package typings.awsSdk.connectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListQueuesResponse extends js.Object {
  /**
    * If there are additional results, this is the token for the next set of results.
    */
  var NextToken: js.UndefOr[typings.awsSdk.connectMod.NextToken] = js.native
  /**
    * Information about the queues.
    */
  var QueueSummaryList: js.UndefOr[typings.awsSdk.connectMod.QueueSummaryList] = js.native
}

object ListQueuesResponse {
  @scala.inline
  def apply(NextToken: NextToken = null, QueueSummaryList: QueueSummaryList = null): ListQueuesResponse = {
    val __obj = js.Dynamic.literal()
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    if (QueueSummaryList != null) __obj.updateDynamic("QueueSummaryList")(QueueSummaryList.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListQueuesResponse]
  }
}

