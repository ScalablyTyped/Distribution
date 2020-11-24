package typings.awsSdk.supportMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TrustedAdvisorCostOptimizingSummary extends js.Object {
  
  /**
    * The estimated monthly savings that might be realized if the recommended operations are taken.
    */
  var estimatedMonthlySavings: Double = js.native
  
  /**
    * The estimated percentage of savings that might be realized if the recommended operations are taken.
    */
  var estimatedPercentMonthlySavings: Double = js.native
}
object TrustedAdvisorCostOptimizingSummary {
  
  @scala.inline
  def apply(estimatedMonthlySavings: Double, estimatedPercentMonthlySavings: Double): TrustedAdvisorCostOptimizingSummary = {
    val __obj = js.Dynamic.literal(estimatedMonthlySavings = estimatedMonthlySavings.asInstanceOf[js.Any], estimatedPercentMonthlySavings = estimatedPercentMonthlySavings.asInstanceOf[js.Any])
    __obj.asInstanceOf[TrustedAdvisorCostOptimizingSummary]
  }
  
  @scala.inline
  implicit class TrustedAdvisorCostOptimizingSummaryOps[Self <: TrustedAdvisorCostOptimizingSummary] (val x: Self) extends AnyVal {
    
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
    def setEstimatedMonthlySavings(value: Double): Self = this.set("estimatedMonthlySavings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEstimatedPercentMonthlySavings(value: Double): Self = this.set("estimatedPercentMonthlySavings", value.asInstanceOf[js.Any])
  }
}
