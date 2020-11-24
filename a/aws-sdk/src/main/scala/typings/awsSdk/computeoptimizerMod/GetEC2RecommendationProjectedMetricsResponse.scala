package typings.awsSdk.computeoptimizerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetEC2RecommendationProjectedMetricsResponse extends js.Object {
  
  /**
    * An array of objects that describe a projected metrics.
    */
  var recommendedOptionProjectedMetrics: js.UndefOr[RecommendedOptionProjectedMetrics] = js.native
}
object GetEC2RecommendationProjectedMetricsResponse {
  
  @scala.inline
  def apply(): GetEC2RecommendationProjectedMetricsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetEC2RecommendationProjectedMetricsResponse]
  }
  
  @scala.inline
  implicit class GetEC2RecommendationProjectedMetricsResponseOps[Self <: GetEC2RecommendationProjectedMetricsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setRecommendedOptionProjectedMetricsVarargs(value: RecommendedOptionProjectedMetric*): Self = this.set("recommendedOptionProjectedMetrics", js.Array(value :_*))
    
    @scala.inline
    def setRecommendedOptionProjectedMetrics(value: RecommendedOptionProjectedMetrics): Self = this.set("recommendedOptionProjectedMetrics", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRecommendedOptionProjectedMetrics: Self = this.set("recommendedOptionProjectedMetrics", js.undefined)
  }
}
