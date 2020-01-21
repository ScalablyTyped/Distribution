package typings.awsSdk.secretsmanagerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetSecretValueRequest extends js.Object {
  /**
    * Specifies the secret containing the version that you want to retrieve. You can specify either the Amazon Resource Name (ARN) or the friendly name of the secret.  If you specify an ARN, we generally recommend that you specify a complete ARN. You can specify a partial ARN too—for example, if you don’t include the final hyphen and six random characters that Secrets Manager adds at the end of the ARN when you created the secret. A partial ARN match can work as long as it uniquely matches only one secret. However, if your secret has a name that ends in a hyphen followed by six characters (before Secrets Manager adds the hyphen and six characters to the ARN) and you try to use that as a partial ARN, then those characters cause Secrets Manager to assume that you’re specifying a complete ARN. This confusion can cause unexpected results. To avoid this situation, we recommend that you don’t create secret names that end with a hyphen followed by six characters. 
    */
  var SecretId: SecretIdType = js.native
  /**
    * Specifies the unique identifier of the version of the secret that you want to retrieve. If you specify this parameter then don't specify VersionStage. If you don't specify either a VersionStage or VersionId then the default is to perform the operation on the version with the VersionStage value of AWSCURRENT. This value is typically a UUID-type value with 32 hexadecimal digits.
    */
  var VersionId: js.UndefOr[SecretVersionIdType] = js.native
  /**
    * Specifies the secret version that you want to retrieve by the staging label attached to the version. Staging labels are used to keep track of different versions during the rotation process. If you use this parameter then don't specify VersionId. If you don't specify either a VersionStage or VersionId, then the default is to perform the operation on the version with the VersionStage value of AWSCURRENT.
    */
  var VersionStage: js.UndefOr[SecretVersionStageType] = js.native
}

object GetSecretValueRequest {
  @scala.inline
  def apply(
    SecretId: SecretIdType,
    VersionId: SecretVersionIdType = null,
    VersionStage: SecretVersionStageType = null
  ): GetSecretValueRequest = {
    val __obj = js.Dynamic.literal(SecretId = SecretId.asInstanceOf[js.Any])
    if (VersionId != null) __obj.updateDynamic("VersionId")(VersionId.asInstanceOf[js.Any])
    if (VersionStage != null) __obj.updateDynamic("VersionStage")(VersionStage.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetSecretValueRequest]
  }
}

