package typings.c3.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait YTickConfiguration extends TickConfiguration {
  /**
    * A function to format y-axis tick values.
    */
  var format: js.UndefOr[js.Function1[/* x */ Double, String | Double]] = js.undefined
}

object YTickConfiguration {
  @scala.inline
  def apply(
    count: js.UndefOr[Double] = js.undefined,
    format: /* x */ Double => String | Double = null,
    outer: js.UndefOr[Boolean] = js.undefined,
    rotate: js.UndefOr[Double] = js.undefined,
    values: js.Array[Double | String] = null
  ): YTickConfiguration = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(count)) __obj.updateDynamic("count")(count.get.asInstanceOf[js.Any])
    if (format != null) __obj.updateDynamic("format")(js.Any.fromFunction1(format))
    if (!js.isUndefined(outer)) __obj.updateDynamic("outer")(outer.get.asInstanceOf[js.Any])
    if (!js.isUndefined(rotate)) __obj.updateDynamic("rotate")(rotate.get.asInstanceOf[js.Any])
    if (values != null) __obj.updateDynamic("values")(values.asInstanceOf[js.Any])
    __obj.asInstanceOf[YTickConfiguration]
  }
}

