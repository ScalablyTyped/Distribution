package typings
package cesiumLib.cesiumMod.CesiumNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Rectangle extends Packable {
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

