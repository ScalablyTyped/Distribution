package typings.awsSdk.s3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteBucketTaggingRequest extends js.Object {
  /**
    * The bucket that has the tag set to be removed.
    */
  var Bucket: BucketName = js.native
}

object DeleteBucketTaggingRequest {
  @scala.inline
  def apply(Bucket: BucketName): DeleteBucketTaggingRequest = {
    val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DeleteBucketTaggingRequest]
  }
}

