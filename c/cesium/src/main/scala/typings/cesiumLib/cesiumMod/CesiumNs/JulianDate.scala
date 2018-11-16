package typings
package cesiumLib.cesiumMod.CesiumNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JulianDate extends js.Object {
  var dayNumber: scala.Double = js.native
  var secondsOfDay: scala.Double = js.native
  def clone(result: JulianDate): JulianDate = js.native
  def equals(): scala.Boolean = js.native
  def equals(right: JulianDate): scala.Boolean = js.native
  def equalsEpsilon(right: JulianDate, epsilon: scala.Double): scala.Boolean = js.native
}

