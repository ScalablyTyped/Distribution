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
  def apply(
    accountId: string = null,
    invitationId: string = null,
    invitedAt: timestampIso8601 = null,
    relationshipStatus: RelationshipStatus = null
  ): Invitation = {
    val __obj = js.Dynamic.literal()
    if (accountId != null) __obj.updateDynamic("accountId")(accountId.asInstanceOf[js.Any])
    if (invitationId != null) __obj.updateDynamic("invitationId")(invitationId.asInstanceOf[js.Any])
    if (invitedAt != null) __obj.updateDynamic("invitedAt")(invitedAt.asInstanceOf[js.Any])
    if (relationshipStatus != null) __obj.updateDynamic("relationshipStatus")(relationshipStatus.asInstanceOf[js.Any])
    __obj.asInstanceOf[Invitation]
  }
}

