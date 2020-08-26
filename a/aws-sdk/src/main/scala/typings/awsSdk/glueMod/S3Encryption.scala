package typings.awsSdk.glueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait S3Encryption extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the KMS key to be used to encrypt the data.
    */
  var KmsKeyArn: js.UndefOr[typings.awsSdk.glueMod.KmsKeyArn] = js.native
  /**
    * The encryption mode to use for Amazon S3 data.
    */
  var S3EncryptionMode: js.UndefOr[typings.awsSdk.glueMod.S3EncryptionMode] = js.native
}

object S3Encryption {
  @scala.inline
  def apply(): S3Encryption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[S3Encryption]
  }
  @scala.inline
  implicit class S3EncryptionOps[Self <: S3Encryption] (val x: Self) extends AnyVal {
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
    def setKmsKeyArn(value: KmsKeyArn): Self = this.set("KmsKeyArn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKmsKeyArn: Self = this.set("KmsKeyArn", js.undefined)
    @scala.inline
    def setS3EncryptionMode(value: S3EncryptionMode): Self = this.set("S3EncryptionMode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteS3EncryptionMode: Self = this.set("S3EncryptionMode", js.undefined)
  }
  
}

