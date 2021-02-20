package typings.awsSdk.managedblockchainMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListInvitationsOutput extends StObject {
  
  /**
    * The invitations for the network.
    */
  var Invitations: js.UndefOr[InvitationList] = js.native
  
  /**
    * The pagination token that indicates the next set of results to retrieve.
    */
  var NextToken: js.UndefOr[PaginationToken] = js.native
}
object ListInvitationsOutput {
  
  @scala.inline
  def apply(): ListInvitationsOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListInvitationsOutput]
  }
  
  @scala.inline
  implicit class ListInvitationsOutputMutableBuilder[Self <: ListInvitationsOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInvitations(value: InvitationList): Self = StObject.set(x, "Invitations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInvitationsUndefined: Self = StObject.set(x, "Invitations", js.undefined)
    
    @scala.inline
    def setInvitationsVarargs(value: Invitation*): Self = StObject.set(x, "Invitations", js.Array(value :_*))
    
    @scala.inline
    def setNextToken(value: PaginationToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
