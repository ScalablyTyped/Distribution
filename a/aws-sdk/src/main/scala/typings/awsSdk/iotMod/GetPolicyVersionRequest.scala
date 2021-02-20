package typings.awsSdk.iotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetPolicyVersionRequest extends StObject {
  
  /**
    * The name of the policy.
    */
  var policyName: PolicyName = js.native
  
  /**
    * The policy version ID.
    */
  var policyVersionId: PolicyVersionId = js.native
}
object GetPolicyVersionRequest {
  
  @scala.inline
  def apply(policyName: PolicyName, policyVersionId: PolicyVersionId): GetPolicyVersionRequest = {
    val __obj = js.Dynamic.literal(policyName = policyName.asInstanceOf[js.Any], policyVersionId = policyVersionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetPolicyVersionRequest]
  }
  
  @scala.inline
  implicit class GetPolicyVersionRequestMutableBuilder[Self <: GetPolicyVersionRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPolicyName(value: PolicyName): Self = StObject.set(x, "policyName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPolicyVersionId(value: PolicyVersionId): Self = StObject.set(x, "policyVersionId", value.asInstanceOf[js.Any])
  }
}
