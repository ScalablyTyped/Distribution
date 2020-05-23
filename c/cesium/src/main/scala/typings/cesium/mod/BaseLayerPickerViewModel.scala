package typings.cesium.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cesium", "BaseLayerPickerViewModel")
@js.native
class BaseLayerPickerViewModel protected () extends js.Object {
  def this(options: typings.cesium.anon.Globe) = this()
  var buttonImageUrl: String = js.native
  var buttonTooltip: String = js.native
  var dropDownVisible: Boolean = js.native
  var globe: Globe = js.native
  var imageryProviderViewModels: js.Array[ProviderViewModel] = js.native
  var selectedImagery: ProviderViewModel = js.native
  var selectedTerrain: ProviderViewModel = js.native
  var terrainProviderViewModels: js.Array[ProviderViewModel] = js.native
  var toggleDropDown: Command = js.native
}

