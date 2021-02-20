package typings.awsSdkClientDynamodbNode

import typings.awsSdkClientDynamodbNode.typesAutoScalingPolicyDescriptionMod.AutoScalingPolicyDescription
import typings.awsSdkClientDynamodbNode.typesAutoScalingPolicyDescriptionMod.UnmarshalledAutoScalingPolicyDescription
import typings.std.Iterable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesAutoScalingSettingsDescriptionMod {
  
  @js.native
  trait AutoScalingSettingsDescription extends StObject {
    
    /**
      * <p>Disabled autoscaling for this global table or global secondary index.</p>
      */
    var AutoScalingDisabled: js.UndefOr[Boolean] = js.native
    
    /**
      * <p>Role ARN used for configuring autoScaling policy.</p>
      */
    var AutoScalingRoleArn: js.UndefOr[String] = js.native
    
    /**
      * <p>The maximum capacity units that a global table or global secondary index should be scaled up to.</p>
      */
    var MaximumUnits: js.UndefOr[Double] = js.native
    
    /**
      * <p>The minimum capacity units that a global table or global secondary index should be scaled down to.</p>
      */
    var MinimumUnits: js.UndefOr[Double] = js.native
    
    /**
      * <p>Information about the scaling policies.</p>
      */
    var ScalingPolicies: js.UndefOr[js.Array[AutoScalingPolicyDescription] | Iterable[AutoScalingPolicyDescription]] = js.native
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
      def setAutoScalingDisabled(value: Boolean): Self = StObject.set(x, "AutoScalingDisabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoScalingDisabledUndefined: Self = StObject.set(x, "AutoScalingDisabled", js.undefined)
      
      @scala.inline
      def setAutoScalingRoleArn(value: String): Self = StObject.set(x, "AutoScalingRoleArn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoScalingRoleArnUndefined: Self = StObject.set(x, "AutoScalingRoleArn", js.undefined)
      
      @scala.inline
      def setMaximumUnits(value: Double): Self = StObject.set(x, "MaximumUnits", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaximumUnitsUndefined: Self = StObject.set(x, "MaximumUnits", js.undefined)
      
      @scala.inline
      def setMinimumUnits(value: Double): Self = StObject.set(x, "MinimumUnits", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinimumUnitsUndefined: Self = StObject.set(x, "MinimumUnits", js.undefined)
      
      @scala.inline
      def setScalingPolicies(value: js.Array[AutoScalingPolicyDescription] | Iterable[AutoScalingPolicyDescription]): Self = StObject.set(x, "ScalingPolicies", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScalingPoliciesUndefined: Self = StObject.set(x, "ScalingPolicies", js.undefined)
      
      @scala.inline
      def setScalingPoliciesVarargs(value: AutoScalingPolicyDescription*): Self = StObject.set(x, "ScalingPolicies", js.Array(value :_*))
    }
  }
  
  @js.native
  trait UnmarshalledAutoScalingSettingsDescription extends AutoScalingSettingsDescription {
    
    /**
      * <p>Information about the scaling policies.</p>
      */
    @JSName("ScalingPolicies")
    var ScalingPolicies_UnmarshalledAutoScalingSettingsDescription: js.UndefOr[js.Array[UnmarshalledAutoScalingPolicyDescription]] = js.native
  }
  object UnmarshalledAutoScalingSettingsDescription {
    
    @scala.inline
    def apply(): UnmarshalledAutoScalingSettingsDescription = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UnmarshalledAutoScalingSettingsDescription]
    }
    
    @scala.inline
    implicit class UnmarshalledAutoScalingSettingsDescriptionMutableBuilder[Self <: UnmarshalledAutoScalingSettingsDescription] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setScalingPolicies(value: js.Array[UnmarshalledAutoScalingPolicyDescription]): Self = StObject.set(x, "ScalingPolicies", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScalingPoliciesUndefined: Self = StObject.set(x, "ScalingPolicies", js.undefined)
      
      @scala.inline
      def setScalingPoliciesVarargs(value: UnmarshalledAutoScalingPolicyDescription*): Self = StObject.set(x, "ScalingPolicies", js.Array(value :_*))
    }
  }
}
