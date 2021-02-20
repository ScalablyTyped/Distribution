package typings.awsSdk.computeoptimizerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InstanceRecommendationOption extends StObject {
  
  /**
    * The instance type of the instance recommendation.
    */
  var instanceType: js.UndefOr[InstanceType] = js.native
  
  /**
    * The performance risk of the instance recommendation option. Performance risk is the likelihood of the recommended instance type not meeting the performance requirement of your workload. The lowest performance risk is categorized as 0, and the highest as 5.
    */
  var performanceRisk: js.UndefOr[PerformanceRisk] = js.native
  
  /**
    * An array of objects that describe the projected utilization metrics of the instance recommendation option.  The Cpu and Memory metrics are the only projected utilization metrics returned. Additionally, the Memory metric is returned only for resources that have the unified CloudWatch agent installed on them. For more information, see Enabling Memory Utilization with the CloudWatch Agent. 
    */
  var projectedUtilizationMetrics: js.UndefOr[ProjectedUtilizationMetrics] = js.native
  
  /**
    * The rank of the instance recommendation option. The top recommendation option is ranked as 1.
    */
  var rank: js.UndefOr[Rank] = js.native
}
object InstanceRecommendationOption {
  
  @scala.inline
  def apply(): InstanceRecommendationOption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InstanceRecommendationOption]
  }
  
  @scala.inline
  implicit class InstanceRecommendationOptionMutableBuilder[Self <: InstanceRecommendationOption] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInstanceType(value: InstanceType): Self = StObject.set(x, "instanceType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstanceTypeUndefined: Self = StObject.set(x, "instanceType", js.undefined)
    
    @scala.inline
    def setPerformanceRisk(value: PerformanceRisk): Self = StObject.set(x, "performanceRisk", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPerformanceRiskUndefined: Self = StObject.set(x, "performanceRisk", js.undefined)
    
    @scala.inline
    def setProjectedUtilizationMetrics(value: ProjectedUtilizationMetrics): Self = StObject.set(x, "projectedUtilizationMetrics", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProjectedUtilizationMetricsUndefined: Self = StObject.set(x, "projectedUtilizationMetrics", js.undefined)
    
    @scala.inline
    def setProjectedUtilizationMetricsVarargs(value: UtilizationMetric*): Self = StObject.set(x, "projectedUtilizationMetrics", js.Array(value :_*))
    
    @scala.inline
    def setRank(value: Rank): Self = StObject.set(x, "rank", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRankUndefined: Self = StObject.set(x, "rank", js.undefined)
  }
}
