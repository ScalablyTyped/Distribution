package typings
package cesiumLib.cesiumMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cesium", "PerformanceWatchdog")
@js.native
class PerformanceWatchdog ()
  extends cesiumLib.cesiumMod.CesiumNs.PerformanceWatchdog {
  def this(options: cesiumLib.Anon_LowFrameRateMessage) = this()
  /* CompleteClass */
  override var container: stdLib.Element = js.native
  /* CompleteClass */
  override var viewModel: cesiumLib.cesiumMod.CesiumNs.PerformanceWatchdogViewModel = js.native
  /* CompleteClass */
  override def destroy(): scala.Unit = js.native
  /* CompleteClass */
  override def isDestroyed(): scala.Boolean = js.native
}

