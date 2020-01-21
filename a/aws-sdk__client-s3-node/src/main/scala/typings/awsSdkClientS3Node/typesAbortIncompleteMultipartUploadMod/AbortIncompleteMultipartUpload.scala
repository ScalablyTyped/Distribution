package typings.awsSdkClientS3Node.typesAbortIncompleteMultipartUploadMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AbortIncompleteMultipartUpload extends js.Object {
  /**
    * <p>Indicates the number of days that must pass since initiation for Lifecycle to abort an Incomplete Multipart Upload.</p>
    */
  var DaysAfterInitiation: js.UndefOr[Double] = js.undefined
}

object AbortIncompleteMultipartUpload {
  @scala.inline
  def apply(DaysAfterInitiation: Int | Double = null): AbortIncompleteMultipartUpload = {
    val __obj = js.Dynamic.literal()
    if (DaysAfterInitiation != null) __obj.updateDynamic("DaysAfterInitiation")(DaysAfterInitiation.asInstanceOf[js.Any])
    __obj.asInstanceOf[AbortIncompleteMultipartUpload]
  }
}

