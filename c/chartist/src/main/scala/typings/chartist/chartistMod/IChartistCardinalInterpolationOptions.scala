package typings.chartist.chartistMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IChartistCardinalInterpolationOptions extends IChartistInterpolationOptions {
  var tension: js.UndefOr[Double] = js.undefined
}

object IChartistCardinalInterpolationOptions {
  @scala.inline
  def apply(fillHoles: js.UndefOr[Boolean] = js.undefined, tension: Int | Double = null): IChartistCardinalInterpolationOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(fillHoles)) __obj.updateDynamic("fillHoles")(fillHoles.asInstanceOf[js.Any])
    if (tension != null) __obj.updateDynamic("tension")(tension.asInstanceOf[js.Any])
    __obj.asInstanceOf[IChartistCardinalInterpolationOptions]
  }
}

