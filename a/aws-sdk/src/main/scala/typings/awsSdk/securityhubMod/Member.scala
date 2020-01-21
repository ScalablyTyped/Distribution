package typings.awsSdk.securityhubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Member extends js.Object {
  /**
    * The AWS account ID of the member account.
    */
  var AccountId: js.UndefOr[typings.awsSdk.securityhubMod.AccountId] = js.native
  /**
    * The email address of the member account.
    */
  var Email: js.UndefOr[NonEmptyString] = js.native
  /**
    * A timestamp for the date and time when the invitation was sent to the member account.
    */
  var InvitedAt: js.UndefOr[Timestamp] = js.native
  /**
    * The AWS account ID of the Security Hub master account associated with this member account.
    */
  var MasterId: js.UndefOr[NonEmptyString] = js.native
  /**
    * The status of the relationship between the member account and its master account. 
    */
  var MemberStatus: js.UndefOr[NonEmptyString] = js.native
  /**
    * The timestamp for the date and time when the member account was updated.
    */
  var UpdatedAt: js.UndefOr[Timestamp] = js.native
}

object Member {
  @scala.inline
  def apply(
    AccountId: AccountId = null,
    Email: NonEmptyString = null,
    InvitedAt: Timestamp = null,
    MasterId: NonEmptyString = null,
    MemberStatus: NonEmptyString = null,
    UpdatedAt: Timestamp = null
  ): Member = {
    val __obj = js.Dynamic.literal()
    if (AccountId != null) __obj.updateDynamic("AccountId")(AccountId.asInstanceOf[js.Any])
    if (Email != null) __obj.updateDynamic("Email")(Email.asInstanceOf[js.Any])
    if (InvitedAt != null) __obj.updateDynamic("InvitedAt")(InvitedAt.asInstanceOf[js.Any])
    if (MasterId != null) __obj.updateDynamic("MasterId")(MasterId.asInstanceOf[js.Any])
    if (MemberStatus != null) __obj.updateDynamic("MemberStatus")(MemberStatus.asInstanceOf[js.Any])
    if (UpdatedAt != null) __obj.updateDynamic("UpdatedAt")(UpdatedAt.asInstanceOf[js.Any])
    __obj.asInstanceOf[Member]
  }
}

