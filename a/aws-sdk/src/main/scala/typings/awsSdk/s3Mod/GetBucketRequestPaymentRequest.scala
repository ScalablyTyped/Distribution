package typings.awsSdk.s3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetBucketRequestPaymentRequest extends js.Object {
  /**
    * The name of the bucket for which to get the payment request configuration
    */
  var Bucket: BucketName = js.native
}

object GetBucketRequestPaymentRequest {
  @scala.inline
  def apply(Bucket: BucketName): GetBucketRequestPaymentRequest = {
    val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetBucketRequestPaymentRequest]
  }
}

