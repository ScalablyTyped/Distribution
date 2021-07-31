package typings.cesium.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("cesium", "BoundingSphere")
@js.native
class BoundingSphere () extends Packable {
  def this(center: Cartesian3) = this()
  def this(center: Unit, radius: Double) = this()
  def this(center: Cartesian3, radius: Double) = this()
  
  var center: Cartesian3 = js.native
  
  def clone(result: BoundingSphere): BoundingSphere = js.native
  
  def equals(): Boolean = js.native
  def equals(right: BoundingSphere): Boolean = js.native
  
  def intersect(plane: Cartesian4): Intersect = js.native
  
  var radius: Double = js.native
}
object BoundingSphere {
  
  @JSImport("cesium", "BoundingSphere")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @scala.inline
  def clone_(sphere: BoundingSphere): BoundingSphere = ^.asInstanceOf[js.Dynamic].applyDynamic("clone")(sphere.asInstanceOf[js.Any]).asInstanceOf[BoundingSphere]
  @scala.inline
  def clone_(sphere: BoundingSphere, result: BoundingSphere): BoundingSphere = (^.asInstanceOf[js.Dynamic].applyDynamic("clone")(sphere.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[BoundingSphere]
  
  /* static member */
  @scala.inline
  def computePlaneDistances(sphere: BoundingSphere, position: Cartesian3, direction: Cartesian3): Interval = (^.asInstanceOf[js.Dynamic].applyDynamic("computePlaneDistances")(sphere.asInstanceOf[js.Any], position.asInstanceOf[js.Any], direction.asInstanceOf[js.Any])).asInstanceOf[Interval]
  @scala.inline
  def computePlaneDistances(sphere: BoundingSphere, position: Cartesian3, direction: Cartesian3, result: Cartesian2): Interval = (^.asInstanceOf[js.Dynamic].applyDynamic("computePlaneDistances")(sphere.asInstanceOf[js.Any], position.asInstanceOf[js.Any], direction.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Interval]
  
  /* static member */
  @scala.inline
  def distanceSquaredTo(sphere: BoundingSphere, cartesian: Cartesian3): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("distanceSquaredTo")(sphere.asInstanceOf[js.Any], cartesian.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  /* static member */
  @scala.inline
  def equals_(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("equals")().asInstanceOf[Boolean]
  @scala.inline
  def equals_(left: Unit, right: BoundingSphere): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equals")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  @scala.inline
  def equals_(left: BoundingSphere): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("equals")(left.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  @scala.inline
  def equals_(left: BoundingSphere, right: BoundingSphere): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equals")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  /* static member */
  @scala.inline
  def expand(sphere: BoundingSphere, point: Cartesian3): BoundingSphere = (^.asInstanceOf[js.Dynamic].applyDynamic("expand")(sphere.asInstanceOf[js.Any], point.asInstanceOf[js.Any])).asInstanceOf[BoundingSphere]
  @scala.inline
  def expand(sphere: BoundingSphere, point: Cartesian3, result: BoundingSphere): BoundingSphere = (^.asInstanceOf[js.Dynamic].applyDynamic("expand")(sphere.asInstanceOf[js.Any], point.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[BoundingSphere]
  
  /* static member */
  @scala.inline
  def fromBoundingSpheres(boundingSpheres: js.Array[BoundingSphere]): BoundingSphere = ^.asInstanceOf[js.Dynamic].applyDynamic("fromBoundingSpheres")(boundingSpheres.asInstanceOf[js.Any]).asInstanceOf[BoundingSphere]
  @scala.inline
  def fromBoundingSpheres(boundingSpheres: js.Array[BoundingSphere], result: BoundingSphere): BoundingSphere = (^.asInstanceOf[js.Dynamic].applyDynamic("fromBoundingSpheres")(boundingSpheres.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[BoundingSphere]
  
  /* static member */
  @scala.inline
  def fromCornerPoints(): BoundingSphere = ^.asInstanceOf[js.Dynamic].applyDynamic("fromCornerPoints")().asInstanceOf[BoundingSphere]
  @scala.inline
  def fromCornerPoints(corner: Double): BoundingSphere = ^.asInstanceOf[js.Dynamic].applyDynamic("fromCornerPoints")(corner.asInstanceOf[js.Any]).asInstanceOf[BoundingSphere]
  @scala.inline
  def fromCornerPoints(corner: Double, oppositeCorner: Double): BoundingSphere = (^.asInstanceOf[js.Dynamic].applyDynamic("fromCornerPoints")(corner.asInstanceOf[js.Any], oppositeCorner.asInstanceOf[js.Any])).asInstanceOf[BoundingSphere]
  @scala.inline
  def fromCornerPoints(corner: Double, oppositeCorner: Double, result: BoundingSphere): BoundingSphere = (^.asInstanceOf[js.Dynamic].applyDynamic("fromCornerPoints")(corner.asInstanceOf[js.Any], oppositeCorner.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[BoundingSphere]
  @scala.inline
  def fromCornerPoints(corner: Double, oppositeCorner: Unit, result: BoundingSphere): BoundingSphere = (^.asInstanceOf[js.Dynamic].applyDynamic("fromCornerPoints")(corner.asInstanceOf[js.Any], oppositeCorner.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[BoundingSphere]
  @scala.inline
  def fromCornerPoints(corner: Unit, oppositeCorner: Double): BoundingSphere = (^.asInstanceOf[js.Dynamic].applyDynamic("fromCornerPoints")(corner.asInstanceOf[js.Any], oppositeCorner.asInstanceOf[js.Any])).asInstanceOf[BoundingSphere]
  @scala.inline
  def fromCornerPoints(corner: Unit, oppositeCorner: Double, result: BoundingSphere): BoundingSphere = (^.asInstanceOf[js.Dynamic].applyDynamic("fromCornerPoints")(corner.asInstanceOf[js.Any], oppositeCorner.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[BoundingSphere]
  @scala.inline
  def fromCornerPoints(corner: Unit, oppositeCorner: Unit, result: BoundingSphere): BoundingSphere = (^.asInstanceOf[js.Dynamic].applyDynamic("fromCornerPoints")(corner.asInstanceOf[js.Any], oppositeCorner.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[BoundingSphere]
  
  /* static member */
  @scala.inline
  def fromEllipsoid(ellipsoid: Ellipsoid): BoundingSphere = ^.asInstanceOf[js.Dynamic].applyDynamic("fromEllipsoid")(ellipsoid.asInstanceOf[js.Any]).asInstanceOf[BoundingSphere]
  @scala.inline
  def fromEllipsoid(ellipsoid: Ellipsoid, result: BoundingSphere): BoundingSphere = (^.asInstanceOf[js.Dynamic].applyDynamic("fromEllipsoid")(ellipsoid.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[BoundingSphere]
  
  /* static member */
  @scala.inline
  def fromPoints(positions: js.Array[Cartesian3]): BoundingSphere = ^.asInstanceOf[js.Dynamic].applyDynamic("fromPoints")(positions.asInstanceOf[js.Any]).asInstanceOf[BoundingSphere]
  @scala.inline
  def fromPoints(positions: js.Array[Cartesian3], result: BoundingSphere): BoundingSphere = (^.asInstanceOf[js.Dynamic].applyDynamic("fromPoints")(positions.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[BoundingSphere]
  
  /* static member */
  @scala.inline
  def fromRectangle2D(rectangle: Rectangle): BoundingSphere = ^.asInstanceOf[js.Dynamic].applyDynamic("fromRectangle2D")(rectangle.asInstanceOf[js.Any]).asInstanceOf[BoundingSphere]
  @scala.inline
  def fromRectangle2D(rectangle: Rectangle, projection: js.Any): BoundingSphere = (^.asInstanceOf[js.Dynamic].applyDynamic("fromRectangle2D")(rectangle.asInstanceOf[js.Any], projection.asInstanceOf[js.Any])).asInstanceOf[BoundingSphere]
  @scala.inline
  def fromRectangle2D(rectangle: Rectangle, projection: js.Any, result: BoundingSphere): BoundingSphere = (^.asInstanceOf[js.Dynamic].applyDynamic("fromRectangle2D")(rectangle.asInstanceOf[js.Any], projection.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[BoundingSphere]
  @scala.inline
  def fromRectangle2D(rectangle: Rectangle, projection: Unit, result: BoundingSphere): BoundingSphere = (^.asInstanceOf[js.Dynamic].applyDynamic("fromRectangle2D")(rectangle.asInstanceOf[js.Any], projection.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[BoundingSphere]
  
  /* static member */
  @scala.inline
  def fromRectangle3D(rectangle: Rectangle): BoundingSphere = ^.asInstanceOf[js.Dynamic].applyDynamic("fromRectangle3D")(rectangle.asInstanceOf[js.Any]).asInstanceOf[BoundingSphere]
  @scala.inline
  def fromRectangle3D(rectangle: Rectangle, ellipsoid: Unit, surfaceHeight: Double): BoundingSphere = (^.asInstanceOf[js.Dynamic].applyDynamic("fromRectangle3D")(rectangle.asInstanceOf[js.Any], ellipsoid.asInstanceOf[js.Any], surfaceHeight.asInstanceOf[js.Any])).asInstanceOf[BoundingSphere]
  @scala.inline
  def fromRectangle3D(rectangle: Rectangle, ellipsoid: Unit, surfaceHeight: Double, result: BoundingSphere): BoundingSphere = (^.asInstanceOf[js.Dynamic].applyDynamic("fromRectangle3D")(rectangle.asInstanceOf[js.Any], ellipsoid.asInstanceOf[js.Any], surfaceHeight.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[BoundingSphere]
  @scala.inline
  def fromRectangle3D(rectangle: Rectangle, ellipsoid: Unit, surfaceHeight: Unit, result: BoundingSphere): BoundingSphere = (^.asInstanceOf[js.Dynamic].applyDynamic("fromRectangle3D")(rectangle.asInstanceOf[js.Any], ellipsoid.asInstanceOf[js.Any], surfaceHeight.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[BoundingSphere]
  @scala.inline
  def fromRectangle3D(rectangle: Rectangle, ellipsoid: Ellipsoid): BoundingSphere = (^.asInstanceOf[js.Dynamic].applyDynamic("fromRectangle3D")(rectangle.asInstanceOf[js.Any], ellipsoid.asInstanceOf[js.Any])).asInstanceOf[BoundingSphere]
  @scala.inline
  def fromRectangle3D(rectangle: Rectangle, ellipsoid: Ellipsoid, surfaceHeight: Double): BoundingSphere = (^.asInstanceOf[js.Dynamic].applyDynamic("fromRectangle3D")(rectangle.asInstanceOf[js.Any], ellipsoid.asInstanceOf[js.Any], surfaceHeight.asInstanceOf[js.Any])).asInstanceOf[BoundingSphere]
  @scala.inline
  def fromRectangle3D(rectangle: Rectangle, ellipsoid: Ellipsoid, surfaceHeight: Double, result: BoundingSphere): BoundingSphere = (^.asInstanceOf[js.Dynamic].applyDynamic("fromRectangle3D")(rectangle.asInstanceOf[js.Any], ellipsoid.asInstanceOf[js.Any], surfaceHeight.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[BoundingSphere]
  @scala.inline
  def fromRectangle3D(rectangle: Rectangle, ellipsoid: Ellipsoid, surfaceHeight: Unit, result: BoundingSphere): BoundingSphere = (^.asInstanceOf[js.Dynamic].applyDynamic("fromRectangle3D")(rectangle.asInstanceOf[js.Any], ellipsoid.asInstanceOf[js.Any], surfaceHeight.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[BoundingSphere]
  
  /* static member */
  @scala.inline
  def fromRectangleWithHeights2D(rectangle: Rectangle): BoundingSphere = ^.asInstanceOf[js.Dynamic].applyDynamic("fromRectangleWithHeights2D")(rectangle.asInstanceOf[js.Any]).asInstanceOf[BoundingSphere]
  @scala.inline
  def fromRectangleWithHeights2D(rectangle: Rectangle, projection: js.Any): BoundingSphere = (^.asInstanceOf[js.Dynamic].applyDynamic("fromRectangleWithHeights2D")(rectangle.asInstanceOf[js.Any], projection.asInstanceOf[js.Any])).asInstanceOf[BoundingSphere]
  @scala.inline
  def fromRectangleWithHeights2D(rectangle: Rectangle, projection: js.Any, minimumHeight: Double): BoundingSphere = (^.asInstanceOf[js.Dynamic].applyDynamic("fromRectangleWithHeights2D")(rectangle.asInstanceOf[js.Any], projection.asInstanceOf[js.Any], minimumHeight.asInstanceOf[js.Any])).asInstanceOf[BoundingSphere]
  @scala.inline
  def fromRectangleWithHeights2D(rectangle: Rectangle, projection: js.Any, minimumHeight: Double, maximumHeight: Double): BoundingSphere = (^.asInstanceOf[js.Dynamic].applyDynamic("fromRectangleWithHeights2D")(rectangle.asInstanceOf[js.Any], projection.asInstanceOf[js.Any], minimumHeight.asInstanceOf[js.Any], maximumHeight.asInstanceOf[js.Any])).asInstanceOf[BoundingSphere]
  @scala.inline
  def fromRectangleWithHeights2D(
    rectangle: Rectangle,
    projection: js.Any,
    minimumHeight: Double,
    maximumHeight: Double,
    result: BoundingSphere
  ): BoundingSphere = (^.asInstanceOf[js.Dynamic].applyDynamic("fromRectangleWithHeights2D")(rectangle.asInstanceOf[js.Any], projection.asInstanceOf[js.Any], minimumHeight.asInstanceOf[js.Any], maximumHeight.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[BoundingSphere]
  @scala.inline
  def fromRectangleWithHeights2D(
    rectangle: Rectangle,
    projection: js.Any,
    minimumHeight: Double,
    maximumHeight: Unit,
    result: BoundingSphere
  ): BoundingSphere = (^.asInstanceOf[js.Dynamic].applyDynamic("fromRectangleWithHeights2D")(rectangle.asInstanceOf[js.Any], projection.asInstanceOf[js.Any], minimumHeight.asInstanceOf[js.Any], maximumHeight.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[BoundingSphere]
  @scala.inline
  def fromRectangleWithHeights2D(rectangle: Rectangle, projection: js.Any, minimumHeight: Unit, maximumHeight: Double): BoundingSphere = (^.asInstanceOf[js.Dynamic].applyDynamic("fromRectangleWithHeights2D")(rectangle.asInstanceOf[js.Any], projection.asInstanceOf[js.Any], minimumHeight.asInstanceOf[js.Any], maximumHeight.asInstanceOf[js.Any])).asInstanceOf[BoundingSphere]
  @scala.inline
  def fromRectangleWithHeights2D(
    rectangle: Rectangle,
    projection: js.Any,
    minimumHeight: Unit,
    maximumHeight: Double,
    result: BoundingSphere
  ): BoundingSphere = (^.asInstanceOf[js.Dynamic].applyDynamic("fromRectangleWithHeights2D")(rectangle.asInstanceOf[js.Any], projection.asInstanceOf[js.Any], minimumHeight.asInstanceOf[js.Any], maximumHeight.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[BoundingSphere]
  @scala.inline
  def fromRectangleWithHeights2D(
    rectangle: Rectangle,
    projection: js.Any,
    minimumHeight: Unit,
    maximumHeight: Unit,
    result: BoundingSphere
  ): BoundingSphere = (^.asInstanceOf[js.Dynamic].applyDynamic("fromRectangleWithHeights2D")(rectangle.asInstanceOf[js.Any], projection.asInstanceOf[js.Any], minimumHeight.asInstanceOf[js.Any], maximumHeight.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[BoundingSphere]
  @scala.inline
  def fromRectangleWithHeights2D(rectangle: Rectangle, projection: Unit, minimumHeight: Double): BoundingSphere = (^.asInstanceOf[js.Dynamic].applyDynamic("fromRectangleWithHeights2D")(rectangle.asInstanceOf[js.Any], projection.asInstanceOf[js.Any], minimumHeight.asInstanceOf[js.Any])).asInstanceOf[BoundingSphere]
  @scala.inline
  def fromRectangleWithHeights2D(rectangle: Rectangle, projection: Unit, minimumHeight: Double, maximumHeight: Double): BoundingSphere = (^.asInstanceOf[js.Dynamic].applyDynamic("fromRectangleWithHeights2D")(rectangle.asInstanceOf[js.Any], projection.asInstanceOf[js.Any], minimumHeight.asInstanceOf[js.Any], maximumHeight.asInstanceOf[js.Any])).asInstanceOf[BoundingSphere]
  @scala.inline
  def fromRectangleWithHeights2D(
    rectangle: Rectangle,
    projection: Unit,
    minimumHeight: Double,
    maximumHeight: Double,
    result: BoundingSphere
  ): BoundingSphere = (^.asInstanceOf[js.Dynamic].applyDynamic("fromRectangleWithHeights2D")(rectangle.asInstanceOf[js.Any], projection.asInstanceOf[js.Any], minimumHeight.asInstanceOf[js.Any], maximumHeight.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[BoundingSphere]
  @scala.inline
  def fromRectangleWithHeights2D(
    rectangle: Rectangle,
    projection: Unit,
    minimumHeight: Double,
    maximumHeight: Unit,
    result: BoundingSphere
  ): BoundingSphere = (^.asInstanceOf[js.Dynamic].applyDynamic("fromRectangleWithHeights2D")(rectangle.asInstanceOf[js.Any], projection.asInstanceOf[js.Any], minimumHeight.asInstanceOf[js.Any], maximumHeight.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[BoundingSphere]
  @scala.inline
  def fromRectangleWithHeights2D(rectangle: Rectangle, projection: Unit, minimumHeight: Unit, maximumHeight: Double): BoundingSphere = (^.asInstanceOf[js.Dynamic].applyDynamic("fromRectangleWithHeights2D")(rectangle.asInstanceOf[js.Any], projection.asInstanceOf[js.Any], minimumHeight.asInstanceOf[js.Any], maximumHeight.asInstanceOf[js.Any])).asInstanceOf[BoundingSphere]
  @scala.inline
  def fromRectangleWithHeights2D(
    rectangle: Rectangle,
    projection: Unit,
    minimumHeight: Unit,
    maximumHeight: Double,
    result: BoundingSphere
  ): BoundingSphere = (^.asInstanceOf[js.Dynamic].applyDynamic("fromRectangleWithHeights2D")(rectangle.asInstanceOf[js.Any], projection.asInstanceOf[js.Any], minimumHeight.asInstanceOf[js.Any], maximumHeight.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[BoundingSphere]
  @scala.inline
  def fromRectangleWithHeights2D(
    rectangle: Rectangle,
    projection: Unit,
    minimumHeight: Unit,
    maximumHeight: Unit,
    result: BoundingSphere
  ): BoundingSphere = (^.asInstanceOf[js.Dynamic].applyDynamic("fromRectangleWithHeights2D")(rectangle.asInstanceOf[js.Any], projection.asInstanceOf[js.Any], minimumHeight.asInstanceOf[js.Any], maximumHeight.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[BoundingSphere]
  
  /* static member */
  @scala.inline
  def fromVertices(positions: js.Array[Cartesian3]): BoundingSphere = ^.asInstanceOf[js.Dynamic].applyDynamic("fromVertices")(positions.asInstanceOf[js.Any]).asInstanceOf[BoundingSphere]
  @scala.inline
  def fromVertices(positions: js.Array[Cartesian3], center: Unit, stride: Double): BoundingSphere = (^.asInstanceOf[js.Dynamic].applyDynamic("fromVertices")(positions.asInstanceOf[js.Any], center.asInstanceOf[js.Any], stride.asInstanceOf[js.Any])).asInstanceOf[BoundingSphere]
  @scala.inline
  def fromVertices(positions: js.Array[Cartesian3], center: Unit, stride: Double, result: BoundingSphere): BoundingSphere = (^.asInstanceOf[js.Dynamic].applyDynamic("fromVertices")(positions.asInstanceOf[js.Any], center.asInstanceOf[js.Any], stride.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[BoundingSphere]
  @scala.inline
  def fromVertices(positions: js.Array[Cartesian3], center: Unit, stride: Unit, result: BoundingSphere): BoundingSphere = (^.asInstanceOf[js.Dynamic].applyDynamic("fromVertices")(positions.asInstanceOf[js.Any], center.asInstanceOf[js.Any], stride.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[BoundingSphere]
  @scala.inline
  def fromVertices(positions: js.Array[Cartesian3], center: Cartesian3): BoundingSphere = (^.asInstanceOf[js.Dynamic].applyDynamic("fromVertices")(positions.asInstanceOf[js.Any], center.asInstanceOf[js.Any])).asInstanceOf[BoundingSphere]
  @scala.inline
  def fromVertices(positions: js.Array[Cartesian3], center: Cartesian3, stride: Double): BoundingSphere = (^.asInstanceOf[js.Dynamic].applyDynamic("fromVertices")(positions.asInstanceOf[js.Any], center.asInstanceOf[js.Any], stride.asInstanceOf[js.Any])).asInstanceOf[BoundingSphere]
  @scala.inline
  def fromVertices(positions: js.Array[Cartesian3], center: Cartesian3, stride: Double, result: BoundingSphere): BoundingSphere = (^.asInstanceOf[js.Dynamic].applyDynamic("fromVertices")(positions.asInstanceOf[js.Any], center.asInstanceOf[js.Any], stride.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[BoundingSphere]
  @scala.inline
  def fromVertices(positions: js.Array[Cartesian3], center: Cartesian3, stride: Unit, result: BoundingSphere): BoundingSphere = (^.asInstanceOf[js.Dynamic].applyDynamic("fromVertices")(positions.asInstanceOf[js.Any], center.asInstanceOf[js.Any], stride.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[BoundingSphere]
  
  /* static member */
  @scala.inline
  def intersect(sphere: BoundingSphere, plane: Cartesian4): Intersect = (^.asInstanceOf[js.Dynamic].applyDynamic("intersect")(sphere.asInstanceOf[js.Any], plane.asInstanceOf[js.Any])).asInstanceOf[Intersect]
  
  /* static member */
  @scala.inline
  def pack(value: BoundingSphere, array: js.Array[Double]): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("pack")(value.asInstanceOf[js.Any], array.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
  @scala.inline
  def pack(value: BoundingSphere, array: js.Array[Double], startingIndex: Double): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("pack")(value.asInstanceOf[js.Any], array.asInstanceOf[js.Any], startingIndex.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
  
  /* static member */
  @scala.inline
  def projectTo2D(sphere: BoundingSphere): BoundingSphere = ^.asInstanceOf[js.Dynamic].applyDynamic("projectTo2D")(sphere.asInstanceOf[js.Any]).asInstanceOf[BoundingSphere]
  @scala.inline
  def projectTo2D(sphere: BoundingSphere, projection: js.Any): BoundingSphere = (^.asInstanceOf[js.Dynamic].applyDynamic("projectTo2D")(sphere.asInstanceOf[js.Any], projection.asInstanceOf[js.Any])).asInstanceOf[BoundingSphere]
  @scala.inline
  def projectTo2D(sphere: BoundingSphere, projection: js.Any, result: BoundingSphere): BoundingSphere = (^.asInstanceOf[js.Dynamic].applyDynamic("projectTo2D")(sphere.asInstanceOf[js.Any], projection.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[BoundingSphere]
  @scala.inline
  def projectTo2D(sphere: BoundingSphere, projection: Unit, result: BoundingSphere): BoundingSphere = (^.asInstanceOf[js.Dynamic].applyDynamic("projectTo2D")(sphere.asInstanceOf[js.Any], projection.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[BoundingSphere]
  
  /* static member */
  @scala.inline
  def transform(sphere: BoundingSphere, transform: Matrix4): BoundingSphere = (^.asInstanceOf[js.Dynamic].applyDynamic("transform")(sphere.asInstanceOf[js.Any], transform.asInstanceOf[js.Any])).asInstanceOf[BoundingSphere]
  @scala.inline
  def transform(sphere: BoundingSphere, transform: Matrix4, result: BoundingSphere): BoundingSphere = (^.asInstanceOf[js.Dynamic].applyDynamic("transform")(sphere.asInstanceOf[js.Any], transform.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[BoundingSphere]
  
  /* static member */
  @scala.inline
  def transformWithoutScale(sphere: BoundingSphere, transform: Matrix4): BoundingSphere = (^.asInstanceOf[js.Dynamic].applyDynamic("transformWithoutScale")(sphere.asInstanceOf[js.Any], transform.asInstanceOf[js.Any])).asInstanceOf[BoundingSphere]
  @scala.inline
  def transformWithoutScale(sphere: BoundingSphere, transform: Matrix4, result: BoundingSphere): BoundingSphere = (^.asInstanceOf[js.Dynamic].applyDynamic("transformWithoutScale")(sphere.asInstanceOf[js.Any], transform.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[BoundingSphere]
  
  /* static member */
  @scala.inline
  def union(left: BoundingSphere, right: BoundingSphere): BoundingSphere = (^.asInstanceOf[js.Dynamic].applyDynamic("union")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any])).asInstanceOf[BoundingSphere]
  @scala.inline
  def union(left: BoundingSphere, right: BoundingSphere, result: BoundingSphere): BoundingSphere = (^.asInstanceOf[js.Dynamic].applyDynamic("union")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[BoundingSphere]
  
  /* static member */
  @scala.inline
  def unpack(array: js.Array[Double]): BoundingSphere = ^.asInstanceOf[js.Dynamic].applyDynamic("unpack")(array.asInstanceOf[js.Any]).asInstanceOf[BoundingSphere]
  @scala.inline
  def unpack(array: js.Array[Double], startingIndex: Double): BoundingSphere = (^.asInstanceOf[js.Dynamic].applyDynamic("unpack")(array.asInstanceOf[js.Any], startingIndex.asInstanceOf[js.Any])).asInstanceOf[BoundingSphere]
  @scala.inline
  def unpack(array: js.Array[Double], startingIndex: Double, result: BoundingSphere): BoundingSphere = (^.asInstanceOf[js.Dynamic].applyDynamic("unpack")(array.asInstanceOf[js.Any], startingIndex.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[BoundingSphere]
  @scala.inline
  def unpack(array: js.Array[Double], startingIndex: Unit, result: BoundingSphere): BoundingSphere = (^.asInstanceOf[js.Dynamic].applyDynamic("unpack")(array.asInstanceOf[js.Any], startingIndex.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[BoundingSphere]
}
