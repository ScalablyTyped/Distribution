package typings.awsSdk.s3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetBucketAclRequest extends js.Object {
  /**
    * Specifies the S3 bucket whose ACL is being requested.
    */
  var Bucket: BucketName = js.native
}

object GetBucketAclRequest {
  @scala.inline
  def apply(Bucket: BucketName): GetBucketAclRequest = {
    val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GetBucketAclRequest]
  }
}

