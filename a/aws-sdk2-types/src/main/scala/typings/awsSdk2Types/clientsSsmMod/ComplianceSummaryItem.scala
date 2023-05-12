package typings.awsSdk2Types.clientsSsmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ComplianceSummaryItem extends StObject {
  
  /**
    * The type of compliance item. For example, the compliance type can be Association, Patch, or Custom:string.
    */
  var ComplianceType: js.UndefOr[ComplianceTypeName] = js.undefined
  
  /**
    * A list of COMPLIANT items for the specified compliance type.
    */
  var CompliantSummary: js.UndefOr[typings.awsSdk2Types.clientsSsmMod.CompliantSummary] = js.undefined
  
  /**
    * A list of NON_COMPLIANT items for the specified compliance type.
    */
  var NonCompliantSummary: js.UndefOr[typings.awsSdk2Types.clientsSsmMod.NonCompliantSummary] = js.undefined
}
object ComplianceSummaryItem {
  
  inline def apply(): ComplianceSummaryItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ComplianceSummaryItem]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ComplianceSummaryItem] (val x: Self) extends AnyVal {
    
    inline def setComplianceType(value: ComplianceTypeName): Self = StObject.set(x, "ComplianceType", value.asInstanceOf[js.Any])
    
    inline def setComplianceTypeUndefined: Self = StObject.set(x, "ComplianceType", js.undefined)
    
    inline def setCompliantSummary(value: CompliantSummary): Self = StObject.set(x, "CompliantSummary", value.asInstanceOf[js.Any])
    
    inline def setCompliantSummaryUndefined: Self = StObject.set(x, "CompliantSummary", js.undefined)
    
    inline def setNonCompliantSummary(value: NonCompliantSummary): Self = StObject.set(x, "NonCompliantSummary", value.asInstanceOf[js.Any])
    
    inline def setNonCompliantSummaryUndefined: Self = StObject.set(x, "NonCompliantSummary", js.undefined)
  }
}
