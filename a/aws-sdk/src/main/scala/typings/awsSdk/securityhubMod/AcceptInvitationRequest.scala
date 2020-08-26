package typings.awsSdk.securityhubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AcceptInvitationRequest extends js.Object {
  /**
    * The ID of the invitation sent from the Security Hub master account.
    */
  var InvitationId: NonEmptyString = js.native
  /**
    * The account ID of the Security Hub master account that sent the invitation.
    */
  var MasterId: NonEmptyString = js.native
}

object AcceptInvitationRequest {
  @scala.inline
  def apply(InvitationId: NonEmptyString, MasterId: NonEmptyString): AcceptInvitationRequest = {
    val __obj = js.Dynamic.literal(InvitationId = InvitationId.asInstanceOf[js.Any], MasterId = MasterId.asInstanceOf[js.Any])
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
    def setInvitationId(value: NonEmptyString): Self = this.set("InvitationId", value.asInstanceOf[js.Any])
    @scala.inline
    def setMasterId(value: NonEmptyString): Self = this.set("MasterId", value.asInstanceOf[js.Any])
  }
  
}

