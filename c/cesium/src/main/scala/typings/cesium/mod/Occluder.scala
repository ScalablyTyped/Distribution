package typings.cesium.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("cesium", "Occluder")
@js.native
open class Occluder protected () extends StObject {
  def this(occluderBoundingSphere: BoundingSphere, cameraPosition: Cartesian3) = this()
  
  /**
    * The position of the camera.
    */
  var cameraPosition: Cartesian3 = js.native
  
  /**
    * Determine to what extent an occludee is visible (not visible, partially visible,  or fully visible).
    * @example
    * const sphere1 = new Cesium.BoundingSphere(new Cesium.Cartesian3(0, 0, -1.5), 0.5);
    * const sphere2 = new Cesium.BoundingSphere(new Cesium.Cartesian3(0, 0, -2.5), 0.5);
    * const cameraPosition = new Cesium.Cartesian3(0, 0, 0);
    * const occluder = new Cesium.Occluder(sphere1, cameraPosition);
    * occluder.computeVisibility(sphere2); //returns Visibility.NONE
    * @param occludeeBS - The bounding sphere of the occludee.
    * @returns Visibility.NONE if the occludee is not visible,
    *                       Visibility.PARTIAL if the occludee is partially visible, or
    *                       Visibility.FULL if the occludee is fully visible.
    */
  def computeVisibility(occludeeBS: BoundingSphere): Visibility = js.native
  
  /**
    * Determines whether or not a sphere, the <code>occludee</code>, is hidden from view by the occluder.
    * @example
    * const cameraPosition = new Cesium.Cartesian3(0, 0, 0);
    * const littleSphere = new Cesium.BoundingSphere(new Cesium.Cartesian3(0, 0, -1), 0.25);
    * const occluder = new Cesium.Occluder(littleSphere, cameraPosition);
    * const bigSphere = new Cesium.BoundingSphere(new Cesium.Cartesian3(0, 0, -3), 1);
    * occluder.isBoundingSphereVisible(bigSphere); //returns true
    * @param occludee - The bounding sphere surrounding the occludee object.
    * @returns <code>true</code> if the occludee is visible; otherwise <code>false</code>.
    */
  def isBoundingSphereVisible(occludee: BoundingSphere): Boolean = js.native
  
  /**
    * Determines whether or not a point, the <code>occludee</code>, is hidden from view by the occluder.
    * @example
    * const cameraPosition = new Cesium.Cartesian3(0, 0, 0);
    * const littleSphere = new Cesium.BoundingSphere(new Cesium.Cartesian3(0, 0, -1), 0.25);
    * const occluder = new Cesium.Occluder(littleSphere, cameraPosition);
    * const point = new Cesium.Cartesian3(0, 0, -3);
    * occluder.isPointVisible(point); //returns true
    * @param occludee - The point surrounding the occludee object.
    * @returns <code>true</code> if the occludee is visible; otherwise <code>false</code>.
    */
  def isPointVisible(occludee: Cartesian3): Boolean = js.native
  
  /**
    * The position of the occluder.
    */
  var position: Cartesian3 = js.native
  
  /**
    * The radius of the occluder.
    */
  var radius: Double = js.native
}
/* static members */
object Occluder {
  
  @JSImport("cesium", "Occluder")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Computes a point that can be used as the occludee position to the visibility functions.
    * Use a radius of zero for the occludee radius.  Typically, a user computes a bounding sphere around
    * an object that is used for visibility; however it is also possible to compute a point that if
    * seen/not seen would also indicate if an object is visible/not visible.  This function is better
    * called for objects that do not move relative to the occluder and is large, such as a chunk of
    * terrain.  You are better off not calling this and using the object's bounding sphere for objects
    * such as a satellite or ground vehicle.
    * @example
    * const cameraPosition = new Cesium.Cartesian3(0, 0, 0);
    * const occluderBoundingSphere = new Cesium.BoundingSphere(new Cesium.Cartesian3(0, 0, -8), 2);
    * const occluder = new Cesium.Occluder(occluderBoundingSphere, cameraPosition);
    * const positions = [new Cesium.Cartesian3(-0.25, 0, -5.3), new Cesium.Cartesian3(0.25, 0, -5.3)];
    * const tileOccluderSphere = Cesium.BoundingSphere.fromPoints(positions);
    * const occludeePosition = tileOccluderSphere.center;
    * const occludeePt = Cesium.Occluder.computeOccludeePoint(occluderBoundingSphere, occludeePosition, positions);
    * @param occluderBoundingSphere - The bounding sphere surrounding the occluder.
    * @param occludeePosition - The point where the occludee (bounding sphere of radius 0) is located.
    * @param positions - List of altitude points on the horizon near the surface of the occluder.
    * @returns An object containing two attributes: <code>occludeePoint</code> and <code>valid</code>
    * which is a boolean value.
    */
  inline def computeOccludeePoint(
    occluderBoundingSphere: BoundingSphere,
    occludeePosition: Cartesian3,
    positions: js.Array[Cartesian3]
  ): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("computeOccludeePoint")(occluderBoundingSphere.asInstanceOf[js.Any], occludeePosition.asInstanceOf[js.Any], positions.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  /**
    * Computes a point that can be used as the occludee position to the visibility functions from a rectangle.
    * @param rectangle - The rectangle used to create a bounding sphere.
    * @param [ellipsoid = Ellipsoid.WGS84] - The ellipsoid used to determine positions of the rectangle.
    * @returns An object containing two attributes: <code>occludeePoint</code> and <code>valid</code>
    * which is a boolean value.
    */
  inline def computeOccludeePointFromRectangle(rectangle: Rectangle): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("computeOccludeePointFromRectangle")(rectangle.asInstanceOf[js.Any]).asInstanceOf[Any]
  inline def computeOccludeePointFromRectangle(rectangle: Rectangle, ellipsoid: Ellipsoid): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("computeOccludeePointFromRectangle")(rectangle.asInstanceOf[js.Any], ellipsoid.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  /**
    * Creates an occluder from a bounding sphere and the camera position.
    * @param occluderBoundingSphere - The bounding sphere surrounding the occluder.
    * @param cameraPosition - The coordinate of the viewer/camera.
    * @param [result] - The object onto which to store the result.
    * @returns The occluder derived from an object's position and radius, as well as the camera position.
    */
  inline def fromBoundingSphere(occluderBoundingSphere: BoundingSphere, cameraPosition: Cartesian3): Occluder = (^.asInstanceOf[js.Dynamic].applyDynamic("fromBoundingSphere")(occluderBoundingSphere.asInstanceOf[js.Any], cameraPosition.asInstanceOf[js.Any])).asInstanceOf[Occluder]
  inline def fromBoundingSphere(occluderBoundingSphere: BoundingSphere, cameraPosition: Cartesian3, result: Occluder): Occluder = (^.asInstanceOf[js.Dynamic].applyDynamic("fromBoundingSphere")(occluderBoundingSphere.asInstanceOf[js.Any], cameraPosition.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Occluder]
}
