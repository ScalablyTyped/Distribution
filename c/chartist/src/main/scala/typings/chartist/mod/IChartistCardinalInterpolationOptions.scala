package typings.chartist.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IChartistCardinalInterpolationOptions extends IChartistInterpolationOptions {
  var tension: js.UndefOr[Double] = js.undefined
}

object IChartistCardinalInterpolationOptions {
  @scala.inline
  def apply(fillHoles: js.UndefOr[Boolean] = js.undefined, tension: js.UndefOr[Double] = js.undefined): IChartistCardinalInterpolationOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(fillHoles)) __obj.updateDynamic("fillHoles")(fillHoles.get.asInstanceOf[js.Any])
    if (!js.isUndefined(tension)) __obj.updateDynamic("tension")(tension.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[IChartistCardinalInterpolationOptions]
  }
}

