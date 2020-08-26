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
  def apply(): Member = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Member]
  }
  @scala.inline
  implicit class MemberOps[Self <: Member] (val x: Self) extends AnyVal {
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
    def setEmail(value: NonEmptyString): Self = this.set("Email", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEmail: Self = this.set("Email", js.undefined)
    @scala.inline
    def setInvitedAt(value: Timestamp): Self = this.set("InvitedAt", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInvitedAt: Self = this.set("InvitedAt", js.undefined)
    @scala.inline
    def setMasterId(value: NonEmptyString): Self = this.set("MasterId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMasterId: Self = this.set("MasterId", js.undefined)
    @scala.inline
    def setMemberStatus(value: NonEmptyString): Self = this.set("MemberStatus", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMemberStatus: Self = this.set("MemberStatus", js.undefined)
    @scala.inline
    def setUpdatedAt(value: Timestamp): Self = this.set("UpdatedAt", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUpdatedAt: Self = this.set("UpdatedAt", js.undefined)
  }
  
}

