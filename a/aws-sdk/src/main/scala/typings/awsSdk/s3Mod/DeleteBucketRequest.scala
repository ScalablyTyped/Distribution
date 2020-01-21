package typings.awsSdk.s3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteBucketRequest extends js.Object {
  /**
    * Specifies the bucket being deleted.
    */
  var Bucket: BucketName = js.native
}

object DeleteBucketRequest {
  @scala.inline
  def apply(Bucket: BucketName): DeleteBucketRequest = {
    val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DeleteBucketRequest]
  }
}

