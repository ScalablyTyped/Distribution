package typings.awsSdk.s3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetPublicAccessBlockRequest extends js.Object {
  /**
    * The name of the Amazon S3 bucket whose PublicAccessBlock configuration you want to retrieve. 
    */
  var Bucket: BucketName = js.native
}

object GetPublicAccessBlockRequest {
  @scala.inline
  def apply(Bucket: BucketName): GetPublicAccessBlockRequest = {
    val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetPublicAccessBlockRequest]
  }
}

