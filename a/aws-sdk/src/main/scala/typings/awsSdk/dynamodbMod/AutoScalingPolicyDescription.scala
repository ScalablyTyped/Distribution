package typings.awsSdk.dynamodbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AutoScalingPolicyDescription extends StObject {
  
  /**
    * The name of the scaling policy.
    */
  var PolicyName: js.UndefOr[AutoScalingPolicyName] = js.undefined
  
  /**
    * Represents a target tracking scaling policy configuration.
    */
  var TargetTrackingScalingPolicyConfiguration: js.UndefOr[AutoScalingTargetTrackingScalingPolicyConfigurationDescription] = js.undefined
}
object AutoScalingPolicyDescription {
  
  @scala.inline
  def apply(): AutoScalingPolicyDescription = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AutoScalingPolicyDescription]
  }
  
  @scala.inline
  implicit class AutoScalingPolicyDescriptionMutableBuilder[Self <: AutoScalingPolicyDescription] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPolicyName(value: AutoScalingPolicyName): Self = StObject.set(x, "PolicyName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPolicyNameUndefined: Self = StObject.set(x, "PolicyName", js.undefined)
    
    @scala.inline
    def setTargetTrackingScalingPolicyConfiguration(value: AutoScalingTargetTrackingScalingPolicyConfigurationDescription): Self = StObject.set(x, "TargetTrackingScalingPolicyConfiguration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetTrackingScalingPolicyConfigurationUndefined: Self = StObject.set(x, "TargetTrackingScalingPolicyConfiguration", js.undefined)
  }
}
