package typings.awsSdk.managedblockchainMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListProposalVotesOutput extends js.Object {
  /**
    *  The pagination token that indicates the next set of results to retrieve. 
    */
  var NextToken: js.UndefOr[PaginationToken] = js.native
  /**
    *  The listing of votes. 
    */
  var ProposalVotes: js.UndefOr[ProposalVoteList] = js.native
}

object ListProposalVotesOutput {
  @scala.inline
  def apply(NextToken: PaginationToken = null, ProposalVotes: ProposalVoteList = null): ListProposalVotesOutput = {
    val __obj = js.Dynamic.literal()
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    if (ProposalVotes != null) __obj.updateDynamic("ProposalVotes")(ProposalVotes.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListProposalVotesOutput]
  }
}

