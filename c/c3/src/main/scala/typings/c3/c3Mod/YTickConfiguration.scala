package typings.c3.c3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait YTickConfiguration extends js.Object {
  /**
    * The number of y axis ticks to show.
    * The position of the ticks will be calculated precisely, so the values on the ticks will not be rounded nicely. In the case, axis.y.tick.format or axis.y.tick.values will be helpful.
    */
  var count: js.UndefOr[Double] = js.undefined
  /**
    * Set formatter for y axis tick text.
    * This option accepts d3.format object as well as a function you define.
    */
  var format: js.UndefOr[js.Function1[/* x */ Double, String]] = js.undefined
  /**
    * Show or hide outer tick.
    */
  var outer: js.UndefOr[Boolean] = js.undefined
  /**
    * Set the y values of ticks manually.
    */
  var values: js.UndefOr[js.Array[Double]] = js.undefined
}

object YTickConfiguration {
  @scala.inline
  def apply(
    count: Int | Double = null,
    format: /* x */ Double => String = null,
    outer: js.UndefOr[Boolean] = js.undefined,
    values: js.Array[Double] = null
  ): YTickConfiguration = {
    val __obj = js.Dynamic.literal()
    if (count != null) __obj.updateDynamic("count")(count.asInstanceOf[js.Any])
    if (format != null) __obj.updateDynamic("format")(js.Any.fromFunction1(format))
    if (!js.isUndefined(outer)) __obj.updateDynamic("outer")(outer)
    if (values != null) __obj.updateDynamic("values")(values)
    __obj.asInstanceOf[YTickConfiguration]
  }
}

