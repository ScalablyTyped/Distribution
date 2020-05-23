package typings.awsSdk.supportMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
}

