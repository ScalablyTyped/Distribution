package typings.d3Axis

import typings.d3Axis.anon.ValueOf
import typings.d3Selection.mod.Selection_
import typings.d3Selection.mod.TransitionLike
import typings.std.Date
import typings.std.SVGGElement
import typings.std.SVGSVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("d3-axis", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def axisBottom[Domain /* <: AxisDomain */](scale: AxisScale[Domain]): Axis[Domain] = ^.asInstanceOf[js.Dynamic].applyDynamic("axisBottom")(scale.asInstanceOf[js.Any]).asInstanceOf[Axis[Domain]]
  
  @scala.inline
  def axisLeft[Domain /* <: AxisDomain */](scale: AxisScale[Domain]): Axis[Domain] = ^.asInstanceOf[js.Dynamic].applyDynamic("axisLeft")(scale.asInstanceOf[js.Any]).asInstanceOf[Axis[Domain]]
  
  @scala.inline
  def axisRight[Domain /* <: AxisDomain */](scale: AxisScale[Domain]): Axis[Domain] = ^.asInstanceOf[js.Dynamic].applyDynamic("axisRight")(scale.asInstanceOf[js.Any]).asInstanceOf[Axis[Domain]]
  
  @scala.inline
  def axisTop[Domain /* <: AxisDomain */](scale: AxisScale[Domain]): Axis[Domain] = ^.asInstanceOf[js.Dynamic].applyDynamic("axisTop")(scale.asInstanceOf[js.Any]).asInstanceOf[Axis[Domain]]
  
  @js.native
  trait Axis[Domain] extends StObject {
    
    /**
      * Render the axis to the given context.
      *
      * @param context A selection of SVG containers (either SVG or G elements).
      */
    def apply(context: Selection_[SVGGElement | SVGSVGElement, js.Any, js.Any, js.Any]): Unit = js.native
    /**
      * Render the axis to the given context.
      *
      * @param context A transition defined on SVG containers (either SVG or G elements).
      */
    def apply(context: TransitionLike[SVGGElement | SVGSVGElement, js.Any]): Unit = js.native
    
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
    def tickArguments(): js.Array[js.Any] = js.native
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
    def tickArguments(args: js.Array[js.Any | AxisTimeInterval | Double]): this.type = js.native
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
    def tickArguments(args: js.Tuple2[AxisTimeInterval | Double, String]): this.type = js.native
    
    /**
      * Returns the currently set tick format function, which defaults to null.
      */
    def tickFormat(): (js.Function2[/* domainValue */ Domain, /* index */ Double, String]) | Null = js.native
    /**
      * Sets the tick format function and returns the axis.
      *
      * @param format A function mapping a value from the axis Domain to a formatted string
      * for display purposes. When invoked, the format function is also passed a second argument representing the zero-based index
      * of the tick label in the array of generated tick labels.
      */
    def tickFormat(format: js.Function2[/* domainValue */ Domain, /* index */ Double, String]): this.type = js.native
    /**
      * Reset the tick format function. A null format indicates that the scale’s
      * default formatter should be used, which is generated by calling scale.tickFormat.
      * In this case, the arguments specified by axis.tickArguments
      * are likewise passed to scale.tickFormat.
      *
      * @param format null
      */
    def tickFormat(format: Null): this.type = js.native
    
    /**
      * Get the current padding, which defaults to 3.
      */
    def tickPadding(): Double = js.native
    /**
      * Set the current padding and return the axis.
      *
      * @param padding Padding in pixels (Default is 3).
      */
    def tickPadding(padding: Double): this.type = js.native
    
    /**
      * Get the current inner tick size, which defaults to 6.
      */
    def tickSize(): Double = js.native
    /**
      * Set the inner and outer tick size to the specified value and return the axis.
      *
      * @param size Tick size in pixels (Default is 6).
      */
    def tickSize(size: Double): this.type = js.native
    
    /**
      * Get the current inner tick size, which defaults to 6.
      * The inner tick size controls the length of the tick lines,
      * offset from the native position of the axis.
      */
    def tickSizeInner(): Double = js.native
    /**
      * Set the inner tick size to the specified value and return the axis.
      * The inner tick size controls the length of the tick lines,
      * offset from the native position of the axis.
      *
      * @param size Tick size in pixels (Default is 6).
      */
    def tickSizeInner(size: Double): this.type = js.native
    
    /**
      * Get the current outer tick size, which defaults to 6.
      * The outer tick size controls the length of the square ends of the domain path,
      * offset from the native position of the axis. Thus, the “outer ticks” are not actually
      * ticks but part of the domain path, and their position is determined by the associated
      * scale’s domain extent. Thus, outer ticks may overlap with the first or last inner tick.
      * An outer tick size of 0 suppresses the square ends of the domain path,
      * instead producing a straight line.
      */
    def tickSizeOuter(): Double = js.native
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
    def tickSizeOuter(size: Double): this.type = js.native
    
    /**
      * Returns the current tick values, which defaults to null.
      */
    def tickValues(): js.Array[Domain] | Null = js.native
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
    def tickValues(values: Null): this.type = js.native
    
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
    def ticks(count: Double): this.type = js.native
    def ticks(count: Double, specifier: String): this.type = js.native
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
    def ticks(interval: AxisTimeInterval, specifier: String): this.type = js.native
  }
  
  type AxisContainerElement = SVGSVGElement | SVGGElement
  
  type AxisDomain = Double | String | Date | ValueOf
  
  @js.native
  trait AxisScale[Domain] extends StObject {
    
    def apply(x: Domain): js.UndefOr[Double] = js.native
    
    var bandwidth: js.UndefOr[js.Function0[Double]] = js.native
    
    def copy(): this.type = js.native
    
    def domain(): js.Array[Domain] = js.native
    
    def range(): js.Array[Double] = js.native
  }
  
  @js.native
  trait AxisTimeInterval extends StObject {
    
    def range(start: Date, stop: Date): js.Array[Date] = js.native
    def range(start: Date, stop: Date, step: Double): js.Array[Date] = js.native
  }
}
