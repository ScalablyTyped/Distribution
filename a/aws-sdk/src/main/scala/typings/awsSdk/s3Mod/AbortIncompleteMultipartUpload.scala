package typings.awsSdk.s3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AbortIncompleteMultipartUpload extends js.Object {
  /**
    * Specifies the number of days after which Amazon S3 aborts an incomplete multipart upload.
    */
  var DaysAfterInitiation: js.UndefOr[typings.awsSdk.s3Mod.DaysAfterInitiation] = js.native
}

object AbortIncompleteMultipartUpload {
  @scala.inline
  def apply(DaysAfterInitiation: js.UndefOr[DaysAfterInitiation] = js.undefined): AbortIncompleteMultipartUpload = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(DaysAfterInitiation)) __obj.updateDynamic("DaysAfterInitiation")(DaysAfterInitiation.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[AbortIncompleteMultipartUpload]
  }
}

