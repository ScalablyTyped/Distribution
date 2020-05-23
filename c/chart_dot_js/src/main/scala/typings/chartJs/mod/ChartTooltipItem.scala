package typings.chartJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChartTooltipItem extends js.Object {
  var datasetIndex: js.UndefOr[Double] = js.undefined
  var index: js.UndefOr[Double] = js.undefined
  var label: js.UndefOr[String] = js.undefined
  var value: js.UndefOr[String] = js.undefined
  var x: js.UndefOr[Double] = js.undefined
  var xLabel: js.UndefOr[String | Double] = js.undefined
  var y: js.UndefOr[Double] = js.undefined
  var yLabel: js.UndefOr[String | Double] = js.undefined
}

object ChartTooltipItem {
  @scala.inline
  def apply(
    datasetIndex: js.UndefOr[Double] = js.undefined,
    index: js.UndefOr[Double] = js.undefined,
    label: String = null,
    value: String = null,
    x: js.UndefOr[Double] = js.undefined,
    xLabel: String | Double = null,
    y: js.UndefOr[Double] = js.undefined,
    yLabel: String | Double = null
  ): ChartTooltipItem = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(datasetIndex)) __obj.updateDynamic("datasetIndex")(datasetIndex.get.asInstanceOf[js.Any])
    if (!js.isUndefined(index)) __obj.updateDynamic("index")(index.get.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    if (!js.isUndefined(x)) __obj.updateDynamic("x")(x.get.asInstanceOf[js.Any])
    if (xLabel != null) __obj.updateDynamic("xLabel")(xLabel.asInstanceOf[js.Any])
    if (!js.isUndefined(y)) __obj.updateDynamic("y")(y.get.asInstanceOf[js.Any])
    if (yLabel != null) __obj.updateDynamic("yLabel")(yLabel.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChartTooltipItem]
  }
}

