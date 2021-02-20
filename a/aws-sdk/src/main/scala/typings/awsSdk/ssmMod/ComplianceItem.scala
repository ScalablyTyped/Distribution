package typings.awsSdk.ssmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ComplianceItem extends StObject {
  
  /**
    * The compliance type. For example, Association (for a State Manager association), Patch, or Custom:string are all valid compliance types.
    */
  var ComplianceType: js.UndefOr[ComplianceTypeName] = js.native
  
  /**
    * A "Key": "Value" tag combination for the compliance item.
    */
  var Details: js.UndefOr[ComplianceItemDetails] = js.native
  
  /**
    * A summary for the compliance item. The summary includes an execution ID, the execution type (for example, command), and the execution time.
    */
  var ExecutionSummary: js.UndefOr[ComplianceExecutionSummary] = js.native
  
  /**
    * An ID for the compliance item. For example, if the compliance item is a Windows patch, the ID could be the number of the KB article; for example: KB4010320.
    */
  var Id: js.UndefOr[ComplianceItemId] = js.native
  
  /**
    * An ID for the resource. For a managed instance, this is the instance ID.
    */
  var ResourceId: js.UndefOr[ComplianceResourceId] = js.native
  
  /**
    * The type of resource. ManagedInstance is currently the only supported resource type.
    */
  var ResourceType: js.UndefOr[ComplianceResourceType] = js.native
  
  /**
    * The severity of the compliance status. Severity can be one of the following: Critical, High, Medium, Low, Informational, Unspecified.
    */
  var Severity: js.UndefOr[ComplianceSeverity] = js.native
  
  /**
    * The status of the compliance item. An item is either COMPLIANT, NON_COMPLIANT, or an empty string (for Windows patches that aren't applicable).
    */
  var Status: js.UndefOr[ComplianceStatus] = js.native
  
  /**
    * A title for the compliance item. For example, if the compliance item is a Windows patch, the title could be the title of the KB article for the patch; for example: Security Update for Active Directory Federation Services.
    */
  var Title: js.UndefOr[ComplianceItemTitle] = js.native
}
object ComplianceItem {
  
  @scala.inline
  def apply(): ComplianceItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ComplianceItem]
  }
  
  @scala.inline
  implicit class ComplianceItemMutableBuilder[Self <: ComplianceItem] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setComplianceType(value: ComplianceTypeName): Self = StObject.set(x, "ComplianceType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComplianceTypeUndefined: Self = StObject.set(x, "ComplianceType", js.undefined)
    
    @scala.inline
    def setDetails(value: ComplianceItemDetails): Self = StObject.set(x, "Details", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDetailsUndefined: Self = StObject.set(x, "Details", js.undefined)
    
    @scala.inline
    def setExecutionSummary(value: ComplianceExecutionSummary): Self = StObject.set(x, "ExecutionSummary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExecutionSummaryUndefined: Self = StObject.set(x, "ExecutionSummary", js.undefined)
    
    @scala.inline
    def setId(value: ComplianceItemId): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "Id", js.undefined)
    
    @scala.inline
    def setResourceId(value: ComplianceResourceId): Self = StObject.set(x, "ResourceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceIdUndefined: Self = StObject.set(x, "ResourceId", js.undefined)
    
    @scala.inline
    def setResourceType(value: ComplianceResourceType): Self = StObject.set(x, "ResourceType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceTypeUndefined: Self = StObject.set(x, "ResourceType", js.undefined)
    
    @scala.inline
    def setSeverity(value: ComplianceSeverity): Self = StObject.set(x, "Severity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSeverityUndefined: Self = StObject.set(x, "Severity", js.undefined)
    
    @scala.inline
    def setStatus(value: ComplianceStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
    
    @scala.inline
    def setTitle(value: ComplianceItemTitle): Self = StObject.set(x, "Title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleUndefined: Self = StObject.set(x, "Title", js.undefined)
  }
}
