package typings
package cesiumLib.cesiumMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cesium", "PerformanceWatchdogViewModel")
@js.native
class PerformanceWatchdogViewModel () extends js.Object {
  def this(options: cesiumLib.Anon_LowFrameRateMessage) = this()
  var dismissMessage: Command = js.native
  var lowFrameRateMessage: java.lang.String = js.native
  var lowFrameRateMessageDismissed: scala.Boolean = js.native
  var scene: Scene = js.native
  var showingLowFrameRateMessage: scala.Boolean = js.native
}

