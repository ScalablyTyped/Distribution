package typings.cesium.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cesium", "BoundingSphere")
@js.native
class BoundingSphere () extends Packable {
  def this(center: Cartesian3) = this()
  def this(center: js.UndefOr[scala.Nothing], radius: Double) = this()
  def this(center: Cartesian3, radius: Double) = this()
  var center: Cartesian3 = js.native
  var radius: Double = js.native
  def clone(result: BoundingSphere): BoundingSphere = js.native
  def equals(): Boolean = js.native
  def equals(right: BoundingSphere): Boolean = js.native
  def intersect(plane: Cartesian4): Intersect = js.native
}

/* static members */
@JSImport("cesium", "BoundingSphere")
@js.native
object BoundingSphere extends js.Object {
  def clone(sphere: BoundingSphere): BoundingSphere = js.native
  def clone(sphere: BoundingSphere, result: BoundingSphere): BoundingSphere = js.native
  def computePlaneDistances(sphere: BoundingSphere, position: Cartesian3, direction: Cartesian3): Interval = js.native
  def computePlaneDistances(sphere: BoundingSphere, position: Cartesian3, direction: Cartesian3, result: Cartesian2): Interval = js.native
  def distanceSquaredTo(sphere: BoundingSphere, cartesian: Cartesian3): Double = js.native
  def equals(): Boolean = js.native
  def equals(left: js.UndefOr[scala.Nothing], right: BoundingSphere): Boolean = js.native
  def equals(left: BoundingSphere): Boolean = js.native
  def equals(left: BoundingSphere, right: BoundingSphere): Boolean = js.native
  def expand(sphere: BoundingSphere, point: Cartesian3): BoundingSphere = js.native
  def expand(sphere: BoundingSphere, point: Cartesian3, result: BoundingSphere): BoundingSphere = js.native
  def fromBoundingSpheres(boundingSpheres: js.Array[BoundingSphere]): BoundingSphere = js.native
  def fromBoundingSpheres(boundingSpheres: js.Array[BoundingSphere], result: BoundingSphere): BoundingSphere = js.native
  def fromCornerPoints(): BoundingSphere = js.native
  def fromCornerPoints(
    corner: js.UndefOr[scala.Nothing],
    oppositeCorner: js.UndefOr[scala.Nothing],
    result: BoundingSphere
  ): BoundingSphere = js.native
  def fromCornerPoints(corner: js.UndefOr[scala.Nothing], oppositeCorner: Double): BoundingSphere = js.native
  def fromCornerPoints(corner: js.UndefOr[scala.Nothing], oppositeCorner: Double, result: BoundingSphere): BoundingSphere = js.native
  def fromCornerPoints(corner: Double): BoundingSphere = js.native
  def fromCornerPoints(corner: Double, oppositeCorner: js.UndefOr[scala.Nothing], result: BoundingSphere): BoundingSphere = js.native
  def fromCornerPoints(corner: Double, oppositeCorner: Double): BoundingSphere = js.native
  def fromCornerPoints(corner: Double, oppositeCorner: Double, result: BoundingSphere): BoundingSphere = js.native
  def fromEllipsoid(ellipsoid: Ellipsoid): BoundingSphere = js.native
  def fromEllipsoid(ellipsoid: Ellipsoid, result: BoundingSphere): BoundingSphere = js.native
  def fromPoints(positions: js.Array[Cartesian3]): BoundingSphere = js.native
  def fromPoints(positions: js.Array[Cartesian3], result: BoundingSphere): BoundingSphere = js.native
  def fromRectangle2D(rectangle: Rectangle): BoundingSphere = js.native
  def fromRectangle2D(rectangle: Rectangle, projection: js.UndefOr[scala.Nothing], result: BoundingSphere): BoundingSphere = js.native
  def fromRectangle2D(rectangle: Rectangle, projection: js.Any): BoundingSphere = js.native
  def fromRectangle2D(rectangle: Rectangle, projection: js.Any, result: BoundingSphere): BoundingSphere = js.native
  def fromRectangle3D(rectangle: Rectangle): BoundingSphere = js.native
  def fromRectangle3D(
    rectangle: Rectangle,
    ellipsoid: js.UndefOr[scala.Nothing],
    surfaceHeight: js.UndefOr[scala.Nothing],
    result: BoundingSphere
  ): BoundingSphere = js.native
  def fromRectangle3D(rectangle: Rectangle, ellipsoid: js.UndefOr[scala.Nothing], surfaceHeight: Double): BoundingSphere = js.native
  def fromRectangle3D(
    rectangle: Rectangle,
    ellipsoid: js.UndefOr[scala.Nothing],
    surfaceHeight: Double,
    result: BoundingSphere
  ): BoundingSphere = js.native
  def fromRectangle3D(rectangle: Rectangle, ellipsoid: Ellipsoid): BoundingSphere = js.native
  def fromRectangle3D(
    rectangle: Rectangle,
    ellipsoid: Ellipsoid,
    surfaceHeight: js.UndefOr[scala.Nothing],
    result: BoundingSphere
  ): BoundingSphere = js.native
  def fromRectangle3D(rectangle: Rectangle, ellipsoid: Ellipsoid, surfaceHeight: Double): BoundingSphere = js.native
  def fromRectangle3D(rectangle: Rectangle, ellipsoid: Ellipsoid, surfaceHeight: Double, result: BoundingSphere): BoundingSphere = js.native
  def fromRectangleWithHeights2D(rectangle: Rectangle): BoundingSphere = js.native
  def fromRectangleWithHeights2D(
    rectangle: Rectangle,
    projection: js.UndefOr[scala.Nothing],
    minimumHeight: js.UndefOr[scala.Nothing],
    maximumHeight: js.UndefOr[scala.Nothing],
    result: BoundingSphere
  ): BoundingSphere = js.native
  def fromRectangleWithHeights2D(
    rectangle: Rectangle,
    projection: js.UndefOr[scala.Nothing],
    minimumHeight: js.UndefOr[scala.Nothing],
    maximumHeight: Double
  ): BoundingSphere = js.native
  def fromRectangleWithHeights2D(
    rectangle: Rectangle,
    projection: js.UndefOr[scala.Nothing],
    minimumHeight: js.UndefOr[scala.Nothing],
    maximumHeight: Double,
    result: BoundingSphere
  ): BoundingSphere = js.native
  def fromRectangleWithHeights2D(rectangle: Rectangle, projection: js.UndefOr[scala.Nothing], minimumHeight: Double): BoundingSphere = js.native
  def fromRectangleWithHeights2D(
    rectangle: Rectangle,
    projection: js.UndefOr[scala.Nothing],
    minimumHeight: Double,
    maximumHeight: js.UndefOr[scala.Nothing],
    result: BoundingSphere
  ): BoundingSphere = js.native
  def fromRectangleWithHeights2D(
    rectangle: Rectangle,
    projection: js.UndefOr[scala.Nothing],
    minimumHeight: Double,
    maximumHeight: Double
  ): BoundingSphere = js.native
  def fromRectangleWithHeights2D(
    rectangle: Rectangle,
    projection: js.UndefOr[scala.Nothing],
    minimumHeight: Double,
    maximumHeight: Double,
    result: BoundingSphere
  ): BoundingSphere = js.native
  def fromRectangleWithHeights2D(rectangle: Rectangle, projection: js.Any): BoundingSphere = js.native
  def fromRectangleWithHeights2D(
    rectangle: Rectangle,
    projection: js.Any,
    minimumHeight: js.UndefOr[scala.Nothing],
    maximumHeight: js.UndefOr[scala.Nothing],
    result: BoundingSphere
  ): BoundingSphere = js.native
  def fromRectangleWithHeights2D(
    rectangle: Rectangle,
    projection: js.Any,
    minimumHeight: js.UndefOr[scala.Nothing],
    maximumHeight: Double
  ): BoundingSphere = js.native
  def fromRectangleWithHeights2D(
    rectangle: Rectangle,
    projection: js.Any,
    minimumHeight: js.UndefOr[scala.Nothing],
    maximumHeight: Double,
    result: BoundingSphere
  ): BoundingSphere = js.native
  def fromRectangleWithHeights2D(rectangle: Rectangle, projection: js.Any, minimumHeight: Double): BoundingSphere = js.native
  def fromRectangleWithHeights2D(
    rectangle: Rectangle,
    projection: js.Any,
    minimumHeight: Double,
    maximumHeight: js.UndefOr[scala.Nothing],
    result: BoundingSphere
  ): BoundingSphere = js.native
  def fromRectangleWithHeights2D(rectangle: Rectangle, projection: js.Any, minimumHeight: Double, maximumHeight: Double): BoundingSphere = js.native
  def fromRectangleWithHeights2D(
    rectangle: Rectangle,
    projection: js.Any,
    minimumHeight: Double,
    maximumHeight: Double,
    result: BoundingSphere
  ): BoundingSphere = js.native
  def fromVertices(positions: js.Array[Cartesian3]): BoundingSphere = js.native
  def fromVertices(
    positions: js.Array[Cartesian3],
    center: js.UndefOr[scala.Nothing],
    stride: js.UndefOr[scala.Nothing],
    result: BoundingSphere
  ): BoundingSphere = js.native
  def fromVertices(positions: js.Array[Cartesian3], center: js.UndefOr[scala.Nothing], stride: Double): BoundingSphere = js.native
  def fromVertices(
    positions: js.Array[Cartesian3],
    center: js.UndefOr[scala.Nothing],
    stride: Double,
    result: BoundingSphere
  ): BoundingSphere = js.native
  def fromVertices(positions: js.Array[Cartesian3], center: Cartesian3): BoundingSphere = js.native
  def fromVertices(
    positions: js.Array[Cartesian3],
    center: Cartesian3,
    stride: js.UndefOr[scala.Nothing],
    result: BoundingSphere
  ): BoundingSphere = js.native
  def fromVertices(positions: js.Array[Cartesian3], center: Cartesian3, stride: Double): BoundingSphere = js.native
  def fromVertices(positions: js.Array[Cartesian3], center: Cartesian3, stride: Double, result: BoundingSphere): BoundingSphere = js.native
  def intersect(sphere: BoundingSphere, plane: Cartesian4): Intersect = js.native
  def pack(value: BoundingSphere, array: js.Array[Double]): js.Array[Double] = js.native
  def pack(value: BoundingSphere, array: js.Array[Double], startingIndex: Double): js.Array[Double] = js.native
  def projectTo2D(sphere: BoundingSphere): BoundingSphere = js.native
  def projectTo2D(sphere: BoundingSphere, projection: js.UndefOr[scala.Nothing], result: BoundingSphere): BoundingSphere = js.native
  def projectTo2D(sphere: BoundingSphere, projection: js.Any): BoundingSphere = js.native
  def projectTo2D(sphere: BoundingSphere, projection: js.Any, result: BoundingSphere): BoundingSphere = js.native
  def transform(sphere: BoundingSphere, transform: Matrix4): BoundingSphere = js.native
  def transform(sphere: BoundingSphere, transform: Matrix4, result: BoundingSphere): BoundingSphere = js.native
  def transformWithoutScale(sphere: BoundingSphere, transform: Matrix4): BoundingSphere = js.native
  def transformWithoutScale(sphere: BoundingSphere, transform: Matrix4, result: BoundingSphere): BoundingSphere = js.native
  def union(left: BoundingSphere, right: BoundingSphere): BoundingSphere = js.native
  def union(left: BoundingSphere, right: BoundingSphere, result: BoundingSphere): BoundingSphere = js.native
  def unpack(array: js.Array[Double]): BoundingSphere = js.native
  def unpack(array: js.Array[Double], startingIndex: js.UndefOr[scala.Nothing], result: BoundingSphere): BoundingSphere = js.native
  def unpack(array: js.Array[Double], startingIndex: Double): BoundingSphere = js.native
  def unpack(array: js.Array[Double], startingIndex: Double, result: BoundingSphere): BoundingSphere = js.native
}

