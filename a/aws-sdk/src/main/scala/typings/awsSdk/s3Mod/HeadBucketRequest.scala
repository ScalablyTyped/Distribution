package typings.awsSdk.s3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HeadBucketRequest extends js.Object {
  /**
    * The bucket name.
    */
  var Bucket: BucketName = js.native
}

object HeadBucketRequest {
  @scala.inline
  def apply(Bucket: BucketName): HeadBucketRequest = {
    val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[HeadBucketRequest]
  }
}

