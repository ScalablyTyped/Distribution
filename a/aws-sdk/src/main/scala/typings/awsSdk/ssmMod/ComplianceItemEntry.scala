package typings.awsSdk.ssmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ComplianceItemEntry extends js.Object {
  
  /**
    * A "Key": "Value" tag combination for the compliance item.
    */
  var Details: js.UndefOr[ComplianceItemDetails] = js.native
  
  /**
    * The compliance item ID. For example, if the compliance item is a Windows patch, the ID could be the number of the KB article.
    */
  var Id: js.UndefOr[ComplianceItemId] = js.native
  
  /**
    * The severity of the compliance status. Severity can be one of the following: Critical, High, Medium, Low, Informational, Unspecified.
    */
  var Severity: ComplianceSeverity = js.native
  
  /**
    * The status of the compliance item. An item is either COMPLIANT or NON_COMPLIANT.
    */
  var Status: ComplianceStatus = js.native
  
  /**
    * The title of the compliance item. For example, if the compliance item is a Windows patch, the title could be the title of the KB article for the patch; for example: Security Update for Active Directory Federation Services. 
    */
  var Title: js.UndefOr[ComplianceItemTitle] = js.native
}
object ComplianceItemEntry {
  
  @scala.inline
  def apply(Severity: ComplianceSeverity, Status: ComplianceStatus): ComplianceItemEntry = {
    val __obj = js.Dynamic.literal(Severity = Severity.asInstanceOf[js.Any], Status = Status.asInstanceOf[js.Any])
    __obj.asInstanceOf[ComplianceItemEntry]
  }
  
  @scala.inline
  implicit class ComplianceItemEntryOps[Self <: ComplianceItemEntry] (val x: Self) extends AnyVal {
    
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
    def setSeverity(value: ComplianceSeverity): Self = this.set("Severity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatus(value: ComplianceStatus): Self = this.set("Status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDetails(value: ComplianceItemDetails): Self = this.set("Details", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDetails: Self = this.set("Details", js.undefined)
    
    @scala.inline
    def setId(value: ComplianceItemId): Self = this.set("Id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteId: Self = this.set("Id", js.undefined)
    
    @scala.inline
    def setTitle(value: ComplianceItemTitle): Self = this.set("Title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTitle: Self = this.set("Title", js.undefined)
  }
}
