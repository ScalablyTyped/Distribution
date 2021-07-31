package typings.awsSdk.configserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OrganizationConfigRule extends StObject {
  
  /**
    * A comma-separated list of accounts excluded from organization config rule.
    */
  var ExcludedAccounts: js.UndefOr[typings.awsSdk.configserviceMod.ExcludedAccounts] = js.undefined
  
  /**
    * The timestamp of the last update.
    */
  var LastUpdateTime: js.UndefOr[Date] = js.undefined
  
  /**
    * Amazon Resource Name (ARN) of organization config rule.
    */
  var OrganizationConfigRuleArn: StringWithCharLimit256
  
  /**
    * The name that you assign to organization config rule.
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
object OrganizationConfigRule {
  
  @scala.inline
  def apply(
    OrganizationConfigRuleArn: StringWithCharLimit256,
    OrganizationConfigRuleName: OrganizationConfigRuleName
  ): OrganizationConfigRule = {
    val __obj = js.Dynamic.literal(OrganizationConfigRuleArn = OrganizationConfigRuleArn.asInstanceOf[js.Any], OrganizationConfigRuleName = OrganizationConfigRuleName.asInstanceOf[js.Any])
    __obj.asInstanceOf[OrganizationConfigRule]
  }
  
  @scala.inline
  implicit class OrganizationConfigRuleMutableBuilder[Self <: OrganizationConfigRule] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExcludedAccounts(value: ExcludedAccounts): Self = StObject.set(x, "ExcludedAccounts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExcludedAccountsUndefined: Self = StObject.set(x, "ExcludedAccounts", js.undefined)
    
    @scala.inline
    def setExcludedAccountsVarargs(value: AccountId*): Self = StObject.set(x, "ExcludedAccounts", js.Array(value :_*))
    
    @scala.inline
    def setLastUpdateTime(value: Date): Self = StObject.set(x, "LastUpdateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastUpdateTimeUndefined: Self = StObject.set(x, "LastUpdateTime", js.undefined)
    
    @scala.inline
    def setOrganizationConfigRuleArn(value: StringWithCharLimit256): Self = StObject.set(x, "OrganizationConfigRuleArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrganizationConfigRuleName(value: OrganizationConfigRuleName): Self = StObject.set(x, "OrganizationConfigRuleName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrganizationCustomRuleMetadata(value: OrganizationCustomRuleMetadata): Self = StObject.set(x, "OrganizationCustomRuleMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrganizationCustomRuleMetadataUndefined: Self = StObject.set(x, "OrganizationCustomRuleMetadata", js.undefined)
    
    @scala.inline
    def setOrganizationManagedRuleMetadata(value: OrganizationManagedRuleMetadata): Self = StObject.set(x, "OrganizationManagedRuleMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrganizationManagedRuleMetadataUndefined: Self = StObject.set(x, "OrganizationManagedRuleMetadata", js.undefined)
  }
}
