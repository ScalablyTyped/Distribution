package typings.awsSdk.ssmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ResourceComplianceSummaryItem extends StObject {
  
  /**
    * The compliance type.
    */
  var ComplianceType: js.UndefOr[ComplianceTypeName] = js.native
  
  /**
    * A list of items that are compliant for the resource.
    */
  var CompliantSummary: js.UndefOr[typings.awsSdk.ssmMod.CompliantSummary] = js.native
  
  /**
    * Information about the execution.
    */
  var ExecutionSummary: js.UndefOr[ComplianceExecutionSummary] = js.native
  
  /**
    * A list of items that aren't compliant for the resource.
    */
  var NonCompliantSummary: js.UndefOr[typings.awsSdk.ssmMod.NonCompliantSummary] = js.native
  
  /**
    * The highest severity item found for the resource. The resource is compliant for this item.
    */
  var OverallSeverity: js.UndefOr[ComplianceSeverity] = js.native
  
  /**
    * The resource ID.
    */
  var ResourceId: js.UndefOr[ComplianceResourceId] = js.native
  
  /**
    * The resource type.
    */
  var ResourceType: js.UndefOr[ComplianceResourceType] = js.native
  
  /**
    * The compliance status for the resource.
    */
  var Status: js.UndefOr[ComplianceStatus] = js.native
}
object ResourceComplianceSummaryItem {
  
  @scala.inline
  def apply(): ResourceComplianceSummaryItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResourceComplianceSummaryItem]
  }
  
  @scala.inline
  implicit class ResourceComplianceSummaryItemMutableBuilder[Self <: ResourceComplianceSummaryItem] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setComplianceType(value: ComplianceTypeName): Self = StObject.set(x, "ComplianceType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComplianceTypeUndefined: Self = StObject.set(x, "ComplianceType", js.undefined)
    
    @scala.inline
    def setCompliantSummary(value: CompliantSummary): Self = StObject.set(x, "CompliantSummary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCompliantSummaryUndefined: Self = StObject.set(x, "CompliantSummary", js.undefined)
    
    @scala.inline
    def setExecutionSummary(value: ComplianceExecutionSummary): Self = StObject.set(x, "ExecutionSummary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExecutionSummaryUndefined: Self = StObject.set(x, "ExecutionSummary", js.undefined)
    
    @scala.inline
    def setNonCompliantSummary(value: NonCompliantSummary): Self = StObject.set(x, "NonCompliantSummary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNonCompliantSummaryUndefined: Self = StObject.set(x, "NonCompliantSummary", js.undefined)
    
    @scala.inline
    def setOverallSeverity(value: ComplianceSeverity): Self = StObject.set(x, "OverallSeverity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOverallSeverityUndefined: Self = StObject.set(x, "OverallSeverity", js.undefined)
    
    @scala.inline
    def setResourceId(value: ComplianceResourceId): Self = StObject.set(x, "ResourceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceIdUndefined: Self = StObject.set(x, "ResourceId", js.undefined)
    
    @scala.inline
    def setResourceType(value: ComplianceResourceType): Self = StObject.set(x, "ResourceType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceTypeUndefined: Self = StObject.set(x, "ResourceType", js.undefined)
    
    @scala.inline
    def setStatus(value: ComplianceStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
  }
}
