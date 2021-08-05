package typings.awsSdk.configserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetComplianceSummaryByResourceTypeResponse extends StObject {
  
  /**
    * The number of resources that are compliant and the number that are noncompliant. If one or more resource types were provided with the request, the numbers are returned for each resource type. The maximum number returned is 100.
    */
  var ComplianceSummariesByResourceType: js.UndefOr[typings.awsSdk.configserviceMod.ComplianceSummariesByResourceType] = js.undefined
}
object GetComplianceSummaryByResourceTypeResponse {
  
  inline def apply(): GetComplianceSummaryByResourceTypeResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetComplianceSummaryByResourceTypeResponse]
  }
  
  extension [Self <: GetComplianceSummaryByResourceTypeResponse](x: Self) {
    
    inline def setComplianceSummariesByResourceType(value: ComplianceSummariesByResourceType): Self = StObject.set(x, "ComplianceSummariesByResourceType", value.asInstanceOf[js.Any])
    
    inline def setComplianceSummariesByResourceTypeUndefined: Self = StObject.set(x, "ComplianceSummariesByResourceType", js.undefined)
    
    inline def setComplianceSummariesByResourceTypeVarargs(value: ComplianceSummaryByResourceType*): Self = StObject.set(x, "ComplianceSummariesByResourceType", js.Array(value :_*))
  }
}
