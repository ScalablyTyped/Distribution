package typings.atAwsDashSdkClientDashS3DashBrowser.typesUnderscoreServerSideEncryptionByDefaultMod

import typings.atAwsDashSdkClientDashS3DashBrowser.atAwsDashSdkClientDashS3DashBrowserStrings.AES256
import typings.atAwsDashSdkClientDashS3DashBrowser.atAwsDashSdkClientDashS3DashBrowserStrings.awsColonkms
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _ServerSideEncryptionByDefault extends js.Object {
  /**
    * <p>KMS master key ID to use for the default encryption. This parameter is allowed if SSEAlgorithm is aws:kms.</p>
    */
  var KMSMasterKeyID: js.UndefOr[String] = js.undefined
  /**
    * <p>Server-side encryption algorithm to use for the default encryption.</p>
    */
  var SSEAlgorithm: AES256 | awsColonkms | String
}

object _ServerSideEncryptionByDefault {
  @scala.inline
  def apply(SSEAlgorithm: AES256 | awsColonkms | String, KMSMasterKeyID: String = null): _ServerSideEncryptionByDefault = {
    val __obj = js.Dynamic.literal(SSEAlgorithm = SSEAlgorithm.asInstanceOf[js.Any])
    if (KMSMasterKeyID != null) __obj.updateDynamic("KMSMasterKeyID")(KMSMasterKeyID.asInstanceOf[js.Any])
    __obj.asInstanceOf[_ServerSideEncryptionByDefault]
  }
}

