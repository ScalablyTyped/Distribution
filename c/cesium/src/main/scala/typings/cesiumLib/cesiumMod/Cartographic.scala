package typings
package cesiumLib.cesiumMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cesium", "Cartographic")
@js.native
class Cartographic ()
  extends cesiumLib.cesiumMod.CesiumNs.Cartographic {
  def this(longitude: scala.Double) = this()
  def this(longitude: scala.Double, latitude: scala.Double) = this()
  def this(longitude: scala.Double, latitude: scala.Double, height: scala.Double) = this()
}

/* static members */
@JSImport("cesium", "Cartographic")
@js.native
object Cartographic extends js.Object {
  var ZERO: cesiumLib.cesiumMod.CesiumNs.Cartographic = js.native
  def clone(cartographic: cesiumLib.cesiumMod.CesiumNs.Cartographic): cesiumLib.cesiumMod.CesiumNs.Cartographic = js.native
  def clone(
    cartographic: cesiumLib.cesiumMod.CesiumNs.Cartographic,
    result: cesiumLib.cesiumMod.CesiumNs.Cartographic
  ): cesiumLib.cesiumMod.CesiumNs.Cartographic = js.native
  def equals(): scala.Boolean = js.native
  def equals(left: cesiumLib.cesiumMod.CesiumNs.Cartographic): scala.Boolean = js.native
  def equals(left: cesiumLib.cesiumMod.CesiumNs.Cartographic, right: cesiumLib.cesiumMod.CesiumNs.Cartographic): scala.Boolean = js.native
  def equalsEpsilon(
    left: cesiumLib.cesiumMod.CesiumNs.Cartographic,
    right: cesiumLib.cesiumMod.CesiumNs.Cartographic,
    epsilon: scala.Double
  ): scala.Boolean = js.native
  def fromDegrees(longitude: scala.Double, latitude: scala.Double): cesiumLib.cesiumMod.CesiumNs.Cartographic = js.native
  def fromDegrees(longitude: scala.Double, latitude: scala.Double, height: scala.Double): cesiumLib.cesiumMod.CesiumNs.Cartographic = js.native
  def fromDegrees(
    longitude: scala.Double,
    latitude: scala.Double,
    height: scala.Double,
    result: cesiumLib.cesiumMod.CesiumNs.Cartographic
  ): cesiumLib.cesiumMod.CesiumNs.Cartographic = js.native
  def fromRadians(longitude: scala.Double, latitude: scala.Double): cesiumLib.cesiumMod.CesiumNs.Cartographic = js.native
  def fromRadians(longitude: scala.Double, latitude: scala.Double, height: scala.Double): cesiumLib.cesiumMod.CesiumNs.Cartographic = js.native
  def fromRadians(
    longitude: scala.Double,
    latitude: scala.Double,
    height: scala.Double,
    result: cesiumLib.cesiumMod.CesiumNs.Cartographic
  ): cesiumLib.cesiumMod.CesiumNs.Cartographic = js.native
}

