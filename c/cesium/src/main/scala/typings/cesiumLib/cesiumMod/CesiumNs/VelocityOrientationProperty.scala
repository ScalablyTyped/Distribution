package typings
package cesiumLib.cesiumMod.CesiumNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VelocityOrientationProperty extends Property {
  var ellipsoid: Property = js.native
  var position: Property = js.native
  def getValue(): Quaternion = js.native
  def getValue(time: JulianDate, result: Quaternion): Quaternion = js.native
}

