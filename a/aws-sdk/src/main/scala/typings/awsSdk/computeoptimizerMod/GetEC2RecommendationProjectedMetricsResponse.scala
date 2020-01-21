package typings.awsSdk.computeoptimizerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetEC2RecommendationProjectedMetricsResponse extends js.Object {
  /**
    * An array of objects that describe a projected metrics.
    */
  var recommendedOptionProjectedMetrics: js.UndefOr[RecommendedOptionProjectedMetrics] = js.native
}

object GetEC2RecommendationProjectedMetricsResponse {
  @scala.inline
  def apply(recommendedOptionProjectedMetrics: RecommendedOptionProjectedMetrics = null): GetEC2RecommendationProjectedMetricsResponse = {
    val __obj = js.Dynamic.literal()
    if (recommendedOptionProjectedMetrics != null) __obj.updateDynamic("recommendedOptionProjectedMetrics")(recommendedOptionProjectedMetrics.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetEC2RecommendationProjectedMetricsResponse]
  }
}

