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
  def apply(): MemberDetail = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MemberDetail]
  }
  @scala.inline
  implicit class MemberDetailOps[Self <: MemberDetail] (val x: Self) extends AnyVal {
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
    def setDisabledReason(value: MemberDisabledReason): Self = this.set("DisabledReason", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisabledReason: Self = this.set("DisabledReason", js.undefined)
    @scala.inline
    def setEmailAddress(value: EmailAddress): Self = this.set("EmailAddress", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEmailAddress: Self = this.set("EmailAddress", js.undefined)
    @scala.inline
    def setGraphArn(value: GraphArn): Self = this.set("GraphArn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGraphArn: Self = this.set("GraphArn", js.undefined)
    @scala.inline
    def setInvitedTime(value: Timestamp): Self = this.set("InvitedTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInvitedTime: Self = this.set("InvitedTime", js.undefined)
    @scala.inline
    def setMasterId(value: AccountId): Self = this.set("MasterId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMasterId: Self = this.set("MasterId", js.undefined)
    @scala.inline
    def setPercentOfGraphUtilization(value: Percentage): Self = this.set("PercentOfGraphUtilization", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePercentOfGraphUtilization: Self = this.set("PercentOfGraphUtilization", js.undefined)
    @scala.inline
    def setPercentOfGraphUtilizationUpdatedTime(value: Timestamp): Self = this.set("PercentOfGraphUtilizationUpdatedTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePercentOfGraphUtilizationUpdatedTime: Self = this.set("PercentOfGraphUtilizationUpdatedTime", js.undefined)
    @scala.inline
    def setStatus(value: MemberStatus): Self = this.set("Status", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatus: Self = this.set("Status", js.undefined)
    @scala.inline
    def setUpdatedTime(value: Timestamp): Self = this.set("UpdatedTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUpdatedTime: Self = this.set("UpdatedTime", js.undefined)
  }
  
}

