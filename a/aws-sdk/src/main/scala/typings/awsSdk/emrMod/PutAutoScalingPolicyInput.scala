package typings.awsSdk.emrMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PutAutoScalingPolicyInput extends StObject {
  
  /**
    * Specifies the definition of the automatic scaling policy.
    */
  var AutoScalingPolicy: typings.awsSdk.emrMod.AutoScalingPolicy
  
  /**
    * Specifies the ID of a cluster. The instance group to which the automatic scaling policy is applied is within this cluster.
    */
  var ClusterId: typings.awsSdk.emrMod.ClusterId
  
  /**
    * Specifies the ID of the instance group to which the automatic scaling policy is applied.
    */
  var InstanceGroupId: typings.awsSdk.emrMod.InstanceGroupId
}
object PutAutoScalingPolicyInput {
  
  inline def apply(AutoScalingPolicy: AutoScalingPolicy, ClusterId: ClusterId, InstanceGroupId: InstanceGroupId): PutAutoScalingPolicyInput = {
    val __obj = js.Dynamic.literal(AutoScalingPolicy = AutoScalingPolicy.asInstanceOf[js.Any], ClusterId = ClusterId.asInstanceOf[js.Any], InstanceGroupId = InstanceGroupId.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutAutoScalingPolicyInput]
  }
  
  extension [Self <: PutAutoScalingPolicyInput](x: Self) {
    
    inline def setAutoScalingPolicy(value: AutoScalingPolicy): Self = StObject.set(x, "AutoScalingPolicy", value.asInstanceOf[js.Any])
    
    inline def setClusterId(value: ClusterId): Self = StObject.set(x, "ClusterId", value.asInstanceOf[js.Any])
    
    inline def setInstanceGroupId(value: InstanceGroupId): Self = StObject.set(x, "InstanceGroupId", value.asInstanceOf[js.Any])
  }
}
