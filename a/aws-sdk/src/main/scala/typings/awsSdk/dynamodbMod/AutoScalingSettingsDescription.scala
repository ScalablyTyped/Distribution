package typings.awsSdk.dynamodbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AutoScalingSettingsDescription extends StObject {
  
  /**
    * Disabled auto scaling for this global table or global secondary index.
    */
  var AutoScalingDisabled: js.UndefOr[BooleanObject] = js.undefined
  
  /**
    * Role ARN used for configuring the auto scaling policy.
    */
  var AutoScalingRoleArn: js.UndefOr[String] = js.undefined
  
  /**
    * The maximum capacity units that a global table or global secondary index should be scaled up to.
    */
  var MaximumUnits: js.UndefOr[PositiveLongObject] = js.undefined
  
  /**
    * The minimum capacity units that a global table or global secondary index should be scaled down to.
    */
  var MinimumUnits: js.UndefOr[PositiveLongObject] = js.undefined
  
  /**
    * Information about the scaling policies.
    */
  var ScalingPolicies: js.UndefOr[AutoScalingPolicyDescriptionList] = js.undefined
}
object AutoScalingSettingsDescription {
  
  inline def apply(): AutoScalingSettingsDescription = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AutoScalingSettingsDescription]
  }
  
  extension [Self <: AutoScalingSettingsDescription](x: Self) {
    
    inline def setAutoScalingDisabled(value: BooleanObject): Self = StObject.set(x, "AutoScalingDisabled", value.asInstanceOf[js.Any])
    
    inline def setAutoScalingDisabledUndefined: Self = StObject.set(x, "AutoScalingDisabled", js.undefined)
    
    inline def setAutoScalingRoleArn(value: String): Self = StObject.set(x, "AutoScalingRoleArn", value.asInstanceOf[js.Any])
    
    inline def setAutoScalingRoleArnUndefined: Self = StObject.set(x, "AutoScalingRoleArn", js.undefined)
    
    inline def setMaximumUnits(value: PositiveLongObject): Self = StObject.set(x, "MaximumUnits", value.asInstanceOf[js.Any])
    
    inline def setMaximumUnitsUndefined: Self = StObject.set(x, "MaximumUnits", js.undefined)
    
    inline def setMinimumUnits(value: PositiveLongObject): Self = StObject.set(x, "MinimumUnits", value.asInstanceOf[js.Any])
    
    inline def setMinimumUnitsUndefined: Self = StObject.set(x, "MinimumUnits", js.undefined)
    
    inline def setScalingPolicies(value: AutoScalingPolicyDescriptionList): Self = StObject.set(x, "ScalingPolicies", value.asInstanceOf[js.Any])
    
    inline def setScalingPoliciesUndefined: Self = StObject.set(x, "ScalingPolicies", js.undefined)
    
    inline def setScalingPoliciesVarargs(value: AutoScalingPolicyDescription*): Self = StObject.set(x, "ScalingPolicies", js.Array(value :_*))
  }
}
