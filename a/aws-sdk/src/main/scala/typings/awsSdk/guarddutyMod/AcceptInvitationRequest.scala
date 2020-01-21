package typings.awsSdk.guarddutyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AcceptInvitationRequest extends js.Object {
  /**
    * The unique ID of the detector of the GuardDuty member account.
    */
  var DetectorId: typings.awsSdk.guarddutyMod.DetectorId = js.native
  /**
    * This value is used to validate the master account to the member account.
    */
  var InvitationId: String = js.native
  /**
    * The account ID of the master GuardDuty account whose invitation you're accepting.
    */
  var MasterId: String = js.native
}

object AcceptInvitationRequest {
  @scala.inline
  def apply(DetectorId: DetectorId, InvitationId: String, MasterId: String): AcceptInvitationRequest = {
    val __obj = js.Dynamic.literal(DetectorId = DetectorId.asInstanceOf[js.Any], InvitationId = InvitationId.asInstanceOf[js.Any], MasterId = MasterId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AcceptInvitationRequest]
  }
}

