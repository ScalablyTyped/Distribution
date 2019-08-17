package typings.atAwsDashSdkClientDashS3DashBrowser.typesUnderscoreAbortIncompleteMultipartUploadMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _AbortIncompleteMultipartUpload extends js.Object {
  /**
    * <p>Indicates the number of days that must pass since initiation for Lifecycle to abort an Incomplete Multipart Upload.</p>
    */
  var DaysAfterInitiation: js.UndefOr[Double] = js.undefined
}

object _AbortIncompleteMultipartUpload {
  @scala.inline
  def apply(DaysAfterInitiation: Int | Double = null): _AbortIncompleteMultipartUpload = {
    val __obj = js.Dynamic.literal()
    if (DaysAfterInitiation != null) __obj.updateDynamic("DaysAfterInitiation")(DaysAfterInitiation.asInstanceOf[js.Any])
    __obj.asInstanceOf[_AbortIncompleteMultipartUpload]
  }
}

