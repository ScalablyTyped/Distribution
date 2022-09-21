package typings.cesium.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("cesium", "Cartographic")
@js.native
open class Cartographic () extends StObject {
  def this(longitude: Double) = this()
  def this(longitude: Double, latitude: Double) = this()
  def this(longitude: Unit, latitude: Double) = this()
  def this(longitude: Double, latitude: Double, height: Double) = this()
  def this(longitude: Double, latitude: Unit, height: Double) = this()
  def this(longitude: Unit, latitude: Double, height: Double) = this()
  def this(longitude: Unit, latitude: Unit, height: Double) = this()
  
  def clone(result: Cartographic): Cartographic = js.native
  
  /**
    * Compares the provided against this cartographic componentwise and returns
    * <code>true</code> if they are equal, <code>false</code> otherwise.
    * @param [right] - The second cartographic.
    * @returns <code>true</code> if left and right are equal, <code>false</code> otherwise.
    */
  def equals(): Boolean = js.native
  def equals(right: Cartographic): Boolean = js.native
  
  /**
    * Compares the provided against this cartographic componentwise and returns
    * <code>true</code> if they are within the provided epsilon,
    * <code>false</code> otherwise.
    * @param [right] - The second cartographic.
    * @param [epsilon = 0] - The epsilon to use for equality testing.
    * @returns <code>true</code> if left and right are within the provided epsilon, <code>false</code> otherwise.
    */
  def equalsEpsilon(): Boolean = js.native
  def equalsEpsilon(right: Unit, epsilon: Double): Boolean = js.native
  def equalsEpsilon(right: Cartographic): Boolean = js.native
  def equalsEpsilon(right: Cartographic, epsilon: Double): Boolean = js.native
  
  /**
    * The height, in meters, above the ellipsoid.
    */
  var height: Double = js.native
  
  /**
    * The latitude, in radians.
    */
  var latitude: Double = js.native
  
  /**
    * The longitude, in radians.
    */
  var longitude: Double = js.native
}
/* static members */
object Cartographic {
  
  @JSImport("cesium", "Cartographic")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * An immutable Cartographic instance initialized to (0.0, 0.0, 0.0).
    */
  @JSImport("cesium", "Cartographic.ZERO")
  @js.native
  val ZERO: Cartographic = js.native
  
  /**
    * Duplicates a Cartographic instance.
    * @param cartographic - The cartographic to duplicate.
    * @param [result] - The object onto which to store the result.
    * @returns The modified result parameter or a new Cartographic instance if one was not provided. (Returns undefined if cartographic is undefined)
    */
  inline def clone(cartographic: Cartographic): Cartographic = ^.asInstanceOf[js.Dynamic].applyDynamic("clone")(cartographic.asInstanceOf[js.Any]).asInstanceOf[Cartographic]
  inline def clone(cartographic: Cartographic, result: Cartographic): Cartographic = (^.asInstanceOf[js.Dynamic].applyDynamic("clone")(cartographic.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Cartographic]
  
  /**
    * Compares the provided cartographics componentwise and returns
    * <code>true</code> if they are equal, <code>false</code> otherwise.
    * @param [left] - The first cartographic.
    * @param [right] - The second cartographic.
    * @returns <code>true</code> if left and right are equal, <code>false</code> otherwise.
    */
  inline def equals(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("equals")().asInstanceOf[Boolean]
  inline def equals(left: Unit, right: Cartographic): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equals")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def equals(left: Cartographic): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("equals")(left.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def equals(left: Cartographic, right: Cartographic): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equals")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  /**
    * Compares the provided cartographics componentwise and returns
    * <code>true</code> if they are within the provided epsilon,
    * <code>false</code> otherwise.
    * @param [left] - The first cartographic.
    * @param [right] - The second cartographic.
    * @param [epsilon = 0] - The epsilon to use for equality testing.
    * @returns <code>true</code> if left and right are within the provided epsilon, <code>false</code> otherwise.
    */
  inline def equalsEpsilon(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("equalsEpsilon")().asInstanceOf[Boolean]
  inline def equalsEpsilon(left: Unit, right: Unit, epsilon: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equalsEpsilon")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any], epsilon.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def equalsEpsilon(left: Unit, right: Cartographic): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equalsEpsilon")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def equalsEpsilon(left: Unit, right: Cartographic, epsilon: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equalsEpsilon")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any], epsilon.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def equalsEpsilon(left: Cartographic): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("equalsEpsilon")(left.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def equalsEpsilon(left: Cartographic, right: Unit, epsilon: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equalsEpsilon")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any], epsilon.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def equalsEpsilon(left: Cartographic, right: Cartographic): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equalsEpsilon")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def equalsEpsilon(left: Cartographic, right: Cartographic, epsilon: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equalsEpsilon")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any], epsilon.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  /**
    * Creates a new Cartographic instance from a Cartesian position. The values in the
    * resulting object will be in radians.
    * @param cartesian - The Cartesian position to convert to cartographic representation.
    * @param [ellipsoid = Ellipsoid.WGS84] - The ellipsoid on which the position lies.
    * @param [result] - The object onto which to store the result.
    * @returns The modified result parameter, new Cartographic instance if none was provided, or undefined if the cartesian is at the center of the ellipsoid.
    */
  inline def fromCartesian(cartesian: Cartesian3): Cartographic = ^.asInstanceOf[js.Dynamic].applyDynamic("fromCartesian")(cartesian.asInstanceOf[js.Any]).asInstanceOf[Cartographic]
  inline def fromCartesian(cartesian: Cartesian3, ellipsoid: Unit, result: Cartographic): Cartographic = (^.asInstanceOf[js.Dynamic].applyDynamic("fromCartesian")(cartesian.asInstanceOf[js.Any], ellipsoid.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Cartographic]
  inline def fromCartesian(cartesian: Cartesian3, ellipsoid: Ellipsoid): Cartographic = (^.asInstanceOf[js.Dynamic].applyDynamic("fromCartesian")(cartesian.asInstanceOf[js.Any], ellipsoid.asInstanceOf[js.Any])).asInstanceOf[Cartographic]
  inline def fromCartesian(cartesian: Cartesian3, ellipsoid: Ellipsoid, result: Cartographic): Cartographic = (^.asInstanceOf[js.Dynamic].applyDynamic("fromCartesian")(cartesian.asInstanceOf[js.Any], ellipsoid.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Cartographic]
  
  /**
    * Creates a new Cartographic instance from longitude and latitude
    * specified in degrees.  The values in the resulting object will
    * be in radians.
    * @param longitude - The longitude, in degrees.
    * @param latitude - The latitude, in degrees.
    * @param [height = 0.0] - The height, in meters, above the ellipsoid.
    * @param [result] - The object onto which to store the result.
    * @returns The modified result parameter or a new Cartographic instance if one was not provided.
    */
  inline def fromDegrees(longitude: Double, latitude: Double): Cartographic = (^.asInstanceOf[js.Dynamic].applyDynamic("fromDegrees")(longitude.asInstanceOf[js.Any], latitude.asInstanceOf[js.Any])).asInstanceOf[Cartographic]
  inline def fromDegrees(longitude: Double, latitude: Double, height: Double): Cartographic = (^.asInstanceOf[js.Dynamic].applyDynamic("fromDegrees")(longitude.asInstanceOf[js.Any], latitude.asInstanceOf[js.Any], height.asInstanceOf[js.Any])).asInstanceOf[Cartographic]
  inline def fromDegrees(longitude: Double, latitude: Double, height: Double, result: Cartographic): Cartographic = (^.asInstanceOf[js.Dynamic].applyDynamic("fromDegrees")(longitude.asInstanceOf[js.Any], latitude.asInstanceOf[js.Any], height.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Cartographic]
  inline def fromDegrees(longitude: Double, latitude: Double, height: Unit, result: Cartographic): Cartographic = (^.asInstanceOf[js.Dynamic].applyDynamic("fromDegrees")(longitude.asInstanceOf[js.Any], latitude.asInstanceOf[js.Any], height.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Cartographic]
  
  /**
    * Creates a new Cartographic instance from longitude and latitude
    * specified in radians.
    * @param longitude - The longitude, in radians.
    * @param latitude - The latitude, in radians.
    * @param [height = 0.0] - The height, in meters, above the ellipsoid.
    * @param [result] - The object onto which to store the result.
    * @returns The modified result parameter or a new Cartographic instance if one was not provided.
    */
  inline def fromRadians(longitude: Double, latitude: Double): Cartographic = (^.asInstanceOf[js.Dynamic].applyDynamic("fromRadians")(longitude.asInstanceOf[js.Any], latitude.asInstanceOf[js.Any])).asInstanceOf[Cartographic]
  inline def fromRadians(longitude: Double, latitude: Double, height: Double): Cartographic = (^.asInstanceOf[js.Dynamic].applyDynamic("fromRadians")(longitude.asInstanceOf[js.Any], latitude.asInstanceOf[js.Any], height.asInstanceOf[js.Any])).asInstanceOf[Cartographic]
  inline def fromRadians(longitude: Double, latitude: Double, height: Double, result: Cartographic): Cartographic = (^.asInstanceOf[js.Dynamic].applyDynamic("fromRadians")(longitude.asInstanceOf[js.Any], latitude.asInstanceOf[js.Any], height.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Cartographic]
  inline def fromRadians(longitude: Double, latitude: Double, height: Unit, result: Cartographic): Cartographic = (^.asInstanceOf[js.Dynamic].applyDynamic("fromRadians")(longitude.asInstanceOf[js.Any], latitude.asInstanceOf[js.Any], height.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Cartographic]
  
  /**
    * Creates a new Cartesian3 instance from a Cartographic input. The values in the inputted
    * object should be in radians.
    * @param cartographic - Input to be converted into a Cartesian3 output.
    * @param [ellipsoid = Ellipsoid.WGS84] - The ellipsoid on which the position lies.
    * @param [result] - The object onto which to store the result.
    * @returns The position
    */
  inline def toCartesian(cartographic: Cartographic): Cartesian3 = ^.asInstanceOf[js.Dynamic].applyDynamic("toCartesian")(cartographic.asInstanceOf[js.Any]).asInstanceOf[Cartesian3]
  inline def toCartesian(cartographic: Cartographic, ellipsoid: Unit, result: Cartesian3): Cartesian3 = (^.asInstanceOf[js.Dynamic].applyDynamic("toCartesian")(cartographic.asInstanceOf[js.Any], ellipsoid.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Cartesian3]
  inline def toCartesian(cartographic: Cartographic, ellipsoid: Ellipsoid): Cartesian3 = (^.asInstanceOf[js.Dynamic].applyDynamic("toCartesian")(cartographic.asInstanceOf[js.Any], ellipsoid.asInstanceOf[js.Any])).asInstanceOf[Cartesian3]
  inline def toCartesian(cartographic: Cartographic, ellipsoid: Ellipsoid, result: Cartesian3): Cartesian3 = (^.asInstanceOf[js.Dynamic].applyDynamic("toCartesian")(cartographic.asInstanceOf[js.Any], ellipsoid.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Cartesian3]
}
