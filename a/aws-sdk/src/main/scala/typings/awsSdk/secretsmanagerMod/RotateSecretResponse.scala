package typings.awsSdk.secretsmanagerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RotateSecretResponse extends StObject {
  
  /**
    * The ARN of the secret.
    */
  var ARN: js.UndefOr[SecretARNType] = js.native
  
  /**
    * The friendly name of the secret.
    */
  var Name: js.UndefOr[SecretNameType] = js.native
  
  /**
    * The ID of the new version of the secret created by the rotation started by this request.
    */
  var VersionId: js.UndefOr[SecretVersionIdType] = js.native
}
object RotateSecretResponse {
  
  @scala.inline
  def apply(): RotateSecretResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RotateSecretResponse]
  }
  
  @scala.inline
  implicit class RotateSecretResponseMutableBuilder[Self <: RotateSecretResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setARN(value: SecretARNType): Self = StObject.set(x, "ARN", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setARNUndefined: Self = StObject.set(x, "ARN", js.undefined)
    
    @scala.inline
    def setName(value: SecretNameType): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    @scala.inline
    def setVersionId(value: SecretVersionIdType): Self = StObject.set(x, "VersionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersionIdUndefined: Self = StObject.set(x, "VersionId", js.undefined)
  }
}
