package typings.awsSdk.sqsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListDeadLetterSourceQueuesRequest extends js.Object {
  /**
    * Maximum number of results to include in the response.
    */
  var MaxResults: js.UndefOr[BoxedInteger] = js.native
  /**
    * Pagination token to request the next set of results.
    */
  var NextToken: js.UndefOr[Token] = js.native
  /**
    * The URL of a dead-letter queue. Queue URLs and names are case-sensitive.
    */
  var QueueUrl: String = js.native
}

object ListDeadLetterSourceQueuesRequest {
  @scala.inline
  def apply(QueueUrl: String, MaxResults: js.UndefOr[BoxedInteger] = js.undefined, NextToken: Token = null): ListDeadLetterSourceQueuesRequest = {
    val __obj = js.Dynamic.literal(QueueUrl = QueueUrl.asInstanceOf[js.Any])
    if (!js.isUndefined(MaxResults)) __obj.updateDynamic("MaxResults")(MaxResults.get.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListDeadLetterSourceQueuesRequest]
  }
}

