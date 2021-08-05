package typings.awsSdk.ssmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResourceComplianceSummaryItem extends StObject {
  
  /**
    * The compliance type.
    */
  var ComplianceType: js.UndefOr[ComplianceTypeName] = js.undefined
  
  /**
    * A list of items that are compliant for the resource.
    */
  var CompliantSummary: js.UndefOr[typings.awsSdk.ssmMod.CompliantSummary] = js.undefined
  
  /**
    * Information about the execution.
    */
  var ExecutionSummary: js.UndefOr[ComplianceExecutionSummary] = js.undefined
  
  /**
    * A list of items that aren't compliant for the resource.
    */
  var NonCompliantSummary: js.UndefOr[typings.awsSdk.ssmMod.NonCompliantSummary] = js.undefined
  
  /**
    * The highest severity item found for the resource. The resource is compliant for this item.
    */
  var OverallSeverity: js.UndefOr[ComplianceSeverity] = js.undefined
  
  /**
    * The resource ID.
    */
  var ResourceId: js.UndefOr[ComplianceResourceId] = js.undefined
  
  /**
    * The resource type.
    */
  var ResourceType: js.UndefOr[ComplianceResourceType] = js.undefined
  
  /**
    * The compliance status for the resource.
    */
  var Status: js.UndefOr[ComplianceStatus] = js.undefined
}
object ResourceComplianceSummaryItem {
  
  inline def apply(): ResourceComplianceSummaryItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResourceComplianceSummaryItem]
  }
  
  extension [Self <: ResourceComplianceSummaryItem](x: Self) {
    
    inline def setComplianceType(value: ComplianceTypeName): Self = StObject.set(x, "ComplianceType", value.asInstanceOf[js.Any])
    
    inline def setComplianceTypeUndefined: Self = StObject.set(x, "ComplianceType", js.undefined)
    
    inline def setCompliantSummary(value: CompliantSummary): Self = StObject.set(x, "CompliantSummary", value.asInstanceOf[js.Any])
    
    inline def setCompliantSummaryUndefined: Self = StObject.set(x, "CompliantSummary", js.undefined)
    
    inline def setExecutionSummary(value: ComplianceExecutionSummary): Self = StObject.set(x, "ExecutionSummary", value.asInstanceOf[js.Any])
    
    inline def setExecutionSummaryUndefined: Self = StObject.set(x, "ExecutionSummary", js.undefined)
    
    inline def setNonCompliantSummary(value: NonCompliantSummary): Self = StObject.set(x, "NonCompliantSummary", value.asInstanceOf[js.Any])
    
    inline def setNonCompliantSummaryUndefined: Self = StObject.set(x, "NonCompliantSummary", js.undefined)
    
    inline def setOverallSeverity(value: ComplianceSeverity): Self = StObject.set(x, "OverallSeverity", value.asInstanceOf[js.Any])
    
    inline def setOverallSeverityUndefined: Self = StObject.set(x, "OverallSeverity", js.undefined)
    
    inline def setResourceId(value: ComplianceResourceId): Self = StObject.set(x, "ResourceId", value.asInstanceOf[js.Any])
    
    inline def setResourceIdUndefined: Self = StObject.set(x, "ResourceId", js.undefined)
    
    inline def setResourceType(value: ComplianceResourceType): Self = StObject.set(x, "ResourceType", value.asInstanceOf[js.Any])
    
    inline def setResourceTypeUndefined: Self = StObject.set(x, "ResourceType", js.undefined)
    
    inline def setStatus(value: ComplianceStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
  }
}
