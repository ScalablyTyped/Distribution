package typings.awsSdk.ssmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ComplianceSummaryItem extends StObject {
  
  /**
    * The type of compliance item. For example, the compliance type can be Association, Patch, or Custom:string.
    */
  var ComplianceType: js.UndefOr[ComplianceTypeName] = js.native
  
  /**
    * A list of COMPLIANT items for the specified compliance type.
    */
  var CompliantSummary: js.UndefOr[typings.awsSdk.ssmMod.CompliantSummary] = js.native
  
  /**
    * A list of NON_COMPLIANT items for the specified compliance type.
    */
  var NonCompliantSummary: js.UndefOr[typings.awsSdk.ssmMod.NonCompliantSummary] = js.native
}
object ComplianceSummaryItem {
  
  @scala.inline
  def apply(): ComplianceSummaryItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ComplianceSummaryItem]
  }
  
  @scala.inline
  implicit class ComplianceSummaryItemMutableBuilder[Self <: ComplianceSummaryItem] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setComplianceType(value: ComplianceTypeName): Self = StObject.set(x, "ComplianceType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComplianceTypeUndefined: Self = StObject.set(x, "ComplianceType", js.undefined)
    
    @scala.inline
    def setCompliantSummary(value: CompliantSummary): Self = StObject.set(x, "CompliantSummary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCompliantSummaryUndefined: Self = StObject.set(x, "CompliantSummary", js.undefined)
    
    @scala.inline
    def setNonCompliantSummary(value: NonCompliantSummary): Self = StObject.set(x, "NonCompliantSummary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNonCompliantSummaryUndefined: Self = StObject.set(x, "NonCompliantSummary", js.undefined)
  }
}
