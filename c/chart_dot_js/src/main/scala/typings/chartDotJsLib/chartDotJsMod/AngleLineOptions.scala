package typings
package chartDotJsLib.chartDotJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AngleLineOptions extends js.Object {
  var color: js.UndefOr[ChartColor] = js.undefined
  var display: js.UndefOr[scala.Boolean] = js.undefined
  var lineWidth: js.UndefOr[scala.Double] = js.undefined
}

object AngleLineOptions {
  @scala.inline
  def apply(
    color: ChartColor = null,
    display: js.UndefOr[scala.Boolean] = js.undefined,
    lineWidth: scala.Int | scala.Double = null
  ): AngleLineOptions = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (!js.isUndefined(display)) __obj.updateDynamic("display")(display)
    if (lineWidth != null) __obj.updateDynamic("lineWidth")(lineWidth.asInstanceOf[js.Any])
    __obj.asInstanceOf[AngleLineOptions]
  }
}

