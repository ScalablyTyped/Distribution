package typings.awsSdk.s3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetBucketLifecycleRequest extends js.Object {
  /**
    * The name of the bucket for which to get the lifecycle information.
    */
  var Bucket: BucketName = js.native
}

object GetBucketLifecycleRequest {
  @scala.inline
  def apply(Bucket: BucketName): GetBucketLifecycleRequest = {
    val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetBucketLifecycleRequest]
  }
}

