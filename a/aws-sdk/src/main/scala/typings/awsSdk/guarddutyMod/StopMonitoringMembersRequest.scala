package typings.awsSdk.guarddutyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StopMonitoringMembersRequest extends js.Object {
  /**
    * A list of account IDs of the GuardDuty member accounts whose findings you want the master account to stop monitoring.
    */
  var AccountIds: typings.awsSdk.guarddutyMod.AccountIds = js.native
  /**
    * The unique ID of the detector of the GuardDuty account that you want to stop from monitor members' findings.
    */
  var DetectorId: typings.awsSdk.guarddutyMod.DetectorId = js.native
}

object StopMonitoringMembersRequest {
  @scala.inline
  def apply(AccountIds: AccountIds, DetectorId: DetectorId): StopMonitoringMembersRequest = {
    val __obj = js.Dynamic.literal(AccountIds = AccountIds.asInstanceOf[js.Any], DetectorId = DetectorId.asInstanceOf[js.Any])
    __obj.asInstanceOf[StopMonitoringMembersRequest]
  }
}

