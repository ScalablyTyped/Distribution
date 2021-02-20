package typings.awsSdk.iotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeletePolicyVersionRequest extends StObject {
  
  /**
    * The name of the policy.
    */
  var policyName: PolicyName = js.native
  
  /**
    * The policy version ID.
    */
  var policyVersionId: PolicyVersionId = js.native
}
object DeletePolicyVersionRequest {
  
  @scala.inline
  def apply(policyName: PolicyName, policyVersionId: PolicyVersionId): DeletePolicyVersionRequest = {
    val __obj = js.Dynamic.literal(policyName = policyName.asInstanceOf[js.Any], policyVersionId = policyVersionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeletePolicyVersionRequest]
  }
  
  @scala.inline
  implicit class DeletePolicyVersionRequestMutableBuilder[Self <: DeletePolicyVersionRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPolicyName(value: PolicyName): Self = StObject.set(x, "policyName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPolicyVersionId(value: PolicyVersionId): Self = StObject.set(x, "policyVersionId", value.asInstanceOf[js.Any])
  }
}
