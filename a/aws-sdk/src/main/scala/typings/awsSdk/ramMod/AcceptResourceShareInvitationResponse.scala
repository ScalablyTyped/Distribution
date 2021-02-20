package typings.awsSdk.ramMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AcceptResourceShareInvitationResponse extends StObject {
  
  /**
    * A unique, case-sensitive identifier that you provide to ensure the idempotency of the request.
    */
  var clientToken: js.UndefOr[String] = js.native
  
  /**
    * Information about the invitation.
    */
  var resourceShareInvitation: js.UndefOr[ResourceShareInvitation] = js.native
}
object AcceptResourceShareInvitationResponse {
  
  @scala.inline
  def apply(): AcceptResourceShareInvitationResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AcceptResourceShareInvitationResponse]
  }
  
  @scala.inline
  implicit class AcceptResourceShareInvitationResponseMutableBuilder[Self <: AcceptResourceShareInvitationResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClientToken(value: String): Self = StObject.set(x, "clientToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientTokenUndefined: Self = StObject.set(x, "clientToken", js.undefined)
    
    @scala.inline
    def setResourceShareInvitation(value: ResourceShareInvitation): Self = StObject.set(x, "resourceShareInvitation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceShareInvitationUndefined: Self = StObject.set(x, "resourceShareInvitation", js.undefined)
  }
}
