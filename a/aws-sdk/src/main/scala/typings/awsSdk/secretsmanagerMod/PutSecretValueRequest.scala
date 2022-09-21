package typings.awsSdk.secretsmanagerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PutSecretValueRequest extends StObject {
  
  /**
    * A unique identifier for the new version of the secret.   If you use the Amazon Web Services CLI or one of the Amazon Web Services SDKs to call this operation, then you can leave this parameter empty because they generate a random UUID for you. If you don't use the SDK and instead generate a raw HTTP request to the Secrets Manager service endpoint, then you must generate a ClientRequestToken yourself for new versions and include that value in the request.   This value helps ensure idempotency. Secrets Manager uses this value to prevent the accidental creation of duplicate versions if there are failures and retries during the Lambda rotation function processing. We recommend that you generate a UUID-type value to ensure uniqueness within the specified secret.    If the ClientRequestToken value isn't already associated with a version of the secret then a new version of the secret is created.    If a version with this value already exists and that version's SecretString or SecretBinary values are the same as those in the request then the request is ignored. The operation is idempotent.    If a version with this value already exists and the version of the SecretString and SecretBinary values are different from those in the request, then the request fails because you can't modify a secret version. You can only create new versions to store new secret values.   This value becomes the VersionId of the new version.
    */
  var ClientRequestToken: js.UndefOr[ClientRequestTokenType] = js.undefined
  
  /**
    * The binary data to encrypt and store in the new version of the secret. To use this parameter in the command-line tools, we recommend that you store your binary data in a file and then pass the contents of the file as a parameter.  You must include SecretBinary or SecretString, but not both. You can't access this value from the Secrets Manager console.
    */
  var SecretBinary: js.UndefOr[SecretBinaryType] = js.undefined
  
  /**
    * The ARN or name of the secret to add a new version to. For an ARN, we recommend that you specify a complete ARN rather than a partial ARN. See Finding a secret from a partial ARN. If the secret doesn't already exist, use CreateSecret instead.
    */
  var SecretId: SecretIdType
  
  /**
    * The text to encrypt and store in the new version of the secret.  You must include SecretBinary or SecretString, but not both. We recommend you create the secret string as JSON key/value pairs, as shown in the example.
    */
  var SecretString: js.UndefOr[SecretStringType] = js.undefined
  
  /**
    * A list of staging labels to attach to this version of the secret. Secrets Manager uses staging labels to track versions of a secret through the rotation process. If you specify a staging label that's already associated with a different version of the same secret, then Secrets Manager removes the label from the other version and attaches it to this version. If you specify AWSCURRENT, and it is already attached to another version, then Secrets Manager also moves the staging label AWSPREVIOUS to the version that AWSCURRENT was removed from. If you don't include VersionStages, then Secrets Manager automatically moves the staging label AWSCURRENT to this version.
    */
  var VersionStages: js.UndefOr[SecretVersionStagesType] = js.undefined
}
object PutSecretValueRequest {
  
  inline def apply(SecretId: SecretIdType): PutSecretValueRequest = {
    val __obj = js.Dynamic.literal(SecretId = SecretId.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutSecretValueRequest]
  }
  
  extension [Self <: PutSecretValueRequest](x: Self) {
    
    inline def setClientRequestToken(value: ClientRequestTokenType): Self = StObject.set(x, "ClientRequestToken", value.asInstanceOf[js.Any])
    
    inline def setClientRequestTokenUndefined: Self = StObject.set(x, "ClientRequestToken", js.undefined)
    
    inline def setSecretBinary(value: SecretBinaryType): Self = StObject.set(x, "SecretBinary", value.asInstanceOf[js.Any])
    
    inline def setSecretBinaryUndefined: Self = StObject.set(x, "SecretBinary", js.undefined)
    
    inline def setSecretId(value: SecretIdType): Self = StObject.set(x, "SecretId", value.asInstanceOf[js.Any])
    
    inline def setSecretString(value: SecretStringType): Self = StObject.set(x, "SecretString", value.asInstanceOf[js.Any])
    
    inline def setSecretStringUndefined: Self = StObject.set(x, "SecretString", js.undefined)
    
    inline def setVersionStages(value: SecretVersionStagesType): Self = StObject.set(x, "VersionStages", value.asInstanceOf[js.Any])
    
    inline def setVersionStagesUndefined: Self = StObject.set(x, "VersionStages", js.undefined)
    
    inline def setVersionStagesVarargs(value: SecretVersionStageType*): Self = StObject.set(x, "VersionStages", js.Array(value*))
  }
}
