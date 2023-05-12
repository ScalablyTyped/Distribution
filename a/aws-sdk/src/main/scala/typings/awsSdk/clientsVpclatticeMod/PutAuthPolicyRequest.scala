package typings.awsSdk.clientsVpclatticeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PutAuthPolicyRequest extends StObject {
  
  /**
    * The auth policy. The policy string in JSON must not contain newlines or blank lines.
    */
  var policy: AuthPolicyString
  
  /**
    * The ID or Amazon Resource Name (ARN) of the service network or service for which the policy is created.
    */
  var resourceIdentifier: ResourceIdentifier
}
object PutAuthPolicyRequest {
  
  inline def apply(policy: AuthPolicyString, resourceIdentifier: ResourceIdentifier): PutAuthPolicyRequest = {
    val __obj = js.Dynamic.literal(policy = policy.asInstanceOf[js.Any], resourceIdentifier = resourceIdentifier.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutAuthPolicyRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PutAuthPolicyRequest] (val x: Self) extends AnyVal {
    
    inline def setPolicy(value: AuthPolicyString): Self = StObject.set(x, "policy", value.asInstanceOf[js.Any])
    
    inline def setResourceIdentifier(value: ResourceIdentifier): Self = StObject.set(x, "resourceIdentifier", value.asInstanceOf[js.Any])
  }
}
