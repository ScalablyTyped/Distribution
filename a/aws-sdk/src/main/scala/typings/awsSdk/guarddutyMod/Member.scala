package typings.awsSdk.guarddutyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Member extends js.Object {
  /**
    * Member account ID.
    */
  var AccountId: typings.awsSdk.guarddutyMod.AccountId = js.native
  /**
    * Member account's detector ID.
    */
  var DetectorId: js.UndefOr[typings.awsSdk.guarddutyMod.DetectorId] = js.native
  /**
    * Member account's email address.
    */
  var Email: typings.awsSdk.guarddutyMod.Email = js.native
  /**
    * Timestamp at which the invitation was sent
    */
  var InvitedAt: js.UndefOr[String] = js.native
  /**
    * Master account ID.
    */
  var MasterId: String = js.native
  /**
    * The status of the relationship between the member and the master.
    */
  var RelationshipStatus: String = js.native
  /**
    * Member last updated timestamp.
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

