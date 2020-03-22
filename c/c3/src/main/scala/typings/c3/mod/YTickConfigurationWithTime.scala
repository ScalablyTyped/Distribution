package typings.c3.mod

import typings.c3.AnonInterval
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait YTickConfigurationWithTime extends YTickConfiguration {
  var time: js.UndefOr[AnonInterval] = js.undefined
}

object YTickConfigurationWithTime {
  @scala.inline
  def apply(
    count: Int | Double = null,
    format: /* x */ Double => String | Double = null,
    outer: js.UndefOr[Boolean] = js.undefined,
    rotate: Int | Double = null,
    time: AnonInterval = null,
    values: js.Array[Double | String] = null
  ): YTickConfigurationWithTime = {
    val __obj = js.Dynamic.literal()
    if (count != null) __obj.updateDynamic("count")(count.asInstanceOf[js.Any])
    if (format != null) __obj.updateDynamic("format")(js.Any.fromFunction1(format))
    if (!js.isUndefined(outer)) __obj.updateDynamic("outer")(outer.asInstanceOf[js.Any])
    if (rotate != null) __obj.updateDynamic("rotate")(rotate.asInstanceOf[js.Any])
    if (time != null) __obj.updateDynamic("time")(time.asInstanceOf[js.Any])
    if (values != null) __obj.updateDynamic("values")(values.asInstanceOf[js.Any])
    __obj.asInstanceOf[YTickConfigurationWithTime]
  }
}

