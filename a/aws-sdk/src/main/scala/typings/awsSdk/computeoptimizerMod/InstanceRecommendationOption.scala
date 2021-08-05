package typings.awsSdk.computeoptimizerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InstanceRecommendationOption extends StObject {
  
  /**
    * The instance type of the instance recommendation.
    */
  var instanceType: js.UndefOr[InstanceType] = js.undefined
  
  /**
    * The performance risk of the instance recommendation option. Performance risk is the likelihood of the recommended instance type not meeting the performance requirement of your workload. The lowest performance risk is categorized as 0, and the highest as 5.
    */
  var performanceRisk: js.UndefOr[PerformanceRisk] = js.undefined
  
  /**
    * An array of objects that describe the projected utilization metrics of the instance recommendation option.  The Cpu and Memory metrics are the only projected utilization metrics returned. Additionally, the Memory metric is returned only for resources that have the unified CloudWatch agent installed on them. For more information, see Enabling Memory Utilization with the CloudWatch Agent. 
    */
  var projectedUtilizationMetrics: js.UndefOr[ProjectedUtilizationMetrics] = js.undefined
  
  /**
    * The rank of the instance recommendation option. The top recommendation option is ranked as 1.
    */
  var rank: js.UndefOr[Rank] = js.undefined
}
object InstanceRecommendationOption {
  
  inline def apply(): InstanceRecommendationOption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InstanceRecommendationOption]
  }
  
  extension [Self <: InstanceRecommendationOption](x: Self) {
    
    inline def setInstanceType(value: InstanceType): Self = StObject.set(x, "instanceType", value.asInstanceOf[js.Any])
    
    inline def setInstanceTypeUndefined: Self = StObject.set(x, "instanceType", js.undefined)
    
    inline def setPerformanceRisk(value: PerformanceRisk): Self = StObject.set(x, "performanceRisk", value.asInstanceOf[js.Any])
    
    inline def setPerformanceRiskUndefined: Self = StObject.set(x, "performanceRisk", js.undefined)
    
    inline def setProjectedUtilizationMetrics(value: ProjectedUtilizationMetrics): Self = StObject.set(x, "projectedUtilizationMetrics", value.asInstanceOf[js.Any])
    
    inline def setProjectedUtilizationMetricsUndefined: Self = StObject.set(x, "projectedUtilizationMetrics", js.undefined)
    
    inline def setProjectedUtilizationMetricsVarargs(value: UtilizationMetric*): Self = StObject.set(x, "projectedUtilizationMetrics", js.Array(value :_*))
    
    inline def setRank(value: Rank): Self = StObject.set(x, "rank", value.asInstanceOf[js.Any])
    
    inline def setRankUndefined: Self = StObject.set(x, "rank", js.undefined)
  }
}
