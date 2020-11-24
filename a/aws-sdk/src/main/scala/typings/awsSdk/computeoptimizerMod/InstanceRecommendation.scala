package typings.awsSdk.computeoptimizerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InstanceRecommendation extends js.Object {
  
  /**
    * The AWS account ID of the instance.
    */
  var accountId: js.UndefOr[AccountId] = js.native
  
  /**
    * The instance type of the current instance.
    */
  var currentInstanceType: js.UndefOr[CurrentInstanceType] = js.native
  
  /**
    * The finding classification for the instance. Findings for instances include:     Underprovisioned —An instance is considered under-provisioned when at least one specification of your instance, such as CPU, memory, or network, does not meet the performance requirements of your workload. Under-provisioned instances may lead to poor application performance.     Overprovisioned —An instance is considered over-provisioned when at least one specification of your instance, such as CPU, memory, or network, can be sized down while still meeting the performance requirements of your workload, and no specification is under-provisioned. Over-provisioned instances may lead to unnecessary infrastructure cost.     Optimized —An instance is considered optimized when all specifications of your instance, such as CPU, memory, and network, meet the performance requirements of your workload and is not over provisioned. An optimized instance runs your workloads with optimal performance and infrastructure cost. For optimized resources, AWS Compute Optimizer might recommend a new generation instance type.    The values that are returned might be UNDER_PROVISIONED, OVER_PROVISIONED, or OPTIMIZED. 
    */
  var finding: js.UndefOr[Finding] = js.native
  
  /**
    * The Amazon Resource Name (ARN) of the current instance.
    */
  var instanceArn: js.UndefOr[InstanceArn] = js.native
  
  /**
    * The name of the current instance.
    */
  var instanceName: js.UndefOr[InstanceName] = js.native
  
  /**
    * The time stamp of when the instance recommendation was last refreshed.
    */
  var lastRefreshTimestamp: js.UndefOr[LastRefreshTimestamp] = js.native
  
  /**
    * The number of days for which utilization metrics were analyzed for the instance.
    */
  var lookBackPeriodInDays: js.UndefOr[LookBackPeriodInDays] = js.native
  
  /**
    * An array of objects that describe the recommendation options for the instance.
    */
  var recommendationOptions: js.UndefOr[RecommendationOptions] = js.native
  
  /**
    * An array of objects that describe the source resource of the recommendation.
    */
  var recommendationSources: js.UndefOr[RecommendationSources] = js.native
  
  /**
    * An array of objects that describe the utilization metrics of the instance.
    */
  var utilizationMetrics: js.UndefOr[UtilizationMetrics] = js.native
}
object InstanceRecommendation {
  
  @scala.inline
  def apply(): InstanceRecommendation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InstanceRecommendation]
  }
  
  @scala.inline
  implicit class InstanceRecommendationOps[Self <: InstanceRecommendation] (val x: Self) extends AnyVal {
    
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
    def setAccountId(value: AccountId): Self = this.set("accountId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAccountId: Self = this.set("accountId", js.undefined)
    
    @scala.inline
    def setCurrentInstanceType(value: CurrentInstanceType): Self = this.set("currentInstanceType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCurrentInstanceType: Self = this.set("currentInstanceType", js.undefined)
    
    @scala.inline
    def setFinding(value: Finding): Self = this.set("finding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFinding: Self = this.set("finding", js.undefined)
    
    @scala.inline
    def setInstanceArn(value: InstanceArn): Self = this.set("instanceArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInstanceArn: Self = this.set("instanceArn", js.undefined)
    
    @scala.inline
    def setInstanceName(value: InstanceName): Self = this.set("instanceName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInstanceName: Self = this.set("instanceName", js.undefined)
    
    @scala.inline
    def setLastRefreshTimestamp(value: LastRefreshTimestamp): Self = this.set("lastRefreshTimestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLastRefreshTimestamp: Self = this.set("lastRefreshTimestamp", js.undefined)
    
    @scala.inline
    def setLookBackPeriodInDays(value: LookBackPeriodInDays): Self = this.set("lookBackPeriodInDays", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLookBackPeriodInDays: Self = this.set("lookBackPeriodInDays", js.undefined)
    
    @scala.inline
    def setRecommendationOptionsVarargs(value: InstanceRecommendationOption*): Self = this.set("recommendationOptions", js.Array(value :_*))
    
    @scala.inline
    def setRecommendationOptions(value: RecommendationOptions): Self = this.set("recommendationOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRecommendationOptions: Self = this.set("recommendationOptions", js.undefined)
    
    @scala.inline
    def setRecommendationSourcesVarargs(value: RecommendationSource*): Self = this.set("recommendationSources", js.Array(value :_*))
    
    @scala.inline
    def setRecommendationSources(value: RecommendationSources): Self = this.set("recommendationSources", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRecommendationSources: Self = this.set("recommendationSources", js.undefined)
    
    @scala.inline
    def setUtilizationMetricsVarargs(value: UtilizationMetric*): Self = this.set("utilizationMetrics", js.Array(value :_*))
    
    @scala.inline
    def setUtilizationMetrics(value: UtilizationMetrics): Self = this.set("utilizationMetrics", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUtilizationMetrics: Self = this.set("utilizationMetrics", js.undefined)
  }
}
