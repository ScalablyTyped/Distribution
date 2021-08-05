package typings.awsSdk.configserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OrganizationConfigRuleStatus extends StObject {
  
  /**
    * An error code that is returned when organization config rule creation or deletion has failed.
    */
  var ErrorCode: js.UndefOr[String] = js.undefined
  
  /**
    * An error message indicating that organization config rule creation or deletion failed due to an error.
    */
  var ErrorMessage: js.UndefOr[String] = js.undefined
  
  /**
    * The timestamp of the last update.
    */
  var LastUpdateTime: js.UndefOr[Date] = js.undefined
  
  /**
    * The name that you assign to organization config rule.
    */
  var OrganizationConfigRuleName: typings.awsSdk.configserviceMod.OrganizationConfigRuleName
  
  /**
    * Indicates deployment status of an organization config rule. When master account calls PutOrganizationConfigRule action for the first time, config rule status is created in all the member accounts. When master account calls PutOrganizationConfigRule action for the second time, config rule status is updated in all the member accounts. Additionally, config rule status is updated when one or more member accounts join or leave an organization. Config rule status is deleted when the master account deletes OrganizationConfigRule in all the member accounts and disables service access for config-multiaccountsetup.amazonaws.com. AWS Config sets the state of the rule to:    CREATE_SUCCESSFUL when an organization config rule has been successfully created in all the member accounts.     CREATE_IN_PROGRESS when an organization config rule creation is in progress.    CREATE_FAILED when an organization config rule creation failed in one or more member accounts within that organization.    DELETE_FAILED when an organization config rule deletion failed in one or more member accounts within that organization.    DELETE_IN_PROGRESS when an organization config rule deletion is in progress.    DELETE_SUCCESSFUL when an organization config rule has been successfully deleted from all the member accounts.    UPDATE_SUCCESSFUL when an organization config rule has been successfully updated in all the member accounts.    UPDATE_IN_PROGRESS when an organization config rule update is in progress.    UPDATE_FAILED when an organization config rule update failed in one or more member accounts within that organization.  
    */
  var OrganizationRuleStatus: typings.awsSdk.configserviceMod.OrganizationRuleStatus
}
object OrganizationConfigRuleStatus {
  
  inline def apply(
    OrganizationConfigRuleName: OrganizationConfigRuleName,
    OrganizationRuleStatus: OrganizationRuleStatus
  ): OrganizationConfigRuleStatus = {
    val __obj = js.Dynamic.literal(OrganizationConfigRuleName = OrganizationConfigRuleName.asInstanceOf[js.Any], OrganizationRuleStatus = OrganizationRuleStatus.asInstanceOf[js.Any])
    __obj.asInstanceOf[OrganizationConfigRuleStatus]
  }
  
  extension [Self <: OrganizationConfigRuleStatus](x: Self) {
    
    inline def setErrorCode(value: String): Self = StObject.set(x, "ErrorCode", value.asInstanceOf[js.Any])
    
    inline def setErrorCodeUndefined: Self = StObject.set(x, "ErrorCode", js.undefined)
    
    inline def setErrorMessage(value: String): Self = StObject.set(x, "ErrorMessage", value.asInstanceOf[js.Any])
    
    inline def setErrorMessageUndefined: Self = StObject.set(x, "ErrorMessage", js.undefined)
    
    inline def setLastUpdateTime(value: Date): Self = StObject.set(x, "LastUpdateTime", value.asInstanceOf[js.Any])
    
    inline def setLastUpdateTimeUndefined: Self = StObject.set(x, "LastUpdateTime", js.undefined)
    
    inline def setOrganizationConfigRuleName(value: OrganizationConfigRuleName): Self = StObject.set(x, "OrganizationConfigRuleName", value.asInstanceOf[js.Any])
    
    inline def setOrganizationRuleStatus(value: OrganizationRuleStatus): Self = StObject.set(x, "OrganizationRuleStatus", value.asInstanceOf[js.Any])
  }
}
