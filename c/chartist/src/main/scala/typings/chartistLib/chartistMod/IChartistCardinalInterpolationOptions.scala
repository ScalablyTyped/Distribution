package typings
package chartistLib.chartistMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IChartistCardinalInterpolationOptions extends IChartistInterpolationOptions {
  var tension: js.UndefOr[scala.Double] = js.undefined
}

object IChartistCardinalInterpolationOptions {
  @scala.inline
  def apply(fillHoles: js.UndefOr[scala.Boolean] = js.undefined, tension: scala.Int | scala.Double = null): IChartistCardinalInterpolationOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(fillHoles)) __obj.updateDynamic("fillHoles")(fillHoles)
    if (tension != null) __obj.updateDynamic("tension")(tension.asInstanceOf[js.Any])
    __obj.asInstanceOf[IChartistCardinalInterpolationOptions]
  }
}

