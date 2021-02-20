package typings.awsSdk.detectiveMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListInvitationsResponse extends StObject {
  
  /**
    * The list of behavior graphs for which the member account has open or accepted invitations.
    */
  var Invitations: js.UndefOr[MemberDetailList] = js.native
  
  /**
    * If there are more behavior graphs remaining in the results, then this is the pagination token to use to request the next page of behavior graphs.
    */
  var NextToken: js.UndefOr[PaginationToken] = js.native
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
    def setInvitations(value: MemberDetailList): Self = StObject.set(x, "Invitations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInvitationsUndefined: Self = StObject.set(x, "Invitations", js.undefined)
    
    @scala.inline
    def setInvitationsVarargs(value: MemberDetail*): Self = StObject.set(x, "Invitations", js.Array(value :_*))
    
    @scala.inline
    def setNextToken(value: PaginationToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
