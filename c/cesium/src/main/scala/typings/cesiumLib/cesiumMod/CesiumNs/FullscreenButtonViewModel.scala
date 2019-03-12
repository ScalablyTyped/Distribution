package typings
package cesiumLib.cesiumMod.CesiumNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FullscreenButtonViewModel extends js.Object {
  var command: Command
  var fullscreenElement: stdLib.Element
  var isFullscreen: scala.Boolean
  var isFullscreenEnabled: scala.Boolean
  var tooltip: java.lang.String
  def destroy(): scala.Unit
  def isDestroyed(): scala.Boolean
}

object FullscreenButtonViewModel {
  @scala.inline
  def apply(
    command: Command,
    destroy: () => scala.Unit,
    fullscreenElement: stdLib.Element,
    isDestroyed: () => scala.Boolean,
    isFullscreen: scala.Boolean,
    isFullscreenEnabled: scala.Boolean,
    tooltip: java.lang.String
  ): FullscreenButtonViewModel = {
    val __obj = js.Dynamic.literal(command = command, destroy = js.Any.fromFunction0(destroy), fullscreenElement = fullscreenElement, isDestroyed = js.Any.fromFunction0(isDestroyed), isFullscreen = isFullscreen, isFullscreenEnabled = isFullscreenEnabled, tooltip = tooltip)
  
    __obj.asInstanceOf[FullscreenButtonViewModel]
  }
}

