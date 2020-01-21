package typings.awsSdk.fmsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListMemberAccountsResponse extends js.Object {
  /**
    * An array of account IDs.
    */
  var MemberAccounts: js.UndefOr[typings.awsSdk.fmsMod.MemberAccounts] = js.native
  /**
    * If you have more member account IDs than the number that you specified for MaxResults in the request, the response includes a NextToken value. To list more IDs, submit another ListMemberAccounts request, and specify the NextToken value from the response in the NextToken value in the next request.
    */
  var NextToken: js.UndefOr[PaginationToken] = js.native
}

object ListMemberAccountsResponse {
  @scala.inline
  def apply(MemberAccounts: MemberAccounts = null, NextToken: PaginationToken = null): ListMemberAccountsResponse = {
    val __obj = js.Dynamic.literal()
    if (MemberAccounts != null) __obj.updateDynamic("MemberAccounts")(MemberAccounts.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListMemberAccountsResponse]
  }
}

