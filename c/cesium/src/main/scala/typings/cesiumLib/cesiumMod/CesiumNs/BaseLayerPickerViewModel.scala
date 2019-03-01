package typings
package cesiumLib.cesiumMod.CesiumNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BaseLayerPickerViewModel extends js.Object {
  var buttonImageUrl: java.lang.String
  var buttonTooltip: java.lang.String
  var dropDownVisible: scala.Boolean
  var globe: Globe
  var imageryProviderViewModels: js.Array[ProviderViewModel]
  var selectedImagery: ProviderViewModel
  var selectedTerrain: ProviderViewModel
  var terrainProviderViewModels: js.Array[ProviderViewModel]
  var toggleDropDown: Command
}

object BaseLayerPickerViewModel {
  @scala.inline
  def apply(
    buttonImageUrl: java.lang.String,
    buttonTooltip: java.lang.String,
    dropDownVisible: scala.Boolean,
    globe: Globe,
    imageryProviderViewModels: js.Array[ProviderViewModel],
    selectedImagery: ProviderViewModel,
    selectedTerrain: ProviderViewModel,
    terrainProviderViewModels: js.Array[ProviderViewModel],
    toggleDropDown: Command
  ): BaseLayerPickerViewModel = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("buttonImageUrl")(buttonImageUrl)
    __obj.updateDynamic("buttonTooltip")(buttonTooltip)
    __obj.updateDynamic("dropDownVisible")(dropDownVisible)
    __obj.updateDynamic("globe")(globe)
    __obj.updateDynamic("imageryProviderViewModels")(imageryProviderViewModels)
    __obj.updateDynamic("selectedImagery")(selectedImagery)
    __obj.updateDynamic("selectedTerrain")(selectedTerrain)
    __obj.updateDynamic("terrainProviderViewModels")(terrainProviderViewModels)
    __obj.updateDynamic("toggleDropDown")(toggleDropDown)
    __obj.asInstanceOf[BaseLayerPickerViewModel]
  }
}

