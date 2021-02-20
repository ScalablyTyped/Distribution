package typings.awsSdk.ssmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NonCompliantSummary extends StObject {
  
  /**
    * The total number of compliance items that are not compliant.
    */
  var NonCompliantCount: js.UndefOr[ComplianceSummaryCount] = js.native
  
  /**
    * A summary of the non-compliance severity by compliance type
    */
  var SeveritySummary: js.UndefOr[typings.awsSdk.ssmMod.SeveritySummary] = js.native
}
object NonCompliantSummary {
  
  @scala.inline
  def apply(): NonCompliantSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NonCompliantSummary]
  }
  
  @scala.inline
  implicit class NonCompliantSummaryMutableBuilder[Self <: NonCompliantSummary] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNonCompliantCount(value: ComplianceSummaryCount): Self = StObject.set(x, "NonCompliantCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNonCompliantCountUndefined: Self = StObject.set(x, "NonCompliantCount", js.undefined)
    
    @scala.inline
    def setSeveritySummary(value: SeveritySummary): Self = StObject.set(x, "SeveritySummary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSeveritySummaryUndefined: Self = StObject.set(x, "SeveritySummary", js.undefined)
  }
}
