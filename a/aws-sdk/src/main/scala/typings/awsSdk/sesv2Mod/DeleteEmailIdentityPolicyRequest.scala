package typings.awsSdk.sesv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteEmailIdentityPolicyRequest extends StObject {
  
  /**
    * The email identity for which you want to delete a policy.
    */
  var EmailIdentity: Identity = js.native
  
  /**
    * The name of the policy. The policy name cannot exceed 64 characters and can only include alphanumeric characters, dashes, and underscores.
    */
  var PolicyName: typings.awsSdk.sesv2Mod.PolicyName = js.native
}
object DeleteEmailIdentityPolicyRequest {
  
  @scala.inline
  def apply(EmailIdentity: Identity, PolicyName: PolicyName): DeleteEmailIdentityPolicyRequest = {
    val __obj = js.Dynamic.literal(EmailIdentity = EmailIdentity.asInstanceOf[js.Any], PolicyName = PolicyName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteEmailIdentityPolicyRequest]
  }
  
  @scala.inline
  implicit class DeleteEmailIdentityPolicyRequestMutableBuilder[Self <: DeleteEmailIdentityPolicyRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEmailIdentity(value: Identity): Self = StObject.set(x, "EmailIdentity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPolicyName(value: PolicyName): Self = StObject.set(x, "PolicyName", value.asInstanceOf[js.Any])
  }
}
