package typings.awsSdk.iotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeletePolicyRequest extends StObject {
  
  /**
    * The name of the policy to delete.
    */
  var policyName: PolicyName = js.native
}
object DeletePolicyRequest {
  
  @scala.inline
  def apply(policyName: PolicyName): DeletePolicyRequest = {
    val __obj = js.Dynamic.literal(policyName = policyName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeletePolicyRequest]
  }
  
  @scala.inline
  implicit class DeletePolicyRequestMutableBuilder[Self <: DeletePolicyRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPolicyName(value: PolicyName): Self = StObject.set(x, "policyName", value.asInstanceOf[js.Any])
  }
}
