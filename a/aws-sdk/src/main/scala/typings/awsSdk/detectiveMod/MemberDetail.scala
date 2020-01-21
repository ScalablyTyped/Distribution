package typings.awsSdk.detectiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MemberDetail extends js.Object {
  /**
    * The AWS account identifier for the member account.
    */
  var AccountId: js.UndefOr[typings.awsSdk.detectiveMod.AccountId] = js.native
  /**
    * The AWS account root user email address for the member account.
    */
  var EmailAddress: js.UndefOr[typings.awsSdk.detectiveMod.EmailAddress] = js.native
  /**
    * The ARN of the behavior graph that the member account was invited to.
    */
  var GraphArn: js.UndefOr[typings.awsSdk.detectiveMod.GraphArn] = js.native
  /**
    * The date and time that Detective sent the invitation to the member account. The value is in milliseconds since the epoch.
    */
  var InvitedTime: js.UndefOr[Timestamp] = js.native
  /**
    * The AWS account identifier of the master account for the behavior graph.
    */
  var MasterId: js.UndefOr[AccountId] = js.native
  /**
    * The current membership status of the member account. The status can have one of the following values:    INVITED - Indicates that the member was sent an invitation but has not yet responded.    VERIFICATION_IN_PROGRESS - Indicates that Detective is verifying that the account identifier and email address provided for the member account match. If they do match, then Detective sends the invitation. If the email address and account identifier don't match, then the member cannot be added to the behavior graph.    VERIFICATION_FAILED - Indicates that the account and email address provided for the member account do not match, and Detective did not send an invitation to the account.    ENABLED - Indicates that the member account accepted the invitation to contribute to the behavior graph.   Member accounts that declined an invitation or that were removed from the behavior graph are not included.
    */
  var Status: js.UndefOr[MemberStatus] = js.native
  /**
    * The date and time that the member account was last updated. The value is in milliseconds since the epoch.
    */
  var UpdatedTime: js.UndefOr[Timestamp] = js.native
}

object MemberDetail {
  @scala.inline
  def apply(
    AccountId: AccountId = null,
    EmailAddress: EmailAddress = null,
    GraphArn: GraphArn = null,
    InvitedTime: Timestamp = null,
    MasterId: AccountId = null,
    Status: MemberStatus = null,
    UpdatedTime: Timestamp = null
  ): MemberDetail = {
    val __obj = js.Dynamic.literal()
    if (AccountId != null) __obj.updateDynamic("AccountId")(AccountId.asInstanceOf[js.Any])
    if (EmailAddress != null) __obj.updateDynamic("EmailAddress")(EmailAddress.asInstanceOf[js.Any])
    if (GraphArn != null) __obj.updateDynamic("GraphArn")(GraphArn.asInstanceOf[js.Any])
    if (InvitedTime != null) __obj.updateDynamic("InvitedTime")(InvitedTime.asInstanceOf[js.Any])
    if (MasterId != null) __obj.updateDynamic("MasterId")(MasterId.asInstanceOf[js.Any])
    if (Status != null) __obj.updateDynamic("Status")(Status.asInstanceOf[js.Any])
    if (UpdatedTime != null) __obj.updateDynamic("UpdatedTime")(UpdatedTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[MemberDetail]
  }
}

