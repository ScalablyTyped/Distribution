package typings.awsSdk.s3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteBucketWebsiteRequest extends js.Object {
  /**
    * The bucket name for which you want to remove the website configuration. 
    */
  var Bucket: BucketName = js.native
}

object DeleteBucketWebsiteRequest {
  @scala.inline
  def apply(Bucket: BucketName): DeleteBucketWebsiteRequest = {
    val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteBucketWebsiteRequest]
  }
  @scala.inline
  implicit class DeleteBucketWebsiteRequestOps[Self <: DeleteBucketWebsiteRequest] (val x: Self) extends AnyVal {
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
  }
  
}

