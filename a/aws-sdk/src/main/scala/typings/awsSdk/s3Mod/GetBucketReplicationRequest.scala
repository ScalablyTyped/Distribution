package typings.awsSdk.s3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetBucketReplicationRequest extends js.Object {
  /**
    * The bucket name for which to get the replication information.
    */
  var Bucket: BucketName = js.native
}

object GetBucketReplicationRequest {
  @scala.inline
  def apply(Bucket: BucketName): GetBucketReplicationRequest = {
    val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetBucketReplicationRequest]
  }
}

