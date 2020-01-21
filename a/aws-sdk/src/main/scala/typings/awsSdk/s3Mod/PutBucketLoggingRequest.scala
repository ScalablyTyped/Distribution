package typings.awsSdk.s3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PutBucketLoggingRequest extends js.Object {
  /**
    * The name of the bucket for which to set the logging parameters.
    */
  var Bucket: BucketName = js.native
  /**
    * Container for logging status information.
    */
  var BucketLoggingStatus: typings.awsSdk.s3Mod.BucketLoggingStatus = js.native
  /**
    * The MD5 hash of the PutBucketLogging request body.
    */
  var ContentMD5: js.UndefOr[typings.awsSdk.s3Mod.ContentMD5] = js.native
}

object PutBucketLoggingRequest {
  @scala.inline
  def apply(Bucket: BucketName, BucketLoggingStatus: BucketLoggingStatus, ContentMD5: ContentMD5 = null): PutBucketLoggingRequest = {
    val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any], BucketLoggingStatus = BucketLoggingStatus.asInstanceOf[js.Any])
    if (ContentMD5 != null) __obj.updateDynamic("ContentMD5")(ContentMD5.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutBucketLoggingRequest]
  }
}

