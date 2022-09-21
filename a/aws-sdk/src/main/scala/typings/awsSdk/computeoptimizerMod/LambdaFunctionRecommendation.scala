package typings.awsSdk.computeoptimizerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LambdaFunctionRecommendation extends StObject {
  
  /**
    * The Amazon Web Services account ID of the function.
    */
  var accountId: js.UndefOr[AccountId] = js.undefined
  
  /**
    * The amount of memory, in MB, that's allocated to the current function.
    */
  var currentMemorySize: js.UndefOr[MemorySize] = js.undefined
  
  /**
    * The risk of the current Lambda function not meeting the performance needs of its workloads. The higher the risk, the more likely the current Lambda function requires more memory.
    */
  var currentPerformanceRisk: js.UndefOr[CurrentPerformanceRisk] = js.undefined
  
  /**
    * The finding classification of the function. Findings for functions include:     Optimized  — The function is correctly provisioned to run your workload based on its current configuration and its utilization history. This finding classification does not include finding reason codes.     NotOptimized  — The function is performing at a higher level (over-provisioned) or at a lower level (under-provisioned) than required for your workload because its current configuration is not optimal. Over-provisioned resources might lead to unnecessary infrastructure cost, and under-provisioned resources might lead to poor application performance. This finding classification can include the MemoryUnderprovisioned and MemoryUnderprovisioned finding reason codes.     Unavailable  — Compute Optimizer was unable to generate a recommendation for the function. This could be because the function has not accumulated sufficient metric data, or the function does not qualify for a recommendation. This finding classification can include the InsufficientData and Inconclusive finding reason codes.  Functions with a finding of unavailable are not returned unless you specify the filter parameter with a value of Unavailable in your GetLambdaFunctionRecommendations request.   
    */
  var finding: js.UndefOr[LambdaFunctionRecommendationFinding] = js.undefined
  
  /**
    * The reason for the finding classification of the function.  Functions that have a finding classification of Optimized don't have a finding reason code.  Finding reason codes for functions include:     MemoryOverprovisioned  — The function is over-provisioned when its memory configuration can be sized down while still meeting the performance requirements of your workload. An over-provisioned function might lead to unnecessary infrastructure cost. This finding reason code is part of the NotOptimized finding classification.     MemoryUnderprovisioned  — The function is under-provisioned when its memory configuration doesn't meet the performance requirements of the workload. An under-provisioned function might lead to poor application performance. This finding reason code is part of the NotOptimized finding classification.     InsufficientData  — The function does not have sufficient metric data for Compute Optimizer to generate a recommendation. For more information, see the Supported resources and requirements in the Compute Optimizer User Guide. This finding reason code is part of the Unavailable finding classification.     Inconclusive  — The function does not qualify for a recommendation because Compute Optimizer cannot generate a recommendation with a high degree of confidence. This finding reason code is part of the Unavailable finding classification.  
    */
  var findingReasonCodes: js.UndefOr[LambdaFunctionRecommendationFindingReasonCodes] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the current function.
    */
  var functionArn: js.UndefOr[FunctionArn] = js.undefined
  
  /**
    * The version number of the current function.
    */
  var functionVersion: js.UndefOr[FunctionVersion] = js.undefined
  
  /**
    * The timestamp of when the function recommendation was last generated.
    */
  var lastRefreshTimestamp: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The number of days for which utilization metrics were analyzed for the function.
    */
  var lookbackPeriodInDays: js.UndefOr[LookBackPeriodInDays] = js.undefined
  
  /**
    * An array of objects that describe the memory configuration recommendation options for the function.
    */
  var memorySizeRecommendationOptions: js.UndefOr[LambdaFunctionMemoryRecommendationOptions] = js.undefined
  
  /**
    * The number of times your function code was applied during the look-back period.
    */
  var numberOfInvocations: js.UndefOr[NumberOfInvocations] = js.undefined
  
  /**
    * An array of objects that describe the utilization metrics of the function.
    */
  var utilizationMetrics: js.UndefOr[LambdaFunctionUtilizationMetrics] = js.undefined
}
object LambdaFunctionRecommendation {
  
  inline def apply(): LambdaFunctionRecommendation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LambdaFunctionRecommendation]
  }
  
  extension [Self <: LambdaFunctionRecommendation](x: Self) {
    
    inline def setAccountId(value: AccountId): Self = StObject.set(x, "accountId", value.asInstanceOf[js.Any])
    
    inline def setAccountIdUndefined: Self = StObject.set(x, "accountId", js.undefined)
    
    inline def setCurrentMemorySize(value: MemorySize): Self = StObject.set(x, "currentMemorySize", value.asInstanceOf[js.Any])
    
    inline def setCurrentMemorySizeUndefined: Self = StObject.set(x, "currentMemorySize", js.undefined)
    
    inline def setCurrentPerformanceRisk(value: CurrentPerformanceRisk): Self = StObject.set(x, "currentPerformanceRisk", value.asInstanceOf[js.Any])
    
    inline def setCurrentPerformanceRiskUndefined: Self = StObject.set(x, "currentPerformanceRisk", js.undefined)
    
    inline def setFinding(value: LambdaFunctionRecommendationFinding): Self = StObject.set(x, "finding", value.asInstanceOf[js.Any])
    
    inline def setFindingReasonCodes(value: LambdaFunctionRecommendationFindingReasonCodes): Self = StObject.set(x, "findingReasonCodes", value.asInstanceOf[js.Any])
    
    inline def setFindingReasonCodesUndefined: Self = StObject.set(x, "findingReasonCodes", js.undefined)
    
    inline def setFindingReasonCodesVarargs(value: LambdaFunctionRecommendationFindingReasonCode*): Self = StObject.set(x, "findingReasonCodes", js.Array(value*))
    
    inline def setFindingUndefined: Self = StObject.set(x, "finding", js.undefined)
    
    inline def setFunctionArn(value: FunctionArn): Self = StObject.set(x, "functionArn", value.asInstanceOf[js.Any])
    
    inline def setFunctionArnUndefined: Self = StObject.set(x, "functionArn", js.undefined)
    
    inline def setFunctionVersion(value: FunctionVersion): Self = StObject.set(x, "functionVersion", value.asInstanceOf[js.Any])
    
    inline def setFunctionVersionUndefined: Self = StObject.set(x, "functionVersion", js.undefined)
    
    inline def setLastRefreshTimestamp(value: js.Date): Self = StObject.set(x, "lastRefreshTimestamp", value.asInstanceOf[js.Any])
    
    inline def setLastRefreshTimestampUndefined: Self = StObject.set(x, "lastRefreshTimestamp", js.undefined)
    
    inline def setLookbackPeriodInDays(value: LookBackPeriodInDays): Self = StObject.set(x, "lookbackPeriodInDays", value.asInstanceOf[js.Any])
    
    inline def setLookbackPeriodInDaysUndefined: Self = StObject.set(x, "lookbackPeriodInDays", js.undefined)
    
    inline def setMemorySizeRecommendationOptions(value: LambdaFunctionMemoryRecommendationOptions): Self = StObject.set(x, "memorySizeRecommendationOptions", value.asInstanceOf[js.Any])
    
    inline def setMemorySizeRecommendationOptionsUndefined: Self = StObject.set(x, "memorySizeRecommendationOptions", js.undefined)
    
    inline def setMemorySizeRecommendationOptionsVarargs(value: LambdaFunctionMemoryRecommendationOption*): Self = StObject.set(x, "memorySizeRecommendationOptions", js.Array(value*))
    
    inline def setNumberOfInvocations(value: NumberOfInvocations): Self = StObject.set(x, "numberOfInvocations", value.asInstanceOf[js.Any])
    
    inline def setNumberOfInvocationsUndefined: Self = StObject.set(x, "numberOfInvocations", js.undefined)
    
    inline def setUtilizationMetrics(value: LambdaFunctionUtilizationMetrics): Self = StObject.set(x, "utilizationMetrics", value.asInstanceOf[js.Any])
    
    inline def setUtilizationMetricsUndefined: Self = StObject.set(x, "utilizationMetrics", js.undefined)
    
    inline def setUtilizationMetricsVarargs(value: LambdaFunctionUtilizationMetric*): Self = StObject.set(x, "utilizationMetrics", js.Array(value*))
  }
}
