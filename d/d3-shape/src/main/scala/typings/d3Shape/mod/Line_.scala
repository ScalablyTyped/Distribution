package typings.d3Shape.mod

import typings.std.CanvasRenderingContext2D
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Line_[Datum] extends js.Object {
  /**
    * Generates a line for the given array of data. Depending on this line generator’s associated curve,
    * the given input data may need to be sorted by x-value before being passed to the line generator.
    *
    * IMPORTANT: If the rendering context of the line generator is null,
    * then the line is returned as a path data string.
    *
    * @param data Array of data elements.
    */
  def apply(data: js.Array[Datum]): String | Null = js.native
  /**
    * Returns the current rendering context, which defaults to null.
    */
  def context(): CanvasRenderingContext2D | Null = js.native
  /**
    * Sets the rendering context to null and returns this line generator.
    *
    * A path data string representing the generated line will be returned when the generator is invoked with data.
    *
    * @param context null, to remove rendering context.
    */
  def context(context: Null): this.type = js.native
  /**
    * Sets the rendering context and returns this line generator.
    *
    * If the context is not null, then the generated line is rendered to this context as a sequence of path method calls.
    *
    * @param context The rendering context.
    */
  def context(context: CanvasRenderingContext2D): this.type = js.native
  /**
    * Returns the current curve factory, which defaults to curveLinear.
    */
  def curve(): CurveFactory | CurveFactoryLineOnly = js.native
  /**
    * Sets the curve factory and returns this line generator.
    *
    * @param curve A valid curve factory.
    */
  def curve(curve: CurveFactory | CurveFactoryLineOnly): this.type = js.native
  /**
    * Returns the current curve factory, which defaults to curveLinear.
    *
    * The generic allows to cast the curve factory to a specific type, if known.
    */
  @JSName("curve")
  def curve_C_UnionCurveFactoryCurveFactoryLineOnly_C[C /* <: CurveFactory | CurveFactoryLineOnly */](): C = js.native
  /**
    * Returns the current defined accessor, which defaults to a function returning a constant boolean value of true.
    */
  def defined(): js.Function3[/* d */ Datum, /* index */ Double, /* data */ js.Array[Datum], Boolean] = js.native
  /**
    * Sets the defined accessor to the specified function and returns this line generator.
    *
    * The default accessor for defined returns a constant boolean value of true, thus assumes that the input data is always defined.
    *
    * When a line is generated, the defined accessor will be invoked for each element in the input data array,
    * being passed the element d, the index i, and the array data as three arguments.
    * If the given element is defined (i.e., if the defined accessor returns a truthy value for this element),
    * the x and y accessors will subsequently be evaluated and the point will be added to the current line segment.
    * Otherwise, the element will be skipped, the current line segment will be ended, and a new line segment will be generated for the next defined point.
    * As a result, the generated line may have several discrete segments.
    *
    * Note that if a line segment consists of only a single point, it may appear invisible unless rendered with rounded or square line caps.
    * In addition, some curves such as curveCardinalOpen only render a visible segment if it contains multiple points.
    *
    * @param defined An accessor function which returns a boolean value. The accessor will be invoked for each defined element in the input data array,
    * being passed the element d, the index i, and the array data as three arguments.
    */
  def defined(defined: js.Function3[/* d */ Datum, /* index */ Double, /* data */ js.Array[Datum], Boolean]): this.type = js.native
  /**
    * Sets the defined accessor to the specified boolean and returns this line generator.
    *
    * The default accessor for defined returns a constant boolean value of true, thus assumes that the input data is always defined.
    *
    * When a line is generated, the defined accessor will be invoked for each element in the input data array,
    * being passed the element d, the index i, and the array data as three arguments.
    * If the given element is defined (i.e., if the defined accessor returns a truthy value for this element),
    * the x and y accessors will subsequently be evaluated and the point will be added to the current line segment.
    * Otherwise, the element will be skipped, the current line segment will be ended, and a new line segment will be generated for the next defined point.
    * As a result, the generated line may have several discrete segments.
    *
    * Note that if a line segment consists of only a single point, it may appear invisible unless rendered with rounded or square line caps.
    * In addition, some curves such as curveCardinalOpen only render a visible segment if it contains multiple points.
    *
    * @param defined A boolean constant.
    */
  def defined(defined: Boolean): this.type = js.native
  /**
    * Returns the current x-coordinate accessor function, which defaults to a function returning first element of a two-element array of numbers.
    */
  def x(): js.Function3[/* d */ Datum, /* index */ Double, /* data */ js.Array[Datum], Double] = js.native
  /**
    * Sets the x accessor to the specified function and returns this line generator.
    *
    * When a line is generated, the x accessor will be invoked for each defined element in the input data array.
    *
    * The default x accessor assumes that the input data are two-element arrays of numbers. If your data are in a different format, or if you wish to transform the data before rendering,
    * then you should specify a custom accessor.
    *
    * @param x A coordinate accessor function which returns the x-coordinate value. The x accessor will be invoked for each defined element in the input data array,
    * being passed the element d, the index i, and the array data as three arguments.
    */
  def x(x: js.Function3[/* d */ Datum, /* index */ Double, /* data */ js.Array[Datum], Double]): this.type = js.native
  /**
    * Sets the x accessor to the specified number and returns this line generator.
    *
    * @param x A constant x-coordinate value.
    */
  def x(x: Double): this.type = js.native
  /**
    * Returns the current y-coordinate accessor function, which defaults to a function returning second element of a two-element array of numbers.
    */
  def y(): js.Function3[/* d */ Datum, /* index */ Double, /* data */ js.Array[Datum], Double] = js.native
  /**
    * Sets the y accessor to the specified function and returns this line generator.
    *
    * When a line is generated, the y accessor will be invoked for each defined element in the input data array.
    *
    * The default y accessor assumes that the input data are two-element arrays of numbers. If your data are in a different format, or if you wish to transform the data before rendering,
    * then you should specify a custom accessor.
    *
    * @param y A coordinate accessor function which returns the y-coordinate value. The y accessor will be invoked for each defined element in the input data array,
    * being passed the element d, the index i, and the array data as three arguments.
    */
  def y(y: js.Function3[/* d */ Datum, /* index */ Double, /* data */ js.Array[Datum], Double]): this.type = js.native
  /**
    * Sets the y accessor to the specified number and returns this line generator.
    *
    * @param y A constant y-coordinate value.
    */
  def y(y: Double): this.type = js.native
}

