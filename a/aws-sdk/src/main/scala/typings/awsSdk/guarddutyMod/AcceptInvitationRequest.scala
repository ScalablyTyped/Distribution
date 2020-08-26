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
    * The value that is used to validate the master account to the member account.
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
  @scala.inline
  implicit class AcceptInvitationRequestOps[Self <: AcceptInvitationRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDetectorId(value: DetectorId): Self = this.set("DetectorId", value.asInstanceOf[js.Any])
    @scala.inline
    def setInvitationId(value: String): Self = this.set("InvitationId", value.asInstanceOf[js.Any])
    @scala.inline
    def setMasterId(value: String): Self = this.set("MasterId", value.asInstanceOf[js.Any])
  }
  
}

