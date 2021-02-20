package typings.awsSdk.computeoptimizerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AutoScalingGroupRecommendation extends StObject {
  
  /**
    * The AWS account ID of the Auto Scaling group.
    */
  var accountId: js.UndefOr[AccountId] = js.native
  
  /**
    * The Amazon Resource Name (ARN) of the Auto Scaling group.
    */
  var autoScalingGroupArn: js.UndefOr[AutoScalingGroupArn] = js.native
  
  /**
    * The name of the Auto Scaling group.
    */
  var autoScalingGroupName: js.UndefOr[AutoScalingGroupName] = js.native
  
  /**
    * An array of objects that describe the current configuration of the Auto Scaling group.
    */
  var currentConfiguration: js.UndefOr[AutoScalingGroupConfiguration] = js.native
  
  /**
    * The finding classification for the Auto Scaling group. Findings for Auto Scaling groups include:     NotOptimized —An Auto Scaling group is considered not optimized when AWS Compute Optimizer identifies a recommendation that can provide better performance for your workload.     Optimized —An Auto Scaling group is considered optimized when Compute Optimizer determines that the group is correctly provisioned to run your workload based on the chosen instance type. For optimized resources, Compute Optimizer might recommend a new generation instance type.    The values that are returned might be NOT_OPTIMIZED or OPTIMIZED. 
    */
  var finding: js.UndefOr[Finding] = js.native
  
  /**
    * The time stamp of when the Auto Scaling group recommendation was last refreshed.
    */
  var lastRefreshTimestamp: js.UndefOr[LastRefreshTimestamp] = js.native
  
  /**
    * The number of days for which utilization metrics were analyzed for the Auto Scaling group.
    */
  var lookBackPeriodInDays: js.UndefOr[LookBackPeriodInDays] = js.native
  
  /**
    * An array of objects that describe the recommendation options for the Auto Scaling group.
    */
  var recommendationOptions: js.UndefOr[AutoScalingGroupRecommendationOptions] = js.native
  
  /**
    * An array of objects that describe the utilization metrics of the Auto Scaling group.
    */
  var utilizationMetrics: js.UndefOr[UtilizationMetrics] = js.native
}
object AutoScalingGroupRecommendation {
  
  @scala.inline
  def apply(): AutoScalingGroupRecommendation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AutoScalingGroupRecommendation]
  }
  
  @scala.inline
  implicit class AutoScalingGroupRecommendationMutableBuilder[Self <: AutoScalingGroupRecommendation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccountId(value: AccountId): Self = StObject.set(x, "accountId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccountIdUndefined: Self = StObject.set(x, "accountId", js.undefined)
    
    @scala.inline
    def setAutoScalingGroupArn(value: AutoScalingGroupArn): Self = StObject.set(x, "autoScalingGroupArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoScalingGroupArnUndefined: Self = StObject.set(x, "autoScalingGroupArn", js.undefined)
    
    @scala.inline
    def setAutoScalingGroupName(value: AutoScalingGroupName): Self = StObject.set(x, "autoScalingGroupName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoScalingGroupNameUndefined: Self = StObject.set(x, "autoScalingGroupName", js.undefined)
    
    @scala.inline
    def setCurrentConfiguration(value: AutoScalingGroupConfiguration): Self = StObject.set(x, "currentConfiguration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurrentConfigurationUndefined: Self = StObject.set(x, "currentConfiguration", js.undefined)
    
    @scala.inline
    def setFinding(value: Finding): Self = StObject.set(x, "finding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFindingUndefined: Self = StObject.set(x, "finding", js.undefined)
    
    @scala.inline
    def setLastRefreshTimestamp(value: LastRefreshTimestamp): Self = StObject.set(x, "lastRefreshTimestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastRefreshTimestampUndefined: Self = StObject.set(x, "lastRefreshTimestamp", js.undefined)
    
    @scala.inline
    def setLookBackPeriodInDays(value: LookBackPeriodInDays): Self = StObject.set(x, "lookBackPeriodInDays", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLookBackPeriodInDaysUndefined: Self = StObject.set(x, "lookBackPeriodInDays", js.undefined)
    
    @scala.inline
    def setRecommendationOptions(value: AutoScalingGroupRecommendationOptions): Self = StObject.set(x, "recommendationOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRecommendationOptionsUndefined: Self = StObject.set(x, "recommendationOptions", js.undefined)
    
    @scala.inline
    def setRecommendationOptionsVarargs(value: AutoScalingGroupRecommendationOption*): Self = StObject.set(x, "recommendationOptions", js.Array(value :_*))
    
    @scala.inline
    def setUtilizationMetrics(value: UtilizationMetrics): Self = StObject.set(x, "utilizationMetrics", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUtilizationMetricsUndefined: Self = StObject.set(x, "utilizationMetrics", js.undefined)
    
    @scala.inline
    def setUtilizationMetricsVarargs(value: UtilizationMetric*): Self = StObject.set(x, "utilizationMetrics", js.Array(value :_*))
  }
}
