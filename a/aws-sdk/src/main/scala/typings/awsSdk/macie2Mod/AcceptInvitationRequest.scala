package typings.awsSdk.macie2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AcceptInvitationRequest extends js.Object {
  
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
  implicit class AcceptInvitationRequestOps[Self <: AcceptInvitationRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setInvitationId(value: string): Self = this.set("invitationId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMasterAccount(value: string): Self = this.set("masterAccount", value.asInstanceOf[js.Any])
  }
}
