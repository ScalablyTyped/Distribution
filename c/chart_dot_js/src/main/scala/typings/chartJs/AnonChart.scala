package typings.chartJs

import typings.chartJs.mod.Chart
import typings.chartJs.mod.ChartDataSets
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonChart extends js.Object {
  var chart: js.UndefOr[Chart] = js.undefined
  var dataIndex: js.UndefOr[Double] = js.undefined
  var dataset: js.UndefOr[ChartDataSets] = js.undefined
  var datasetIndex: js.UndefOr[Double] = js.undefined
}

object AnonChart {
  @scala.inline
  def apply(
    chart: Chart = null,
    dataIndex: Int | Double = null,
    dataset: ChartDataSets = null,
    datasetIndex: Int | Double = null
  ): AnonChart = {
    val __obj = js.Dynamic.literal()
    if (chart != null) __obj.updateDynamic("chart")(chart.asInstanceOf[js.Any])
    if (dataIndex != null) __obj.updateDynamic("dataIndex")(dataIndex.asInstanceOf[js.Any])
    if (dataset != null) __obj.updateDynamic("dataset")(dataset.asInstanceOf[js.Any])
    if (datasetIndex != null) __obj.updateDynamic("datasetIndex")(datasetIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonChart]
  }
}

