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
    * For member accounts with a status of ACCEPTED_BUT_DISABLED, the reason that the member account is not enabled. The reason can have one of the following values:    VOLUME_TOO_HIGH - Indicates that adding the member account would cause the data volume for the behavior graph to be too high.    VOLUME_UNKNOWN - Indicates that Detective is unable to verify the data volume for the member account. This is usually because the member account is not enrolled in Amazon GuardDuty.   
    */
  var DisabledReason: js.UndefOr[MemberDisabledReason] = js.native
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
    * The member account data volume as a percentage of the maximum allowed data volume. 0 indicates 0 percent, and 100 indicates 100 percent. Note that this is not the percentage of the behavior graph data volume. For example, the data volume for the behavior graph is 80 GB per day. The maximum data volume is 160 GB per day. If the data volume for the member account is 40 GB per day, then PercentOfGraphUtilization is 25. It represents 25% of the maximum allowed data volume. 
    */
  var PercentOfGraphUtilization: js.UndefOr[Percentage] = js.native
  /**
    * The date and time when the graph utilization percentage was last updated.
    */
  var PercentOfGraphUtilizationUpdatedTime: js.UndefOr[Timestamp] = js.native
  /**
    * The current membership status of the member account. The status can have one of the following values:    INVITED - Indicates that the member was sent an invitation but has not yet responded.    VERIFICATION_IN_PROGRESS - Indicates that Detective is verifying that the account identifier and email address provided for the member account match. If they do match, then Detective sends the invitation. If the email address and account identifier don't match, then the member cannot be added to the behavior graph.    VERIFICATION_FAILED - Indicates that the account and email address provided for the member account do not match, and Detective did not send an invitation to the account.    ENABLED - Indicates that the member account accepted the invitation to contribute to the behavior graph.    ACCEPTED_BUT_DISABLED - Indicates that the member account accepted the invitation but is prevented from contributing data to the behavior graph. DisabledReason provides the reason why the member account is not enabled.   Member accounts that declined an invitation or that were removed from the behavior graph are not included.
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
    DisabledReason: MemberDisabledReason = null,
    EmailAddress: EmailAddress = null,
    GraphArn: GraphArn = null,
    InvitedTime: Timestamp = null,
    MasterId: AccountId = null,
    PercentOfGraphUtilization: Int | Double = null,
    PercentOfGraphUtilizationUpdatedTime: Timestamp = null,
    Status: MemberStatus = null,
    UpdatedTime: Timestamp = null
  ): MemberDetail = {
    val __obj = js.Dynamic.literal()
    if (AccountId != null) __obj.updateDynamic("AccountId")(AccountId.asInstanceOf[js.Any])
    if (DisabledReason != null) __obj.updateDynamic("DisabledReason")(DisabledReason.asInstanceOf[js.Any])
    if (EmailAddress != null) __obj.updateDynamic("EmailAddress")(EmailAddress.asInstanceOf[js.Any])
    if (GraphArn != null) __obj.updateDynamic("GraphArn")(GraphArn.asInstanceOf[js.Any])
    if (InvitedTime != null) __obj.updateDynamic("InvitedTime")(InvitedTime.asInstanceOf[js.Any])
    if (MasterId != null) __obj.updateDynamic("MasterId")(MasterId.asInstanceOf[js.Any])
    if (PercentOfGraphUtilization != null) __obj.updateDynamic("PercentOfGraphUtilization")(PercentOfGraphUtilization.asInstanceOf[js.Any])
    if (PercentOfGraphUtilizationUpdatedTime != null) __obj.updateDynamic("PercentOfGraphUtilizationUpdatedTime")(PercentOfGraphUtilizationUpdatedTime.asInstanceOf[js.Any])
    if (Status != null) __obj.updateDynamic("Status")(Status.asInstanceOf[js.Any])
    if (UpdatedTime != null) __obj.updateDynamic("UpdatedTime")(UpdatedTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[MemberDetail]
  }
}

