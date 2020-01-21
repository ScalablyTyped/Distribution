package typings.awsSdk.glueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CloudWatchEncryption extends js.Object {
  /**
    * The encryption mode to use for CloudWatch data.
    */
  var CloudWatchEncryptionMode: js.UndefOr[typings.awsSdk.glueMod.CloudWatchEncryptionMode] = js.native
  /**
    * The Amazon Resource Name (ARN) of the KMS key to be used to encrypt the data.
    */
  var KmsKeyArn: js.UndefOr[typings.awsSdk.glueMod.KmsKeyArn] = js.native
}

object CloudWatchEncryption {
  @scala.inline
  def apply(CloudWatchEncryptionMode: CloudWatchEncryptionMode = null, KmsKeyArn: KmsKeyArn = null): CloudWatchEncryption = {
    val __obj = js.Dynamic.literal()
    if (CloudWatchEncryptionMode != null) __obj.updateDynamic("CloudWatchEncryptionMode")(CloudWatchEncryptionMode.asInstanceOf[js.Any])
    if (KmsKeyArn != null) __obj.updateDynamic("KmsKeyArn")(KmsKeyArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[CloudWatchEncryption]
  }
}

