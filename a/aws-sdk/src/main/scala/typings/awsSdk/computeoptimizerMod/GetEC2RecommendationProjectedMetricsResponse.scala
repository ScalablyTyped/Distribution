package typings.awsSdk.computeoptimizerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetEC2RecommendationProjectedMetricsResponse extends StObject {
  
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
  implicit class GetEC2RecommendationProjectedMetricsResponseMutableBuilder[Self <: GetEC2RecommendationProjectedMetricsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRecommendedOptionProjectedMetrics(value: RecommendedOptionProjectedMetrics): Self = StObject.set(x, "recommendedOptionProjectedMetrics", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRecommendedOptionProjectedMetricsUndefined: Self = StObject.set(x, "recommendedOptionProjectedMetrics", js.undefined)
    
    @scala.inline
    def setRecommendedOptionProjectedMetricsVarargs(value: RecommendedOptionProjectedMetric*): Self = StObject.set(x, "recommendedOptionProjectedMetrics", js.Array(value :_*))
  }
}
