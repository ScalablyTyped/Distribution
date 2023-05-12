package typings.awsSdk.clientsVpclatticeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetAuthPolicyResponse extends StObject {
  
  /**
    * The date and time that the auth policy was created, specified in ISO-8601 format.
    */
  var createdAt: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The date and time that the auth policy was last updated, specified in ISO-8601 format.
    */
  var lastUpdatedAt: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The auth policy.
    */
  var policy: js.UndefOr[AuthPolicyString] = js.undefined
  
  /**
    * The state of the auth policy. The auth policy is only active when the auth type is set to AWS_IAM. If you provide a policy, then authentication and authorization decisions are made based on this policy and the client's IAM policy. If the auth type is NONE, then any auth policy you provide will remain inactive. For more information, see Create a service network in the Amazon VPC Lattice User Guide.
    */
  var state: js.UndefOr[AuthPolicyState] = js.undefined
}
object GetAuthPolicyResponse {
  
  inline def apply(): GetAuthPolicyResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetAuthPolicyResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetAuthPolicyResponse] (val x: Self) extends AnyVal {
    
    inline def setCreatedAt(value: js.Date): Self = StObject.set(x, "createdAt", value.asInstanceOf[js.Any])
    
    inline def setCreatedAtUndefined: Self = StObject.set(x, "createdAt", js.undefined)
    
    inline def setLastUpdatedAt(value: js.Date): Self = StObject.set(x, "lastUpdatedAt", value.asInstanceOf[js.Any])
    
    inline def setLastUpdatedAtUndefined: Self = StObject.set(x, "lastUpdatedAt", js.undefined)
    
    inline def setPolicy(value: AuthPolicyString): Self = StObject.set(x, "policy", value.asInstanceOf[js.Any])
    
    inline def setPolicyUndefined: Self = StObject.set(x, "policy", js.undefined)
    
    inline def setState(value: AuthPolicyState): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
  }
}
