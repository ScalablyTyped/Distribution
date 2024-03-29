package typings.awsSdkClientDynamodbNode

import typings.awsSdkClientDynamodbNode.typesAutoScalingTargetTrackingScalingPolicyConfigurationUpdateMod.AutoScalingTargetTrackingScalingPolicyConfigurationUpdate
import typings.awsSdkClientDynamodbNode.typesAutoScalingTargetTrackingScalingPolicyConfigurationUpdateMod.UnmarshalledAutoScalingTargetTrackingScalingPolicyConfigurationUpdate
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesAutoScalingPolicyUpdateMod {
  
  trait AutoScalingPolicyUpdate extends StObject {
    
    /**
      * <p>The name of the scaling policy.</p>
      */
    var PolicyName: js.UndefOr[String] = js.undefined
    
    /**
      * <p>Represents a target tracking scaling policy configuration.</p>
      */
    var TargetTrackingScalingPolicyConfiguration: AutoScalingTargetTrackingScalingPolicyConfigurationUpdate
  }
  object AutoScalingPolicyUpdate {
    
    inline def apply(
      TargetTrackingScalingPolicyConfiguration: AutoScalingTargetTrackingScalingPolicyConfigurationUpdate
    ): AutoScalingPolicyUpdate = {
      val __obj = js.Dynamic.literal(TargetTrackingScalingPolicyConfiguration = TargetTrackingScalingPolicyConfiguration.asInstanceOf[js.Any])
      __obj.asInstanceOf[AutoScalingPolicyUpdate]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AutoScalingPolicyUpdate] (val x: Self) extends AnyVal {
      
      inline def setPolicyName(value: String): Self = StObject.set(x, "PolicyName", value.asInstanceOf[js.Any])
      
      inline def setPolicyNameUndefined: Self = StObject.set(x, "PolicyName", js.undefined)
      
      inline def setTargetTrackingScalingPolicyConfiguration(value: AutoScalingTargetTrackingScalingPolicyConfigurationUpdate): Self = StObject.set(x, "TargetTrackingScalingPolicyConfiguration", value.asInstanceOf[js.Any])
    }
  }
  
  trait UnmarshalledAutoScalingPolicyUpdate
    extends StObject
       with AutoScalingPolicyUpdate {
    
    /**
      * <p>Represents a target tracking scaling policy configuration.</p>
      */
    @JSName("TargetTrackingScalingPolicyConfiguration")
    var TargetTrackingScalingPolicyConfiguration_UnmarshalledAutoScalingPolicyUpdate: UnmarshalledAutoScalingTargetTrackingScalingPolicyConfigurationUpdate
  }
  object UnmarshalledAutoScalingPolicyUpdate {
    
    inline def apply(
      TargetTrackingScalingPolicyConfiguration: UnmarshalledAutoScalingTargetTrackingScalingPolicyConfigurationUpdate
    ): UnmarshalledAutoScalingPolicyUpdate = {
      val __obj = js.Dynamic.literal(TargetTrackingScalingPolicyConfiguration = TargetTrackingScalingPolicyConfiguration.asInstanceOf[js.Any])
      __obj.asInstanceOf[UnmarshalledAutoScalingPolicyUpdate]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: UnmarshalledAutoScalingPolicyUpdate] (val x: Self) extends AnyVal {
      
      inline def setTargetTrackingScalingPolicyConfiguration(value: UnmarshalledAutoScalingTargetTrackingScalingPolicyConfigurationUpdate): Self = StObject.set(x, "TargetTrackingScalingPolicyConfiguration", value.asInstanceOf[js.Any])
    }
  }
}
