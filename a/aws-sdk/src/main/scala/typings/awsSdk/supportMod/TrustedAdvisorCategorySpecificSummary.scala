package typings.awsSdk.supportMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TrustedAdvisorCategorySpecificSummary extends StObject {
  
  /**
    * The summary information about cost savings for a Trusted Advisor check that is in the Cost Optimizing category.
    */
  var costOptimizing: js.UndefOr[TrustedAdvisorCostOptimizingSummary] = js.undefined
}
object TrustedAdvisorCategorySpecificSummary {
  
  @scala.inline
  def apply(): TrustedAdvisorCategorySpecificSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TrustedAdvisorCategorySpecificSummary]
  }
  
  @scala.inline
  implicit class TrustedAdvisorCategorySpecificSummaryMutableBuilder[Self <: TrustedAdvisorCategorySpecificSummary] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCostOptimizing(value: TrustedAdvisorCostOptimizingSummary): Self = StObject.set(x, "costOptimizing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCostOptimizingUndefined: Self = StObject.set(x, "costOptimizing", js.undefined)
  }
}
