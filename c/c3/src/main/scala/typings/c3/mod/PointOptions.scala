package typings.c3.mod

import typings.c3.AnonExpandAnonEnabled
import typings.c3.AnonR
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PointOptions extends js.Object {
  var focus: js.UndefOr[AnonExpandAnonEnabled] = js.undefined
  /**
    * The radius size of each point.
    * Defaults to `2.5`. If it's a function, will call for each point.
    */
  var r: js.UndefOr[Double | (js.ThisFunction1[/* this */ ChartInternal, /* d */ DataPoint, Double])] = js.undefined
  var select: js.UndefOr[AnonR] = js.undefined
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
    focus: AnonExpandAnonEnabled = null,
    r: Double | (js.ThisFunction1[/* this */ ChartInternal, /* d */ DataPoint, Double]) = null,
    select: AnonR = null,
    sensitivity: Int | Double = null,
    show: js.UndefOr[Boolean] = js.undefined
  ): PointOptions = {
    val __obj = js.Dynamic.literal()
    if (focus != null) __obj.updateDynamic("focus")(focus.asInstanceOf[js.Any])
    if (r != null) __obj.updateDynamic("r")(r.asInstanceOf[js.Any])
    if (select != null) __obj.updateDynamic("select")(select.asInstanceOf[js.Any])
    if (sensitivity != null) __obj.updateDynamic("sensitivity")(sensitivity.asInstanceOf[js.Any])
    if (!js.isUndefined(show)) __obj.updateDynamic("show")(show.asInstanceOf[js.Any])
    __obj.asInstanceOf[PointOptions]
  }
}

