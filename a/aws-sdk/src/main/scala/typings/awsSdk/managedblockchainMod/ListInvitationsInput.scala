package typings.awsSdk.managedblockchainMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListInvitationsInput extends StObject {
  
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
  def apply(): ListInvitationsInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListInvitationsInput]
  }
  
  @scala.inline
  implicit class ListInvitationsInputMutableBuilder[Self <: ListInvitationsInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMaxResults(value: ProposalListMaxResults): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    @scala.inline
    def setNextToken(value: PaginationToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
