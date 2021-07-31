package typings.awsSdk.emrMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetManagedScalingPolicyInput extends StObject {
  
  /**
    *  Specifies the ID of the cluster for which the managed scaling policy will be fetched. 
    */
  var ClusterId: typings.awsSdk.emrMod.ClusterId
}
object GetManagedScalingPolicyInput {
  
  @scala.inline
  def apply(ClusterId: ClusterId): GetManagedScalingPolicyInput = {
    val __obj = js.Dynamic.literal(ClusterId = ClusterId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetManagedScalingPolicyInput]
  }
  
  @scala.inline
  implicit class GetManagedScalingPolicyInputMutableBuilder[Self <: GetManagedScalingPolicyInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClusterId(value: ClusterId): Self = StObject.set(x, "ClusterId", value.asInstanceOf[js.Any])
  }
}
