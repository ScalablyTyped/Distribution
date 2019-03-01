package typings
package chartDotJsLib.chartDotJsMod.ChartNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChartRectangleOptions extends js.Object {
  var backgroundColor: js.UndefOr[ChartColor] = js.undefined
  var borderColor: js.UndefOr[ChartColor] = js.undefined
  var borderSkipped: js.UndefOr[java.lang.String] = js.undefined
  var borderWidth: js.UndefOr[scala.Double] = js.undefined
}

object ChartRectangleOptions {
  @scala.inline
  def apply(
    backgroundColor: ChartColor = null,
    borderColor: ChartColor = null,
    borderSkipped: java.lang.String = null,
    borderWidth: scala.Int | scala.Double = null
  ): ChartRectangleOptions = {
    val __obj = js.Dynamic.literal()
    if (backgroundColor != null) __obj.updateDynamic("backgroundColor")(backgroundColor.asInstanceOf[js.Any])
    if (borderColor != null) __obj.updateDynamic("borderColor")(borderColor.asInstanceOf[js.Any])
    if (borderSkipped != null) __obj.updateDynamic("borderSkipped")(borderSkipped)
    if (borderWidth != null) __obj.updateDynamic("borderWidth")(borderWidth.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChartRectangleOptions]
  }
}

