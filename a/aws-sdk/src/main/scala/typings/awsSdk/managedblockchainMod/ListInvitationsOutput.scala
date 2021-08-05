package typings.awsSdk.managedblockchainMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListInvitationsOutput extends StObject {
  
  /**
    * The invitations for the network.
    */
  var Invitations: js.UndefOr[InvitationList] = js.undefined
  
  /**
    * The pagination token that indicates the next set of results to retrieve.
    */
  var NextToken: js.UndefOr[PaginationToken] = js.undefined
}
object ListInvitationsOutput {
  
  inline def apply(): ListInvitationsOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListInvitationsOutput]
  }
  
  extension [Self <: ListInvitationsOutput](x: Self) {
    
    inline def setInvitations(value: InvitationList): Self = StObject.set(x, "Invitations", value.asInstanceOf[js.Any])
    
    inline def setInvitationsUndefined: Self = StObject.set(x, "Invitations", js.undefined)
    
    inline def setInvitationsVarargs(value: Invitation*): Self = StObject.set(x, "Invitations", js.Array(value :_*))
    
    inline def setNextToken(value: PaginationToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
