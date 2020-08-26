package typings.awsSdk.macie2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BucketCountByEncryptionType extends js.Object {
  /**
    *  The total number of buckets that use an AWS Key Management Service (AWS KMS) customer master key (CMK) to encrypt objects. These buckets use AWS KMS AWS-managed (AWS-KMS) encryption or AWS KMS customer-managed (SSE-KMS) encryption.
    */
  var kmsManaged: js.UndefOr[long] = js.native
  /**
    * The total number of buckets that use an Amazon S3-managed key to encrypt objects. These buckets use Amazon S3-managed (SSE-S3) encryption.
    */
  var s3Managed: js.UndefOr[long] = js.native
  /**
    * The total number of buckets that don't encrypt objects by default. Default encryption is disabled for these buckets.
    */
  var unencrypted: js.UndefOr[long] = js.native
}

object BucketCountByEncryptionType {
  @scala.inline
  def apply(): BucketCountByEncryptionType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BucketCountByEncryptionType]
  }
  @scala.inline
  implicit class BucketCountByEncryptionTypeOps[Self <: BucketCountByEncryptionType] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setKmsManaged(value: long): Self = this.set("kmsManaged", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKmsManaged: Self = this.set("kmsManaged", js.undefined)
    @scala.inline
    def setS3Managed(value: long): Self = this.set("s3Managed", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteS3Managed: Self = this.set("s3Managed", js.undefined)
    @scala.inline
    def setUnencrypted(value: long): Self = this.set("unencrypted", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUnencrypted: Self = this.set("unencrypted", js.undefined)
  }
  
}

