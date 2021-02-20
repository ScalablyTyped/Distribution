package typings.awsSdk.iotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DetachPolicyRequest extends StObject {
  
  /**
    * The policy to detach.
    */
  var policyName: PolicyName = js.native
  
  /**
    * The target from which the policy will be detached.
    */
  var target: PolicyTarget = js.native
}
object DetachPolicyRequest {
  
  @scala.inline
  def apply(policyName: PolicyName, target: PolicyTarget): DetachPolicyRequest = {
    val __obj = js.Dynamic.literal(policyName = policyName.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
    __obj.asInstanceOf[DetachPolicyRequest]
  }
  
  @scala.inline
  implicit class DetachPolicyRequestMutableBuilder[Self <: DetachPolicyRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPolicyName(value: PolicyName): Self = StObject.set(x, "policyName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTarget(value: PolicyTarget): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
  }
}
