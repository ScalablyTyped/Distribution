package typings.awsSdkClientDynamodbNode.typesAutoScalingTargetTrackingScalingPolicyConfigurationDescriptionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AutoScalingTargetTrackingScalingPolicyConfigurationDescription extends js.Object {
  
  /**
    * <p>Indicates whether scale in by the target tracking policy is disabled. If the value is true, scale in is disabled and the target tracking policy won't remove capacity from the scalable resource. Otherwise, scale in is enabled and the target tracking policy can remove capacity from the scalable resource. The default value is false.</p>
    */
  var DisableScaleIn: js.UndefOr[Boolean] = js.native
  
  /**
    * <p>The amount of time, in seconds, after a scale in activity completes before another scale in activity can start. The cooldown period is used to block subsequent scale in requests until it has expired. You should scale in conservatively to protect your application's availability. However, if another alarm triggers a scale out policy during the cooldown period after a scale-in, application autoscaling scales out your scalable target immediately. </p>
    */
  var ScaleInCooldown: js.UndefOr[Double] = js.native
  
  /**
    * <p>The amount of time, in seconds, after a scale out activity completes before another scale out activity can start. While the cooldown period is in effect, the capacity that has been added by the previous scale out event that initiated the cooldown is calculated as part of the desired capacity for the next scale out. You should continuously (but not excessively) scale out.</p>
    */
  var ScaleOutCooldown: js.UndefOr[Double] = js.native
  
  /**
    * <p>The target value for the metric. The range is 8.515920e-109 to 1.174271e+108 (Base 10) or 2e-360 to 2e360 (Base 2).</p>
    */
  var TargetValue: Double = js.native
}
object AutoScalingTargetTrackingScalingPolicyConfigurationDescription {
  
  @scala.inline
  def apply(TargetValue: Double): AutoScalingTargetTrackingScalingPolicyConfigurationDescription = {
    val __obj = js.Dynamic.literal(TargetValue = TargetValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[AutoScalingTargetTrackingScalingPolicyConfigurationDescription]
  }
  
  @scala.inline
  implicit class AutoScalingTargetTrackingScalingPolicyConfigurationDescriptionOps[Self <: AutoScalingTargetTrackingScalingPolicyConfigurationDescription] (val x: Self) extends AnyVal {
    
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
    def setTargetValue(value: Double): Self = this.set("TargetValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisableScaleIn(value: Boolean): Self = this.set("DisableScaleIn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisableScaleIn: Self = this.set("DisableScaleIn", js.undefined)
    
    @scala.inline
    def setScaleInCooldown(value: Double): Self = this.set("ScaleInCooldown", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScaleInCooldown: Self = this.set("ScaleInCooldown", js.undefined)
    
    @scala.inline
    def setScaleOutCooldown(value: Double): Self = this.set("ScaleOutCooldown", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScaleOutCooldown: Self = this.set("ScaleOutCooldown", js.undefined)
  }
}
