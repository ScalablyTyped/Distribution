package typings
package cesiumLib.cesiumMod.CesiumNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SceneModePickerViewModel extends js.Object {
  var dropDownVisible: scala.Boolean
  var duration: scala.Double
  var morphTo2D: Command
  var morphTo3D: Command
  var morphToColumbusView: Command
  var scene: Scene
  var sceneMode: SceneMode
  var selectedTooltip: java.lang.String
  var toggleDropDown: Command
  var tooltip2D: java.lang.String
  var tooltip3D: java.lang.String
  var tooltipColumbusView: java.lang.String
  def destroy(): scala.Unit
  def isDestroyed(): scala.Boolean
}

object SceneModePickerViewModel {
  @scala.inline
  def apply(
    destroy: js.Function0[scala.Unit],
    dropDownVisible: scala.Boolean,
    duration: scala.Double,
    isDestroyed: js.Function0[scala.Boolean],
    morphTo2D: Command,
    morphTo3D: Command,
    morphToColumbusView: Command,
    scene: Scene,
    sceneMode: SceneMode,
    selectedTooltip: java.lang.String,
    toggleDropDown: Command,
    tooltip2D: java.lang.String,
    tooltip3D: java.lang.String,
    tooltipColumbusView: java.lang.String
  ): SceneModePickerViewModel = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("destroy")(destroy)
    __obj.updateDynamic("dropDownVisible")(dropDownVisible)
    __obj.updateDynamic("duration")(duration)
    __obj.updateDynamic("isDestroyed")(isDestroyed)
    __obj.updateDynamic("morphTo2D")(morphTo2D)
    __obj.updateDynamic("morphTo3D")(morphTo3D)
    __obj.updateDynamic("morphToColumbusView")(morphToColumbusView)
    __obj.updateDynamic("scene")(scene)
    __obj.updateDynamic("sceneMode")(sceneMode)
    __obj.updateDynamic("selectedTooltip")(selectedTooltip)
    __obj.updateDynamic("toggleDropDown")(toggleDropDown)
    __obj.updateDynamic("tooltip2D")(tooltip2D)
    __obj.updateDynamic("tooltip3D")(tooltip3D)
    __obj.updateDynamic("tooltipColumbusView")(tooltipColumbusView)
    __obj.asInstanceOf[SceneModePickerViewModel]
  }
}

