package typings.awsSdk.guarddutyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DefaultServerSideEncryption extends js.Object {
  /**
    * The type of encryption used for objects within the S3 bucket.
    */
  var EncryptionType: js.UndefOr[String] = js.native
  /**
    * The Amazon Resource Name (ARN) of the KMS encryption key. Only available if the bucket EncryptionType is aws:kms.
    */
  var KmsMasterKeyArn: js.UndefOr[String] = js.native
}

object DefaultServerSideEncryption {
  @scala.inline
  def apply(EncryptionType: String = null, KmsMasterKeyArn: String = null): DefaultServerSideEncryption = {
    val __obj = js.Dynamic.literal()
    if (EncryptionType != null) __obj.updateDynamic("EncryptionType")(EncryptionType.asInstanceOf[js.Any])
    if (KmsMasterKeyArn != null) __obj.updateDynamic("KmsMasterKeyArn")(KmsMasterKeyArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DefaultServerSideEncryption]
  }
}

