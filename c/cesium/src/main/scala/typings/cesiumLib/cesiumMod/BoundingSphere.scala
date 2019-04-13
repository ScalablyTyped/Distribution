package typings
package cesiumLib.cesiumMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cesium", "BoundingSphere")
@js.native
class BoundingSphere () extends Packable {
  def this(center: Cartesian3) = this()
  def this(center: Cartesian3, radius: scala.Double) = this()
  var center: Cartesian3 = js.native
  var radius: scala.Double = js.native
  def clone(result: BoundingSphere): BoundingSphere = js.native
  def equals(): scala.Boolean = js.native
  def equals(right: BoundingSphere): scala.Boolean = js.native
  def intersect(plane: Cartesian4): Intersect = js.native
}

/* static members */
@JSImport("cesium", "BoundingSphere")
@js.native
object BoundingSphere extends js.Object {
  def clone(sphere: cesiumLib.cesiumMod.BoundingSphere): cesiumLib.cesiumMod.BoundingSphere = js.native
  def clone(sphere: cesiumLib.cesiumMod.BoundingSphere, result: cesiumLib.cesiumMod.BoundingSphere): cesiumLib.cesiumMod.BoundingSphere = js.native
  def computePlaneDistances(
    sphere: cesiumLib.cesiumMod.BoundingSphere,
    position: cesiumLib.cesiumMod.Cartesian3,
    direction: cesiumLib.cesiumMod.Cartesian3
  ): cesiumLib.cesiumMod.Interval = js.native
  def computePlaneDistances(
    sphere: cesiumLib.cesiumMod.BoundingSphere,
    position: cesiumLib.cesiumMod.Cartesian3,
    direction: cesiumLib.cesiumMod.Cartesian3,
    result: cesiumLib.cesiumMod.Cartesian2
  ): cesiumLib.cesiumMod.Interval = js.native
  def distanceSquaredTo(sphere: cesiumLib.cesiumMod.BoundingSphere, cartesian: cesiumLib.cesiumMod.Cartesian3): scala.Double = js.native
  def equals(): scala.Boolean = js.native
  def equals(left: cesiumLib.cesiumMod.BoundingSphere): scala.Boolean = js.native
  def equals(left: cesiumLib.cesiumMod.BoundingSphere, right: cesiumLib.cesiumMod.BoundingSphere): scala.Boolean = js.native
  def expand(sphere: cesiumLib.cesiumMod.BoundingSphere, point: cesiumLib.cesiumMod.Cartesian3): cesiumLib.cesiumMod.BoundingSphere = js.native
  def expand(
    sphere: cesiumLib.cesiumMod.BoundingSphere,
    point: cesiumLib.cesiumMod.Cartesian3,
    result: cesiumLib.cesiumMod.BoundingSphere
  ): cesiumLib.cesiumMod.BoundingSphere = js.native
  def fromBoundingSpheres(boundingSpheres: js.Array[cesiumLib.cesiumMod.BoundingSphere]): cesiumLib.cesiumMod.BoundingSphere = js.native
  def fromBoundingSpheres(
    boundingSpheres: js.Array[cesiumLib.cesiumMod.BoundingSphere],
    result: cesiumLib.cesiumMod.BoundingSphere
  ): cesiumLib.cesiumMod.BoundingSphere = js.native
  def fromCornerPoints(): cesiumLib.cesiumMod.BoundingSphere = js.native
  def fromCornerPoints(corner: scala.Double): cesiumLib.cesiumMod.BoundingSphere = js.native
  def fromCornerPoints(corner: scala.Double, oppositeCorner: scala.Double): cesiumLib.cesiumMod.BoundingSphere = js.native
  def fromCornerPoints(corner: scala.Double, oppositeCorner: scala.Double, result: cesiumLib.cesiumMod.BoundingSphere): cesiumLib.cesiumMod.BoundingSphere = js.native
  def fromEllipsoid(ellipsoid: cesiumLib.cesiumMod.Ellipsoid): cesiumLib.cesiumMod.BoundingSphere = js.native
  def fromEllipsoid(ellipsoid: cesiumLib.cesiumMod.Ellipsoid, result: cesiumLib.cesiumMod.BoundingSphere): cesiumLib.cesiumMod.BoundingSphere = js.native
  def fromPoints(positions: js.Array[cesiumLib.cesiumMod.Cartesian3]): cesiumLib.cesiumMod.BoundingSphere = js.native
  def fromPoints(positions: js.Array[cesiumLib.cesiumMod.Cartesian3], result: cesiumLib.cesiumMod.BoundingSphere): cesiumLib.cesiumMod.BoundingSphere = js.native
  def fromRectangle2D(rectangle: cesiumLib.cesiumMod.Rectangle): cesiumLib.cesiumMod.BoundingSphere = js.native
  def fromRectangle2D(rectangle: cesiumLib.cesiumMod.Rectangle, projection: js.Any): cesiumLib.cesiumMod.BoundingSphere = js.native
  def fromRectangle2D(
    rectangle: cesiumLib.cesiumMod.Rectangle,
    projection: js.Any,
    result: cesiumLib.cesiumMod.BoundingSphere
  ): cesiumLib.cesiumMod.BoundingSphere = js.native
  def fromRectangle3D(rectangle: cesiumLib.cesiumMod.Rectangle): cesiumLib.cesiumMod.BoundingSphere = js.native
  def fromRectangle3D(rectangle: cesiumLib.cesiumMod.Rectangle, ellipsoid: cesiumLib.cesiumMod.Ellipsoid): cesiumLib.cesiumMod.BoundingSphere = js.native
  def fromRectangle3D(
    rectangle: cesiumLib.cesiumMod.Rectangle,
    ellipsoid: cesiumLib.cesiumMod.Ellipsoid,
    surfaceHeight: scala.Double
  ): cesiumLib.cesiumMod.BoundingSphere = js.native
  def fromRectangle3D(
    rectangle: cesiumLib.cesiumMod.Rectangle,
    ellipsoid: cesiumLib.cesiumMod.Ellipsoid,
    surfaceHeight: scala.Double,
    result: cesiumLib.cesiumMod.BoundingSphere
  ): cesiumLib.cesiumMod.BoundingSphere = js.native
  def fromRectangleWithHeights2D(rectangle: cesiumLib.cesiumMod.Rectangle): cesiumLib.cesiumMod.BoundingSphere = js.native
  def fromRectangleWithHeights2D(rectangle: cesiumLib.cesiumMod.Rectangle, projection: js.Any): cesiumLib.cesiumMod.BoundingSphere = js.native
  def fromRectangleWithHeights2D(rectangle: cesiumLib.cesiumMod.Rectangle, projection: js.Any, minimumHeight: scala.Double): cesiumLib.cesiumMod.BoundingSphere = js.native
  def fromRectangleWithHeights2D(
    rectangle: cesiumLib.cesiumMod.Rectangle,
    projection: js.Any,
    minimumHeight: scala.Double,
    maximumHeight: scala.Double
  ): cesiumLib.cesiumMod.BoundingSphere = js.native
  def fromRectangleWithHeights2D(
    rectangle: cesiumLib.cesiumMod.Rectangle,
    projection: js.Any,
    minimumHeight: scala.Double,
    maximumHeight: scala.Double,
    result: cesiumLib.cesiumMod.BoundingSphere
  ): cesiumLib.cesiumMod.BoundingSphere = js.native
  def fromVertices(positions: js.Array[cesiumLib.cesiumMod.Cartesian3]): cesiumLib.cesiumMod.BoundingSphere = js.native
  def fromVertices(positions: js.Array[cesiumLib.cesiumMod.Cartesian3], center: cesiumLib.cesiumMod.Cartesian3): cesiumLib.cesiumMod.BoundingSphere = js.native
  def fromVertices(
    positions: js.Array[cesiumLib.cesiumMod.Cartesian3],
    center: cesiumLib.cesiumMod.Cartesian3,
    stride: scala.Double
  ): cesiumLib.cesiumMod.BoundingSphere = js.native
  def fromVertices(
    positions: js.Array[cesiumLib.cesiumMod.Cartesian3],
    center: cesiumLib.cesiumMod.Cartesian3,
    stride: scala.Double,
    result: cesiumLib.cesiumMod.BoundingSphere
  ): cesiumLib.cesiumMod.BoundingSphere = js.native
  def intersect(sphere: cesiumLib.cesiumMod.BoundingSphere, plane: cesiumLib.cesiumMod.Cartesian4): cesiumLib.cesiumMod.Intersect = js.native
  def pack(value: cesiumLib.cesiumMod.BoundingSphere, array: js.Array[scala.Double]): js.Array[scala.Double] = js.native
  def pack(
    value: cesiumLib.cesiumMod.BoundingSphere,
    array: js.Array[scala.Double],
    startingIndex: scala.Double
  ): js.Array[scala.Double] = js.native
  def projectTo2D(sphere: cesiumLib.cesiumMod.BoundingSphere): cesiumLib.cesiumMod.BoundingSphere = js.native
  def projectTo2D(sphere: cesiumLib.cesiumMod.BoundingSphere, projection: js.Any): cesiumLib.cesiumMod.BoundingSphere = js.native
  def projectTo2D(
    sphere: cesiumLib.cesiumMod.BoundingSphere,
    projection: js.Any,
    result: cesiumLib.cesiumMod.BoundingSphere
  ): cesiumLib.cesiumMod.BoundingSphere = js.native
  def transform(sphere: cesiumLib.cesiumMod.BoundingSphere, transform: cesiumLib.cesiumMod.Matrix4): cesiumLib.cesiumMod.BoundingSphere = js.native
  def transform(
    sphere: cesiumLib.cesiumMod.BoundingSphere,
    transform: cesiumLib.cesiumMod.Matrix4,
    result: cesiumLib.cesiumMod.BoundingSphere
  ): cesiumLib.cesiumMod.BoundingSphere = js.native
  def transformWithoutScale(sphere: cesiumLib.cesiumMod.BoundingSphere, transform: cesiumLib.cesiumMod.Matrix4): cesiumLib.cesiumMod.BoundingSphere = js.native
  def transformWithoutScale(
    sphere: cesiumLib.cesiumMod.BoundingSphere,
    transform: cesiumLib.cesiumMod.Matrix4,
    result: cesiumLib.cesiumMod.BoundingSphere
  ): cesiumLib.cesiumMod.BoundingSphere = js.native
  def union(left: cesiumLib.cesiumMod.BoundingSphere, right: cesiumLib.cesiumMod.BoundingSphere): cesiumLib.cesiumMod.BoundingSphere = js.native
  def union(
    left: cesiumLib.cesiumMod.BoundingSphere,
    right: cesiumLib.cesiumMod.BoundingSphere,
    result: cesiumLib.cesiumMod.BoundingSphere
  ): cesiumLib.cesiumMod.BoundingSphere = js.native
  def unpack(array: js.Array[scala.Double]): cesiumLib.cesiumMod.BoundingSphere = js.native
  def unpack(array: js.Array[scala.Double], startingIndex: scala.Double): cesiumLib.cesiumMod.BoundingSphere = js.native
  def unpack(
    array: js.Array[scala.Double],
    startingIndex: scala.Double,
    result: cesiumLib.cesiumMod.BoundingSphere
  ): cesiumLib.cesiumMod.BoundingSphere = js.native
}

