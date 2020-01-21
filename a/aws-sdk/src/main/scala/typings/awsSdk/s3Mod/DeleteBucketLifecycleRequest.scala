package typings.awsSdk.s3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteBucketLifecycleRequest extends js.Object {
  /**
    * The bucket name of the lifecycle to delete.
    */
  var Bucket: BucketName = js.native
}

object DeleteBucketLifecycleRequest {
  @scala.inline
  def apply(Bucket: BucketName): DeleteBucketLifecycleRequest = {
    val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DeleteBucketLifecycleRequest]
  }
}

