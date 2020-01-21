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
  def apply(
    Bucket: BucketName,
    ServerSideEncryptionConfiguration: ServerSideEncryptionConfiguration,
    ContentMD5: ContentMD5 = null
  ): PutBucketEncryptionRequest = {
    val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any], ServerSideEncryptionConfiguration = ServerSideEncryptionConfiguration.asInstanceOf[js.Any])
    if (ContentMD5 != null) __obj.updateDynamic("ContentMD5")(ContentMD5.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutBucketEncryptionRequest]
  }
}

