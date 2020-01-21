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
    datasetIndex: Int | Double = null,
    index: Int | Double = null,
    label: String = null,
    value: String = null,
    x: Int | Double = null,
    xLabel: String | Double = null,
    y: Int | Double = null,
    yLabel: String | Double = null
  ): ChartTooltipItem = {
    val __obj = js.Dynamic.literal()
    if (datasetIndex != null) __obj.updateDynamic("datasetIndex")(datasetIndex.asInstanceOf[js.Any])
    if (index != null) __obj.updateDynamic("index")(index.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    if (x != null) __obj.updateDynamic("x")(x.asInstanceOf[js.Any])
    if (xLabel != null) __obj.updateDynamic("xLabel")(xLabel.asInstanceOf[js.Any])
    if (y != null) __obj.updateDynamic("y")(y.asInstanceOf[js.Any])
    if (yLabel != null) __obj.updateDynamic("yLabel")(yLabel.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChartTooltipItem]
  }
}

