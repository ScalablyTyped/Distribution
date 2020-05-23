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
}

