package typings.awsSdk.computeoptimizerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VolumeRecommendation extends StObject {
  
  /**
    * The Amazon Web Services account ID of the volume.
    */
  var accountId: js.UndefOr[AccountId] = js.undefined
  
  /**
    * An array of objects that describe the current configuration of the volume.
    */
  var currentConfiguration: js.UndefOr[VolumeConfiguration] = js.undefined
  
  /**
    * The risk of the current EBS volume not meeting the performance needs of its workloads. The higher the risk, the more likely the current EBS volume doesn't have sufficient capacity.
    */
  var currentPerformanceRisk: js.UndefOr[CurrentPerformanceRisk] = js.undefined
  
  /**
    * The finding classification of the volume. Findings for volumes include:     NotOptimized —A volume is considered not optimized when Compute Optimizer identifies a recommendation that can provide better performance for your workload.     Optimized —An volume is considered optimized when Compute Optimizer determines that the volume is correctly provisioned to run your workload based on the chosen volume type. For optimized resources, Compute Optimizer might recommend a new generation volume type.  
    */
  var finding: js.UndefOr[EBSFinding] = js.undefined
  
  /**
    * The timestamp of when the volume recommendation was last generated.
    */
  var lastRefreshTimestamp: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The number of days for which utilization metrics were analyzed for the volume.
    */
  var lookBackPeriodInDays: js.UndefOr[LookBackPeriodInDays] = js.undefined
  
  /**
    * An array of objects that describe the utilization metrics of the volume.
    */
  var utilizationMetrics: js.UndefOr[EBSUtilizationMetrics] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the current volume.
    */
  var volumeArn: js.UndefOr[VolumeArn] = js.undefined
  
  /**
    * An array of objects that describe the recommendation options for the volume.
    */
  var volumeRecommendationOptions: js.UndefOr[VolumeRecommendationOptions] = js.undefined
}
object VolumeRecommendation {
  
  inline def apply(): VolumeRecommendation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VolumeRecommendation]
  }
  
  extension [Self <: VolumeRecommendation](x: Self) {
    
    inline def setAccountId(value: AccountId): Self = StObject.set(x, "accountId", value.asInstanceOf[js.Any])
    
    inline def setAccountIdUndefined: Self = StObject.set(x, "accountId", js.undefined)
    
    inline def setCurrentConfiguration(value: VolumeConfiguration): Self = StObject.set(x, "currentConfiguration", value.asInstanceOf[js.Any])
    
    inline def setCurrentConfigurationUndefined: Self = StObject.set(x, "currentConfiguration", js.undefined)
    
    inline def setCurrentPerformanceRisk(value: CurrentPerformanceRisk): Self = StObject.set(x, "currentPerformanceRisk", value.asInstanceOf[js.Any])
    
    inline def setCurrentPerformanceRiskUndefined: Self = StObject.set(x, "currentPerformanceRisk", js.undefined)
    
    inline def setFinding(value: EBSFinding): Self = StObject.set(x, "finding", value.asInstanceOf[js.Any])
    
    inline def setFindingUndefined: Self = StObject.set(x, "finding", js.undefined)
    
    inline def setLastRefreshTimestamp(value: js.Date): Self = StObject.set(x, "lastRefreshTimestamp", value.asInstanceOf[js.Any])
    
    inline def setLastRefreshTimestampUndefined: Self = StObject.set(x, "lastRefreshTimestamp", js.undefined)
    
    inline def setLookBackPeriodInDays(value: LookBackPeriodInDays): Self = StObject.set(x, "lookBackPeriodInDays", value.asInstanceOf[js.Any])
    
    inline def setLookBackPeriodInDaysUndefined: Self = StObject.set(x, "lookBackPeriodInDays", js.undefined)
    
    inline def setUtilizationMetrics(value: EBSUtilizationMetrics): Self = StObject.set(x, "utilizationMetrics", value.asInstanceOf[js.Any])
    
    inline def setUtilizationMetricsUndefined: Self = StObject.set(x, "utilizationMetrics", js.undefined)
    
    inline def setUtilizationMetricsVarargs(value: EBSUtilizationMetric*): Self = StObject.set(x, "utilizationMetrics", js.Array(value*))
    
    inline def setVolumeArn(value: VolumeArn): Self = StObject.set(x, "volumeArn", value.asInstanceOf[js.Any])
    
    inline def setVolumeArnUndefined: Self = StObject.set(x, "volumeArn", js.undefined)
    
    inline def setVolumeRecommendationOptions(value: VolumeRecommendationOptions): Self = StObject.set(x, "volumeRecommendationOptions", value.asInstanceOf[js.Any])
    
    inline def setVolumeRecommendationOptionsUndefined: Self = StObject.set(x, "volumeRecommendationOptions", js.undefined)
    
    inline def setVolumeRecommendationOptionsVarargs(value: VolumeRecommendationOption*): Self = StObject.set(x, "volumeRecommendationOptions", js.Array(value*))
  }
}
