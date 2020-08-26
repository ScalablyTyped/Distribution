package typings.awsSdkClientS3Node.typesEncryptionMod

import typings.awsSdkClientS3Node.awsSdkClientS3NodeStrings.AES256
import typings.awsSdkClientS3Node.awsSdkClientS3NodeStrings.awsColonkms
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Encryption extends js.Object {
  /**
    * <p>The server-side encryption algorithm used when storing job results in Amazon S3 (e.g., AES256, aws:kms).</p>
    */
  var EncryptionType: AES256 | awsColonkms | String = js.native
  /**
    * <p>If the encryption type is aws:kms, this optional value can be used to specify the encryption context for the restore results.</p>
    */
  var KMSContext: js.UndefOr[String] = js.native
  /**
    * <p>If the encryption type is aws:kms, this optional value specifies the AWS KMS key ID to use for encryption of job results.</p>
    */
  var KMSKeyId: js.UndefOr[String] = js.native
}

object Encryption {
  @scala.inline
  def apply(EncryptionType: AES256 | awsColonkms | String): Encryption = {
    val __obj = js.Dynamic.literal(EncryptionType = EncryptionType.asInstanceOf[js.Any])
    __obj.asInstanceOf[Encryption]
  }
  @scala.inline
  implicit class EncryptionOps[Self <: Encryption] (val x: Self) extends AnyVal {
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
    def setEncryptionType(value: AES256 | awsColonkms | String): Self = this.set("EncryptionType", value.asInstanceOf[js.Any])
    @scala.inline
    def setKMSContext(value: String): Self = this.set("KMSContext", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKMSContext: Self = this.set("KMSContext", js.undefined)
    @scala.inline
    def setKMSKeyId(value: String): Self = this.set("KMSKeyId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKMSKeyId: Self = this.set("KMSKeyId", js.undefined)
  }
  
}

