package typings.awsSdk.computeoptimizerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InstanceRecommendation extends StObject {
  
  /**
    * The AWS account ID of the instance.
    */
  var accountId: js.UndefOr[AccountId] = js.undefined
  
  /**
    * The instance type of the current instance.
    */
  var currentInstanceType: js.UndefOr[CurrentInstanceType] = js.undefined
  
  /**
    * The finding classification for the instance. Findings for instances include:     Underprovisioned —An instance is considered under-provisioned when at least one specification of your instance, such as CPU, memory, or network, does not meet the performance requirements of your workload. Under-provisioned instances may lead to poor application performance.     Overprovisioned —An instance is considered over-provisioned when at least one specification of your instance, such as CPU, memory, or network, can be sized down while still meeting the performance requirements of your workload, and no specification is under-provisioned. Over-provisioned instances may lead to unnecessary infrastructure cost.     Optimized —An instance is considered optimized when all specifications of your instance, such as CPU, memory, and network, meet the performance requirements of your workload and is not over provisioned. An optimized instance runs your workloads with optimal performance and infrastructure cost. For optimized resources, AWS Compute Optimizer might recommend a new generation instance type.    The values that are returned might be UNDER_PROVISIONED, OVER_PROVISIONED, or OPTIMIZED. 
    */
  var finding: js.UndefOr[Finding] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the current instance.
    */
  var instanceArn: js.UndefOr[InstanceArn] = js.undefined
  
  /**
    * The name of the current instance.
    */
  var instanceName: js.UndefOr[InstanceName] = js.undefined
  
  /**
    * The time stamp of when the instance recommendation was last refreshed.
    */
  var lastRefreshTimestamp: js.UndefOr[LastRefreshTimestamp] = js.undefined
  
  /**
    * The number of days for which utilization metrics were analyzed for the instance.
    */
  var lookBackPeriodInDays: js.UndefOr[LookBackPeriodInDays] = js.undefined
  
  /**
    * An array of objects that describe the recommendation options for the instance.
    */
  var recommendationOptions: js.UndefOr[RecommendationOptions] = js.undefined
  
  /**
    * An array of objects that describe the source resource of the recommendation.
    */
  var recommendationSources: js.UndefOr[RecommendationSources] = js.undefined
  
  /**
    * An array of objects that describe the utilization metrics of the instance.
    */
  var utilizationMetrics: js.UndefOr[UtilizationMetrics] = js.undefined
}
object InstanceRecommendation {
  
  inline def apply(): InstanceRecommendation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InstanceRecommendation]
  }
  
  extension [Self <: InstanceRecommendation](x: Self) {
    
    inline def setAccountId(value: AccountId): Self = StObject.set(x, "accountId", value.asInstanceOf[js.Any])
    
    inline def setAccountIdUndefined: Self = StObject.set(x, "accountId", js.undefined)
    
    inline def setCurrentInstanceType(value: CurrentInstanceType): Self = StObject.set(x, "currentInstanceType", value.asInstanceOf[js.Any])
    
    inline def setCurrentInstanceTypeUndefined: Self = StObject.set(x, "currentInstanceType", js.undefined)
    
    inline def setFinding(value: Finding): Self = StObject.set(x, "finding", value.asInstanceOf[js.Any])
    
    inline def setFindingUndefined: Self = StObject.set(x, "finding", js.undefined)
    
    inline def setInstanceArn(value: InstanceArn): Self = StObject.set(x, "instanceArn", value.asInstanceOf[js.Any])
    
    inline def setInstanceArnUndefined: Self = StObject.set(x, "instanceArn", js.undefined)
    
    inline def setInstanceName(value: InstanceName): Self = StObject.set(x, "instanceName", value.asInstanceOf[js.Any])
    
    inline def setInstanceNameUndefined: Self = StObject.set(x, "instanceName", js.undefined)
    
    inline def setLastRefreshTimestamp(value: LastRefreshTimestamp): Self = StObject.set(x, "lastRefreshTimestamp", value.asInstanceOf[js.Any])
    
    inline def setLastRefreshTimestampUndefined: Self = StObject.set(x, "lastRefreshTimestamp", js.undefined)
    
    inline def setLookBackPeriodInDays(value: LookBackPeriodInDays): Self = StObject.set(x, "lookBackPeriodInDays", value.asInstanceOf[js.Any])
    
    inline def setLookBackPeriodInDaysUndefined: Self = StObject.set(x, "lookBackPeriodInDays", js.undefined)
    
    inline def setRecommendationOptions(value: RecommendationOptions): Self = StObject.set(x, "recommendationOptions", value.asInstanceOf[js.Any])
    
    inline def setRecommendationOptionsUndefined: Self = StObject.set(x, "recommendationOptions", js.undefined)
    
    inline def setRecommendationOptionsVarargs(value: InstanceRecommendationOption*): Self = StObject.set(x, "recommendationOptions", js.Array(value :_*))
    
    inline def setRecommendationSources(value: RecommendationSources): Self = StObject.set(x, "recommendationSources", value.asInstanceOf[js.Any])
    
    inline def setRecommendationSourcesUndefined: Self = StObject.set(x, "recommendationSources", js.undefined)
    
    inline def setRecommendationSourcesVarargs(value: RecommendationSource*): Self = StObject.set(x, "recommendationSources", js.Array(value :_*))
    
    inline def setUtilizationMetrics(value: UtilizationMetrics): Self = StObject.set(x, "utilizationMetrics", value.asInstanceOf[js.Any])
    
    inline def setUtilizationMetricsUndefined: Self = StObject.set(x, "utilizationMetrics", js.undefined)
    
    inline def setUtilizationMetricsVarargs(value: UtilizationMetric*): Self = StObject.set(x, "utilizationMetrics", js.Array(value :_*))
  }
}
