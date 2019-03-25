package typings
package chartDotJsLib.chartDotJsMod.ChartNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ScaleTitleOptions extends js.Object {
  var display: js.UndefOr[scala.Boolean] = js.undefined
  var fontColor: js.UndefOr[ChartColor] = js.undefined
  var fontFamily: js.UndefOr[java.lang.String] = js.undefined
  var fontSize: js.UndefOr[scala.Double] = js.undefined
  var fontStyle: js.UndefOr[java.lang.String] = js.undefined
  var labelString: js.UndefOr[java.lang.String] = js.undefined
  var lineHeight: js.UndefOr[scala.Double | java.lang.String] = js.undefined
  var padding: js.UndefOr[ChartLayoutPaddingObject | scala.Double] = js.undefined
}

object ScaleTitleOptions {
  @scala.inline
  def apply(
    display: js.UndefOr[scala.Boolean] = js.undefined,
    fontColor: ChartColor = null,
    fontFamily: java.lang.String = null,
    fontSize: scala.Int | scala.Double = null,
    fontStyle: java.lang.String = null,
    labelString: java.lang.String = null,
    lineHeight: scala.Double | java.lang.String = null,
    padding: ChartLayoutPaddingObject | scala.Double = null
  ): ScaleTitleOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(display)) __obj.updateDynamic("display")(display)
    if (fontColor != null) __obj.updateDynamic("fontColor")(fontColor.asInstanceOf[js.Any])
    if (fontFamily != null) __obj.updateDynamic("fontFamily")(fontFamily)
    if (fontSize != null) __obj.updateDynamic("fontSize")(fontSize.asInstanceOf[js.Any])
    if (fontStyle != null) __obj.updateDynamic("fontStyle")(fontStyle)
    if (labelString != null) __obj.updateDynamic("labelString")(labelString)
    if (lineHeight != null) __obj.updateDynamic("lineHeight")(lineHeight.asInstanceOf[js.Any])
    if (padding != null) __obj.updateDynamic("padding")(padding.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScaleTitleOptions]
  }
}

