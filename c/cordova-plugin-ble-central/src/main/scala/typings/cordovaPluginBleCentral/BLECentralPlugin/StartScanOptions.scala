package typings.cordovaPluginBleCentral.BLECentralPlugin

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StartScanOptions extends js.Object {
  var reportDuplicates: js.UndefOr[Boolean] = js.undefined
}

object StartScanOptions {
  @scala.inline
  def apply(reportDuplicates: js.UndefOr[Boolean] = js.undefined): StartScanOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(reportDuplicates)) __obj.updateDynamic("reportDuplicates")(reportDuplicates.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[StartScanOptions]
  }
}

