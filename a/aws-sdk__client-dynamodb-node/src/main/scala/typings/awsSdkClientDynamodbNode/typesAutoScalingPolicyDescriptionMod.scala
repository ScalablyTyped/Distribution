package typings.awsSdkClientDynamodbNode

import typings.awsSdkClientDynamodbNode.typesAutoScalingTargetTrackingScalingPolicyConfigurationDescriptionMod.AutoScalingTargetTrackingScalingPolicyConfigurationDescription
import typings.awsSdkClientDynamodbNode.typesAutoScalingTargetTrackingScalingPolicyConfigurationDescriptionMod.UnmarshalledAutoScalingTargetTrackingScalingPolicyConfigurationDescription
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesAutoScalingPolicyDescriptionMod {
  
  trait AutoScalingPolicyDescription extends StObject {
    
    /**
      * <p>The name of the scaling policy.</p>
      */
    var PolicyName: js.UndefOr[String] = js.undefined
    
    /**
      * <p>Represents a target tracking scaling policy configuration.</p>
      */
    var TargetTrackingScalingPolicyConfiguration: js.UndefOr[AutoScalingTargetTrackingScalingPolicyConfigurationDescription] = js.undefined
  }
  object AutoScalingPolicyDescription {
    
    inline def apply(): AutoScalingPolicyDescription = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AutoScalingPolicyDescription]
    }
    
    extension [Self <: AutoScalingPolicyDescription](x: Self) {
      
      inline def setPolicyName(value: String): Self = StObject.set(x, "PolicyName", value.asInstanceOf[js.Any])
      
      inline def setPolicyNameUndefined: Self = StObject.set(x, "PolicyName", js.undefined)
      
      inline def setTargetTrackingScalingPolicyConfiguration(value: AutoScalingTargetTrackingScalingPolicyConfigurationDescription): Self = StObject.set(x, "TargetTrackingScalingPolicyConfiguration", value.asInstanceOf[js.Any])
      
      inline def setTargetTrackingScalingPolicyConfigurationUndefined: Self = StObject.set(x, "TargetTrackingScalingPolicyConfiguration", js.undefined)
    }
  }
  
  trait UnmarshalledAutoScalingPolicyDescription
    extends StObject
       with AutoScalingPolicyDescription {
    
    /**
      * <p>Represents a target tracking scaling policy configuration.</p>
      */
    @JSName("TargetTrackingScalingPolicyConfiguration")
    var TargetTrackingScalingPolicyConfiguration_UnmarshalledAutoScalingPolicyDescription: js.UndefOr[UnmarshalledAutoScalingTargetTrackingScalingPolicyConfigurationDescription] = js.undefined
  }
  object UnmarshalledAutoScalingPolicyDescription {
    
    inline def apply(): UnmarshalledAutoScalingPolicyDescription = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UnmarshalledAutoScalingPolicyDescription]
    }
    
    extension [Self <: UnmarshalledAutoScalingPolicyDescription](x: Self) {
      
      inline def setTargetTrackingScalingPolicyConfiguration(value: UnmarshalledAutoScalingTargetTrackingScalingPolicyConfigurationDescription): Self = StObject.set(x, "TargetTrackingScalingPolicyConfiguration", value.asInstanceOf[js.Any])
      
      inline def setTargetTrackingScalingPolicyConfigurationUndefined: Self = StObject.set(x, "TargetTrackingScalingPolicyConfiguration", js.undefined)
    }
  }
}
