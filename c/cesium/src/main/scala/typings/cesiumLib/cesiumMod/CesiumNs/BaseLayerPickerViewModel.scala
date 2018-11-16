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

