package typings.awsSdkClientS3Browser.typesServerSideEncryptionByDefaultMod

import typings.awsSdkClientS3Browser.awsSdkClientS3BrowserStrings.AES256
import typings.awsSdkClientS3Browser.awsSdkClientS3BrowserStrings.awsColonkms
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ServerSideEncryptionByDefault extends js.Object {
  /**
    * <p>KMS master key ID to use for the default encryption. This parameter is allowed if SSEAlgorithm is aws:kms.</p>
    */
  var KMSMasterKeyID: js.UndefOr[String] = js.undefined
  /**
    * <p>Server-side encryption algorithm to use for the default encryption.</p>
    */
  var SSEAlgorithm: AES256 | awsColonkms | String
}

object ServerSideEncryptionByDefault {
  @scala.inline
  def apply(SSEAlgorithm: AES256 | awsColonkms | String, KMSMasterKeyID: String = null): ServerSideEncryptionByDefault = {
    val __obj = js.Dynamic.literal(SSEAlgorithm = SSEAlgorithm.asInstanceOf[js.Any])
    if (KMSMasterKeyID != null) __obj.updateDynamic("KMSMasterKeyID")(KMSMasterKeyID.asInstanceOf[js.Any])
    __obj.asInstanceOf[ServerSideEncryptionByDefault]
  }
}

