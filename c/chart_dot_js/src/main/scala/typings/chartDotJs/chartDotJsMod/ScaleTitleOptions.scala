package typings.chartDotJs.chartDotJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ScaleTitleOptions extends js.Object {
  var display: js.UndefOr[Boolean] = js.undefined
  var fontColor: js.UndefOr[ChartColor] = js.undefined
  var fontFamily: js.UndefOr[String] = js.undefined
  var fontSize: js.UndefOr[Double] = js.undefined
  var fontStyle: js.UndefOr[String] = js.undefined
  var labelString: js.UndefOr[String] = js.undefined
  var lineHeight: js.UndefOr[Double | String] = js.undefined
  var padding: js.UndefOr[ChartLayoutPaddingObject | Double] = js.undefined
}

object ScaleTitleOptions {
  @scala.inline
  def apply(
    display: js.UndefOr[Boolean] = js.undefined,
    fontColor: ChartColor = null,
    fontFamily: String = null,
    fontSize: Int | Double = null,
    fontStyle: String = null,
    labelString: String = null,
    lineHeight: Double | String = null,
    padding: ChartLayoutPaddingObject | Double = null
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

