package typings.cesium.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("cesium", "GeographicProjection")
@js.native
open class GeographicProjection () extends StObject {
  def this(ellipsoid: Ellipsoid) = this()
  
  /**
    * Gets the {@link Ellipsoid}.
    */
  val ellipsoid: Ellipsoid = js.native
  
  /**
    * Projects a set of {@link Cartographic} coordinates, in radians, to map coordinates, in meters.
    * X and Y are the longitude and latitude, respectively, multiplied by the maximum radius of the
    * ellipsoid.  Z is the unmodified height.
    * @param cartographic - The coordinates to project.
    * @param [result] - An instance into which to copy the result.  If this parameter is
    *        undefined, a new instance is created and returned.
    * @returns The projected coordinates.  If the result parameter is not undefined, the
    *          coordinates are copied there and that instance is returned.  Otherwise, a new instance is
    *          created and returned.
    */
  def project(cartographic: Cartographic): Cartesian3 = js.native
  def project(cartographic: Cartographic, result: Cartesian3): Cartesian3 = js.native
  
  /**
    * Unprojects a set of projected {@link Cartesian3} coordinates, in meters, to {@link Cartographic}
    * coordinates, in radians.  Longitude and Latitude are the X and Y coordinates, respectively,
    * divided by the maximum radius of the ellipsoid.  Height is the unmodified Z coordinate.
    * @param cartesian - The Cartesian position to unproject with height (z) in meters.
    * @param [result] - An instance into which to copy the result.  If this parameter is
    *        undefined, a new instance is created and returned.
    * @returns The unprojected coordinates.  If the result parameter is not undefined, the
    *          coordinates are copied there and that instance is returned.  Otherwise, a new instance is
    *          created and returned.
    */
  def unproject(cartesian: Cartesian3): Cartographic = js.native
  def unproject(cartesian: Cartesian3, result: Cartographic): Cartographic = js.native
}
