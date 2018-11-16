package typings
package cesiumLib.cesiumMod.CesiumNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Cartesian2 extends Packable {
  var x: scala.Double = js.native
  var y: scala.Double = js.native
  def clone(result: Cartesian2): Cartesian2 = js.native
  def equals(): scala.Boolean = js.native
  def equals(right: Cartesian2): scala.Boolean = js.native
  def equalsEpsilon(right: Cartesian2, relativeEpsilon: scala.Double): scala.Boolean = js.native
  def equalsEpsilon(right: Cartesian2, relativeEpsilon: scala.Double, absoluteEpsilon: scala.Double): scala.Boolean = js.native
}

