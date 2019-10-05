package typings.d3DashShape.d3DashShapeMod

import typings.d3DashShape.d3DashShapeMod.Global.CanvasRenderingContext2D
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LineRadial[Datum] extends js.Object {
  /**
    * Generates a radial line for the given array of data. Depending on this radial line generator’s associated curve,
    * the given input data may need to be sorted by x-value before being passed to the line generator.
    *
    * IMPORTANT: If the rendering context of the radial line generator is null,
    * then the radial line is returned as a path data string.
    *
    * @param data Array of data elements.
    */
  def apply(data: js.Array[Datum]): String | Null = js.native
  /**
    * Returns the current angle accessor function, which defaults to a function returning first element of a two-element array of numbers.
    */
  def angle(): js.Function3[/* d */ Datum, /* index */ Double, /* data */ js.Array[Datum], Double] = js.native
  /**
    * Sets the angle accessor to the specified function and returns this radial line generator.
    *
    * When a radial line is generated, the angle accessor will be invoked for each defined element in the input data array.
    *
    * The default angle accessor assumes that the input data are two-element arrays of numbers. If your data are in a different format, or if you wish to transform the data before rendering,
    * then you should specify a custom accessor.
    *
    * @param angle An angle accessor function which returns the angle value in radians, with 0 at -y (12 o’clock). The angle accessor will be invoked for each defined element in the input data array,
    * being passed the element d, the index i, and the array data as three arguments.
    */
  def angle(angle: js.Function3[/* d */ Datum, /* index */ Double, /* data */ js.Array[Datum], Double]): this.type = js.native
  /**
    * Sets the angle accessor to the specified number and returns this radial line generator.
    *
    * @param angle A constant angle value in radians, with 0 at -y (12 o’clock).
    */
  def angle(angle: Double): this.type = js.native
  /**
    * Returns the current rendering context, which defaults to null.
    */
  def context(): CanvasRenderingContext2D | Null = js.native
  /**
    * Sets the rendering context and returns this radial line generator.
    *
    * If the context is not null, then the generated radial line is rendered to this context as a sequence of path method calls.
    *
    * @param context The rendering context.
    */
  def context(context: CanvasRenderingContext2D): this.type = js.native
  /**
    * Sets the rendering context to null and returns this radial line generator.
    *
    * A path data string representing the generated radial line will be returned when the generator is invoked with data.
    *
    * @param context null, to remove rendering context.
    */
  @JSName("context")
  def context_This(): this.type = js.native
  /**
    * Returns the current curve factory, which defaults to curveLinear.
    */
  def curve(): CurveFactory | CurveFactoryLineOnly = js.native
  /**
    * Sets the curve factory and returns this radial line generator.
    *
    * Note that curveMonotoneX or curveMonotoneY are not recommended for radial lines because they assume that the data is monotonic in x or y,
    * which is typically untrue of radial lines.
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
    * Sets the defined accessor to the specified function and returns this radial line generator.
    *
    * The default accessor for defined returns a constant boolean value of true, thus assumes that the input data is always defined.
    *
    * When a radial line is generated, the defined accessor will be invoked for each element in the input data array,
    * being passed the element d, the index i, and the array data as three arguments.
    * If the given element is defined (i.e., if the defined accessor returns a truthy value for this element),
    * the angle and radius accessors will subsequently be evaluated and the point will be added to the current radial line segment.
    * Otherwise, the element will be skipped, the current radial line segment will be ended, and a new radial line segment will be generated for the next defined point.
    * As a result, the generated radial line may have several discrete segments.
    *
    * Note that if a radial line segment consists of only a single point, it may appear invisible unless rendered with rounded or square line caps.
    * In addition, some curves such as curveCardinalOpen only render a visible segment if it contains multiple points.
    *
    * @param defined An accessor function which returns a boolean value. The accessor will be invoked for each defined element in the input data array,
    * being passed the element d, the index i, and the array data as three arguments.
    */
  def defined(defined: js.Function3[/* d */ Datum, /* index */ Double, /* data */ js.Array[Datum], Boolean]): this.type = js.native
  /**
    * Sets the defined accessor to the specified boolean and returns this radial line generator.
    *
    * The default accessor for defined returns a constant boolean value of true, thus assumes that the input data is always defined.
    *
    * When a radial line is generated, the defined accessor will be invoked for each element in the input data array,
    * being passed the element d, the index i, and the array data as three arguments.
    * If the given element is defined (i.e., if the defined accessor returns a truthy value for this element),
    * the angle and radius accessors will subsequently be evaluated and the point will be added to the current radial line segment.
    * Otherwise, the element will be skipped, the current radial line segment will be ended, and a new radial line segment will be generated for the next defined point.
    * As a result, the generated radial line may have several discrete segments.
    *
    * Note that if a radial line segment consists of only a single point, it may appear invisible unless rendered with rounded or square line caps.
    * In addition, some curves such as curveCardinalOpen only render a visible segment if it contains multiple points.
    *
    * @param defined A boolean constant.
    */
  def defined(defined: Boolean): this.type = js.native
  /**
    * Returns the current radius accessor function, which defaults to a function returning second element of a two-element array of numbers.
    */
  def radius(): js.Function3[/* d */ Datum, /* index */ Double, /* data */ js.Array[Datum], Double] = js.native
  /**
    * Sets the radius accessor to the specified function and returns this radial line generator.
    *
    * When a radial line is generated, the radius accessor will be invoked for each defined element in the input data array.
    *
    * The default radius accessor assumes that the input data are two-element arrays of numbers. If your data are in a different format, or if you wish to transform the data before rendering,
    * then you should specify a custom accessor.
    *
    * @param radius A radius accessor function which returns the radius value. The radius accessor will be invoked for each defined element in the input data array,
    * being passed the element d, the index i, and the array data as three arguments.
    */
  def radius(radius: js.Function3[/* d */ Datum, /* index */ Double, /* data */ js.Array[Datum], Double]): this.type = js.native
  /**
    * Sets the radius accessor to the specified number and returns this radial line generator.
    *
    * @param radius A constant radius value.
    */
  def radius(radius: Double): this.type = js.native
}

@JSImport("d3-shape", "lineRadial")
@js.native
object lineRadial extends js.Object {
  def apply(): LineRadial[js.Tuple2[Double, Double]] = js.native
}

