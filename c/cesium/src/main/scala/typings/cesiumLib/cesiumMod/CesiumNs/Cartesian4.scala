package typings
package cesiumLib.cesiumMod.CesiumNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Cartesian4 extends Packable {
  var w: scala.Double = js.native
  var x: scala.Double = js.native
  var y: scala.Double = js.native
  var z: scala.Double = js.native
  def clone(result: Cartesian4): Cartesian4 = js.native
  def equals(): scala.Boolean = js.native
  def equals(right: Cartesian4): scala.Boolean = js.native
  def equalsEpsilon(right: Cartesian4, relativeEpsilon: scala.Double): scala.Boolean = js.native
  def equalsEpsilon(right: Cartesian4, relativeEpsilon: scala.Double, absoluteEpsilon: scala.Double): scala.Boolean = js.native
}

