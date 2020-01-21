package typings.awsSdk.s3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetBucketCorsRequest extends js.Object {
  /**
    * The bucket name for which to get the cors configuration.
    */
  var Bucket: BucketName = js.native
}

object GetBucketCorsRequest {
  @scala.inline
  def apply(Bucket: BucketName): GetBucketCorsRequest = {
    val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GetBucketCorsRequest]
  }
}

