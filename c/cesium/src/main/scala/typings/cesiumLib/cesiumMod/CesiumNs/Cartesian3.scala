package typings
package cesiumLib.cesiumMod.CesiumNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Cartesian3
  extends PositionProperty
     with Packable {
  var x: scala.Double = js.native
  var y: scala.Double = js.native
  var z: scala.Double = js.native
  def clone(result: Cartesian3): Cartesian3 = js.native
  def equals(right: Cartesian3): scala.Boolean = js.native
  def equalsEpsilon(right: Cartesian3, relativeEpsilon: scala.Double): scala.Boolean = js.native
  def equalsEpsilon(right: Cartesian3, relativeEpsilon: scala.Double, absoluteEpsilon: scala.Double): scala.Boolean = js.native
  def getValue(time: JulianDate, result: Cartesian3): Cartesian3 = js.native
}

