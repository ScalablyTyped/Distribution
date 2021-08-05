package typings.awsSdk.managedblockchainMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListProposalVotesInput extends StObject {
  
  /**
    *  The maximum number of votes to return. 
    */
  var MaxResults: js.UndefOr[ProposalListMaxResults] = js.undefined
  
  /**
    *  The unique identifier of the network. 
    */
  var NetworkId: ResourceIdString
  
  /**
    *  The pagination token that indicates the next set of results to retrieve. 
    */
  var NextToken: js.UndefOr[PaginationToken] = js.undefined
  
  /**
    *  The unique identifier of the proposal. 
    */
  var ProposalId: ResourceIdString
}
object ListProposalVotesInput {
  
  inline def apply(NetworkId: ResourceIdString, ProposalId: ResourceIdString): ListProposalVotesInput = {
    val __obj = js.Dynamic.literal(NetworkId = NetworkId.asInstanceOf[js.Any], ProposalId = ProposalId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListProposalVotesInput]
  }
  
  extension [Self <: ListProposalVotesInput](x: Self) {
    
    inline def setMaxResults(value: ProposalListMaxResults): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    inline def setNetworkId(value: ResourceIdString): Self = StObject.set(x, "NetworkId", value.asInstanceOf[js.Any])
    
    inline def setNextToken(value: PaginationToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setProposalId(value: ResourceIdString): Self = StObject.set(x, "ProposalId", value.asInstanceOf[js.Any])
  }
}
