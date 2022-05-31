package typings.cesium.global.Cesium

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Cesium.BoundingSphere")
@js.native
class BoundingSphere ()
  extends typings.cesium.mod.BoundingSphere {
  def this(center: typings.cesium.mod.Cartesian3) = this()
  def this(center: Unit, radius: Double) = this()
  def this(center: typings.cesium.mod.Cartesian3, radius: Double) = this()
}
object BoundingSphere {
  
  @JSGlobal("Cesium.BoundingSphere")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  inline def clone_(sphere: typings.cesium.mod.BoundingSphere): typings.cesium.mod.BoundingSphere = ^.asInstanceOf[js.Dynamic].applyDynamic("clone")(sphere.asInstanceOf[js.Any]).asInstanceOf[typings.cesium.mod.BoundingSphere]
  inline def clone_(sphere: typings.cesium.mod.BoundingSphere, result: typings.cesium.mod.BoundingSphere): typings.cesium.mod.BoundingSphere = (^.asInstanceOf[js.Dynamic].applyDynamic("clone")(sphere.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[typings.cesium.mod.BoundingSphere]
  
  /* static member */
  inline def computePlaneDistances(
    sphere: typings.cesium.mod.BoundingSphere,
    position: typings.cesium.mod.Cartesian3,
    direction: typings.cesium.mod.Cartesian3
  ): typings.cesium.mod.Interval = (^.asInstanceOf[js.Dynamic].applyDynamic("computePlaneDistances")(sphere.asInstanceOf[js.Any], position.asInstanceOf[js.Any], direction.asInstanceOf[js.Any])).asInstanceOf[typings.cesium.mod.Interval]
  inline def computePlaneDistances(
    sphere: typings.cesium.mod.BoundingSphere,
    position: typings.cesium.mod.Cartesian3,
    direction: typings.cesium.mod.Cartesian3,
    result: typings.cesium.mod.Cartesian2
  ): typings.cesium.mod.Interval = (^.asInstanceOf[js.Dynamic].applyDynamic("computePlaneDistances")(sphere.asInstanceOf[js.Any], position.asInstanceOf[js.Any], direction.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[typings.cesium.mod.Interval]
  
  /* static member */
  inline def distanceSquaredTo(sphere: typings.cesium.mod.BoundingSphere, cartesian: typings.cesium.mod.Cartesian3): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("distanceSquaredTo")(sphere.asInstanceOf[js.Any], cartesian.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  /* static member */
  inline def equals_(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("equals")().asInstanceOf[Boolean]
  inline def equals_(left: Unit, right: typings.cesium.mod.BoundingSphere): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equals")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def equals_(left: typings.cesium.mod.BoundingSphere): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("equals")(left.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def equals_(left: typings.cesium.mod.BoundingSphere, right: typings.cesium.mod.BoundingSphere): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equals")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  /* static member */
  inline def expand(sphere: typings.cesium.mod.BoundingSphere, point: typings.cesium.mod.Cartesian3): typings.cesium.mod.BoundingSphere = (^.asInstanceOf[js.Dynamic].applyDynamic("expand")(sphere.asInstanceOf[js.Any], point.asInstanceOf[js.Any])).asInstanceOf[typings.cesium.mod.BoundingSphere]
  inline def expand(
    sphere: typings.cesium.mod.BoundingSphere,
    point: typings.cesium.mod.Cartesian3,
    result: typings.cesium.mod.BoundingSphere
  ): typings.cesium.mod.BoundingSphere = (^.asInstanceOf[js.Dynamic].applyDynamic("expand")(sphere.asInstanceOf[js.Any], point.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[typings.cesium.mod.BoundingSphere]
  
  /* static member */
  inline def fromBoundingSpheres(boundingSpheres: js.Array[typings.cesium.mod.BoundingSphere]): typings.cesium.mod.BoundingSphere = ^.asInstanceOf[js.Dynamic].applyDynamic("fromBoundingSpheres")(boundingSpheres.asInstanceOf[js.Any]).asInstanceOf[typings.cesium.mod.BoundingSphere]
  inline def fromBoundingSpheres(
    boundingSpheres: js.Array[typings.cesium.mod.BoundingSphere],
    result: typings.cesium.mod.BoundingSphere
  ): typings.cesium.mod.BoundingSphere = (^.asInstanceOf[js.Dynamic].applyDynamic("fromBoundingSpheres")(boundingSpheres.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[typings.cesium.mod.BoundingSphere]
  
  /* static member */
  inline def fromCornerPoints(): typings.cesium.mod.BoundingSphere = ^.asInstanceOf[js.Dynamic].applyDynamic("fromCornerPoints")().asInstanceOf[typings.cesium.mod.BoundingSphere]
  inline def fromCornerPoints(corner: Double): typings.cesium.mod.BoundingSphere = ^.asInstanceOf[js.Dynamic].applyDynamic("fromCornerPoints")(corner.asInstanceOf[js.Any]).asInstanceOf[typings.cesium.mod.BoundingSphere]
  inline def fromCornerPoints(corner: Double, oppositeCorner: Double): typings.cesium.mod.BoundingSphere = (^.asInstanceOf[js.Dynamic].applyDynamic("fromCornerPoints")(corner.asInstanceOf[js.Any], oppositeCorner.asInstanceOf[js.Any])).asInstanceOf[typings.cesium.mod.BoundingSphere]
  inline def fromCornerPoints(corner: Double, oppositeCorner: Double, result: typings.cesium.mod.BoundingSphere): typings.cesium.mod.BoundingSphere = (^.asInstanceOf[js.Dynamic].applyDynamic("fromCornerPoints")(corner.asInstanceOf[js.Any], oppositeCorner.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[typings.cesium.mod.BoundingSphere]
  inline def fromCornerPoints(corner: Double, oppositeCorner: Unit, result: typings.cesium.mod.BoundingSphere): typings.cesium.mod.BoundingSphere = (^.asInstanceOf[js.Dynamic].applyDynamic("fromCornerPoints")(corner.asInstanceOf[js.Any], oppositeCorner.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[typings.cesium.mod.BoundingSphere]
  inline def fromCornerPoints(corner: Unit, oppositeCorner: Double): typings.cesium.mod.BoundingSphere = (^.asInstanceOf[js.Dynamic].applyDynamic("fromCornerPoints")(corner.asInstanceOf[js.Any], oppositeCorner.asInstanceOf[js.Any])).asInstanceOf[typings.cesium.mod.BoundingSphere]
  inline def fromCornerPoints(corner: Unit, oppositeCorner: Double, result: typings.cesium.mod.BoundingSphere): typings.cesium.mod.BoundingSphere = (^.asInstanceOf[js.Dynamic].applyDynamic("fromCornerPoints")(corner.asInstanceOf[js.Any], oppositeCorner.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[typings.cesium.mod.BoundingSphere]
  inline def fromCornerPoints(corner: Unit, oppositeCorner: Unit, result: typings.cesium.mod.BoundingSphere): typings.cesium.mod.BoundingSphere = (^.asInstanceOf[js.Dynamic].applyDynamic("fromCornerPoints")(corner.asInstanceOf[js.Any], oppositeCorner.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[typings.cesium.mod.BoundingSphere]
  
  /* static member */
  inline def fromEllipsoid(ellipsoid: typings.cesium.mod.Ellipsoid): typings.cesium.mod.BoundingSphere = ^.asInstanceOf[js.Dynamic].applyDynamic("fromEllipsoid")(ellipsoid.asInstanceOf[js.Any]).asInstanceOf[typings.cesium.mod.BoundingSphere]
  inline def fromEllipsoid(ellipsoid: typings.cesium.mod.Ellipsoid, result: typings.cesium.mod.BoundingSphere): typings.cesium.mod.BoundingSphere = (^.asInstanceOf[js.Dynamic].applyDynamic("fromEllipsoid")(ellipsoid.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[typings.cesium.mod.BoundingSphere]
  
  /* static member */
  inline def fromPoints(positions: js.Array[typings.cesium.mod.Cartesian3]): typings.cesium.mod.BoundingSphere = ^.asInstanceOf[js.Dynamic].applyDynamic("fromPoints")(positions.asInstanceOf[js.Any]).asInstanceOf[typings.cesium.mod.BoundingSphere]
  inline def fromPoints(positions: js.Array[typings.cesium.mod.Cartesian3], result: typings.cesium.mod.BoundingSphere): typings.cesium.mod.BoundingSphere = (^.asInstanceOf[js.Dynamic].applyDynamic("fromPoints")(positions.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[typings.cesium.mod.BoundingSphere]
  
  /* static member */
  inline def fromRectangle2D(rectangle: typings.cesium.mod.Rectangle): typings.cesium.mod.BoundingSphere = ^.asInstanceOf[js.Dynamic].applyDynamic("fromRectangle2D")(rectangle.asInstanceOf[js.Any]).asInstanceOf[typings.cesium.mod.BoundingSphere]
  inline def fromRectangle2D(rectangle: typings.cesium.mod.Rectangle, projection: js.Any): typings.cesium.mod.BoundingSphere = (^.asInstanceOf[js.Dynamic].applyDynamic("fromRectangle2D")(rectangle.asInstanceOf[js.Any], projection.asInstanceOf[js.Any])).asInstanceOf[typings.cesium.mod.BoundingSphere]
  inline def fromRectangle2D(
    rectangle: typings.cesium.mod.Rectangle,
    projection: js.Any,
    result: typings.cesium.mod.BoundingSphere
  ): typings.cesium.mod.BoundingSphere = (^.asInstanceOf[js.Dynamic].applyDynamic("fromRectangle2D")(rectangle.asInstanceOf[js.Any], projection.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[typings.cesium.mod.BoundingSphere]
  inline def fromRectangle2D(
    rectangle: typings.cesium.mod.Rectangle,
    projection: Unit,
    result: typings.cesium.mod.BoundingSphere
  ): typings.cesium.mod.BoundingSphere = (^.asInstanceOf[js.Dynamic].applyDynamic("fromRectangle2D")(rectangle.asInstanceOf[js.Any], projection.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[typings.cesium.mod.BoundingSphere]
  
  /* static member */
  inline def fromRectangle3D(rectangle: typings.cesium.mod.Rectangle): typings.cesium.mod.BoundingSphere = ^.asInstanceOf[js.Dynamic].applyDynamic("fromRectangle3D")(rectangle.asInstanceOf[js.Any]).asInstanceOf[typings.cesium.mod.BoundingSphere]
  inline def fromRectangle3D(rectangle: typings.cesium.mod.Rectangle, ellipsoid: Unit, surfaceHeight: Double): typings.cesium.mod.BoundingSphere = (^.asInstanceOf[js.Dynamic].applyDynamic("fromRectangle3D")(rectangle.asInstanceOf[js.Any], ellipsoid.asInstanceOf[js.Any], surfaceHeight.asInstanceOf[js.Any])).asInstanceOf[typings.cesium.mod.BoundingSphere]
  inline def fromRectangle3D(
    rectangle: typings.cesium.mod.Rectangle,
    ellipsoid: Unit,
    surfaceHeight: Double,
    result: typings.cesium.mod.BoundingSphere
  ): typings.cesium.mod.BoundingSphere = (^.asInstanceOf[js.Dynamic].applyDynamic("fromRectangle3D")(rectangle.asInstanceOf[js.Any], ellipsoid.asInstanceOf[js.Any], surfaceHeight.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[typings.cesium.mod.BoundingSphere]
  inline def fromRectangle3D(
    rectangle: typings.cesium.mod.Rectangle,
    ellipsoid: Unit,
    surfaceHeight: Unit,
    result: typings.cesium.mod.BoundingSphere
  ): typings.cesium.mod.BoundingSphere = (^.asInstanceOf[js.Dynamic].applyDynamic("fromRectangle3D")(rectangle.asInstanceOf[js.Any], ellipsoid.asInstanceOf[js.Any], surfaceHeight.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[typings.cesium.mod.BoundingSphere]
  inline def fromRectangle3D(rectangle: typings.cesium.mod.Rectangle, ellipsoid: typings.cesium.mod.Ellipsoid): typings.cesium.mod.BoundingSphere = (^.asInstanceOf[js.Dynamic].applyDynamic("fromRectangle3D")(rectangle.asInstanceOf[js.Any], ellipsoid.asInstanceOf[js.Any])).asInstanceOf[typings.cesium.mod.BoundingSphere]
  inline def fromRectangle3D(
    rectangle: typings.cesium.mod.Rectangle,
    ellipsoid: typings.cesium.mod.Ellipsoid,
    surfaceHeight: Double
  ): typings.cesium.mod.BoundingSphere = (^.asInstanceOf[js.Dynamic].applyDynamic("fromRectangle3D")(rectangle.asInstanceOf[js.Any], ellipsoid.asInstanceOf[js.Any], surfaceHeight.asInstanceOf[js.Any])).asInstanceOf[typings.cesium.mod.BoundingSphere]
  inline def fromRectangle3D(
    rectangle: typings.cesium.mod.Rectangle,
    ellipsoid: typings.cesium.mod.Ellipsoid,
    surfaceHeight: Double,
    result: typings.cesium.mod.BoundingSphere
  ): typings.cesium.mod.BoundingSphere = (^.asInstanceOf[js.Dynamic].applyDynamic("fromRectangle3D")(rectangle.asInstanceOf[js.Any], ellipsoid.asInstanceOf[js.Any], surfaceHeight.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[typings.cesium.mod.BoundingSphere]
  inline def fromRectangle3D(
    rectangle: typings.cesium.mod.Rectangle,
    ellipsoid: typings.cesium.mod.Ellipsoid,
    surfaceHeight: Unit,
    result: typings.cesium.mod.BoundingSphere
  ): typings.cesium.mod.BoundingSphere = (^.asInstanceOf[js.Dynamic].applyDynamic("fromRectangle3D")(rectangle.asInstanceOf[js.Any], ellipsoid.asInstanceOf[js.Any], surfaceHeight.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[typings.cesium.mod.BoundingSphere]
  
  /* static member */
  inline def fromRectangleWithHeights2D(rectangle: typings.cesium.mod.Rectangle): typings.cesium.mod.BoundingSphere = ^.asInstanceOf[js.Dynamic].applyDynamic("fromRectangleWithHeights2D")(rectangle.asInstanceOf[js.Any]).asInstanceOf[typings.cesium.mod.BoundingSphere]
  inline def fromRectangleWithHeights2D(rectangle: typings.cesium.mod.Rectangle, projection: js.Any): typings.cesium.mod.BoundingSphere = (^.asInstanceOf[js.Dynamic].applyDynamic("fromRectangleWithHeights2D")(rectangle.asInstanceOf[js.Any], projection.asInstanceOf[js.Any])).asInstanceOf[typings.cesium.mod.BoundingSphere]
  inline def fromRectangleWithHeights2D(rectangle: typings.cesium.mod.Rectangle, projection: js.Any, minimumHeight: Double): typings.cesium.mod.BoundingSphere = (^.asInstanceOf[js.Dynamic].applyDynamic("fromRectangleWithHeights2D")(rectangle.asInstanceOf[js.Any], projection.asInstanceOf[js.Any], minimumHeight.asInstanceOf[js.Any])).asInstanceOf[typings.cesium.mod.BoundingSphere]
  inline def fromRectangleWithHeights2D(
    rectangle: typings.cesium.mod.Rectangle,
    projection: js.Any,
    minimumHeight: Double,
    maximumHeight: Double
  ): typings.cesium.mod.BoundingSphere = (^.asInstanceOf[js.Dynamic].applyDynamic("fromRectangleWithHeights2D")(rectangle.asInstanceOf[js.Any], projection.asInstanceOf[js.Any], minimumHeight.asInstanceOf[js.Any], maximumHeight.asInstanceOf[js.Any])).asInstanceOf[typings.cesium.mod.BoundingSphere]
  inline def fromRectangleWithHeights2D(
    rectangle: typings.cesium.mod.Rectangle,
    projection: js.Any,
    minimumHeight: Double,
    maximumHeight: Double,
    result: typings.cesium.mod.BoundingSphere
  ): typings.cesium.mod.BoundingSphere = (^.asInstanceOf[js.Dynamic].applyDynamic("fromRectangleWithHeights2D")(rectangle.asInstanceOf[js.Any], projection.asInstanceOf[js.Any], minimumHeight.asInstanceOf[js.Any], maximumHeight.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[typings.cesium.mod.BoundingSphere]
  inline def fromRectangleWithHeights2D(
    rectangle: typings.cesium.mod.Rectangle,
    projection: js.Any,
    minimumHeight: Double,
    maximumHeight: Unit,
    result: typings.cesium.mod.BoundingSphere
  ): typings.cesium.mod.BoundingSphere = (^.asInstanceOf[js.Dynamic].applyDynamic("fromRectangleWithHeights2D")(rectangle.asInstanceOf[js.Any], projection.asInstanceOf[js.Any], minimumHeight.asInstanceOf[js.Any], maximumHeight.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[typings.cesium.mod.BoundingSphere]
  inline def fromRectangleWithHeights2D(
    rectangle: typings.cesium.mod.Rectangle,
    projection: js.Any,
    minimumHeight: Unit,
    maximumHeight: Double
  ): typings.cesium.mod.BoundingSphere = (^.asInstanceOf[js.Dynamic].applyDynamic("fromRectangleWithHeights2D")(rectangle.asInstanceOf[js.Any], projection.asInstanceOf[js.Any], minimumHeight.asInstanceOf[js.Any], maximumHeight.asInstanceOf[js.Any])).asInstanceOf[typings.cesium.mod.BoundingSphere]
  inline def fromRectangleWithHeights2D(
    rectangle: typings.cesium.mod.Rectangle,
    projection: js.Any,
    minimumHeight: Unit,
    maximumHeight: Double,
    result: typings.cesium.mod.BoundingSphere
  ): typings.cesium.mod.BoundingSphere = (^.asInstanceOf[js.Dynamic].applyDynamic("fromRectangleWithHeights2D")(rectangle.asInstanceOf[js.Any], projection.asInstanceOf[js.Any], minimumHeight.asInstanceOf[js.Any], maximumHeight.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[typings.cesium.mod.BoundingSphere]
  inline def fromRectangleWithHeights2D(
    rectangle: typings.cesium.mod.Rectangle,
    projection: js.Any,
    minimumHeight: Unit,
    maximumHeight: Unit,
    result: typings.cesium.mod.BoundingSphere
  ): typings.cesium.mod.BoundingSphere = (^.asInstanceOf[js.Dynamic].applyDynamic("fromRectangleWithHeights2D")(rectangle.asInstanceOf[js.Any], projection.asInstanceOf[js.Any], minimumHeight.asInstanceOf[js.Any], maximumHeight.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[typings.cesium.mod.BoundingSphere]
  inline def fromRectangleWithHeights2D(rectangle: typings.cesium.mod.Rectangle, projection: Unit, minimumHeight: Double): typings.cesium.mod.BoundingSphere = (^.asInstanceOf[js.Dynamic].applyDynamic("fromRectangleWithHeights2D")(rectangle.asInstanceOf[js.Any], projection.asInstanceOf[js.Any], minimumHeight.asInstanceOf[js.Any])).asInstanceOf[typings.cesium.mod.BoundingSphere]
  inline def fromRectangleWithHeights2D(
    rectangle: typings.cesium.mod.Rectangle,
    projection: Unit,
    minimumHeight: Double,
    maximumHeight: Double
  ): typings.cesium.mod.BoundingSphere = (^.asInstanceOf[js.Dynamic].applyDynamic("fromRectangleWithHeights2D")(rectangle.asInstanceOf[js.Any], projection.asInstanceOf[js.Any], minimumHeight.asInstanceOf[js.Any], maximumHeight.asInstanceOf[js.Any])).asInstanceOf[typings.cesium.mod.BoundingSphere]
  inline def fromRectangleWithHeights2D(
    rectangle: typings.cesium.mod.Rectangle,
    projection: Unit,
    minimumHeight: Double,
    maximumHeight: Double,
    result: typings.cesium.mod.BoundingSphere
  ): typings.cesium.mod.BoundingSphere = (^.asInstanceOf[js.Dynamic].applyDynamic("fromRectangleWithHeights2D")(rectangle.asInstanceOf[js.Any], projection.asInstanceOf[js.Any], minimumHeight.asInstanceOf[js.Any], maximumHeight.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[typings.cesium.mod.BoundingSphere]
  inline def fromRectangleWithHeights2D(
    rectangle: typings.cesium.mod.Rectangle,
    projection: Unit,
    minimumHeight: Double,
    maximumHeight: Unit,
    result: typings.cesium.mod.BoundingSphere
  ): typings.cesium.mod.BoundingSphere = (^.asInstanceOf[js.Dynamic].applyDynamic("fromRectangleWithHeights2D")(rectangle.asInstanceOf[js.Any], projection.asInstanceOf[js.Any], minimumHeight.asInstanceOf[js.Any], maximumHeight.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[typings.cesium.mod.BoundingSphere]
  inline def fromRectangleWithHeights2D(
    rectangle: typings.cesium.mod.Rectangle,
    projection: Unit,
    minimumHeight: Unit,
    maximumHeight: Double
  ): typings.cesium.mod.BoundingSphere = (^.asInstanceOf[js.Dynamic].applyDynamic("fromRectangleWithHeights2D")(rectangle.asInstanceOf[js.Any], projection.asInstanceOf[js.Any], minimumHeight.asInstanceOf[js.Any], maximumHeight.asInstanceOf[js.Any])).asInstanceOf[typings.cesium.mod.BoundingSphere]
  inline def fromRectangleWithHeights2D(
    rectangle: typings.cesium.mod.Rectangle,
    projection: Unit,
    minimumHeight: Unit,
    maximumHeight: Double,
    result: typings.cesium.mod.BoundingSphere
  ): typings.cesium.mod.BoundingSphere = (^.asInstanceOf[js.Dynamic].applyDynamic("fromRectangleWithHeights2D")(rectangle.asInstanceOf[js.Any], projection.asInstanceOf[js.Any], minimumHeight.asInstanceOf[js.Any], maximumHeight.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[typings.cesium.mod.BoundingSphere]
  inline def fromRectangleWithHeights2D(
    rectangle: typings.cesium.mod.Rectangle,
    projection: Unit,
    minimumHeight: Unit,
    maximumHeight: Unit,
    result: typings.cesium.mod.BoundingSphere
  ): typings.cesium.mod.BoundingSphere = (^.asInstanceOf[js.Dynamic].applyDynamic("fromRectangleWithHeights2D")(rectangle.asInstanceOf[js.Any], projection.asInstanceOf[js.Any], minimumHeight.asInstanceOf[js.Any], maximumHeight.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[typings.cesium.mod.BoundingSphere]
  
  /* static member */
  inline def fromVertices(positions: js.Array[typings.cesium.mod.Cartesian3]): typings.cesium.mod.BoundingSphere = ^.asInstanceOf[js.Dynamic].applyDynamic("fromVertices")(positions.asInstanceOf[js.Any]).asInstanceOf[typings.cesium.mod.BoundingSphere]
  inline def fromVertices(positions: js.Array[typings.cesium.mod.Cartesian3], center: Unit, stride: Double): typings.cesium.mod.BoundingSphere = (^.asInstanceOf[js.Dynamic].applyDynamic("fromVertices")(positions.asInstanceOf[js.Any], center.asInstanceOf[js.Any], stride.asInstanceOf[js.Any])).asInstanceOf[typings.cesium.mod.BoundingSphere]
  inline def fromVertices(
    positions: js.Array[typings.cesium.mod.Cartesian3],
    center: Unit,
    stride: Double,
    result: typings.cesium.mod.BoundingSphere
  ): typings.cesium.mod.BoundingSphere = (^.asInstanceOf[js.Dynamic].applyDynamic("fromVertices")(positions.asInstanceOf[js.Any], center.asInstanceOf[js.Any], stride.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[typings.cesium.mod.BoundingSphere]
  inline def fromVertices(
    positions: js.Array[typings.cesium.mod.Cartesian3],
    center: Unit,
    stride: Unit,
    result: typings.cesium.mod.BoundingSphere
  ): typings.cesium.mod.BoundingSphere = (^.asInstanceOf[js.Dynamic].applyDynamic("fromVertices")(positions.asInstanceOf[js.Any], center.asInstanceOf[js.Any], stride.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[typings.cesium.mod.BoundingSphere]
  inline def fromVertices(positions: js.Array[typings.cesium.mod.Cartesian3], center: typings.cesium.mod.Cartesian3): typings.cesium.mod.BoundingSphere = (^.asInstanceOf[js.Dynamic].applyDynamic("fromVertices")(positions.asInstanceOf[js.Any], center.asInstanceOf[js.Any])).asInstanceOf[typings.cesium.mod.BoundingSphere]
  inline def fromVertices(
    positions: js.Array[typings.cesium.mod.Cartesian3],
    center: typings.cesium.mod.Cartesian3,
    stride: Double
  ): typings.cesium.mod.BoundingSphere = (^.asInstanceOf[js.Dynamic].applyDynamic("fromVertices")(positions.asInstanceOf[js.Any], center.asInstanceOf[js.Any], stride.asInstanceOf[js.Any])).asInstanceOf[typings.cesium.mod.BoundingSphere]
  inline def fromVertices(
    positions: js.Array[typings.cesium.mod.Cartesian3],
    center: typings.cesium.mod.Cartesian3,
    stride: Double,
    result: typings.cesium.mod.BoundingSphere
  ): typings.cesium.mod.BoundingSphere = (^.asInstanceOf[js.Dynamic].applyDynamic("fromVertices")(positions.asInstanceOf[js.Any], center.asInstanceOf[js.Any], stride.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[typings.cesium.mod.BoundingSphere]
  inline def fromVertices(
    positions: js.Array[typings.cesium.mod.Cartesian3],
    center: typings.cesium.mod.Cartesian3,
    stride: Unit,
    result: typings.cesium.mod.BoundingSphere
  ): typings.cesium.mod.BoundingSphere = (^.asInstanceOf[js.Dynamic].applyDynamic("fromVertices")(positions.asInstanceOf[js.Any], center.asInstanceOf[js.Any], stride.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[typings.cesium.mod.BoundingSphere]
  
  /* static member */
  inline def intersect(sphere: typings.cesium.mod.BoundingSphere, plane: typings.cesium.mod.Cartesian4): typings.cesium.mod.Intersect = (^.asInstanceOf[js.Dynamic].applyDynamic("intersect")(sphere.asInstanceOf[js.Any], plane.asInstanceOf[js.Any])).asInstanceOf[typings.cesium.mod.Intersect]
  
  /* static member */
  inline def pack(value: typings.cesium.mod.BoundingSphere, array: js.Array[Double]): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("pack")(value.asInstanceOf[js.Any], array.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
  inline def pack(value: typings.cesium.mod.BoundingSphere, array: js.Array[Double], startingIndex: Double): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("pack")(value.asInstanceOf[js.Any], array.asInstanceOf[js.Any], startingIndex.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
  
  /* static member */
  inline def projectTo2D(sphere: typings.cesium.mod.BoundingSphere): typings.cesium.mod.BoundingSphere = ^.asInstanceOf[js.Dynamic].applyDynamic("projectTo2D")(sphere.asInstanceOf[js.Any]).asInstanceOf[typings.cesium.mod.BoundingSphere]
  inline def projectTo2D(sphere: typings.cesium.mod.BoundingSphere, projection: js.Any): typings.cesium.mod.BoundingSphere = (^.asInstanceOf[js.Dynamic].applyDynamic("projectTo2D")(sphere.asInstanceOf[js.Any], projection.asInstanceOf[js.Any])).asInstanceOf[typings.cesium.mod.BoundingSphere]
  inline def projectTo2D(
    sphere: typings.cesium.mod.BoundingSphere,
    projection: js.Any,
    result: typings.cesium.mod.BoundingSphere
  ): typings.cesium.mod.BoundingSphere = (^.asInstanceOf[js.Dynamic].applyDynamic("projectTo2D")(sphere.asInstanceOf[js.Any], projection.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[typings.cesium.mod.BoundingSphere]
  inline def projectTo2D(
    sphere: typings.cesium.mod.BoundingSphere,
    projection: Unit,
    result: typings.cesium.mod.BoundingSphere
  ): typings.cesium.mod.BoundingSphere = (^.asInstanceOf[js.Dynamic].applyDynamic("projectTo2D")(sphere.asInstanceOf[js.Any], projection.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[typings.cesium.mod.BoundingSphere]
  
  /* static member */
  inline def transform(sphere: typings.cesium.mod.BoundingSphere, transform: typings.cesium.mod.Matrix4): typings.cesium.mod.BoundingSphere = (^.asInstanceOf[js.Dynamic].applyDynamic("transform")(sphere.asInstanceOf[js.Any], transform.asInstanceOf[js.Any])).asInstanceOf[typings.cesium.mod.BoundingSphere]
  inline def transform(
    sphere: typings.cesium.mod.BoundingSphere,
    transform: typings.cesium.mod.Matrix4,
    result: typings.cesium.mod.BoundingSphere
  ): typings.cesium.mod.BoundingSphere = (^.asInstanceOf[js.Dynamic].applyDynamic("transform")(sphere.asInstanceOf[js.Any], transform.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[typings.cesium.mod.BoundingSphere]
  
  /* static member */
  inline def transformWithoutScale(sphere: typings.cesium.mod.BoundingSphere, transform: typings.cesium.mod.Matrix4): typings.cesium.mod.BoundingSphere = (^.asInstanceOf[js.Dynamic].applyDynamic("transformWithoutScale")(sphere.asInstanceOf[js.Any], transform.asInstanceOf[js.Any])).asInstanceOf[typings.cesium.mod.BoundingSphere]
  inline def transformWithoutScale(
    sphere: typings.cesium.mod.BoundingSphere,
    transform: typings.cesium.mod.Matrix4,
    result: typings.cesium.mod.BoundingSphere
  ): typings.cesium.mod.BoundingSphere = (^.asInstanceOf[js.Dynamic].applyDynamic("transformWithoutScale")(sphere.asInstanceOf[js.Any], transform.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[typings.cesium.mod.BoundingSphere]
  
  /* static member */
  inline def union(left: typings.cesium.mod.BoundingSphere, right: typings.cesium.mod.BoundingSphere): typings.cesium.mod.BoundingSphere = (^.asInstanceOf[js.Dynamic].applyDynamic("union")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any])).asInstanceOf[typings.cesium.mod.BoundingSphere]
  inline def union(
    left: typings.cesium.mod.BoundingSphere,
    right: typings.cesium.mod.BoundingSphere,
    result: typings.cesium.mod.BoundingSphere
  ): typings.cesium.mod.BoundingSphere = (^.asInstanceOf[js.Dynamic].applyDynamic("union")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[typings.cesium.mod.BoundingSphere]
  
  /* static member */
  inline def unpack(array: js.Array[Double]): typings.cesium.mod.BoundingSphere = ^.asInstanceOf[js.Dynamic].applyDynamic("unpack")(array.asInstanceOf[js.Any]).asInstanceOf[typings.cesium.mod.BoundingSphere]
  inline def unpack(array: js.Array[Double], startingIndex: Double): typings.cesium.mod.BoundingSphere = (^.asInstanceOf[js.Dynamic].applyDynamic("unpack")(array.asInstanceOf[js.Any], startingIndex.asInstanceOf[js.Any])).asInstanceOf[typings.cesium.mod.BoundingSphere]
  inline def unpack(array: js.Array[Double], startingIndex: Double, result: typings.cesium.mod.BoundingSphere): typings.cesium.mod.BoundingSphere = (^.asInstanceOf[js.Dynamic].applyDynamic("unpack")(array.asInstanceOf[js.Any], startingIndex.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[typings.cesium.mod.BoundingSphere]
  inline def unpack(array: js.Array[Double], startingIndex: Unit, result: typings.cesium.mod.BoundingSphere): typings.cesium.mod.BoundingSphere = (^.asInstanceOf[js.Dynamic].applyDynamic("unpack")(array.asInstanceOf[js.Any], startingIndex.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[typings.cesium.mod.BoundingSphere]
}
