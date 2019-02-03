package typings
package cesiumLib.cesiumMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cesium", "Rectangle")
@js.native
class Rectangle ()
  extends cesiumLib.cesiumMod.CesiumNs.Rectangle {
  def this(west: scala.Double) = this()
  def this(west: scala.Double, south: scala.Double) = this()
  def this(west: scala.Double, south: scala.Double, east: scala.Double) = this()
  def this(west: scala.Double, south: scala.Double, east: scala.Double, north: scala.Double) = this()
}

/* static members */
@JSImport("cesium", "Rectangle")
@js.native
object Rectangle extends js.Object {
  var MAX_VALUE: cesiumLib.cesiumMod.CesiumNs.Rectangle = js.native
  def center(rectangle: cesiumLib.cesiumMod.CesiumNs.Rectangle): cesiumLib.cesiumMod.CesiumNs.Cartographic = js.native
  def center(
    rectangle: cesiumLib.cesiumMod.CesiumNs.Rectangle,
    result: cesiumLib.cesiumMod.CesiumNs.Cartographic
  ): cesiumLib.cesiumMod.CesiumNs.Cartographic = js.native
  def clone(rectangle: cesiumLib.cesiumMod.CesiumNs.Rectangle): cesiumLib.cesiumMod.CesiumNs.Rectangle = js.native
  def clone(rectangle: cesiumLib.cesiumMod.CesiumNs.Rectangle, result: cesiumLib.cesiumMod.CesiumNs.Rectangle): cesiumLib.cesiumMod.CesiumNs.Rectangle = js.native
  def computeHeight(rectangle: cesiumLib.cesiumMod.CesiumNs.Rectangle): scala.Double = js.native
  def computeWidth(rectangle: cesiumLib.cesiumMod.CesiumNs.Rectangle): scala.Double = js.native
  def contains(
    rectangle: cesiumLib.cesiumMod.CesiumNs.Rectangle,
    cartographic: cesiumLib.cesiumMod.CesiumNs.Cartographic
  ): scala.Boolean = js.native
  def equals(): scala.Boolean = js.native
  def equals(left: cesiumLib.cesiumMod.CesiumNs.Rectangle): scala.Boolean = js.native
  def equals(left: cesiumLib.cesiumMod.CesiumNs.Rectangle, right: cesiumLib.cesiumMod.CesiumNs.Rectangle): scala.Boolean = js.native
  def fromCartographicArray(cartographics: js.Array[cesiumLib.cesiumMod.CesiumNs.Cartographic]): cesiumLib.cesiumMod.CesiumNs.Rectangle = js.native
  def fromCartographicArray(
    cartographics: js.Array[cesiumLib.cesiumMod.CesiumNs.Cartographic],
    result: cesiumLib.cesiumMod.CesiumNs.Rectangle
  ): cesiumLib.cesiumMod.CesiumNs.Rectangle = js.native
  def fromDegrees(): cesiumLib.cesiumMod.CesiumNs.Rectangle = js.native
  def fromDegrees(west: scala.Double): cesiumLib.cesiumMod.CesiumNs.Rectangle = js.native
  def fromDegrees(west: scala.Double, south: scala.Double): cesiumLib.cesiumMod.CesiumNs.Rectangle = js.native
  def fromDegrees(west: scala.Double, south: scala.Double, east: scala.Double): cesiumLib.cesiumMod.CesiumNs.Rectangle = js.native
  def fromDegrees(west: scala.Double, south: scala.Double, east: scala.Double, north: scala.Double): cesiumLib.cesiumMod.CesiumNs.Rectangle = js.native
  def fromDegrees(
    west: scala.Double,
    south: scala.Double,
    east: scala.Double,
    north: scala.Double,
    result: cesiumLib.cesiumMod.CesiumNs.Rectangle
  ): cesiumLib.cesiumMod.CesiumNs.Rectangle = js.native
  def intersection(
    rectangle: cesiumLib.cesiumMod.CesiumNs.Rectangle,
    otherRectangle: cesiumLib.cesiumMod.CesiumNs.Rectangle
  ): cesiumLib.cesiumMod.CesiumNs.Rectangle = js.native
  def intersection(
    rectangle: cesiumLib.cesiumMod.CesiumNs.Rectangle,
    otherRectangle: cesiumLib.cesiumMod.CesiumNs.Rectangle,
    result: cesiumLib.cesiumMod.CesiumNs.Rectangle
  ): cesiumLib.cesiumMod.CesiumNs.Rectangle = js.native
  def northeast(rectangle: cesiumLib.cesiumMod.CesiumNs.Rectangle): cesiumLib.cesiumMod.CesiumNs.Cartographic = js.native
  def northeast(
    rectangle: cesiumLib.cesiumMod.CesiumNs.Rectangle,
    result: cesiumLib.cesiumMod.CesiumNs.Cartographic
  ): cesiumLib.cesiumMod.CesiumNs.Cartographic = js.native
  def northwest(rectangle: cesiumLib.cesiumMod.CesiumNs.Rectangle): cesiumLib.cesiumMod.CesiumNs.Cartographic = js.native
  def northwest(
    rectangle: cesiumLib.cesiumMod.CesiumNs.Rectangle,
    result: cesiumLib.cesiumMod.CesiumNs.Cartographic
  ): cesiumLib.cesiumMod.CesiumNs.Cartographic = js.native
  def pack(value: cesiumLib.cesiumMod.CesiumNs.Rectangle, array: js.Array[scala.Double]): js.Array[scala.Double] = js.native
  def pack(
    value: cesiumLib.cesiumMod.CesiumNs.Rectangle,
    array: js.Array[scala.Double],
    startingIndex: scala.Double
  ): js.Array[scala.Double] = js.native
  def southeast(rectangle: cesiumLib.cesiumMod.CesiumNs.Rectangle): cesiumLib.cesiumMod.CesiumNs.Cartographic = js.native
  def southeast(
    rectangle: cesiumLib.cesiumMod.CesiumNs.Rectangle,
    result: cesiumLib.cesiumMod.CesiumNs.Cartographic
  ): cesiumLib.cesiumMod.CesiumNs.Cartographic = js.native
  def southwest(rectangle: cesiumLib.cesiumMod.CesiumNs.Rectangle): cesiumLib.cesiumMod.CesiumNs.Cartographic = js.native
  def southwest(
    rectangle: cesiumLib.cesiumMod.CesiumNs.Rectangle,
    result: cesiumLib.cesiumMod.CesiumNs.Cartographic
  ): cesiumLib.cesiumMod.CesiumNs.Cartographic = js.native
  def subsample(rectangle: cesiumLib.cesiumMod.CesiumNs.Rectangle): js.Array[cesiumLib.cesiumMod.CesiumNs.Cartesian3] = js.native
  def subsample(
    rectangle: cesiumLib.cesiumMod.CesiumNs.Rectangle,
    ellipsoid: cesiumLib.cesiumMod.CesiumNs.Ellipsoid
  ): js.Array[cesiumLib.cesiumMod.CesiumNs.Cartesian3] = js.native
  def subsample(
    rectangle: cesiumLib.cesiumMod.CesiumNs.Rectangle,
    ellipsoid: cesiumLib.cesiumMod.CesiumNs.Ellipsoid,
    surfaceHeight: scala.Double
  ): js.Array[cesiumLib.cesiumMod.CesiumNs.Cartesian3] = js.native
  def subsample(
    rectangle: cesiumLib.cesiumMod.CesiumNs.Rectangle,
    ellipsoid: cesiumLib.cesiumMod.CesiumNs.Ellipsoid,
    surfaceHeight: scala.Double,
    result: js.Array[cesiumLib.cesiumMod.CesiumNs.Cartesian3]
  ): js.Array[cesiumLib.cesiumMod.CesiumNs.Cartesian3] = js.native
  def unpack(array: js.Array[scala.Double]): cesiumLib.cesiumMod.CesiumNs.Rectangle = js.native
  def unpack(array: js.Array[scala.Double], startingIndex: scala.Double): cesiumLib.cesiumMod.CesiumNs.Rectangle = js.native
  def unpack(
    array: js.Array[scala.Double],
    startingIndex: scala.Double,
    result: cesiumLib.cesiumMod.CesiumNs.Rectangle
  ): cesiumLib.cesiumMod.CesiumNs.Rectangle = js.native
  def validate(rectangle: cesiumLib.cesiumMod.CesiumNs.Rectangle): scala.Unit = js.native
}

