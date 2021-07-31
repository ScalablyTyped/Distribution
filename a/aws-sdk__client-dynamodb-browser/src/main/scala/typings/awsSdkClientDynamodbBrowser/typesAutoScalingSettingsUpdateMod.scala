package typings.awsSdkClientDynamodbBrowser

import typings.awsSdkClientDynamodbBrowser.typesAutoScalingPolicyUpdateMod.AutoScalingPolicyUpdate
import typings.awsSdkClientDynamodbBrowser.typesAutoScalingPolicyUpdateMod.UnmarshalledAutoScalingPolicyUpdate
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesAutoScalingSettingsUpdateMod {
  
  trait AutoScalingSettingsUpdate extends StObject {
    
    /**
      * <p>Disabled autoscaling for this global table or global secondary index.</p>
      */
    var AutoScalingDisabled: js.UndefOr[Boolean] = js.undefined
    
    /**
      * <p>Role ARN used for configuring autoscaling policy.</p>
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
      * <p>The scaling policy to apply for scaling target global table or global secondary index capacity units.</p>
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
      def setScalingPolicyUpdate(value: AutoScalingPolicyUpdate): Self = StObject.set(x, "ScalingPolicyUpdate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScalingPolicyUpdateUndefined: Self = StObject.set(x, "ScalingPolicyUpdate", js.undefined)
    }
  }
  
  trait UnmarshalledAutoScalingSettingsUpdate
    extends StObject
       with AutoScalingSettingsUpdate {
    
    /**
      * <p>The scaling policy to apply for scaling target global table or global secondary index capacity units.</p>
      */
    @JSName("ScalingPolicyUpdate")
    var ScalingPolicyUpdate_UnmarshalledAutoScalingSettingsUpdate: js.UndefOr[UnmarshalledAutoScalingPolicyUpdate] = js.undefined
  }
  object UnmarshalledAutoScalingSettingsUpdate {
    
    @scala.inline
    def apply(): UnmarshalledAutoScalingSettingsUpdate = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UnmarshalledAutoScalingSettingsUpdate]
    }
    
    @scala.inline
    implicit class UnmarshalledAutoScalingSettingsUpdateMutableBuilder[Self <: UnmarshalledAutoScalingSettingsUpdate] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setScalingPolicyUpdate(value: UnmarshalledAutoScalingPolicyUpdate): Self = StObject.set(x, "ScalingPolicyUpdate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScalingPolicyUpdateUndefined: Self = StObject.set(x, "ScalingPolicyUpdate", js.undefined)
    }
  }
}
