package typings.awsSdk.s3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeletePublicAccessBlockRequest extends js.Object {
  /**
    * The Amazon S3 bucket whose PublicAccessBlock configuration you want to delete. 
    */
  var Bucket: BucketName = js.native
}

object DeletePublicAccessBlockRequest {
  @scala.inline
  def apply(Bucket: BucketName): DeletePublicAccessBlockRequest = {
    val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeletePublicAccessBlockRequest]
  }
  @scala.inline
  implicit class DeletePublicAccessBlockRequestOps[Self <: DeletePublicAccessBlockRequest] (val x: Self) extends AnyVal {
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

