package typings.awsSdk.secretsmanagerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RestoreSecretRequest extends StObject {
  
  /**
    * Specifies the secret that you want to restore from a previously scheduled deletion. You can specify either the Amazon Resource Name (ARN) or the friendly name of the secret.  If you specify an ARN, we generally recommend that you specify a complete ARN. You can specify a partial ARN too—for example, if you don’t include the final hyphen and six random characters that Secrets Manager adds at the end of the ARN when you created the secret. A partial ARN match can work as long as it uniquely matches only one secret. However, if your secret has a name that ends in a hyphen followed by six characters (before Secrets Manager adds the hyphen and six characters to the ARN) and you try to use that as a partial ARN, then those characters cause Secrets Manager to assume that you’re specifying a complete ARN. This confusion can cause unexpected results. To avoid this situation, we recommend that you don’t create secret names ending with a hyphen followed by six characters. If you specify an incomplete ARN without the random suffix, and instead provide the 'friendly name', you must not include the random suffix. If you do include the random suffix added by Secrets Manager, you receive either a ResourceNotFoundException or an AccessDeniedException error, depending on your permissions. 
    */
  var SecretId: SecretIdType
}
object RestoreSecretRequest {
  
  @scala.inline
  def apply(SecretId: SecretIdType): RestoreSecretRequest = {
    val __obj = js.Dynamic.literal(SecretId = SecretId.asInstanceOf[js.Any])
    __obj.asInstanceOf[RestoreSecretRequest]
  }
  
  @scala.inline
  implicit class RestoreSecretRequestMutableBuilder[Self <: RestoreSecretRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSecretId(value: SecretIdType): Self = StObject.set(x, "SecretId", value.asInstanceOf[js.Any])
  }
}
