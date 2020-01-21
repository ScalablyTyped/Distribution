package typings.awsSdkClientS3Browser.typesEncryptionConfigurationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EncryptionConfiguration extends js.Object {
  /**
    * <p> The ID of the AWS KMS key for the region where the destination bucket resides. Amazon S3 uses this key to encrypt the replica object. </p>
    */
  var ReplicaKmsKeyID: js.UndefOr[String] = js.undefined
}

object EncryptionConfiguration {
  @scala.inline
  def apply(ReplicaKmsKeyID: String = null): EncryptionConfiguration = {
    val __obj = js.Dynamic.literal()
    if (ReplicaKmsKeyID != null) __obj.updateDynamic("ReplicaKmsKeyID")(ReplicaKmsKeyID.asInstanceOf[js.Any])
    __obj.asInstanceOf[EncryptionConfiguration]
  }
}

