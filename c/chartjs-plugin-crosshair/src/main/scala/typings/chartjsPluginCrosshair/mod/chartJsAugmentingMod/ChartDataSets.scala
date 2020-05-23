package typings.chartjsPluginCrosshair.mod.chartJsAugmentingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChartDataSets extends js.Object {
  var interpolate: js.UndefOr[Boolean] = js.undefined
}

object ChartDataSets {
  @scala.inline
  def apply(interpolate: js.UndefOr[Boolean] = js.undefined): ChartDataSets = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(interpolate)) __obj.updateDynamic("interpolate")(interpolate.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChartDataSets]
  }
}

