package typings.awsSdk.macie2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AcceptInvitationRequest extends StObject {
  
  /**
    * The unique identifier for the invitation to accept.
    */
  var invitationId: string = js.native
  
  /**
    * The AWS account ID for the account that sent the invitation.
    */
  var masterAccount: string = js.native
}
object AcceptInvitationRequest {
  
  @scala.inline
  def apply(invitationId: string, masterAccount: string): AcceptInvitationRequest = {
    val __obj = js.Dynamic.literal(invitationId = invitationId.asInstanceOf[js.Any], masterAccount = masterAccount.asInstanceOf[js.Any])
    __obj.asInstanceOf[AcceptInvitationRequest]
  }
  
  @scala.inline
  implicit class AcceptInvitationRequestMutableBuilder[Self <: AcceptInvitationRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInvitationId(value: string): Self = StObject.set(x, "invitationId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMasterAccount(value: string): Self = StObject.set(x, "masterAccount", value.asInstanceOf[js.Any])
  }
}
