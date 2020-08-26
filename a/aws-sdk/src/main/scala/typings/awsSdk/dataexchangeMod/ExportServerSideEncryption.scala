package typings.awsSdk.dataexchangeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExportServerSideEncryption extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the the AWS KMS key you want to use to encrypt the Amazon S3 objects. This parameter is required if you choose aws:kms as an encryption type.
    */
  var KmsKeyArn: js.UndefOr[string] = js.native
  /**
    * The type of server side encryption used for encrypting the objects in Amazon S3.
    */
  var Type: ServerSideEncryptionTypes = js.native
}

object ExportServerSideEncryption {
  @scala.inline
  def apply(Type: ServerSideEncryptionTypes): ExportServerSideEncryption = {
    val __obj = js.Dynamic.literal(Type = Type.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExportServerSideEncryption]
  }
  @scala.inline
  implicit class ExportServerSideEncryptionOps[Self <: ExportServerSideEncryption] (val x: Self) extends AnyVal {
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
    def setType(value: ServerSideEncryptionTypes): Self = this.set("Type", value.asInstanceOf[js.Any])
    @scala.inline
    def setKmsKeyArn(value: string): Self = this.set("KmsKeyArn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKmsKeyArn: Self = this.set("KmsKeyArn", js.undefined)
  }
  
}

