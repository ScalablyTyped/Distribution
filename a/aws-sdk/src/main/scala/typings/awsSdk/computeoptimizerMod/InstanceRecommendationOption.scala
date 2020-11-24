package typings.awsSdk.computeoptimizerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InstanceRecommendationOption extends js.Object {
  
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
  implicit class InstanceRecommendationOptionOps[Self <: InstanceRecommendationOption] (val x: Self) extends AnyVal {
    
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
    def setInstanceType(value: InstanceType): Self = this.set("instanceType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInstanceType: Self = this.set("instanceType", js.undefined)
    
    @scala.inline
    def setPerformanceRisk(value: PerformanceRisk): Self = this.set("performanceRisk", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePerformanceRisk: Self = this.set("performanceRisk", js.undefined)
    
    @scala.inline
    def setProjectedUtilizationMetricsVarargs(value: UtilizationMetric*): Self = this.set("projectedUtilizationMetrics", js.Array(value :_*))
    
    @scala.inline
    def setProjectedUtilizationMetrics(value: ProjectedUtilizationMetrics): Self = this.set("projectedUtilizationMetrics", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProjectedUtilizationMetrics: Self = this.set("projectedUtilizationMetrics", js.undefined)
    
    @scala.inline
    def setRank(value: Rank): Self = this.set("rank", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRank: Self = this.set("rank", js.undefined)
  }
}
