package typings.chartist.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IChartistSimpleInterpolationOptions extends IChartistInterpolationOptions {
  var divisor: js.UndefOr[Double] = js.undefined
}

object IChartistSimpleInterpolationOptions {
  @scala.inline
  def apply(divisor: Int | Double = null, fillHoles: js.UndefOr[Boolean] = js.undefined): IChartistSimpleInterpolationOptions = {
    val __obj = js.Dynamic.literal()
    if (divisor != null) __obj.updateDynamic("divisor")(divisor.asInstanceOf[js.Any])
    if (!js.isUndefined(fillHoles)) __obj.updateDynamic("fillHoles")(fillHoles.asInstanceOf[js.Any])
    __obj.asInstanceOf[IChartistSimpleInterpolationOptions]
  }
}

