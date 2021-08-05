package typings.awsSdk.secretsmanagerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetSecretValueResponse extends StObject {
  
  /**
    * The ARN of the secret.
    */
  var ARN: js.UndefOr[SecretARNType] = js.undefined
  
  /**
    * The date and time that this version of the secret was created.
    */
  var CreatedDate: js.UndefOr[CreatedDateType] = js.undefined
  
  /**
    * The friendly name of the secret.
    */
  var Name: js.UndefOr[SecretNameType] = js.undefined
  
  /**
    * The decrypted part of the protected secret information that was originally provided as binary data in the form of a byte array. The response parameter represents the binary data as a base64-encoded string. This parameter is not used if the secret is created by the Secrets Manager console. If you store custom information in this field of the secret, then you must code your Lambda rotation function to parse and interpret whatever you store in the SecretString or SecretBinary fields.
    */
  var SecretBinary: js.UndefOr[SecretBinaryType] = js.undefined
  
  /**
    * The decrypted part of the protected secret information that was originally provided as a string. If you create this secret by using the Secrets Manager console then only the SecretString parameter contains data. Secrets Manager stores the information as a JSON structure of key/value pairs that the Lambda rotation function knows how to parse. If you store custom information in the secret by using the CreateSecret, UpdateSecret, or PutSecretValue API operations instead of the Secrets Manager console, or by using the Other secret type in the console, then you must code your Lambda rotation function to parse and interpret those values.
    */
  var SecretString: js.UndefOr[SecretStringType] = js.undefined
  
  /**
    * The unique identifier of this version of the secret.
    */
  var VersionId: js.UndefOr[SecretVersionIdType] = js.undefined
  
  /**
    * A list of all of the staging labels currently attached to this version of the secret.
    */
  var VersionStages: js.UndefOr[SecretVersionStagesType] = js.undefined
}
object GetSecretValueResponse {
  
  inline def apply(): GetSecretValueResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetSecretValueResponse]
  }
  
  extension [Self <: GetSecretValueResponse](x: Self) {
    
    inline def setARN(value: SecretARNType): Self = StObject.set(x, "ARN", value.asInstanceOf[js.Any])
    
    inline def setARNUndefined: Self = StObject.set(x, "ARN", js.undefined)
    
    inline def setCreatedDate(value: CreatedDateType): Self = StObject.set(x, "CreatedDate", value.asInstanceOf[js.Any])
    
    inline def setCreatedDateUndefined: Self = StObject.set(x, "CreatedDate", js.undefined)
    
    inline def setName(value: SecretNameType): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    inline def setSecretBinary(value: SecretBinaryType): Self = StObject.set(x, "SecretBinary", value.asInstanceOf[js.Any])
    
    inline def setSecretBinaryUndefined: Self = StObject.set(x, "SecretBinary", js.undefined)
    
    inline def setSecretString(value: SecretStringType): Self = StObject.set(x, "SecretString", value.asInstanceOf[js.Any])
    
    inline def setSecretStringUndefined: Self = StObject.set(x, "SecretString", js.undefined)
    
    inline def setVersionId(value: SecretVersionIdType): Self = StObject.set(x, "VersionId", value.asInstanceOf[js.Any])
    
    inline def setVersionIdUndefined: Self = StObject.set(x, "VersionId", js.undefined)
    
    inline def setVersionStages(value: SecretVersionStagesType): Self = StObject.set(x, "VersionStages", value.asInstanceOf[js.Any])
    
    inline def setVersionStagesUndefined: Self = StObject.set(x, "VersionStages", js.undefined)
    
    inline def setVersionStagesVarargs(value: SecretVersionStageType*): Self = StObject.set(x, "VersionStages", js.Array(value :_*))
  }
}
