package typings.chartist.mod

import typings.chartist.anon.X
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IChartistSeriesData extends js.Object {
  var className: js.UndefOr[String] = js.undefined
  var data: js.UndefOr[js.Array[Double | X]] = js.undefined
  var meta: js.UndefOr[js.Any] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var value: js.UndefOr[Double] = js.undefined
}

object IChartistSeriesData {
  @scala.inline
  def apply(
    className: String = null,
    data: js.Array[Double | X] = null,
    meta: js.Any = null,
    name: String = null,
    value: js.UndefOr[Double] = js.undefined
  ): IChartistSeriesData = {
    val __obj = js.Dynamic.literal()
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (meta != null) __obj.updateDynamic("meta")(meta.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (!js.isUndefined(value)) __obj.updateDynamic("value")(value.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[IChartistSeriesData]
  }
}

