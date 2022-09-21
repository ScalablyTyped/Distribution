package typings.cesium.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("cesium", "WebMercatorProjection")
@js.native
open class WebMercatorProjection () extends StObject {
  def this(ellipsoid: Ellipsoid) = this()
  
  /**
    * Gets the {@link Ellipsoid}.
    */
  val ellipsoid: Ellipsoid = js.native
  
  /**
    * Converts geodetic ellipsoid coordinates, in radians, to the equivalent Web Mercator
    * X, Y, Z coordinates expressed in meters and returned in a {@link Cartesian3}.  The height
    * is copied unmodified to the Z coordinate.
    * @param cartographic - The cartographic coordinates in radians.
    * @param [result] - The instance to which to copy the result, or undefined if a
    *        new instance should be created.
    * @returns The equivalent web mercator X, Y, Z coordinates, in meters.
    */
  def project(cartographic: Cartographic): Cartesian3 = js.native
  def project(cartographic: Cartographic, result: Cartesian3): Cartesian3 = js.native
  
  /**
    * Converts Web Mercator X, Y coordinates, expressed in meters, to a {@link Cartographic}
    * containing geodetic ellipsoid coordinates.  The Z coordinate is copied unmodified to the
    * height.
    * @param cartesian - The web mercator Cartesian position to unrproject with height (z) in meters.
    * @param [result] - The instance to which to copy the result, or undefined if a
    *        new instance should be created.
    * @returns The equivalent cartographic coordinates.
    */
  def unproject(cartesian: Cartesian3): Cartographic = js.native
  def unproject(cartesian: Cartesian3, result: Cartographic): Cartographic = js.native
}
/* static members */
object WebMercatorProjection {
  
  @JSImport("cesium", "WebMercatorProjection")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * The maximum latitude (both North and South) supported by a Web Mercator
    * (EPSG:3857) projection.  Technically, the Mercator projection is defined
    * for any latitude up to (but not including) 90 degrees, but it makes sense
    * to cut it off sooner because it grows exponentially with increasing latitude.
    * The logic behind this particular cutoff value, which is the one used by
    * Google Maps, Bing Maps, and Esri, is that it makes the projection
    * square.  That is, the rectangle is equal in the X and Y directions.
    *
    * The constant value is computed by calling:
    *    WebMercatorProjection.mercatorAngleToGeodeticLatitude(Math.PI)
    */
  @JSImport("cesium", "WebMercatorProjection.MaximumLatitude")
  @js.native
  def MaximumLatitude: Double = js.native
  inline def MaximumLatitude_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MaximumLatitude")(x.asInstanceOf[js.Any])
  
  /**
    * Converts a geodetic latitude in radians, in the range -PI/2 to PI/2, to a Mercator
    * angle in the range -PI to PI.
    * @param latitude - The geodetic latitude in radians.
    * @returns The Mercator angle.
    */
  inline def geodeticLatitudeToMercatorAngle(latitude: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("geodeticLatitudeToMercatorAngle")(latitude.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  /**
    * Converts a Mercator angle, in the range -PI to PI, to a geodetic latitude
    * in the range -PI/2 to PI/2.
    * @param mercatorAngle - The angle to convert.
    * @returns The geodetic latitude in radians.
    */
  inline def mercatorAngleToGeodeticLatitude(mercatorAngle: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("mercatorAngleToGeodeticLatitude")(mercatorAngle.asInstanceOf[js.Any]).asInstanceOf[Double]
}
