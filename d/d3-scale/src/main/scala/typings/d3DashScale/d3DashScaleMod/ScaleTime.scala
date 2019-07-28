package typings.d3DashScale.d3DashScaleMod

import typings.d3DashScale.Anon_ValueOf
import typings.d3DashTime.d3DashTimeMod.CountableTimeInterval
import typings.d3DashTime.d3DashTimeMod.TimeInterval
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ScaleTime[Range, Output] extends js.Object {
  def apply(value: Double): Output = js.native
  def apply(value: Anon_ValueOf): Output = js.native
  /**
    * Given a value from the domain, returns the corresponding value from the range, subject to interpolation, if any.
    *
    * If the given value is outside the domain, and clamping is not enabled, the mapping may be extrapolated such that the returned value is outside the range.
    *
    * Note: The interpolation function applied by the scale may change the output type from the range type as part of the interpolation.
    *
    * @param value A temporal value from the domain. If the value is not a Date, it will be coerced to Date.
    */
  def apply(value: Date): Output = js.native
  /**
    * Returns whether or not the scale currently clamps values to within the range.
    */
  def clamp(): Boolean = js.native
  /**
    * Enables or disables clamping, respectively. If clamping is disabled and the scale is passed a value outside the domain,
    * the scale may return a value outside the range through extrapolation.
    *
    * If clamping is enabled, the return value of the scale is always within the scale’s range. Clamping similarly applies to the "invert" method.
    *
    * @param clamp A flag to enable (true) or disable (false) clamping.
    */
  def clamp(clamp: Boolean): this.type = js.native
  /**
    * Returns an exact copy of this scale. Changes to this scale will not affect the returned scale, and vice versa.
    */
  def copy(): this.type = js.native
  /**
    * Returns a copy of the scale’s current domain.
    */
  def domain(): js.Array[Date] = js.native
  /**
    * Sets the scale’s domain to the specified array of temporal domain values. The array must contain two or more elements.
    * If the elements in the given array are not dates, they will be coerced to dates.
    *
    * Although continuous scales typically have two values each in their domain and range, specifying more than two values produces a piecewise scale.
    *
    * Internally, a piecewise scale performs a binary search for the range interpolator corresponding to the given domain value.
    * Thus, the domain must be in ascending or descending order. If the domain and range have different lengths N and M, only the first min(N,M) elements in each are observed.
    *
    * @param domain Array of temporal domain values. Numeric values will be coerced to dates.
    */
  def domain(domain: js.Array[Date | Double | Anon_ValueOf]): this.type = js.native
  /**
    * Returns the scale’s current interpolator factory, which defaults to interpolate.
    */
  def interpolate(): InterpolatorFactory[_, _] = js.native
  /**
    * Sets the scale’s range interpolator factory. This interpolator factory is used to create interpolators for each adjacent pair of values from the range;
    * these interpolators then map a normalized domain parameter t in [0, 1] to the corresponding value in the range.
    *
    * Note: the default interpolator may reuse return values. For example, if the range values are objects, then the value interpolator always returns the same object, modifying it in-place.
    * If the scale is used to set an attribute or style, this is typically acceptable (and desirable for performance);
    * however, if you need to store the scale’s return value, you must specify your own interpolator or make a copy as appropriate.
    *
    * As part of the interpolation process the interpolated value from the range may be converted to a corresponding output value.
    *
    * @param interpolate An interpolation factory. The generics for Range and Output of the scale must correspond to the interpolation factory applied to the scale.
    */
  def interpolate(interpolate: InterpolatorFactory[Range, Output]): this.type = js.native
  /**
    * Sets the scale’s range interpolator factory. This interpolator factory is used to create interpolators for each adjacent pair of values from the range;
    * these interpolators then map a normalized domain parameter t in [0, 1] to the corresponding value in the range.
    *
    * Note: the default interpolator may reuse return values. For example, if the range values are objects, then the value interpolator always returns the same object, modifying it in-place.
    * If the scale is used to set an attribute or style, this is typically acceptable (and desirable for performance);
    * however, if you need to store the scale’s return value, you must specify your own interpolator or make a copy as appropriate.
    *
    * As part of the interpolation process the interpolated value from the range may be converted to a corresponding output value.
    *
    * The generic "NewOutput" can be used to change the scale to have a different output element type corresponding to the new interpolation factory.
    *
    * @param interpolate An interpolation factory. The generics for Range and Output of the scale must correspond to the interpolation factory applied to the scale.
    */
  @JSName("interpolate")
  def interpolate_NewOutput_ScaleTime[NewOutput](interpolate: InterpolatorFactory[Range, NewOutput]): ScaleTime[Range, NewOutput] = js.native
  /**
    * Given a value from the range, returns the corresponding value from the domain. Inversion is useful for interaction,
    * say to determine the data value corresponding to the position of the mouse.
    *
    * If the given value is outside the range, and clamping is not enabled, the mapping may be extrapolated such that the returned value is outside the domain.
    *
    * IMPORTANT: This method is only supported if the range is numeric. If the range is not numeric, returns Invalid Date.
    *
    * For a valid value y in the range, time(time.invert(y)) equals y; similarly, for a valid value x in the domain, time.invert(time(x)) equals x.
    * The invert method is useful for interaction, say to determine the value in the domain that corresponds to the pixel location under the mouse.
    *
    * @param value A numeric value from the range.
    */
  def invert(value: Double): Date = js.native
  def invert(value: Anon_ValueOf): Date = js.native
  /**
    * Extends the domain so that it starts and ends on nice round values.
    * This method typically modifies the scale’s domain, and may only extend the bounds to the nearest round value.
    *
    * Nicing is useful if the domain is computed from data, say using extent, and may be irregular.
    * For example, for a domain of [2009-07-13T00:02, 2009-07-13T23:48], the nice domain is [2009-07-13, 2009-07-14].
    * If the domain has more than two values, nicing the domain only affects the first and last value.
    */
  def nice(): this.type = js.native
  /**
    * Extends the domain so that it starts and ends on nice round values.
    * This method typically modifies the scale’s domain, and may only extend the bounds to the nearest round value.
    *
    * A tick count argument allows greater control over the step size used to extend the bounds, guaranteeing that the returned ticks will exactly cover the domain.
    *
    * Nicing is useful if the domain is computed from data, say using extent, and may be irregular.
    * For example, for a domain of [2009-07-13T00:02, 2009-07-13T23:48], the nice domain is [2009-07-13, 2009-07-14].
    * If the domain has more than two values, nicing the domain only affects the first and last value.
    *
    * @param count Expected number of ticks.
    */
  def nice(count: Double): this.type = js.native
  /**
    * Extends the domain so that it starts and ends on nice round values.
    * This method typically modifies the scale’s domain, and may only extend the bounds to the nearest round value.
    *
    * a time interval may be specified to explicitly set the ticks. If an interval is specified, an optional step may also be specified to skip some ticks.
    * For example, time.nice(d3.timeSecond, 10) will extend the domain to an even ten seconds (0, 10, 20, etc.).
    *
    * Nicing is useful if the domain is computed from data, say using extent, and may be irregular.
    * For example, for a domain of [2009-07-13T00:02, 2009-07-13T23:48], the nice domain is [2009-07-13, 2009-07-14].
    * If the domain has more than two values, nicing the domain only affects the first and last value.
    *
    * @param interval A time interval to specify the expected ticks.
    * @param step An optional step number to be applied to the time interval when considering ticks.
    */
  def nice(interval: CountableTimeInterval): this.type = js.native
  def nice(interval: CountableTimeInterval, step: Double): this.type = js.native
  /**
    * Returns a copy of the scale’s current range.
    */
  def range(): js.Array[Range] = js.native
  /**
    * Sets the scale’s range to the specified array of values.
    *
    * The array must contain two or more elements. Unlike the domain, elements in the given array need not be temporal domain values;
    * any value that is supported by the underlying interpolator will work, though note that numeric ranges are required for invert.
    *
    * @param range Array of range values.
    */
  def range(range: js.Array[Range]): this.type = js.native
  /**
    * Sets the scale’s range to the specified array of values while also setting the scale’s interpolator to interpolateRound.
    *
    * The rounding interpolator is sometimes useful for avoiding antialiasing artifacts,
    * though also consider the shape-rendering “crispEdges” styles. Note that this interpolator can only be used with numeric ranges.
    *
    * The array must contain two or more elements. Unlike the domain, elements in the given array need not be temporal domain values;
    * any value that is supported by the underlying interpolator will work, though note that numeric ranges are required for invert.
    *
    * @param range Array of range values.
    */
  def rangeRound(range: js.Array[Double | Anon_ValueOf]): this.type = js.native
  /**
    * Returns a time format function suitable for displaying tick values.
    *
    * The default multi-scale time format chooses a human-readable representation based on the specified date as follows:
    *
    *  - %Y - for year boundaries, such as 2011.
    *  - %B - for month boundaries, such as February.
    *  - %b %d - for week boundaries, such as Feb 06.
    *  - %a %d - for day boundaries, such as Mon 07.
    *  - %I %p - for hour boundaries, such as 01 AM.
    *  - %I:%M - for minute boundaries, such as 01:23.
    *  - :%S - for second boundaries, such as :45.
    *  - .%L - milliseconds for all other times, such as .012.
    *
    * Although somewhat unusual, this default behavior has the benefit of providing both local and global context:
    * for example, formatting a sequence of ticks as [11 PM, Mon 07, 01 AM] reveals information about hours, dates, and day simultaneously,
    * rather than just the hours [11 PM, 12 AM, 01 AM].
    */
  def tickFormat(): js.Function1[/* d */ Date, String] = js.native
  /**
    * Returns a time format function suitable for displaying tick values.
    *
    * The specified count is currently ignored, but is accepted for consistency with other scales such as continuous.tickFormat.
    *
    * @param count Expected number of ticks. (Currently ignored)
    * @param specifier An optional valid date format specifier string (see d3-time-format).
    */
  def tickFormat(count: Double): js.Function1[/* d */ Date, String] = js.native
  def tickFormat(count: Double, specifier: String): js.Function1[/* d */ Date, String] = js.native
  /**
    * Returns a time format function suitable for displaying tick values.
    *
    * The specified time interval is currently ignored, but is accepted for consistency with other scales such as continuous.tickFormat.
    *
    * @param interval A time interval to specify the expected ticks. (Currently ignored)
    * @param specifier An optional valid date format specifier string (see d3-time-format).
    */
  def tickFormat(interval: TimeInterval): js.Function1[/* d */ Date, String] = js.native
  def tickFormat(interval: TimeInterval, specifier: String): js.Function1[/* d */ Date, String] = js.native
  /**
    * Returns representative dates from the scale’s domain. The returned tick values are uniformly-spaced (mostly),
    * have sensible values (such as every day at midnight), and are guaranteed to be within the extent of the domain.
    * Ticks are often used to display reference lines, or tick marks, in conjunction with the visualized data.
    *
    * Without specifying a count or time interval to control the number of ticks returned, a default count of 10 is used.
    * The specified count is only a hint; the scale may return more or fewer values depending on the domain.
    */
  def ticks(): js.Array[Date] = js.native
  /**
    * Returns representative dates from the scale’s domain. The returned tick values are uniformly-spaced (mostly),
    * have sensible values (such as every day at midnight), and are guaranteed to be within the extent of the domain.
    * Ticks are often used to display reference lines, or tick marks, in conjunction with the visualized data.
    *
    * The specified count controls the number of ticks to be returned. The specified count is only a hint;
    * the scale may return more or fewer values depending on the domain.
    *
    * @param count Expected number of ticks.
    */
  def ticks(count: Double): js.Array[Date] = js.native
  /**
    * Returns representative dates from the scale’s domain. The returned tick values are uniformly-spaced (mostly),
    * have sensible values (such as every day at midnight), and are guaranteed to be within the extent of the domain.
    * Ticks are often used to display reference lines, or tick marks, in conjunction with the visualized data.
    *
    * The specified time interval controls the ticks generated and returned. To prune the generated ticks for a given time interval,
    * use interval.every(...) or interval.filter(...).
    *
    * @param interval A time interval to specify the expected ticks.
    */
  def ticks(interval: TimeInterval): js.Array[Date] = js.native
}

