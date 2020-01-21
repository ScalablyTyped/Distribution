package typings.awsSdk.elasticbeanstalkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateStorageLocationResultMessage extends js.Object {
  /**
    * The name of the Amazon S3 bucket created.
    */
  var S3Bucket: js.UndefOr[typings.awsSdk.elasticbeanstalkMod.S3Bucket] = js.native
}

object CreateStorageLocationResultMessage {
  @scala.inline
  def apply(S3Bucket: S3Bucket = null): CreateStorageLocationResultMessage = {
    val __obj = js.Dynamic.literal()
    if (S3Bucket != null) __obj.updateDynamic("S3Bucket")(S3Bucket.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateStorageLocationResultMessage]
  }
}

