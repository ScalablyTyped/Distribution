package typings.awsSdk.configserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConformancePackRuleCompliance extends StObject {
  
  /**
    * Compliance of the AWS Config rule The allowed values are COMPLIANT and NON_COMPLIANT.
    */
  var ComplianceType: js.UndefOr[ConformancePackComplianceType] = js.undefined
  
  /**
    * Name of the config rule.
    */
  var ConfigRuleName: js.UndefOr[typings.awsSdk.configserviceMod.ConfigRuleName] = js.undefined
}
object ConformancePackRuleCompliance {
  
  @scala.inline
  def apply(): ConformancePackRuleCompliance = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConformancePackRuleCompliance]
  }
  
  @scala.inline
  implicit class ConformancePackRuleComplianceMutableBuilder[Self <: ConformancePackRuleCompliance] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setComplianceType(value: ConformancePackComplianceType): Self = StObject.set(x, "ComplianceType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComplianceTypeUndefined: Self = StObject.set(x, "ComplianceType", js.undefined)
    
    @scala.inline
    def setConfigRuleName(value: ConfigRuleName): Self = StObject.set(x, "ConfigRuleName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConfigRuleNameUndefined: Self = StObject.set(x, "ConfigRuleName", js.undefined)
  }
}
