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
  def apply(
    AWSAccessKeyId: String = null,
    Bucket: String = null,
    Prefix: String = null,
    UploadPolicy: _Blob = null,
    UploadPolicySignature: String = null
  ): S3Storage = {
    val __obj = js.Dynamic.literal()
    if (AWSAccessKeyId != null) __obj.updateDynamic("AWSAccessKeyId")(AWSAccessKeyId.asInstanceOf[js.Any])
    if (Bucket != null) __obj.updateDynamic("Bucket")(Bucket.asInstanceOf[js.Any])
    if (Prefix != null) __obj.updateDynamic("Prefix")(Prefix.asInstanceOf[js.Any])
    if (UploadPolicy != null) __obj.updateDynamic("UploadPolicy")(UploadPolicy.asInstanceOf[js.Any])
    if (UploadPolicySignature != null) __obj.updateDynamic("UploadPolicySignature")(UploadPolicySignature.asInstanceOf[js.Any])
    __obj.asInstanceOf[S3Storage]
  }
}

