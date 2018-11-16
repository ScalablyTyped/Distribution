package typings
package d3DashScaleLib.d3DashScaleMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ScaleQuantize[Range] extends js.Object {
  /**
       * Given a value in the input domain, returns the corresponding value in the output range.
       */
  def apply(value: d3DashScaleLib.Anon_ValueOf): Range = js.native
  /**
       * Given a value in the input domain, returns the corresponding value in the output range.
       */
  def apply(value: scala.Double): Range = js.native
  /**
       * Returns an exact copy of this scale. Changes to this scale will not affect the returned scale, and vice versa.
       */
  def copy(): this.type = js.native
  /**
       * Returns the scale’s current domain.
       */
  def domain(): js.Tuple2[scala.Double, scala.Double] = js.native
  /**
       * Sets the scale’s domain to the specified two-element array of numbers.
       * If the elements in the given array are not numbers, they will be coerced to numbers.
       *
       * @param domain A two-element array of numeric values defining the domain.
       */
  def domain(
    domain: js.Tuple2[
      scala.Double | d3DashScaleLib.Anon_ValueOf, 
      scala.Double | d3DashScaleLib.Anon_ValueOf
    ]
  ): this.type = js.native
  /**
       * Returns the extent of values in the domain [x0, x1] for the corresponding value in the range: the inverse of quantize.
       * This method is useful for interaction, say to determine the value in the domain that corresponds to the pixel location under the mouse.
       *
       * If an invalid range value is entered, returns [NaN, NaN].
       *
       * @param value A value from the range.
       */
  def invertExtent(value: Range): js.Tuple2[scala.Double, scala.Double] = js.native
  /**
       * Extends the domain so that it starts and ends on nice round values.
       * This method typically modifies the scale’s domain, and may only extend the bounds to the nearest round value.
       *
       * Nicing is useful if the domain is computed from data, say using extent, and may be irregular.
       * For example, for a domain of [0.201479…, 0.996679…], a nice domain might be [0.2, 1.0].
       *
       * Nicing a scale only modifies the current domain; it does not automatically nice domains that are subsequently set using continuous.domain.
       * You must re-nice the scale after setting the new domain, if desired.
       *
       * @param count An optional number of ticks expected to be used.
       */
  def nice(): this.type = js.native
  /**
       * Extends the domain so that it starts and ends on nice round values.
       * This method typically modifies the scale’s domain, and may only extend the bounds to the nearest round value.
       *
       * Nicing is useful if the domain is computed from data, say using extent, and may be irregular.
       * For example, for a domain of [0.201479…, 0.996679…], a nice domain might be [0.2, 1.0].
       *
       * Nicing a scale only modifies the current domain; it does not automatically nice domains that are subsequently set using continuous.domain.
       * You must re-nice the scale after setting the new domain, if desired.
       *
       * @param count An optional number of ticks expected to be used.
       */
  def nice(count: scala.Double): this.type = js.native
  /**
       * Returns the scale’s current range.
       */
  def range(): js.Array[Range] = js.native
  /**
       * Sets the scale’s range to the specified array of values. The array may contain any number of discrete values.
       *
       * @param range Array of range values.
       */
  def range(range: js.Array[Range]): this.type = js.native
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
  /**
       * Returns a number format function suitable for displaying a tick value, automatically computing the appropriate precision based on the fixed interval between tick values.
       * The specified count should have the same value as the count that is used to generate the tick values.
       *
       * @param count Approximate number of ticks to be used when calculating precision for the number format function.
       * @param specifier An optional valid format specifier string which allows a custom format where the precision of the format is automatically set by the scale as appropriate for the tick interval.
       * If specifier uses the format type "s", the scale will return a SI-prefix format based on the largest value in the domain.
       * If the specifier already specifies a precision, this method is equivalent to locale.format.
       */
  def tickFormat(count: scala.Double): js.Function1[/* d */ scala.Double | d3DashScaleLib.Anon_ValueOf, java.lang.String] = js.native
  /**
       * Returns a number format function suitable for displaying a tick value, automatically computing the appropriate precision based on the fixed interval between tick values.
       * The specified count should have the same value as the count that is used to generate the tick values.
       *
       * @param count Approximate number of ticks to be used when calculating precision for the number format function.
       * @param specifier An optional valid format specifier string which allows a custom format where the precision of the format is automatically set by the scale as appropriate for the tick interval.
       * If specifier uses the format type "s", the scale will return a SI-prefix format based on the largest value in the domain.
       * If the specifier already specifies a precision, this method is equivalent to locale.format.
       */
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
  def ticks(count: scala.Double): js.Array[scala.Double] = js.native
}

