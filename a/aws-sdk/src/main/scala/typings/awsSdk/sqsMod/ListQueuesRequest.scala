package typings.awsSdk.sqsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListQueuesRequest extends js.Object {
  /**
    * Maximum number of results to include in the response.
    */
  var MaxResults: js.UndefOr[BoxedInteger] = js.native
  /**
    * Pagination token to request the next set of results.
    */
  var NextToken: js.UndefOr[Token] = js.native
  /**
    * A string to use for filtering the list results. Only those queues whose name begins with the specified string are returned. Queue URLs and names are case-sensitive.
    */
  var QueueNamePrefix: js.UndefOr[String] = js.native
}

object ListQueuesRequest {
  @scala.inline
  def apply(
    MaxResults: js.UndefOr[BoxedInteger] = js.undefined,
    NextToken: Token = null,
    QueueNamePrefix: String = null
  ): ListQueuesRequest = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(MaxResults)) __obj.updateDynamic("MaxResults")(MaxResults.get.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    if (QueueNamePrefix != null) __obj.updateDynamic("QueueNamePrefix")(QueueNamePrefix.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListQueuesRequest]
  }
}

