package typings.awsSdk.guarddutyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DisassociateMembersRequest extends js.Object {
  /**
    * A list of account IDs of the GuardDuty member accounts that you want to disassociate from the master account.
    */
  var AccountIds: typings.awsSdk.guarddutyMod.AccountIds = js.native
  /**
    * The unique ID of the detector of the GuardDuty account whose members you want to disassociate from the master account.
    */
  var DetectorId: typings.awsSdk.guarddutyMod.DetectorId = js.native
}

object DisassociateMembersRequest {
  @scala.inline
  def apply(AccountIds: AccountIds, DetectorId: DetectorId): DisassociateMembersRequest = {
    val __obj = js.Dynamic.literal(AccountIds = AccountIds.asInstanceOf[js.Any], DetectorId = DetectorId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DisassociateMembersRequest]
  }
  @scala.inline
  implicit class DisassociateMembersRequestOps[Self <: DisassociateMembersRequest] (val x: Self) extends AnyVal {
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
    def setAccountIdsVarargs(value: AccountId*): Self = this.set("AccountIds", js.Array(value :_*))
    @scala.inline
    def setAccountIds(value: AccountIds): Self = this.set("AccountIds", value.asInstanceOf[js.Any])
    @scala.inline
    def setDetectorId(value: DetectorId): Self = this.set("DetectorId", value.asInstanceOf[js.Any])
  }
  
}

