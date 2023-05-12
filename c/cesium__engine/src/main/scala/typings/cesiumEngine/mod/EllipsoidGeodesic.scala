package typings.cesiumEngine.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@cesium/engine", "EllipsoidGeodesic")
@js.native
open class EllipsoidGeodesic () extends StObject {
  def this(start: Cartographic) = this()
  def this(start: Unit, end: Cartographic) = this()
  def this(start: Cartographic, end: Cartographic) = this()
  def this(start: Unit, end: Unit, ellipsoid: Ellipsoid) = this()
  def this(start: Unit, end: Cartographic, ellipsoid: Ellipsoid) = this()
  def this(start: Cartographic, end: Unit, ellipsoid: Ellipsoid) = this()
  def this(start: Cartographic, end: Cartographic, ellipsoid: Ellipsoid) = this()
  
  /**
    * Gets the ellipsoid.
    */
  val ellipsoid: Ellipsoid = js.native
  
  /**
    * Gets the final planetodetic point on the path.
    */
  val end: Cartographic = js.native
  
  /**
    * Gets the heading at the final point.
    */
  val endHeading: Double = js.native
  
  /**
    * Provides the location of a point at the indicated portion along the geodesic.
    * @param fraction - The portion of the distance between the initial and final points.
    * @param [result] - The object in which to store the result.
    * @returns The location of the point along the geodesic.
    */
  def interpolateUsingFraction(fraction: Double): Cartographic = js.native
  def interpolateUsingFraction(fraction: Double, result: Cartographic): Cartographic = js.native
  
  /**
    * Provides the location of a point at the indicated distance along the geodesic.
    * @param distance - The distance from the inital point to the point of interest along the geodesic
    * @param [result] - The object in which to store the result.
    * @returns The location of the point along the geodesic.
    */
  def interpolateUsingSurfaceDistance(distance: Double): Cartographic = js.native
  def interpolateUsingSurfaceDistance(distance: Double, result: Cartographic): Cartographic = js.native
  
  /**
    * Sets the start and end points of the geodesic
    * @param start - The initial planetodetic point on the path.
    * @param end - The final planetodetic point on the path.
    */
  def setEndPoints(start: Cartographic, end: Cartographic): Unit = js.native
  
  /**
    * Gets the initial planetodetic point on the path.
    */
  val start: Cartographic = js.native
  
  /**
    * Gets the heading at the initial point.
    */
  val startHeading: Double = js.native
  
  /**
    * Gets the surface distance between the start and end point
    */
  val surfaceDistance: Double = js.native
}
