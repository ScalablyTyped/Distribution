package typings
package cesiumLib.cesiumMod.CesiumNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PerformanceWatchdog extends js.Object {
  var container: stdLib.Element
  var viewModel: PerformanceWatchdogViewModel
  def destroy(): scala.Unit
  def isDestroyed(): scala.Boolean
}

object PerformanceWatchdog {
  @scala.inline
  def apply(
    container: stdLib.Element,
    destroy: () => scala.Unit,
    isDestroyed: () => scala.Boolean,
    viewModel: PerformanceWatchdogViewModel
  ): PerformanceWatchdog = {
    val __obj = js.Dynamic.literal(container = container, destroy = js.Any.fromFunction0(destroy), isDestroyed = js.Any.fromFunction0(isDestroyed), viewModel = viewModel)
  
    __obj.asInstanceOf[PerformanceWatchdog]
  }
}

