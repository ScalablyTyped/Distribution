package typings.awsSdk.ecrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ImageScanningConfiguration extends js.Object {
  /**
    * The setting that determines whether images are scanned after being pushed to a repository. If set to true, images will be scanned after being pushed. If this parameter is not specified, it will default to false and images will not be scanned unless a scan is manually started with the StartImageScan API.
    */
  var scanOnPush: js.UndefOr[ScanOnPushFlag] = js.native
}

object ImageScanningConfiguration {
  @scala.inline
  def apply(scanOnPush: js.UndefOr[Boolean] = js.undefined): ImageScanningConfiguration = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(scanOnPush)) __obj.updateDynamic("scanOnPush")(scanOnPush.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImageScanningConfiguration]
  }
}

