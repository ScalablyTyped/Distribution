package typings.awsSdk.secretsmanagerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ValidateResourcePolicyRequest extends StObject {
  
  /**
    * Identifies the Resource Policy attached to the secret.
    */
  var ResourcePolicy: NonEmptyResourcePolicyType = js.native
  
  /**
    *  The identifier for the secret that you want to validate a resource policy. You can specify either the Amazon Resource Name (ARN) or the friendly name of the secret.  If you specify an ARN, we generally recommend that you specify a complete ARN. You can specify a partial ARN too—for example, if you don’t include the final hyphen and six random characters that Secrets Manager adds at the end of the ARN when you created the secret. A partial ARN match can work as long as it uniquely matches only one secret. However, if your secret has a name that ends in a hyphen followed by six characters (before Secrets Manager adds the hyphen and six characters to the ARN) and you try to use that as a partial ARN, then those characters cause Secrets Manager to assume that you’re specifying a complete ARN. This confusion can cause unexpected results. To avoid this situation, we recommend that you don’t create secret names ending with a hyphen followed by six characters. If you specify an incomplete ARN without the random suffix, and instead provide the 'friendly name', you must not include the random suffix. If you do include the random suffix added by Secrets Manager, you receive either a ResourceNotFoundException or an AccessDeniedException error, depending on your permissions. 
    */
  var SecretId: js.UndefOr[SecretIdType] = js.native
}
object ValidateResourcePolicyRequest {
  
  @scala.inline
  def apply(ResourcePolicy: NonEmptyResourcePolicyType): ValidateResourcePolicyRequest = {
    val __obj = js.Dynamic.literal(ResourcePolicy = ResourcePolicy.asInstanceOf[js.Any])
    __obj.asInstanceOf[ValidateResourcePolicyRequest]
  }
  
  @scala.inline
  implicit class ValidateResourcePolicyRequestMutableBuilder[Self <: ValidateResourcePolicyRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setResourcePolicy(value: NonEmptyResourcePolicyType): Self = StObject.set(x, "ResourcePolicy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSecretId(value: SecretIdType): Self = StObject.set(x, "SecretId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSecretIdUndefined: Self = StObject.set(x, "SecretId", js.undefined)
  }
}
