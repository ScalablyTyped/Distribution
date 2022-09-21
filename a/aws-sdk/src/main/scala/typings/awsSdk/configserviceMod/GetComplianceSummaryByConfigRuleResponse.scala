package typings.awsSdk.configserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetComplianceSummaryByConfigRuleResponse extends StObject {
  
  /**
    * The number of Config rules that are compliant and the number that are noncompliant, up to a maximum of 25 for each.
    */
  var ComplianceSummary: js.UndefOr[typings.awsSdk.configserviceMod.ComplianceSummary] = js.undefined
}
object GetComplianceSummaryByConfigRuleResponse {
  
  inline def apply(): GetComplianceSummaryByConfigRuleResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetComplianceSummaryByConfigRuleResponse]
  }
  
  extension [Self <: GetComplianceSummaryByConfigRuleResponse](x: Self) {
    
    inline def setComplianceSummary(value: ComplianceSummary): Self = StObject.set(x, "ComplianceSummary", value.asInstanceOf[js.Any])
    
    inline def setComplianceSummaryUndefined: Self = StObject.set(x, "ComplianceSummary", js.undefined)
  }
}
