package typings.c3.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AxisGridOptions extends js.Object {
  /**
    * Show additional grid lines along x axis.
    * If x axis is `category` axis, value can be category name. If x axis is `timeseries` axis, value can be date string, `Date` object and unixtime integer.
    */
  var lines: js.UndefOr[js.Array[GridLineOptions]] = js.undefined
  /**
    * Show grids along an axis.
    */
  var show: js.UndefOr[Boolean] = js.undefined
  /** Not used. */
  var `type`: js.UndefOr[String] = js.undefined
}

object AxisGridOptions {
  @scala.inline
  def apply(
    lines: js.Array[GridLineOptions] = null,
    show: js.UndefOr[Boolean] = js.undefined,
    `type`: String = null
  ): AxisGridOptions = {
    val __obj = js.Dynamic.literal()
    if (lines != null) __obj.updateDynamic("lines")(lines.asInstanceOf[js.Any])
    if (!js.isUndefined(show)) __obj.updateDynamic("show")(show.get.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AxisGridOptions]
  }
}

