package typings.awsSdk.guarddutyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DisassociateMembersRequest extends js.Object {
  /**
    * A list of account IDs of the GuardDuty member accounts that you want to disassociate from master.
    */
  var AccountIds: typings.awsSdk.guarddutyMod.AccountIds = js.native
  /**
    * The unique ID of the detector of the GuardDuty account whose members you want to disassociate from master.
    */
  var DetectorId: typings.awsSdk.guarddutyMod.DetectorId = js.native
}

object DisassociateMembersRequest {
  @scala.inline
  def apply(AccountIds: AccountIds, DetectorId: DetectorId): DisassociateMembersRequest = {
    val __obj = js.Dynamic.literal(AccountIds = AccountIds.asInstanceOf[js.Any], DetectorId = DetectorId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DisassociateMembersRequest]
  }
}

