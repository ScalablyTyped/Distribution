package typings
package cesiumLib.cesiumMod.CesiumNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VRButtonViewModel extends js.Object {
  var command: Command
  var isVREnabled: scala.Boolean
  var isVRMode: scala.Boolean
  var tooltip: java.lang.String
  var vrElement: stdLib.Element
  def destroy(): scala.Unit
  def isDestroyed(): scala.Boolean
}

object VRButtonViewModel {
  @scala.inline
  def apply(
    command: Command,
    destroy: () => scala.Unit,
    isDestroyed: () => scala.Boolean,
    isVREnabled: scala.Boolean,
    isVRMode: scala.Boolean,
    tooltip: java.lang.String,
    vrElement: stdLib.Element
  ): VRButtonViewModel = {
    val __obj = js.Dynamic.literal(command = command, destroy = js.Any.fromFunction0(destroy), isDestroyed = js.Any.fromFunction0(isDestroyed), isVREnabled = isVREnabled, isVRMode = isVRMode, tooltip = tooltip, vrElement = vrElement)
  
    __obj.asInstanceOf[VRButtonViewModel]
  }
}

