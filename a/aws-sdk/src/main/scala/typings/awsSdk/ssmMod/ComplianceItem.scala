package typings.awsSdk.ssmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ComplianceItem extends js.Object {
  
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
  implicit class ComplianceItemOps[Self <: ComplianceItem] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setComplianceType(value: ComplianceTypeName): Self = this.set("ComplianceType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteComplianceType: Self = this.set("ComplianceType", js.undefined)
    
    @scala.inline
    def setDetails(value: ComplianceItemDetails): Self = this.set("Details", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDetails: Self = this.set("Details", js.undefined)
    
    @scala.inline
    def setExecutionSummary(value: ComplianceExecutionSummary): Self = this.set("ExecutionSummary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExecutionSummary: Self = this.set("ExecutionSummary", js.undefined)
    
    @scala.inline
    def setId(value: ComplianceItemId): Self = this.set("Id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteId: Self = this.set("Id", js.undefined)
    
    @scala.inline
    def setResourceId(value: ComplianceResourceId): Self = this.set("ResourceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResourceId: Self = this.set("ResourceId", js.undefined)
    
    @scala.inline
    def setResourceType(value: ComplianceResourceType): Self = this.set("ResourceType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResourceType: Self = this.set("ResourceType", js.undefined)
    
    @scala.inline
    def setSeverity(value: ComplianceSeverity): Self = this.set("Severity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSeverity: Self = this.set("Severity", js.undefined)
    
    @scala.inline
    def setStatus(value: ComplianceStatus): Self = this.set("Status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatus: Self = this.set("Status", js.undefined)
    
    @scala.inline
    def setTitle(value: ComplianceItemTitle): Self = this.set("Title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTitle: Self = this.set("Title", js.undefined)
  }
}
