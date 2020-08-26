package typings.awsSdk.s3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PutBucketEncryptionRequest extends js.Object {
  /**
    * Specifies default encryption for a bucket using server-side encryption with Amazon S3-managed keys (SSE-S3) or customer master keys stored in AWS KMS (SSE-KMS). For information about the Amazon S3 default encryption feature, see Amazon S3 Default Bucket Encryption in the Amazon Simple Storage Service Developer Guide.
    */
  var Bucket: BucketName = js.native
  /**
    * The base64-encoded 128-bit MD5 digest of the server-side encryption configuration. This parameter is auto-populated when using the command from the CLI.
    */
  var ContentMD5: js.UndefOr[typings.awsSdk.s3Mod.ContentMD5] = js.native
  var ServerSideEncryptionConfiguration: typings.awsSdk.s3Mod.ServerSideEncryptionConfiguration = js.native
}

object PutBucketEncryptionRequest {
  @scala.inline
  def apply(Bucket: BucketName, ServerSideEncryptionConfiguration: ServerSideEncryptionConfiguration): PutBucketEncryptionRequest = {
    val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any], ServerSideEncryptionConfiguration = ServerSideEncryptionConfiguration.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutBucketEncryptionRequest]
  }
  @scala.inline
  implicit class PutBucketEncryptionRequestOps[Self <: PutBucketEncryptionRequest] (val x: Self) extends AnyVal {
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
    def setBucket(value: BucketName): Self = this.set("Bucket", value.asInstanceOf[js.Any])
    @scala.inline
    def setServerSideEncryptionConfiguration(value: ServerSideEncryptionConfiguration): Self = this.set("ServerSideEncryptionConfiguration", value.asInstanceOf[js.Any])
    @scala.inline
    def setContentMD5(value: ContentMD5): Self = this.set("ContentMD5", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContentMD5: Self = this.set("ContentMD5", js.undefined)
  }
  
}

