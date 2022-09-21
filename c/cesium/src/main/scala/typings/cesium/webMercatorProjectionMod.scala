package typings.cesium

import typings.cesium.mod.Ellipsoid
import typings.cesium.mod.WebMercatorProjection
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object webMercatorProjectionMod {
  
  @JSImport("cesium/Source/Core/WebMercatorProjection", JSImport.Default)
  @js.native
  open class default () extends WebMercatorProjection {
    def this(ellipsoid: Ellipsoid) = this()
  }
  /* static members */
  object default {
    
    @JSImport("cesium/Source/Core/WebMercatorProjection", JSImport.Default)
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
    @JSImport("cesium/Source/Core/WebMercatorProjection", "default.MaximumLatitude")
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
}
