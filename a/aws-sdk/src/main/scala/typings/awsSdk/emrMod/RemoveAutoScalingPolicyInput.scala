package typings.awsSdk.emrMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RemoveAutoScalingPolicyInput extends StObject {
  
  /**
    * Specifies the ID of a cluster. The instance group to which the automatic scaling policy is applied is within this cluster.
    */
  var ClusterId: typings.awsSdk.emrMod.ClusterId
  
  /**
    * Specifies the ID of the instance group to which the scaling policy is applied.
    */
  var InstanceGroupId: typings.awsSdk.emrMod.InstanceGroupId
}
object RemoveAutoScalingPolicyInput {
  
  @scala.inline
  def apply(ClusterId: ClusterId, InstanceGroupId: InstanceGroupId): RemoveAutoScalingPolicyInput = {
    val __obj = js.Dynamic.literal(ClusterId = ClusterId.asInstanceOf[js.Any], InstanceGroupId = InstanceGroupId.asInstanceOf[js.Any])
    __obj.asInstanceOf[RemoveAutoScalingPolicyInput]
  }
  
  @scala.inline
  implicit class RemoveAutoScalingPolicyInputMutableBuilder[Self <: RemoveAutoScalingPolicyInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClusterId(value: ClusterId): Self = StObject.set(x, "ClusterId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstanceGroupId(value: InstanceGroupId): Self = StObject.set(x, "InstanceGroupId", value.asInstanceOf[js.Any])
  }
}
