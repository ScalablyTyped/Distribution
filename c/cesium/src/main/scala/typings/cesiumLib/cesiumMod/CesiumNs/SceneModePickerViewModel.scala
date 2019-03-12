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
    destroy: () => scala.Unit,
    dropDownVisible: scala.Boolean,
    duration: scala.Double,
    isDestroyed: () => scala.Boolean,
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
    val __obj = js.Dynamic.literal(destroy = js.Any.fromFunction0(destroy), dropDownVisible = dropDownVisible, duration = duration, isDestroyed = js.Any.fromFunction0(isDestroyed), morphTo2D = morphTo2D, morphTo3D = morphTo3D, morphToColumbusView = morphToColumbusView, scene = scene, sceneMode = sceneMode, selectedTooltip = selectedTooltip, toggleDropDown = toggleDropDown, tooltip2D = tooltip2D, tooltip3D = tooltip3D, tooltipColumbusView = tooltipColumbusView)
  
    __obj.asInstanceOf[SceneModePickerViewModel]
  }
}

