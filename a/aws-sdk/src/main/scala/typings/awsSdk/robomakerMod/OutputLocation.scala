package typings.awsSdk.robomakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OutputLocation extends js.Object {
  /**
    * The S3 bucket for output.
    */
  var s3Bucket: js.UndefOr[S3Bucket] = js.native
  /**
    * The S3 folder in the s3Bucket where output files will be placed.
    */
  var s3Prefix: js.UndefOr[S3Key] = js.native
}

object OutputLocation {
  @scala.inline
  def apply(s3Bucket: S3Bucket = null, s3Prefix: S3Key = null): OutputLocation = {
    val __obj = js.Dynamic.literal()
    if (s3Bucket != null) __obj.updateDynamic("s3Bucket")(s3Bucket.asInstanceOf[js.Any])
    if (s3Prefix != null) __obj.updateDynamic("s3Prefix")(s3Prefix.asInstanceOf[js.Any])
    __obj.asInstanceOf[OutputLocation]
  }
}

