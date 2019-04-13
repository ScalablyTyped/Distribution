package typings
package chartistLib.chartistMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IChartistSeriesData extends js.Object {
  var className: js.UndefOr[java.lang.String] = js.undefined
  var data: js.UndefOr[js.Array[scala.Double]] = js.undefined
  var meta: js.UndefOr[js.Any] = js.undefined
  var name: js.UndefOr[java.lang.String] = js.undefined
  var value: js.UndefOr[scala.Double] = js.undefined
}

object IChartistSeriesData {
  @scala.inline
  def apply(
    className: java.lang.String = null,
    data: js.Array[scala.Double] = null,
    meta: js.Any = null,
    name: java.lang.String = null,
    value: scala.Int | scala.Double = null
  ): IChartistSeriesData = {
    val __obj = js.Dynamic.literal()
    if (className != null) __obj.updateDynamic("className")(className)
    if (data != null) __obj.updateDynamic("data")(data)
    if (meta != null) __obj.updateDynamic("meta")(meta)
    if (name != null) __obj.updateDynamic("name")(name)
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[IChartistSeriesData]
  }
}

