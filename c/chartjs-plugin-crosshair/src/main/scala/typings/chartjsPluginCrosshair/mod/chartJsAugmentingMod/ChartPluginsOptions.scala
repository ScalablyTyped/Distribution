package typings.chartjsPluginCrosshair.mod.chartJsAugmentingMod

import typings.chartjsPluginCrosshair.mod.CrosshairOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChartPluginsOptions extends js.Object {
  var crosshair: js.UndefOr[CrosshairOptions] = js.undefined
}

object ChartPluginsOptions {
  @scala.inline
  def apply(crosshair: CrosshairOptions = null): ChartPluginsOptions = {
    val __obj = js.Dynamic.literal()
    if (crosshair != null) __obj.updateDynamic("crosshair")(crosshair.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChartPluginsOptions]
  }
}

