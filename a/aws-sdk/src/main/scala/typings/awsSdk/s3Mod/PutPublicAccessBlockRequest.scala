package typings.awsSdk.s3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PutPublicAccessBlockRequest extends js.Object {
  /**
    * The name of the Amazon S3 bucket whose PublicAccessBlock configuration you want to set.
    */
  var Bucket: BucketName = js.native
  /**
    * The MD5 hash of the PutPublicAccessBlock request body. 
    */
  var ContentMD5: js.UndefOr[typings.awsSdk.s3Mod.ContentMD5] = js.native
  /**
    * The PublicAccessBlock configuration that you want to apply to this Amazon S3 bucket. You can enable the configuration options in any combination. For more information about when Amazon S3 considers a bucket or object public, see The Meaning of "Public" in the Amazon Simple Storage Service Developer Guide.
    */
  var PublicAccessBlockConfiguration: typings.awsSdk.s3Mod.PublicAccessBlockConfiguration = js.native
}

object PutPublicAccessBlockRequest {
  @scala.inline
  def apply(
    Bucket: BucketName,
    PublicAccessBlockConfiguration: PublicAccessBlockConfiguration,
    ContentMD5: ContentMD5 = null
  ): PutPublicAccessBlockRequest = {
    val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any], PublicAccessBlockConfiguration = PublicAccessBlockConfiguration.asInstanceOf[js.Any])
    if (ContentMD5 != null) __obj.updateDynamic("ContentMD5")(ContentMD5.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutPublicAccessBlockRequest]
  }
}

