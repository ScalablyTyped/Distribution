package typings.awsSdk.guarddutyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Invitation extends js.Object {
  /**
    * The ID of the account from which the invitations was sent.
    */
  var AccountId: js.UndefOr[typings.awsSdk.guarddutyMod.AccountId] = js.native
  /**
    * The ID of the invitation. This value is used to validate the inviter account to the member account.
    */
  var InvitationId: js.UndefOr[String] = js.native
  /**
    * Timestamp at which the invitation was sent.
    */
  var InvitedAt: js.UndefOr[String] = js.native
  /**
    * The status of the relationship between the inviter and invitee accounts.
    */
  var RelationshipStatus: js.UndefOr[String] = js.native
}

object Invitation {
  @scala.inline
  def apply(
    AccountId: AccountId = null,
    InvitationId: String = null,
    InvitedAt: String = null,
    RelationshipStatus: String = null
  ): Invitation = {
    val __obj = js.Dynamic.literal()
    if (AccountId != null) __obj.updateDynamic("AccountId")(AccountId.asInstanceOf[js.Any])
    if (InvitationId != null) __obj.updateDynamic("InvitationId")(InvitationId.asInstanceOf[js.Any])
    if (InvitedAt != null) __obj.updateDynamic("InvitedAt")(InvitedAt.asInstanceOf[js.Any])
    if (RelationshipStatus != null) __obj.updateDynamic("RelationshipStatus")(RelationshipStatus.asInstanceOf[js.Any])
    __obj.asInstanceOf[Invitation]
  }
}

