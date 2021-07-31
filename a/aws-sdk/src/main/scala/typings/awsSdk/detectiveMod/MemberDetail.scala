package typings.awsSdk.detectiveMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MemberDetail extends StObject {
  
  /**
    * The AWS account identifier for the member account.
    */
  var AccountId: js.UndefOr[typings.awsSdk.detectiveMod.AccountId] = js.undefined
  
  /**
    * For member accounts with a status of ACCEPTED_BUT_DISABLED, the reason that the member account is not enabled. The reason can have one of the following values:    VOLUME_TOO_HIGH - Indicates that adding the member account would cause the data volume for the behavior graph to be too high.    VOLUME_UNKNOWN - Indicates that Detective is unable to verify the data volume for the member account. This is usually because the member account is not enrolled in Amazon GuardDuty.   
    */
  var DisabledReason: js.UndefOr[MemberDisabledReason] = js.undefined
  
  /**
    * The AWS account root user email address for the member account.
    */
  var EmailAddress: js.UndefOr[typings.awsSdk.detectiveMod.EmailAddress] = js.undefined
  
  /**
    * The ARN of the behavior graph that the member account was invited to.
    */
  var GraphArn: js.UndefOr[typings.awsSdk.detectiveMod.GraphArn] = js.undefined
  
  /**
    * The date and time that Detective sent the invitation to the member account. The value is in milliseconds since the epoch.
    */
  var InvitedTime: js.UndefOr[Timestamp] = js.undefined
  
  /**
    * The AWS account identifier of the master account for the behavior graph.
    */
  var MasterId: js.UndefOr[AccountId] = js.undefined
  
  /**
    * The member account data volume as a percentage of the maximum allowed data volume. 0 indicates 0 percent, and 100 indicates 100 percent. Note that this is not the percentage of the behavior graph data volume. For example, the data volume for the behavior graph is 80 GB per day. The maximum data volume is 160 GB per day. If the data volume for the member account is 40 GB per day, then PercentOfGraphUtilization is 25. It represents 25% of the maximum allowed data volume. 
    */
  var PercentOfGraphUtilization: js.UndefOr[Percentage] = js.undefined
  
  /**
    * The date and time when the graph utilization percentage was last updated.
    */
  var PercentOfGraphUtilizationUpdatedTime: js.UndefOr[Timestamp] = js.undefined
  
  /**
    * The current membership status of the member account. The status can have one of the following values:    INVITED - Indicates that the member was sent an invitation but has not yet responded.    VERIFICATION_IN_PROGRESS - Indicates that Detective is verifying that the account identifier and email address provided for the member account match. If they do match, then Detective sends the invitation. If the email address and account identifier don't match, then the member cannot be added to the behavior graph.    VERIFICATION_FAILED - Indicates that the account and email address provided for the member account do not match, and Detective did not send an invitation to the account.    ENABLED - Indicates that the member account accepted the invitation to contribute to the behavior graph.    ACCEPTED_BUT_DISABLED - Indicates that the member account accepted the invitation but is prevented from contributing data to the behavior graph. DisabledReason provides the reason why the member account is not enabled.   Member accounts that declined an invitation or that were removed from the behavior graph are not included.
    */
  var Status: js.UndefOr[MemberStatus] = js.undefined
  
  /**
    * The date and time that the member account was last updated. The value is in milliseconds since the epoch.
    */
  var UpdatedTime: js.UndefOr[Timestamp] = js.undefined
}
object MemberDetail {
  
  @scala.inline
  def apply(): MemberDetail = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MemberDetail]
  }
  
  @scala.inline
  implicit class MemberDetailMutableBuilder[Self <: MemberDetail] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccountId(value: AccountId): Self = StObject.set(x, "AccountId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccountIdUndefined: Self = StObject.set(x, "AccountId", js.undefined)
    
    @scala.inline
    def setDisabledReason(value: MemberDisabledReason): Self = StObject.set(x, "DisabledReason", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisabledReasonUndefined: Self = StObject.set(x, "DisabledReason", js.undefined)
    
    @scala.inline
    def setEmailAddress(value: EmailAddress): Self = StObject.set(x, "EmailAddress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmailAddressUndefined: Self = StObject.set(x, "EmailAddress", js.undefined)
    
    @scala.inline
    def setGraphArn(value: GraphArn): Self = StObject.set(x, "GraphArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGraphArnUndefined: Self = StObject.set(x, "GraphArn", js.undefined)
    
    @scala.inline
    def setInvitedTime(value: Timestamp): Self = StObject.set(x, "InvitedTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInvitedTimeUndefined: Self = StObject.set(x, "InvitedTime", js.undefined)
    
    @scala.inline
    def setMasterId(value: AccountId): Self = StObject.set(x, "MasterId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMasterIdUndefined: Self = StObject.set(x, "MasterId", js.undefined)
    
    @scala.inline
    def setPercentOfGraphUtilization(value: Percentage): Self = StObject.set(x, "PercentOfGraphUtilization", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPercentOfGraphUtilizationUndefined: Self = StObject.set(x, "PercentOfGraphUtilization", js.undefined)
    
    @scala.inline
    def setPercentOfGraphUtilizationUpdatedTime(value: Timestamp): Self = StObject.set(x, "PercentOfGraphUtilizationUpdatedTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPercentOfGraphUtilizationUpdatedTimeUndefined: Self = StObject.set(x, "PercentOfGraphUtilizationUpdatedTime", js.undefined)
    
    @scala.inline
    def setStatus(value: MemberStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
    
    @scala.inline
    def setUpdatedTime(value: Timestamp): Self = StObject.set(x, "UpdatedTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdatedTimeUndefined: Self = StObject.set(x, "UpdatedTime", js.undefined)
  }
}
