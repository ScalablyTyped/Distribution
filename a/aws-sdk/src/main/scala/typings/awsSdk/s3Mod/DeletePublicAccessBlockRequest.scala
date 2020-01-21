package typings.awsSdk.s3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeletePublicAccessBlockRequest extends js.Object {
  /**
    * The Amazon S3 bucket whose PublicAccessBlock configuration you want to delete. 
    */
  var Bucket: BucketName = js.native
}

object DeletePublicAccessBlockRequest {
  @scala.inline
  def apply(Bucket: BucketName): DeletePublicAccessBlockRequest = {
    val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DeletePublicAccessBlockRequest]
  }
}

