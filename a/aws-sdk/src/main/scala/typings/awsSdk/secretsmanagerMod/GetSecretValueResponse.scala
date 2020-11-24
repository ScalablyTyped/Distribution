package typings.awsSdk.secretsmanagerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetSecretValueResponse extends js.Object {
  
  /**
    * The ARN of the secret.
    */
  var ARN: js.UndefOr[SecretARNType] = js.native
  
  /**
    * The date and time that this version of the secret was created.
    */
  var CreatedDate: js.UndefOr[CreatedDateType] = js.native
  
  /**
    * The friendly name of the secret.
    */
  var Name: js.UndefOr[SecretNameType] = js.native
  
  /**
    * The decrypted part of the protected secret information that was originally provided as binary data in the form of a byte array. The response parameter represents the binary data as a base64-encoded string. This parameter is not used if the secret is created by the Secrets Manager console. If you store custom information in this field of the secret, then you must code your Lambda rotation function to parse and interpret whatever you store in the SecretString or SecretBinary fields.
    */
  var SecretBinary: js.UndefOr[SecretBinaryType] = js.native
  
  /**
    * The decrypted part of the protected secret information that was originally provided as a string. If you create this secret by using the Secrets Manager console then only the SecretString parameter contains data. Secrets Manager stores the information as a JSON structure of key/value pairs that the Lambda rotation function knows how to parse. If you store custom information in the secret by using the CreateSecret, UpdateSecret, or PutSecretValue API operations instead of the Secrets Manager console, or by using the Other secret type in the console, then you must code your Lambda rotation function to parse and interpret those values.
    */
  var SecretString: js.UndefOr[SecretStringType] = js.native
  
  /**
    * The unique identifier of this version of the secret.
    */
  var VersionId: js.UndefOr[SecretVersionIdType] = js.native
  
  /**
    * A list of all of the staging labels currently attached to this version of the secret.
    */
  var VersionStages: js.UndefOr[SecretVersionStagesType] = js.native
}
object GetSecretValueResponse {
  
  @scala.inline
  def apply(): GetSecretValueResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetSecretValueResponse]
  }
  
  @scala.inline
  implicit class GetSecretValueResponseOps[Self <: GetSecretValueResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setARN(value: SecretARNType): Self = this.set("ARN", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteARN: Self = this.set("ARN", js.undefined)
    
    @scala.inline
    def setCreatedDate(value: CreatedDateType): Self = this.set("CreatedDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreatedDate: Self = this.set("CreatedDate", js.undefined)
    
    @scala.inline
    def setName(value: SecretNameType): Self = this.set("Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("Name", js.undefined)
    
    @scala.inline
    def setSecretBinary(value: SecretBinaryType): Self = this.set("SecretBinary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSecretBinary: Self = this.set("SecretBinary", js.undefined)
    
    @scala.inline
    def setSecretString(value: SecretStringType): Self = this.set("SecretString", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSecretString: Self = this.set("SecretString", js.undefined)
    
    @scala.inline
    def setVersionId(value: SecretVersionIdType): Self = this.set("VersionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVersionId: Self = this.set("VersionId", js.undefined)
    
    @scala.inline
    def setVersionStagesVarargs(value: SecretVersionStageType*): Self = this.set("VersionStages", js.Array(value :_*))
    
    @scala.inline
    def setVersionStages(value: SecretVersionStagesType): Self = this.set("VersionStages", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVersionStages: Self = this.set("VersionStages", js.undefined)
  }
}
