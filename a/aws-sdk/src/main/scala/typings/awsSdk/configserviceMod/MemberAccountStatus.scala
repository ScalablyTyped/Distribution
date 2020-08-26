package typings.awsSdk.configserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MemberAccountStatus extends js.Object {
  /**
    * The 12-digit account ID of a member account.
    */
  var AccountId: typings.awsSdk.configserviceMod.AccountId = js.native
  /**
    * The name of config rule deployed in the member account.
    */
  var ConfigRuleName: StringWithCharLimit64 = js.native
  /**
    * An error code that is returned when config rule creation or deletion failed in the member account.
    */
  var ErrorCode: js.UndefOr[String] = js.native
  /**
    * An error message indicating that config rule account creation or deletion has failed due to an error in the member account.
    */
  var ErrorMessage: js.UndefOr[String] = js.native
  /**
    * The timestamp of the last status update.
    */
  var LastUpdateTime: js.UndefOr[Date] = js.native
  /**
    * Indicates deployment status for config rule in the member account. When master account calls PutOrganizationConfigRule action for the first time, config rule status is created in the member account. When master account calls PutOrganizationConfigRule action for the second time, config rule status is updated in the member account. Config rule status is deleted when the master account deletes OrganizationConfigRule and disables service access for config-multiaccountsetup.amazonaws.com.   AWS Config sets the state of the rule to:    CREATE_SUCCESSFUL when config rule has been created in the member account.     CREATE_IN_PROGRESS when config rule is being created in the member account.    CREATE_FAILED when config rule creation has failed in the member account.    DELETE_FAILED when config rule deletion has failed in the member account.    DELETE_IN_PROGRESS when config rule is being deleted in the member account.    DELETE_SUCCESSFUL when config rule has been deleted in the member account.     UPDATE_SUCCESSFUL when config rule has been updated in the member account.    UPDATE_IN_PROGRESS when config rule is being updated in the member account.    UPDATE_FAILED when config rule deletion has failed in the member account.  
    */
  var MemberAccountRuleStatus: typings.awsSdk.configserviceMod.MemberAccountRuleStatus = js.native
}

object MemberAccountStatus {
  @scala.inline
  def apply(
    AccountId: AccountId,
    ConfigRuleName: StringWithCharLimit64,
    MemberAccountRuleStatus: MemberAccountRuleStatus
  ): MemberAccountStatus = {
    val __obj = js.Dynamic.literal(AccountId = AccountId.asInstanceOf[js.Any], ConfigRuleName = ConfigRuleName.asInstanceOf[js.Any], MemberAccountRuleStatus = MemberAccountRuleStatus.asInstanceOf[js.Any])
    __obj.asInstanceOf[MemberAccountStatus]
  }
  @scala.inline
  implicit class MemberAccountStatusOps[Self <: MemberAccountStatus] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAccountId(value: AccountId): Self = this.set("AccountId", value.asInstanceOf[js.Any])
    @scala.inline
    def setConfigRuleName(value: StringWithCharLimit64): Self = this.set("ConfigRuleName", value.asInstanceOf[js.Any])
    @scala.inline
    def setMemberAccountRuleStatus(value: MemberAccountRuleStatus): Self = this.set("MemberAccountRuleStatus", value.asInstanceOf[js.Any])
    @scala.inline
    def setErrorCode(value: String): Self = this.set("ErrorCode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteErrorCode: Self = this.set("ErrorCode", js.undefined)
    @scala.inline
    def setErrorMessage(value: String): Self = this.set("ErrorMessage", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteErrorMessage: Self = this.set("ErrorMessage", js.undefined)
    @scala.inline
    def setLastUpdateTime(value: Date): Self = this.set("LastUpdateTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLastUpdateTime: Self = this.set("LastUpdateTime", js.undefined)
  }
  
}

