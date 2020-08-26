package typings.awsSdk.macie2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Invitation extends js.Object {
  /**
    * The AWS account ID for the account that sent the invitation.
    */
  var accountId: js.UndefOr[string] = js.native
  /**
    * The unique identifier for the invitation. Amazon Macie uses this identifier to validate the inviter account with the invitee account.
    */
  var invitationId: js.UndefOr[string] = js.native
  /**
    * The date and time, in UTC and extended ISO 8601 format, when the invitation was sent.
    */
  var invitedAt: js.UndefOr[timestampIso8601] = js.native
  /**
    * The status of the relationship between the account that sent the invitation (inviter account) and the account that received the invitation (invitee account).
    */
  var relationshipStatus: js.UndefOr[RelationshipStatus] = js.native
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
    def setAccountId(value: string): Self = this.set("accountId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAccountId: Self = this.set("accountId", js.undefined)
    @scala.inline
    def setInvitationId(value: string): Self = this.set("invitationId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInvitationId: Self = this.set("invitationId", js.undefined)
    @scala.inline
    def setInvitedAt(value: timestampIso8601): Self = this.set("invitedAt", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInvitedAt: Self = this.set("invitedAt", js.undefined)
    @scala.inline
    def setRelationshipStatus(value: RelationshipStatus): Self = this.set("relationshipStatus", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRelationshipStatus: Self = this.set("relationshipStatus", js.undefined)
  }
  
}

