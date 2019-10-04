package typings.chartDotJs.chartDotJsMod

import typings.chartDotJs.chartDotJsStrings.bevel
import typings.chartDotJs.chartDotJsStrings.butt
import typings.chartDotJs.chartDotJsStrings.miter
import typings.chartDotJs.chartDotJsStrings.round
import typings.chartDotJs.chartDotJsStrings.square
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChartLegendItem extends js.Object {
  var fillStyle: js.UndefOr[String] = js.undefined
  var hidden: js.UndefOr[Boolean] = js.undefined
  var index: js.UndefOr[Double] = js.undefined
  var lineCap: js.UndefOr[butt | round | square] = js.undefined
  var lineDash: js.UndefOr[js.Array[Double]] = js.undefined
  var lineDashOffset: js.UndefOr[Double] = js.undefined
  var lineJoin: js.UndefOr[bevel | round | miter] = js.undefined
  var lineWidth: js.UndefOr[Double] = js.undefined
  var pointStyle: js.UndefOr[PointStyle] = js.undefined
  var strokeStyle: js.UndefOr[String] = js.undefined
  var text: js.UndefOr[String] = js.undefined
}

object ChartLegendItem {
  @scala.inline
  def apply(
    fillStyle: String = null,
    hidden: js.UndefOr[Boolean] = js.undefined,
    index: Int | Double = null,
    lineCap: butt | round | square = null,
    lineDash: js.Array[Double] = null,
    lineDashOffset: Int | Double = null,
    lineJoin: bevel | round | miter = null,
    lineWidth: Int | Double = null,
    pointStyle: PointStyle = null,
    strokeStyle: String = null,
    text: String = null
  ): ChartLegendItem = {
    val __obj = js.Dynamic.literal()
    if (fillStyle != null) __obj.updateDynamic("fillStyle")(fillStyle)
    if (!js.isUndefined(hidden)) __obj.updateDynamic("hidden")(hidden)
    if (index != null) __obj.updateDynamic("index")(index.asInstanceOf[js.Any])
    if (lineCap != null) __obj.updateDynamic("lineCap")(lineCap.asInstanceOf[js.Any])
    if (lineDash != null) __obj.updateDynamic("lineDash")(lineDash)
    if (lineDashOffset != null) __obj.updateDynamic("lineDashOffset")(lineDashOffset.asInstanceOf[js.Any])
    if (lineJoin != null) __obj.updateDynamic("lineJoin")(lineJoin.asInstanceOf[js.Any])
    if (lineWidth != null) __obj.updateDynamic("lineWidth")(lineWidth.asInstanceOf[js.Any])
    if (pointStyle != null) __obj.updateDynamic("pointStyle")(pointStyle)
    if (strokeStyle != null) __obj.updateDynamic("strokeStyle")(strokeStyle)
    if (text != null) __obj.updateDynamic("text")(text)
    __obj.asInstanceOf[ChartLegendItem]
  }
}

