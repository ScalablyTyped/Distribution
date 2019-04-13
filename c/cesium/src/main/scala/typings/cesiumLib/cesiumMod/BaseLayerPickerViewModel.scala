package typings
package cesiumLib.cesiumMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cesium", "BaseLayerPickerViewModel")
@js.native
class BaseLayerPickerViewModel protected () extends js.Object {
  def this(options: cesiumLib.Anon_Globe) = this()
  var buttonImageUrl: java.lang.String = js.native
  var buttonTooltip: java.lang.String = js.native
  var dropDownVisible: scala.Boolean = js.native
  var globe: Globe = js.native
  var imageryProviderViewModels: js.Array[ProviderViewModel] = js.native
  var selectedImagery: ProviderViewModel = js.native
  var selectedTerrain: ProviderViewModel = js.native
  var terrainProviderViewModels: js.Array[ProviderViewModel] = js.native
  var toggleDropDown: Command = js.native
}

