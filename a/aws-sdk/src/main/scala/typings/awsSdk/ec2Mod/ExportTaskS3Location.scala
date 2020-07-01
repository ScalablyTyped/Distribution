package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExportTaskS3Location extends js.Object {
  /**
    * The destination Amazon S3 bucket.
    */
  var S3Bucket: js.UndefOr[String] = js.native
  /**
    * The prefix (logical hierarchy) in the bucket.
    */
  var S3Prefix: js.UndefOr[String] = js.native
}

object ExportTaskS3Location {
  @scala.inline
  def apply(S3Bucket: String = null, S3Prefix: String = null): ExportTaskS3Location = {
    val __obj = js.Dynamic.literal()
    if (S3Bucket != null) __obj.updateDynamic("S3Bucket")(S3Bucket.asInstanceOf[js.Any])
    if (S3Prefix != null) __obj.updateDynamic("S3Prefix")(S3Prefix.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExportTaskS3Location]
  }
}

