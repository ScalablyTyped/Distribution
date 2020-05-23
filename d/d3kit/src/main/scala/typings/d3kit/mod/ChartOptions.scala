package typings.d3kit.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChartOptions extends js.Object {
  var initialHeight: js.UndefOr[Double] = js.undefined
  var initialWidth: js.UndefOr[Double] = js.undefined
  var margin: js.UndefOr[ChartMargin] = js.undefined
  var offset: js.UndefOr[js.Tuple2[Double, Double]] = js.undefined
  var pixelRatio: js.UndefOr[Double] = js.undefined
}

object ChartOptions {
  @scala.inline
  def apply(
    initialHeight: js.UndefOr[Double] = js.undefined,
    initialWidth: js.UndefOr[Double] = js.undefined,
    margin: ChartMargin = null,
    offset: js.Tuple2[Double, Double] = null,
    pixelRatio: js.UndefOr[Double] = js.undefined
  ): ChartOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(initialHeight)) __obj.updateDynamic("initialHeight")(initialHeight.get.asInstanceOf[js.Any])
    if (!js.isUndefined(initialWidth)) __obj.updateDynamic("initialWidth")(initialWidth.get.asInstanceOf[js.Any])
    if (margin != null) __obj.updateDynamic("margin")(margin.asInstanceOf[js.Any])
    if (offset != null) __obj.updateDynamic("offset")(offset.asInstanceOf[js.Any])
    if (!js.isUndefined(pixelRatio)) __obj.updateDynamic("pixelRatio")(pixelRatio.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChartOptions]
  }
}

