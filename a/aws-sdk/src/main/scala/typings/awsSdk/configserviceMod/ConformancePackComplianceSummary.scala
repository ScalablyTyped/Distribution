package typings.awsSdk.configserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConformancePackComplianceSummary extends StObject {
  
  /**
    * The status of the conformance pack. The allowed values are COMPLIANT and NON_COMPLIANT. 
    */
  var ConformancePackComplianceStatus: ConformancePackComplianceType
  
  /**
    * The name of the conformance pack name.
    */
  var ConformancePackName: typings.awsSdk.configserviceMod.ConformancePackName
}
object ConformancePackComplianceSummary {
  
  @scala.inline
  def apply(
    ConformancePackComplianceStatus: ConformancePackComplianceType,
    ConformancePackName: ConformancePackName
  ): ConformancePackComplianceSummary = {
    val __obj = js.Dynamic.literal(ConformancePackComplianceStatus = ConformancePackComplianceStatus.asInstanceOf[js.Any], ConformancePackName = ConformancePackName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConformancePackComplianceSummary]
  }
  
  @scala.inline
  implicit class ConformancePackComplianceSummaryMutableBuilder[Self <: ConformancePackComplianceSummary] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConformancePackComplianceStatus(value: ConformancePackComplianceType): Self = StObject.set(x, "ConformancePackComplianceStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConformancePackName(value: ConformancePackName): Self = StObject.set(x, "ConformancePackName", value.asInstanceOf[js.Any])
  }
}
