package typings.awsSdk.iotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeletePolicyVersionRequest extends StObject {
  
  /**
    * The name of the policy.
    */
  var policyName: PolicyName
  
  /**
    * The policy version ID.
    */
  var policyVersionId: PolicyVersionId
}
object DeletePolicyVersionRequest {
  
  inline def apply(policyName: PolicyName, policyVersionId: PolicyVersionId): DeletePolicyVersionRequest = {
    val __obj = js.Dynamic.literal(policyName = policyName.asInstanceOf[js.Any], policyVersionId = policyVersionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeletePolicyVersionRequest]
  }
  
  extension [Self <: DeletePolicyVersionRequest](x: Self) {
    
    inline def setPolicyName(value: PolicyName): Self = StObject.set(x, "policyName", value.asInstanceOf[js.Any])
    
    inline def setPolicyVersionId(value: PolicyVersionId): Self = StObject.set(x, "policyVersionId", value.asInstanceOf[js.Any])
  }
}
