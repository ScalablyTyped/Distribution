package typings.cesiumEngine.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@cesium/engine", "Cartesian3")
@js.native
open class Cartesian3 () extends StObject {
  def this(x: Double) = this()
  def this(x: Double, y: Double) = this()
  def this(x: Unit, y: Double) = this()
  def this(x: Double, y: Double, z: Double) = this()
  def this(x: Double, y: Unit, z: Double) = this()
  def this(x: Unit, y: Double, z: Double) = this()
  def this(x: Unit, y: Unit, z: Double) = this()
  
  def clone(result: Cartesian3): Cartesian3 = js.native
  
  /**
    * Compares this Cartesian against the provided Cartesian componentwise and returns
    * <code>true</code> if they are equal, <code>false</code> otherwise.
    * @param [right] - The right hand side Cartesian.
    * @returns <code>true</code> if they are equal, <code>false</code> otherwise.
    */
  def equals(): Boolean = js.native
  def equals(right: Cartesian3): Boolean = js.native
  
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
  def equalsEpsilon(right: Cartesian3): Boolean = js.native
  def equalsEpsilon(right: Cartesian3, relativeEpsilon: Double): Boolean = js.native
  def equalsEpsilon(right: Cartesian3, relativeEpsilon: Double, absoluteEpsilon: Double): Boolean = js.native
  def equalsEpsilon(right: Cartesian3, relativeEpsilon: Unit, absoluteEpsilon: Double): Boolean = js.native
  
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
object Cartesian3 {
  
  @JSImport("@cesium/engine", "Cartesian3")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * An immutable Cartesian3 instance initialized to (1.0, 1.0, 1.0).
    */
  @JSImport("@cesium/engine", "Cartesian3.ONE")
  @js.native
  val ONE: Cartesian3 = js.native
  
  /**
    * An immutable Cartesian3 instance initialized to (1.0, 0.0, 0.0).
    */
  @JSImport("@cesium/engine", "Cartesian3.UNIT_X")
  @js.native
  val UNIT_X: Cartesian3 = js.native
  
  /**
    * An immutable Cartesian3 instance initialized to (0.0, 1.0, 0.0).
    */
  @JSImport("@cesium/engine", "Cartesian3.UNIT_Y")
  @js.native
  val UNIT_Y: Cartesian3 = js.native
  
  /**
    * An immutable Cartesian3 instance initialized to (0.0, 0.0, 1.0).
    */
  @JSImport("@cesium/engine", "Cartesian3.UNIT_Z")
  @js.native
  val UNIT_Z: Cartesian3 = js.native
  
  /**
    * An immutable Cartesian3 instance initialized to (0.0, 0.0, 0.0).
    */
  @JSImport("@cesium/engine", "Cartesian3.ZERO")
  @js.native
  val ZERO: Cartesian3 = js.native
  
  /**
    * Computes the absolute value of the provided Cartesian.
    * @param cartesian - The Cartesian whose absolute value is to be computed.
    * @param result - The object onto which to store the result.
    * @returns The modified result parameter.
    */
  inline def abs(cartesian: Cartesian3, result: Cartesian3): Cartesian3 = (^.asInstanceOf[js.Dynamic].applyDynamic("abs")(cartesian.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Cartesian3]
  
  /**
    * Computes the componentwise sum of two Cartesians.
    * @param left - The first Cartesian.
    * @param right - The second Cartesian.
    * @param result - The object onto which to store the result.
    * @returns The modified result parameter.
    */
  inline def add(left: Cartesian3, right: Cartesian3, result: Cartesian3): Cartesian3 = (^.asInstanceOf[js.Dynamic].applyDynamic("add")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Cartesian3]
  
  /**
    * Returns the angle, in radians, between the provided Cartesians.
    * @param left - The first Cartesian.
    * @param right - The second Cartesian.
    * @returns The angle between the Cartesians.
    */
  inline def angleBetween(left: Cartesian3, right: Cartesian3): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("angleBetween")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  /**
    * Constrain a value to lie between two values.
    * @param cartesian - The value to clamp.
    * @param min - The minimum bound.
    * @param max - The maximum bound.
    * @param result - The object into which to store the result.
    * @returns The clamped value such that min <= value <= max.
    */
  inline def clamp(cartesian: Cartesian3, min: Cartesian3, max: Cartesian3, result: Cartesian3): Cartesian3 = (^.asInstanceOf[js.Dynamic].applyDynamic("clamp")(cartesian.asInstanceOf[js.Any], min.asInstanceOf[js.Any], max.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Cartesian3]
  
  /**
    * Duplicates a Cartesian3 instance.
    * @param cartesian - The Cartesian to duplicate.
    * @param [result] - The object onto which to store the result.
    * @returns The modified result parameter or a new Cartesian3 instance if one was not provided. (Returns undefined if cartesian is undefined)
    */
  inline def clone(cartesian: Cartesian3): Cartesian3 = ^.asInstanceOf[js.Dynamic].applyDynamic("clone")(cartesian.asInstanceOf[js.Any]).asInstanceOf[Cartesian3]
  inline def clone(cartesian: Cartesian3, result: Cartesian3): Cartesian3 = (^.asInstanceOf[js.Dynamic].applyDynamic("clone")(cartesian.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Cartesian3]
  
  /**
    * Computes the cross (outer) product of two Cartesians.
    * @param left - The first Cartesian.
    * @param right - The second Cartesian.
    * @param result - The object onto which to store the result.
    * @returns The cross product.
    */
  inline def cross(left: Cartesian3, right: Cartesian3, result: Cartesian3): Cartesian3 = (^.asInstanceOf[js.Dynamic].applyDynamic("cross")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Cartesian3]
  
  /**
    * Computes the distance between two points.
    * @example
    * // Returns 1.0
    * const d = Cesium.Cartesian3.distance(new Cesium.Cartesian3(1.0, 0.0, 0.0), new Cesium.Cartesian3(2.0, 0.0, 0.0));
    * @param left - The first point to compute the distance from.
    * @param right - The second point to compute the distance to.
    * @returns The distance between two points.
    */
  inline def distance(left: Cartesian3, right: Cartesian3): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("distance")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  /**
    * Computes the squared distance between two points.  Comparing squared distances
    * using this function is more efficient than comparing distances using {@link Cartesian3#distance}.
    * @example
    * // Returns 4.0, not 2.0
    * const d = Cesium.Cartesian3.distanceSquared(new Cesium.Cartesian3(1.0, 0.0, 0.0), new Cesium.Cartesian3(3.0, 0.0, 0.0));
    * @param left - The first point to compute the distance from.
    * @param right - The second point to compute the distance to.
    * @returns The distance between two points.
    */
  inline def distanceSquared(left: Cartesian3, right: Cartesian3): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("distanceSquared")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  /**
    * Divides the provided Cartesian componentwise by the provided scalar.
    * @param cartesian - The Cartesian to be divided.
    * @param scalar - The scalar to divide by.
    * @param result - The object onto which to store the result.
    * @returns The modified result parameter.
    */
  inline def divideByScalar(cartesian: Cartesian3, scalar: Double, result: Cartesian3): Cartesian3 = (^.asInstanceOf[js.Dynamic].applyDynamic("divideByScalar")(cartesian.asInstanceOf[js.Any], scalar.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Cartesian3]
  
  /**
    * Computes the componentwise quotient of two Cartesians.
    * @param left - The first Cartesian.
    * @param right - The second Cartesian.
    * @param result - The object onto which to store the result.
    * @returns The modified result parameter.
    */
  inline def divideComponents(left: Cartesian3, right: Cartesian3, result: Cartesian3): Cartesian3 = (^.asInstanceOf[js.Dynamic].applyDynamic("divideComponents")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Cartesian3]
  
  /**
    * Computes the dot (scalar) product of two Cartesians.
    * @param left - The first Cartesian.
    * @param right - The second Cartesian.
    * @returns The dot product.
    */
  inline def dot(left: Cartesian3, right: Cartesian3): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("dot")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  /**
    * Compares the provided Cartesians componentwise and returns
    * <code>true</code> if they are equal, <code>false</code> otherwise.
    * @param [left] - The first Cartesian.
    * @param [right] - The second Cartesian.
    * @returns <code>true</code> if left and right are equal, <code>false</code> otherwise.
    */
  inline def equals(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("equals")().asInstanceOf[Boolean]
  inline def equals(left: Unit, right: Cartesian3): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equals")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def equals(left: Cartesian3): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("equals")(left.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def equals(left: Cartesian3, right: Cartesian3): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equals")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
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
  inline def equalsEpsilon(left: Unit, right: Cartesian3): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equalsEpsilon")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def equalsEpsilon(left: Unit, right: Cartesian3, relativeEpsilon: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equalsEpsilon")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any], relativeEpsilon.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def equalsEpsilon(left: Unit, right: Cartesian3, relativeEpsilon: Double, absoluteEpsilon: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equalsEpsilon")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any], relativeEpsilon.asInstanceOf[js.Any], absoluteEpsilon.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def equalsEpsilon(left: Unit, right: Cartesian3, relativeEpsilon: Unit, absoluteEpsilon: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equalsEpsilon")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any], relativeEpsilon.asInstanceOf[js.Any], absoluteEpsilon.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def equalsEpsilon(left: Cartesian3): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("equalsEpsilon")(left.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def equalsEpsilon(left: Cartesian3, right: Unit, relativeEpsilon: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equalsEpsilon")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any], relativeEpsilon.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def equalsEpsilon(left: Cartesian3, right: Unit, relativeEpsilon: Double, absoluteEpsilon: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equalsEpsilon")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any], relativeEpsilon.asInstanceOf[js.Any], absoluteEpsilon.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def equalsEpsilon(left: Cartesian3, right: Unit, relativeEpsilon: Unit, absoluteEpsilon: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equalsEpsilon")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any], relativeEpsilon.asInstanceOf[js.Any], absoluteEpsilon.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def equalsEpsilon(left: Cartesian3, right: Cartesian3): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equalsEpsilon")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def equalsEpsilon(left: Cartesian3, right: Cartesian3, relativeEpsilon: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equalsEpsilon")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any], relativeEpsilon.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def equalsEpsilon(left: Cartesian3, right: Cartesian3, relativeEpsilon: Double, absoluteEpsilon: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equalsEpsilon")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any], relativeEpsilon.asInstanceOf[js.Any], absoluteEpsilon.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def equalsEpsilon(left: Cartesian3, right: Cartesian3, relativeEpsilon: Unit, absoluteEpsilon: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equalsEpsilon")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any], relativeEpsilon.asInstanceOf[js.Any], absoluteEpsilon.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  /**
    * Creates a Cartesian3 from three consecutive elements in an array.
    * @example
    * // Create a Cartesian3 with (1.0, 2.0, 3.0)
    * const v = [1.0, 2.0, 3.0];
    * const p = Cesium.Cartesian3.fromArray(v);
    *
    * // Create a Cartesian3 with (1.0, 2.0, 3.0) using an offset into an array
    * const v2 = [0.0, 0.0, 1.0, 2.0, 3.0];
    * const p2 = Cesium.Cartesian3.fromArray(v2, 2);
    * @param array - The array whose three consecutive elements correspond to the x, y, and z components, respectively.
    * @param [startingIndex = 0] - The offset into the array of the first element, which corresponds to the x component.
    * @param [result] - The object onto which to store the result.
    * @returns The modified result parameter or a new Cartesian3 instance if one was not provided.
    */
  inline def fromArray(array: js.Array[Double]): Cartesian3 = ^.asInstanceOf[js.Dynamic].applyDynamic("fromArray")(array.asInstanceOf[js.Any]).asInstanceOf[Cartesian3]
  inline def fromArray(array: js.Array[Double], startingIndex: Double): Cartesian3 = (^.asInstanceOf[js.Dynamic].applyDynamic("fromArray")(array.asInstanceOf[js.Any], startingIndex.asInstanceOf[js.Any])).asInstanceOf[Cartesian3]
  inline def fromArray(array: js.Array[Double], startingIndex: Double, result: Cartesian3): Cartesian3 = (^.asInstanceOf[js.Dynamic].applyDynamic("fromArray")(array.asInstanceOf[js.Any], startingIndex.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Cartesian3]
  inline def fromArray(array: js.Array[Double], startingIndex: Unit, result: Cartesian3): Cartesian3 = (^.asInstanceOf[js.Dynamic].applyDynamic("fromArray")(array.asInstanceOf[js.Any], startingIndex.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Cartesian3]
  
  /**
    * Creates a Cartesian3 instance from an existing Cartesian4.  This simply takes the
    * x, y, and z properties of the Cartesian4 and drops w.
    * @param cartesian - The Cartesian4 instance to create a Cartesian3 instance from.
    * @param [result] - The object onto which to store the result.
    * @returns The modified result parameter or a new Cartesian3 instance if one was not provided.
    */
  inline def fromCartesian4(cartesian: Cartesian4): Cartesian3 = ^.asInstanceOf[js.Dynamic].applyDynamic("fromCartesian4")(cartesian.asInstanceOf[js.Any]).asInstanceOf[Cartesian3]
  inline def fromCartesian4(cartesian: Cartesian4, result: Cartesian3): Cartesian3 = (^.asInstanceOf[js.Dynamic].applyDynamic("fromCartesian4")(cartesian.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Cartesian3]
  
  /**
    * Returns a Cartesian3 position from longitude and latitude values given in degrees.
    * @example
    * const position = Cesium.Cartesian3.fromDegrees(-115.0, 37.0);
    * @param longitude - The longitude, in degrees
    * @param latitude - The latitude, in degrees
    * @param [height = 0.0] - The height, in meters, above the ellipsoid.
    * @param [ellipsoid = Ellipsoid.WGS84] - The ellipsoid on which the position lies.
    * @param [result] - The object onto which to store the result.
    * @returns The position
    */
  inline def fromDegrees(longitude: Double, latitude: Double): Cartesian3 = (^.asInstanceOf[js.Dynamic].applyDynamic("fromDegrees")(longitude.asInstanceOf[js.Any], latitude.asInstanceOf[js.Any])).asInstanceOf[Cartesian3]
  inline def fromDegrees(longitude: Double, latitude: Double, height: Double): Cartesian3 = (^.asInstanceOf[js.Dynamic].applyDynamic("fromDegrees")(longitude.asInstanceOf[js.Any], latitude.asInstanceOf[js.Any], height.asInstanceOf[js.Any])).asInstanceOf[Cartesian3]
  inline def fromDegrees(longitude: Double, latitude: Double, height: Double, ellipsoid: Unit, result: Cartesian3): Cartesian3 = (^.asInstanceOf[js.Dynamic].applyDynamic("fromDegrees")(longitude.asInstanceOf[js.Any], latitude.asInstanceOf[js.Any], height.asInstanceOf[js.Any], ellipsoid.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Cartesian3]
  inline def fromDegrees(longitude: Double, latitude: Double, height: Double, ellipsoid: Ellipsoid): Cartesian3 = (^.asInstanceOf[js.Dynamic].applyDynamic("fromDegrees")(longitude.asInstanceOf[js.Any], latitude.asInstanceOf[js.Any], height.asInstanceOf[js.Any], ellipsoid.asInstanceOf[js.Any])).asInstanceOf[Cartesian3]
  inline def fromDegrees(longitude: Double, latitude: Double, height: Double, ellipsoid: Ellipsoid, result: Cartesian3): Cartesian3 = (^.asInstanceOf[js.Dynamic].applyDynamic("fromDegrees")(longitude.asInstanceOf[js.Any], latitude.asInstanceOf[js.Any], height.asInstanceOf[js.Any], ellipsoid.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Cartesian3]
  inline def fromDegrees(longitude: Double, latitude: Double, height: Unit, ellipsoid: Unit, result: Cartesian3): Cartesian3 = (^.asInstanceOf[js.Dynamic].applyDynamic("fromDegrees")(longitude.asInstanceOf[js.Any], latitude.asInstanceOf[js.Any], height.asInstanceOf[js.Any], ellipsoid.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Cartesian3]
  inline def fromDegrees(longitude: Double, latitude: Double, height: Unit, ellipsoid: Ellipsoid): Cartesian3 = (^.asInstanceOf[js.Dynamic].applyDynamic("fromDegrees")(longitude.asInstanceOf[js.Any], latitude.asInstanceOf[js.Any], height.asInstanceOf[js.Any], ellipsoid.asInstanceOf[js.Any])).asInstanceOf[Cartesian3]
  inline def fromDegrees(longitude: Double, latitude: Double, height: Unit, ellipsoid: Ellipsoid, result: Cartesian3): Cartesian3 = (^.asInstanceOf[js.Dynamic].applyDynamic("fromDegrees")(longitude.asInstanceOf[js.Any], latitude.asInstanceOf[js.Any], height.asInstanceOf[js.Any], ellipsoid.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Cartesian3]
  
  /**
    * Returns an array of Cartesian3 positions given an array of longitude and latitude values given in degrees.
    * @example
    * const positions = Cesium.Cartesian3.fromDegreesArray([-115.0, 37.0, -107.0, 33.0]);
    * @param coordinates - A list of longitude and latitude values. Values alternate [longitude, latitude, longitude, latitude...].
    * @param [ellipsoid = Ellipsoid.WGS84] - The ellipsoid on which the coordinates lie.
    * @param [result] - An array of Cartesian3 objects to store the result.
    * @returns The array of positions.
    */
  inline def fromDegreesArray(coordinates: js.Array[Double]): js.Array[Cartesian3] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromDegreesArray")(coordinates.asInstanceOf[js.Any]).asInstanceOf[js.Array[Cartesian3]]
  inline def fromDegreesArray(coordinates: js.Array[Double], ellipsoid: Unit, result: js.Array[Cartesian3]): js.Array[Cartesian3] = (^.asInstanceOf[js.Dynamic].applyDynamic("fromDegreesArray")(coordinates.asInstanceOf[js.Any], ellipsoid.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[js.Array[Cartesian3]]
  inline def fromDegreesArray(coordinates: js.Array[Double], ellipsoid: Ellipsoid): js.Array[Cartesian3] = (^.asInstanceOf[js.Dynamic].applyDynamic("fromDegreesArray")(coordinates.asInstanceOf[js.Any], ellipsoid.asInstanceOf[js.Any])).asInstanceOf[js.Array[Cartesian3]]
  inline def fromDegreesArray(coordinates: js.Array[Double], ellipsoid: Ellipsoid, result: js.Array[Cartesian3]): js.Array[Cartesian3] = (^.asInstanceOf[js.Dynamic].applyDynamic("fromDegreesArray")(coordinates.asInstanceOf[js.Any], ellipsoid.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[js.Array[Cartesian3]]
  
  /**
    * Returns an array of Cartesian3 positions given an array of longitude, latitude and height values where longitude and latitude are given in degrees.
    * @example
    * const positions = Cesium.Cartesian3.fromDegreesArrayHeights([-115.0, 37.0, 100000.0, -107.0, 33.0, 150000.0]);
    * @param coordinates - A list of longitude, latitude and height values. Values alternate [longitude, latitude, height, longitude, latitude, height...].
    * @param [ellipsoid = Ellipsoid.WGS84] - The ellipsoid on which the position lies.
    * @param [result] - An array of Cartesian3 objects to store the result.
    * @returns The array of positions.
    */
  inline def fromDegreesArrayHeights(coordinates: js.Array[Double]): js.Array[Cartesian3] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromDegreesArrayHeights")(coordinates.asInstanceOf[js.Any]).asInstanceOf[js.Array[Cartesian3]]
  inline def fromDegreesArrayHeights(coordinates: js.Array[Double], ellipsoid: Unit, result: js.Array[Cartesian3]): js.Array[Cartesian3] = (^.asInstanceOf[js.Dynamic].applyDynamic("fromDegreesArrayHeights")(coordinates.asInstanceOf[js.Any], ellipsoid.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[js.Array[Cartesian3]]
  inline def fromDegreesArrayHeights(coordinates: js.Array[Double], ellipsoid: Ellipsoid): js.Array[Cartesian3] = (^.asInstanceOf[js.Dynamic].applyDynamic("fromDegreesArrayHeights")(coordinates.asInstanceOf[js.Any], ellipsoid.asInstanceOf[js.Any])).asInstanceOf[js.Array[Cartesian3]]
  inline def fromDegreesArrayHeights(coordinates: js.Array[Double], ellipsoid: Ellipsoid, result: js.Array[Cartesian3]): js.Array[Cartesian3] = (^.asInstanceOf[js.Dynamic].applyDynamic("fromDegreesArrayHeights")(coordinates.asInstanceOf[js.Any], ellipsoid.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[js.Array[Cartesian3]]
  
  /**
    * Creates a Cartesian3 instance from x, y and z coordinates.
    * @param x - The x coordinate.
    * @param y - The y coordinate.
    * @param z - The z coordinate.
    * @param [result] - The object onto which to store the result.
    * @returns The modified result parameter or a new Cartesian3 instance if one was not provided.
    */
  inline def fromElements(x: Double, y: Double, z: Double): Cartesian3 = (^.asInstanceOf[js.Dynamic].applyDynamic("fromElements")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], z.asInstanceOf[js.Any])).asInstanceOf[Cartesian3]
  inline def fromElements(x: Double, y: Double, z: Double, result: Cartesian3): Cartesian3 = (^.asInstanceOf[js.Dynamic].applyDynamic("fromElements")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], z.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Cartesian3]
  
  /**
    * Returns a Cartesian3 position from longitude and latitude values given in radians.
    * @example
    * const position = Cesium.Cartesian3.fromRadians(-2.007, 0.645);
    * @param longitude - The longitude, in radians
    * @param latitude - The latitude, in radians
    * @param [height = 0.0] - The height, in meters, above the ellipsoid.
    * @param [ellipsoid = Ellipsoid.WGS84] - The ellipsoid on which the position lies.
    * @param [result] - The object onto which to store the result.
    * @returns The position
    */
  inline def fromRadians(longitude: Double, latitude: Double): Cartesian3 = (^.asInstanceOf[js.Dynamic].applyDynamic("fromRadians")(longitude.asInstanceOf[js.Any], latitude.asInstanceOf[js.Any])).asInstanceOf[Cartesian3]
  inline def fromRadians(longitude: Double, latitude: Double, height: Double): Cartesian3 = (^.asInstanceOf[js.Dynamic].applyDynamic("fromRadians")(longitude.asInstanceOf[js.Any], latitude.asInstanceOf[js.Any], height.asInstanceOf[js.Any])).asInstanceOf[Cartesian3]
  inline def fromRadians(longitude: Double, latitude: Double, height: Double, ellipsoid: Unit, result: Cartesian3): Cartesian3 = (^.asInstanceOf[js.Dynamic].applyDynamic("fromRadians")(longitude.asInstanceOf[js.Any], latitude.asInstanceOf[js.Any], height.asInstanceOf[js.Any], ellipsoid.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Cartesian3]
  inline def fromRadians(longitude: Double, latitude: Double, height: Double, ellipsoid: Ellipsoid): Cartesian3 = (^.asInstanceOf[js.Dynamic].applyDynamic("fromRadians")(longitude.asInstanceOf[js.Any], latitude.asInstanceOf[js.Any], height.asInstanceOf[js.Any], ellipsoid.asInstanceOf[js.Any])).asInstanceOf[Cartesian3]
  inline def fromRadians(longitude: Double, latitude: Double, height: Double, ellipsoid: Ellipsoid, result: Cartesian3): Cartesian3 = (^.asInstanceOf[js.Dynamic].applyDynamic("fromRadians")(longitude.asInstanceOf[js.Any], latitude.asInstanceOf[js.Any], height.asInstanceOf[js.Any], ellipsoid.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Cartesian3]
  inline def fromRadians(longitude: Double, latitude: Double, height: Unit, ellipsoid: Unit, result: Cartesian3): Cartesian3 = (^.asInstanceOf[js.Dynamic].applyDynamic("fromRadians")(longitude.asInstanceOf[js.Any], latitude.asInstanceOf[js.Any], height.asInstanceOf[js.Any], ellipsoid.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Cartesian3]
  inline def fromRadians(longitude: Double, latitude: Double, height: Unit, ellipsoid: Ellipsoid): Cartesian3 = (^.asInstanceOf[js.Dynamic].applyDynamic("fromRadians")(longitude.asInstanceOf[js.Any], latitude.asInstanceOf[js.Any], height.asInstanceOf[js.Any], ellipsoid.asInstanceOf[js.Any])).asInstanceOf[Cartesian3]
  inline def fromRadians(longitude: Double, latitude: Double, height: Unit, ellipsoid: Ellipsoid, result: Cartesian3): Cartesian3 = (^.asInstanceOf[js.Dynamic].applyDynamic("fromRadians")(longitude.asInstanceOf[js.Any], latitude.asInstanceOf[js.Any], height.asInstanceOf[js.Any], ellipsoid.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Cartesian3]
  
  /**
    * Returns an array of Cartesian3 positions given an array of longitude and latitude values given in radians.
    * @example
    * const positions = Cesium.Cartesian3.fromRadiansArray([-2.007, 0.645, -1.867, .575]);
    * @param coordinates - A list of longitude and latitude values. Values alternate [longitude, latitude, longitude, latitude...].
    * @param [ellipsoid = Ellipsoid.WGS84] - The ellipsoid on which the coordinates lie.
    * @param [result] - An array of Cartesian3 objects to store the result.
    * @returns The array of positions.
    */
  inline def fromRadiansArray(coordinates: js.Array[Double]): js.Array[Cartesian3] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromRadiansArray")(coordinates.asInstanceOf[js.Any]).asInstanceOf[js.Array[Cartesian3]]
  inline def fromRadiansArray(coordinates: js.Array[Double], ellipsoid: Unit, result: js.Array[Cartesian3]): js.Array[Cartesian3] = (^.asInstanceOf[js.Dynamic].applyDynamic("fromRadiansArray")(coordinates.asInstanceOf[js.Any], ellipsoid.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[js.Array[Cartesian3]]
  inline def fromRadiansArray(coordinates: js.Array[Double], ellipsoid: Ellipsoid): js.Array[Cartesian3] = (^.asInstanceOf[js.Dynamic].applyDynamic("fromRadiansArray")(coordinates.asInstanceOf[js.Any], ellipsoid.asInstanceOf[js.Any])).asInstanceOf[js.Array[Cartesian3]]
  inline def fromRadiansArray(coordinates: js.Array[Double], ellipsoid: Ellipsoid, result: js.Array[Cartesian3]): js.Array[Cartesian3] = (^.asInstanceOf[js.Dynamic].applyDynamic("fromRadiansArray")(coordinates.asInstanceOf[js.Any], ellipsoid.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[js.Array[Cartesian3]]
  
  /**
    * Returns an array of Cartesian3 positions given an array of longitude, latitude and height values where longitude and latitude are given in radians.
    * @example
    * const positions = Cesium.Cartesian3.fromRadiansArrayHeights([-2.007, 0.645, 100000.0, -1.867, .575, 150000.0]);
    * @param coordinates - A list of longitude, latitude and height values. Values alternate [longitude, latitude, height, longitude, latitude, height...].
    * @param [ellipsoid = Ellipsoid.WGS84] - The ellipsoid on which the position lies.
    * @param [result] - An array of Cartesian3 objects to store the result.
    * @returns The array of positions.
    */
  inline def fromRadiansArrayHeights(coordinates: js.Array[Double]): js.Array[Cartesian3] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromRadiansArrayHeights")(coordinates.asInstanceOf[js.Any]).asInstanceOf[js.Array[Cartesian3]]
  inline def fromRadiansArrayHeights(coordinates: js.Array[Double], ellipsoid: Unit, result: js.Array[Cartesian3]): js.Array[Cartesian3] = (^.asInstanceOf[js.Dynamic].applyDynamic("fromRadiansArrayHeights")(coordinates.asInstanceOf[js.Any], ellipsoid.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[js.Array[Cartesian3]]
  inline def fromRadiansArrayHeights(coordinates: js.Array[Double], ellipsoid: Ellipsoid): js.Array[Cartesian3] = (^.asInstanceOf[js.Dynamic].applyDynamic("fromRadiansArrayHeights")(coordinates.asInstanceOf[js.Any], ellipsoid.asInstanceOf[js.Any])).asInstanceOf[js.Array[Cartesian3]]
  inline def fromRadiansArrayHeights(coordinates: js.Array[Double], ellipsoid: Ellipsoid, result: js.Array[Cartesian3]): js.Array[Cartesian3] = (^.asInstanceOf[js.Dynamic].applyDynamic("fromRadiansArrayHeights")(coordinates.asInstanceOf[js.Any], ellipsoid.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[js.Array[Cartesian3]]
  
  /**
    * Converts the provided Spherical into Cartesian3 coordinates.
    * @param spherical - The Spherical to be converted to Cartesian3.
    * @param [result] - The object onto which to store the result.
    * @returns The modified result parameter or a new Cartesian3 instance if one was not provided.
    */
  inline def fromSpherical(spherical: Spherical): Cartesian3 = ^.asInstanceOf[js.Dynamic].applyDynamic("fromSpherical")(spherical.asInstanceOf[js.Any]).asInstanceOf[Cartesian3]
  inline def fromSpherical(spherical: Spherical, result: Cartesian3): Cartesian3 = (^.asInstanceOf[js.Dynamic].applyDynamic("fromSpherical")(spherical.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Cartesian3]
  
  /**
    * Computes the linear interpolation or extrapolation at t using the provided cartesians.
    * @param start - The value corresponding to t at 0.0.
    * @param end - The value corresponding to t at 1.0.
    * @param t - The point along t at which to interpolate.
    * @param result - The object onto which to store the result.
    * @returns The modified result parameter.
    */
  inline def lerp(start: Cartesian3, end: Cartesian3, t: Double, result: Cartesian3): Cartesian3 = (^.asInstanceOf[js.Dynamic].applyDynamic("lerp")(start.asInstanceOf[js.Any], end.asInstanceOf[js.Any], t.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Cartesian3]
  
  /**
    * Computes the Cartesian's magnitude (length).
    * @param cartesian - The Cartesian instance whose magnitude is to be computed.
    * @returns The magnitude.
    */
  inline def magnitude(cartesian: Cartesian3): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("magnitude")(cartesian.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  /**
    * Computes the provided Cartesian's squared magnitude.
    * @param cartesian - The Cartesian instance whose squared magnitude is to be computed.
    * @returns The squared magnitude.
    */
  inline def magnitudeSquared(cartesian: Cartesian3): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("magnitudeSquared")(cartesian.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  /**
    * Compares two Cartesians and computes a Cartesian which contains the maximum components of the supplied Cartesians.
    * @param first - A cartesian to compare.
    * @param second - A cartesian to compare.
    * @param result - The object into which to store the result.
    * @returns A cartesian with the maximum components.
    */
  inline def maximumByComponent(first: Cartesian3, second: Cartesian3, result: Cartesian3): Cartesian3 = (^.asInstanceOf[js.Dynamic].applyDynamic("maximumByComponent")(first.asInstanceOf[js.Any], second.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Cartesian3]
  
  /**
    * Computes the value of the maximum component for the supplied Cartesian.
    * @param cartesian - The cartesian to use.
    * @returns The value of the maximum component.
    */
  inline def maximumComponent(cartesian: Cartesian3): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("maximumComponent")(cartesian.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  /**
    * Computes the midpoint between the right and left Cartesian.
    * @param left - The first Cartesian.
    * @param right - The second Cartesian.
    * @param result - The object onto which to store the result.
    * @returns The midpoint.
    */
  inline def midpoint(left: Cartesian3, right: Cartesian3, result: Cartesian3): Cartesian3 = (^.asInstanceOf[js.Dynamic].applyDynamic("midpoint")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Cartesian3]
  
  /**
    * Compares two Cartesians and computes a Cartesian which contains the minimum components of the supplied Cartesians.
    * @param first - A cartesian to compare.
    * @param second - A cartesian to compare.
    * @param result - The object into which to store the result.
    * @returns A cartesian with the minimum components.
    */
  inline def minimumByComponent(first: Cartesian3, second: Cartesian3, result: Cartesian3): Cartesian3 = (^.asInstanceOf[js.Dynamic].applyDynamic("minimumByComponent")(first.asInstanceOf[js.Any], second.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Cartesian3]
  
  /**
    * Computes the value of the minimum component for the supplied Cartesian.
    * @param cartesian - The cartesian to use.
    * @returns The value of the minimum component.
    */
  inline def minimumComponent(cartesian: Cartesian3): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("minimumComponent")(cartesian.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  /**
    * Returns the axis that is most orthogonal to the provided Cartesian.
    * @param cartesian - The Cartesian on which to find the most orthogonal axis.
    * @param result - The object onto which to store the result.
    * @returns The most orthogonal axis.
    */
  inline def mostOrthogonalAxis(cartesian: Cartesian3, result: Cartesian3): Cartesian3 = (^.asInstanceOf[js.Dynamic].applyDynamic("mostOrthogonalAxis")(cartesian.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Cartesian3]
  
  /**
    * Multiplies the provided Cartesian componentwise by the provided scalar.
    * @param cartesian - The Cartesian to be scaled.
    * @param scalar - The scalar to multiply with.
    * @param result - The object onto which to store the result.
    * @returns The modified result parameter.
    */
  inline def multiplyByScalar(cartesian: Cartesian3, scalar: Double, result: Cartesian3): Cartesian3 = (^.asInstanceOf[js.Dynamic].applyDynamic("multiplyByScalar")(cartesian.asInstanceOf[js.Any], scalar.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Cartesian3]
  
  /**
    * Computes the componentwise product of two Cartesians.
    * @param left - The first Cartesian.
    * @param right - The second Cartesian.
    * @param result - The object onto which to store the result.
    * @returns The modified result parameter.
    */
  inline def multiplyComponents(left: Cartesian3, right: Cartesian3, result: Cartesian3): Cartesian3 = (^.asInstanceOf[js.Dynamic].applyDynamic("multiplyComponents")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Cartesian3]
  
  /**
    * Negates the provided Cartesian.
    * @param cartesian - The Cartesian to be negated.
    * @param result - The object onto which to store the result.
    * @returns The modified result parameter.
    */
  inline def negate(cartesian: Cartesian3, result: Cartesian3): Cartesian3 = (^.asInstanceOf[js.Dynamic].applyDynamic("negate")(cartesian.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Cartesian3]
  
  /**
    * Computes the normalized form of the supplied Cartesian.
    * @param cartesian - The Cartesian to be normalized.
    * @param result - The object onto which to store the result.
    * @returns The modified result parameter.
    */
  inline def normalize(cartesian: Cartesian3, result: Cartesian3): Cartesian3 = (^.asInstanceOf[js.Dynamic].applyDynamic("normalize")(cartesian.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Cartesian3]
  
  /**
    * Stores the provided instance into the provided array.
    * @param value - The value to pack.
    * @param array - The array to pack into.
    * @param [startingIndex = 0] - The index into the array at which to start packing the elements.
    * @returns The array that was packed into
    */
  inline def pack(value: Cartesian3, array: js.Array[Double]): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("pack")(value.asInstanceOf[js.Any], array.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
  inline def pack(value: Cartesian3, array: js.Array[Double], startingIndex: Double): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("pack")(value.asInstanceOf[js.Any], array.asInstanceOf[js.Any], startingIndex.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
  
  /**
    * Flattens an array of Cartesian3s into an array of components.
    * @param array - The array of cartesians to pack.
    * @param [result] - The array onto which to store the result. If this is a typed array, it must have array.length * 3 components, else a {@link DeveloperError} will be thrown. If it is a regular array, it will be resized to have (array.length * 3) elements.
    * @returns The packed array.
    */
  inline def packArray(array: js.Array[Cartesian3]): js.Array[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("packArray")(array.asInstanceOf[js.Any]).asInstanceOf[js.Array[Double]]
  inline def packArray(array: js.Array[Cartesian3], result: js.Array[Double]): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("packArray")(array.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
  
  /**
    * The number of elements used to pack the object into an array.
    */
  @JSImport("@cesium/engine", "Cartesian3.packedLength")
  @js.native
  def packedLength: Double = js.native
  inline def packedLength_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("packedLength")(x.asInstanceOf[js.Any])
  
  /**
    * Projects vector a onto vector b
    * @param a - The vector that needs projecting
    * @param b - The vector to project onto
    * @param result - The result cartesian
    * @returns The modified result parameter
    */
  inline def projectVector(a: Cartesian3, b: Cartesian3, result: Cartesian3): Cartesian3 = (^.asInstanceOf[js.Dynamic].applyDynamic("projectVector")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Cartesian3]
  
  /**
    * Computes the componentwise difference of two Cartesians.
    * @param left - The first Cartesian.
    * @param right - The second Cartesian.
    * @param result - The object onto which to store the result.
    * @returns The modified result parameter.
    */
  inline def subtract(left: Cartesian3, right: Cartesian3, result: Cartesian3): Cartesian3 = (^.asInstanceOf[js.Dynamic].applyDynamic("subtract")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Cartesian3]
  
  /**
    * Retrieves an instance from a packed array.
    * @param array - The packed array.
    * @param [startingIndex = 0] - The starting index of the element to be unpacked.
    * @param [result] - The object into which to store the result.
    * @returns The modified result parameter or a new Cartesian3 instance if one was not provided.
    */
  inline def unpack(array: js.Array[Double]): Cartesian3 = ^.asInstanceOf[js.Dynamic].applyDynamic("unpack")(array.asInstanceOf[js.Any]).asInstanceOf[Cartesian3]
  inline def unpack(array: js.Array[Double], startingIndex: Double): Cartesian3 = (^.asInstanceOf[js.Dynamic].applyDynamic("unpack")(array.asInstanceOf[js.Any], startingIndex.asInstanceOf[js.Any])).asInstanceOf[Cartesian3]
  inline def unpack(array: js.Array[Double], startingIndex: Double, result: Cartesian3): Cartesian3 = (^.asInstanceOf[js.Dynamic].applyDynamic("unpack")(array.asInstanceOf[js.Any], startingIndex.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Cartesian3]
  inline def unpack(array: js.Array[Double], startingIndex: Unit, result: Cartesian3): Cartesian3 = (^.asInstanceOf[js.Dynamic].applyDynamic("unpack")(array.asInstanceOf[js.Any], startingIndex.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Cartesian3]
  
  /**
    * Unpacks an array of cartesian components into an array of Cartesian3s.
    * @param array - The array of components to unpack.
    * @param [result] - The array onto which to store the result.
    * @returns The unpacked array.
    */
  inline def unpackArray(array: js.Array[Double]): js.Array[Cartesian3] = ^.asInstanceOf[js.Dynamic].applyDynamic("unpackArray")(array.asInstanceOf[js.Any]).asInstanceOf[js.Array[Cartesian3]]
  inline def unpackArray(array: js.Array[Double], result: js.Array[Cartesian3]): js.Array[Cartesian3] = (^.asInstanceOf[js.Dynamic].applyDynamic("unpackArray")(array.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[js.Array[Cartesian3]]
}
