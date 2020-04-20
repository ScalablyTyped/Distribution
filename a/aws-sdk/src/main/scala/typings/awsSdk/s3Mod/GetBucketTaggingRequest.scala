package typings.awsSdk.s3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetBucketTaggingRequest extends js.Object {
  /**
    * The name of the bucket for which to get the tagging information.
    */
  var Bucket: BucketName = js.native
}

object GetBucketTaggingRequest {
  @scala.inline
  def apply(Bucket: BucketName): GetBucketTaggingRequest = {
    val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetBucketTaggingRequest]
  }
}

