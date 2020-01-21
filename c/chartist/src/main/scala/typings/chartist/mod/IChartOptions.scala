package typings.chartist.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IChartOptions extends js.Object {
  var plugins: js.UndefOr[js.Array[_]] = js.undefined
  /**
    * If true the whole data is reversed including labels, the series order as well as the whole series data arrays.
    */
  var reverseData: js.UndefOr[Boolean] = js.undefined
}

object IChartOptions {
  @scala.inline
  def apply(plugins: js.Array[_] = null, reverseData: js.UndefOr[Boolean] = js.undefined): IChartOptions = {
    val __obj = js.Dynamic.literal()
    if (plugins != null) __obj.updateDynamic("plugins")(plugins.asInstanceOf[js.Any])
    if (!js.isUndefined(reverseData)) __obj.updateDynamic("reverseData")(reverseData.asInstanceOf[js.Any])
    __obj.asInstanceOf[IChartOptions]
  }
}

