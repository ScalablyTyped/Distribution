package typings.awsSdkClientDynamodbBrowser

import typings.awsSdkClientDynamodbBrowser.typesAutoScalingTargetTrackingScalingPolicyConfigurationUpdateMod.AutoScalingTargetTrackingScalingPolicyConfigurationUpdate
import typings.awsSdkClientDynamodbBrowser.typesAutoScalingTargetTrackingScalingPolicyConfigurationUpdateMod.UnmarshalledAutoScalingTargetTrackingScalingPolicyConfigurationUpdate
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
    
    @scala.inline
    def apply(
      TargetTrackingScalingPolicyConfiguration: AutoScalingTargetTrackingScalingPolicyConfigurationUpdate
    ): AutoScalingPolicyUpdate = {
      val __obj = js.Dynamic.literal(TargetTrackingScalingPolicyConfiguration = TargetTrackingScalingPolicyConfiguration.asInstanceOf[js.Any])
      __obj.asInstanceOf[AutoScalingPolicyUpdate]
    }
    
    @scala.inline
    implicit class AutoScalingPolicyUpdateMutableBuilder[Self <: AutoScalingPolicyUpdate] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPolicyName(value: String): Self = StObject.set(x, "PolicyName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPolicyNameUndefined: Self = StObject.set(x, "PolicyName", js.undefined)
      
      @scala.inline
      def setTargetTrackingScalingPolicyConfiguration(value: AutoScalingTargetTrackingScalingPolicyConfigurationUpdate): Self = StObject.set(x, "TargetTrackingScalingPolicyConfiguration", value.asInstanceOf[js.Any])
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
    
    @scala.inline
    def apply(
      TargetTrackingScalingPolicyConfiguration: UnmarshalledAutoScalingTargetTrackingScalingPolicyConfigurationUpdate
    ): UnmarshalledAutoScalingPolicyUpdate = {
      val __obj = js.Dynamic.literal(TargetTrackingScalingPolicyConfiguration = TargetTrackingScalingPolicyConfiguration.asInstanceOf[js.Any])
      __obj.asInstanceOf[UnmarshalledAutoScalingPolicyUpdate]
    }
    
    @scala.inline
    implicit class UnmarshalledAutoScalingPolicyUpdateMutableBuilder[Self <: UnmarshalledAutoScalingPolicyUpdate] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setTargetTrackingScalingPolicyConfiguration(value: UnmarshalledAutoScalingTargetTrackingScalingPolicyConfigurationUpdate): Self = StObject.set(x, "TargetTrackingScalingPolicyConfiguration", value.asInstanceOf[js.Any])
    }
  }
}
