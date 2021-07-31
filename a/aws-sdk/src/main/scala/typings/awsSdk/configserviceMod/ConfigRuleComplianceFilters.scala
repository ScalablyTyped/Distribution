package typings.awsSdk.configserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConfigRuleComplianceFilters extends StObject {
  
  /**
    * The 12-digit account ID of the source account. 
    */
  var AccountId: js.UndefOr[typings.awsSdk.configserviceMod.AccountId] = js.undefined
  
  /**
    * The source region where the data is aggregated. 
    */
  var AwsRegion: js.UndefOr[typings.awsSdk.configserviceMod.AwsRegion] = js.undefined
  
  /**
    * The rule compliance status. For the ConfigRuleComplianceFilters data type, AWS Config supports only COMPLIANT and NON_COMPLIANT. AWS Config does not support the NOT_APPLICABLE and the INSUFFICIENT_DATA values.
    */
  var ComplianceType: js.UndefOr[typings.awsSdk.configserviceMod.ComplianceType] = js.undefined
  
  /**
    * The name of the AWS Config rule.
    */
  var ConfigRuleName: js.UndefOr[typings.awsSdk.configserviceMod.ConfigRuleName] = js.undefined
}
object ConfigRuleComplianceFilters {
  
  @scala.inline
  def apply(): ConfigRuleComplianceFilters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConfigRuleComplianceFilters]
  }
  
  @scala.inline
  implicit class ConfigRuleComplianceFiltersMutableBuilder[Self <: ConfigRuleComplianceFilters] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccountId(value: AccountId): Self = StObject.set(x, "AccountId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccountIdUndefined: Self = StObject.set(x, "AccountId", js.undefined)
    
    @scala.inline
    def setAwsRegion(value: AwsRegion): Self = StObject.set(x, "AwsRegion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAwsRegionUndefined: Self = StObject.set(x, "AwsRegion", js.undefined)
    
    @scala.inline
    def setComplianceType(value: ComplianceType): Self = StObject.set(x, "ComplianceType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComplianceTypeUndefined: Self = StObject.set(x, "ComplianceType", js.undefined)
    
    @scala.inline
    def setConfigRuleName(value: ConfigRuleName): Self = StObject.set(x, "ConfigRuleName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConfigRuleNameUndefined: Self = StObject.set(x, "ConfigRuleName", js.undefined)
  }
}
