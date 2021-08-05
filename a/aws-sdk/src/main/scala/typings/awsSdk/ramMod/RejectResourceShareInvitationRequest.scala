package typings.awsSdk.ramMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RejectResourceShareInvitationRequest extends StObject {
  
  /**
    * A unique, case-sensitive identifier that you provide to ensure the idempotency of the request.
    */
  var clientToken: js.UndefOr[String] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the invitation.
    */
  var resourceShareInvitationArn: String
}
object RejectResourceShareInvitationRequest {
  
  inline def apply(resourceShareInvitationArn: String): RejectResourceShareInvitationRequest = {
    val __obj = js.Dynamic.literal(resourceShareInvitationArn = resourceShareInvitationArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[RejectResourceShareInvitationRequest]
  }
  
  extension [Self <: RejectResourceShareInvitationRequest](x: Self) {
    
    inline def setClientToken(value: String): Self = StObject.set(x, "clientToken", value.asInstanceOf[js.Any])
    
    inline def setClientTokenUndefined: Self = StObject.set(x, "clientToken", js.undefined)
    
    inline def setResourceShareInvitationArn(value: String): Self = StObject.set(x, "resourceShareInvitationArn", value.asInstanceOf[js.Any])
  }
}
