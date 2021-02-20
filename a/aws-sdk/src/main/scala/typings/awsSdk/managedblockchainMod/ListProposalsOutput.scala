package typings.awsSdk.managedblockchainMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListProposalsOutput extends StObject {
  
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
  def apply(): ListProposalsOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListProposalsOutput]
  }
  
  @scala.inline
  implicit class ListProposalsOutputMutableBuilder[Self <: ListProposalsOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNextToken(value: PaginationToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    @scala.inline
    def setProposals(value: ProposalSummaryList): Self = StObject.set(x, "Proposals", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProposalsUndefined: Self = StObject.set(x, "Proposals", js.undefined)
    
    @scala.inline
    def setProposalsVarargs(value: ProposalSummary*): Self = StObject.set(x, "Proposals", js.Array(value :_*))
  }
}
