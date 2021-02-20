package typings.awsSdk.ramMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RejectResourceShareInvitationRequest extends StObject {
  
  /**
    * A unique, case-sensitive identifier that you provide to ensure the idempotency of the request.
    */
  var clientToken: js.UndefOr[String] = js.native
  
  /**
    * The Amazon Resource Name (ARN) of the invitation.
    */
  var resourceShareInvitationArn: String = js.native
}
object RejectResourceShareInvitationRequest {
  
  @scala.inline
  def apply(resourceShareInvitationArn: String): RejectResourceShareInvitationRequest = {
    val __obj = js.Dynamic.literal(resourceShareInvitationArn = resourceShareInvitationArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[RejectResourceShareInvitationRequest]
  }
  
  @scala.inline
  implicit class RejectResourceShareInvitationRequestMutableBuilder[Self <: RejectResourceShareInvitationRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClientToken(value: String): Self = StObject.set(x, "clientToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientTokenUndefined: Self = StObject.set(x, "clientToken", js.undefined)
    
    @scala.inline
    def setResourceShareInvitationArn(value: String): Self = StObject.set(x, "resourceShareInvitationArn", value.asInstanceOf[js.Any])
  }
}
