package typings.awsSdk.macie2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
}

