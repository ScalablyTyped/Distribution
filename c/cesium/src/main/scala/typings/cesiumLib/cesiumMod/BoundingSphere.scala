package typings
package cesiumLib.cesiumMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cesium", "BoundingSphere")
@js.native
class BoundingSphere ()
  extends cesiumLib.cesiumMod.CesiumNs.BoundingSphere {
  def this(center: cesiumLib.cesiumMod.CesiumNs.Cartesian3) = this()
  def this(center: cesiumLib.cesiumMod.CesiumNs.Cartesian3, radius: scala.Double) = this()
}

/* static members */
@JSImport("cesium", "BoundingSphere")
@js.native
object BoundingSphere extends js.Object {
  def clone(sphere: cesiumLib.cesiumMod.CesiumNs.BoundingSphere): cesiumLib.cesiumMod.CesiumNs.BoundingSphere = js.native
  def clone(
    sphere: cesiumLib.cesiumMod.CesiumNs.BoundingSphere,
    result: cesiumLib.cesiumMod.CesiumNs.BoundingSphere
  ): cesiumLib.cesiumMod.CesiumNs.BoundingSphere = js.native
  def computePlaneDistances(
    sphere: cesiumLib.cesiumMod.CesiumNs.BoundingSphere,
    position: cesiumLib.cesiumMod.CesiumNs.Cartesian3,
    direction: cesiumLib.cesiumMod.CesiumNs.Cartesian3
  ): cesiumLib.cesiumMod.CesiumNs.Interval = js.native
  def computePlaneDistances(
    sphere: cesiumLib.cesiumMod.CesiumNs.BoundingSphere,
    position: cesiumLib.cesiumMod.CesiumNs.Cartesian3,
    direction: cesiumLib.cesiumMod.CesiumNs.Cartesian3,
    result: cesiumLib.cesiumMod.CesiumNs.Cartesian2
  ): cesiumLib.cesiumMod.CesiumNs.Interval = js.native
  def distanceSquaredTo(
    sphere: cesiumLib.cesiumMod.CesiumNs.BoundingSphere,
    cartesian: cesiumLib.cesiumMod.CesiumNs.Cartesian3
  ): scala.Double = js.native
  def equals(): scala.Boolean = js.native
  def equals(left: cesiumLib.cesiumMod.CesiumNs.BoundingSphere): scala.Boolean = js.native
  def equals(
    left: cesiumLib.cesiumMod.CesiumNs.BoundingSphere,
    right: cesiumLib.cesiumMod.CesiumNs.BoundingSphere
  ): scala.Boolean = js.native
  def expand(
    sphere: cesiumLib.cesiumMod.CesiumNs.BoundingSphere,
    point: cesiumLib.cesiumMod.CesiumNs.Cartesian3
  ): cesiumLib.cesiumMod.CesiumNs.BoundingSphere = js.native
  def expand(
    sphere: cesiumLib.cesiumMod.CesiumNs.BoundingSphere,
    point: cesiumLib.cesiumMod.CesiumNs.Cartesian3,
    result: cesiumLib.cesiumMod.CesiumNs.BoundingSphere
  ): cesiumLib.cesiumMod.CesiumNs.BoundingSphere = js.native
  def fromBoundingSpheres(boundingSpheres: js.Array[cesiumLib.cesiumMod.CesiumNs.BoundingSphere]): cesiumLib.cesiumMod.CesiumNs.BoundingSphere = js.native
  def fromBoundingSpheres(
    boundingSpheres: js.Array[cesiumLib.cesiumMod.CesiumNs.BoundingSphere],
    result: cesiumLib.cesiumMod.CesiumNs.BoundingSphere
  ): cesiumLib.cesiumMod.CesiumNs.BoundingSphere = js.native
  def fromCornerPoints(): cesiumLib.cesiumMod.CesiumNs.BoundingSphere = js.native
  def fromCornerPoints(corner: scala.Double): cesiumLib.cesiumMod.CesiumNs.BoundingSphere = js.native
  def fromCornerPoints(corner: scala.Double, oppositeCorner: scala.Double): cesiumLib.cesiumMod.CesiumNs.BoundingSphere = js.native
  def fromCornerPoints(
    corner: scala.Double,
    oppositeCorner: scala.Double,
    result: cesiumLib.cesiumMod.CesiumNs.BoundingSphere
  ): cesiumLib.cesiumMod.CesiumNs.BoundingSphere = js.native
  def fromEllipsoid(ellipsoid: cesiumLib.cesiumMod.CesiumNs.Ellipsoid): cesiumLib.cesiumMod.CesiumNs.BoundingSphere = js.native
  def fromEllipsoid(
    ellipsoid: cesiumLib.cesiumMod.CesiumNs.Ellipsoid,
    result: cesiumLib.cesiumMod.CesiumNs.BoundingSphere
  ): cesiumLib.cesiumMod.CesiumNs.BoundingSphere = js.native
  def fromPoints(positions: js.Array[cesiumLib.cesiumMod.CesiumNs.Cartesian3]): cesiumLib.cesiumMod.CesiumNs.BoundingSphere = js.native
  def fromPoints(
    positions: js.Array[cesiumLib.cesiumMod.CesiumNs.Cartesian3],
    result: cesiumLib.cesiumMod.CesiumNs.BoundingSphere
  ): cesiumLib.cesiumMod.CesiumNs.BoundingSphere = js.native
  def fromRectangle2D(rectangle: cesiumLib.cesiumMod.CesiumNs.Rectangle): cesiumLib.cesiumMod.CesiumNs.BoundingSphere = js.native
  def fromRectangle2D(rectangle: cesiumLib.cesiumMod.CesiumNs.Rectangle, projection: js.Any): cesiumLib.cesiumMod.CesiumNs.BoundingSphere = js.native
  def fromRectangle2D(
    rectangle: cesiumLib.cesiumMod.CesiumNs.Rectangle,
    projection: js.Any,
    result: cesiumLib.cesiumMod.CesiumNs.BoundingSphere
  ): cesiumLib.cesiumMod.CesiumNs.BoundingSphere = js.native
  def fromRectangle3D(rectangle: cesiumLib.cesiumMod.CesiumNs.Rectangle): cesiumLib.cesiumMod.CesiumNs.BoundingSphere = js.native
  def fromRectangle3D(
    rectangle: cesiumLib.cesiumMod.CesiumNs.Rectangle,
    ellipsoid: cesiumLib.cesiumMod.CesiumNs.Ellipsoid
  ): cesiumLib.cesiumMod.CesiumNs.BoundingSphere = js.native
  def fromRectangle3D(
    rectangle: cesiumLib.cesiumMod.CesiumNs.Rectangle,
    ellipsoid: cesiumLib.cesiumMod.CesiumNs.Ellipsoid,
    surfaceHeight: scala.Double
  ): cesiumLib.cesiumMod.CesiumNs.BoundingSphere = js.native
  def fromRectangle3D(
    rectangle: cesiumLib.cesiumMod.CesiumNs.Rectangle,
    ellipsoid: cesiumLib.cesiumMod.CesiumNs.Ellipsoid,
    surfaceHeight: scala.Double,
    result: cesiumLib.cesiumMod.CesiumNs.BoundingSphere
  ): cesiumLib.cesiumMod.CesiumNs.BoundingSphere = js.native
  def fromRectangleWithHeights2D(rectangle: cesiumLib.cesiumMod.CesiumNs.Rectangle): cesiumLib.cesiumMod.CesiumNs.BoundingSphere = js.native
  def fromRectangleWithHeights2D(rectangle: cesiumLib.cesiumMod.CesiumNs.Rectangle, projection: js.Any): cesiumLib.cesiumMod.CesiumNs.BoundingSphere = js.native
  def fromRectangleWithHeights2D(rectangle: cesiumLib.cesiumMod.CesiumNs.Rectangle, projection: js.Any, minimumHeight: scala.Double): cesiumLib.cesiumMod.CesiumNs.BoundingSphere = js.native
  def fromRectangleWithHeights2D(
    rectangle: cesiumLib.cesiumMod.CesiumNs.Rectangle,
    projection: js.Any,
    minimumHeight: scala.Double,
    maximumHeight: scala.Double
  ): cesiumLib.cesiumMod.CesiumNs.BoundingSphere = js.native
  def fromRectangleWithHeights2D(
    rectangle: cesiumLib.cesiumMod.CesiumNs.Rectangle,
    projection: js.Any,
    minimumHeight: scala.Double,
    maximumHeight: scala.Double,
    result: cesiumLib.cesiumMod.CesiumNs.BoundingSphere
  ): cesiumLib.cesiumMod.CesiumNs.BoundingSphere = js.native
  def fromVertices(positions: js.Array[cesiumLib.cesiumMod.CesiumNs.Cartesian3]): cesiumLib.cesiumMod.CesiumNs.BoundingSphere = js.native
  def fromVertices(
    positions: js.Array[cesiumLib.cesiumMod.CesiumNs.Cartesian3],
    center: cesiumLib.cesiumMod.CesiumNs.Cartesian3
  ): cesiumLib.cesiumMod.CesiumNs.BoundingSphere = js.native
  def fromVertices(
    positions: js.Array[cesiumLib.cesiumMod.CesiumNs.Cartesian3],
    center: cesiumLib.cesiumMod.CesiumNs.Cartesian3,
    stride: scala.Double
  ): cesiumLib.cesiumMod.CesiumNs.BoundingSphere = js.native
  def fromVertices(
    positions: js.Array[cesiumLib.cesiumMod.CesiumNs.Cartesian3],
    center: cesiumLib.cesiumMod.CesiumNs.Cartesian3,
    stride: scala.Double,
    result: cesiumLib.cesiumMod.CesiumNs.BoundingSphere
  ): cesiumLib.cesiumMod.CesiumNs.BoundingSphere = js.native
  def intersect(
    sphere: cesiumLib.cesiumMod.CesiumNs.BoundingSphere,
    plane: cesiumLib.cesiumMod.CesiumNs.Cartesian4
  ): cesiumLib.cesiumMod.CesiumNs.Intersect = js.native
  def pack(value: cesiumLib.cesiumMod.CesiumNs.BoundingSphere, array: js.Array[scala.Double]): js.Array[scala.Double] = js.native
  def pack(
    value: cesiumLib.cesiumMod.CesiumNs.BoundingSphere,
    array: js.Array[scala.Double],
    startingIndex: scala.Double
  ): js.Array[scala.Double] = js.native
  def projectTo2D(sphere: cesiumLib.cesiumMod.CesiumNs.BoundingSphere): cesiumLib.cesiumMod.CesiumNs.BoundingSphere = js.native
  def projectTo2D(sphere: cesiumLib.cesiumMod.CesiumNs.BoundingSphere, projection: js.Any): cesiumLib.cesiumMod.CesiumNs.BoundingSphere = js.native
  def projectTo2D(
    sphere: cesiumLib.cesiumMod.CesiumNs.BoundingSphere,
    projection: js.Any,
    result: cesiumLib.cesiumMod.CesiumNs.BoundingSphere
  ): cesiumLib.cesiumMod.CesiumNs.BoundingSphere = js.native
  def transform(
    sphere: cesiumLib.cesiumMod.CesiumNs.BoundingSphere,
    transform: cesiumLib.cesiumMod.CesiumNs.Matrix4
  ): cesiumLib.cesiumMod.CesiumNs.BoundingSphere = js.native
  def transform(
    sphere: cesiumLib.cesiumMod.CesiumNs.BoundingSphere,
    transform: cesiumLib.cesiumMod.CesiumNs.Matrix4,
    result: cesiumLib.cesiumMod.CesiumNs.BoundingSphere
  ): cesiumLib.cesiumMod.CesiumNs.BoundingSphere = js.native
  def transformWithoutScale(
    sphere: cesiumLib.cesiumMod.CesiumNs.BoundingSphere,
    transform: cesiumLib.cesiumMod.CesiumNs.Matrix4
  ): cesiumLib.cesiumMod.CesiumNs.BoundingSphere = js.native
  def transformWithoutScale(
    sphere: cesiumLib.cesiumMod.CesiumNs.BoundingSphere,
    transform: cesiumLib.cesiumMod.CesiumNs.Matrix4,
    result: cesiumLib.cesiumMod.CesiumNs.BoundingSphere
  ): cesiumLib.cesiumMod.CesiumNs.BoundingSphere = js.native
  def union(
    left: cesiumLib.cesiumMod.CesiumNs.BoundingSphere,
    right: cesiumLib.cesiumMod.CesiumNs.BoundingSphere
  ): cesiumLib.cesiumMod.CesiumNs.BoundingSphere = js.native
  def union(
    left: cesiumLib.cesiumMod.CesiumNs.BoundingSphere,
    right: cesiumLib.cesiumMod.CesiumNs.BoundingSphere,
    result: cesiumLib.cesiumMod.CesiumNs.BoundingSphere
  ): cesiumLib.cesiumMod.CesiumNs.BoundingSphere = js.native
  def unpack(array: js.Array[scala.Double]): cesiumLib.cesiumMod.CesiumNs.BoundingSphere = js.native
  def unpack(array: js.Array[scala.Double], startingIndex: scala.Double): cesiumLib.cesiumMod.CesiumNs.BoundingSphere = js.native
  def unpack(
    array: js.Array[scala.Double],
    startingIndex: scala.Double,
    result: cesiumLib.cesiumMod.CesiumNs.BoundingSphere
  ): cesiumLib.cesiumMod.CesiumNs.BoundingSphere = js.native
}

