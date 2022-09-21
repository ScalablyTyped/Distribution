package typings.awsSdkClientDynamodbBrowser

import typings.awsSdkClientDynamodbBrowser.typesAutoScalingPolicyDescriptionMod.AutoScalingPolicyDescription
import typings.awsSdkClientDynamodbBrowser.typesAutoScalingPolicyDescriptionMod.UnmarshalledAutoScalingPolicyDescription
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesAutoScalingSettingsDescriptionMod {
  
  trait AutoScalingSettingsDescription extends StObject {
    
    /**
      * <p>Disabled autoscaling for this global table or global secondary index.</p>
      */
    var AutoScalingDisabled: js.UndefOr[Boolean] = js.undefined
    
    /**
      * <p>Role ARN used for configuring autoScaling policy.</p>
      */
    var AutoScalingRoleArn: js.UndefOr[String] = js.undefined
    
    /**
      * <p>The maximum capacity units that a global table or global secondary index should be scaled up to.</p>
      */
    var MaximumUnits: js.UndefOr[Double] = js.undefined
    
    /**
      * <p>The minimum capacity units that a global table or global secondary index should be scaled down to.</p>
      */
    var MinimumUnits: js.UndefOr[Double] = js.undefined
    
    /**
      * <p>Information about the scaling policies.</p>
      */
    var ScalingPolicies: js.UndefOr[
        js.Array[AutoScalingPolicyDescription] | js.Iterable[AutoScalingPolicyDescription]
      ] = js.undefined
  }
  object AutoScalingSettingsDescription {
    
    inline def apply(): AutoScalingSettingsDescription = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AutoScalingSettingsDescription]
    }
    
    extension [Self <: AutoScalingSettingsDescription](x: Self) {
      
      inline def setAutoScalingDisabled(value: Boolean): Self = StObject.set(x, "AutoScalingDisabled", value.asInstanceOf[js.Any])
      
      inline def setAutoScalingDisabledUndefined: Self = StObject.set(x, "AutoScalingDisabled", js.undefined)
      
      inline def setAutoScalingRoleArn(value: String): Self = StObject.set(x, "AutoScalingRoleArn", value.asInstanceOf[js.Any])
      
      inline def setAutoScalingRoleArnUndefined: Self = StObject.set(x, "AutoScalingRoleArn", js.undefined)
      
      inline def setMaximumUnits(value: Double): Self = StObject.set(x, "MaximumUnits", value.asInstanceOf[js.Any])
      
      inline def setMaximumUnitsUndefined: Self = StObject.set(x, "MaximumUnits", js.undefined)
      
      inline def setMinimumUnits(value: Double): Self = StObject.set(x, "MinimumUnits", value.asInstanceOf[js.Any])
      
      inline def setMinimumUnitsUndefined: Self = StObject.set(x, "MinimumUnits", js.undefined)
      
      inline def setScalingPolicies(value: js.Array[AutoScalingPolicyDescription] | js.Iterable[AutoScalingPolicyDescription]): Self = StObject.set(x, "ScalingPolicies", value.asInstanceOf[js.Any])
      
      inline def setScalingPoliciesUndefined: Self = StObject.set(x, "ScalingPolicies", js.undefined)
      
      inline def setScalingPoliciesVarargs(value: AutoScalingPolicyDescription*): Self = StObject.set(x, "ScalingPolicies", js.Array(value*))
    }
  }
  
  trait UnmarshalledAutoScalingSettingsDescription
    extends StObject
       with AutoScalingSettingsDescription {
    
    /**
      * <p>Information about the scaling policies.</p>
      */
    @JSName("ScalingPolicies")
    var ScalingPolicies_UnmarshalledAutoScalingSettingsDescription: js.UndefOr[js.Array[UnmarshalledAutoScalingPolicyDescription]] = js.undefined
  }
  object UnmarshalledAutoScalingSettingsDescription {
    
    inline def apply(): UnmarshalledAutoScalingSettingsDescription = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UnmarshalledAutoScalingSettingsDescription]
    }
    
    extension [Self <: UnmarshalledAutoScalingSettingsDescription](x: Self) {
      
      inline def setScalingPolicies(value: js.Array[UnmarshalledAutoScalingPolicyDescription]): Self = StObject.set(x, "ScalingPolicies", value.asInstanceOf[js.Any])
      
      inline def setScalingPoliciesUndefined: Self = StObject.set(x, "ScalingPolicies", js.undefined)
      
      inline def setScalingPoliciesVarargs(value: UnmarshalledAutoScalingPolicyDescription*): Self = StObject.set(x, "ScalingPolicies", js.Array(value*))
    }
  }
}
