package typings.awsSdk.s3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EncryptionConfiguration extends js.Object {
  /**
    * Specifies the ID (Key ARN or Alias ARN) of the customer managed customer master key (CMK) stored in AWS Key Management Service (KMS) for the destination bucket. Amazon S3 uses this key to encrypt replica objects. Amazon S3 only supports symmetric customer managed CMKs. For more information, see Using Symmetric and Asymmetric Keys in the AWS Key Management Service Developer Guide.
    */
  var ReplicaKmsKeyID: js.UndefOr[typings.awsSdk.s3Mod.ReplicaKmsKeyID] = js.native
}

object EncryptionConfiguration {
  @scala.inline
  def apply(ReplicaKmsKeyID: ReplicaKmsKeyID = null): EncryptionConfiguration = {
    val __obj = js.Dynamic.literal()
    if (ReplicaKmsKeyID != null) __obj.updateDynamic("ReplicaKmsKeyID")(ReplicaKmsKeyID.asInstanceOf[js.Any])
    __obj.asInstanceOf[EncryptionConfiguration]
  }
}

