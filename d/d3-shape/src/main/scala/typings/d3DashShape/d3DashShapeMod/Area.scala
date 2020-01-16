package typings.d3DashShape.d3DashShapeMod

import typings.std.CanvasRenderingContext2D
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Area[Datum] extends js.Object {
  /**
    * Generates an area for the given array of data. Depending on this area generator’s associated curve,
    * the given input data may need to be sorted by x-value before being passed to the area generator.
    *
    * IMPORTANT: If the rendering context of the area generator is null,
    * then the area is returned as a path data string.
    *
    * @param data Array of data elements.
    */
  def apply(data: js.Array[Datum]): String | Null = js.native
  /**
    * Returns the current rendering context, which defaults to null.
    */
  def context(): CanvasRenderingContext2D | Null = js.native
  /**
    * Sets the rendering context and returns this area generator.
    *
    * If the context is not null, then the generated area is rendered to this context as a sequence of path method calls.
    *
    * @param context The rendering context.
    */
  def context(context: CanvasRenderingContext2D): this.type = js.native
  /**
    * Sets the rendering context to null and returns this area generator.
    *
    * A path data string representing the generated area will be returned when the generator is invoked with data.
    *
    * @param context null, to remove rendering context.
    */
  @JSName("context")
  def context_This(): this.type = js.native
  /**
    * Returns the current curve factory, which defaults to curveLinear.
    */
  def curve(): CurveFactory = js.native
  /**
    * Sets the curve factory and returns this area generator.
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
    * Sets the defined accessor to the specified function and returns this area generator.
    *
    * The default accessor for defined returns a constant boolean value of true, thus assumes that the input data is always defined.
    *
    * The default accessor for defined returns a constant boolean value of true, thus assumes that the input data is always defined.
    * When an area is generated, the defined accessor will be invoked for each element in the input data array,
    * being passed the element d, the index i, and the array data as three arguments.
    * If the given element is defined (i.e., if the defined accessor returns a truthy value for this element),
    * the x0, x1, y0 and y1 accessors will subsequently be evaluated and the point will be added to the current area segment.
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
    * Sets the defined accessor to the specified boolean and returns this area generator.
    *
    * The default accessor for defined returns a constant boolean value of true, thus assumes that the input data is always defined.
    * When an area is generated, the defined accessor will be invoked for each element in the input data array, being passed the element d, the index i, and the array data as three arguments.
    * If the given element is defined (i.e., if the defined accessor returns a truthy value for this element),
    * the x0, x1, y0 and y1 accessors will subsequently be evaluated and the point will be added to the current area segment.
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
    * Returns a new line generator that has this area generator’s current defined accessor, curve and context.
    * The line’s x-accessor is this area’s x0-accessor, and the line’s y-accessor is this area’s y0-accessor.
    */
  def lineX0(): Line[Datum] = js.native
  /**
    * Returns a new line generator that has this area generator’s current defined accessor, curve and context.
    * The line’s x-accessor is this area’s x1-accessor, and the line’s y-accessor is this area’s y0-accessor.
    */
  def lineX1(): Line[Datum] = js.native
  /**
    * Returns a new line generator that has this area generator’s current defined accessor, curve and context.
    * The line’s x-accessor is this area’s x0-accessor, and the line’s y-accessor is this area’s y0-accessor.
    */
  def lineY0(): Line[Datum] = js.native
  /**
    * Returns a new line generator that has this area generator’s current defined accessor, curve and context.
    * The line’s x-accessor is this area’s x0-accessor, and the line’s y-accessor is this area’s y1-accessor.
    */
  def lineY1(): Line[Datum] = js.native
  /**
    * Returns the current x0 accessor. The default x0 accessor is a function returning the first element of a
    * two-element array of numbers.
    */
  def x(): js.Function3[/* d */ Datum, /* index */ Double, /* data */ js.Array[Datum], Double] = js.native
  /**
    * Sets x0 to the specified function x and x1 to null and returns this area generator.
    *
    * The default x0 accessor assumes that the input data are two-element arrays of numbers and returns the first element.
    * If your data are in a different format, or if you wish to transform the data before rendering, then you should specify a custom accessor.
    *
    * @param x An accessor function returning a value to be used for x0. The accessor will be invoked for each defined element in the input data array,
    * being passed the element d, the index i, and the array data as three arguments.
    */
  def x(x: js.Function3[/* d */ Datum, /* index */ Double, /* data */ js.Array[Datum], Double]): this.type = js.native
  /**
    * Sets x0 to a constant number x and x1 to null and returns this area generator.
    *
    * Setting x1 to null indicates that the previously-computed x0 value should be reused for the x1 value.
    *
    * @param x A constant value to be used for x0.
    */
  def x(x: Double): this.type = js.native
  /**
    * Returns the current x0 accessor. The default x0 accessor is a function returning the first element of a
    * two-element array of numbers.
    */
  def x0(): js.Function3[/* d */ Datum, /* index */ Double, /* data */ js.Array[Datum], Double] = js.native
  /**
    * Sets x0 to the specified function and returns this area generator.
    *
    * The default x0 accessor assumes that the input data are two-element arrays of numbers and returns the first element.
    * If your data are in a different format, or if you wish to transform the data before rendering, then you should specify a custom accessor.
    *
    * @param x An accessor function returning a value to be used for x0. The accessor will be invoked for each defined element in the input data array,
    * being passed the element d, the index i, and the array data as three arguments.
    */
  def x0(x: js.Function3[/* d */ Datum, /* index */ Double, /* data */ js.Array[Datum], Double]): this.type = js.native
  /**
    * Sets x0 to a constant number and returns this area generator.
    *
    * @param x A constant value.
    */
  def x0(x: Double): this.type = js.native
  /**
    * Returns the current x1 accessor, which defaults to null, indicating that the previously-computed x0 value should be reused for the x1 value.
    */
  def x1(): (js.Function3[/* d */ Datum, /* index */ Double, /* data */ js.Array[Datum], Double]) | Null = js.native
  /**
    * Sets x1 to the specified function and returns this area generator.
    *
    * The default x1 accessor is null, indicating that the previously-computed x0 value should be reused for the x1 value.
    * If your data are in a different format, or if you wish to transform the data before rendering, then you should specify a custom accessor.
    *
    * @param x An accessor function returning a value to be used for x1. The accessor will be invoked for each defined element in the input data array,
    * being passed the element d, the index i, and the array data as three arguments.
    */
  def x1(x: js.Function3[/* d */ Datum, /* index */ Double, /* data */ js.Array[Datum], Double]): this.type = js.native
  /**
    * Sets x1 to a constant number and returns this area generator.
    *
    * @param x A constant value.
    */
  def x1(x: Double): this.type = js.native
  /**
    * Sets x1 to null and returns this area generator.
    *
    * Setting x1 to null indicates that the previously-computed x0 value should be reused for the x1 value.
    *
    * @param x null.
    */
  @JSName("x1")
  def x1_This(): this.type = js.native
  /**
    * Returns the current y0 accessor. The default y0 accessor is a function returning a constant value of zero.
    */
  def y(): js.Function3[/* d */ Datum, /* index */ Double, /* data */ js.Array[Datum], Double] = js.native
  /**
    * Sets y0 to the accessor function y and y1 to null and returns this area generator.
    *
    * The default y0 accessor returns a constant value of zero.
    * If your data are in a different format, or if you wish to transform the data before rendering, then you should specify a custom accessor.
    *
    * @param y An accessor function returning a value to be used for y0. The accessor will be invoked for each defined element in the input data array,
    * being passed the element d, the index i, and the array data as three arguments.
    */
  def y(y: js.Function3[/* d */ Datum, /* index */ Double, /* data */ js.Array[Datum], Double]): this.type = js.native
  /**
    * Sets y0 to a constant number y and y1 to null and returns this area generator.
    *
    * Setting y1 to null indicates that the previously-computed y0 value should be reused for the y1 value.
    *
    * @param y A constant value to be used for y0.
    */
  def y(y: Double): this.type = js.native
  /**
    * Returns the current y0 accessor. The default y0 accessor is a function a constant value of zero.
    */
  def y0(): js.Function3[/* d */ Datum, /* index */ Double, /* data */ js.Array[Datum], Double] = js.native
  /**
    * Sets y0 to the specified function and returns this area generator.
    *
    * The default y0 accessor is a function which returns a constant value of zero.
    * If your data are in a different format, or if you wish to transform the data before rendering, then you should specify a custom accessor.
    *
    * @param y An accessor function returning a value to be used for y0. The accessor will be invoked for each defined element in the input data array,
    * being passed the element d, the index i, and the array data as three arguments.
    */
  def y0(y: js.Function3[/* d */ Datum, /* index */ Double, /* data */ js.Array[Datum], Double]): this.type = js.native
  /**
    * Sets y0 to a constant number and returns this area generator.
    *
    * @param y A constant value.
    */
  def y0(y: Double): this.type = js.native
  /**
    * Returns the current y1 accessor or null. The default y1 accessor is a function returning the second element of a
    * two-element array of numbers.
    *
    * If the y1 accessor is null, the previously-computed y0 value is reused for the y1 value.
    */
  def y1(): (js.Function3[/* d */ Datum, /* index */ Double, /* data */ js.Array[Datum], Double]) | Null = js.native
  /**
    * Sets y1 to the specified function and returns this area generator.
    *
    * The default y1 accessor assumes that the input data are two-element arrays of numbers and returns the second element.
    * If your data are in a different format, or if you wish to transform the data before rendering, then you should specify a custom accessor.
    *
    * @param y An accessor function returning a value to be used for y1. The accessor will be invoked for each defined element in the input data array,
    * being passed the element d, the index i, and the array data as three arguments.
    */
  def y1(y: js.Function3[/* d */ Datum, /* index */ Double, /* data */ js.Array[Datum], Double]): this.type = js.native
  /**
    * Sets y1 to a constant number and returns this area generator.
    *
    * @param y A constant value.
    */
  def y1(y: Double): this.type = js.native
  /**
    * Sets y1 to null and returns this area generator.
    *
    * Setting y1 to null indicates that the previously-computed y0 value should be reused for the y1 value.
    *
    * @param y null.
    */
  @JSName("y1")
  def y1_This(): this.type = js.native
}

@JSImport("d3-shape", "area")
@js.native
object area extends js.Object {
  def apply(): Area[js.Tuple2[Double, Double]] = js.native
}

