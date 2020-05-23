package typings.awsSdk.stepfunctionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListExecutionsInput extends js.Object {
  /**
    * The maximum number of results that are returned per call. You can use nextToken to obtain further pages of results. The default is 100 and the maximum allowed page size is 1000. A value of 0 uses the default. This is only an upper limit. The actual number of results returned per call might be fewer than the specified maximum.
    */
  var maxResults: js.UndefOr[PageSize] = js.native
  /**
    * If nextToken is returned, there are more results available. The value of nextToken is a unique pagination token for each page. Make the call again using the returned token to retrieve the next page. Keep all other arguments unchanged. Each pagination token expires after 24 hours. Using an expired pagination token will return an HTTP 400 InvalidToken error.
    */
  var nextToken: js.UndefOr[ListExecutionsPageToken] = js.native
  /**
    * The Amazon Resource Name (ARN) of the state machine whose executions is listed.
    */
  var stateMachineArn: Arn = js.native
  /**
    * If specified, only list the executions whose current execution status matches the given filter.
    */
  var statusFilter: js.UndefOr[ExecutionStatus] = js.native
}

object ListExecutionsInput {
  @scala.inline
  def apply(
    stateMachineArn: Arn,
    maxResults: js.UndefOr[PageSize] = js.undefined,
    nextToken: ListExecutionsPageToken = null,
    statusFilter: ExecutionStatus = null
  ): ListExecutionsInput = {
    val __obj = js.Dynamic.literal(stateMachineArn = stateMachineArn.asInstanceOf[js.Any])
    if (!js.isUndefined(maxResults)) __obj.updateDynamic("maxResults")(maxResults.get.asInstanceOf[js.Any])
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken.asInstanceOf[js.Any])
    if (statusFilter != null) __obj.updateDynamic("statusFilter")(statusFilter.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListExecutionsInput]
  }
}

