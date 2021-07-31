package typings.awsSdk.managedblockchainMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListProposalVotesOutput extends StObject {
  
  /**
    *  The pagination token that indicates the next set of results to retrieve. 
    */
  var NextToken: js.UndefOr[PaginationToken] = js.undefined
  
  /**
    *  The listing of votes. 
    */
  var ProposalVotes: js.UndefOr[ProposalVoteList] = js.undefined
}
object ListProposalVotesOutput {
  
  @scala.inline
  def apply(): ListProposalVotesOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListProposalVotesOutput]
  }
  
  @scala.inline
  implicit class ListProposalVotesOutputMutableBuilder[Self <: ListProposalVotesOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNextToken(value: PaginationToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    @scala.inline
    def setProposalVotes(value: ProposalVoteList): Self = StObject.set(x, "ProposalVotes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProposalVotesUndefined: Self = StObject.set(x, "ProposalVotes", js.undefined)
    
    @scala.inline
    def setProposalVotesVarargs(value: VoteSummary*): Self = StObject.set(x, "ProposalVotes", js.Array(value :_*))
  }
}
