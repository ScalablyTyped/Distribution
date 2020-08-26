package typings.awsSdk.s3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PutBucketTaggingRequest extends js.Object {
  /**
    * The bucket name.
    */
  var Bucket: BucketName = js.native
  /**
    * The base64-encoded 128-bit MD5 digest of the data. You must use this header as a message integrity check to verify that the request body was not corrupted in transit. For more information, see RFC 1864.
    */
  var ContentMD5: js.UndefOr[typings.awsSdk.s3Mod.ContentMD5] = js.native
  /**
    * Container for the TagSet and Tag elements.
    */
  var Tagging: typings.awsSdk.s3Mod.Tagging = js.native
}

object PutBucketTaggingRequest {
  @scala.inline
  def apply(Bucket: BucketName, Tagging: Tagging): PutBucketTaggingRequest = {
    val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any], Tagging = Tagging.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutBucketTaggingRequest]
  }
  @scala.inline
  implicit class PutBucketTaggingRequestOps[Self <: PutBucketTaggingRequest] (val x: Self) extends AnyVal {
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
    def setTagging(value: Tagging): Self = this.set("Tagging", value.asInstanceOf[js.Any])
    @scala.inline
    def setContentMD5(value: ContentMD5): Self = this.set("ContentMD5", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContentMD5: Self = this.set("ContentMD5", js.undefined)
  }
  
}

