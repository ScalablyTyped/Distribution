package typings.awsSdk.guarddutyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Master extends js.Object {
  /**
    * The ID of the account used as the Master account.
    */
  var AccountId: js.UndefOr[typings.awsSdk.guarddutyMod.AccountId] = js.native
  /**
    * This value is used to validate the master account to the member account.
    */
  var InvitationId: js.UndefOr[String] = js.native
  /**
    * Timestamp at which the invitation was sent.
    */
  var InvitedAt: js.UndefOr[String] = js.native
  /**
    * The status of the relationship between the master and member accounts.
    */
  var RelationshipStatus: js.UndefOr[String] = js.native
}

object Master {
  @scala.inline
  def apply(
    AccountId: AccountId = null,
    InvitationId: String = null,
    InvitedAt: String = null,
    RelationshipStatus: String = null
  ): Master = {
    val __obj = js.Dynamic.literal()
    if (AccountId != null) __obj.updateDynamic("AccountId")(AccountId.asInstanceOf[js.Any])
    if (InvitationId != null) __obj.updateDynamic("InvitationId")(InvitationId.asInstanceOf[js.Any])
    if (InvitedAt != null) __obj.updateDynamic("InvitedAt")(InvitedAt.asInstanceOf[js.Any])
    if (RelationshipStatus != null) __obj.updateDynamic("RelationshipStatus")(RelationshipStatus.asInstanceOf[js.Any])
    __obj.asInstanceOf[Master]
  }
}

