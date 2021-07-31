package typings.awsSdk.sesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteIdentityPolicyRequest extends StObject {
  
  /**
    * The identity that is associated with the policy that you want to delete. You can specify the identity by using its name or by using its Amazon Resource Name (ARN). Examples: user@example.com, example.com, arn:aws:ses:us-east-1:123456789012:identity/example.com. To successfully call this API, you must own the identity.
    */
  var Identity: typings.awsSdk.sesMod.Identity
  
  /**
    * The name of the policy to be deleted.
    */
  var PolicyName: typings.awsSdk.sesMod.PolicyName
}
object DeleteIdentityPolicyRequest {
  
  @scala.inline
  def apply(Identity: Identity, PolicyName: PolicyName): DeleteIdentityPolicyRequest = {
    val __obj = js.Dynamic.literal(Identity = Identity.asInstanceOf[js.Any], PolicyName = PolicyName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteIdentityPolicyRequest]
  }
  
  @scala.inline
  implicit class DeleteIdentityPolicyRequestMutableBuilder[Self <: DeleteIdentityPolicyRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIdentity(value: Identity): Self = StObject.set(x, "Identity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPolicyName(value: PolicyName): Self = StObject.set(x, "PolicyName", value.asInstanceOf[js.Any])
  }
}
