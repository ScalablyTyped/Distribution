package typings
package cesiumLib.cesiumMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cesium", "LeapSecond")
@js.native
class LeapSecond ()
  extends cesiumLib.cesiumMod.CesiumNs.LeapSecond {
  def this(date: cesiumLib.cesiumMod.CesiumNs.JulianDate) = this()
  def this(date: cesiumLib.cesiumMod.CesiumNs.JulianDate, offset: scala.Double) = this()
  /* CompleteClass */
  override var julianDate: cesiumLib.cesiumMod.CesiumNs.JulianDate = js.native
  /* CompleteClass */
  override var offset: scala.Double = js.native
}

