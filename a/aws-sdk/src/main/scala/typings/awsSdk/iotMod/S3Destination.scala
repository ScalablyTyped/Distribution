package typings.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait S3Destination extends js.Object {
  /**
    * The S3 bucket that contains the updated firmware.
    */
  var bucket: js.UndefOr[S3Bucket] = js.native
  /**
    * The S3 prefix.
    */
  var prefix: js.UndefOr[Prefix] = js.native
}

object S3Destination {
  @scala.inline
  def apply(bucket: S3Bucket = null, prefix: Prefix = null): S3Destination = {
    val __obj = js.Dynamic.literal()
    if (bucket != null) __obj.updateDynamic("bucket")(bucket.asInstanceOf[js.Any])
    if (prefix != null) __obj.updateDynamic("prefix")(prefix.asInstanceOf[js.Any])
    __obj.asInstanceOf[S3Destination]
  }
}

