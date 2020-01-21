package typings.awsSdk.guarddutyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StartMonitoringMembersRequest extends js.Object {
  /**
    * A list of account IDs of the GuardDuty member accounts to start monitoring.
    */
  var AccountIds: typings.awsSdk.guarddutyMod.AccountIds = js.native
  /**
    * The unique ID of the detector of the GuardDuty master account associated with the member accounts to monitor.
    */
  var DetectorId: typings.awsSdk.guarddutyMod.DetectorId = js.native
}

object StartMonitoringMembersRequest {
  @scala.inline
  def apply(AccountIds: AccountIds, DetectorId: DetectorId): StartMonitoringMembersRequest = {
    val __obj = js.Dynamic.literal(AccountIds = AccountIds.asInstanceOf[js.Any], DetectorId = DetectorId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[StartMonitoringMembersRequest]
  }
}

