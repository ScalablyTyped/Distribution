package typings
package cesiumLib.cesiumMod.CesiumNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PerformanceWatchdogViewModel extends js.Object {
  var dismissMessage: Command
  var lowFrameRateMessage: java.lang.String
  var lowFrameRateMessageDismissed: scala.Boolean
  var scene: Scene
  var showingLowFrameRateMessage: scala.Boolean
}

object PerformanceWatchdogViewModel {
  @scala.inline
  def apply(
    dismissMessage: Command,
    lowFrameRateMessage: java.lang.String,
    lowFrameRateMessageDismissed: scala.Boolean,
    scene: Scene,
    showingLowFrameRateMessage: scala.Boolean
  ): PerformanceWatchdogViewModel = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("dismissMessage")(dismissMessage)
    __obj.updateDynamic("lowFrameRateMessage")(lowFrameRateMessage)
    __obj.updateDynamic("lowFrameRateMessageDismissed")(lowFrameRateMessageDismissed)
    __obj.updateDynamic("scene")(scene)
    __obj.updateDynamic("showingLowFrameRateMessage")(showingLowFrameRateMessage)
    __obj.asInstanceOf[PerformanceWatchdogViewModel]
  }
}

