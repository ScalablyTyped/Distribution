package typings.awsSdkClientDynamodbNode

import typings.awsSdkClientDynamodbNode.typesAutoScalingTargetTrackingScalingPolicyConfigurationDescriptionMod.AutoScalingTargetTrackingScalingPolicyConfigurationDescription
import typings.awsSdkClientDynamodbNode.typesAutoScalingTargetTrackingScalingPolicyConfigurationDescriptionMod.UnmarshalledAutoScalingTargetTrackingScalingPolicyConfigurationDescription
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesAutoScalingPolicyDescriptionMod {
  
  @js.native
  trait AutoScalingPolicyDescription extends StObject {
    
    /**
      * <p>The name of the scaling policy.</p>
      */
    var PolicyName: js.UndefOr[String] = js.native
    
    /**
      * <p>Represents a target tracking scaling policy configuration.</p>
      */
    var TargetTrackingScalingPolicyConfiguration: js.UndefOr[AutoScalingTargetTrackingScalingPolicyConfigurationDescription] = js.native
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
      def setPolicyName(value: String): Self = StObject.set(x, "PolicyName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPolicyNameUndefined: Self = StObject.set(x, "PolicyName", js.undefined)
      
      @scala.inline
      def setTargetTrackingScalingPolicyConfiguration(value: AutoScalingTargetTrackingScalingPolicyConfigurationDescription): Self = StObject.set(x, "TargetTrackingScalingPolicyConfiguration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTargetTrackingScalingPolicyConfigurationUndefined: Self = StObject.set(x, "TargetTrackingScalingPolicyConfiguration", js.undefined)
    }
  }
  
  @js.native
  trait UnmarshalledAutoScalingPolicyDescription extends AutoScalingPolicyDescription {
    
    /**
      * <p>Represents a target tracking scaling policy configuration.</p>
      */
    @JSName("TargetTrackingScalingPolicyConfiguration")
    var TargetTrackingScalingPolicyConfiguration_UnmarshalledAutoScalingPolicyDescription: js.UndefOr[UnmarshalledAutoScalingTargetTrackingScalingPolicyConfigurationDescription] = js.native
  }
  object UnmarshalledAutoScalingPolicyDescription {
    
    @scala.inline
    def apply(): UnmarshalledAutoScalingPolicyDescription = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UnmarshalledAutoScalingPolicyDescription]
    }
    
    @scala.inline
    implicit class UnmarshalledAutoScalingPolicyDescriptionMutableBuilder[Self <: UnmarshalledAutoScalingPolicyDescription] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setTargetTrackingScalingPolicyConfiguration(value: UnmarshalledAutoScalingTargetTrackingScalingPolicyConfigurationDescription): Self = StObject.set(x, "TargetTrackingScalingPolicyConfiguration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTargetTrackingScalingPolicyConfigurationUndefined: Self = StObject.set(x, "TargetTrackingScalingPolicyConfiguration", js.undefined)
    }
  }
}
