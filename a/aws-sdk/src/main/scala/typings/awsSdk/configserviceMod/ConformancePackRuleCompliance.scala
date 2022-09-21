package typings.awsSdk.configserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConformancePackRuleCompliance extends StObject {
  
  /**
    * Compliance of the Config rule. The allowed values are COMPLIANT, NON_COMPLIANT, and INSUFFICIENT_DATA.
    */
  var ComplianceType: js.UndefOr[ConformancePackComplianceType] = js.undefined
  
  /**
    * Name of the Config rule.
    */
  var ConfigRuleName: js.UndefOr[typings.awsSdk.configserviceMod.ConfigRuleName] = js.undefined
  
  /**
    * Controls for the conformance pack. A control is a process to prevent or detect problems while meeting objectives. A control can align with a specific compliance regime or map to internal controls defined by an organization.
    */
  var Controls: js.UndefOr[ControlsList] = js.undefined
}
object ConformancePackRuleCompliance {
  
  inline def apply(): ConformancePackRuleCompliance = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConformancePackRuleCompliance]
  }
  
  extension [Self <: ConformancePackRuleCompliance](x: Self) {
    
    inline def setComplianceType(value: ConformancePackComplianceType): Self = StObject.set(x, "ComplianceType", value.asInstanceOf[js.Any])
    
    inline def setComplianceTypeUndefined: Self = StObject.set(x, "ComplianceType", js.undefined)
    
    inline def setConfigRuleName(value: ConfigRuleName): Self = StObject.set(x, "ConfigRuleName", value.asInstanceOf[js.Any])
    
    inline def setConfigRuleNameUndefined: Self = StObject.set(x, "ConfigRuleName", js.undefined)
    
    inline def setControls(value: ControlsList): Self = StObject.set(x, "Controls", value.asInstanceOf[js.Any])
    
    inline def setControlsUndefined: Self = StObject.set(x, "Controls", js.undefined)
    
    inline def setControlsVarargs(value: StringWithCharLimit128*): Self = StObject.set(x, "Controls", js.Array(value*))
  }
}
