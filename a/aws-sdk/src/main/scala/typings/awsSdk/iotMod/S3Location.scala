package typings.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait S3Location extends js.Object {
  /**
    * The S3 bucket.
    */
  var bucket: js.UndefOr[S3Bucket] = js.native
  /**
    * The S3 key.
    */
  var key: js.UndefOr[S3Key] = js.native
  /**
    * The S3 bucket version.
    */
  var version: js.UndefOr[S3Version] = js.native
}

object S3Location {
  @scala.inline
  def apply(bucket: S3Bucket = null, key: S3Key = null, version: S3Version = null): S3Location = {
    val __obj = js.Dynamic.literal()
    if (bucket != null) __obj.updateDynamic("bucket")(bucket.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (version != null) __obj.updateDynamic("version")(version.asInstanceOf[js.Any])
    __obj.asInstanceOf[S3Location]
  }
}

