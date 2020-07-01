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
  def apply(Type: ServerSideEncryptionTypes, KmsKeyArn: string = null): ExportServerSideEncryption = {
    val __obj = js.Dynamic.literal(Type = Type.asInstanceOf[js.Any])
    if (KmsKeyArn != null) __obj.updateDynamic("KmsKeyArn")(KmsKeyArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExportServerSideEncryption]
  }
}

