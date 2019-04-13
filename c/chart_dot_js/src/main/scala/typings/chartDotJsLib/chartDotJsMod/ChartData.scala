package typings
package chartDotJsLib.chartDotJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChartData extends js.Object {
  var datasets: js.UndefOr[js.Array[ChartDataSets]] = js.undefined
  var labels: js.UndefOr[js.Array[java.lang.String | js.Array[java.lang.String]]] = js.undefined
}

object ChartData {
  @scala.inline
  def apply(
    datasets: js.Array[ChartDataSets] = null,
    labels: js.Array[java.lang.String | js.Array[java.lang.String]] = null
  ): ChartData = {
    val __obj = js.Dynamic.literal()
    if (datasets != null) __obj.updateDynamic("datasets")(datasets)
    if (labels != null) __obj.updateDynamic("labels")(labels)
    __obj.asInstanceOf[ChartData]
  }
}

