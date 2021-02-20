package typings.awsSdk.computeoptimizerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RecommendedOptionProjectedMetric extends StObject {
  
  /**
    * An array of objects that describe a projected utilization metric.
    */
  var projectedMetrics: js.UndefOr[ProjectedMetrics] = js.native
  
  /**
    * The rank of the recommendation option projected metric. The top recommendation option is ranked as 1. The projected metric rank correlates to the recommendation option rank. For example, the projected metric ranked as 1 is related to the recommendation option that is also ranked as 1 in the same response.
    */
  var rank: js.UndefOr[Rank] = js.native
  
  /**
    * The recommended instance type.
    */
  var recommendedInstanceType: js.UndefOr[RecommendedInstanceType] = js.native
}
object RecommendedOptionProjectedMetric {
  
  @scala.inline
  def apply(): RecommendedOptionProjectedMetric = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RecommendedOptionProjectedMetric]
  }
  
  @scala.inline
  implicit class RecommendedOptionProjectedMetricMutableBuilder[Self <: RecommendedOptionProjectedMetric] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setProjectedMetrics(value: ProjectedMetrics): Self = StObject.set(x, "projectedMetrics", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProjectedMetricsUndefined: Self = StObject.set(x, "projectedMetrics", js.undefined)
    
    @scala.inline
    def setProjectedMetricsVarargs(value: ProjectedMetric*): Self = StObject.set(x, "projectedMetrics", js.Array(value :_*))
    
    @scala.inline
    def setRank(value: Rank): Self = StObject.set(x, "rank", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRankUndefined: Self = StObject.set(x, "rank", js.undefined)
    
    @scala.inline
    def setRecommendedInstanceType(value: RecommendedInstanceType): Self = StObject.set(x, "recommendedInstanceType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRecommendedInstanceTypeUndefined: Self = StObject.set(x, "recommendedInstanceType", js.undefined)
  }
}
