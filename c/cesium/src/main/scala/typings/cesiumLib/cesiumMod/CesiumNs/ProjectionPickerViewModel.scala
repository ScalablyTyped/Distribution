package typings
package cesiumLib.cesiumMod.CesiumNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProjectionPickerViewModel extends js.Object {
  var dropDownVisible: scala.Boolean
  var isOrthographicProjection: Command
  var scene: Scene
  var sceneMode: SceneMode
  var selectedTooltip: java.lang.String
  var switchToOrthographic: Command
  var switchToPerspective: Command
  var toggleDropdown: Command
  var tooltipOrthographic: java.lang.String
  var tooltipPerspective: java.lang.String
  def destroy(): scala.Unit
  def isDestroyed(): scala.Boolean
}

object ProjectionPickerViewModel {
  @scala.inline
  def apply(
    destroy: () => scala.Unit,
    dropDownVisible: scala.Boolean,
    isDestroyed: () => scala.Boolean,
    isOrthographicProjection: Command,
    scene: Scene,
    sceneMode: SceneMode,
    selectedTooltip: java.lang.String,
    switchToOrthographic: Command,
    switchToPerspective: Command,
    toggleDropdown: Command,
    tooltipOrthographic: java.lang.String,
    tooltipPerspective: java.lang.String
  ): ProjectionPickerViewModel = {
    val __obj = js.Dynamic.literal(destroy = js.Any.fromFunction0(destroy), dropDownVisible = dropDownVisible, isDestroyed = js.Any.fromFunction0(isDestroyed), isOrthographicProjection = isOrthographicProjection, scene = scene, sceneMode = sceneMode, selectedTooltip = selectedTooltip, switchToOrthographic = switchToOrthographic, switchToPerspective = switchToPerspective, toggleDropdown = toggleDropdown, tooltipOrthographic = tooltipOrthographic, tooltipPerspective = tooltipPerspective)
  
    __obj.asInstanceOf[ProjectionPickerViewModel]
  }
}

