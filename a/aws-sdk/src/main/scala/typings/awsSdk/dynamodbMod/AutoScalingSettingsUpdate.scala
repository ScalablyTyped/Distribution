package typings.awsSdk.dynamodbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AutoScalingSettingsUpdate extends StObject {
  
  /**
    * Disabled auto scaling for this global table or global secondary index.
    */
  var AutoScalingDisabled: js.UndefOr[BooleanObject] = js.undefined
  
  /**
    * Role ARN used for configuring auto scaling policy.
    */
  var AutoScalingRoleArn: js.UndefOr[typings.awsSdk.dynamodbMod.AutoScalingRoleArn] = js.undefined
  
  /**
    * The maximum capacity units that a global table or global secondary index should be scaled up to.
    */
  var MaximumUnits: js.UndefOr[PositiveLongObject] = js.undefined
  
  /**
    * The minimum capacity units that a global table or global secondary index should be scaled down to.
    */
  var MinimumUnits: js.UndefOr[PositiveLongObject] = js.undefined
  
  /**
    * The scaling policy to apply for scaling target global table or global secondary index capacity units.
    */
  var ScalingPolicyUpdate: js.UndefOr[AutoScalingPolicyUpdate] = js.undefined
}
object AutoScalingSettingsUpdate {
  
  @scala.inline
  def apply(): AutoScalingSettingsUpdate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AutoScalingSettingsUpdate]
  }
  
  @scala.inline
  implicit class AutoScalingSettingsUpdateMutableBuilder[Self <: AutoScalingSettingsUpdate] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAutoScalingDisabled(value: BooleanObject): Self = StObject.set(x, "AutoScalingDisabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoScalingDisabledUndefined: Self = StObject.set(x, "AutoScalingDisabled", js.undefined)
    
    @scala.inline
    def setAutoScalingRoleArn(value: AutoScalingRoleArn): Self = StObject.set(x, "AutoScalingRoleArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoScalingRoleArnUndefined: Self = StObject.set(x, "AutoScalingRoleArn", js.undefined)
    
    @scala.inline
    def setMaximumUnits(value: PositiveLongObject): Self = StObject.set(x, "MaximumUnits", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaximumUnitsUndefined: Self = StObject.set(x, "MaximumUnits", js.undefined)
    
    @scala.inline
    def setMinimumUnits(value: PositiveLongObject): Self = StObject.set(x, "MinimumUnits", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinimumUnitsUndefined: Self = StObject.set(x, "MinimumUnits", js.undefined)
    
    @scala.inline
    def setScalingPolicyUpdate(value: AutoScalingPolicyUpdate): Self = StObject.set(x, "ScalingPolicyUpdate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScalingPolicyUpdateUndefined: Self = StObject.set(x, "ScalingPolicyUpdate", js.undefined)
  }
}
