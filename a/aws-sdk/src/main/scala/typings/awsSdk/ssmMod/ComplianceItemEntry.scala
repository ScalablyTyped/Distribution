package typings.awsSdk.ssmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ComplianceItemEntry extends StObject {
  
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
  implicit class ComplianceItemEntryMutableBuilder[Self <: ComplianceItemEntry] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDetails(value: ComplianceItemDetails): Self = StObject.set(x, "Details", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDetailsUndefined: Self = StObject.set(x, "Details", js.undefined)
    
    @scala.inline
    def setId(value: ComplianceItemId): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "Id", js.undefined)
    
    @scala.inline
    def setSeverity(value: ComplianceSeverity): Self = StObject.set(x, "Severity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatus(value: ComplianceStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitle(value: ComplianceItemTitle): Self = StObject.set(x, "Title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleUndefined: Self = StObject.set(x, "Title", js.undefined)
  }
}
