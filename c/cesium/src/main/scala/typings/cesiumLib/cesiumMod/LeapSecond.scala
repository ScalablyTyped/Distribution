package typings
package cesiumLib.cesiumMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cesium", "LeapSecond")
@js.native
class LeapSecond () extends js.Object {
  def this(date: JulianDate) = this()
  def this(date: JulianDate, offset: scala.Double) = this()
  var julianDate: JulianDate = js.native
  var offset: scala.Double = js.native
}

