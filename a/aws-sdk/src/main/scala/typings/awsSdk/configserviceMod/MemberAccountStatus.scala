package typings.awsSdk.configserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MemberAccountStatus extends StObject {
  
  /**
    * The 12-digit account ID of a member account.
    */
  var AccountId: typings.awsSdk.configserviceMod.AccountId
  
  /**
    * The name of Config rule deployed in the member account.
    */
  var ConfigRuleName: StringWithCharLimit64
  
  /**
    * An error code that is returned when Config rule creation or deletion failed in the member account.
    */
  var ErrorCode: js.UndefOr[String] = js.undefined
  
  /**
    * An error message indicating that Config rule account creation or deletion has failed due to an error in the member account.
    */
  var ErrorMessage: js.UndefOr[String] = js.undefined
  
  /**
    * The timestamp of the last status update.
    */
  var LastUpdateTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * Indicates deployment status for Config rule in the member account. When master account calls PutOrganizationConfigRule action for the first time, Config rule status is created in the member account. When master account calls PutOrganizationConfigRule action for the second time, Config rule status is updated in the member account. Config rule status is deleted when the master account deletes OrganizationConfigRule and disables service access for config-multiaccountsetup.amazonaws.com.   Config sets the state of the rule to:    CREATE_SUCCESSFUL when Config rule has been created in the member account.     CREATE_IN_PROGRESS when Config rule is being created in the member account.    CREATE_FAILED when Config rule creation has failed in the member account.    DELETE_FAILED when Config rule deletion has failed in the member account.    DELETE_IN_PROGRESS when Config rule is being deleted in the member account.    DELETE_SUCCESSFUL when Config rule has been deleted in the member account.     UPDATE_SUCCESSFUL when Config rule has been updated in the member account.    UPDATE_IN_PROGRESS when Config rule is being updated in the member account.    UPDATE_FAILED when Config rule deletion has failed in the member account.  
    */
  var MemberAccountRuleStatus: typings.awsSdk.configserviceMod.MemberAccountRuleStatus
}
object MemberAccountStatus {
  
  inline def apply(
    AccountId: AccountId,
    ConfigRuleName: StringWithCharLimit64,
    MemberAccountRuleStatus: MemberAccountRuleStatus
  ): MemberAccountStatus = {
    val __obj = js.Dynamic.literal(AccountId = AccountId.asInstanceOf[js.Any], ConfigRuleName = ConfigRuleName.asInstanceOf[js.Any], MemberAccountRuleStatus = MemberAccountRuleStatus.asInstanceOf[js.Any])
    __obj.asInstanceOf[MemberAccountStatus]
  }
  
  extension [Self <: MemberAccountStatus](x: Self) {
    
    inline def setAccountId(value: AccountId): Self = StObject.set(x, "AccountId", value.asInstanceOf[js.Any])
    
    inline def setConfigRuleName(value: StringWithCharLimit64): Self = StObject.set(x, "ConfigRuleName", value.asInstanceOf[js.Any])
    
    inline def setErrorCode(value: String): Self = StObject.set(x, "ErrorCode", value.asInstanceOf[js.Any])
    
    inline def setErrorCodeUndefined: Self = StObject.set(x, "ErrorCode", js.undefined)
    
    inline def setErrorMessage(value: String): Self = StObject.set(x, "ErrorMessage", value.asInstanceOf[js.Any])
    
    inline def setErrorMessageUndefined: Self = StObject.set(x, "ErrorMessage", js.undefined)
    
    inline def setLastUpdateTime(value: js.Date): Self = StObject.set(x, "LastUpdateTime", value.asInstanceOf[js.Any])
    
    inline def setLastUpdateTimeUndefined: Self = StObject.set(x, "LastUpdateTime", js.undefined)
    
    inline def setMemberAccountRuleStatus(value: MemberAccountRuleStatus): Self = StObject.set(x, "MemberAccountRuleStatus", value.asInstanceOf[js.Any])
  }
}
