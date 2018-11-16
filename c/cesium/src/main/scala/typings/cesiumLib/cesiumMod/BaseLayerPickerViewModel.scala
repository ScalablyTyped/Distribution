package typings
package cesiumLib.cesiumMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cesium", "BaseLayerPickerViewModel")
@js.native
class BaseLayerPickerViewModel protected ()
  extends cesiumLib.cesiumMod.CesiumNs.BaseLayerPickerViewModel {
  def this(options: cesiumLib.Anon_SelectedImageryProviderViewModel) = this()
  /* CompleteClass */
  override var buttonImageUrl: java.lang.String = js.native
  /* CompleteClass */
  override var buttonTooltip: java.lang.String = js.native
  /* CompleteClass */
  override var dropDownVisible: scala.Boolean = js.native
  /* CompleteClass */
  override var globe: cesiumLib.cesiumMod.CesiumNs.Globe = js.native
  /* CompleteClass */
  override var imageryProviderViewModels: js.Array[cesiumLib.cesiumMod.CesiumNs.ProviderViewModel] = js.native
  /* CompleteClass */
  override var selectedImagery: cesiumLib.cesiumMod.CesiumNs.ProviderViewModel = js.native
  /* CompleteClass */
  override var selectedTerrain: cesiumLib.cesiumMod.CesiumNs.ProviderViewModel = js.native
  /* CompleteClass */
  override var terrainProviderViewModels: js.Array[cesiumLib.cesiumMod.CesiumNs.ProviderViewModel] = js.native
  /* CompleteClass */
  override var toggleDropDown: cesiumLib.cesiumMod.CesiumNs.Command = js.native
}

