package typings.awsSdk.smsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait S3Location extends js.Object {
  /**
    * Amazon S3 bucket name.
    */
  var bucket: js.UndefOr[BucketName] = js.native
  /**
    * Amazon S3 bucket key.
    */
  var key: js.UndefOr[KeyName] = js.native
}

object S3Location {
  @scala.inline
  def apply(bucket: BucketName = null, key: KeyName = null): S3Location = {
    val __obj = js.Dynamic.literal()
    if (bucket != null) __obj.updateDynamic("bucket")(bucket.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    __obj.asInstanceOf[S3Location]
  }
}

