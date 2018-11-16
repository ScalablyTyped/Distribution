package typings
package cesiumLib.cesiumMod.CesiumNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Cartographic extends js.Object {
  var height: scala.Double = js.native
  var latitude: scala.Double = js.native
  var longitude: scala.Double = js.native
  def clone(result: Cartographic): Cartographic = js.native
  def equals(): scala.Boolean = js.native
  def equals(right: Cartographic): scala.Boolean = js.native
  def equalsEpsilon(right: Cartographic, epsilon: scala.Double): scala.Boolean = js.native
}

