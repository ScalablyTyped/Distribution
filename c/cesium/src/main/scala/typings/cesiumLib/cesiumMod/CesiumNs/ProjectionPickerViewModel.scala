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
    destroy: js.Function0[scala.Unit],
    dropDownVisible: scala.Boolean,
    isDestroyed: js.Function0[scala.Boolean],
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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("destroy")(destroy)
    __obj.updateDynamic("dropDownVisible")(dropDownVisible)
    __obj.updateDynamic("isDestroyed")(isDestroyed)
    __obj.updateDynamic("isOrthographicProjection")(isOrthographicProjection)
    __obj.updateDynamic("scene")(scene)
    __obj.updateDynamic("sceneMode")(sceneMode)
    __obj.updateDynamic("selectedTooltip")(selectedTooltip)
    __obj.updateDynamic("switchToOrthographic")(switchToOrthographic)
    __obj.updateDynamic("switchToPerspective")(switchToPerspective)
    __obj.updateDynamic("toggleDropdown")(toggleDropdown)
    __obj.updateDynamic("tooltipOrthographic")(tooltipOrthographic)
    __obj.updateDynamic("tooltipPerspective")(tooltipPerspective)
    __obj.asInstanceOf[ProjectionPickerViewModel]
  }
}

