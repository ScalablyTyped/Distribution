package typings.awsSdk.ramMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AcceptResourceShareInvitationResponse extends StObject {
  
  /**
    * A unique, case-sensitive identifier that you provide to ensure the idempotency of the request.
    */
  var clientToken: js.UndefOr[String] = js.undefined
  
  /**
    * Information about the invitation.
    */
  var resourceShareInvitation: js.UndefOr[ResourceShareInvitation] = js.undefined
}
object AcceptResourceShareInvitationResponse {
  
  inline def apply(): AcceptResourceShareInvitationResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AcceptResourceShareInvitationResponse]
  }
  
  extension [Self <: AcceptResourceShareInvitationResponse](x: Self) {
    
    inline def setClientToken(value: String): Self = StObject.set(x, "clientToken", value.asInstanceOf[js.Any])
    
    inline def setClientTokenUndefined: Self = StObject.set(x, "clientToken", js.undefined)
    
    inline def setResourceShareInvitation(value: ResourceShareInvitation): Self = StObject.set(x, "resourceShareInvitation", value.asInstanceOf[js.Any])
    
    inline def setResourceShareInvitationUndefined: Self = StObject.set(x, "resourceShareInvitation", js.undefined)
  }
}
