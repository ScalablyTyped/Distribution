package typings
package cesiumLib.cesiumMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cesium", "Rectangle")
@js.native
class Rectangle () extends Packable {
  def this(west: scala.Double) = this()
  def this(west: scala.Double, south: scala.Double) = this()
  def this(west: scala.Double, south: scala.Double, east: scala.Double) = this()
  def this(west: scala.Double, south: scala.Double, east: scala.Double, north: scala.Double) = this()
  var east: scala.Double = js.native
  var height: scala.Double = js.native
  var north: scala.Double = js.native
  var south: scala.Double = js.native
  var west: scala.Double = js.native
  var width: scala.Double = js.native
  def clone(result: Rectangle): Rectangle = js.native
  def equals(): scala.Boolean = js.native
  def equals(other: Rectangle): scala.Boolean = js.native
  def equalsEpsilon(other: Rectangle, epsilon: scala.Double): scala.Boolean = js.native
}

/* static members */
@JSImport("cesium", "Rectangle")
@js.native
object Rectangle extends js.Object {
  var MAX_VALUE: cesiumLib.cesiumMod.Rectangle = js.native
  def center(rectangle: cesiumLib.cesiumMod.Rectangle): cesiumLib.cesiumMod.Cartographic = js.native
  def center(rectangle: cesiumLib.cesiumMod.Rectangle, result: cesiumLib.cesiumMod.Cartographic): cesiumLib.cesiumMod.Cartographic = js.native
  def clone(rectangle: cesiumLib.cesiumMod.Rectangle): cesiumLib.cesiumMod.Rectangle = js.native
  def clone(rectangle: cesiumLib.cesiumMod.Rectangle, result: cesiumLib.cesiumMod.Rectangle): cesiumLib.cesiumMod.Rectangle = js.native
  def computeHeight(rectangle: cesiumLib.cesiumMod.Rectangle): scala.Double = js.native
  def computeWidth(rectangle: cesiumLib.cesiumMod.Rectangle): scala.Double = js.native
  def contains(rectangle: cesiumLib.cesiumMod.Rectangle, cartographic: cesiumLib.cesiumMod.Cartographic): scala.Boolean = js.native
  def equals(): scala.Boolean = js.native
  def equals(left: cesiumLib.cesiumMod.Rectangle): scala.Boolean = js.native
  def equals(left: cesiumLib.cesiumMod.Rectangle, right: cesiumLib.cesiumMod.Rectangle): scala.Boolean = js.native
  def fromCartographicArray(cartographics: js.Array[cesiumLib.cesiumMod.Cartographic]): cesiumLib.cesiumMod.Rectangle = js.native
  def fromCartographicArray(cartographics: js.Array[cesiumLib.cesiumMod.Cartographic], result: cesiumLib.cesiumMod.Rectangle): cesiumLib.cesiumMod.Rectangle = js.native
  def fromDegrees(): cesiumLib.cesiumMod.Rectangle = js.native
  def fromDegrees(west: scala.Double): cesiumLib.cesiumMod.Rectangle = js.native
  def fromDegrees(west: scala.Double, south: scala.Double): cesiumLib.cesiumMod.Rectangle = js.native
  def fromDegrees(west: scala.Double, south: scala.Double, east: scala.Double): cesiumLib.cesiumMod.Rectangle = js.native
  def fromDegrees(west: scala.Double, south: scala.Double, east: scala.Double, north: scala.Double): cesiumLib.cesiumMod.Rectangle = js.native
  def fromDegrees(
    west: scala.Double,
    south: scala.Double,
    east: scala.Double,
    north: scala.Double,
    result: cesiumLib.cesiumMod.Rectangle
  ): cesiumLib.cesiumMod.Rectangle = js.native
  def intersection(rectangle: cesiumLib.cesiumMod.Rectangle, otherRectangle: cesiumLib.cesiumMod.Rectangle): cesiumLib.cesiumMod.Rectangle = js.native
  def intersection(
    rectangle: cesiumLib.cesiumMod.Rectangle,
    otherRectangle: cesiumLib.cesiumMod.Rectangle,
    result: cesiumLib.cesiumMod.Rectangle
  ): cesiumLib.cesiumMod.Rectangle = js.native
  def northeast(rectangle: cesiumLib.cesiumMod.Rectangle): cesiumLib.cesiumMod.Cartographic = js.native
  def northeast(rectangle: cesiumLib.cesiumMod.Rectangle, result: cesiumLib.cesiumMod.Cartographic): cesiumLib.cesiumMod.Cartographic = js.native
  def northwest(rectangle: cesiumLib.cesiumMod.Rectangle): cesiumLib.cesiumMod.Cartographic = js.native
  def northwest(rectangle: cesiumLib.cesiumMod.Rectangle, result: cesiumLib.cesiumMod.Cartographic): cesiumLib.cesiumMod.Cartographic = js.native
  def pack(value: cesiumLib.cesiumMod.Rectangle, array: js.Array[scala.Double]): js.Array[scala.Double] = js.native
  def pack(value: cesiumLib.cesiumMod.Rectangle, array: js.Array[scala.Double], startingIndex: scala.Double): js.Array[scala.Double] = js.native
  def southeast(rectangle: cesiumLib.cesiumMod.Rectangle): cesiumLib.cesiumMod.Cartographic = js.native
  def southeast(rectangle: cesiumLib.cesiumMod.Rectangle, result: cesiumLib.cesiumMod.Cartographic): cesiumLib.cesiumMod.Cartographic = js.native
  def southwest(rectangle: cesiumLib.cesiumMod.Rectangle): cesiumLib.cesiumMod.Cartographic = js.native
  def southwest(rectangle: cesiumLib.cesiumMod.Rectangle, result: cesiumLib.cesiumMod.Cartographic): cesiumLib.cesiumMod.Cartographic = js.native
  def subsample(rectangle: cesiumLib.cesiumMod.Rectangle): js.Array[cesiumLib.cesiumMod.Cartesian3] = js.native
  def subsample(rectangle: cesiumLib.cesiumMod.Rectangle, ellipsoid: cesiumLib.cesiumMod.Ellipsoid): js.Array[cesiumLib.cesiumMod.Cartesian3] = js.native
  def subsample(
    rectangle: cesiumLib.cesiumMod.Rectangle,
    ellipsoid: cesiumLib.cesiumMod.Ellipsoid,
    surfaceHeight: scala.Double
  ): js.Array[cesiumLib.cesiumMod.Cartesian3] = js.native
  def subsample(
    rectangle: cesiumLib.cesiumMod.Rectangle,
    ellipsoid: cesiumLib.cesiumMod.Ellipsoid,
    surfaceHeight: scala.Double,
    result: js.Array[cesiumLib.cesiumMod.Cartesian3]
  ): js.Array[cesiumLib.cesiumMod.Cartesian3] = js.native
  def unpack(array: js.Array[scala.Double]): cesiumLib.cesiumMod.Rectangle = js.native
  def unpack(array: js.Array[scala.Double], startingIndex: scala.Double): cesiumLib.cesiumMod.Rectangle = js.native
  def unpack(array: js.Array[scala.Double], startingIndex: scala.Double, result: cesiumLib.cesiumMod.Rectangle): cesiumLib.cesiumMod.Rectangle = js.native
  def validate(rectangle: cesiumLib.cesiumMod.Rectangle): scala.Unit = js.native
}

