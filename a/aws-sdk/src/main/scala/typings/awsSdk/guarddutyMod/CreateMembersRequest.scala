package typings.awsSdk.guarddutyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateMembersRequest extends js.Object {
  /**
    * A list of account ID and email address pairs of the accounts that you want to associate with the master GuardDuty account.
    */
  var AccountDetails: typings.awsSdk.guarddutyMod.AccountDetails = js.native
  /**
    * The unique ID of the detector of the GuardDuty account that you want to associate member accounts with.
    */
  var DetectorId: typings.awsSdk.guarddutyMod.DetectorId = js.native
}

object CreateMembersRequest {
  @scala.inline
  def apply(AccountDetails: AccountDetails, DetectorId: DetectorId): CreateMembersRequest = {
    val __obj = js.Dynamic.literal(AccountDetails = AccountDetails.asInstanceOf[js.Any], DetectorId = DetectorId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateMembersRequest]
  }
}

