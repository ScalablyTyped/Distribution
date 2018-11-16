package typings
package cesiumLib.cesiumMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cesium", "Timeline")
@js.native
class Timeline protected ()
  extends cesiumLib.cesiumMod.CesiumNs.Timeline {
  def this(container: stdLib.Element, clock: cesiumLib.cesiumMod.CesiumNs.Clock) = this()
  /* CompleteClass */
  override var container: stdLib.Element = js.native
  /* CompleteClass */
  override def destroy(): scala.Unit = js.native
  /* CompleteClass */
  override def isDestroyed(): scala.Boolean = js.native
  /* CompleteClass */
  override def resize(): scala.Unit = js.native
  /* CompleteClass */
  override def zoomTo(
    startTime: cesiumLib.cesiumMod.CesiumNs.JulianDate,
    stopTime: cesiumLib.cesiumMod.CesiumNs.JulianDate
  ): scala.Unit = js.native
}

