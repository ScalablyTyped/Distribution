package typings.awsSdk.emrMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PutManagedScalingPolicyInput extends StObject {
  
  /**
    *  Specifies the ID of an EMR cluster where the managed scaling policy is attached. 
    */
  var ClusterId: typings.awsSdk.emrMod.ClusterId = js.native
  
  /**
    *  Specifies the constraints for the managed scaling policy. 
    */
  var ManagedScalingPolicy: typings.awsSdk.emrMod.ManagedScalingPolicy = js.native
}
object PutManagedScalingPolicyInput {
  
  @scala.inline
  def apply(ClusterId: ClusterId, ManagedScalingPolicy: ManagedScalingPolicy): PutManagedScalingPolicyInput = {
    val __obj = js.Dynamic.literal(ClusterId = ClusterId.asInstanceOf[js.Any], ManagedScalingPolicy = ManagedScalingPolicy.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutManagedScalingPolicyInput]
  }
  
  @scala.inline
  implicit class PutManagedScalingPolicyInputMutableBuilder[Self <: PutManagedScalingPolicyInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClusterId(value: ClusterId): Self = StObject.set(x, "ClusterId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setManagedScalingPolicy(value: ManagedScalingPolicy): Self = StObject.set(x, "ManagedScalingPolicy", value.asInstanceOf[js.Any])
  }
}
