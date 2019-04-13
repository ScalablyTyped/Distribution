package typings
package chartistLib.chartistMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IChartistSimpleInterpolationOptions extends IChartistInterpolationOptions {
  var divisor: js.UndefOr[scala.Double] = js.undefined
}

object IChartistSimpleInterpolationOptions {
  @scala.inline
  def apply(divisor: scala.Int | scala.Double = null, fillHoles: js.UndefOr[scala.Boolean] = js.undefined): IChartistSimpleInterpolationOptions = {
    val __obj = js.Dynamic.literal()
    if (divisor != null) __obj.updateDynamic("divisor")(divisor.asInstanceOf[js.Any])
    if (!js.isUndefined(fillHoles)) __obj.updateDynamic("fillHoles")(fillHoles)
    __obj.asInstanceOf[IChartistSimpleInterpolationOptions]
  }
}

