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
  def apply(): ListProposalVotesOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListProposalVotesOutput]
  }
  @scala.inline
  implicit class ListProposalVotesOutputOps[Self <: ListProposalVotesOutput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setNextToken(value: PaginationToken): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
    @scala.inline
    def setProposalVotesVarargs(value: VoteSummary*): Self = this.set("ProposalVotes", js.Array(value :_*))
    @scala.inline
    def setProposalVotes(value: ProposalVoteList): Self = this.set("ProposalVotes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProposalVotes: Self = this.set("ProposalVotes", js.undefined)
  }
  
}

