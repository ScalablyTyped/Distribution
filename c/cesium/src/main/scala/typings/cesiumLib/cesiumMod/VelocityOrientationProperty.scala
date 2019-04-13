package typings
package cesiumLib.cesiumMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cesium", "VelocityOrientationProperty")
@js.native
class VelocityOrientationProperty () extends Property {
  def this(position: Property) = this()
  def this(position: Property, ellipsoid: Ellipsoid) = this()
  var ellipsoid: Property = js.native
  var position: Property = js.native
  def getValue(): Quaternion = js.native
  def getValue(time: JulianDate, result: Quaternion): Quaternion = js.native
}

