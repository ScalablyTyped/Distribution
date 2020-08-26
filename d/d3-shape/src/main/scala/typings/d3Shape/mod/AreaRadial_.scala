package typings.d3Shape.mod

import typings.std.CanvasRenderingContext2D
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AreaRadial_[Datum] extends js.Object {
  /**
    * Generates a radial area for the given array of data.
    *
    * IMPORTANT: If the rendering context of the radial area generator is null,
    * then the radial area is returned as a path data string.
    *
    * @param data Array of data elements.
    */
  def apply(data: js.Array[Datum]): String | Null = js.native
  /**
    * Returns the current startAngle accessor. The default startAngle accessor is a function returning the first element of a
    * two-element array of numbers.
    */
  def angle(): js.Function3[/* d */ Datum, /* index */ Double, /* data */ js.Array[Datum], Double] = js.native
  /**
    * Sets startAngle to the specified function angle and endAngle to null and returns this radial area generator.
    *
    * The default startAngle accessor assumes that the input data are two-element arrays of numbers and returns the first element.
    * If your data are in a different format, or if you wish to transform the data before rendering, then you should specify a custom accessor.
    *
    * @param angle An accessor function returning a value to be used for startAngle in radians with 0 at -y (12 o’clock).
    * The accessor will be invoked for each defined element in the input data array,
    * being passed the element d, the index i, and the array data as three arguments.
    */
  def angle(angle: js.Function3[/* d */ Datum, /* index */ Double, /* data */ js.Array[Datum], Double]): this.type = js.native
  /**
    * Sets startAngle to a constant number angle and endAngle to null and returns this radial area generator.
    *
    * Setting endAngle to null indicates that the previously-computed startAngle value should be reused for the endAngle value.
    *
    * @param angle A constant value in radians with 0 at -y (12 o’clock).
    */
  def angle(angle: Double): this.type = js.native
  /**
    * Returns the current rendering context, which defaults to null.
    */
  def context(): CanvasRenderingContext2D | Null = js.native
  /**
    * Sets the rendering context to null and returns this radial area generator.
    *
    * A path data string representing the generated radial area will be returned when the generator is invoked with data.
    *
    * @param context null, to remove rendering context.
    */
  def context(context: Null): this.type = js.native
  /**
    * Sets the rendering context and returns this radial area generator.
    *
    * If the context is not null, then the generated radial area is rendered to this context as a sequence of path method calls.
    *
    * @param context The rendering context.
    */
  def context(context: CanvasRenderingContext2D): this.type = js.native
  /**
    * Returns the current curve factory, which defaults to curveLinear.
    */
  def curve(): CurveFactory = js.native
  /**
    * Sets the curve factory and returns this radial area generator.
    *
    * Note that curveMonotoneX or curveMonotoneY are not recommended for radial areas because they assume that the data is monotonic in x or y, which is typically untrue of radial areas.
    *
    * @param curve A valid curve factory.
    */
  def curve(curve: CurveFactory): this.type = js.native
  /**
    * Returns the current curve factory, which defaults to curveLinear.
    *
    * The generic allows to cast the curve factory to a specific type, if known.
    */
  @JSName("curve")
  def curve_C_CurveFactory_C[C /* <: CurveFactory */](): C = js.native
  /**
    * Returns the current defined accessor, which defaults to a function returning a constant boolean value of true.
    */
  def defined(): js.Function3[/* d */ Datum, /* index */ Double, /* data */ js.Array[Datum], Boolean] = js.native
  /**
    * Sets the defined accessor to the specified function and returns this radial area generator.
    *
    * The default accessor for defined returns a constant boolean value of true, thus assumes that the input data is always defined.
    *
    * When a radial area is generated, the defined accessor will be invoked for each element in the input data array, being passed the element d, the index i, and the array data as three arguments.
    * If the given element is defined (i.e., if the defined accessor returns a truthy value for this element),
    * the startAngle, endAngle, innerRadius and outerRadius accessors will subsequently be evaluated and the point will be added to the current area segment.
    *
    * Otherwise, the element will be skipped, the current area segment will be ended, and a new area segment will be generated for the next defined point.
    * As a result, the generated area may have several discrete segments.
    *
    * Note that if an area segment consists of only a single point, it may appear invisible unless rendered with rounded or square line caps.
    * In addition, some curves such as curveCardinalOpen only render a visible segment if it contains multiple points.
    *
    * @param defined An accessor function which returns a boolean value. The accessor will be invoked for each defined element in the input data array,
    * being passed the element d, the index i, and the array data as three arguments.
    */
  def defined(defined: js.Function3[/* d */ Datum, /* index */ Double, /* data */ js.Array[Datum], Boolean]): this.type = js.native
  /**
    * Sets the defined accessor to the specified boolean and returns this radial area generator.
    *
    * The default accessor for defined returns a constant boolean value of true, thus assumes that the input data is always defined.
    *
    * When a radial area is generated, the defined accessor will be invoked for each element in the input data array, being passed the element d, the index i, and the array data as three arguments.
    * If the given element is defined (i.e., if the defined accessor returns a truthy value for this element),
    * the startAngle, endAngle, innerRadius and outerRadius accessors will subsequently be evaluated and the point will be added to the current area segment.
    *
    * Otherwise, the element will be skipped, the current area segment will be ended, and a new area segment will be generated for the next defined point.
    * As a result, the generated area may have several discrete segments.
    *
    * Note that if an area segment consists of only a single point, it may appear invisible unless rendered with rounded or square line caps.
    * In addition, some curves such as curveCardinalOpen only render a visible segment if it contains multiple points.
    *
    * @param defined A boolean constant.
    */
  def defined(defined: Boolean): this.type = js.native
  /**
    * Returns the current endAngle accessor, which defaults to null, indicating that the previously-computed startAngle value should be reused for the endAngle value.
    */
  def endAngle(): (js.Function3[/* d */ Datum, /* index */ Double, /* data */ js.Array[Datum], Double]) | Null = js.native
  /**
    * Sets endAngle to the specified function and returns this radial area generator.
    *
    * The default endAngle accessor is null, indicating that the previously-computed startAngle value should be reused for the endAngle value.
    * If your data are in a different format, or if you wish to transform the data before rendering, then you should specify a custom accessor.
    *
    * @param angle An accessor function returning a value to be used for endAngle in radians with 0 at -y (12 o’clock).
    * The accessor will be invoked for each defined element in the input data array,
    * being passed the element d, the index i, and the array data as three arguments.
    */
  def endAngle(angle: js.Function3[/* d */ Datum, /* index */ Double, /* data */ js.Array[Datum], Double]): this.type = js.native
  /**
    * Sets endAngle to a constant number and returns this radial area generator.
    *
    * @param angle A constant value in radians with 0 at -y (12 o’clock).
    */
  def endAngle(angle: Double): this.type = js.native
  /**
    * Sets endAngle to null and returns this radial area generator.
    *
    * Setting endAngle to null indicates that the previously-computed startAngle value should be reused for the endAngle value.
    *
    * @param angle null.
    */
  def endAngle(angle: Null): this.type = js.native
  /**
    * Returns the current innerRadius accessor. The default innerRadius accessor is a function a constant value of zero.
    */
  def innerRadius(): js.Function3[/* d */ Datum, /* index */ Double, /* data */ js.Array[Datum], Double] = js.native
  /**
    * Sets innerRadius to the specified function and returns this radial area generator.
    *
    * The default innerRadius accessor is a function which returns a constant value of zero.
    * If your data are in a different format, or if you wish to transform the data before rendering, then you should specify a custom accessor.
    *
    * @param radius An accessor function returning a value to be used for innerRadius. The accessor will be invoked for each defined element in the input data array,
    * being passed the element d, the index i, and the array data as three arguments.
    */
  def innerRadius(radius: js.Function3[/* d */ Datum, /* index */ Double, /* data */ js.Array[Datum], Double]): this.type = js.native
  /**
    * Sets innerRadius to a constant number and returns this radial area generator.
    *
    * @param radius A constant value.
    */
  def innerRadius(radius: Double): this.type = js.native
  /**
    * Returns a new radial line generator that has this radial area generator’s current defined accessor, curve and context.
    * The line’s angle accessor is this area’s end angle accessor, and the line’s radius accessor is this area’s inner radius accessor.
    */
  def lineEndAngle(): LineRadial_[Datum] = js.native
  /**
    * Returns a new radial line generator that has this radial area generator’s current defined accessor, curve and context.
    * The line’s angle accessor is this area’s start angle accessor, and the line’s radius accessor is this area’s inner radius accessor.
    */
  def lineInnerRadius(): LineRadial_[Datum] = js.native
  /**
    * Returns a new radial line generator that has this radial area generator’s current defined accessor, curve and context.
    * The line’s angle accessor is this area’s start angle accessor, and the line’s radius accessor is this area’s outer radius accessor.
    */
  def lineOuterRadius(): LineRadial_[Datum] = js.native
  /**
    * Returns a new radial line generator that has this radial area generator’s current defined accessor, curve and context.
    * The line’s angle accessor is this area’s start angle accessor, and the line’s radius accessor is this area’s inner radius accessor.
    */
  def lineStartAngle(): LineRadial_[Datum] = js.native
  /**
    * Returns the current outerRadius accessor or null. The default outerRadius accessor is a function returning the second element of a
    * two-element array of numbers.
    *
    * If the outerRadius accessor is null, the previously-computed innerRadius value is reused for the outerRadius value.
    */
  def outerRadius(): (js.Function3[/* d */ Datum, /* index */ Double, /* data */ js.Array[Datum], Double]) | Null = js.native
  /**
    * Sets outerRadius to the specified function and returns this radial area generator.
    *
    * The default outerRadius accessor assumes that the input data are two-element arrays of numbers and returns the second element.
    * If your data are in a different format, or if you wish to transform the data before rendering, then you should specify a custom accessor.
    *
    * @param radius An accessor function returning a value to be used for outerRadius. The accessor will be invoked for each defined element in the input data array,
    * being passed the element d, the index i, and the array data as three arguments.
    */
  def outerRadius(radius: js.Function3[/* d */ Datum, /* index */ Double, /* data */ js.Array[Datum], Double]): this.type = js.native
  /**
    * Sets outerRadius to a constant number and returns this radial area generator.
    *
    * @param radius A constant value.
    */
  def outerRadius(radius: Double): this.type = js.native
  /**
    * Sets outerRadius to null and returns this radial area generator.
    *
    * Setting outerRadius to null indicates that the previously-computed innerRadius value should be reused for the outerRadius value.
    *
    * @param radius null.
    */
  def outerRadius(radius: Null): this.type = js.native
  /**
    * Returns the current innerRadius accessor. The default innerRadius accessor is a function returning a constant value of zero.
    */
  def radius(): js.Function3[/* d */ Datum, /* index */ Double, /* data */ js.Array[Datum], Double] = js.native
  /**
    * Sets innerRadius to the accessor function radius and outerRadius to null and returns this radial area generator.
    *
    * The default innerRadius accessor returns a constant value of zero.
    * If your data are in a different format, or if you wish to transform the data before rendering, then you should specify a custom accessor.
    *
    * @param radius An accessor function returning a value to be used for innerRadius. The accessor will be invoked for each defined element in the input data array,
    * being passed the element d, the index i, and the array data as three arguments.
    */
  def radius(radius: js.Function3[/* d */ Datum, /* index */ Double, /* data */ js.Array[Datum], Double]): this.type = js.native
  /**
    * Sets innerRadius to a constant number radius and outerRadius to null and returns this radial area generator.
    *
    * Setting outerRadius to null indicates that the previously-computed innerRadius value should be reused for the outerRadius value.
    *
    * @param radius A constant value to be used for innerRadius.
    */
  def radius(radius: Double): this.type = js.native
  /**
    * Returns the current startAngle accessor. The default startAngle accessor is a function returning the first element of a
    * two-element array of numbers.
    */
  def startAngle(): js.Function3[/* d */ Datum, /* index */ Double, /* data */ js.Array[Datum], Double] = js.native
  /**
    * Sets startAngle to the specified function and returns this radial area generator.
    *
    * The default startAngle accessor assumes that the input data are two-element arrays of numbers and returns the first element.
    * If your data are in a different format, or if you wish to transform the data before rendering, then you should specify a custom accessor.
    *
    * @param angle An accessor function returning a value to be used for startAngle in radians with 0 at -y (12 o’clock).
    * The accessor will be invoked for each defined element in the input data array,
    * being passed the element d, the index i, and the array data as three arguments.
    */
  def startAngle(angle: js.Function3[/* d */ Datum, /* index */ Double, /* data */ js.Array[Datum], Double]): this.type = js.native
  /**
    * Sets startAngle to a constant number and returns this radial area generator.
    *
    * @param angle A constant value in radians with 0 at -y (12 o’clock).
    */
  def startAngle(angle: Double): this.type = js.native
}

