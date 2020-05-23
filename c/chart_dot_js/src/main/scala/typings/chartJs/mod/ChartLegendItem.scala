package typings.chartJs.mod

import typings.chartJs.chartJsStrings.bevel
import typings.chartJs.chartJsStrings.butt
import typings.chartJs.chartJsStrings.miter
import typings.chartJs.chartJsStrings.round
import typings.chartJs.chartJsStrings.square
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
    index: js.UndefOr[Double] = js.undefined,
    lineCap: butt | round | square = null,
    lineDash: js.Array[Double] = null,
    lineDashOffset: js.UndefOr[Double] = js.undefined,
    lineJoin: bevel | round | miter = null,
    lineWidth: js.UndefOr[Double] = js.undefined,
    pointStyle: PointStyle = null,
    strokeStyle: String = null,
    text: String = null
  ): ChartLegendItem = {
    val __obj = js.Dynamic.literal()
    if (fillStyle != null) __obj.updateDynamic("fillStyle")(fillStyle.asInstanceOf[js.Any])
    if (!js.isUndefined(hidden)) __obj.updateDynamic("hidden")(hidden.get.asInstanceOf[js.Any])
    if (!js.isUndefined(index)) __obj.updateDynamic("index")(index.get.asInstanceOf[js.Any])
    if (lineCap != null) __obj.updateDynamic("lineCap")(lineCap.asInstanceOf[js.Any])
    if (lineDash != null) __obj.updateDynamic("lineDash")(lineDash.asInstanceOf[js.Any])
    if (!js.isUndefined(lineDashOffset)) __obj.updateDynamic("lineDashOffset")(lineDashOffset.get.asInstanceOf[js.Any])
    if (lineJoin != null) __obj.updateDynamic("lineJoin")(lineJoin.asInstanceOf[js.Any])
    if (!js.isUndefined(lineWidth)) __obj.updateDynamic("lineWidth")(lineWidth.get.asInstanceOf[js.Any])
    if (pointStyle != null) __obj.updateDynamic("pointStyle")(pointStyle.asInstanceOf[js.Any])
    if (strokeStyle != null) __obj.updateDynamic("strokeStyle")(strokeStyle.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChartLegendItem]
  }
}

