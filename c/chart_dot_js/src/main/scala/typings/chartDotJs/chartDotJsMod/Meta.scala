package typings.chartDotJs.chartDotJsMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Meta extends js.Object {
  @JSName("$filler")
  var $filler: js.UndefOr[StringDictionary[js.Any]] = js.undefined
  var controller: StringDictionary[js.Any]
  var data: js.Array[MetaData]
  var dataset: js.UndefOr[ChartDataSets] = js.undefined
  var hidden: js.UndefOr[Boolean] = js.undefined
  var total: js.UndefOr[String] = js.undefined
  var `type`: ChartType
  var xAxisID: js.UndefOr[String] = js.undefined
  var yAxisID: js.UndefOr[String] = js.undefined
}

object Meta {
  @scala.inline
  def apply(
    controller: StringDictionary[js.Any],
    data: js.Array[MetaData],
    `type`: ChartType,
    $filler: StringDictionary[js.Any] = null,
    dataset: ChartDataSets = null,
    hidden: js.UndefOr[Boolean] = js.undefined,
    total: String = null,
    xAxisID: String = null,
    yAxisID: String = null
  ): Meta = {
    val __obj = js.Dynamic.literal(controller = controller.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if ($filler != null) __obj.updateDynamic("$filler")($filler.asInstanceOf[js.Any])
    if (dataset != null) __obj.updateDynamic("dataset")(dataset.asInstanceOf[js.Any])
    if (!js.isUndefined(hidden)) __obj.updateDynamic("hidden")(hidden.asInstanceOf[js.Any])
    if (total != null) __obj.updateDynamic("total")(total.asInstanceOf[js.Any])
    if (xAxisID != null) __obj.updateDynamic("xAxisID")(xAxisID.asInstanceOf[js.Any])
    if (yAxisID != null) __obj.updateDynamic("yAxisID")(yAxisID.asInstanceOf[js.Any])
    __obj.asInstanceOf[Meta]
  }
}

