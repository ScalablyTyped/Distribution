package typings.awsSdkClientDynamodbNode.typesSsespecificationMod

import typings.awsSdkClientDynamodbNode.awsSdkClientDynamodbNodeStrings.AES256
import typings.awsSdkClientDynamodbNode.awsSdkClientDynamodbNodeStrings.KMS
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SSESpecification extends js.Object {
  /**
    * <p>Indicates whether server-side encryption is enabled (true) or disabled (false) on the table.</p>
    */
  var Enabled: js.UndefOr[Boolean] = js.native
  /**
    * <p>The KMS Master Key (CMK) which should be used for the KMS encryption. To specify a CMK, use its key ID, Amazon Resource Name (ARN), alias name, or alias ARN. Note that you should only provide this parameter if the key is different from the default DynamoDB KMS Master Key alias/aws/dynamodb.</p>
    */
  var KMSMasterKeyId: js.UndefOr[String] = js.native
  /**
    * <p>Server-side encryption type:</p> <ul> <li> <p> <code>AES256</code> - Server-side encryption which uses the AES256 algorithm.</p> </li> <li> <p> <code>KMS</code> - Server-side encryption which uses AWS Key Management Service. (default)</p> </li> </ul>
    */
  var SSEType: js.UndefOr[AES256 | KMS | String] = js.native
}

object SSESpecification {
  @scala.inline
  def apply(): SSESpecification = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SSESpecification]
  }
  @scala.inline
  implicit class SSESpecificationOps[Self <: SSESpecification] (val x: Self) extends AnyVal {
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
    def setEnabled(value: Boolean): Self = this.set("Enabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnabled: Self = this.set("Enabled", js.undefined)
    @scala.inline
    def setKMSMasterKeyId(value: String): Self = this.set("KMSMasterKeyId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKMSMasterKeyId: Self = this.set("KMSMasterKeyId", js.undefined)
    @scala.inline
    def setSSEType(value: AES256 | KMS | String): Self = this.set("SSEType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSSEType: Self = this.set("SSEType", js.undefined)
  }
  
}

