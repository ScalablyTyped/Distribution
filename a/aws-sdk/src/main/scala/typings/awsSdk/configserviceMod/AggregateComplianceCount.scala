package typings.awsSdk.configserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AggregateComplianceCount extends StObject {
  
  /**
    * The number of compliant and noncompliant AWS Config rules.
    */
  var ComplianceSummary: js.UndefOr[typings.awsSdk.configserviceMod.ComplianceSummary] = js.native
  
  /**
    * The 12-digit account ID or region based on the GroupByKey value.
    */
  var GroupName: js.UndefOr[StringWithCharLimit256] = js.native
}
object AggregateComplianceCount {
  
  @scala.inline
  def apply(): AggregateComplianceCount = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AggregateComplianceCount]
  }
  
  @scala.inline
  implicit class AggregateComplianceCountMutableBuilder[Self <: AggregateComplianceCount] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setComplianceSummary(value: ComplianceSummary): Self = StObject.set(x, "ComplianceSummary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComplianceSummaryUndefined: Self = StObject.set(x, "ComplianceSummary", js.undefined)
    
    @scala.inline
    def setGroupName(value: StringWithCharLimit256): Self = StObject.set(x, "GroupName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroupNameUndefined: Self = StObject.set(x, "GroupName", js.undefined)
  }
}
