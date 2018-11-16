package typings
package cesiumLib.cesiumMod.CesiumNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Quaternion extends Packable {
  var w: scala.Double = js.native
  var x: scala.Double = js.native
  var y: scala.Double = js.native
  var z: scala.Double = js.native
  def clone(result: Quaternion): Quaternion = js.native
  def equals(): scala.Boolean = js.native
  def equals(right: Quaternion): scala.Boolean = js.native
  def equalsEpsilon(right: Quaternion, epsilon: scala.Double): scala.Boolean = js.native
}

