package typings.awsSdk.dataexchangeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExportServerSideEncryption extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the the AWS KMS key you want to use to encrypt the Amazon S3 objects. This parameter is required if you choose aws:kms as an encryption type.
    */
  var KmsKeyArn: string = js.native
  /**
    * The type of server side encryption used for encrypting the objects in Amazon S3.
    */
  var Type: ServerSideEncryptionTypes = js.native
}

object ExportServerSideEncryption {
  @scala.inline
  def apply(KmsKeyArn: string, Type: ServerSideEncryptionTypes): ExportServerSideEncryption = {
    val __obj = js.Dynamic.literal(KmsKeyArn = KmsKeyArn.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExportServerSideEncryption]
  }
}

