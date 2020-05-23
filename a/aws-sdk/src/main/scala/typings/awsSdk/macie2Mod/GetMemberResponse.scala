package typings.awsSdk.macie2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetMemberResponse extends js.Object {
  /**
    * The AWS account ID for the account.
    */
  var accountId: js.UndefOr[string] = js.native
  /**
    * The Amazon Resource Name (ARN) of the account.
    */
  var arn: js.UndefOr[string] = js.native
  /**
    * The email address for the account.
    */
  var email: js.UndefOr[string] = js.native
  /**
    * The date and time, in UTC and extended ISO 8601 format, when an Amazon Macie membership invitation was last sent to the account. This value is null if a Macie invitation hasn't been sent to the account.
    */
  var invitedAt: js.UndefOr[timestampIso8601] = js.native
  /**
    * The AWS account ID for the master account.
    */
  var masterAccountId: js.UndefOr[string] = js.native
  /**
    * The current status of the relationship between the account and the master account.
    */
  var relationshipStatus: js.UndefOr[RelationshipStatus] = js.native
  /**
    * A map of key-value pairs that identifies the tags (keys and values) that are associated with the member account in Amazon Macie.
    */
  var tags: js.UndefOr[TagMap] = js.native
  /**
    * The date and time, in UTC and extended ISO 8601 format, of the most recent change to the status of the relationship between the account and the master account.
    */
  var updatedAt: js.UndefOr[timestampIso8601] = js.native
}

object GetMemberResponse {
  @scala.inline
  def apply(
    accountId: string = null,
    arn: string = null,
    email: string = null,
    invitedAt: timestampIso8601 = null,
    masterAccountId: string = null,
    relationshipStatus: RelationshipStatus = null,
    tags: TagMap = null,
    updatedAt: timestampIso8601 = null
  ): GetMemberResponse = {
    val __obj = js.Dynamic.literal()
    if (accountId != null) __obj.updateDynamic("accountId")(accountId.asInstanceOf[js.Any])
    if (arn != null) __obj.updateDynamic("arn")(arn.asInstanceOf[js.Any])
    if (email != null) __obj.updateDynamic("email")(email.asInstanceOf[js.Any])
    if (invitedAt != null) __obj.updateDynamic("invitedAt")(invitedAt.asInstanceOf[js.Any])
    if (masterAccountId != null) __obj.updateDynamic("masterAccountId")(masterAccountId.asInstanceOf[js.Any])
    if (relationshipStatus != null) __obj.updateDynamic("relationshipStatus")(relationshipStatus.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    if (updatedAt != null) __obj.updateDynamic("updatedAt")(updatedAt.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetMemberResponse]
  }
}

