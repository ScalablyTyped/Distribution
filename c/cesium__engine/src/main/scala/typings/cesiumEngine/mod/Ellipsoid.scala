package typings.cesiumEngine.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@cesium/engine", "Ellipsoid")
@js.native
open class Ellipsoid () extends StObject {
  def this(x: Double) = this()
  def this(x: Double, y: Double) = this()
  def this(x: Unit, y: Double) = this()
  def this(x: Double, y: Double, z: Double) = this()
  def this(x: Double, y: Unit, z: Double) = this()
  def this(x: Unit, y: Double, z: Double) = this()
  def this(x: Unit, y: Unit, z: Double) = this()
  
  /**
    * Converts the provided array of cartesians to an array of cartographics.
    * @example
    * //Create an array of Cartesians and determine their Cartographic representation on a WGS84 ellipsoid.
    * const positions = [new Cesium.Cartesian3(17832.12, 83234.52, 952313.73),
    *                  new Cesium.Cartesian3(17832.13, 83234.53, 952313.73),
    *                  new Cesium.Cartesian3(17832.14, 83234.54, 952313.73)]
    * const cartographicPositions = Cesium.Ellipsoid.WGS84.cartesianArrayToCartographicArray(positions);
    * @param cartesians - An array of Cartesian positions.
    * @param [result] - The object onto which to store the result.
    * @returns The modified result parameter or a new Array instance if none was provided.
    */
  def cartesianArrayToCartographicArray(cartesians: js.Array[Cartesian3]): js.Array[Cartographic] = js.native
  def cartesianArrayToCartographicArray(cartesians: js.Array[Cartesian3], result: js.Array[Cartographic]): js.Array[Cartographic] = js.native
  
  /**
    * Converts the provided cartesian to cartographic representation.
    * The cartesian is undefined at the center of the ellipsoid.
    * @example
    * //Create a Cartesian and determine it's Cartographic representation on a WGS84 ellipsoid.
    * const position = new Cesium.Cartesian3(17832.12, 83234.52, 952313.73);
    * const cartographicPosition = Cesium.Ellipsoid.WGS84.cartesianToCartographic(position);
    * @param cartesian - The Cartesian position to convert to cartographic representation.
    * @param [result] - The object onto which to store the result.
    * @returns The modified result parameter, new Cartographic instance if none was provided, or undefined if the cartesian is at the center of the ellipsoid.
    */
  def cartesianToCartographic(cartesian: Cartesian3): Cartographic = js.native
  def cartesianToCartographic(cartesian: Cartesian3, result: Cartographic): Cartographic = js.native
  
  /**
    * Converts the provided array of cartographics to an array of Cartesians.
    * @example
    * //Convert an array of Cartographics and determine their Cartesian representation on a WGS84 ellipsoid.
    * const positions = [new Cesium.Cartographic(Cesium.Math.toRadians(21), Cesium.Math.toRadians(78), 0),
    *                  new Cesium.Cartographic(Cesium.Math.toRadians(21.321), Cesium.Math.toRadians(78.123), 100),
    *                  new Cesium.Cartographic(Cesium.Math.toRadians(21.645), Cesium.Math.toRadians(78.456), 250)];
    * const cartesianPositions = Cesium.Ellipsoid.WGS84.cartographicArrayToCartesianArray(positions);
    * @param cartographics - An array of cartographic positions.
    * @param [result] - The object onto which to store the result.
    * @returns The modified result parameter or a new Array instance if none was provided.
    */
  def cartographicArrayToCartesianArray(cartographics: js.Array[Cartographic]): js.Array[Cartesian3] = js.native
  def cartographicArrayToCartesianArray(cartographics: js.Array[Cartographic], result: js.Array[Cartesian3]): js.Array[Cartesian3] = js.native
  
  /**
    * Converts the provided cartographic to Cartesian representation.
    * @example
    * //Create a Cartographic and determine it's Cartesian representation on a WGS84 ellipsoid.
    * const position = new Cesium.Cartographic(Cesium.Math.toRadians(21), Cesium.Math.toRadians(78), 5000);
    * const cartesianPosition = Cesium.Ellipsoid.WGS84.cartographicToCartesian(position);
    * @param cartographic - The cartographic position.
    * @param [result] - The object onto which to store the result.
    * @returns The modified result parameter or a new Cartesian3 instance if none was provided.
    */
  def cartographicToCartesian(cartographic: Cartographic): Cartesian3 = js.native
  def cartographicToCartesian(cartographic: Cartographic, result: Cartesian3): Cartesian3 = js.native
  
  def clone(result: Ellipsoid): Ellipsoid = js.native
  
  /**
    * Compares this Ellipsoid against the provided Ellipsoid componentwise and returns
    * <code>true</code> if they are equal, <code>false</code> otherwise.
    * @param [right] - The other Ellipsoid.
    * @returns <code>true</code> if they are equal, <code>false</code> otherwise.
    */
  def equals(): Boolean = js.native
  def equals(right: Ellipsoid): Boolean = js.native
  
  /**
    * Computes the unit vector directed from the center of this ellipsoid toward the provided Cartesian position.
    * @param cartesian - The Cartesian for which to to determine the geocentric normal.
    * @param [result] - The object onto which to store the result.
    * @returns The modified result parameter or a new Cartesian3 instance if none was provided.
    */
  def geocentricSurfaceNormal(cartesian: Cartesian3): Cartesian3 = js.native
  def geocentricSurfaceNormal(cartesian: Cartesian3, result: Cartesian3): Cartesian3 = js.native
  
  /**
    * Computes the normal of the plane tangent to the surface of the ellipsoid at the provided position.
    * @param cartesian - The Cartesian position for which to to determine the surface normal.
    * @param [result] - The object onto which to store the result.
    * @returns The modified result parameter or a new Cartesian3 instance if none was provided, or undefined if a normal cannot be found.
    */
  def geodeticSurfaceNormal(cartesian: Cartesian3): Cartesian3 = js.native
  def geodeticSurfaceNormal(cartesian: Cartesian3, result: Cartesian3): Cartesian3 = js.native
  
  /**
    * Computes the normal of the plane tangent to the surface of the ellipsoid at the provided position.
    * @param cartographic - The cartographic position for which to to determine the geodetic normal.
    * @param [result] - The object onto which to store the result.
    * @returns The modified result parameter or a new Cartesian3 instance if none was provided.
    */
  def geodeticSurfaceNormalCartographic(cartographic: Cartographic): Cartesian3 = js.native
  def geodeticSurfaceNormalCartographic(cartographic: Cartographic, result: Cartesian3): Cartesian3 = js.native
  
  /**
    * Computes a point which is the intersection of the surface normal with the z-axis.
    * @param position - the position. must be on the surface of the ellipsoid.
    * @param [buffer = 0.0] - A buffer to subtract from the ellipsoid size when checking if the point is inside the ellipsoid.
    *                                In earth case, with common earth datums, there is no need for this buffer since the intersection point is always (relatively) very close to the center.
    *                                In WGS84 datum, intersection point is at max z = +-42841.31151331382 (0.673% of z-axis).
    *                                Intersection point could be outside the ellipsoid if the ratio of MajorAxis / AxisOfRotation is bigger than the square root of 2
    * @param [result] - The cartesian to which to copy the result, or undefined to create and
    *        return a new instance.
    * @returns the intersection point if it's inside the ellipsoid, undefined otherwise
    */
  def getSurfaceNormalIntersectionWithZAxis(position: Cartesian3): js.UndefOr[Cartesian3] = js.native
  def getSurfaceNormalIntersectionWithZAxis(position: Cartesian3, buffer: Double): js.UndefOr[Cartesian3] = js.native
  def getSurfaceNormalIntersectionWithZAxis(position: Cartesian3, buffer: Double, result: Cartesian3): js.UndefOr[Cartesian3] = js.native
  def getSurfaceNormalIntersectionWithZAxis(position: Cartesian3, buffer: Unit, result: Cartesian3): js.UndefOr[Cartesian3] = js.native
  
  /**
    * Gets the maximum radius of the ellipsoid.
    */
  val maximumRadius: Double = js.native
  
  /**
    * Gets the minimum radius of the ellipsoid.
    */
  val minimumRadius: Double = js.native
  
  /**
    * Gets one over the radii of the ellipsoid.
    */
  val oneOverRadii: Cartesian3 = js.native
  
  /**
    * Gets one over the squared radii of the ellipsoid.
    */
  val oneOverRadiiSquared: Cartesian3 = js.native
  
  /**
    * Gets the radii of the ellipsoid.
    */
  val radii: Cartesian3 = js.native
  
  /**
    * Gets the squared radii of the ellipsoid.
    */
  val radiiSquared: Cartesian3 = js.native
  
  /**
    * Gets the radii of the ellipsoid raise to the fourth power.
    */
  val radiiToTheFourth: Cartesian3 = js.native
  
  /**
    * Scales the provided Cartesian position along the geocentric surface normal
    * so that it is on the surface of this ellipsoid.
    * @param cartesian - The Cartesian position to scale.
    * @param [result] - The object onto which to store the result.
    * @returns The modified result parameter or a new Cartesian3 instance if none was provided.
    */
  def scaleToGeocentricSurface(cartesian: Cartesian3): Cartesian3 = js.native
  def scaleToGeocentricSurface(cartesian: Cartesian3, result: Cartesian3): Cartesian3 = js.native
  
  /**
    * Scales the provided Cartesian position along the geodetic surface normal
    * so that it is on the surface of this ellipsoid.  If the position is
    * at the center of the ellipsoid, this function returns undefined.
    * @param cartesian - The Cartesian position to scale.
    * @param [result] - The object onto which to store the result.
    * @returns The modified result parameter, a new Cartesian3 instance if none was provided, or undefined if the position is at the center.
    */
  def scaleToGeodeticSurface(cartesian: Cartesian3): Cartesian3 = js.native
  def scaleToGeodeticSurface(cartesian: Cartesian3, result: Cartesian3): Cartesian3 = js.native
  
  /**
    * Computes an approximation of the surface area of a rectangle on the surface of an ellipsoid using
    * Gauss-Legendre 10th order quadrature.
    * @param rectangle - The rectangle used for computing the surface area.
    * @returns The approximate area of the rectangle on the surface of this ellipsoid.
    */
  def surfaceArea(rectangle: Rectangle): Double = js.native
  
  /**
    * Transforms a Cartesian X, Y, Z position from the ellipsoid-scaled space by multiplying
    * its components by the result of {@link Ellipsoid#radii}.
    * @param position - The position to transform.
    * @param [result] - The position to which to copy the result, or undefined to create and
    *        return a new instance.
    * @returns The position expressed in the unscaled space.  The returned instance is the
    *          one passed as the result parameter if it is not undefined, or a new instance of it is.
    */
  def transformPositionFromScaledSpace(position: Cartesian3): Cartesian3 = js.native
  def transformPositionFromScaledSpace(position: Cartesian3, result: Cartesian3): Cartesian3 = js.native
  
  /**
    * Transforms a Cartesian X, Y, Z position to the ellipsoid-scaled space by multiplying
    * its components by the result of {@link Ellipsoid#oneOverRadii}.
    * @param position - The position to transform.
    * @param [result] - The position to which to copy the result, or undefined to create and
    *        return a new instance.
    * @returns The position expressed in the scaled space.  The returned instance is the
    *          one passed as the result parameter if it is not undefined, or a new instance of it is.
    */
  def transformPositionToScaledSpace(position: Cartesian3): Cartesian3 = js.native
  def transformPositionToScaledSpace(position: Cartesian3, result: Cartesian3): Cartesian3 = js.native
}
/* static members */
object Ellipsoid {
  
  @JSImport("@cesium/engine", "Ellipsoid")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * An Ellipsoid instance initialized to a sphere with the lunar radius.
    */
  @JSImport("@cesium/engine", "Ellipsoid.MOON")
  @js.native
  val MOON: Ellipsoid = js.native
  
  /**
    * An Ellipsoid instance initialized to radii of (1.0, 1.0, 1.0).
    */
  @JSImport("@cesium/engine", "Ellipsoid.UNIT_SPHERE")
  @js.native
  val UNIT_SPHERE: Ellipsoid = js.native
  
  /**
    * An Ellipsoid instance initialized to the WGS84 standard.
    */
  @JSImport("@cesium/engine", "Ellipsoid.WGS84")
  @js.native
  val WGS84: Ellipsoid = js.native
  
  /**
    * Duplicates an Ellipsoid instance.
    * @param ellipsoid - The ellipsoid to duplicate.
    * @param [result] - The object onto which to store the result, or undefined if a new
    *                    instance should be created.
    * @returns The cloned Ellipsoid. (Returns undefined if ellipsoid is undefined)
    */
  inline def clone(ellipsoid: Ellipsoid): Ellipsoid = ^.asInstanceOf[js.Dynamic].applyDynamic("clone")(ellipsoid.asInstanceOf[js.Any]).asInstanceOf[Ellipsoid]
  inline def clone(ellipsoid: Ellipsoid, result: Ellipsoid): Ellipsoid = (^.asInstanceOf[js.Dynamic].applyDynamic("clone")(ellipsoid.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Ellipsoid]
  
  /**
    * Computes an Ellipsoid from a Cartesian specifying the radii in x, y, and z directions.
    * @param [cartesian = Cartesian3.ZERO] - The ellipsoid's radius in the x, y, and z directions.
    * @param [result] - The object onto which to store the result, or undefined if a new
    *                    instance should be created.
    * @returns A new Ellipsoid instance.
    */
  inline def fromCartesian3(): Ellipsoid = ^.asInstanceOf[js.Dynamic].applyDynamic("fromCartesian3")().asInstanceOf[Ellipsoid]
  inline def fromCartesian3(cartesian: Unit, result: Ellipsoid): Ellipsoid = (^.asInstanceOf[js.Dynamic].applyDynamic("fromCartesian3")(cartesian.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Ellipsoid]
  inline def fromCartesian3(cartesian: Cartesian3): Ellipsoid = ^.asInstanceOf[js.Dynamic].applyDynamic("fromCartesian3")(cartesian.asInstanceOf[js.Any]).asInstanceOf[Ellipsoid]
  inline def fromCartesian3(cartesian: Cartesian3, result: Ellipsoid): Ellipsoid = (^.asInstanceOf[js.Dynamic].applyDynamic("fromCartesian3")(cartesian.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Ellipsoid]
  
  /**
    * Stores the provided instance into the provided array.
    * @param value - The value to pack.
    * @param array - The array to pack into.
    * @param [startingIndex = 0] - The index into the array at which to start packing the elements.
    * @returns The array that was packed into
    */
  inline def pack(value: Ellipsoid, array: js.Array[Double]): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("pack")(value.asInstanceOf[js.Any], array.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
  inline def pack(value: Ellipsoid, array: js.Array[Double], startingIndex: Double): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("pack")(value.asInstanceOf[js.Any], array.asInstanceOf[js.Any], startingIndex.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
  
  /**
    * The number of elements used to pack the object into an array.
    */
  @JSImport("@cesium/engine", "Ellipsoid.packedLength")
  @js.native
  def packedLength: Double = js.native
  inline def packedLength_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("packedLength")(x.asInstanceOf[js.Any])
  
  /**
    * Retrieves an instance from a packed array.
    * @param array - The packed array.
    * @param [startingIndex = 0] - The starting index of the element to be unpacked.
    * @param [result] - The object into which to store the result.
    * @returns The modified result parameter or a new Ellipsoid instance if one was not provided.
    */
  inline def unpack(array: js.Array[Double]): Ellipsoid = ^.asInstanceOf[js.Dynamic].applyDynamic("unpack")(array.asInstanceOf[js.Any]).asInstanceOf[Ellipsoid]
  inline def unpack(array: js.Array[Double], startingIndex: Double): Ellipsoid = (^.asInstanceOf[js.Dynamic].applyDynamic("unpack")(array.asInstanceOf[js.Any], startingIndex.asInstanceOf[js.Any])).asInstanceOf[Ellipsoid]
  inline def unpack(array: js.Array[Double], startingIndex: Double, result: Ellipsoid): Ellipsoid = (^.asInstanceOf[js.Dynamic].applyDynamic("unpack")(array.asInstanceOf[js.Any], startingIndex.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Ellipsoid]
  inline def unpack(array: js.Array[Double], startingIndex: Unit, result: Ellipsoid): Ellipsoid = (^.asInstanceOf[js.Dynamic].applyDynamic("unpack")(array.asInstanceOf[js.Any], startingIndex.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Ellipsoid]
}
