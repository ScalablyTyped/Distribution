package typings.awsSdk.s3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetBucketLoggingRequest extends js.Object {
  /**
    * The bucket name for which to get the logging information.
    */
  var Bucket: BucketName = js.native
}

object GetBucketLoggingRequest {
  @scala.inline
  def apply(Bucket: BucketName): GetBucketLoggingRequest = {
    val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GetBucketLoggingRequest]
  }
}

