package typings.c3.mod

import typings.c3.anon.Interval
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait YTickConfigurationWithTime extends YTickConfiguration {
  var time: js.UndefOr[Interval] = js.undefined
}

object YTickConfigurationWithTime {
  @scala.inline
  def apply(
    count: js.UndefOr[Double] = js.undefined,
    format: /* x */ Double => String | Double = null,
    outer: js.UndefOr[Boolean] = js.undefined,
    rotate: js.UndefOr[Double] = js.undefined,
    time: Interval = null,
    values: js.Array[Double | String] = null
  ): YTickConfigurationWithTime = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(count)) __obj.updateDynamic("count")(count.get.asInstanceOf[js.Any])
    if (format != null) __obj.updateDynamic("format")(js.Any.fromFunction1(format))
    if (!js.isUndefined(outer)) __obj.updateDynamic("outer")(outer.get.asInstanceOf[js.Any])
    if (!js.isUndefined(rotate)) __obj.updateDynamic("rotate")(rotate.get.asInstanceOf[js.Any])
    if (time != null) __obj.updateDynamic("time")(time.asInstanceOf[js.Any])
    if (values != null) __obj.updateDynamic("values")(values.asInstanceOf[js.Any])
    __obj.asInstanceOf[YTickConfigurationWithTime]
  }
}

