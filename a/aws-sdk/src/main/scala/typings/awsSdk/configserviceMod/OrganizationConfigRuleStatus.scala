package typings.awsSdk.configserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OrganizationConfigRuleStatus extends js.Object {
  /**
    * An error code that is returned when organization config rule creation or deletion has failed.
    */
  var ErrorCode: js.UndefOr[String] = js.native
  /**
    * An error message indicating that organization config rule creation or deletion failed due to an error.
    */
  var ErrorMessage: js.UndefOr[String] = js.native
  /**
    * The timestamp of the last update.
    */
  var LastUpdateTime: js.UndefOr[Date] = js.native
  /**
    * The name that you assign to organization config rule.
    */
  var OrganizationConfigRuleName: typings.awsSdk.configserviceMod.OrganizationConfigRuleName = js.native
  /**
    * Indicates deployment status of an organization config rule. When master account calls PutOrganizationConfigRule action for the first time, config rule status is created in all the member accounts. When master account calls PutOrganizationConfigRule action for the second time, config rule status is updated in all the member accounts. Additionally, config rule status is updated when one or more member accounts join or leave an organization. Config rule status is deleted when the master account deletes OrganizationConfigRule in all the member accounts and disables service access for config-multiaccountsetup.amazonaws.com. AWS Config sets the state of the rule to:    CREATE_SUCCESSFUL when an organization config rule has been successfully created in all the member accounts.     CREATE_IN_PROGRESS when an organization config rule creation is in progress.    CREATE_FAILED when an organization config rule creation failed in one or more member accounts within that organization.    DELETE_FAILED when an organization config rule deletion failed in one or more member accounts within that organization.    DELETE_IN_PROGRESS when an organization config rule deletion is in progress.    DELETE_SUCCESSFUL when an organization config rule has been successfully deleted from all the member accounts.    UPDATE_SUCCESSFUL when an organization config rule has been successfully updated in all the member accounts.    UPDATE_IN_PROGRESS when an organization config rule update is in progress.    UPDATE_FAILED when an organization config rule update failed in one or more member accounts within that organization.  
    */
  var OrganizationRuleStatus: typings.awsSdk.configserviceMod.OrganizationRuleStatus = js.native
}

object OrganizationConfigRuleStatus {
  @scala.inline
  def apply(
    OrganizationConfigRuleName: OrganizationConfigRuleName,
    OrganizationRuleStatus: OrganizationRuleStatus
  ): OrganizationConfigRuleStatus = {
    val __obj = js.Dynamic.literal(OrganizationConfigRuleName = OrganizationConfigRuleName.asInstanceOf[js.Any], OrganizationRuleStatus = OrganizationRuleStatus.asInstanceOf[js.Any])
    __obj.asInstanceOf[OrganizationConfigRuleStatus]
  }
  @scala.inline
  implicit class OrganizationConfigRuleStatusOps[Self <: OrganizationConfigRuleStatus] (val x: Self) extends AnyVal {
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
    def setOrganizationConfigRuleName(value: OrganizationConfigRuleName): Self = this.set("OrganizationConfigRuleName", value.asInstanceOf[js.Any])
    @scala.inline
    def setOrganizationRuleStatus(value: OrganizationRuleStatus): Self = this.set("OrganizationRuleStatus", value.asInstanceOf[js.Any])
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

