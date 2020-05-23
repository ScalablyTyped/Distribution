package typings.awsSdk.managedblockchainMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListInvitationsInput extends js.Object {
  /**
    * The maximum number of invitations to return.
    */
  var MaxResults: js.UndefOr[ProposalListMaxResults] = js.native
  /**
    * The pagination token that indicates the next set of results to retrieve.
    */
  var NextToken: js.UndefOr[PaginationToken] = js.native
}

object ListInvitationsInput {
  @scala.inline
  def apply(MaxResults: js.UndefOr[ProposalListMaxResults] = js.undefined, NextToken: PaginationToken = null): ListInvitationsInput = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(MaxResults)) __obj.updateDynamic("MaxResults")(MaxResults.get.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListInvitationsInput]
  }
}

