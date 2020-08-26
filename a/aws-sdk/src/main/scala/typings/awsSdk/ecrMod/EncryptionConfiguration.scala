package typings.awsSdk.ecrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EncryptionConfiguration extends js.Object {
  /**
    * The encryption type to use. If you use the KMS encryption type, the contents of the repository will be encrypted using server-side encryption with customer master keys (CMKs) stored in AWS KMS. When you use AWS KMS to encrypt your data, you can either use the default AWS managed CMK for Amazon ECR, or specify your own CMK, which you already created. For more information, see Protecting Data Using Server-Side Encryption with CMKs Stored in AWS Key Management Service (SSE-KMS) in the Amazon Simple Storage Service Console Developer Guide.. If you use the AES256 encryption type, Amazon ECR uses server-side encryption with Amazon S3-managed encryption keys which encrypts the images in the repository using an AES-256 encryption algorithm. For more information, see Protecting Data Using Server-Side Encryption with Amazon S3-Managed Encryption Keys (SSE-S3) in the Amazon Simple Storage Service Console Developer Guide..
    */
  var encryptionType: EncryptionType = js.native
  /**
    * If you use the KMS encryption type, specify the CMK to use for encryption. The alias, key ID, or full ARN of the CMK can be specified. The key must exist in the same Region as the repository. If no key is specified, the default AWS managed CMK for Amazon ECR will be used.
    */
  var kmsKey: js.UndefOr[KmsKey] = js.native
}

object EncryptionConfiguration {
  @scala.inline
  def apply(encryptionType: EncryptionType): EncryptionConfiguration = {
    val __obj = js.Dynamic.literal(encryptionType = encryptionType.asInstanceOf[js.Any])
    __obj.asInstanceOf[EncryptionConfiguration]
  }
  @scala.inline
  implicit class EncryptionConfigurationOps[Self <: EncryptionConfiguration] (val x: Self) extends AnyVal {
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
    def setEncryptionType(value: EncryptionType): Self = this.set("encryptionType", value.asInstanceOf[js.Any])
    @scala.inline
    def setKmsKey(value: KmsKey): Self = this.set("kmsKey", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKmsKey: Self = this.set("kmsKey", js.undefined)
  }
  
}

