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
  def apply(): Invitation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Invitation]
  }
  @scala.inline
  implicit class InvitationOps[Self <: Invitation] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAccountId(value: AccountId): Self = this.set("AccountId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAccountId: Self = this.set("AccountId", js.undefined)
    @scala.inline
    def setInvitationId(value: NonEmptyString): Self = this.set("InvitationId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInvitationId: Self = this.set("InvitationId", js.undefined)
    @scala.inline
    def setInvitedAt(value: Timestamp): Self = this.set("InvitedAt", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInvitedAt: Self = this.set("InvitedAt", js.undefined)
    @scala.inline
    def setMemberStatus(value: NonEmptyString): Self = this.set("MemberStatus", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMemberStatus: Self = this.set("MemberStatus", js.undefined)
  }
  
}

