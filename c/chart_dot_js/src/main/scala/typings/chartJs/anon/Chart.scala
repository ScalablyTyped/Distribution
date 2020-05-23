package typings.chartJs.anon

import typings.chartJs.mod.ChartDataSets
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Chart extends js.Object {
  var chart: js.UndefOr[typings.chartJs.mod.Chart] = js.undefined
  var dataIndex: js.UndefOr[Double] = js.undefined
  var dataset: js.UndefOr[ChartDataSets] = js.undefined
  var datasetIndex: js.UndefOr[Double] = js.undefined
}

object Chart {
  @scala.inline
  def apply(
    chart: typings.chartJs.mod.Chart = null,
    dataIndex: js.UndefOr[Double] = js.undefined,
    dataset: ChartDataSets = null,
    datasetIndex: js.UndefOr[Double] = js.undefined
  ): Chart = {
    val __obj = js.Dynamic.literal()
    if (chart != null) __obj.updateDynamic("chart")(chart.asInstanceOf[js.Any])
    if (!js.isUndefined(dataIndex)) __obj.updateDynamic("dataIndex")(dataIndex.get.asInstanceOf[js.Any])
    if (dataset != null) __obj.updateDynamic("dataset")(dataset.asInstanceOf[js.Any])
    if (!js.isUndefined(datasetIndex)) __obj.updateDynamic("datasetIndex")(datasetIndex.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Chart]
  }
}

