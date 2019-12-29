package typings.atAwsDashSdkClientDashGlacierDashNode.typesUnderscoreEncryptionMod

import typings.atAwsDashSdkClientDashGlacierDashNode.atAwsDashSdkClientDashGlacierDashNodeStrings.AES256
import typings.atAwsDashSdkClientDashGlacierDashNode.atAwsDashSdkClientDashGlacierDashNodeStrings.awsColonkms
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _Encryption extends js.Object {
  /**
    * <p>The server-side encryption algorithm used when storing job results in Amazon S3, for example <code>AES256</code> or <code>aws:kms</code>.</p>
    */
  var EncryptionType: js.UndefOr[awsColonkms | AES256 | String] = js.undefined
  /**
    * <p>Optional. If the encryption type is <code>aws:kms</code>, you can use this value to specify the encryption context for the job results.</p>
    */
  var KMSContext: js.UndefOr[String] = js.undefined
  /**
    * <p>The AWS KMS key ID to use for object encryption. All GET and PUT requests for an object protected by AWS KMS fail if not made by using Secure Sockets Layer (SSL) or Signature Version 4. </p>
    */
  var KMSKeyId: js.UndefOr[String] = js.undefined
}

object _Encryption {
  @scala.inline
  def apply(
    EncryptionType: awsColonkms | AES256 | String = null,
    KMSContext: String = null,
    KMSKeyId: String = null
  ): _Encryption = {
    val __obj = js.Dynamic.literal()
    if (EncryptionType != null) __obj.updateDynamic("EncryptionType")(EncryptionType.asInstanceOf[js.Any])
    if (KMSContext != null) __obj.updateDynamic("KMSContext")(KMSContext.asInstanceOf[js.Any])
    if (KMSKeyId != null) __obj.updateDynamic("KMSKeyId")(KMSKeyId.asInstanceOf[js.Any])
    __obj.asInstanceOf[_Encryption]
  }
}

