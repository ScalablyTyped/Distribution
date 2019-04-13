package typings
package cesiumLib.cesiumMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cesium", "Cartographic")
@js.native
class Cartographic () extends js.Object {
  def this(longitude: scala.Double) = this()
  def this(longitude: scala.Double, latitude: scala.Double) = this()
  def this(longitude: scala.Double, latitude: scala.Double, height: scala.Double) = this()
  var height: scala.Double = js.native
  var latitude: scala.Double = js.native
  var longitude: scala.Double = js.native
  def clone(result: Cartographic): Cartographic = js.native
  def equals(): scala.Boolean = js.native
  def equals(right: Cartographic): scala.Boolean = js.native
  def equalsEpsilon(right: Cartographic, epsilon: scala.Double): scala.Boolean = js.native
}

/* static members */
@JSImport("cesium", "Cartographic")
@js.native
object Cartographic extends js.Object {
  var ZERO: cesiumLib.cesiumMod.Cartographic = js.native
  def clone(cartographic: cesiumLib.cesiumMod.Cartographic): cesiumLib.cesiumMod.Cartographic = js.native
  def clone(cartographic: cesiumLib.cesiumMod.Cartographic, result: cesiumLib.cesiumMod.Cartographic): cesiumLib.cesiumMod.Cartographic = js.native
  def equals(): scala.Boolean = js.native
  def equals(left: cesiumLib.cesiumMod.Cartographic): scala.Boolean = js.native
  def equals(left: cesiumLib.cesiumMod.Cartographic, right: cesiumLib.cesiumMod.Cartographic): scala.Boolean = js.native
  def equalsEpsilon(
    left: cesiumLib.cesiumMod.Cartographic,
    right: cesiumLib.cesiumMod.Cartographic,
    epsilon: scala.Double
  ): scala.Boolean = js.native
  def fromDegrees(longitude: scala.Double, latitude: scala.Double): cesiumLib.cesiumMod.Cartographic = js.native
  def fromDegrees(longitude: scala.Double, latitude: scala.Double, height: scala.Double): cesiumLib.cesiumMod.Cartographic = js.native
  def fromDegrees(
    longitude: scala.Double,
    latitude: scala.Double,
    height: scala.Double,
    result: cesiumLib.cesiumMod.Cartographic
  ): cesiumLib.cesiumMod.Cartographic = js.native
  def fromRadians(longitude: scala.Double, latitude: scala.Double): cesiumLib.cesiumMod.Cartographic = js.native
  def fromRadians(longitude: scala.Double, latitude: scala.Double, height: scala.Double): cesiumLib.cesiumMod.Cartographic = js.native
  def fromRadians(
    longitude: scala.Double,
    latitude: scala.Double,
    height: scala.Double,
    result: cesiumLib.cesiumMod.Cartographic
  ): cesiumLib.cesiumMod.Cartographic = js.native
}

