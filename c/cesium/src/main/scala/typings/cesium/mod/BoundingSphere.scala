package typings.cesium.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("cesium", "BoundingSphere")
@js.native
open class BoundingSphere () extends StObject {
  def this(center: Cartesian3) = this()
  def this(center: Unit, radius: Double) = this()
  def this(center: Cartesian3, radius: Double) = this()
  
  /**
    * The center point of the sphere.
    */
  var center: Cartesian3 = js.native
  
  def clone(result: BoundingSphere): BoundingSphere = js.native
  
  /**
    * The distances calculated by the vector from the center of the bounding sphere to position projected onto direction
    * plus/minus the radius of the bounding sphere.
    * <br>
    * If you imagine the infinite number of planes with normal direction, this computes the smallest distance to the
    * closest and farthest planes from position that intersect the bounding sphere.
    * @param position - The position to calculate the distance from.
    * @param direction - The direction from position.
    * @param [result] - A Interval to store the nearest and farthest distances.
    * @returns The nearest and farthest distances on the bounding sphere from position in direction.
    */
  def computePlaneDistances(position: Cartesian3, direction: Cartesian3): Interval = js.native
  def computePlaneDistances(position: Cartesian3, direction: Cartesian3, result: Interval): Interval = js.native
  
  /**
    * Computes the estimated distance squared from the closest point on a bounding sphere to a point.
    * @example
    * // Sort bounding spheres from back to front
    * spheres.sort(function(a, b) {
    *     return b.distanceSquaredTo(camera.positionWC) - a.distanceSquaredTo(camera.positionWC);
    * });
    * @param cartesian - The point
    * @returns The estimated distance squared from the bounding sphere to the point.
    */
  def distanceSquaredTo(cartesian: Cartesian3): Double = js.native
  
  /**
    * Compares this BoundingSphere against the provided BoundingSphere componentwise and returns
    * <code>true</code> if they are equal, <code>false</code> otherwise.
    * @param [right] - The right hand side BoundingSphere.
    * @returns <code>true</code> if they are equal, <code>false</code> otherwise.
    */
  def equals(): Boolean = js.native
  def equals(right: BoundingSphere): Boolean = js.native
  
  /**
    * Determines which side of a plane the sphere is located.
    * @param plane - The plane to test against.
    * @returns {@link Intersect.INSIDE} if the entire sphere is on the side of the plane
    *                      the normal is pointing, {@link Intersect.OUTSIDE} if the entire sphere is
    *                      on the opposite side, and {@link Intersect.INTERSECTING} if the sphere
    *                      intersects the plane.
    */
  def intersectPlane(plane: Plane): Intersect = js.native
  
  /**
    * Determines whether or not a sphere is hidden from view by the occluder.
    * @param occluder - The occluder.
    * @returns <code>true</code> if the sphere is not visible; otherwise <code>false</code>.
    */
  def isOccluded(occluder: Occluder): Boolean = js.native
  
  /**
    * The radius of the sphere.
    */
  var radius: Double = js.native
  
  /**
    * Computes the radius of the BoundingSphere.
    * @returns The radius of the BoundingSphere.
    */
  def volume(): Double = js.native
}
/* static members */
object BoundingSphere {
  
  @JSImport("cesium", "BoundingSphere")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Duplicates a BoundingSphere instance.
    * @param sphere - The bounding sphere to duplicate.
    * @param [result] - The object onto which to store the result.
    * @returns The modified result parameter or a new BoundingSphere instance if none was provided. (Returns undefined if sphere is undefined)
    */
  inline def clone(sphere: BoundingSphere): BoundingSphere = ^.asInstanceOf[js.Dynamic].applyDynamic("clone")(sphere.asInstanceOf[js.Any]).asInstanceOf[BoundingSphere]
  inline def clone(sphere: BoundingSphere, result: BoundingSphere): BoundingSphere = (^.asInstanceOf[js.Dynamic].applyDynamic("clone")(sphere.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[BoundingSphere]
  
  /**
    * The distances calculated by the vector from the center of the bounding sphere to position projected onto direction
    * plus/minus the radius of the bounding sphere.
    * <br>
    * If you imagine the infinite number of planes with normal direction, this computes the smallest distance to the
    * closest and farthest planes from position that intersect the bounding sphere.
    * @param sphere - The bounding sphere to calculate the distance to.
    * @param position - The position to calculate the distance from.
    * @param direction - The direction from position.
    * @param [result] - A Interval to store the nearest and farthest distances.
    * @returns The nearest and farthest distances on the bounding sphere from position in direction.
    */
  inline def computePlaneDistances(sphere: BoundingSphere, position: Cartesian3, direction: Cartesian3): Interval = (^.asInstanceOf[js.Dynamic].applyDynamic("computePlaneDistances")(sphere.asInstanceOf[js.Any], position.asInstanceOf[js.Any], direction.asInstanceOf[js.Any])).asInstanceOf[Interval]
  inline def computePlaneDistances(sphere: BoundingSphere, position: Cartesian3, direction: Cartesian3, result: Interval): Interval = (^.asInstanceOf[js.Dynamic].applyDynamic("computePlaneDistances")(sphere.asInstanceOf[js.Any], position.asInstanceOf[js.Any], direction.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Interval]
  
  /**
    * Computes the estimated distance squared from the closest point on a bounding sphere to a point.
    * @example
    * // Sort bounding spheres from back to front
    * spheres.sort(function(a, b) {
    *     return Cesium.BoundingSphere.distanceSquaredTo(b, camera.positionWC) - Cesium.BoundingSphere.distanceSquaredTo(a, camera.positionWC);
    * });
    * @param sphere - The sphere.
    * @param cartesian - The point
    * @returns The distance squared from the bounding sphere to the point. Returns 0 if the point is inside the sphere.
    */
  inline def distanceSquaredTo(sphere: BoundingSphere, cartesian: Cartesian3): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("distanceSquaredTo")(sphere.asInstanceOf[js.Any], cartesian.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  /**
    * Compares the provided BoundingSphere componentwise and returns
    * <code>true</code> if they are equal, <code>false</code> otherwise.
    * @param [left] - The first BoundingSphere.
    * @param [right] - The second BoundingSphere.
    * @returns <code>true</code> if left and right are equal, <code>false</code> otherwise.
    */
  inline def equals(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("equals")().asInstanceOf[Boolean]
  inline def equals(left: Unit, right: BoundingSphere): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equals")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def equals(left: BoundingSphere): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("equals")(left.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def equals(left: BoundingSphere, right: BoundingSphere): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equals")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  /**
    * Computes a bounding sphere by enlarging the provided sphere to contain the provided point.
    * @param sphere - A sphere to expand.
    * @param point - A point to enclose in a bounding sphere.
    * @param [result] - The object onto which to store the result.
    * @returns The modified result parameter or a new BoundingSphere instance if none was provided.
    */
  inline def expand(sphere: BoundingSphere, point: Cartesian3): BoundingSphere = (^.asInstanceOf[js.Dynamic].applyDynamic("expand")(sphere.asInstanceOf[js.Any], point.asInstanceOf[js.Any])).asInstanceOf[BoundingSphere]
  inline def expand(sphere: BoundingSphere, point: Cartesian3, result: BoundingSphere): BoundingSphere = (^.asInstanceOf[js.Dynamic].applyDynamic("expand")(sphere.asInstanceOf[js.Any], point.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[BoundingSphere]
  
  /**
    * Computes a tight-fitting bounding sphere enclosing the provided array of bounding spheres.
    * @param [boundingSpheres] - The array of bounding spheres.
    * @param [result] - The object onto which to store the result.
    * @returns The modified result parameter or a new BoundingSphere instance if none was provided.
    */
  inline def fromBoundingSpheres(): BoundingSphere = ^.asInstanceOf[js.Dynamic].applyDynamic("fromBoundingSpheres")().asInstanceOf[BoundingSphere]
  inline def fromBoundingSpheres(boundingSpheres: js.Array[BoundingSphere]): BoundingSphere = ^.asInstanceOf[js.Dynamic].applyDynamic("fromBoundingSpheres")(boundingSpheres.asInstanceOf[js.Any]).asInstanceOf[BoundingSphere]
  inline def fromBoundingSpheres(boundingSpheres: js.Array[BoundingSphere], result: BoundingSphere): BoundingSphere = (^.asInstanceOf[js.Dynamic].applyDynamic("fromBoundingSpheres")(boundingSpheres.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[BoundingSphere]
  inline def fromBoundingSpheres(boundingSpheres: Unit, result: BoundingSphere): BoundingSphere = (^.asInstanceOf[js.Dynamic].applyDynamic("fromBoundingSpheres")(boundingSpheres.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[BoundingSphere]
  
  /**
    * Computes a bounding sphere from the corner points of an axis-aligned bounding box.  The sphere
    * tightly and fully encompasses the box.
    * @example
    * // Create a bounding sphere around the unit cube
    * const sphere = Cesium.BoundingSphere.fromCornerPoints(new Cesium.Cartesian3(-0.5, -0.5, -0.5), new Cesium.Cartesian3(0.5, 0.5, 0.5));
    * @param [corner] - The minimum height over the rectangle.
    * @param [oppositeCorner] - The maximum height over the rectangle.
    * @param [result] - The object onto which to store the result.
    * @returns The modified result parameter or a new BoundingSphere instance if none was provided.
    */
  inline def fromCornerPoints(): BoundingSphere = ^.asInstanceOf[js.Dynamic].applyDynamic("fromCornerPoints")().asInstanceOf[BoundingSphere]
  inline def fromCornerPoints(corner: Unit, oppositeCorner: Unit, result: BoundingSphere): BoundingSphere = (^.asInstanceOf[js.Dynamic].applyDynamic("fromCornerPoints")(corner.asInstanceOf[js.Any], oppositeCorner.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[BoundingSphere]
  inline def fromCornerPoints(corner: Unit, oppositeCorner: Cartesian3): BoundingSphere = (^.asInstanceOf[js.Dynamic].applyDynamic("fromCornerPoints")(corner.asInstanceOf[js.Any], oppositeCorner.asInstanceOf[js.Any])).asInstanceOf[BoundingSphere]
  inline def fromCornerPoints(corner: Unit, oppositeCorner: Cartesian3, result: BoundingSphere): BoundingSphere = (^.asInstanceOf[js.Dynamic].applyDynamic("fromCornerPoints")(corner.asInstanceOf[js.Any], oppositeCorner.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[BoundingSphere]
  inline def fromCornerPoints(corner: Cartesian3): BoundingSphere = ^.asInstanceOf[js.Dynamic].applyDynamic("fromCornerPoints")(corner.asInstanceOf[js.Any]).asInstanceOf[BoundingSphere]
  inline def fromCornerPoints(corner: Cartesian3, oppositeCorner: Unit, result: BoundingSphere): BoundingSphere = (^.asInstanceOf[js.Dynamic].applyDynamic("fromCornerPoints")(corner.asInstanceOf[js.Any], oppositeCorner.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[BoundingSphere]
  inline def fromCornerPoints(corner: Cartesian3, oppositeCorner: Cartesian3): BoundingSphere = (^.asInstanceOf[js.Dynamic].applyDynamic("fromCornerPoints")(corner.asInstanceOf[js.Any], oppositeCorner.asInstanceOf[js.Any])).asInstanceOf[BoundingSphere]
  inline def fromCornerPoints(corner: Cartesian3, oppositeCorner: Cartesian3, result: BoundingSphere): BoundingSphere = (^.asInstanceOf[js.Dynamic].applyDynamic("fromCornerPoints")(corner.asInstanceOf[js.Any], oppositeCorner.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[BoundingSphere]
  
  /**
    * Creates a bounding sphere encompassing an ellipsoid.
    * @example
    * const boundingSphere = Cesium.BoundingSphere.fromEllipsoid(ellipsoid);
    * @param ellipsoid - The ellipsoid around which to create a bounding sphere.
    * @param [result] - The object onto which to store the result.
    * @returns The modified result parameter or a new BoundingSphere instance if none was provided.
    */
  inline def fromEllipsoid(ellipsoid: Ellipsoid): BoundingSphere = ^.asInstanceOf[js.Dynamic].applyDynamic("fromEllipsoid")(ellipsoid.asInstanceOf[js.Any]).asInstanceOf[BoundingSphere]
  inline def fromEllipsoid(ellipsoid: Ellipsoid, result: BoundingSphere): BoundingSphere = (^.asInstanceOf[js.Dynamic].applyDynamic("fromEllipsoid")(ellipsoid.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[BoundingSphere]
  
  /**
    * Computes a tight-fitting bounding sphere enclosing a list of EncodedCartesian3s, where the points are
    * stored in parallel flat arrays in X, Y, Z, order.  The bounding sphere is computed by running two
    * algorithms, a naive algorithm and Ritter's algorithm. The smaller of the two spheres is used to
    * ensure a tight fit.
    * @param [positionsHigh] - An array of high bits of the encoded cartesians that the bounding sphere will enclose.  Each point
    *        is formed from three elements in the array in the order X, Y, Z.
    * @param [positionsLow] - An array of low bits of the encoded cartesians that the bounding sphere will enclose.  Each point
    *        is formed from three elements in the array in the order X, Y, Z.
    * @param [result] - The object onto which to store the result.
    * @returns The modified result parameter or a new BoundingSphere instance if one was not provided.
    */
  inline def fromEncodedCartesianVertices(): BoundingSphere = ^.asInstanceOf[js.Dynamic].applyDynamic("fromEncodedCartesianVertices")().asInstanceOf[BoundingSphere]
  inline def fromEncodedCartesianVertices(positionsHigh: js.Array[Double]): BoundingSphere = ^.asInstanceOf[js.Dynamic].applyDynamic("fromEncodedCartesianVertices")(positionsHigh.asInstanceOf[js.Any]).asInstanceOf[BoundingSphere]
  inline def fromEncodedCartesianVertices(positionsHigh: js.Array[Double], positionsLow: js.Array[Double]): BoundingSphere = (^.asInstanceOf[js.Dynamic].applyDynamic("fromEncodedCartesianVertices")(positionsHigh.asInstanceOf[js.Any], positionsLow.asInstanceOf[js.Any])).asInstanceOf[BoundingSphere]
  inline def fromEncodedCartesianVertices(positionsHigh: js.Array[Double], positionsLow: js.Array[Double], result: BoundingSphere): BoundingSphere = (^.asInstanceOf[js.Dynamic].applyDynamic("fromEncodedCartesianVertices")(positionsHigh.asInstanceOf[js.Any], positionsLow.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[BoundingSphere]
  inline def fromEncodedCartesianVertices(positionsHigh: js.Array[Double], positionsLow: Unit, result: BoundingSphere): BoundingSphere = (^.asInstanceOf[js.Dynamic].applyDynamic("fromEncodedCartesianVertices")(positionsHigh.asInstanceOf[js.Any], positionsLow.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[BoundingSphere]
  inline def fromEncodedCartesianVertices(positionsHigh: Unit, positionsLow: js.Array[Double]): BoundingSphere = (^.asInstanceOf[js.Dynamic].applyDynamic("fromEncodedCartesianVertices")(positionsHigh.asInstanceOf[js.Any], positionsLow.asInstanceOf[js.Any])).asInstanceOf[BoundingSphere]
  inline def fromEncodedCartesianVertices(positionsHigh: Unit, positionsLow: js.Array[Double], result: BoundingSphere): BoundingSphere = (^.asInstanceOf[js.Dynamic].applyDynamic("fromEncodedCartesianVertices")(positionsHigh.asInstanceOf[js.Any], positionsLow.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[BoundingSphere]
  inline def fromEncodedCartesianVertices(positionsHigh: Unit, positionsLow: Unit, result: BoundingSphere): BoundingSphere = (^.asInstanceOf[js.Dynamic].applyDynamic("fromEncodedCartesianVertices")(positionsHigh.asInstanceOf[js.Any], positionsLow.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[BoundingSphere]
  
  /**
    * Computes a tight-fitting bounding sphere enclosing the provided oriented bounding box.
    * @param orientedBoundingBox - The oriented bounding box.
    * @param [result] - The object onto which to store the result.
    * @returns The modified result parameter or a new BoundingSphere instance if none was provided.
    */
  inline def fromOrientedBoundingBox(orientedBoundingBox: OrientedBoundingBox): BoundingSphere = ^.asInstanceOf[js.Dynamic].applyDynamic("fromOrientedBoundingBox")(orientedBoundingBox.asInstanceOf[js.Any]).asInstanceOf[BoundingSphere]
  inline def fromOrientedBoundingBox(orientedBoundingBox: OrientedBoundingBox, result: BoundingSphere): BoundingSphere = (^.asInstanceOf[js.Dynamic].applyDynamic("fromOrientedBoundingBox")(orientedBoundingBox.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[BoundingSphere]
  
  /**
    * Computes a tight-fitting bounding sphere enclosing a list of 3D Cartesian points.
    * The bounding sphere is computed by running two algorithms, a naive algorithm and
    * Ritter's algorithm. The smaller of the two spheres is used to ensure a tight fit.
    * @param [positions] - An array of points that the bounding sphere will enclose.  Each point must have <code>x</code>, <code>y</code>, and <code>z</code> properties.
    * @param [result] - The object onto which to store the result.
    * @returns The modified result parameter or a new BoundingSphere instance if one was not provided.
    */
  inline def fromPoints(): BoundingSphere = ^.asInstanceOf[js.Dynamic].applyDynamic("fromPoints")().asInstanceOf[BoundingSphere]
  inline def fromPoints(positions: js.Array[Cartesian3]): BoundingSphere = ^.asInstanceOf[js.Dynamic].applyDynamic("fromPoints")(positions.asInstanceOf[js.Any]).asInstanceOf[BoundingSphere]
  inline def fromPoints(positions: js.Array[Cartesian3], result: BoundingSphere): BoundingSphere = (^.asInstanceOf[js.Dynamic].applyDynamic("fromPoints")(positions.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[BoundingSphere]
  inline def fromPoints(positions: Unit, result: BoundingSphere): BoundingSphere = (^.asInstanceOf[js.Dynamic].applyDynamic("fromPoints")(positions.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[BoundingSphere]
  
  /**
    * Computes a bounding sphere from a rectangle projected in 2D.
    * @param [rectangle] - The rectangle around which to create a bounding sphere.
    * @param [projection = GeographicProjection] - The projection used to project the rectangle into 2D.
    * @param [result] - The object onto which to store the result.
    * @returns The modified result parameter or a new BoundingSphere instance if none was provided.
    */
  inline def fromRectangle2D(): BoundingSphere = ^.asInstanceOf[js.Dynamic].applyDynamic("fromRectangle2D")().asInstanceOf[BoundingSphere]
  inline def fromRectangle2D(rectangle: Unit, projection: Any): BoundingSphere = (^.asInstanceOf[js.Dynamic].applyDynamic("fromRectangle2D")(rectangle.asInstanceOf[js.Any], projection.asInstanceOf[js.Any])).asInstanceOf[BoundingSphere]
  inline def fromRectangle2D(rectangle: Unit, projection: Any, result: BoundingSphere): BoundingSphere = (^.asInstanceOf[js.Dynamic].applyDynamic("fromRectangle2D")(rectangle.asInstanceOf[js.Any], projection.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[BoundingSphere]
  inline def fromRectangle2D(rectangle: Unit, projection: Unit, result: BoundingSphere): BoundingSphere = (^.asInstanceOf[js.Dynamic].applyDynamic("fromRectangle2D")(rectangle.asInstanceOf[js.Any], projection.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[BoundingSphere]
  inline def fromRectangle2D(rectangle: Rectangle): BoundingSphere = ^.asInstanceOf[js.Dynamic].applyDynamic("fromRectangle2D")(rectangle.asInstanceOf[js.Any]).asInstanceOf[BoundingSphere]
  inline def fromRectangle2D(rectangle: Rectangle, projection: Any): BoundingSphere = (^.asInstanceOf[js.Dynamic].applyDynamic("fromRectangle2D")(rectangle.asInstanceOf[js.Any], projection.asInstanceOf[js.Any])).asInstanceOf[BoundingSphere]
  inline def fromRectangle2D(rectangle: Rectangle, projection: Any, result: BoundingSphere): BoundingSphere = (^.asInstanceOf[js.Dynamic].applyDynamic("fromRectangle2D")(rectangle.asInstanceOf[js.Any], projection.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[BoundingSphere]
  inline def fromRectangle2D(rectangle: Rectangle, projection: Unit, result: BoundingSphere): BoundingSphere = (^.asInstanceOf[js.Dynamic].applyDynamic("fromRectangle2D")(rectangle.asInstanceOf[js.Any], projection.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[BoundingSphere]
  
  /**
    * Computes a bounding sphere from a rectangle in 3D. The bounding sphere is created using a subsample of points
    * on the ellipsoid and contained in the rectangle. It may not be accurate for all rectangles on all types of ellipsoids.
    * @param [rectangle] - The valid rectangle used to create a bounding sphere.
    * @param [ellipsoid = Ellipsoid.WGS84] - The ellipsoid used to determine positions of the rectangle.
    * @param [surfaceHeight = 0.0] - The height above the surface of the ellipsoid.
    * @param [result] - The object onto which to store the result.
    * @returns The modified result parameter or a new BoundingSphere instance if none was provided.
    */
  inline def fromRectangle3D(): BoundingSphere = ^.asInstanceOf[js.Dynamic].applyDynamic("fromRectangle3D")().asInstanceOf[BoundingSphere]
  inline def fromRectangle3D(rectangle: Unit, ellipsoid: Unit, surfaceHeight: Double): BoundingSphere = (^.asInstanceOf[js.Dynamic].applyDynamic("fromRectangle3D")(rectangle.asInstanceOf[js.Any], ellipsoid.asInstanceOf[js.Any], surfaceHeight.asInstanceOf[js.Any])).asInstanceOf[BoundingSphere]
  inline def fromRectangle3D(rectangle: Unit, ellipsoid: Unit, surfaceHeight: Double, result: BoundingSphere): BoundingSphere = (^.asInstanceOf[js.Dynamic].applyDynamic("fromRectangle3D")(rectangle.asInstanceOf[js.Any], ellipsoid.asInstanceOf[js.Any], surfaceHeight.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[BoundingSphere]
  inline def fromRectangle3D(rectangle: Unit, ellipsoid: Unit, surfaceHeight: Unit, result: BoundingSphere): BoundingSphere = (^.asInstanceOf[js.Dynamic].applyDynamic("fromRectangle3D")(rectangle.asInstanceOf[js.Any], ellipsoid.asInstanceOf[js.Any], surfaceHeight.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[BoundingSphere]
  inline def fromRectangle3D(rectangle: Unit, ellipsoid: Ellipsoid): BoundingSphere = (^.asInstanceOf[js.Dynamic].applyDynamic("fromRectangle3D")(rectangle.asInstanceOf[js.Any], ellipsoid.asInstanceOf[js.Any])).asInstanceOf[BoundingSphere]
  inline def fromRectangle3D(rectangle: Unit, ellipsoid: Ellipsoid, surfaceHeight: Double): BoundingSphere = (^.asInstanceOf[js.Dynamic].applyDynamic("fromRectangle3D")(rectangle.asInstanceOf[js.Any], ellipsoid.asInstanceOf[js.Any], surfaceHeight.asInstanceOf[js.Any])).asInstanceOf[BoundingSphere]
  inline def fromRectangle3D(rectangle: Unit, ellipsoid: Ellipsoid, surfaceHeight: Double, result: BoundingSphere): BoundingSphere = (^.asInstanceOf[js.Dynamic].applyDynamic("fromRectangle3D")(rectangle.asInstanceOf[js.Any], ellipsoid.asInstanceOf[js.Any], surfaceHeight.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[BoundingSphere]
  inline def fromRectangle3D(rectangle: Unit, ellipsoid: Ellipsoid, surfaceHeight: Unit, result: BoundingSphere): BoundingSphere = (^.asInstanceOf[js.Dynamic].applyDynamic("fromRectangle3D")(rectangle.asInstanceOf[js.Any], ellipsoid.asInstanceOf[js.Any], surfaceHeight.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[BoundingSphere]
  inline def fromRectangle3D(rectangle: Rectangle): BoundingSphere = ^.asInstanceOf[js.Dynamic].applyDynamic("fromRectangle3D")(rectangle.asInstanceOf[js.Any]).asInstanceOf[BoundingSphere]
  inline def fromRectangle3D(rectangle: Rectangle, ellipsoid: Unit, surfaceHeight: Double): BoundingSphere = (^.asInstanceOf[js.Dynamic].applyDynamic("fromRectangle3D")(rectangle.asInstanceOf[js.Any], ellipsoid.asInstanceOf[js.Any], surfaceHeight.asInstanceOf[js.Any])).asInstanceOf[BoundingSphere]
  inline def fromRectangle3D(rectangle: Rectangle, ellipsoid: Unit, surfaceHeight: Double, result: BoundingSphere): BoundingSphere = (^.asInstanceOf[js.Dynamic].applyDynamic("fromRectangle3D")(rectangle.asInstanceOf[js.Any], ellipsoid.asInstanceOf[js.Any], surfaceHeight.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[BoundingSphere]
  inline def fromRectangle3D(rectangle: Rectangle, ellipsoid: Unit, surfaceHeight: Unit, result: BoundingSphere): BoundingSphere = (^.asInstanceOf[js.Dynamic].applyDynamic("fromRectangle3D")(rectangle.asInstanceOf[js.Any], ellipsoid.asInstanceOf[js.Any], surfaceHeight.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[BoundingSphere]
  inline def fromRectangle3D(rectangle: Rectangle, ellipsoid: Ellipsoid): BoundingSphere = (^.asInstanceOf[js.Dynamic].applyDynamic("fromRectangle3D")(rectangle.asInstanceOf[js.Any], ellipsoid.asInstanceOf[js.Any])).asInstanceOf[BoundingSphere]
  inline def fromRectangle3D(rectangle: Rectangle, ellipsoid: Ellipsoid, surfaceHeight: Double): BoundingSphere = (^.asInstanceOf[js.Dynamic].applyDynamic("fromRectangle3D")(rectangle.asInstanceOf[js.Any], ellipsoid.asInstanceOf[js.Any], surfaceHeight.asInstanceOf[js.Any])).asInstanceOf[BoundingSphere]
  inline def fromRectangle3D(rectangle: Rectangle, ellipsoid: Ellipsoid, surfaceHeight: Double, result: BoundingSphere): BoundingSphere = (^.asInstanceOf[js.Dynamic].applyDynamic("fromRectangle3D")(rectangle.asInstanceOf[js.Any], ellipsoid.asInstanceOf[js.Any], surfaceHeight.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[BoundingSphere]
  inline def fromRectangle3D(rectangle: Rectangle, ellipsoid: Ellipsoid, surfaceHeight: Unit, result: BoundingSphere): BoundingSphere = (^.asInstanceOf[js.Dynamic].applyDynamic("fromRectangle3D")(rectangle.asInstanceOf[js.Any], ellipsoid.asInstanceOf[js.Any], surfaceHeight.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[BoundingSphere]
  
  /**
    * Computes a bounding sphere from a rectangle projected in 2D.  The bounding sphere accounts for the
    * object's minimum and maximum heights over the rectangle.
    * @param [rectangle] - The rectangle around which to create a bounding sphere.
    * @param [projection = GeographicProjection] - The projection used to project the rectangle into 2D.
    * @param [minimumHeight = 0.0] - The minimum height over the rectangle.
    * @param [maximumHeight = 0.0] - The maximum height over the rectangle.
    * @param [result] - The object onto which to store the result.
    * @returns The modified result parameter or a new BoundingSphere instance if none was provided.
    */
  inline def fromRectangleWithHeights2D(): BoundingSphere = ^.asInstanceOf[js.Dynamic].applyDynamic("fromRectangleWithHeights2D")().asInstanceOf[BoundingSphere]
  inline def fromRectangleWithHeights2D(rectangle: Unit, projection: Any): BoundingSphere = (^.asInstanceOf[js.Dynamic].applyDynamic("fromRectangleWithHeights2D")(rectangle.asInstanceOf[js.Any], projection.asInstanceOf[js.Any])).asInstanceOf[BoundingSphere]
  inline def fromRectangleWithHeights2D(rectangle: Unit, projection: Any, minimumHeight: Double): BoundingSphere = (^.asInstanceOf[js.Dynamic].applyDynamic("fromRectangleWithHeights2D")(rectangle.asInstanceOf[js.Any], projection.asInstanceOf[js.Any], minimumHeight.asInstanceOf[js.Any])).asInstanceOf[BoundingSphere]
  inline def fromRectangleWithHeights2D(rectangle: Unit, projection: Any, minimumHeight: Double, maximumHeight: Double): BoundingSphere = (^.asInstanceOf[js.Dynamic].applyDynamic("fromRectangleWithHeights2D")(rectangle.asInstanceOf[js.Any], projection.asInstanceOf[js.Any], minimumHeight.asInstanceOf[js.Any], maximumHeight.asInstanceOf[js.Any])).asInstanceOf[BoundingSphere]
  inline def fromRectangleWithHeights2D(
    rectangle: Unit,
    projection: Any,
    minimumHeight: Double,
    maximumHeight: Double,
    result: BoundingSphere
  ): BoundingSphere = (^.asInstanceOf[js.Dynamic].applyDynamic("fromRectangleWithHeights2D")(rectangle.asInstanceOf[js.Any], projection.asInstanceOf[js.Any], minimumHeight.asInstanceOf[js.Any], maximumHeight.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[BoundingSphere]
  inline def fromRectangleWithHeights2D(
    rectangle: Unit,
    projection: Any,
    minimumHeight: Double,
    maximumHeight: Unit,
    result: BoundingSphere
  ): BoundingSphere = (^.asInstanceOf[js.Dynamic].applyDynamic("fromRectangleWithHeights2D")(rectangle.asInstanceOf[js.Any], projection.asInstanceOf[js.Any], minimumHeight.asInstanceOf[js.Any], maximumHeight.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[BoundingSphere]
  inline def fromRectangleWithHeights2D(rectangle: Unit, projection: Any, minimumHeight: Unit, maximumHeight: Double): BoundingSphere = (^.asInstanceOf[js.Dynamic].applyDynamic("fromRectangleWithHeights2D")(rectangle.asInstanceOf[js.Any], projection.asInstanceOf[js.Any], minimumHeight.asInstanceOf[js.Any], maximumHeight.asInstanceOf[js.Any])).asInstanceOf[BoundingSphere]
  inline def fromRectangleWithHeights2D(
    rectangle: Unit,
    projection: Any,
    minimumHeight: Unit,
    maximumHeight: Double,
    result: BoundingSphere
  ): BoundingSphere = (^.asInstanceOf[js.Dynamic].applyDynamic("fromRectangleWithHeights2D")(rectangle.asInstanceOf[js.Any], projection.asInstanceOf[js.Any], minimumHeight.asInstanceOf[js.Any], maximumHeight.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[BoundingSphere]
  inline def fromRectangleWithHeights2D(rectangle: Unit, projection: Any, minimumHeight: Unit, maximumHeight: Unit, result: BoundingSphere): BoundingSphere = (^.asInstanceOf[js.Dynamic].applyDynamic("fromRectangleWithHeights2D")(rectangle.asInstanceOf[js.Any], projection.asInstanceOf[js.Any], minimumHeight.asInstanceOf[js.Any], maximumHeight.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[BoundingSphere]
  inline def fromRectangleWithHeights2D(rectangle: Unit, projection: Unit, minimumHeight: Double): BoundingSphere = (^.asInstanceOf[js.Dynamic].applyDynamic("fromRectangleWithHeights2D")(rectangle.asInstanceOf[js.Any], projection.asInstanceOf[js.Any], minimumHeight.asInstanceOf[js.Any])).asInstanceOf[BoundingSphere]
  inline def fromRectangleWithHeights2D(rectangle: Unit, projection: Unit, minimumHeight: Double, maximumHeight: Double): BoundingSphere = (^.asInstanceOf[js.Dynamic].applyDynamic("fromRectangleWithHeights2D")(rectangle.asInstanceOf[js.Any], projection.asInstanceOf[js.Any], minimumHeight.asInstanceOf[js.Any], maximumHeight.asInstanceOf[js.Any])).asInstanceOf[BoundingSphere]
  inline def fromRectangleWithHeights2D(
    rectangle: Unit,
    projection: Unit,
    minimumHeight: Double,
    maximumHeight: Double,
    result: BoundingSphere
  ): BoundingSphere = (^.asInstanceOf[js.Dynamic].applyDynamic("fromRectangleWithHeights2D")(rectangle.asInstanceOf[js.Any], projection.asInstanceOf[js.Any], minimumHeight.asInstanceOf[js.Any], maximumHeight.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[BoundingSphere]
  inline def fromRectangleWithHeights2D(
    rectangle: Unit,
    projection: Unit,
    minimumHeight: Double,
    maximumHeight: Unit,
    result: BoundingSphere
  ): BoundingSphere = (^.asInstanceOf[js.Dynamic].applyDynamic("fromRectangleWithHeights2D")(rectangle.asInstanceOf[js.Any], projection.asInstanceOf[js.Any], minimumHeight.asInstanceOf[js.Any], maximumHeight.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[BoundingSphere]
  inline def fromRectangleWithHeights2D(rectangle: Unit, projection: Unit, minimumHeight: Unit, maximumHeight: Double): BoundingSphere = (^.asInstanceOf[js.Dynamic].applyDynamic("fromRectangleWithHeights2D")(rectangle.asInstanceOf[js.Any], projection.asInstanceOf[js.Any], minimumHeight.asInstanceOf[js.Any], maximumHeight.asInstanceOf[js.Any])).asInstanceOf[BoundingSphere]
  inline def fromRectangleWithHeights2D(
    rectangle: Unit,
    projection: Unit,
    minimumHeight: Unit,
    maximumHeight: Double,
    result: BoundingSphere
  ): BoundingSphere = (^.asInstanceOf[js.Dynamic].applyDynamic("fromRectangleWithHeights2D")(rectangle.asInstanceOf[js.Any], projection.asInstanceOf[js.Any], minimumHeight.asInstanceOf[js.Any], maximumHeight.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[BoundingSphere]
  inline def fromRectangleWithHeights2D(
    rectangle: Unit,
    projection: Unit,
    minimumHeight: Unit,
    maximumHeight: Unit,
    result: BoundingSphere
  ): BoundingSphere = (^.asInstanceOf[js.Dynamic].applyDynamic("fromRectangleWithHeights2D")(rectangle.asInstanceOf[js.Any], projection.asInstanceOf[js.Any], minimumHeight.asInstanceOf[js.Any], maximumHeight.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[BoundingSphere]
  inline def fromRectangleWithHeights2D(rectangle: Rectangle): BoundingSphere = ^.asInstanceOf[js.Dynamic].applyDynamic("fromRectangleWithHeights2D")(rectangle.asInstanceOf[js.Any]).asInstanceOf[BoundingSphere]
  inline def fromRectangleWithHeights2D(rectangle: Rectangle, projection: Any): BoundingSphere = (^.asInstanceOf[js.Dynamic].applyDynamic("fromRectangleWithHeights2D")(rectangle.asInstanceOf[js.Any], projection.asInstanceOf[js.Any])).asInstanceOf[BoundingSphere]
  inline def fromRectangleWithHeights2D(rectangle: Rectangle, projection: Any, minimumHeight: Double): BoundingSphere = (^.asInstanceOf[js.Dynamic].applyDynamic("fromRectangleWithHeights2D")(rectangle.asInstanceOf[js.Any], projection.asInstanceOf[js.Any], minimumHeight.asInstanceOf[js.Any])).asInstanceOf[BoundingSphere]
  inline def fromRectangleWithHeights2D(rectangle: Rectangle, projection: Any, minimumHeight: Double, maximumHeight: Double): BoundingSphere = (^.asInstanceOf[js.Dynamic].applyDynamic("fromRectangleWithHeights2D")(rectangle.asInstanceOf[js.Any], projection.asInstanceOf[js.Any], minimumHeight.asInstanceOf[js.Any], maximumHeight.asInstanceOf[js.Any])).asInstanceOf[BoundingSphere]
  inline def fromRectangleWithHeights2D(
    rectangle: Rectangle,
    projection: Any,
    minimumHeight: Double,
    maximumHeight: Double,
    result: BoundingSphere
  ): BoundingSphere = (^.asInstanceOf[js.Dynamic].applyDynamic("fromRectangleWithHeights2D")(rectangle.asInstanceOf[js.Any], projection.asInstanceOf[js.Any], minimumHeight.asInstanceOf[js.Any], maximumHeight.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[BoundingSphere]
  inline def fromRectangleWithHeights2D(
    rectangle: Rectangle,
    projection: Any,
    minimumHeight: Double,
    maximumHeight: Unit,
    result: BoundingSphere
  ): BoundingSphere = (^.asInstanceOf[js.Dynamic].applyDynamic("fromRectangleWithHeights2D")(rectangle.asInstanceOf[js.Any], projection.asInstanceOf[js.Any], minimumHeight.asInstanceOf[js.Any], maximumHeight.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[BoundingSphere]
  inline def fromRectangleWithHeights2D(rectangle: Rectangle, projection: Any, minimumHeight: Unit, maximumHeight: Double): BoundingSphere = (^.asInstanceOf[js.Dynamic].applyDynamic("fromRectangleWithHeights2D")(rectangle.asInstanceOf[js.Any], projection.asInstanceOf[js.Any], minimumHeight.asInstanceOf[js.Any], maximumHeight.asInstanceOf[js.Any])).asInstanceOf[BoundingSphere]
  inline def fromRectangleWithHeights2D(
    rectangle: Rectangle,
    projection: Any,
    minimumHeight: Unit,
    maximumHeight: Double,
    result: BoundingSphere
  ): BoundingSphere = (^.asInstanceOf[js.Dynamic].applyDynamic("fromRectangleWithHeights2D")(rectangle.asInstanceOf[js.Any], projection.asInstanceOf[js.Any], minimumHeight.asInstanceOf[js.Any], maximumHeight.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[BoundingSphere]
  inline def fromRectangleWithHeights2D(
    rectangle: Rectangle,
    projection: Any,
    minimumHeight: Unit,
    maximumHeight: Unit,
    result: BoundingSphere
  ): BoundingSphere = (^.asInstanceOf[js.Dynamic].applyDynamic("fromRectangleWithHeights2D")(rectangle.asInstanceOf[js.Any], projection.asInstanceOf[js.Any], minimumHeight.asInstanceOf[js.Any], maximumHeight.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[BoundingSphere]
  inline def fromRectangleWithHeights2D(rectangle: Rectangle, projection: Unit, minimumHeight: Double): BoundingSphere = (^.asInstanceOf[js.Dynamic].applyDynamic("fromRectangleWithHeights2D")(rectangle.asInstanceOf[js.Any], projection.asInstanceOf[js.Any], minimumHeight.asInstanceOf[js.Any])).asInstanceOf[BoundingSphere]
  inline def fromRectangleWithHeights2D(rectangle: Rectangle, projection: Unit, minimumHeight: Double, maximumHeight: Double): BoundingSphere = (^.asInstanceOf[js.Dynamic].applyDynamic("fromRectangleWithHeights2D")(rectangle.asInstanceOf[js.Any], projection.asInstanceOf[js.Any], minimumHeight.asInstanceOf[js.Any], maximumHeight.asInstanceOf[js.Any])).asInstanceOf[BoundingSphere]
  inline def fromRectangleWithHeights2D(
    rectangle: Rectangle,
    projection: Unit,
    minimumHeight: Double,
    maximumHeight: Double,
    result: BoundingSphere
  ): BoundingSphere = (^.asInstanceOf[js.Dynamic].applyDynamic("fromRectangleWithHeights2D")(rectangle.asInstanceOf[js.Any], projection.asInstanceOf[js.Any], minimumHeight.asInstanceOf[js.Any], maximumHeight.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[BoundingSphere]
  inline def fromRectangleWithHeights2D(
    rectangle: Rectangle,
    projection: Unit,
    minimumHeight: Double,
    maximumHeight: Unit,
    result: BoundingSphere
  ): BoundingSphere = (^.asInstanceOf[js.Dynamic].applyDynamic("fromRectangleWithHeights2D")(rectangle.asInstanceOf[js.Any], projection.asInstanceOf[js.Any], minimumHeight.asInstanceOf[js.Any], maximumHeight.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[BoundingSphere]
  inline def fromRectangleWithHeights2D(rectangle: Rectangle, projection: Unit, minimumHeight: Unit, maximumHeight: Double): BoundingSphere = (^.asInstanceOf[js.Dynamic].applyDynamic("fromRectangleWithHeights2D")(rectangle.asInstanceOf[js.Any], projection.asInstanceOf[js.Any], minimumHeight.asInstanceOf[js.Any], maximumHeight.asInstanceOf[js.Any])).asInstanceOf[BoundingSphere]
  inline def fromRectangleWithHeights2D(
    rectangle: Rectangle,
    projection: Unit,
    minimumHeight: Unit,
    maximumHeight: Double,
    result: BoundingSphere
  ): BoundingSphere = (^.asInstanceOf[js.Dynamic].applyDynamic("fromRectangleWithHeights2D")(rectangle.asInstanceOf[js.Any], projection.asInstanceOf[js.Any], minimumHeight.asInstanceOf[js.Any], maximumHeight.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[BoundingSphere]
  inline def fromRectangleWithHeights2D(
    rectangle: Rectangle,
    projection: Unit,
    minimumHeight: Unit,
    maximumHeight: Unit,
    result: BoundingSphere
  ): BoundingSphere = (^.asInstanceOf[js.Dynamic].applyDynamic("fromRectangleWithHeights2D")(rectangle.asInstanceOf[js.Any], projection.asInstanceOf[js.Any], minimumHeight.asInstanceOf[js.Any], maximumHeight.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[BoundingSphere]
  
  /**
    * Computes a tight-fitting bounding sphere enclosing the provided affine transformation.
    * @param transformation - The affine transformation.
    * @param [result] - The object onto which to store the result.
    * @returns The modified result parameter or a new BoundingSphere instance if none was provided.
    */
  inline def fromTransformation(transformation: Matrix4): BoundingSphere = ^.asInstanceOf[js.Dynamic].applyDynamic("fromTransformation")(transformation.asInstanceOf[js.Any]).asInstanceOf[BoundingSphere]
  inline def fromTransformation(transformation: Matrix4, result: BoundingSphere): BoundingSphere = (^.asInstanceOf[js.Dynamic].applyDynamic("fromTransformation")(transformation.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[BoundingSphere]
  
  /**
    * Computes a tight-fitting bounding sphere enclosing a list of 3D points, where the points are
    * stored in a flat array in X, Y, Z, order.  The bounding sphere is computed by running two
    * algorithms, a naive algorithm and Ritter's algorithm. The smaller of the two spheres is used to
    * ensure a tight fit.
    * @example
    * // Compute the bounding sphere from 3 positions, each specified relative to a center.
    * // In addition to the X, Y, and Z coordinates, the points array contains two additional
    * // elements per point which are ignored for the purpose of computing the bounding sphere.
    * const center = new Cesium.Cartesian3(1.0, 2.0, 3.0);
    * const points = [1.0, 2.0, 3.0, 0.1, 0.2,
    *               4.0, 5.0, 6.0, 0.1, 0.2,
    *               7.0, 8.0, 9.0, 0.1, 0.2];
    * const sphere = Cesium.BoundingSphere.fromVertices(points, center, 5);
    * @param [positions] - An array of points that the bounding sphere will enclose.  Each point
    *        is formed from three elements in the array in the order X, Y, Z.
    * @param [center = Cartesian3.ZERO] - The position to which the positions are relative, which need not be the
    *        origin of the coordinate system.  This is useful when the positions are to be used for
    *        relative-to-center (RTC) rendering.
    * @param [stride = 3] - The number of array elements per vertex.  It must be at least 3, but it may
    *        be higher.  Regardless of the value of this parameter, the X coordinate of the first position
    *        is at array index 0, the Y coordinate is at array index 1, and the Z coordinate is at array index
    *        2.  When stride is 3, the X coordinate of the next position then begins at array index 3.  If
    *        the stride is 5, however, two array elements are skipped and the next position begins at array
    *        index 5.
    * @param [result] - The object onto which to store the result.
    * @returns The modified result parameter or a new BoundingSphere instance if one was not provided.
    */
  inline def fromVertices(): BoundingSphere = ^.asInstanceOf[js.Dynamic].applyDynamic("fromVertices")().asInstanceOf[BoundingSphere]
  inline def fromVertices(positions: js.Array[Double]): BoundingSphere = ^.asInstanceOf[js.Dynamic].applyDynamic("fromVertices")(positions.asInstanceOf[js.Any]).asInstanceOf[BoundingSphere]
  inline def fromVertices(positions: js.Array[Double], center: Unit, stride: Double): BoundingSphere = (^.asInstanceOf[js.Dynamic].applyDynamic("fromVertices")(positions.asInstanceOf[js.Any], center.asInstanceOf[js.Any], stride.asInstanceOf[js.Any])).asInstanceOf[BoundingSphere]
  inline def fromVertices(positions: js.Array[Double], center: Unit, stride: Double, result: BoundingSphere): BoundingSphere = (^.asInstanceOf[js.Dynamic].applyDynamic("fromVertices")(positions.asInstanceOf[js.Any], center.asInstanceOf[js.Any], stride.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[BoundingSphere]
  inline def fromVertices(positions: js.Array[Double], center: Unit, stride: Unit, result: BoundingSphere): BoundingSphere = (^.asInstanceOf[js.Dynamic].applyDynamic("fromVertices")(positions.asInstanceOf[js.Any], center.asInstanceOf[js.Any], stride.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[BoundingSphere]
  inline def fromVertices(positions: js.Array[Double], center: Cartesian3): BoundingSphere = (^.asInstanceOf[js.Dynamic].applyDynamic("fromVertices")(positions.asInstanceOf[js.Any], center.asInstanceOf[js.Any])).asInstanceOf[BoundingSphere]
  inline def fromVertices(positions: js.Array[Double], center: Cartesian3, stride: Double): BoundingSphere = (^.asInstanceOf[js.Dynamic].applyDynamic("fromVertices")(positions.asInstanceOf[js.Any], center.asInstanceOf[js.Any], stride.asInstanceOf[js.Any])).asInstanceOf[BoundingSphere]
  inline def fromVertices(positions: js.Array[Double], center: Cartesian3, stride: Double, result: BoundingSphere): BoundingSphere = (^.asInstanceOf[js.Dynamic].applyDynamic("fromVertices")(positions.asInstanceOf[js.Any], center.asInstanceOf[js.Any], stride.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[BoundingSphere]
  inline def fromVertices(positions: js.Array[Double], center: Cartesian3, stride: Unit, result: BoundingSphere): BoundingSphere = (^.asInstanceOf[js.Dynamic].applyDynamic("fromVertices")(positions.asInstanceOf[js.Any], center.asInstanceOf[js.Any], stride.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[BoundingSphere]
  inline def fromVertices(positions: Unit, center: Unit, stride: Double): BoundingSphere = (^.asInstanceOf[js.Dynamic].applyDynamic("fromVertices")(positions.asInstanceOf[js.Any], center.asInstanceOf[js.Any], stride.asInstanceOf[js.Any])).asInstanceOf[BoundingSphere]
  inline def fromVertices(positions: Unit, center: Unit, stride: Double, result: BoundingSphere): BoundingSphere = (^.asInstanceOf[js.Dynamic].applyDynamic("fromVertices")(positions.asInstanceOf[js.Any], center.asInstanceOf[js.Any], stride.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[BoundingSphere]
  inline def fromVertices(positions: Unit, center: Unit, stride: Unit, result: BoundingSphere): BoundingSphere = (^.asInstanceOf[js.Dynamic].applyDynamic("fromVertices")(positions.asInstanceOf[js.Any], center.asInstanceOf[js.Any], stride.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[BoundingSphere]
  inline def fromVertices(positions: Unit, center: Cartesian3): BoundingSphere = (^.asInstanceOf[js.Dynamic].applyDynamic("fromVertices")(positions.asInstanceOf[js.Any], center.asInstanceOf[js.Any])).asInstanceOf[BoundingSphere]
  inline def fromVertices(positions: Unit, center: Cartesian3, stride: Double): BoundingSphere = (^.asInstanceOf[js.Dynamic].applyDynamic("fromVertices")(positions.asInstanceOf[js.Any], center.asInstanceOf[js.Any], stride.asInstanceOf[js.Any])).asInstanceOf[BoundingSphere]
  inline def fromVertices(positions: Unit, center: Cartesian3, stride: Double, result: BoundingSphere): BoundingSphere = (^.asInstanceOf[js.Dynamic].applyDynamic("fromVertices")(positions.asInstanceOf[js.Any], center.asInstanceOf[js.Any], stride.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[BoundingSphere]
  inline def fromVertices(positions: Unit, center: Cartesian3, stride: Unit, result: BoundingSphere): BoundingSphere = (^.asInstanceOf[js.Dynamic].applyDynamic("fromVertices")(positions.asInstanceOf[js.Any], center.asInstanceOf[js.Any], stride.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[BoundingSphere]
  
  /**
    * Determines which side of a plane a sphere is located.
    * @param sphere - The bounding sphere to test.
    * @param plane - The plane to test against.
    * @returns {@link Intersect.INSIDE} if the entire sphere is on the side of the plane
    *                      the normal is pointing, {@link Intersect.OUTSIDE} if the entire sphere is
    *                      on the opposite side, and {@link Intersect.INTERSECTING} if the sphere
    *                      intersects the plane.
    */
  inline def intersectPlane(sphere: BoundingSphere, plane: Plane): Intersect = (^.asInstanceOf[js.Dynamic].applyDynamic("intersectPlane")(sphere.asInstanceOf[js.Any], plane.asInstanceOf[js.Any])).asInstanceOf[Intersect]
  
  /**
    * Determines whether or not a sphere is hidden from view by the occluder.
    * @param sphere - The bounding sphere surrounding the occludee object.
    * @param occluder - The occluder.
    * @returns <code>true</code> if the sphere is not visible; otherwise <code>false</code>.
    */
  inline def isOccluded(sphere: BoundingSphere, occluder: Occluder): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isOccluded")(sphere.asInstanceOf[js.Any], occluder.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  /**
    * Stores the provided instance into the provided array.
    * @param value - The value to pack.
    * @param array - The array to pack into.
    * @param [startingIndex = 0] - The index into the array at which to start packing the elements.
    * @returns The array that was packed into
    */
  inline def pack(value: BoundingSphere, array: js.Array[Double]): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("pack")(value.asInstanceOf[js.Any], array.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
  inline def pack(value: BoundingSphere, array: js.Array[Double], startingIndex: Double): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("pack")(value.asInstanceOf[js.Any], array.asInstanceOf[js.Any], startingIndex.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
  
  /**
    * The number of elements used to pack the object into an array.
    */
  @JSImport("cesium", "BoundingSphere.packedLength")
  @js.native
  def packedLength: Double = js.native
  inline def packedLength_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("packedLength")(x.asInstanceOf[js.Any])
  
  /**
    * Creates a bounding sphere in 2D from a bounding sphere in 3D world coordinates.
    * @param sphere - The bounding sphere to transform to 2D.
    * @param [projection = GeographicProjection] - The projection to 2D.
    * @param [result] - The object onto which to store the result.
    * @returns The modified result parameter or a new BoundingSphere instance if none was provided.
    */
  inline def projectTo2D(sphere: BoundingSphere): BoundingSphere = ^.asInstanceOf[js.Dynamic].applyDynamic("projectTo2D")(sphere.asInstanceOf[js.Any]).asInstanceOf[BoundingSphere]
  inline def projectTo2D(sphere: BoundingSphere, projection: Any): BoundingSphere = (^.asInstanceOf[js.Dynamic].applyDynamic("projectTo2D")(sphere.asInstanceOf[js.Any], projection.asInstanceOf[js.Any])).asInstanceOf[BoundingSphere]
  inline def projectTo2D(sphere: BoundingSphere, projection: Any, result: BoundingSphere): BoundingSphere = (^.asInstanceOf[js.Dynamic].applyDynamic("projectTo2D")(sphere.asInstanceOf[js.Any], projection.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[BoundingSphere]
  inline def projectTo2D(sphere: BoundingSphere, projection: Unit, result: BoundingSphere): BoundingSphere = (^.asInstanceOf[js.Dynamic].applyDynamic("projectTo2D")(sphere.asInstanceOf[js.Any], projection.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[BoundingSphere]
  
  /**
    * Applies a 4x4 affine transformation matrix to a bounding sphere.
    * @param sphere - The bounding sphere to apply the transformation to.
    * @param transform - The transformation matrix to apply to the bounding sphere.
    * @param [result] - The object onto which to store the result.
    * @returns The modified result parameter or a new BoundingSphere instance if none was provided.
    */
  inline def transform(sphere: BoundingSphere, transform: Matrix4): BoundingSphere = (^.asInstanceOf[js.Dynamic].applyDynamic("transform")(sphere.asInstanceOf[js.Any], transform.asInstanceOf[js.Any])).asInstanceOf[BoundingSphere]
  inline def transform(sphere: BoundingSphere, transform: Matrix4, result: BoundingSphere): BoundingSphere = (^.asInstanceOf[js.Dynamic].applyDynamic("transform")(sphere.asInstanceOf[js.Any], transform.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[BoundingSphere]
  
  /**
    * Applies a 4x4 affine transformation matrix to a bounding sphere where there is no scale
    * The transformation matrix is not verified to have a uniform scale of 1.
    * This method is faster than computing the general bounding sphere transform using {@link BoundingSphere.transform}.
    * @example
    * const modelMatrix = Cesium.Transforms.eastNorthUpToFixedFrame(positionOnEllipsoid);
    * const boundingSphere = new Cesium.BoundingSphere();
    * const newBoundingSphere = Cesium.BoundingSphere.transformWithoutScale(boundingSphere, modelMatrix);
    * @param sphere - The bounding sphere to apply the transformation to.
    * @param transform - The transformation matrix to apply to the bounding sphere.
    * @param [result] - The object onto which to store the result.
    * @returns The modified result parameter or a new BoundingSphere instance if none was provided.
    */
  inline def transformWithoutScale(sphere: BoundingSphere, transform: Matrix4): BoundingSphere = (^.asInstanceOf[js.Dynamic].applyDynamic("transformWithoutScale")(sphere.asInstanceOf[js.Any], transform.asInstanceOf[js.Any])).asInstanceOf[BoundingSphere]
  inline def transformWithoutScale(sphere: BoundingSphere, transform: Matrix4, result: BoundingSphere): BoundingSphere = (^.asInstanceOf[js.Dynamic].applyDynamic("transformWithoutScale")(sphere.asInstanceOf[js.Any], transform.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[BoundingSphere]
  
  /**
    * Computes a bounding sphere that contains both the left and right bounding spheres.
    * @param left - A sphere to enclose in a bounding sphere.
    * @param right - A sphere to enclose in a bounding sphere.
    * @param [result] - The object onto which to store the result.
    * @returns The modified result parameter or a new BoundingSphere instance if none was provided.
    */
  inline def union(left: BoundingSphere, right: BoundingSphere): BoundingSphere = (^.asInstanceOf[js.Dynamic].applyDynamic("union")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any])).asInstanceOf[BoundingSphere]
  inline def union(left: BoundingSphere, right: BoundingSphere, result: BoundingSphere): BoundingSphere = (^.asInstanceOf[js.Dynamic].applyDynamic("union")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[BoundingSphere]
  
  /**
    * Retrieves an instance from a packed array.
    * @param array - The packed array.
    * @param [startingIndex = 0] - The starting index of the element to be unpacked.
    * @param [result] - The object into which to store the result.
    * @returns The modified result parameter or a new BoundingSphere instance if one was not provided.
    */
  inline def unpack(array: js.Array[Double]): BoundingSphere = ^.asInstanceOf[js.Dynamic].applyDynamic("unpack")(array.asInstanceOf[js.Any]).asInstanceOf[BoundingSphere]
  inline def unpack(array: js.Array[Double], startingIndex: Double): BoundingSphere = (^.asInstanceOf[js.Dynamic].applyDynamic("unpack")(array.asInstanceOf[js.Any], startingIndex.asInstanceOf[js.Any])).asInstanceOf[BoundingSphere]
  inline def unpack(array: js.Array[Double], startingIndex: Double, result: BoundingSphere): BoundingSphere = (^.asInstanceOf[js.Dynamic].applyDynamic("unpack")(array.asInstanceOf[js.Any], startingIndex.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[BoundingSphere]
  inline def unpack(array: js.Array[Double], startingIndex: Unit, result: BoundingSphere): BoundingSphere = (^.asInstanceOf[js.Dynamic].applyDynamic("unpack")(array.asInstanceOf[js.Any], startingIndex.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[BoundingSphere]
}
