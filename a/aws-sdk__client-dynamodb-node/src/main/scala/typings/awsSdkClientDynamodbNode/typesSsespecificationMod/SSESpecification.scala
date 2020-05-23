package typings.awsSdkClientDynamodbNode.typesSsespecificationMod

import typings.awsSdkClientDynamodbNode.awsSdkClientDynamodbNodeStrings.AES256
import typings.awsSdkClientDynamodbNode.awsSdkClientDynamodbNodeStrings.KMS
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SSESpecification extends js.Object {
  /**
    * <p>Indicates whether server-side encryption is enabled (true) or disabled (false) on the table.</p>
    */
  var Enabled: js.UndefOr[Boolean] = js.undefined
  /**
    * <p>The KMS Master Key (CMK) which should be used for the KMS encryption. To specify a CMK, use its key ID, Amazon Resource Name (ARN), alias name, or alias ARN. Note that you should only provide this parameter if the key is different from the default DynamoDB KMS Master Key alias/aws/dynamodb.</p>
    */
  var KMSMasterKeyId: js.UndefOr[String] = js.undefined
  /**
    * <p>Server-side encryption type:</p> <ul> <li> <p> <code>AES256</code> - Server-side encryption which uses the AES256 algorithm.</p> </li> <li> <p> <code>KMS</code> - Server-side encryption which uses AWS Key Management Service. (default)</p> </li> </ul>
    */
  var SSEType: js.UndefOr[AES256 | KMS | String] = js.undefined
}

object SSESpecification {
  @scala.inline
  def apply(
    Enabled: js.UndefOr[Boolean] = js.undefined,
    KMSMasterKeyId: String = null,
    SSEType: AES256 | KMS | String = null
  ): SSESpecification = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(Enabled)) __obj.updateDynamic("Enabled")(Enabled.get.asInstanceOf[js.Any])
    if (KMSMasterKeyId != null) __obj.updateDynamic("KMSMasterKeyId")(KMSMasterKeyId.asInstanceOf[js.Any])
    if (SSEType != null) __obj.updateDynamic("SSEType")(SSEType.asInstanceOf[js.Any])
    __obj.asInstanceOf[SSESpecification]
  }
}

