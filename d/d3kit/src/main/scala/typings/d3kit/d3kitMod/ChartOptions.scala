package typings.d3kit.d3kitMod

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
    initialHeight: Int | Double = null,
    initialWidth: Int | Double = null,
    margin: ChartMargin = null,
    offset: js.Tuple2[Double, Double] = null,
    pixelRatio: Int | Double = null
  ): ChartOptions = {
    val __obj = js.Dynamic.literal()
    if (initialHeight != null) __obj.updateDynamic("initialHeight")(initialHeight.asInstanceOf[js.Any])
    if (initialWidth != null) __obj.updateDynamic("initialWidth")(initialWidth.asInstanceOf[js.Any])
    if (margin != null) __obj.updateDynamic("margin")(margin.asInstanceOf[js.Any])
    if (offset != null) __obj.updateDynamic("offset")(offset.asInstanceOf[js.Any])
    if (pixelRatio != null) __obj.updateDynamic("pixelRatio")(pixelRatio.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChartOptions]
  }
}

