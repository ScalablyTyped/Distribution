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
    
    inline def apply(): AutoScalingSettingsUpdate = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AutoScalingSettingsUpdate]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AutoScalingSettingsUpdate] (val x: Self) extends AnyVal {
      
      inline def setAutoScalingDisabled(value: Boolean): Self = StObject.set(x, "AutoScalingDisabled", value.asInstanceOf[js.Any])
      
      inline def setAutoScalingDisabledUndefined: Self = StObject.set(x, "AutoScalingDisabled", js.undefined)
      
      inline def setAutoScalingRoleArn(value: String): Self = StObject.set(x, "AutoScalingRoleArn", value.asInstanceOf[js.Any])
      
      inline def setAutoScalingRoleArnUndefined: Self = StObject.set(x, "AutoScalingRoleArn", js.undefined)
      
      inline def setMaximumUnits(value: Double): Self = StObject.set(x, "MaximumUnits", value.asInstanceOf[js.Any])
      
      inline def setMaximumUnitsUndefined: Self = StObject.set(x, "MaximumUnits", js.undefined)
      
      inline def setMinimumUnits(value: Double): Self = StObject.set(x, "MinimumUnits", value.asInstanceOf[js.Any])
      
      inline def setMinimumUnitsUndefined: Self = StObject.set(x, "MinimumUnits", js.undefined)
      
      inline def setScalingPolicyUpdate(value: AutoScalingPolicyUpdate): Self = StObject.set(x, "ScalingPolicyUpdate", value.asInstanceOf[js.Any])
      
      inline def setScalingPolicyUpdateUndefined: Self = StObject.set(x, "ScalingPolicyUpdate", js.undefined)
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
    
    inline def apply(): UnmarshalledAutoScalingSettingsUpdate = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UnmarshalledAutoScalingSettingsUpdate]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: UnmarshalledAutoScalingSettingsUpdate] (val x: Self) extends AnyVal {
      
      inline def setScalingPolicyUpdate(value: UnmarshalledAutoScalingPolicyUpdate): Self = StObject.set(x, "ScalingPolicyUpdate", value.asInstanceOf[js.Any])
      
      inline def setScalingPolicyUpdateUndefined: Self = StObject.set(x, "ScalingPolicyUpdate", js.undefined)
    }
  }
}
