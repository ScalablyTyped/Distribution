package typings.awsSdk.guarddutyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InviteMembersRequest extends js.Object {
  /**
    * A list of account IDs of the accounts that you want to invite to GuardDuty as members.
    */
  var AccountIds: typings.awsSdk.guarddutyMod.AccountIds = js.native
  /**
    * The unique ID of the detector of the GuardDuty account with which you want to invite members.
    */
  var DetectorId: typings.awsSdk.guarddutyMod.DetectorId = js.native
  /**
    * A boolean value that specifies whether you want to disable email notification to the accounts that you’re inviting to GuardDuty as members.
    */
  var DisableEmailNotification: js.UndefOr[Boolean] = js.native
  /**
    * The invitation message that you want to send to the accounts that you’re inviting to GuardDuty as members.
    */
  var Message: js.UndefOr[String] = js.native
}

object InviteMembersRequest {
  @scala.inline
  def apply(
    AccountIds: AccountIds,
    DetectorId: DetectorId,
    DisableEmailNotification: js.UndefOr[scala.Boolean] = js.undefined,
    Message: String = null
  ): InviteMembersRequest = {
    val __obj = js.Dynamic.literal(AccountIds = AccountIds.asInstanceOf[js.Any], DetectorId = DetectorId.asInstanceOf[js.Any])
    if (!js.isUndefined(DisableEmailNotification)) __obj.updateDynamic("DisableEmailNotification")(DisableEmailNotification.asInstanceOf[js.Any])
    if (Message != null) __obj.updateDynamic("Message")(Message.asInstanceOf[js.Any])
    __obj.asInstanceOf[InviteMembersRequest]
  }
}

