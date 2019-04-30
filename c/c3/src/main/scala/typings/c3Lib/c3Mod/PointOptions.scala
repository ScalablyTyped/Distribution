package typings
package c3Lib.c3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PointOptions extends js.Object {
  var focus: js.UndefOr[c3Lib.Anon_ExpandAnonEnabledR] = js.undefined
  /**
    * The radius size of each point.
    */
  var r: js.UndefOr[scala.Double | (js.Function1[/* d */ js.Any, scala.Double])] = js.undefined
  var select: js.UndefOr[c3Lib.Anon_R] = js.undefined
  /**
    * How sensitive is each point to mouse cursor hover
    */
  var sensitivity: js.UndefOr[scala.Double] = js.undefined
  /**
    * Whether to show each point in line.
    */
  var show: js.UndefOr[scala.Boolean] = js.undefined
}

object PointOptions {
  @scala.inline
  def apply(
    focus: c3Lib.Anon_ExpandAnonEnabledR = null,
    r: scala.Double | (js.Function1[/* d */ js.Any, scala.Double]) = null,
    select: c3Lib.Anon_R = null,
    sensitivity: scala.Int | scala.Double = null,
    show: js.UndefOr[scala.Boolean] = js.undefined
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

