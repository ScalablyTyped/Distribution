package typings.cesium.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("cesium", "Cartesian4")
@js.native
open class Cartesian4 () extends StObject {
  def this(x: Double) = this()
  def this(x: Double, y: Double) = this()
  def this(x: Unit, y: Double) = this()
  def this(x: Double, y: Double, z: Double) = this()
  def this(x: Double, y: Unit, z: Double) = this()
  def this(x: Unit, y: Double, z: Double) = this()
  def this(x: Unit, y: Unit, z: Double) = this()
  def this(x: Double, y: Double, z: Double, w: Double) = this()
  def this(x: Double, y: Double, z: Unit, w: Double) = this()
  def this(x: Double, y: Unit, z: Double, w: Double) = this()
  def this(x: Double, y: Unit, z: Unit, w: Double) = this()
  def this(x: Unit, y: Double, z: Double, w: Double) = this()
  def this(x: Unit, y: Double, z: Unit, w: Double) = this()
  def this(x: Unit, y: Unit, z: Double, w: Double) = this()
  def this(x: Unit, y: Unit, z: Unit, w: Double) = this()
  
  def clone(result: Cartesian4): Cartesian4 = js.native
  
  /**
    * Compares this Cartesian against the provided Cartesian componentwise and returns
    * <code>true</code> if they are equal, <code>false</code> otherwise.
    * @param [right] - The right hand side Cartesian.
    * @returns <code>true</code> if they are equal, <code>false</code> otherwise.
    */
  def equals(): Boolean = js.native
  def equals(right: Cartesian4): Boolean = js.native
  
  /**
    * Compares this Cartesian against the provided Cartesian componentwise and returns
    * <code>true</code> if they pass an absolute or relative tolerance test,
    * <code>false</code> otherwise.
    * @param [right] - The right hand side Cartesian.
    * @param [relativeEpsilon = 0] - The relative epsilon tolerance to use for equality testing.
    * @param [absoluteEpsilon = relativeEpsilon] - The absolute epsilon tolerance to use for equality testing.
    * @returns <code>true</code> if they are within the provided epsilon, <code>false</code> otherwise.
    */
  def equalsEpsilon(): Boolean = js.native
  def equalsEpsilon(right: Unit, relativeEpsilon: Double): Boolean = js.native
  def equalsEpsilon(right: Unit, relativeEpsilon: Double, absoluteEpsilon: Double): Boolean = js.native
  def equalsEpsilon(right: Unit, relativeEpsilon: Unit, absoluteEpsilon: Double): Boolean = js.native
  def equalsEpsilon(right: Cartesian4): Boolean = js.native
  def equalsEpsilon(right: Cartesian4, relativeEpsilon: Double): Boolean = js.native
  def equalsEpsilon(right: Cartesian4, relativeEpsilon: Double, absoluteEpsilon: Double): Boolean = js.native
  def equalsEpsilon(right: Cartesian4, relativeEpsilon: Unit, absoluteEpsilon: Double): Boolean = js.native
  
  /**
    * The W component.
    */
  var w: Double = js.native
  
  /**
    * The X component.
    */
  var x: Double = js.native
  
  /**
    * The Y component.
    */
  var y: Double = js.native
  
  /**
    * The Z component.
    */
  var z: Double = js.native
}
/* static members */
object Cartesian4 {
  
  @JSImport("cesium", "Cartesian4")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * An immutable Cartesian4 instance initialized to (1.0, 1.0, 1.0, 1.0).
    */
  @JSImport("cesium", "Cartesian4.ONE")
  @js.native
  val ONE: Cartesian4 = js.native
  
  /**
    * An immutable Cartesian4 instance initialized to (0.0, 0.0, 0.0, 1.0).
    */
  @JSImport("cesium", "Cartesian4.UNIT_W")
  @js.native
  val UNIT_W: Cartesian4 = js.native
  
  /**
    * An immutable Cartesian4 instance initialized to (1.0, 0.0, 0.0, 0.0).
    */
  @JSImport("cesium", "Cartesian4.UNIT_X")
  @js.native
  val UNIT_X: Cartesian4 = js.native
  
  /**
    * An immutable Cartesian4 instance initialized to (0.0, 1.0, 0.0, 0.0).
    */
  @JSImport("cesium", "Cartesian4.UNIT_Y")
  @js.native
  val UNIT_Y: Cartesian4 = js.native
  
  /**
    * An immutable Cartesian4 instance initialized to (0.0, 0.0, 1.0, 0.0).
    */
  @JSImport("cesium", "Cartesian4.UNIT_Z")
  @js.native
  val UNIT_Z: Cartesian4 = js.native
  
  /**
    * An immutable Cartesian4 instance initialized to (0.0, 0.0, 0.0, 0.0).
    */
  @JSImport("cesium", "Cartesian4.ZERO")
  @js.native
  val ZERO: Cartesian4 = js.native
  
  /**
    * Computes the absolute value of the provided Cartesian.
    * @param cartesian - The Cartesian whose absolute value is to be computed.
    * @param result - The object onto which to store the result.
    * @returns The modified result parameter.
    */
  inline def abs(cartesian: Cartesian4, result: Cartesian4): Cartesian4 = (^.asInstanceOf[js.Dynamic].applyDynamic("abs")(cartesian.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Cartesian4]
  
  /**
    * Computes the componentwise sum of two Cartesians.
    * @param left - The first Cartesian.
    * @param right - The second Cartesian.
    * @param result - The object onto which to store the result.
    * @returns The modified result parameter.
    */
  inline def add(left: Cartesian4, right: Cartesian4, result: Cartesian4): Cartesian4 = (^.asInstanceOf[js.Dynamic].applyDynamic("add")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Cartesian4]
  
  /**
    * Constrain a value to lie between two values.
    * @param value - The value to clamp.
    * @param min - The minimum bound.
    * @param max - The maximum bound.
    * @param result - The object into which to store the result.
    * @returns The clamped value such that min <= result <= max.
    */
  inline def clamp(value: Cartesian4, min: Cartesian4, max: Cartesian4, result: Cartesian4): Cartesian4 = (^.asInstanceOf[js.Dynamic].applyDynamic("clamp")(value.asInstanceOf[js.Any], min.asInstanceOf[js.Any], max.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Cartesian4]
  
  /**
    * Duplicates a Cartesian4 instance.
    * @param cartesian - The Cartesian to duplicate.
    * @param [result] - The object onto which to store the result.
    * @returns The modified result parameter or a new Cartesian4 instance if one was not provided. (Returns undefined if cartesian is undefined)
    */
  inline def clone(cartesian: Cartesian4): Cartesian4 = ^.asInstanceOf[js.Dynamic].applyDynamic("clone")(cartesian.asInstanceOf[js.Any]).asInstanceOf[Cartesian4]
  inline def clone(cartesian: Cartesian4, result: Cartesian4): Cartesian4 = (^.asInstanceOf[js.Dynamic].applyDynamic("clone")(cartesian.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Cartesian4]
  
  /**
    * Computes the 4-space distance between two points.
    * @example
    * // Returns 1.0
    * const d = Cesium.Cartesian4.distance(
    *   new Cesium.Cartesian4(1.0, 0.0, 0.0, 0.0),
    *   new Cesium.Cartesian4(2.0, 0.0, 0.0, 0.0));
    * @param left - The first point to compute the distance from.
    * @param right - The second point to compute the distance to.
    * @returns The distance between two points.
    */
  inline def distance(left: Cartesian4, right: Cartesian4): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("distance")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  /**
    * Computes the squared distance between two points.  Comparing squared distances
    * using this function is more efficient than comparing distances using {@link Cartesian4#distance}.
    * @example
    * // Returns 4.0, not 2.0
    * const d = Cesium.Cartesian4.distance(
    *   new Cesium.Cartesian4(1.0, 0.0, 0.0, 0.0),
    *   new Cesium.Cartesian4(3.0, 0.0, 0.0, 0.0));
    * @param left - The first point to compute the distance from.
    * @param right - The second point to compute the distance to.
    * @returns The distance between two points.
    */
  inline def distanceSquared(left: Cartesian4, right: Cartesian4): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("distanceSquared")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  /**
    * Divides the provided Cartesian componentwise by the provided scalar.
    * @param cartesian - The Cartesian to be divided.
    * @param scalar - The scalar to divide by.
    * @param result - The object onto which to store the result.
    * @returns The modified result parameter.
    */
  inline def divideByScalar(cartesian: Cartesian4, scalar: Double, result: Cartesian4): Cartesian4 = (^.asInstanceOf[js.Dynamic].applyDynamic("divideByScalar")(cartesian.asInstanceOf[js.Any], scalar.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Cartesian4]
  
  /**
    * Computes the componentwise quotient of two Cartesians.
    * @param left - The first Cartesian.
    * @param right - The second Cartesian.
    * @param result - The object onto which to store the result.
    * @returns The modified result parameter.
    */
  inline def divideComponents(left: Cartesian4, right: Cartesian4, result: Cartesian4): Cartesian4 = (^.asInstanceOf[js.Dynamic].applyDynamic("divideComponents")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Cartesian4]
  
  /**
    * Computes the dot (scalar) product of two Cartesians.
    * @param left - The first Cartesian.
    * @param right - The second Cartesian.
    * @returns The dot product.
    */
  inline def dot(left: Cartesian4, right: Cartesian4): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("dot")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  /**
    * Compares the provided Cartesians componentwise and returns
    * <code>true</code> if they are equal, <code>false</code> otherwise.
    * @param [left] - The first Cartesian.
    * @param [right] - The second Cartesian.
    * @returns <code>true</code> if left and right are equal, <code>false</code> otherwise.
    */
  inline def equals(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("equals")().asInstanceOf[Boolean]
  inline def equals(left: Unit, right: Cartesian4): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equals")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def equals(left: Cartesian4): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("equals")(left.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def equals(left: Cartesian4, right: Cartesian4): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equals")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  /**
    * Compares the provided Cartesians componentwise and returns
    * <code>true</code> if they pass an absolute or relative tolerance test,
    * <code>false</code> otherwise.
    * @param [left] - The first Cartesian.
    * @param [right] - The second Cartesian.
    * @param [relativeEpsilon = 0] - The relative epsilon tolerance to use for equality testing.
    * @param [absoluteEpsilon = relativeEpsilon] - The absolute epsilon tolerance to use for equality testing.
    * @returns <code>true</code> if left and right are within the provided epsilon, <code>false</code> otherwise.
    */
  inline def equalsEpsilon(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("equalsEpsilon")().asInstanceOf[Boolean]
  inline def equalsEpsilon(left: Unit, right: Unit, relativeEpsilon: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equalsEpsilon")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any], relativeEpsilon.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def equalsEpsilon(left: Unit, right: Unit, relativeEpsilon: Double, absoluteEpsilon: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equalsEpsilon")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any], relativeEpsilon.asInstanceOf[js.Any], absoluteEpsilon.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def equalsEpsilon(left: Unit, right: Unit, relativeEpsilon: Unit, absoluteEpsilon: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equalsEpsilon")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any], relativeEpsilon.asInstanceOf[js.Any], absoluteEpsilon.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def equalsEpsilon(left: Unit, right: Cartesian4): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equalsEpsilon")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def equalsEpsilon(left: Unit, right: Cartesian4, relativeEpsilon: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equalsEpsilon")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any], relativeEpsilon.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def equalsEpsilon(left: Unit, right: Cartesian4, relativeEpsilon: Double, absoluteEpsilon: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equalsEpsilon")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any], relativeEpsilon.asInstanceOf[js.Any], absoluteEpsilon.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def equalsEpsilon(left: Unit, right: Cartesian4, relativeEpsilon: Unit, absoluteEpsilon: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equalsEpsilon")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any], relativeEpsilon.asInstanceOf[js.Any], absoluteEpsilon.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def equalsEpsilon(left: Cartesian4): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("equalsEpsilon")(left.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def equalsEpsilon(left: Cartesian4, right: Unit, relativeEpsilon: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equalsEpsilon")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any], relativeEpsilon.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def equalsEpsilon(left: Cartesian4, right: Unit, relativeEpsilon: Double, absoluteEpsilon: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equalsEpsilon")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any], relativeEpsilon.asInstanceOf[js.Any], absoluteEpsilon.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def equalsEpsilon(left: Cartesian4, right: Unit, relativeEpsilon: Unit, absoluteEpsilon: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equalsEpsilon")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any], relativeEpsilon.asInstanceOf[js.Any], absoluteEpsilon.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def equalsEpsilon(left: Cartesian4, right: Cartesian4): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equalsEpsilon")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def equalsEpsilon(left: Cartesian4, right: Cartesian4, relativeEpsilon: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equalsEpsilon")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any], relativeEpsilon.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def equalsEpsilon(left: Cartesian4, right: Cartesian4, relativeEpsilon: Double, absoluteEpsilon: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equalsEpsilon")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any], relativeEpsilon.asInstanceOf[js.Any], absoluteEpsilon.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def equalsEpsilon(left: Cartesian4, right: Cartesian4, relativeEpsilon: Unit, absoluteEpsilon: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equalsEpsilon")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any], relativeEpsilon.asInstanceOf[js.Any], absoluteEpsilon.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  /**
    * Creates a Cartesian4 from four consecutive elements in an array.
    * @example
    * // Create a Cartesian4 with (1.0, 2.0, 3.0, 4.0)
    * const v = [1.0, 2.0, 3.0, 4.0];
    * const p = Cesium.Cartesian4.fromArray(v);
    *
    * // Create a Cartesian4 with (1.0, 2.0, 3.0, 4.0) using an offset into an array
    * const v2 = [0.0, 0.0, 1.0, 2.0, 3.0, 4.0];
    * const p2 = Cesium.Cartesian4.fromArray(v2, 2);
    * @param array - The array whose four consecutive elements correspond to the x, y, z, and w components, respectively.
    * @param [startingIndex = 0] - The offset into the array of the first element, which corresponds to the x component.
    * @param [result] - The object onto which to store the result.
    * @returns The modified result parameter or a new Cartesian4 instance if one was not provided.
    */
  inline def fromArray(array: js.Array[Double]): Cartesian4 = ^.asInstanceOf[js.Dynamic].applyDynamic("fromArray")(array.asInstanceOf[js.Any]).asInstanceOf[Cartesian4]
  inline def fromArray(array: js.Array[Double], startingIndex: Double): Cartesian4 = (^.asInstanceOf[js.Dynamic].applyDynamic("fromArray")(array.asInstanceOf[js.Any], startingIndex.asInstanceOf[js.Any])).asInstanceOf[Cartesian4]
  inline def fromArray(array: js.Array[Double], startingIndex: Double, result: Cartesian4): Cartesian4 = (^.asInstanceOf[js.Dynamic].applyDynamic("fromArray")(array.asInstanceOf[js.Any], startingIndex.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Cartesian4]
  inline def fromArray(array: js.Array[Double], startingIndex: Unit, result: Cartesian4): Cartesian4 = (^.asInstanceOf[js.Dynamic].applyDynamic("fromArray")(array.asInstanceOf[js.Any], startingIndex.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Cartesian4]
  
  /**
    * Creates a Cartesian4 instance from a {@link Color}. <code>red</code>, <code>green</code>, <code>blue</code>,
    * and <code>alpha</code> map to <code>x</code>, <code>y</code>, <code>z</code>, and <code>w</code>, respectively.
    * @param color - The source color.
    * @param [result] - The object onto which to store the result.
    * @returns The modified result parameter or a new Cartesian4 instance if one was not provided.
    */
  inline def fromColor(color: Color): Cartesian4 = ^.asInstanceOf[js.Dynamic].applyDynamic("fromColor")(color.asInstanceOf[js.Any]).asInstanceOf[Cartesian4]
  inline def fromColor(color: Color, result: Cartesian4): Cartesian4 = (^.asInstanceOf[js.Dynamic].applyDynamic("fromColor")(color.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Cartesian4]
  
  /**
    * Creates a Cartesian4 instance from x, y, z and w coordinates.
    * @param x - The x coordinate.
    * @param y - The y coordinate.
    * @param z - The z coordinate.
    * @param w - The w coordinate.
    * @param [result] - The object onto which to store the result.
    * @returns The modified result parameter or a new Cartesian4 instance if one was not provided.
    */
  inline def fromElements(x: Double, y: Double, z: Double, w: Double): Cartesian4 = (^.asInstanceOf[js.Dynamic].applyDynamic("fromElements")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], z.asInstanceOf[js.Any], w.asInstanceOf[js.Any])).asInstanceOf[Cartesian4]
  inline def fromElements(x: Double, y: Double, z: Double, w: Double, result: Cartesian4): Cartesian4 = (^.asInstanceOf[js.Dynamic].applyDynamic("fromElements")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], z.asInstanceOf[js.Any], w.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Cartesian4]
  
  /**
    * Computes the linear interpolation or extrapolation at t using the provided cartesians.
    * @param start - The value corresponding to t at 0.0.
    * @param end - The value corresponding to t at 1.0.
    * @param t - The point along t at which to interpolate.
    * @param result - The object onto which to store the result.
    * @returns The modified result parameter.
    */
  inline def lerp(start: Cartesian4, end: Cartesian4, t: Double, result: Cartesian4): Cartesian4 = (^.asInstanceOf[js.Dynamic].applyDynamic("lerp")(start.asInstanceOf[js.Any], end.asInstanceOf[js.Any], t.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Cartesian4]
  
  /**
    * Computes the Cartesian's magnitude (length).
    * @param cartesian - The Cartesian instance whose magnitude is to be computed.
    * @returns The magnitude.
    */
  inline def magnitude(cartesian: Cartesian4): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("magnitude")(cartesian.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  /**
    * Computes the provided Cartesian's squared magnitude.
    * @param cartesian - The Cartesian instance whose squared magnitude is to be computed.
    * @returns The squared magnitude.
    */
  inline def magnitudeSquared(cartesian: Cartesian4): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("magnitudeSquared")(cartesian.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  /**
    * Compares two Cartesians and computes a Cartesian which contains the maximum components of the supplied Cartesians.
    * @param first - A cartesian to compare.
    * @param second - A cartesian to compare.
    * @param result - The object into which to store the result.
    * @returns A cartesian with the maximum components.
    */
  inline def maximumByComponent(first: Cartesian4, second: Cartesian4, result: Cartesian4): Cartesian4 = (^.asInstanceOf[js.Dynamic].applyDynamic("maximumByComponent")(first.asInstanceOf[js.Any], second.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Cartesian4]
  
  /**
    * Computes the value of the maximum component for the supplied Cartesian.
    * @param cartesian - The cartesian to use.
    * @returns The value of the maximum component.
    */
  inline def maximumComponent(cartesian: Cartesian4): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("maximumComponent")(cartesian.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  /**
    * Compares two Cartesians and computes a Cartesian which contains the minimum components of the supplied Cartesians.
    * @param first - A cartesian to compare.
    * @param second - A cartesian to compare.
    * @param result - The object into which to store the result.
    * @returns A cartesian with the minimum components.
    */
  inline def minimumByComponent(first: Cartesian4, second: Cartesian4, result: Cartesian4): Cartesian4 = (^.asInstanceOf[js.Dynamic].applyDynamic("minimumByComponent")(first.asInstanceOf[js.Any], second.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Cartesian4]
  
  /**
    * Computes the value of the minimum component for the supplied Cartesian.
    * @param cartesian - The cartesian to use.
    * @returns The value of the minimum component.
    */
  inline def minimumComponent(cartesian: Cartesian4): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("minimumComponent")(cartesian.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  /**
    * Returns the axis that is most orthogonal to the provided Cartesian.
    * @param cartesian - The Cartesian on which to find the most orthogonal axis.
    * @param result - The object onto which to store the result.
    * @returns The most orthogonal axis.
    */
  inline def mostOrthogonalAxis(cartesian: Cartesian4, result: Cartesian4): Cartesian4 = (^.asInstanceOf[js.Dynamic].applyDynamic("mostOrthogonalAxis")(cartesian.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Cartesian4]
  
  /**
    * Multiplies the provided Cartesian componentwise by the provided scalar.
    * @param cartesian - The Cartesian to be scaled.
    * @param scalar - The scalar to multiply with.
    * @param result - The object onto which to store the result.
    * @returns The modified result parameter.
    */
  inline def multiplyByScalar(cartesian: Cartesian4, scalar: Double, result: Cartesian4): Cartesian4 = (^.asInstanceOf[js.Dynamic].applyDynamic("multiplyByScalar")(cartesian.asInstanceOf[js.Any], scalar.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Cartesian4]
  
  /**
    * Computes the componentwise product of two Cartesians.
    * @param left - The first Cartesian.
    * @param right - The second Cartesian.
    * @param result - The object onto which to store the result.
    * @returns The modified result parameter.
    */
  inline def multiplyComponents(left: Cartesian4, right: Cartesian4, result: Cartesian4): Cartesian4 = (^.asInstanceOf[js.Dynamic].applyDynamic("multiplyComponents")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Cartesian4]
  
  /**
    * Negates the provided Cartesian.
    * @param cartesian - The Cartesian to be negated.
    * @param result - The object onto which to store the result.
    * @returns The modified result parameter.
    */
  inline def negate(cartesian: Cartesian4, result: Cartesian4): Cartesian4 = (^.asInstanceOf[js.Dynamic].applyDynamic("negate")(cartesian.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Cartesian4]
  
  /**
    * Computes the normalized form of the supplied Cartesian.
    * @param cartesian - The Cartesian to be normalized.
    * @param result - The object onto which to store the result.
    * @returns The modified result parameter.
    */
  inline def normalize(cartesian: Cartesian4, result: Cartesian4): Cartesian4 = (^.asInstanceOf[js.Dynamic].applyDynamic("normalize")(cartesian.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Cartesian4]
  
  /**
    * Stores the provided instance into the provided array.
    * @param value - The value to pack.
    * @param array - The array to pack into.
    * @param [startingIndex = 0] - The index into the array at which to start packing the elements.
    * @returns The array that was packed into
    */
  inline def pack(value: Cartesian4, array: js.Array[Double]): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("pack")(value.asInstanceOf[js.Any], array.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
  inline def pack(value: Cartesian4, array: js.Array[Double], startingIndex: Double): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("pack")(value.asInstanceOf[js.Any], array.asInstanceOf[js.Any], startingIndex.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
  
  /**
    * Flattens an array of Cartesian4s into an array of components.
    * @param array - The array of cartesians to pack.
    * @param [result] - The array onto which to store the result. If this is a typed array, it must have array.length * 4 components, else a {@link DeveloperError} will be thrown. If it is a regular array, it will be resized to have (array.length * 4) elements.
    * @returns The packed array.
    */
  inline def packArray(array: js.Array[Cartesian4]): js.Array[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("packArray")(array.asInstanceOf[js.Any]).asInstanceOf[js.Array[Double]]
  inline def packArray(array: js.Array[Cartesian4], result: js.Array[Double]): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("packArray")(array.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
  
  /**
    * Packs an arbitrary floating point value to 4 values representable using uint8.
    * @param value - A floating point number.
    * @param [result] - The Cartesian4 that will contain the packed float.
    * @returns A Cartesian4 representing the float packed to values in x, y, z, and w.
    */
  inline def packFloat(value: Double): Cartesian4 = ^.asInstanceOf[js.Dynamic].applyDynamic("packFloat")(value.asInstanceOf[js.Any]).asInstanceOf[Cartesian4]
  inline def packFloat(value: Double, result: Cartesian4): Cartesian4 = (^.asInstanceOf[js.Dynamic].applyDynamic("packFloat")(value.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Cartesian4]
  
  /**
    * The number of elements used to pack the object into an array.
    */
  @JSImport("cesium", "Cartesian4.packedLength")
  @js.native
  def packedLength: Double = js.native
  inline def packedLength_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("packedLength")(x.asInstanceOf[js.Any])
  
  /**
    * Computes the componentwise difference of two Cartesians.
    * @param left - The first Cartesian.
    * @param right - The second Cartesian.
    * @param result - The object onto which to store the result.
    * @returns The modified result parameter.
    */
  inline def subtract(left: Cartesian4, right: Cartesian4, result: Cartesian4): Cartesian4 = (^.asInstanceOf[js.Dynamic].applyDynamic("subtract")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Cartesian4]
  
  /**
    * Retrieves an instance from a packed array.
    * @param array - The packed array.
    * @param [startingIndex = 0] - The starting index of the element to be unpacked.
    * @param [result] - The object into which to store the result.
    * @returns The modified result parameter or a new Cartesian4 instance if one was not provided.
    */
  inline def unpack(array: js.Array[Double]): Cartesian4 = ^.asInstanceOf[js.Dynamic].applyDynamic("unpack")(array.asInstanceOf[js.Any]).asInstanceOf[Cartesian4]
  inline def unpack(array: js.Array[Double], startingIndex: Double): Cartesian4 = (^.asInstanceOf[js.Dynamic].applyDynamic("unpack")(array.asInstanceOf[js.Any], startingIndex.asInstanceOf[js.Any])).asInstanceOf[Cartesian4]
  inline def unpack(array: js.Array[Double], startingIndex: Double, result: Cartesian4): Cartesian4 = (^.asInstanceOf[js.Dynamic].applyDynamic("unpack")(array.asInstanceOf[js.Any], startingIndex.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Cartesian4]
  inline def unpack(array: js.Array[Double], startingIndex: Unit, result: Cartesian4): Cartesian4 = (^.asInstanceOf[js.Dynamic].applyDynamic("unpack")(array.asInstanceOf[js.Any], startingIndex.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Cartesian4]
  
  /**
    * Unpacks an array of cartesian components into an array of Cartesian4s.
    * @param array - The array of components to unpack.
    * @param [result] - The array onto which to store the result.
    * @returns The unpacked array.
    */
  inline def unpackArray(array: js.Array[Double]): js.Array[Cartesian4] = ^.asInstanceOf[js.Dynamic].applyDynamic("unpackArray")(array.asInstanceOf[js.Any]).asInstanceOf[js.Array[Cartesian4]]
  inline def unpackArray(array: js.Array[Double], result: js.Array[Cartesian4]): js.Array[Cartesian4] = (^.asInstanceOf[js.Dynamic].applyDynamic("unpackArray")(array.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[js.Array[Cartesian4]]
}
