package typings.awsSdk.ramMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetResourceShareInvitationsResponse extends StObject {
  
  /**
    * If present, this value indicates that more output is available than is included in the current response. Use this value in the NextToken request parameter in a subsequent call to the operation to get the next part of the output. You should repeat this until the NextToken response element comes back as null. This indicates that this is the last page of results.
    */
  var nextToken: js.UndefOr[String] = js.undefined
  
  /**
    * An array of objects that contain the details about the invitations.
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
    
    inline def setResourceShareInvitationsVarargs(value: ResourceShareInvitation*): Self = StObject.set(x, "resourceShareInvitations", js.Array(value*))
  }
}
