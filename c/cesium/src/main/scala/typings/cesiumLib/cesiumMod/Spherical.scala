package typings
package cesiumLib.cesiumMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cesium", "Spherical")
@js.native
class Spherical () extends js.Object {
  def this(clock: scala.Double) = this()
  def this(clock: scala.Double, cone: scala.Double) = this()
  def this(clock: scala.Double, cone: scala.Double, magnitude: scala.Double) = this()
  var clock: scala.Double = js.native
  var cone: scala.Double = js.native
  var magnitude: scala.Double = js.native
  def clone(result: Spherical): Spherical = js.native
  def equals(other: Spherical): scala.Boolean = js.native
  def equalsEpsilon(other: Spherical, epsilon: scala.Double): scala.Boolean = js.native
}

/* static members */
@JSImport("cesium", "Spherical")
@js.native
object Spherical extends js.Object {
  def clone(spherical: cesiumLib.cesiumMod.Spherical): cesiumLib.cesiumMod.Spherical = js.native
  def clone(spherical: cesiumLib.cesiumMod.Spherical, result: cesiumLib.cesiumMod.Spherical): cesiumLib.cesiumMod.Spherical = js.native
  def equals(left: cesiumLib.cesiumMod.Spherical, right: cesiumLib.cesiumMod.Spherical): scala.Boolean = js.native
  def equalsEpsilon(left: cesiumLib.cesiumMod.Spherical, right: cesiumLib.cesiumMod.Spherical): scala.Boolean = js.native
  def equalsEpsilon(left: cesiumLib.cesiumMod.Spherical, right: cesiumLib.cesiumMod.Spherical, epsilon: scala.Double): scala.Boolean = js.native
  def fromCartesian3(cartesian3: cesiumLib.cesiumMod.Cartesian3): cesiumLib.cesiumMod.Spherical = js.native
  def fromCartesian3(cartesian3: cesiumLib.cesiumMod.Cartesian3, spherical: cesiumLib.cesiumMod.Spherical): cesiumLib.cesiumMod.Spherical = js.native
  def normalize(spherical: cesiumLib.cesiumMod.Spherical): cesiumLib.cesiumMod.Spherical = js.native
  def normalize(spherical: cesiumLib.cesiumMod.Spherical, result: cesiumLib.cesiumMod.Spherical): cesiumLib.cesiumMod.Spherical = js.native
}

