package typings.awsSdk.guarddutyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Member extends js.Object {
  /**
    * The ID of the member account.
    */
  var AccountId: typings.awsSdk.guarddutyMod.AccountId = js.native
  /**
    * The detector ID of the member account.
    */
  var DetectorId: js.UndefOr[typings.awsSdk.guarddutyMod.DetectorId] = js.native
  /**
    * The email address of the member account.
    */
  var Email: typings.awsSdk.guarddutyMod.Email = js.native
  /**
    * The timestamp when the invitation was sent.
    */
  var InvitedAt: js.UndefOr[String] = js.native
  /**
    * The master account ID.
    */
  var MasterId: String = js.native
  /**
    * The status of the relationship between the member and the master.
    */
  var RelationshipStatus: String = js.native
  /**
    * The last-updated timestamp of the member.
    */
  var UpdatedAt: String = js.native
}

object Member {
  @scala.inline
  def apply(
    AccountId: AccountId,
    Email: Email,
    MasterId: String,
    RelationshipStatus: String,
    UpdatedAt: String,
    DetectorId: DetectorId = null,
    InvitedAt: String = null
  ): Member = {
    val __obj = js.Dynamic.literal(AccountId = AccountId.asInstanceOf[js.Any], Email = Email.asInstanceOf[js.Any], MasterId = MasterId.asInstanceOf[js.Any], RelationshipStatus = RelationshipStatus.asInstanceOf[js.Any], UpdatedAt = UpdatedAt.asInstanceOf[js.Any])
    if (DetectorId != null) __obj.updateDynamic("DetectorId")(DetectorId.asInstanceOf[js.Any])
    if (InvitedAt != null) __obj.updateDynamic("InvitedAt")(InvitedAt.asInstanceOf[js.Any])
    __obj.asInstanceOf[Member]
  }
}

