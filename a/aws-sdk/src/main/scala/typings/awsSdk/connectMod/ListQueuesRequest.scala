package typings.awsSdk.connectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListQueuesRequest extends js.Object {
  /**
    * The identifier of the Amazon Connect instance.
    */
  var InstanceId: typings.awsSdk.connectMod.InstanceId = js.native
  /**
    * The maximimum number of results to return per page.
    */
  var MaxResults: js.UndefOr[MaxResult1000] = js.native
  /**
    * The token for the next set of results. Use the value returned in the previous response in the next request to retrieve the next set of results.
    */
  var NextToken: js.UndefOr[typings.awsSdk.connectMod.NextToken] = js.native
  /**
    * The type of queue.
    */
  var QueueTypes: js.UndefOr[typings.awsSdk.connectMod.QueueTypes] = js.native
}

object ListQueuesRequest {
  @scala.inline
  def apply(
    InstanceId: InstanceId,
    MaxResults: Int | Double = null,
    NextToken: NextToken = null,
    QueueTypes: QueueTypes = null
  ): ListQueuesRequest = {
    val __obj = js.Dynamic.literal(InstanceId = InstanceId.asInstanceOf[js.Any])
    if (MaxResults != null) __obj.updateDynamic("MaxResults")(MaxResults.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    if (QueueTypes != null) __obj.updateDynamic("QueueTypes")(QueueTypes.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListQueuesRequest]
  }
}

