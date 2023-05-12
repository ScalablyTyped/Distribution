package typings.awsSdk.clientsVpclatticeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PutResourcePolicyRequest extends StObject {
  
  /**
    * An IAM policy. The policy string in JSON must not contain newlines or blank lines.
    */
  var policy: PolicyString
  
  /**
    * The ID or Amazon Resource Name (ARN) of the service network or service for which the policy is created.
    */
  var resourceArn: ResourceArn
}
object PutResourcePolicyRequest {
  
  inline def apply(policy: PolicyString, resourceArn: ResourceArn): PutResourcePolicyRequest = {
    val __obj = js.Dynamic.literal(policy = policy.asInstanceOf[js.Any], resourceArn = resourceArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutResourcePolicyRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PutResourcePolicyRequest] (val x: Self) extends AnyVal {
    
    inline def setPolicy(value: PolicyString): Self = StObject.set(x, "policy", value.asInstanceOf[js.Any])
    
    inline def setResourceArn(value: ResourceArn): Self = StObject.set(x, "resourceArn", value.asInstanceOf[js.Any])
  }
}
