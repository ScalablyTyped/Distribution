package typings
package chartistLib.chartistMod.ChartistNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IChartistInterpolationOptions extends js.Object {
  var fillHoles: js.UndefOr[scala.Boolean] = js.undefined
}

object IChartistInterpolationOptions {
  @scala.inline
  def apply(fillHoles: js.UndefOr[scala.Boolean] = js.undefined): IChartistInterpolationOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(fillHoles)) __obj.updateDynamic("fillHoles")(fillHoles)
    __obj.asInstanceOf[IChartistInterpolationOptions]
  }
}

