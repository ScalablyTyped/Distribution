package typings.awsSdk.s3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteBucketReplicationRequest extends js.Object {
  /**
    *  The bucket name. 
    */
  var Bucket: BucketName = js.native
}

object DeleteBucketReplicationRequest {
  @scala.inline
  def apply(Bucket: BucketName): DeleteBucketReplicationRequest = {
    val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteBucketReplicationRequest]
  }
}

