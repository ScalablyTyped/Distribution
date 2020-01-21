package typings.awsSdk.s3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteBucketPolicyRequest extends js.Object {
  /**
    * The bucket name.
    */
  var Bucket: BucketName = js.native
}

object DeleteBucketPolicyRequest {
  @scala.inline
  def apply(Bucket: BucketName): DeleteBucketPolicyRequest = {
    val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DeleteBucketPolicyRequest]
  }
}

