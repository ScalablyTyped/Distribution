package typings.c3

import typings.c3.c3Strings.pow10
import typings.c3.mod.Padding
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonColors extends js.Object {
  /**
    * Set the color interpolator for stanford color scale. This option is a
    * `d3.interpolate*` object or any function you definethat receives a
    * value between `0` and `1`, and returns a color as string.
    */
  var colors: js.UndefOr[js.Function1[/* value */ Double, String]] = js.undefined
  /** Show lines anywhere in the chart. */
  var lines: js.UndefOr[js.Array[AnonClass]] = js.undefined
  /**
    * Set the padding for the Stanford color scale.
    */
  var padding: js.UndefOr[Padding] = js.undefined
  /** Add regions to the chart. */
  var regions: js.UndefOr[js.Array[AnonOpacity]] = js.undefined
  /**
    * Set formatter for stanford color scale axis tick text.
    * This option accepts the string 'pow10', a d3.format object and any function you define.
    * Defauls to `d3.format("d")`.
    */
  var scaleFormat: js.UndefOr[pow10 | (js.Function1[/* arg0 */ Double, String])] = js.undefined
  /** Change the maximum value of the stanford color scale. */
  var scaleMax: js.UndefOr[Double] = js.undefined
  /** Change the minimum value of the stanford color scale. */
  var scaleMin: js.UndefOr[Double] = js.undefined
  /**
    * Set the values for stanford color scale axis tick text. This option accepts a function that returns an array of numbers.
    */
  var scaleValues: js.UndefOr[js.Function2[/* minValue */ Double, /* maxValue */ Double, js.Array[Double]]] = js.undefined
  /**
    * Change the width of the stanford color scale.
    * Defaults to `20`.
    */
  var scaleWidth: js.UndefOr[scala.Nothing] = js.undefined
  /** Show text anywhere inside the chart. */
  var texts: js.UndefOr[js.Array[AnonContent]] = js.undefined
}

object AnonColors {
  @scala.inline
  def apply(
    colors: /* value */ Double => String = null,
    lines: js.Array[AnonClass] = null,
    padding: Padding = null,
    regions: js.Array[AnonOpacity] = null,
    scaleFormat: pow10 | (js.Function1[/* arg0 */ Double, String]) = null,
    scaleMax: Int | Double = null,
    scaleMin: Int | Double = null,
    scaleValues: (/* minValue */ Double, /* maxValue */ Double) => js.Array[Double] = null,
    scaleWidth: js.UndefOr[scala.Nothing] = js.undefined,
    texts: js.Array[AnonContent] = null
  ): AnonColors = {
    val __obj = js.Dynamic.literal()
    if (colors != null) __obj.updateDynamic("colors")(js.Any.fromFunction1(colors))
    if (lines != null) __obj.updateDynamic("lines")(lines.asInstanceOf[js.Any])
    if (padding != null) __obj.updateDynamic("padding")(padding.asInstanceOf[js.Any])
    if (regions != null) __obj.updateDynamic("regions")(regions.asInstanceOf[js.Any])
    if (scaleFormat != null) __obj.updateDynamic("scaleFormat")(scaleFormat.asInstanceOf[js.Any])
    if (scaleMax != null) __obj.updateDynamic("scaleMax")(scaleMax.asInstanceOf[js.Any])
    if (scaleMin != null) __obj.updateDynamic("scaleMin")(scaleMin.asInstanceOf[js.Any])
    if (scaleValues != null) __obj.updateDynamic("scaleValues")(js.Any.fromFunction2(scaleValues))
    if (!js.isUndefined(scaleWidth)) __obj.updateDynamic("scaleWidth")(scaleWidth.asInstanceOf[js.Any])
    if (texts != null) __obj.updateDynamic("texts")(texts.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonColors]
  }
}

