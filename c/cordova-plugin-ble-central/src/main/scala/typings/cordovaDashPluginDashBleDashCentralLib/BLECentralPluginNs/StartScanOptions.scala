package typings
package cordovaDashPluginDashBleDashCentralLib.BLECentralPluginNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StartScanOptions extends js.Object {
  var reportDuplicates: js.UndefOr[scala.Boolean] = js.undefined
}

object StartScanOptions {
  @scala.inline
  def apply(reportDuplicates: js.UndefOr[scala.Boolean] = js.undefined): StartScanOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(reportDuplicates)) __obj.updateDynamic("reportDuplicates")(reportDuplicates)
    __obj.asInstanceOf[StartScanOptions]
  }
}

