package typings.cesiumEngine.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@cesium/engine", "EllipsoidTangentPlane")
@js.native
open class EllipsoidTangentPlane protected () extends StObject {
  def this(origin: Cartesian3) = this()
  def this(origin: Cartesian3, ellipsoid: Ellipsoid) = this()
  
  /**
    * Gets the ellipsoid.
    */
  var ellipsoid: Ellipsoid = js.native
  
  /**
    * Gets the origin.
    */
  var origin: Cartesian3 = js.native
  
  /**
    * Gets the plane which is tangent to the ellipsoid.
    */
  val plane: Plane = js.native
  
  /**
    * Computes the projection of the provided 2D position onto the 3D ellipsoid.
    * @param cartesian - The points to project.
    * @param [result] - The Cartesian3 instance to store result.
    * @returns The modified result parameter or a new Cartesian3 instance if none was provided.
    */
  def projectPointOntoEllipsoid(cartesian: Cartesian2): Cartesian3 = js.native
  def projectPointOntoEllipsoid(cartesian: Cartesian2, result: Cartesian3): Cartesian3 = js.native
  
  /**
    * Computes the projection of the provided 3D position onto the 2D plane, radially outward from the {@link EllipsoidTangentPlane.ellipsoid} coordinate system origin.
    * @param cartesian - The point to project.
    * @param [result] - The object onto which to store the result.
    * @returns The modified result parameter or a new Cartesian2 instance if none was provided. Undefined if there is no intersection point
    */
  def projectPointOntoPlane(cartesian: Cartesian3): Cartesian2 = js.native
  def projectPointOntoPlane(cartesian: Cartesian3, result: Cartesian2): Cartesian2 = js.native
  
  /**
    * Computes the projection of the provided 3D position onto the 2D plane, along the plane normal.
    * @param cartesian - The point to project.
    * @param [result] - The object onto which to store the result.
    * @returns The modified result parameter or a new Cartesian2 instance if none was provided.
    */
  def projectPointToNearestOnPlane(cartesian: Cartesian3): Cartesian2 = js.native
  def projectPointToNearestOnPlane(cartesian: Cartesian3, result: Cartesian2): Cartesian2 = js.native
  
  /**
    * Computes the projection of the provided 2D positions onto the 3D ellipsoid.
    * @param cartesians - The array of points to project.
    * @param [result] - The array of Cartesian3 instances onto which to store results.
    * @returns The modified result parameter or a new array of Cartesian3 instances if none was provided.
    */
  def projectPointsOntoEllipsoid(cartesians: js.Array[Cartesian2]): js.Array[Cartesian3] = js.native
  def projectPointsOntoEllipsoid(cartesians: js.Array[Cartesian2], result: js.Array[Cartesian3]): js.Array[Cartesian3] = js.native
  
  /**
    * Computes the projection of the provided 3D positions onto the 2D plane (where possible), radially outward from the global origin.
    * The resulting array may be shorter than the input array - if a single projection is impossible it will not be included.
    * @param cartesians - The array of points to project.
    * @param [result] - The array of Cartesian2 instances onto which to store results.
    * @returns The modified result parameter or a new array of Cartesian2 instances if none was provided.
    */
  def projectPointsOntoPlane(cartesians: js.Array[Cartesian3]): js.Array[Cartesian2] = js.native
  def projectPointsOntoPlane(cartesians: js.Array[Cartesian3], result: js.Array[Cartesian2]): js.Array[Cartesian2] = js.native
  
  /**
    * Computes the projection of the provided 3D positions onto the 2D plane, along the plane normal.
    * @param cartesians - The array of points to project.
    * @param [result] - The array of Cartesian2 instances onto which to store results.
    * @returns The modified result parameter or a new array of Cartesian2 instances if none was provided. This will have the same length as <code>cartesians</code>.
    */
  def projectPointsToNearestOnPlane(cartesians: js.Array[Cartesian3]): js.Array[Cartesian2] = js.native
  def projectPointsToNearestOnPlane(cartesians: js.Array[Cartesian3], result: js.Array[Cartesian2]): js.Array[Cartesian2] = js.native
  
  /**
    * Gets the local X-axis (east) of the tangent plane.
    */
  val xAxis: Cartesian3 = js.native
  
  /**
    * Gets the local Y-axis (north) of the tangent plane.
    */
  val yAxis: Cartesian3 = js.native
  
  /**
    * Gets the local Z-axis (up) of the tangent plane.
    */
  val zAxis: Cartesian3 = js.native
}
/* static members */
object EllipsoidTangentPlane {
  
  @JSImport("@cesium/engine", "EllipsoidTangentPlane")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates a new instance from the provided ellipsoid and the center
    * point of the provided Cartesians.
    * @param cartesians - The list of positions surrounding the center point.
    * @param [ellipsoid = Ellipsoid.WGS84] - The ellipsoid to use.
    * @returns The new instance of EllipsoidTangentPlane.
    */
  inline def fromPoints(cartesians: js.Array[Cartesian3]): EllipsoidTangentPlane = ^.asInstanceOf[js.Dynamic].applyDynamic("fromPoints")(cartesians.asInstanceOf[js.Any]).asInstanceOf[EllipsoidTangentPlane]
  inline def fromPoints(cartesians: js.Array[Cartesian3], ellipsoid: Ellipsoid): EllipsoidTangentPlane = (^.asInstanceOf[js.Dynamic].applyDynamic("fromPoints")(cartesians.asInstanceOf[js.Any], ellipsoid.asInstanceOf[js.Any])).asInstanceOf[EllipsoidTangentPlane]
}
