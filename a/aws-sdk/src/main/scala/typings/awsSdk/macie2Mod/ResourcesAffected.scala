package typings.awsSdk.macie2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ResourcesAffected extends js.Object {
  /**
    * An array of objects, one for each S3 bucket that the finding applies to. Each object provides a set of metadata about an affected S3 bucket.
    */
  var s3Bucket: js.UndefOr[S3Bucket] = js.native
  /**
    * An array of objects, one for each S3 object that the finding applies to. Each object provides a set of metadata about an affected S3 object.
    */
  var s3Object: js.UndefOr[S3Object] = js.native
}

object ResourcesAffected {
  @scala.inline
  def apply(s3Bucket: S3Bucket = null, s3Object: S3Object = null): ResourcesAffected = {
    val __obj = js.Dynamic.literal()
    if (s3Bucket != null) __obj.updateDynamic("s3Bucket")(s3Bucket.asInstanceOf[js.Any])
    if (s3Object != null) __obj.updateDynamic("s3Object")(s3Object.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResourcesAffected]
  }
}

