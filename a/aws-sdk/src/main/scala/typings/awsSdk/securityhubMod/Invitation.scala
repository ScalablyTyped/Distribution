package typings.awsSdk.securityhubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Invitation extends js.Object {
  /**
    * The account ID of the Security Hub master account that the invitation was sent from.
    */
  var AccountId: js.UndefOr[typings.awsSdk.securityhubMod.AccountId] = js.native
  /**
    * The ID of the invitation sent to the member account.
    */
  var InvitationId: js.UndefOr[NonEmptyString] = js.native
  /**
    * The timestamp of when the invitation was sent.
    */
  var InvitedAt: js.UndefOr[Timestamp] = js.native
  /**
    * The current status of the association between the member and master accounts.
    */
  var MemberStatus: js.UndefOr[NonEmptyString] = js.native
}

object Invitation {
  @scala.inline
  def apply(
    AccountId: AccountId = null,
    InvitationId: NonEmptyString = null,
    InvitedAt: Timestamp = null,
    MemberStatus: NonEmptyString = null
  ): Invitation = {
    val __obj = js.Dynamic.literal()
    if (AccountId != null) __obj.updateDynamic("AccountId")(AccountId.asInstanceOf[js.Any])
    if (InvitationId != null) __obj.updateDynamic("InvitationId")(InvitationId.asInstanceOf[js.Any])
    if (InvitedAt != null) __obj.updateDynamic("InvitedAt")(InvitedAt.asInstanceOf[js.Any])
    if (MemberStatus != null) __obj.updateDynamic("MemberStatus")(MemberStatus.asInstanceOf[js.Any])
    __obj.asInstanceOf[Invitation]
  }
}

