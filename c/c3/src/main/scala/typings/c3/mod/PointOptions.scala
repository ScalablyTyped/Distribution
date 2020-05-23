package typings.c3.mod

import typings.c3.anon.ExpandEnabled
import typings.c3.anon.R
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PointOptions extends js.Object {
  var focus: js.UndefOr[ExpandEnabled] = js.undefined
  /**
    * The radius size of each point.
    * Defaults to `2.5`. If it's a function, will call for each point.
    */
  var r: js.UndefOr[Double | (js.ThisFunction1[/* this */ ChartInternal, /* d */ DataPoint, Double])] = js.undefined
  var select: js.UndefOr[R] = js.undefined
  /**
    * How sensitive is each point to mouse cursor hover.
    * Defaults to `10`.
    */
  var sensitivity: js.UndefOr[Double] = js.undefined
  /**
    * Whether to show each point in line.
    * Defaults to `true`.
    */
  var show: js.UndefOr[Boolean] = js.undefined
}

object PointOptions {
  @scala.inline
  def apply(
    focus: ExpandEnabled = null,
    r: Double | (js.ThisFunction1[/* this */ ChartInternal, /* d */ DataPoint, Double]) = null,
    select: R = null,
    sensitivity: js.UndefOr[Double] = js.undefined,
    show: js.UndefOr[Boolean] = js.undefined
  ): PointOptions = {
    val __obj = js.Dynamic.literal()
    if (focus != null) __obj.updateDynamic("focus")(focus.asInstanceOf[js.Any])
    if (r != null) __obj.updateDynamic("r")(r.asInstanceOf[js.Any])
    if (select != null) __obj.updateDynamic("select")(select.asInstanceOf[js.Any])
    if (!js.isUndefined(sensitivity)) __obj.updateDynamic("sensitivity")(sensitivity.get.asInstanceOf[js.Any])
    if (!js.isUndefined(show)) __obj.updateDynamic("show")(show.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[PointOptions]
  }
}

