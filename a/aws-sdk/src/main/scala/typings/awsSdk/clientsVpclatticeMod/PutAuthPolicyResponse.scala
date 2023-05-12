package typings.awsSdk.clientsVpclatticeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PutAuthPolicyResponse extends StObject {
  
  /**
    * The auth policy. The policy string in JSON must not contain newlines or blank lines.
    */
  var policy: js.UndefOr[AuthPolicyString] = js.undefined
  
  /**
    * The state of the auth policy. The auth policy is only active when the auth type is set to AWS_IAM. If you provide a policy, then authentication and authorization decisions are made based on this policy and the client's IAM policy. If the Auth type is NONE, then, any auth policy you provide will remain inactive. For more information, see Create a service network in the Amazon VPC Lattice User Guide.
    */
  var state: js.UndefOr[AuthPolicyState] = js.undefined
}
object PutAuthPolicyResponse {
  
  inline def apply(): PutAuthPolicyResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PutAuthPolicyResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PutAuthPolicyResponse] (val x: Self) extends AnyVal {
    
    inline def setPolicy(value: AuthPolicyString): Self = StObject.set(x, "policy", value.asInstanceOf[js.Any])
    
    inline def setPolicyUndefined: Self = StObject.set(x, "policy", js.undefined)
    
    inline def setState(value: AuthPolicyState): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
  }
}
