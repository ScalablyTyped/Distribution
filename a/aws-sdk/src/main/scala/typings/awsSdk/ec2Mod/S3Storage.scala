package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait S3Storage extends js.Object {
  /**
    * The access key ID of the owner of the bucket. Before you specify a value for your access key ID, review and follow the guidance in Best Practices for Managing AWS Access Keys.
    */
  var AWSAccessKeyId: js.UndefOr[String] = js.native
  /**
    * The bucket in which to store the AMI. You can specify a bucket that you already own or a new bucket that Amazon EC2 creates on your behalf. If you specify a bucket that belongs to someone else, Amazon EC2 returns an error.
    */
  var Bucket: js.UndefOr[String] = js.native
  /**
    * The beginning of the file name of the AMI.
    */
  var Prefix: js.UndefOr[String] = js.native
  /**
    * An Amazon S3 upload policy that gives Amazon EC2 permission to upload items into Amazon S3 on your behalf.
    */
  var UploadPolicy: js.UndefOr[_Blob] = js.native
  /**
    * The signature of the JSON document.
    */
  var UploadPolicySignature: js.UndefOr[String] = js.native
}

object S3Storage {
  @scala.inline
  def apply(): S3Storage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[S3Storage]
  }
  @scala.inline
  implicit class S3StorageOps[Self <: S3Storage] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAWSAccessKeyId(value: String): Self = this.set("AWSAccessKeyId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAWSAccessKeyId: Self = this.set("AWSAccessKeyId", js.undefined)
    @scala.inline
    def setBucket(value: String): Self = this.set("Bucket", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBucket: Self = this.set("Bucket", js.undefined)
    @scala.inline
    def setPrefix(value: String): Self = this.set("Prefix", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrefix: Self = this.set("Prefix", js.undefined)
    @scala.inline
    def setUploadPolicy(value: _Blob): Self = this.set("UploadPolicy", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUploadPolicy: Self = this.set("UploadPolicy", js.undefined)
    @scala.inline
    def setUploadPolicySignature(value: String): Self = this.set("UploadPolicySignature", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUploadPolicySignature: Self = this.set("UploadPolicySignature", js.undefined)
  }
  
}

