package typings.awsSdk.s3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PutBucketWebsiteRequest extends js.Object {
  /**
    * The bucket name.
    */
  var Bucket: BucketName = js.native
  /**
    * The base64-encoded 128-bit MD5 digest of the data. You must use this header as a message integrity check to verify that the request body was not corrupted in transit. For more information, see RFC 1864.
    */
  var ContentMD5: js.UndefOr[typings.awsSdk.s3Mod.ContentMD5] = js.native
  /**
    * Container for the request.
    */
  var WebsiteConfiguration: typings.awsSdk.s3Mod.WebsiteConfiguration = js.native
}

object PutBucketWebsiteRequest {
  @scala.inline
  def apply(Bucket: BucketName, WebsiteConfiguration: WebsiteConfiguration, ContentMD5: ContentMD5 = null): PutBucketWebsiteRequest = {
    val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any], WebsiteConfiguration = WebsiteConfiguration.asInstanceOf[js.Any])
    if (ContentMD5 != null) __obj.updateDynamic("ContentMD5")(ContentMD5.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutBucketWebsiteRequest]
  }
}

