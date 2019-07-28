package typings.c3.c3Mod

import typings.c3.Anon_ExpandAnonEnabledR
import typings.c3.Anon_R
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PointOptions extends js.Object {
  var focus: js.UndefOr[Anon_ExpandAnonEnabledR] = js.undefined
  /**
    * The radius size of each point.
    */
  var r: js.UndefOr[Double | (js.Function1[/* d */ js.Any, Double])] = js.undefined
  var select: js.UndefOr[Anon_R] = js.undefined
  /**
    * How sensitive is each point to mouse cursor hover
    */
  var sensitivity: js.UndefOr[Double] = js.undefined
  /**
    * Whether to show each point in line.
    */
  var show: js.UndefOr[Boolean] = js.undefined
}

object PointOptions {
  @scala.inline
  def apply(
    focus: Anon_ExpandAnonEnabledR = null,
    r: Double | (js.Function1[/* d */ js.Any, Double]) = null,
    select: Anon_R = null,
    sensitivity: Int | Double = null,
    show: js.UndefOr[Boolean] = js.undefined
  ): PointOptions = {
    val __obj = js.Dynamic.literal()
    if (focus != null) __obj.updateDynamic("focus")(focus)
    if (r != null) __obj.updateDynamic("r")(r.asInstanceOf[js.Any])
    if (select != null) __obj.updateDynamic("select")(select)
    if (sensitivity != null) __obj.updateDynamic("sensitivity")(sensitivity.asInstanceOf[js.Any])
    if (!js.isUndefined(show)) __obj.updateDynamic("show")(show)
    __obj.asInstanceOf[PointOptions]
  }
}

