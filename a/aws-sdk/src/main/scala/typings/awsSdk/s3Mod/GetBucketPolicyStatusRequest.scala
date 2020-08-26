package typings.awsSdk.s3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetBucketPolicyStatusRequest extends js.Object {
  /**
    * The name of the Amazon S3 bucket whose policy status you want to retrieve.
    */
  var Bucket: BucketName = js.native
}

object GetBucketPolicyStatusRequest {
  @scala.inline
  def apply(Bucket: BucketName): GetBucketPolicyStatusRequest = {
    val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetBucketPolicyStatusRequest]
  }
  @scala.inline
  implicit class GetBucketPolicyStatusRequestOps[Self <: GetBucketPolicyStatusRequest] (val x: Self) extends AnyVal {
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

