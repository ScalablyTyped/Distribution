package typings.awsSdk.configserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PutOrganizationConfigRuleRequest extends StObject {
  
  /**
    * A comma-separated list of accounts that you want to exclude from an organization config rule.
    */
  var ExcludedAccounts: js.UndefOr[typings.awsSdk.configserviceMod.ExcludedAccounts] = js.undefined
  
  /**
    * The name that you assign to an organization config rule.
    */
  var OrganizationConfigRuleName: typings.awsSdk.configserviceMod.OrganizationConfigRuleName
  
  /**
    * An OrganizationCustomRuleMetadata object.
    */
  var OrganizationCustomRuleMetadata: js.UndefOr[typings.awsSdk.configserviceMod.OrganizationCustomRuleMetadata] = js.undefined
  
  /**
    * An OrganizationManagedRuleMetadata object. 
    */
  var OrganizationManagedRuleMetadata: js.UndefOr[typings.awsSdk.configserviceMod.OrganizationManagedRuleMetadata] = js.undefined
}
object PutOrganizationConfigRuleRequest {
  
  inline def apply(OrganizationConfigRuleName: OrganizationConfigRuleName): PutOrganizationConfigRuleRequest = {
    val __obj = js.Dynamic.literal(OrganizationConfigRuleName = OrganizationConfigRuleName.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutOrganizationConfigRuleRequest]
  }
  
  extension [Self <: PutOrganizationConfigRuleRequest](x: Self) {
    
    inline def setExcludedAccounts(value: ExcludedAccounts): Self = StObject.set(x, "ExcludedAccounts", value.asInstanceOf[js.Any])
    
    inline def setExcludedAccountsUndefined: Self = StObject.set(x, "ExcludedAccounts", js.undefined)
    
    inline def setExcludedAccountsVarargs(value: AccountId*): Self = StObject.set(x, "ExcludedAccounts", js.Array(value :_*))
    
    inline def setOrganizationConfigRuleName(value: OrganizationConfigRuleName): Self = StObject.set(x, "OrganizationConfigRuleName", value.asInstanceOf[js.Any])
    
    inline def setOrganizationCustomRuleMetadata(value: OrganizationCustomRuleMetadata): Self = StObject.set(x, "OrganizationCustomRuleMetadata", value.asInstanceOf[js.Any])
    
    inline def setOrganizationCustomRuleMetadataUndefined: Self = StObject.set(x, "OrganizationCustomRuleMetadata", js.undefined)
    
    inline def setOrganizationManagedRuleMetadata(value: OrganizationManagedRuleMetadata): Self = StObject.set(x, "OrganizationManagedRuleMetadata", value.asInstanceOf[js.Any])
    
    inline def setOrganizationManagedRuleMetadataUndefined: Self = StObject.set(x, "OrganizationManagedRuleMetadata", js.undefined)
  }
}
