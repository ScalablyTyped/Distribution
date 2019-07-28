package typings.c3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ExpandFullCircle extends js.Object {
  /**
    * Enable or disable expanding gauge.
    */
  var expand: js.UndefOr[Boolean] = js.undefined
  /**
    * Whether this should be displayed
    * as a full circle instead of a
    * half circle.
    */
  var fullCircle: js.UndefOr[Boolean] = js.undefined
  var label: js.UndefOr[Anon_FormatRatio] = js.undefined
  /**
    * Set max value of the gauge.
    */
  var max: js.UndefOr[Double] = js.undefined
  /**
    * Set min value of the gauge.
    */
  var min: js.UndefOr[Double] = js.undefined
  /**
    * Set units of the gauge.
    */
  var units: js.UndefOr[String] = js.undefined
  /**
    * Set width of gauge chart.
    */
  var width: js.UndefOr[Double] = js.undefined
}

object Anon_ExpandFullCircle {
  @scala.inline
  def apply(
    expand: js.UndefOr[Boolean] = js.undefined,
    fullCircle: js.UndefOr[Boolean] = js.undefined,
    label: Anon_FormatRatio = null,
    max: Int | Double = null,
    min: Int | Double = null,
    units: String = null,
    width: Int | Double = null
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

