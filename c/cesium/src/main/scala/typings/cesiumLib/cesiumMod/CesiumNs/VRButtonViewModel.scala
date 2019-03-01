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
    destroy: js.Function0[scala.Unit],
    isDestroyed: js.Function0[scala.Boolean],
    isVREnabled: scala.Boolean,
    isVRMode: scala.Boolean,
    tooltip: java.lang.String,
    vrElement: stdLib.Element
  ): VRButtonViewModel = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("command")(command)
    __obj.updateDynamic("destroy")(destroy)
    __obj.updateDynamic("isDestroyed")(isDestroyed)
    __obj.updateDynamic("isVREnabled")(isVREnabled)
    __obj.updateDynamic("isVRMode")(isVRMode)
    __obj.updateDynamic("tooltip")(tooltip)
    __obj.updateDynamic("vrElement")(vrElement)
    __obj.asInstanceOf[VRButtonViewModel]
  }
}

