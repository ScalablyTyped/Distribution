package typings.awsSdk.macie2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ObjectCountByEncryptionType extends js.Object {
  /**
    * The total number of objects that are encrypted using a customer-managed key. The objects use customer-provided server-side (SSE-C) encryption.
    */
  var customerManaged: js.UndefOr[long] = js.native
  /**
    * The total number of objects that are encrypted using an AWS Key Management Service (AWS KMS) customer master key (CMK). The objects use AWS KMS AWS-managed (AWS-KMS) encryption or AWS KMS customer-managed (SSE-KMS) encryption.
    */
  var kmsManaged: js.UndefOr[long] = js.native
  /**
    * The total number of objects that are encrypted using an Amazon S3-managed key. The objects use Amazon S3-managed (SSE-S3) encryption.
    */
  var s3Managed: js.UndefOr[long] = js.native
  /**
    * The total number of objects that aren't encrypted or use client-side encryption.
    */
  var unencrypted: js.UndefOr[long] = js.native
}

object ObjectCountByEncryptionType {
  @scala.inline
  def apply(): ObjectCountByEncryptionType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ObjectCountByEncryptionType]
  }
  @scala.inline
  implicit class ObjectCountByEncryptionTypeOps[Self <: ObjectCountByEncryptionType] (val x: Self) extends AnyVal {
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
    def setCustomerManaged(value: long): Self = this.set("customerManaged", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCustomerManaged: Self = this.set("customerManaged", js.undefined)
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

