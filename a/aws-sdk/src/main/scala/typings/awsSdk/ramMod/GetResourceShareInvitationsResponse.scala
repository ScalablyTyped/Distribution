package typings.awsSdk.ramMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetResourceShareInvitationsResponse extends StObject {
  
  /**
    * The token to use to retrieve the next page of results. This value is null when there are no more results to return.
    */
  var nextToken: js.UndefOr[String] = js.undefined
  
  /**
    * Information about the invitations.
    */
  var resourceShareInvitations: js.UndefOr[ResourceShareInvitationList] = js.undefined
}
object GetResourceShareInvitationsResponse {
  
  inline def apply(): GetResourceShareInvitationsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetResourceShareInvitationsResponse]
  }
  
  extension [Self <: GetResourceShareInvitationsResponse](x: Self) {
    
    inline def setNextToken(value: String): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
    
    inline def setResourceShareInvitations(value: ResourceShareInvitationList): Self = StObject.set(x, "resourceShareInvitations", value.asInstanceOf[js.Any])
    
    inline def setResourceShareInvitationsUndefined: Self = StObject.set(x, "resourceShareInvitations", js.undefined)
    
    inline def setResourceShareInvitationsVarargs(value: ResourceShareInvitation*): Self = StObject.set(x, "resourceShareInvitations", js.Array(value :_*))
  }
}
