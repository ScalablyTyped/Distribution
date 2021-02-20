package typings.awsSdk.securityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListInvitationsResponse extends StObject {
  
  /**
    * The details of the invitations returned by the operation.
    */
  var Invitations: js.UndefOr[InvitationList] = js.native
  
  /**
    * The pagination token to use to request the next page of results.
    */
  var NextToken: js.UndefOr[NonEmptyString] = js.native
}
object ListInvitationsResponse {
  
  @scala.inline
  def apply(): ListInvitationsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListInvitationsResponse]
  }
  
  @scala.inline
  implicit class ListInvitationsResponseMutableBuilder[Self <: ListInvitationsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInvitations(value: InvitationList): Self = StObject.set(x, "Invitations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInvitationsUndefined: Self = StObject.set(x, "Invitations", js.undefined)
    
    @scala.inline
    def setInvitationsVarargs(value: Invitation*): Self = StObject.set(x, "Invitations", js.Array(value :_*))
    
    @scala.inline
    def setNextToken(value: NonEmptyString): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
