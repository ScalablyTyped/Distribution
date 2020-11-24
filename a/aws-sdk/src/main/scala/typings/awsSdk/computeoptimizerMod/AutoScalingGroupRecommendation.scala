package typings.awsSdk.computeoptimizerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AutoScalingGroupRecommendation extends js.Object {
  
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
  implicit class AutoScalingGroupRecommendationOps[Self <: AutoScalingGroupRecommendation] (val x: Self) extends AnyVal {
    
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
    def setAutoScalingGroupArn(value: AutoScalingGroupArn): Self = this.set("autoScalingGroupArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoScalingGroupArn: Self = this.set("autoScalingGroupArn", js.undefined)
    
    @scala.inline
    def setAutoScalingGroupName(value: AutoScalingGroupName): Self = this.set("autoScalingGroupName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoScalingGroupName: Self = this.set("autoScalingGroupName", js.undefined)
    
    @scala.inline
    def setCurrentConfiguration(value: AutoScalingGroupConfiguration): Self = this.set("currentConfiguration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCurrentConfiguration: Self = this.set("currentConfiguration", js.undefined)
    
    @scala.inline
    def setFinding(value: Finding): Self = this.set("finding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFinding: Self = this.set("finding", js.undefined)
    
    @scala.inline
    def setLastRefreshTimestamp(value: LastRefreshTimestamp): Self = this.set("lastRefreshTimestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLastRefreshTimestamp: Self = this.set("lastRefreshTimestamp", js.undefined)
    
    @scala.inline
    def setLookBackPeriodInDays(value: LookBackPeriodInDays): Self = this.set("lookBackPeriodInDays", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLookBackPeriodInDays: Self = this.set("lookBackPeriodInDays", js.undefined)
    
    @scala.inline
    def setRecommendationOptionsVarargs(value: AutoScalingGroupRecommendationOption*): Self = this.set("recommendationOptions", js.Array(value :_*))
    
    @scala.inline
    def setRecommendationOptions(value: AutoScalingGroupRecommendationOptions): Self = this.set("recommendationOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRecommendationOptions: Self = this.set("recommendationOptions", js.undefined)
    
    @scala.inline
    def setUtilizationMetricsVarargs(value: UtilizationMetric*): Self = this.set("utilizationMetrics", js.Array(value :_*))
    
    @scala.inline
    def setUtilizationMetrics(value: UtilizationMetrics): Self = this.set("utilizationMetrics", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUtilizationMetrics: Self = this.set("utilizationMetrics", js.undefined)
  }
}
