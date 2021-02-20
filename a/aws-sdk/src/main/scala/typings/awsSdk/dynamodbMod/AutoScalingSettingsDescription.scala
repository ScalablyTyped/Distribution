package typings.awsSdk.dynamodbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AutoScalingSettingsDescription extends StObject {
  
  /**
    * Disabled auto scaling for this global table or global secondary index.
    */
  var AutoScalingDisabled: js.UndefOr[BooleanObject] = js.native
  
  /**
    * Role ARN used for configuring the auto scaling policy.
    */
  var AutoScalingRoleArn: js.UndefOr[String] = js.native
  
  /**
    * The maximum capacity units that a global table or global secondary index should be scaled up to.
    */
  var MaximumUnits: js.UndefOr[PositiveLongObject] = js.native
  
  /**
    * The minimum capacity units that a global table or global secondary index should be scaled down to.
    */
  var MinimumUnits: js.UndefOr[PositiveLongObject] = js.native
  
  /**
    * Information about the scaling policies.
    */
  var ScalingPolicies: js.UndefOr[AutoScalingPolicyDescriptionList] = js.native
}
object AutoScalingSettingsDescription {
  
  @scala.inline
  def apply(): AutoScalingSettingsDescription = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AutoScalingSettingsDescription]
  }
  
  @scala.inline
  implicit class AutoScalingSettingsDescriptionMutableBuilder[Self <: AutoScalingSettingsDescription] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAutoScalingDisabled(value: BooleanObject): Self = StObject.set(x, "AutoScalingDisabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoScalingDisabledUndefined: Self = StObject.set(x, "AutoScalingDisabled", js.undefined)
    
    @scala.inline
    def setAutoScalingRoleArn(value: String): Self = StObject.set(x, "AutoScalingRoleArn", value.asInstanceOf[js.Any])
    
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
    def setScalingPolicies(value: AutoScalingPolicyDescriptionList): Self = StObject.set(x, "ScalingPolicies", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScalingPoliciesUndefined: Self = StObject.set(x, "ScalingPolicies", js.undefined)
    
    @scala.inline
    def setScalingPoliciesVarargs(value: AutoScalingPolicyDescription*): Self = StObject.set(x, "ScalingPolicies", js.Array(value :_*))
  }
}
