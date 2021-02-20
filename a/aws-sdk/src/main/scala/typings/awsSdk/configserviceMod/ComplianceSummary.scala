package typings.awsSdk.configserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ComplianceSummary extends StObject {
  
  /**
    * The time that AWS Config created the compliance summary.
    */
  var ComplianceSummaryTimestamp: js.UndefOr[Date] = js.native
  
  /**
    * The number of AWS Config rules or AWS resources that are compliant, up to a maximum of 25 for rules and 100 for resources.
    */
  var CompliantResourceCount: js.UndefOr[ComplianceContributorCount] = js.native
  
  /**
    * The number of AWS Config rules or AWS resources that are noncompliant, up to a maximum of 25 for rules and 100 for resources.
    */
  var NonCompliantResourceCount: js.UndefOr[ComplianceContributorCount] = js.native
}
object ComplianceSummary {
  
  @scala.inline
  def apply(): ComplianceSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ComplianceSummary]
  }
  
  @scala.inline
  implicit class ComplianceSummaryMutableBuilder[Self <: ComplianceSummary] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setComplianceSummaryTimestamp(value: Date): Self = StObject.set(x, "ComplianceSummaryTimestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComplianceSummaryTimestampUndefined: Self = StObject.set(x, "ComplianceSummaryTimestamp", js.undefined)
    
    @scala.inline
    def setCompliantResourceCount(value: ComplianceContributorCount): Self = StObject.set(x, "CompliantResourceCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCompliantResourceCountUndefined: Self = StObject.set(x, "CompliantResourceCount", js.undefined)
    
    @scala.inline
    def setNonCompliantResourceCount(value: ComplianceContributorCount): Self = StObject.set(x, "NonCompliantResourceCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNonCompliantResourceCountUndefined: Self = StObject.set(x, "NonCompliantResourceCount", js.undefined)
  }
}
