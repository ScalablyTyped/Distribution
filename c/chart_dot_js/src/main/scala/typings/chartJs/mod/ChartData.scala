package typings.chartJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChartData extends js.Object {
  var datasets: js.UndefOr[js.Array[ChartDataSets]] = js.undefined
  var labels: js.UndefOr[js.Array[String | js.Array[String]]] = js.undefined
}

object ChartData {
  @scala.inline
  def apply(datasets: js.Array[ChartDataSets] = null, labels: js.Array[String | js.Array[String]] = null): ChartData = {
    val __obj = js.Dynamic.literal()
    if (datasets != null) __obj.updateDynamic("datasets")(datasets.asInstanceOf[js.Any])
    if (labels != null) __obj.updateDynamic("labels")(labels.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChartData]
  }
}

