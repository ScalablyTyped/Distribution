package typings.awsSdk.detectiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListMembersRequest extends js.Object {
  /**
    * The ARN of the behavior graph for which to retrieve the list of member accounts.
    */
  var GraphArn: typings.awsSdk.detectiveMod.GraphArn = js.native
  /**
    * The maximum number of member accounts to include in the response. The total must be less than the overall limit on the number of results to return, which is currently 200.
    */
  var MaxResults: js.UndefOr[MemberResultsLimit] = js.native
  /**
    * For requests to retrieve the next page of member account results, the pagination token that was returned with the previous page of results. The initial request does not include a pagination token.
    */
  var NextToken: js.UndefOr[PaginationToken] = js.native
}

object ListMembersRequest {
  @scala.inline
  def apply(
    GraphArn: GraphArn,
    MaxResults: js.UndefOr[MemberResultsLimit] = js.undefined,
    NextToken: PaginationToken = null
  ): ListMembersRequest = {
    val __obj = js.Dynamic.literal(GraphArn = GraphArn.asInstanceOf[js.Any])
    if (!js.isUndefined(MaxResults)) __obj.updateDynamic("MaxResults")(MaxResults.get.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListMembersRequest]
  }
}

