package typings
package c3Lib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ExpandFullCircle extends js.Object {
  /**
    * Enable or disable expanding gauge.
    */
  var expand: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Whether this should be displayed
    * as a full circle instead of a
    * half circle.
    */
  var fullCircle: js.UndefOr[scala.Boolean] = js.undefined
  var label: js.UndefOr[Anon_FormatRatio] = js.undefined
  /**
    * Set max value of the gauge.
    */
  var max: js.UndefOr[scala.Double] = js.undefined
  /**
    * Set min value of the gauge.
    */
  var min: js.UndefOr[scala.Double] = js.undefined
  /**
    * Set units of the gauge.
    */
  var units: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Set width of gauge chart.
    */
  var width: js.UndefOr[scala.Double] = js.undefined
}

object Anon_ExpandFullCircle {
  @scala.inline
  def apply(
    expand: js.UndefOr[scala.Boolean] = js.undefined,
    fullCircle: js.UndefOr[scala.Boolean] = js.undefined,
    label: Anon_FormatRatio = null,
    max: scala.Int | scala.Double = null,
    min: scala.Int | scala.Double = null,
    units: java.lang.String = null,
    width: scala.Int | scala.Double = null
  ): Anon_ExpandFullCircle = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(expand)) __obj.updateDynamic("expand")(expand)
    if (!js.isUndefined(fullCircle)) __obj.updateDynamic("fullCircle")(fullCircle)
    if (label != null) __obj.updateDynamic("label")(label)
    if (max != null) __obj.updateDynamic("max")(max.asInstanceOf[js.Any])
    if (min != null) __obj.updateDynamic("min")(min.asInstanceOf[js.Any])
    if (units != null) __obj.updateDynamic("units")(units)
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_ExpandFullCircle]
  }
}

