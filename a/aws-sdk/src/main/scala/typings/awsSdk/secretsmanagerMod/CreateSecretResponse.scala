package typings.awsSdk.secretsmanagerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateSecretResponse extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the secret that you just created.  Secrets Manager automatically adds several random characters to the name at the end of the ARN when you initially create a secret. This affects only the ARN and not the actual friendly name. This ensures that if you create a new secret with the same name as an old secret that you previously deleted, then users with access to the old secret don't automatically get access to the new secret because the ARNs are different. 
    */
  var ARN: js.UndefOr[SecretARNType] = js.undefined
  
  /**
    * The friendly name of the secret that you just created.
    */
  var Name: js.UndefOr[SecretNameType] = js.undefined
  
  /**
    * The unique identifier associated with the version of the secret you just created.
    */
  var VersionId: js.UndefOr[SecretVersionIdType] = js.undefined
}
object CreateSecretResponse {
  
  @scala.inline
  def apply(): CreateSecretResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateSecretResponse]
  }
  
  @scala.inline
  implicit class CreateSecretResponseMutableBuilder[Self <: CreateSecretResponse] (val x: Self) extends AnyVal {
    
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
