package typings.awsSdk.sesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetIdentityPoliciesRequest extends StObject {
  
  /**
    * The identity for which the policies will be retrieved. You can specify an identity by using its name or by using its Amazon Resource Name (ARN). Examples: user@example.com, example.com, arn:aws:ses:us-east-1:123456789012:identity/example.com. To successfully call this API, you must own the identity.
    */
  var Identity: typings.awsSdk.sesMod.Identity
  
  /**
    * A list of the names of policies to be retrieved. You can retrieve a maximum of 20 policies at a time. If you do not know the names of the policies that are attached to the identity, you can use ListIdentityPolicies.
    */
  var PolicyNames: PolicyNameList
}
object GetIdentityPoliciesRequest {
  
  inline def apply(Identity: Identity, PolicyNames: PolicyNameList): GetIdentityPoliciesRequest = {
    val __obj = js.Dynamic.literal(Identity = Identity.asInstanceOf[js.Any], PolicyNames = PolicyNames.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetIdentityPoliciesRequest]
  }
  
  extension [Self <: GetIdentityPoliciesRequest](x: Self) {
    
    inline def setIdentity(value: Identity): Self = StObject.set(x, "Identity", value.asInstanceOf[js.Any])
    
    inline def setPolicyNames(value: PolicyNameList): Self = StObject.set(x, "PolicyNames", value.asInstanceOf[js.Any])
    
    inline def setPolicyNamesVarargs(value: PolicyName*): Self = StObject.set(x, "PolicyNames", js.Array(value :_*))
  }
}
