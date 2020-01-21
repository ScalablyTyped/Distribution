package typings.awsSdk.managedblockchainMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListProposalsOutput extends js.Object {
  /**
    * The pagination token that indicates the next set of results to retrieve.
    */
  var NextToken: js.UndefOr[PaginationToken] = js.native
  /**
    * The summary of each proposal made on the network.
    */
  var Proposals: js.UndefOr[ProposalSummaryList] = js.native
}

object ListProposalsOutput {
  @scala.inline
  def apply(NextToken: PaginationToken = null, Proposals: ProposalSummaryList = null): ListProposalsOutput = {
    val __obj = js.Dynamic.literal()
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    if (Proposals != null) __obj.updateDynamic("Proposals")(Proposals.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListProposalsOutput]
  }
}

