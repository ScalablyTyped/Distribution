package typings.awsSdk.securityhubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AwsS3BucketServerSideEncryptionByDefault extends js.Object {
  /**
    * AWS KMS customer master key (CMK) ID to use for the default encryption.
    */
  var KMSMasterKeyID: js.UndefOr[NonEmptyString] = js.native
  /**
    * Server-side encryption algorithm to use for the default encryption.
    */
  var SSEAlgorithm: js.UndefOr[NonEmptyString] = js.native
}

object AwsS3BucketServerSideEncryptionByDefault {
  @scala.inline
  def apply(KMSMasterKeyID: NonEmptyString = null, SSEAlgorithm: NonEmptyString = null): AwsS3BucketServerSideEncryptionByDefault = {
    val __obj = js.Dynamic.literal()
    if (KMSMasterKeyID != null) __obj.updateDynamic("KMSMasterKeyID")(KMSMasterKeyID.asInstanceOf[js.Any])
    if (SSEAlgorithm != null) __obj.updateDynamic("SSEAlgorithm")(SSEAlgorithm.asInstanceOf[js.Any])
    __obj.asInstanceOf[AwsS3BucketServerSideEncryptionByDefault]
  }
}

