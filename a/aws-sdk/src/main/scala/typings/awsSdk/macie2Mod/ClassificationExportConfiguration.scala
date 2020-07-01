package typings.awsSdk.macie2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClassificationExportConfiguration extends js.Object {
  /**
    * The S3 bucket to store data classification results in, and the encryption settings to use when storing results in that bucket.
    */
  var s3Destination: js.UndefOr[S3Destination] = js.native
}

object ClassificationExportConfiguration {
  @scala.inline
  def apply(s3Destination: S3Destination = null): ClassificationExportConfiguration = {
    val __obj = js.Dynamic.literal()
    if (s3Destination != null) __obj.updateDynamic("s3Destination")(s3Destination.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClassificationExportConfiguration]
  }
}

