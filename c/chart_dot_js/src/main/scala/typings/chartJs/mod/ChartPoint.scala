package typings.chartJs.mod

import typings.moment.mod.Moment
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChartPoint extends js.Object {
  var r: js.UndefOr[Double] = js.undefined
  var t: js.UndefOr[Double | String | Date | Moment] = js.undefined
  var x: js.UndefOr[Double | String | Date | Moment] = js.undefined
  var y: js.UndefOr[Double | String | Date | Moment] = js.undefined
}

object ChartPoint {
  @scala.inline
  def apply(
    r: js.UndefOr[Double] = js.undefined,
    t: Double | String | Date | Moment = null,
    x: Double | String | Date | Moment = null,
    y: Double | String | Date | Moment = null
  ): ChartPoint = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(r)) __obj.updateDynamic("r")(r.get.asInstanceOf[js.Any])
    if (t != null) __obj.updateDynamic("t")(t.asInstanceOf[js.Any])
    if (x != null) __obj.updateDynamic("x")(x.asInstanceOf[js.Any])
    if (y != null) __obj.updateDynamic("y")(y.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChartPoint]
  }
}

