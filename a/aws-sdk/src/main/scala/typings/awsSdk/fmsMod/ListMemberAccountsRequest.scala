package typings.awsSdk.fmsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListMemberAccountsRequest extends js.Object {
  /**
    * Specifies the number of member account IDs that you want AWS Firewall Manager to return for this request. If you have more IDs than the number that you specify for MaxResults, the response includes a NextToken value that you can use to get another batch of member account IDs.
    */
  var MaxResults: js.UndefOr[PaginationMaxResults] = js.native
  /**
    * If you specify a value for MaxResults and you have more account IDs than the number that you specify for MaxResults, AWS Firewall Manager returns a NextToken value in the response that allows you to list another group of IDs. For the second and subsequent ListMemberAccountsRequest requests, specify the value of NextToken from the previous response to get information about another batch of member account IDs.
    */
  var NextToken: js.UndefOr[PaginationToken] = js.native
}

object ListMemberAccountsRequest {
  @scala.inline
  def apply(MaxResults: js.UndefOr[PaginationMaxResults] = js.undefined, NextToken: PaginationToken = null): ListMemberAccountsRequest = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(MaxResults)) __obj.updateDynamic("MaxResults")(MaxResults.get.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListMemberAccountsRequest]
  }
}

