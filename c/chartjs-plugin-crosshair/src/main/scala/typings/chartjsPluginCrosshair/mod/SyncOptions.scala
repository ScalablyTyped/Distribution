package typings.chartjsPluginCrosshair.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SyncOptions extends js.Object {
  var enabled: js.UndefOr[Boolean] = js.undefined
  var group: js.UndefOr[Double] = js.undefined
  var suppressTooltips: js.UndefOr[Boolean] = js.undefined
}

object SyncOptions {
  @scala.inline
  def apply(
    enabled: js.UndefOr[Boolean] = js.undefined,
    group: js.UndefOr[Double] = js.undefined,
    suppressTooltips: js.UndefOr[Boolean] = js.undefined
  ): SyncOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled.get.asInstanceOf[js.Any])
    if (!js.isUndefined(group)) __obj.updateDynamic("group")(group.get.asInstanceOf[js.Any])
    if (!js.isUndefined(suppressTooltips)) __obj.updateDynamic("suppressTooltips")(suppressTooltips.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[SyncOptions]
  }
}

