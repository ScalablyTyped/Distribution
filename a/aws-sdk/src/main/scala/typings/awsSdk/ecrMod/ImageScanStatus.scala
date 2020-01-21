package typings.awsSdk.ecrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ImageScanStatus extends js.Object {
  /**
    * The description of the image scan status.
    */
  var description: js.UndefOr[ScanStatusDescription] = js.native
  /**
    * The current state of an image scan.
    */
  var status: js.UndefOr[ScanStatus] = js.native
}

object ImageScanStatus {
  @scala.inline
  def apply(description: ScanStatusDescription = null, status: ScanStatus = null): ImageScanStatus = {
    val __obj = js.Dynamic.literal()
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImageScanStatus]
  }
}

