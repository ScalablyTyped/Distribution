package typings.awsSdk.ramMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AcceptResourceShareInvitationRequest extends StObject {
  
  /**
    * A unique, case-sensitive identifier that you provide to ensure the idempotency of the request.
    */
  var clientToken: js.UndefOr[String] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the invitation.
    */
  var resourceShareInvitationArn: String
}
object AcceptResourceShareInvitationRequest {
  
  @scala.inline
  def apply(resourceShareInvitationArn: String): AcceptResourceShareInvitationRequest = {
    val __obj = js.Dynamic.literal(resourceShareInvitationArn = resourceShareInvitationArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[AcceptResourceShareInvitationRequest]
  }
  
  @scala.inline
  implicit class AcceptResourceShareInvitationRequestMutableBuilder[Self <: AcceptResourceShareInvitationRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClientToken(value: String): Self = StObject.set(x, "clientToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientTokenUndefined: Self = StObject.set(x, "clientToken", js.undefined)
    
    @scala.inline
    def setResourceShareInvitationArn(value: String): Self = StObject.set(x, "resourceShareInvitationArn", value.asInstanceOf[js.Any])
  }
}
