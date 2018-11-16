package typings
package cesiumLib.cesiumMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cesium", "PerformanceWatchdogViewModel")
@js.native
class PerformanceWatchdogViewModel ()
  extends cesiumLib.cesiumMod.CesiumNs.PerformanceWatchdogViewModel {
  def this(options: cesiumLib.Anon_LowFrameRateMessageScene) = this()
  /* CompleteClass */
  override var dismissMessage: cesiumLib.cesiumMod.CesiumNs.Command = js.native
  /* CompleteClass */
  override var lowFrameRateMessage: java.lang.String = js.native
  /* CompleteClass */
  override var lowFrameRateMessageDismissed: scala.Boolean = js.native
  /* CompleteClass */
  override var scene: cesiumLib.cesiumMod.CesiumNs.Scene = js.native
  /* CompleteClass */
  override var showingLowFrameRateMessage: scala.Boolean = js.native
}

