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
  def apply(Bucket: BucketName, BucketLoggingStatus: BucketLoggingStatus): PutBucketLoggingRequest = {
    val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any], BucketLoggingStatus = BucketLoggingStatus.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutBucketLoggingRequest]
  }
  @scala.inline
  implicit class PutBucketLoggingRequestOps[Self <: PutBucketLoggingRequest] (val x: Self) extends AnyVal {
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
    def setBucketLoggingStatus(value: BucketLoggingStatus): Self = this.set("BucketLoggingStatus", value.asInstanceOf[js.Any])
    @scala.inline
    def setContentMD5(value: ContentMD5): Self = this.set("ContentMD5", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContentMD5: Self = this.set("ContentMD5", js.undefined)
  }
  
}

