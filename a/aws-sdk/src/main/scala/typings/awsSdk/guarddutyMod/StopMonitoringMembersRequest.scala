package typings.awsSdk.guarddutyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StopMonitoringMembersRequest extends js.Object {
  /**
    * A list of account IDs for the member accounts to stop monitoring.
    */
  var AccountIds: typings.awsSdk.guarddutyMod.AccountIds = js.native
  /**
    * The unique ID of the detector associated with the GuardDuty master account that is monitoring member accounts.
    */
  var DetectorId: typings.awsSdk.guarddutyMod.DetectorId = js.native
}

object StopMonitoringMembersRequest {
  @scala.inline
  def apply(AccountIds: AccountIds, DetectorId: DetectorId): StopMonitoringMembersRequest = {
    val __obj = js.Dynamic.literal(AccountIds = AccountIds.asInstanceOf[js.Any], DetectorId = DetectorId.asInstanceOf[js.Any])
    __obj.asInstanceOf[StopMonitoringMembersRequest]
  }
  @scala.inline
  implicit class StopMonitoringMembersRequestOps[Self <: StopMonitoringMembersRequest] (val x: Self) extends AnyVal {
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

