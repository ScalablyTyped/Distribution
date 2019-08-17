package typings.atAwsDashSdkClientDashS3DashBrowser.typesUnderscoreEncryptionMod

import typings.atAwsDashSdkClientDashS3DashBrowser.atAwsDashSdkClientDashS3DashBrowserStrings.AES256
import typings.atAwsDashSdkClientDashS3DashBrowser.atAwsDashSdkClientDashS3DashBrowserStrings.`aws:kms`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _Encryption extends js.Object {
  /**
    * <p>The server-side encryption algorithm used when storing job results in Amazon S3 (e.g., AES256, aws:kms).</p>
    */
  var EncryptionType: AES256 | `aws:kms` | String
  /**
    * <p>If the encryption type is aws:kms, this optional value can be used to specify the encryption context for the restore results.</p>
    */
  var KMSContext: js.UndefOr[String] = js.undefined
  /**
    * <p>If the encryption type is aws:kms, this optional value specifies the AWS KMS key ID to use for encryption of job results.</p>
    */
  var KMSKeyId: js.UndefOr[String] = js.undefined
}

object _Encryption {
  @scala.inline
  def apply(EncryptionType: AES256 | `aws:kms` | String, KMSContext: String = null, KMSKeyId: String = null): _Encryption = {
    val __obj = js.Dynamic.literal(EncryptionType = EncryptionType.asInstanceOf[js.Any])
    if (KMSContext != null) __obj.updateDynamic("KMSContext")(KMSContext)
    if (KMSKeyId != null) __obj.updateDynamic("KMSKeyId")(KMSKeyId)
    __obj.asInstanceOf[_Encryption]
  }
}

