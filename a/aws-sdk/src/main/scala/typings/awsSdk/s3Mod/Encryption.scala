package typings.awsSdk.s3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Encryption extends js.Object {
  /**
    * The server-side encryption algorithm used when storing job results in Amazon S3 (for example, AES256, aws:kms).
    */
  var EncryptionType: ServerSideEncryption = js.native
  /**
    * If the encryption type is aws:kms, this optional value can be used to specify the encryption context for the restore results.
    */
  var KMSContext: js.UndefOr[typings.awsSdk.s3Mod.KMSContext] = js.native
  /**
    * If the encryption type is aws:kms, this optional value specifies the ID of the symmetric customer managed AWS KMS CMK to use for encryption of job results. Amazon S3 only supports symmetric CMKs. For more information, see Using Symmetric and Asymmetric Keys in the AWS Key Management Service Developer Guide.
    */
  var KMSKeyId: js.UndefOr[SSEKMSKeyId] = js.native
}

object Encryption {
  @scala.inline
  def apply(EncryptionType: ServerSideEncryption, KMSContext: KMSContext = null, KMSKeyId: SSEKMSKeyId = null): Encryption = {
    val __obj = js.Dynamic.literal(EncryptionType = EncryptionType.asInstanceOf[js.Any])
    if (KMSContext != null) __obj.updateDynamic("KMSContext")(KMSContext.asInstanceOf[js.Any])
    if (KMSKeyId != null) __obj.updateDynamic("KMSKeyId")(KMSKeyId.asInstanceOf[js.Any])
    __obj.asInstanceOf[Encryption]
  }
}

