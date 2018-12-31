package typings
package d3DashScaleLib.d3DashScaleMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ScaleIdentity extends js.Object {
  def apply(value: d3DashScaleLib.Anon_ValueOf): scala.Double = js.native
  /**
    * Given a value from the domain, returns the corresponding value from the range, subject to interpolation, if any.
    *
    * If the given value is outside the domain, and clamping is not enabled, the mapping may be extrapolated such that the returned value is outside the range.
    *
    * Note: The interpolation function applied by the scale may change the output type from the range type as part of the interpolation.
    *
    * @param value A numeric value from the domain.
    */
  def apply(value: scala.Double): scala.Double = js.native
  /**
    * Returns an exact copy of this scale. Changes to this scale will not affect the returned scale, and vice versa.
    */
  def copy(): ScaleIdentity = js.native
  /**
    * Returns a copy of the scale’s current domain.
    */
  def domain(): js.Array[scala.Double] = js.native
  /**
    * Sets the scale’s domain to the specified array of numbers. The array must contain two or more elements.
    * If the elements in the given array are not numbers, they will be coerced to numbers
    *
    * Although continuous scales typically have two values each in their domain and range, specifying more than two values produces a piecewise scale.
    *
    * Internally, a piecewise scale performs a binary search for the range interpolator corresponding to the given domain value.
    * Thus, the domain must be in ascending or descending order. If the domain and range have different lengths N and M, only the first min(N,M) elements in each are observed.
    *
    * @param domain Array of numeric domain values.
    */
  def domain(domain: js.Array[scala.Double | d3DashScaleLib.Anon_ValueOf]): this.type = js.native
  def invert(value: d3DashScaleLib.Anon_ValueOf): scala.Double = js.native
  /**
    * Given a value from the range, returns the corresponding value from the domain. Inversion is useful for interaction,
    * say to determine the data value corresponding to the position of the mouse.
    *
    * If the given value is outside the range, and clamping is not enabled, the mapping may be extrapolated such that the returned value is outside the domain.
    *
    * IMPORTANT: This method is only supported if the range is numeric. If the range is not numeric, returns NaN.
    *
    * For a valid value y in the range, continuous(continuous.invert(y)) approximately equals y;
    * similarly, for a valid value x in the domain, continuous.invert(continuous(x)) approximately equals x.
    * The scale and its inverse may not be exact due to the limitations of floating point precision.
    *
    * @param value A numeric value from the range.
    */
  def invert(value: scala.Double): scala.Double = js.native
  /**
    * Extends the domain so that it starts and ends on nice round values.
    * This method typically modifies the scale’s domain, and may only extend the bounds to the nearest round value.
    * An optional tick count argument allows greater control over the step size used to extend the bounds,
    * guaranteeing that the returned ticks will exactly cover the domain.
    * Nicing is useful if the domain is computed from data, say using extent, and may be irregular.
    * For example, for a domain of [0.201479…, 0.996679…], a nice domain might be [0.2, 1.0].
    * If the domain has more than two values, nicing the domain only affects the first and last value.
    *
    * Nicing a scale only modifies the current domain; it does not automatically nice domains that are subsequently set using continuous.domain.
    * You must re-nice the scale after setting the new domain, if desired.
    *
    * @param count An optional number of ticks expected to be used.
    */
  def nice(): this.type = js.native
  def nice(count: scala.Double): this.type = js.native
  /**
    * Returns a copy of the scale’s current range.
    */
  def range(): js.Array[scala.Double] = js.native
  /**
    * Sets the scale’s range to the specified array of values.
    *
    * The array must contain two or more elements. Unlike the domain, elements in the given array need not be numbers;
    * any value that is supported by the underlying interpolator will work, though note that numeric ranges are required for invert.
    *
    * @param range Array of range values.
    */
  def range(range: js.Array[scala.Double | d3DashScaleLib.Anon_ValueOf]): this.type = js.native
  /**
    * Returns a number format function suitable for displaying a tick value, automatically computing the appropriate precision based on the fixed interval between tick values.
    * The specified count should have the same value as the count that is used to generate the tick values.
    *
    * @param count Approximate number of ticks to be used when calculating precision for the number format function.
    * @param specifier An optional valid format specifier string which allows a custom format where the precision of the format is automatically set by the scale as appropriate for the tick interval.
    * If specifier uses the format type "s", the scale will return a SI-prefix format based on the largest value in the domain.
    * If the specifier already specifies a precision, this method is equivalent to locale.format.
    */
  def tickFormat(): js.Function1[/* d */ scala.Double | d3DashScaleLib.Anon_ValueOf, java.lang.String] = js.native
  def tickFormat(count: scala.Double): js.Function1[/* d */ scala.Double | d3DashScaleLib.Anon_ValueOf, java.lang.String] = js.native
  def tickFormat(count: scala.Double, specifier: java.lang.String): js.Function1[/* d */ scala.Double | d3DashScaleLib.Anon_ValueOf, java.lang.String] = js.native
  /**
    * Returns approximately count representative values from the scale’s domain.
    *
    * If count is not specified, it defaults to 10.
    *
    * The returned tick values are uniformly spaced, have human-readable values (such as multiples of powers of 10),
    * and are guaranteed to be within the extent of the domain. Ticks are often used to display reference lines, or tick marks, in conjunction with the visualized data.
    * The specified count is only a hint; the scale may return more or fewer values depending on the domain. See also d3-array’s ticks.
    *
    * @param count Optional approximate number of ticks to be returned. If count is not specified, it defaults to 10.
    */
  def ticks(): js.Array[scala.Double] = js.native
  def ticks(count: scala.Double): js.Array[scala.Double] = js.native
}

