package typings.cesium.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("cesium", "EllipsoidRhumbLine")
@js.native
open class EllipsoidRhumbLine () extends StObject {
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
    * Provides the location of a point at the indicated latitude along the rhumb line.
    * If the latitude is outside the range of start and end points, the first intersection with the latitude from that start point in the direction of the heading is returned. This follows the spiral property of a rhumb line.
    * @param intersectionLatitude - The latitude, in radians, at which to find the intersection point from the starting point using the heading.
    * @param [result] - The object in which to store the result.
    * @returns The location of the intersection point along the rhumb line, undefined if there is no intersection or infinite intersections.
    */
  def findIntersectionWithLatitude(intersectionLatitude: Double): Cartographic = js.native
  def findIntersectionWithLatitude(intersectionLatitude: Double, result: Cartographic): Cartographic = js.native
  
  /**
    * Provides the location of a point at the indicated longitude along the rhumb line.
    * If the longitude is outside the range of start and end points, the first intersection with the longitude from the start point in the direction of the heading is returned. This follows the spiral property of a rhumb line.
    * @param intersectionLongitude - The longitude, in radians, at which to find the intersection point from the starting point using the heading.
    * @param [result] - The object in which to store the result.
    * @returns The location of the intersection point along the rhumb line, undefined if there is no intersection or infinite intersections.
    */
  def findIntersectionWithLongitude(intersectionLongitude: Double): Cartographic = js.native
  def findIntersectionWithLongitude(intersectionLongitude: Double, result: Cartographic): Cartographic = js.native
  
  /**
    * Gets the heading from the start point to the end point.
    */
  val heading: Double = js.native
  
  /**
    * Provides the location of a point at the indicated portion along the rhumb line.
    * @param fraction - The portion of the distance between the initial and final points.
    * @param [result] - The object in which to store the result.
    * @returns The location of the point along the rhumb line.
    */
  def interpolateUsingFraction(fraction: Double): Cartographic = js.native
  def interpolateUsingFraction(fraction: Double, result: Cartographic): Cartographic = js.native
  
  /**
    * Provides the location of a point at the indicated distance along the rhumb line.
    * @param distance - The distance from the inital point to the point of interest along the rhumbLine.
    * @param [result] - The object in which to store the result.
    * @returns The location of the point along the rhumb line.
    */
  def interpolateUsingSurfaceDistance(distance: Double): Cartographic = js.native
  def interpolateUsingSurfaceDistance(distance: Double, result: Cartographic): Cartographic = js.native
  
  /**
    * Sets the start and end points of the rhumb line.
    * @param start - The initial planetodetic point on the path.
    * @param end - The final planetodetic point on the path.
    */
  def setEndPoints(start: Cartographic, end: Cartographic): Unit = js.native
  
  /**
    * Gets the initial planetodetic point on the path.
    */
  val start: Cartographic = js.native
  
  /**
    * Gets the surface distance between the start and end point
    */
  val surfaceDistance: Double = js.native
}
/* static members */
object EllipsoidRhumbLine {
  
  @JSImport("cesium", "EllipsoidRhumbLine")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Create a rhumb line using an initial position with a heading and distance.
    * @param start - The initial planetodetic point on the path.
    * @param heading - The heading in radians.
    * @param distance - The rhumb line distance between the start and end point.
    * @param [ellipsoid = Ellipsoid.WGS84] - The ellipsoid on which the rhumb line lies.
    * @param [result] - The object in which to store the result.
    * @returns The EllipsoidRhumbLine object.
    */
  inline def fromStartHeadingDistance(start: Cartographic, heading: Double, distance: Double): EllipsoidRhumbLine = (^.asInstanceOf[js.Dynamic].applyDynamic("fromStartHeadingDistance")(start.asInstanceOf[js.Any], heading.asInstanceOf[js.Any], distance.asInstanceOf[js.Any])).asInstanceOf[EllipsoidRhumbLine]
  inline def fromStartHeadingDistance(
    start: Cartographic,
    heading: Double,
    distance: Double,
    ellipsoid: Unit,
    result: EllipsoidRhumbLine
  ): EllipsoidRhumbLine = (^.asInstanceOf[js.Dynamic].applyDynamic("fromStartHeadingDistance")(start.asInstanceOf[js.Any], heading.asInstanceOf[js.Any], distance.asInstanceOf[js.Any], ellipsoid.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[EllipsoidRhumbLine]
  inline def fromStartHeadingDistance(start: Cartographic, heading: Double, distance: Double, ellipsoid: Ellipsoid): EllipsoidRhumbLine = (^.asInstanceOf[js.Dynamic].applyDynamic("fromStartHeadingDistance")(start.asInstanceOf[js.Any], heading.asInstanceOf[js.Any], distance.asInstanceOf[js.Any], ellipsoid.asInstanceOf[js.Any])).asInstanceOf[EllipsoidRhumbLine]
  inline def fromStartHeadingDistance(
    start: Cartographic,
    heading: Double,
    distance: Double,
    ellipsoid: Ellipsoid,
    result: EllipsoidRhumbLine
  ): EllipsoidRhumbLine = (^.asInstanceOf[js.Dynamic].applyDynamic("fromStartHeadingDistance")(start.asInstanceOf[js.Any], heading.asInstanceOf[js.Any], distance.asInstanceOf[js.Any], ellipsoid.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[EllipsoidRhumbLine]
}
