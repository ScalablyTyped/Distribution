package typings.awsSdk.secretsmanagerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateSecretRequest extends js.Object {
  /**
    * (Optional) If you want to add a new version to the secret, this parameter specifies a unique identifier for the new version that helps ensure idempotency.  If you use the AWS CLI or one of the AWS SDK to call this operation, then you can leave this parameter empty. The CLI or SDK generates a random UUID for you and includes that in the request. If you don't use the SDK and instead generate a raw HTTP request to the Secrets Manager service endpoint, then you must generate a ClientRequestToken yourself for new versions and include that value in the request. You typically only need to interact with this value if you implement your own retry logic and want to ensure that a given secret is not created twice. We recommend that you generate a UUID-type value to ensure uniqueness within the specified secret.  Secrets Manager uses this value to prevent the accidental creation of duplicate versions if there are failures and retries during the Lambda rotation function's processing.   If the ClientRequestToken value isn't already associated with a version of the secret then a new version of the secret is created.    If a version with this value already exists and that version's SecretString and SecretBinary values are the same as those in the request then the request is ignored (the operation is idempotent).    If a version with this value already exists and that version's SecretString and SecretBinary values are different from the request then an error occurs because you cannot modify an existing secret value.   This value becomes the VersionId of the new version.
    */
  var ClientRequestToken: js.UndefOr[ClientRequestTokenType] = js.native
  /**
    * (Optional) Specifies an updated user-provided description of the secret.
    */
  var Description: js.UndefOr[DescriptionType] = js.native
  /**
    * (Optional) Specifies an updated ARN or alias of the AWS KMS customer master key (CMK) to be used to encrypt the protected text in new versions of this secret.  You can only use the account's default CMK to encrypt and decrypt if you call this operation using credentials from the same account that owns the secret. If the secret is in a different account, then you must create a custom CMK and provide the ARN of that CMK in this field. The user making the call must have permissions to both the secret and the CMK in their respective accounts. 
    */
  var KmsKeyId: js.UndefOr[KmsKeyIdType] = js.native
  /**
    * (Optional) Specifies updated binary data that you want to encrypt and store in the new version of the secret. To use this parameter in the command-line tools, we recommend that you store your binary data in a file and then use the appropriate technique for your tool to pass the contents of the file as a parameter. Either SecretBinary or SecretString must have a value, but not both. They cannot both be empty. This parameter is not accessible using the Secrets Manager console.
    */
  var SecretBinary: js.UndefOr[SecretBinaryType] = js.native
  /**
    * Specifies the secret that you want to modify or to which you want to add a new version. You can specify either the Amazon Resource Name (ARN) or the friendly name of the secret.  If you specify an ARN, we generally recommend that you specify a complete ARN. You can specify a partial ARN too—for example, if you don’t include the final hyphen and six random characters that Secrets Manager adds at the end of the ARN when you created the secret. A partial ARN match can work as long as it uniquely matches only one secret. However, if your secret has a name that ends in a hyphen followed by six characters (before Secrets Manager adds the hyphen and six characters to the ARN) and you try to use that as a partial ARN, then those characters cause Secrets Manager to assume that you’re specifying a complete ARN. This confusion can cause unexpected results. To avoid this situation, we recommend that you don’t create secret names ending with a hyphen followed by six characters. If you specify an incomplete ARN without the random suffix, and instead provide the 'friendly name', you must not include the random suffix. If you do include the random suffix added by Secrets Manager, you receive either a ResourceNotFoundException or an AccessDeniedException error, depending on your permissions. 
    */
  var SecretId: SecretIdType = js.native
  /**
    * (Optional) Specifies updated text data that you want to encrypt and store in this new version of the secret. Either SecretBinary or SecretString must have a value, but not both. They cannot both be empty. If you create this secret by using the Secrets Manager console then Secrets Manager puts the protected secret text in only the SecretString parameter. The Secrets Manager console stores the information as a JSON structure of key/value pairs that the default Lambda rotation function knows how to parse. For storing multiple values, we recommend that you use a JSON text string argument and specify key/value pairs. For information on how to format a JSON parameter for the various command line tool environments, see Using JSON for Parameters in the AWS CLI User Guide. For example:  [{"username":"bob"},{"password":"abc123xyz456"}]  If your command-line tool or SDK requires quotation marks around the parameter, you should use single quotes to avoid confusion with the double quotes required in the JSON text. You can also 'escape' the double quote character in the embedded JSON text by prefacing each with a backslash. For example, the following string is surrounded by double-quotes. All of the embedded double quotes are escaped:  "[{\"username\":\"bob\"},{\"password\":\"abc123xyz456\"}]" 
    */
  var SecretString: js.UndefOr[SecretStringType] = js.native
}

object UpdateSecretRequest {
  @scala.inline
  def apply(SecretId: SecretIdType): UpdateSecretRequest = {
    val __obj = js.Dynamic.literal(SecretId = SecretId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateSecretRequest]
  }
  @scala.inline
  implicit class UpdateSecretRequestOps[Self <: UpdateSecretRequest] (val x: Self) extends AnyVal {
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
    def setSecretId(value: SecretIdType): Self = this.set("SecretId", value.asInstanceOf[js.Any])
    @scala.inline
    def setClientRequestToken(value: ClientRequestTokenType): Self = this.set("ClientRequestToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClientRequestToken: Self = this.set("ClientRequestToken", js.undefined)
    @scala.inline
    def setDescription(value: DescriptionType): Self = this.set("Description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("Description", js.undefined)
    @scala.inline
    def setKmsKeyId(value: KmsKeyIdType): Self = this.set("KmsKeyId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKmsKeyId: Self = this.set("KmsKeyId", js.undefined)
    @scala.inline
    def setSecretBinary(value: SecretBinaryType): Self = this.set("SecretBinary", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSecretBinary: Self = this.set("SecretBinary", js.undefined)
    @scala.inline
    def setSecretString(value: SecretStringType): Self = this.set("SecretString", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSecretString: Self = this.set("SecretString", js.undefined)
  }
  
}

