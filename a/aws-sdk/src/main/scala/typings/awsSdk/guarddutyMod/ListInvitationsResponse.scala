package typings.awsSdk.guarddutyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListInvitationsResponse extends StObject {
  
  /**
    * A list of invitation descriptions.
    */
  var Invitations: js.UndefOr[typings.awsSdk.guarddutyMod.Invitations] = js.native
  
  /**
    * The pagination parameter to be used on the next list operation to retrieve more items.
    */
  var NextToken: js.UndefOr[String] = js.native
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
    def setInvitations(value: Invitations): Self = StObject.set(x, "Invitations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInvitationsUndefined: Self = StObject.set(x, "Invitations", js.undefined)
    
    @scala.inline
    def setInvitationsVarargs(value: Invitation*): Self = StObject.set(x, "Invitations", js.Array(value :_*))
    
    @scala.inline
    def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
