package typings
package cesiumLib.cesiumMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cesium", "Spherical")
@js.native
class Spherical ()
  extends cesiumLib.cesiumMod.CesiumNs.Spherical {
  def this(clock: scala.Double) = this()
  def this(clock: scala.Double, cone: scala.Double) = this()
  def this(clock: scala.Double, cone: scala.Double, magnitude: scala.Double) = this()
}

/* static members */
@JSImport("cesium", "Spherical")
@js.native
object Spherical extends js.Object {
  def clone(spherical: cesiumLib.cesiumMod.CesiumNs.Spherical): cesiumLib.cesiumMod.CesiumNs.Spherical = js.native
  def clone(spherical: cesiumLib.cesiumMod.CesiumNs.Spherical, result: cesiumLib.cesiumMod.CesiumNs.Spherical): cesiumLib.cesiumMod.CesiumNs.Spherical = js.native
  def equals(left: cesiumLib.cesiumMod.CesiumNs.Spherical, right: cesiumLib.cesiumMod.CesiumNs.Spherical): scala.Boolean = js.native
  def equalsEpsilon(left: cesiumLib.cesiumMod.CesiumNs.Spherical, right: cesiumLib.cesiumMod.CesiumNs.Spherical): scala.Boolean = js.native
  def equalsEpsilon(
    left: cesiumLib.cesiumMod.CesiumNs.Spherical,
    right: cesiumLib.cesiumMod.CesiumNs.Spherical,
    epsilon: scala.Double
  ): scala.Boolean = js.native
  def fromCartesian3(cartesian3: cesiumLib.cesiumMod.CesiumNs.Cartesian3): cesiumLib.cesiumMod.CesiumNs.Spherical = js.native
  def fromCartesian3(
    cartesian3: cesiumLib.cesiumMod.CesiumNs.Cartesian3,
    spherical: cesiumLib.cesiumMod.CesiumNs.Spherical
  ): cesiumLib.cesiumMod.CesiumNs.Spherical = js.native
  def normalize(spherical: cesiumLib.cesiumMod.CesiumNs.Spherical): cesiumLib.cesiumMod.CesiumNs.Spherical = js.native
  def normalize(spherical: cesiumLib.cesiumMod.CesiumNs.Spherical, result: cesiumLib.cesiumMod.CesiumNs.Spherical): cesiumLib.cesiumMod.CesiumNs.Spherical = js.native
}

