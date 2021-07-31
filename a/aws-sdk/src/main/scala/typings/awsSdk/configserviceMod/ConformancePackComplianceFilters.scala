package typings.awsSdk.configserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConformancePackComplianceFilters extends StObject {
  
  /**
    * Filters the results by compliance. The allowed values are COMPLIANT and NON_COMPLIANT.
    */
  var ComplianceType: js.UndefOr[ConformancePackComplianceType] = js.undefined
  
  /**
    * Filters the results by AWS Config rule names.
    */
  var ConfigRuleNames: js.UndefOr[ConformancePackConfigRuleNames] = js.undefined
}
object ConformancePackComplianceFilters {
  
  @scala.inline
  def apply(): ConformancePackComplianceFilters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConformancePackComplianceFilters]
  }
  
  @scala.inline
  implicit class ConformancePackComplianceFiltersMutableBuilder[Self <: ConformancePackComplianceFilters] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setComplianceType(value: ConformancePackComplianceType): Self = StObject.set(x, "ComplianceType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComplianceTypeUndefined: Self = StObject.set(x, "ComplianceType", js.undefined)
    
    @scala.inline
    def setConfigRuleNames(value: ConformancePackConfigRuleNames): Self = StObject.set(x, "ConfigRuleNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConfigRuleNamesUndefined: Self = StObject.set(x, "ConfigRuleNames", js.undefined)
    
    @scala.inline
    def setConfigRuleNamesVarargs(value: StringWithCharLimit64*): Self = StObject.set(x, "ConfigRuleNames", js.Array(value :_*))
  }
}
