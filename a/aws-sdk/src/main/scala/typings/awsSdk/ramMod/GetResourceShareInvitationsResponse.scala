package typings.awsSdk.ramMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetResourceShareInvitationsResponse extends StObject {
  
  /**
    * The token to use to retrieve the next page of results. This value is null when there are no more results to return.
    */
  var nextToken: js.UndefOr[String] = js.native
  
  /**
    * Information about the invitations.
    */
  var resourceShareInvitations: js.UndefOr[ResourceShareInvitationList] = js.native
}
object GetResourceShareInvitationsResponse {
  
  @scala.inline
  def apply(): GetResourceShareInvitationsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetResourceShareInvitationsResponse]
  }
  
  @scala.inline
  implicit class GetResourceShareInvitationsResponseMutableBuilder[Self <: GetResourceShareInvitationsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNextToken(value: String): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
    
    @scala.inline
    def setResourceShareInvitations(value: ResourceShareInvitationList): Self = StObject.set(x, "resourceShareInvitations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceShareInvitationsUndefined: Self = StObject.set(x, "resourceShareInvitations", js.undefined)
    
    @scala.inline
    def setResourceShareInvitationsVarargs(value: ResourceShareInvitation*): Self = StObject.set(x, "resourceShareInvitations", js.Array(value :_*))
  }
}
