package typings.awsSdk.emrMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RemoveManagedScalingPolicyInput extends StObject {
  
  /**
    *  Specifies the ID of the cluster from which the managed scaling policy will be removed. 
    */
  var ClusterId: typings.awsSdk.emrMod.ClusterId = js.native
}
object RemoveManagedScalingPolicyInput {
  
  @scala.inline
  def apply(ClusterId: ClusterId): RemoveManagedScalingPolicyInput = {
    val __obj = js.Dynamic.literal(ClusterId = ClusterId.asInstanceOf[js.Any])
    __obj.asInstanceOf[RemoveManagedScalingPolicyInput]
  }
  
  @scala.inline
  implicit class RemoveManagedScalingPolicyInputMutableBuilder[Self <: RemoveManagedScalingPolicyInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClusterId(value: ClusterId): Self = StObject.set(x, "ClusterId", value.asInstanceOf[js.Any])
  }
}
