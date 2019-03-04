package typings
package chartDotJsLib.chartDotJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Meta extends js.Object {
  @JSName("$filler")
  var $filler: js.UndefOr[org.scalablytyped.runtime.StringDictionary[js.Any]] = js.undefined
  var controller: org.scalablytyped.runtime.StringDictionary[js.Any]
  var data: js.Array[MetaData]
  var dataset: js.UndefOr[chartDotJsLib.chartDotJsMod.ChartNs.ChartDataSets] = js.undefined
  var hidden: js.UndefOr[scala.Boolean] = js.undefined
  var total: js.UndefOr[java.lang.String] = js.undefined
  var `type`: chartDotJsLib.chartDotJsMod.ChartNs.ChartType
  var xAxisID: js.UndefOr[java.lang.String] = js.undefined
  var yAxisID: js.UndefOr[java.lang.String] = js.undefined
}

object Meta {
  @scala.inline
  def apply(
    controller: org.scalablytyped.runtime.StringDictionary[js.Any],
    data: js.Array[MetaData],
    `type`: chartDotJsLib.chartDotJsMod.ChartNs.ChartType,
    $filler: org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    dataset: chartDotJsLib.chartDotJsMod.ChartNs.ChartDataSets = null,
    hidden: js.UndefOr[scala.Boolean] = js.undefined,
    total: java.lang.String = null,
    xAxisID: java.lang.String = null,
    yAxisID: java.lang.String = null
  ): Meta = {
    val __obj = js.Dynamic.literal(controller = controller, data = data)
    __obj.updateDynamic("type")(`type`)
    if ($filler != null) __obj.updateDynamic("$filler")($filler)
    if (dataset != null) __obj.updateDynamic("dataset")(dataset)
    if (!js.isUndefined(hidden)) __obj.updateDynamic("hidden")(hidden)
    if (total != null) __obj.updateDynamic("total")(total)
    if (xAxisID != null) __obj.updateDynamic("xAxisID")(xAxisID)
    if (yAxisID != null) __obj.updateDynamic("yAxisID")(yAxisID)
    __obj.asInstanceOf[Meta]
  }
}

