package typings.c3

import typings.c3.mod.ExpandOptions
import typings.c3.mod.LabelOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonArcs extends js.Object {
  var arcs: js.UndefOr[AnonMinWidth] = js.undefined
  /**
    * Enable or disable expanding gauge.
    */
  var expand: js.UndefOr[ExpandOptions] = js.undefined
  /**
    * Whether this should be displayed
    * as a full circle instead of a
    * half circle.
    * Defaults to `false`.
    */
  var fullCircle: js.UndefOr[Boolean] = js.undefined
  var label: js.UndefOr[LabelOptions] = js.undefined
  var labelLine: js.UndefOr[AnonShow] = js.undefined
  /**
    * Set max value of the gauge.
    * Defaults to `100`.
    */
  var max: js.UndefOr[Double] = js.undefined
  /**
    * Set min value of the gauge.
    * Defaults to `0`.
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

object AnonArcs {
  @scala.inline
  def apply(
    arcs: AnonMinWidth = null,
    expand: ExpandOptions = null,
    fullCircle: js.UndefOr[Boolean] = js.undefined,
    label: LabelOptions = null,
    labelLine: AnonShow = null,
    max: Int | Double = null,
    min: Int | Double = null,
    units: String = null,
    width: Int | Double = null
  ): AnonArcs = {
    val __obj = js.Dynamic.literal()
    if (arcs != null) __obj.updateDynamic("arcs")(arcs.asInstanceOf[js.Any])
    if (expand != null) __obj.updateDynamic("expand")(expand.asInstanceOf[js.Any])
    if (!js.isUndefined(fullCircle)) __obj.updateDynamic("fullCircle")(fullCircle.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (labelLine != null) __obj.updateDynamic("labelLine")(labelLine.asInstanceOf[js.Any])
    if (max != null) __obj.updateDynamic("max")(max.asInstanceOf[js.Any])
    if (min != null) __obj.updateDynamic("min")(min.asInstanceOf[js.Any])
    if (units != null) __obj.updateDynamic("units")(units.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonArcs]
  }
}

