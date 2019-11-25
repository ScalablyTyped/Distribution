package typings.atAwsDashSdkClientDashS3DashNode.typesUnderscoreServerSideEncryptionByDefaultMod

import typings.atAwsDashSdkClientDashS3DashNode.atAwsDashSdkClientDashS3DashNodeStrings.AES256
import typings.atAwsDashSdkClientDashS3DashNode.atAwsDashSdkClientDashS3DashNodeStrings.`aws:kms`
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
  var SSEAlgorithm: AES256 | `aws:kms` | String
}

object _ServerSideEncryptionByDefault {
  @scala.inline
  def apply(SSEAlgorithm: AES256 | `aws:kms` | String, KMSMasterKeyID: String = null): _ServerSideEncryptionByDefault = {
    val __obj = js.Dynamic.literal(SSEAlgorithm = SSEAlgorithm.asInstanceOf[js.Any])
    if (KMSMasterKeyID != null) __obj.updateDynamic("KMSMasterKeyID")(KMSMasterKeyID.asInstanceOf[js.Any])
    __obj.asInstanceOf[_ServerSideEncryptionByDefault]
  }
}

