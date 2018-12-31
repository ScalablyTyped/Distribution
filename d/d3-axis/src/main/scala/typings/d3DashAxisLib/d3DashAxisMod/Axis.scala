package typings
package d3DashAxisLib.d3DashAxisMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Axis[Domain] extends js.Object {
  /**
    * Render the axis to the given context.
    *
    * @param context A selection of SVG containers (either SVG or G elements).
    */
  def apply(
    context: d3DashSelectionLib.d3DashSelectionMod.Selection[stdLib.SVGGElement | stdLib.SVGSVGElement, _, _, _]
  ): scala.Unit = js.native
  /**
    * Render the axis to the given context.
    *
    * @param context A transition defined on SVG containers (either SVG or G elements).
    */
  def apply(
    context: d3DashSelectionLib.d3DashSelectionMod.TransitionLike[stdLib.SVGGElement | stdLib.SVGSVGElement, _]
  ): scala.Unit = js.native
  /**
    * Sets the scale and returns the axis.
    *
    * @param scale The scale to be used for axis generation.
    */
  def scale(scale: AxisScale[Domain]): this.type = js.native
  /**
    * Gets the current scale underlying the axis.
    */
  def scale[A /* <: AxisScale[Domain] */](): A = js.native
  /**
    * Get an array containing the currently set arguments to be passed into scale.ticks and scale.tickFormat, which defaults to the empty array.
    */
  def tickArguments(): js.Array[_] = js.native
  /**
    * Sets the arguments that will be passed to scale.ticks and scale.tickFormat when the axis is rendered, and returns the axis generator.
    *
    * This method has no effect if the scale does not implement scale.ticks, as with band and point scales.
    * To set the tick values explicitly, use axis.tickValues. To set the tick format explicitly, use axis.tickFormat.
    *
    * See also axis.ticks.
    *
    * @param args An array containing a single element representing the count, i.e. number of ticks to be rendered.
    */
  /**
    * Sets the arguments that will be passed to scale.ticks and scale.tickFormat when the axis is rendered, and returns the axis generator.
    * Use with a TIME SCALE ONLY.
    *
    * See also axis.ticks.
    *
    * @param args An array containing a single element representing a time interval used to generate date-based ticks.
    * This is typically a TimeInterval/CountableTimeInterval as defined in d3-time. E.g. as obtained by passing in d3.timeMinute.every(15).
    */
  /**
    * Sets the arguments that will be passed to scale.ticks and scale.tickFormat when the axis is rendered, and returns the axis generator.
    *
    * This method has no effect if the scale does not implement scale.ticks, as with band and point scales.
    * To set the tick values explicitly, use axis.tickValues. To set the tick format explicitly, use axis.tickFormat.
    *
    * See also axis.ticks.
    *
    * @param args An array with arguments suitable for the scale to be used for tick generation.
    */
  def tickArguments(args: js.Array[_ | AxisTimeInterval | scala.Double]): this.type = js.native
  /**
    * Sets the arguments that will be passed to scale.ticks and scale.tickFormat when the axis is rendered, and returns the axis generator.
    *
    * This method has no effect if the scale does not implement scale.ticks, as with band and point scales.
    * To set the tick values explicitly, use axis.tickValues. To set the tick format explicitly, use axis.tickFormat.
    *
    * See also axis.ticks.
    *
    * @param args An array containing two elements. The first element represents the count, i.e. number of ticks to be rendered. The second
    * element is a string representing the format specifier to customize how the tick values are formatted.
    */
  /**
    * Sets the arguments that will be passed to scale.ticks and scale.tickFormat when the axis is rendered, and returns the axis generator.
    * Use with a TIME SCALE ONLY.
    *
    * See also axis.ticks.
    *
    * @param args An array containing two elements. The first element represents a time interval used to generate date-based ticks.
    * This is typically a TimeInterval/CountableTimeInterval as defined in d3-time. E.g. as obtained by passing in d3.timeMinute.every(15).
    * The second element is a string representing the format specifier to customize how the tick values are formatted.
    */
  def tickArguments(args: js.Tuple2[AxisTimeInterval | scala.Double, java.lang.String]): this.type = js.native
  /**
    * Returns the currently set tick format function, which defaults to null.
    */
  def tickFormat(): (js.Function2[/* domainValue */ Domain, /* index */ scala.Double, java.lang.String]) | scala.Null = js.native
  /**
    * Sets the tick format function and returns the axis.
    *
    * @param format A function mapping a value from the axis Domain to a formatted string
    * for display purposes. When invoked, the format function is also passed a second argument representing the zero-based index
    * of the tick label in the array of generated tick labels.
    */
  def tickFormat(format: js.Function2[/* domainValue */ Domain, /* index */ scala.Double, java.lang.String]): this.type = js.native
  /**
    * Reset the tick format function. A null format indicates that the scale’s
    * default formatter should be used, which is generated by calling scale.tickFormat.
    * In this case, the arguments specified by axis.tickArguments
    * are likewise passed to scale.tickFormat.
    *
    * @param format null
    */
  @JSName("tickFormat")
  def `tickFormat_<this>`(): this.type = js.native
  /**
    * Get the current padding, which defaults to 3.
    */
  def tickPadding(): scala.Double = js.native
  /**
    * Set the current padding and return the axis.
    *
    * @param padding Padding in pixels (Default is 3).
    */
  def tickPadding(padding: scala.Double): this.type = js.native
  /**
    * Get the current inner tick size, which defaults to 6.
    */
  def tickSize(): scala.Double = js.native
  /**
    * Set the inner and outer tick size to the specified value and return the axis.
    *
    * @param size Tick size in pixels (Default is 6).
    */
  def tickSize(size: scala.Double): this.type = js.native
  /**
    * Get the current inner tick size, which defaults to 6.
    * The inner tick size controls the length of the tick lines,
    * offset from the native position of the axis.
    */
  def tickSizeInner(): scala.Double = js.native
  /**
    * Set the inner tick size to the specified value and return the axis.
    * The inner tick size controls the length of the tick lines,
    * offset from the native position of the axis.
    *
    * @param size Tick size in pixels (Default is 6).
    */
  def tickSizeInner(size: scala.Double): this.type = js.native
  /**
    * Get the current outer tick size, which defaults to 6.
    * The outer tick size controls the length of the square ends of the domain path,
    * offset from the native position of the axis. Thus, the “outer ticks” are not actually
    * ticks but part of the domain path, and their position is determined by the associated
    * scale’s domain extent. Thus, outer ticks may overlap with the first or last inner tick.
    * An outer tick size of 0 suppresses the square ends of the domain path,
    * instead producing a straight line.
    */
  def tickSizeOuter(): scala.Double = js.native
  /**
    * Set the current outer tick size and return the axis.
    * The outer tick size controls the length of the square ends of the domain path,
    * offset from the native position of the axis. Thus, the “outer ticks” are not actually
    * ticks but part of the domain path, and their position is determined by the associated
    * scale’s domain extent. Thus, outer ticks may overlap with the first or last inner tick.
    * An outer tick size of 0 suppresses the square ends of the domain path,
    * instead producing a straight line.
    *
    * @param size Tick size in pixels (Default is 6).
    */
  def tickSizeOuter(size: scala.Double): this.type = js.native
  /**
    * Returns the current tick values, which defaults to null.
    */
  def tickValues(): js.Array[Domain] | scala.Null = js.native
  /**
    * Specified values to be used for ticks rather than using the scale’s automatic tick generator.
    * The explicit tick values take precedent over the tick arguments set by axis.tickArguments.
    * However, any tick arguments will still be passed to the scale’s tickFormat function if a
    * tick format is not also set.
    *
    * @param values An array with values from the Domain of the scale underlying the axis.
    */
  def tickValues(values: js.Array[Domain]): this.type = js.native
  /**
    * Clears any previously-set explicit tick values and reverts back to the scale’s tick generator.
    *
    * @param values null
    */
  @JSName("tickValues")
  def `tickValues_<this>`(): this.type = js.native
  /**
    * Sets the arguments that will be passed to scale.ticks and scale.tickFormat when the axis is rendered, and returns the axis generator.
    *
    * The meaning of the arguments depends on the axis’ scale type: most commonly, the arguments are a suggested count for the number of ticks
    * (or a time interval for time scales), and an optional format specifier to customize how the tick values are formatted.
    *
    * This method has no effect if the scale does not implement scale.ticks, as with band and point scales.
    *
    * To set the tick values explicitly, use axis.tickValues. To set the tick format explicitly, use axis.tickFormat.
    *
    * This method is also a convenience function for axis.tickArguments.
    */
  def ticks(arg0: js.Any, args: js.Any*): this.type = js.native
  /**
    * Sets the arguments that will be passed to scale.ticks and scale.tickFormat when the axis is rendered, and returns the axis generator.
    *
    * This method has no effect if the scale does not implement scale.ticks, as with band and point scales.
    *
    * This method is also a convenience function for axis.tickArguments.
    *
    * @param count Number of ticks that should be rendered.
    * @param specifier An optional format specifier to customize how the tick values are formatted.
    */
  def ticks(count: scala.Double): this.type = js.native
  def ticks(count: scala.Double, specifier: java.lang.String): this.type = js.native
  /**
    * Sets the arguments that will be passed to scale.ticks and scale.tickFormat when the axis is rendered, and returns the axis generator.
    * Use with a TIME SCALE ONLY.
    *
    * This method is also a convenience function for axis.tickArguments.
    *
    * @param interval A time interval used to generate date-based ticks. This is typically a TimeInterval/CountableTimeInterval as defined
    * in d3-time. E.g. as obtained by passing in d3.timeMinute.every(15).
    * @param specifier An optional format specifier to customize how the tick values are formatted.
    */
  def ticks(interval: AxisTimeInterval): this.type = js.native
  def ticks(interval: AxisTimeInterval, specifier: java.lang.String): this.type = js.native
}

