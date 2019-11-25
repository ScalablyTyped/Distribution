package typings.cesium

import typings.cesium.cesiumMod.Globe
import typings.cesium.cesiumMod.ProviderViewModel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Globe extends js.Object {
  var globe: Globe
  var imageryProviderViewModels: js.UndefOr[js.Array[ProviderViewModel]] = js.undefined
  var selectedImageryProviderViewModel: js.UndefOr[ProviderViewModel] = js.undefined
  var selectedTerrainProviderViewModel: js.UndefOr[ProviderViewModel] = js.undefined
  var terrainProviderViewModels: js.UndefOr[js.Array[ProviderViewModel]] = js.undefined
}

object Anon_Globe {
  @scala.inline
  def apply(
    globe: Globe,
    imageryProviderViewModels: js.Array[ProviderViewModel] = null,
    selectedImageryProviderViewModel: ProviderViewModel = null,
    selectedTerrainProviderViewModel: ProviderViewModel = null,
    terrainProviderViewModels: js.Array[ProviderViewModel] = null
  ): Anon_Globe = {
    val __obj = js.Dynamic.literal(globe = globe.asInstanceOf[js.Any])
    if (imageryProviderViewModels != null) __obj.updateDynamic("imageryProviderViewModels")(imageryProviderViewModels.asInstanceOf[js.Any])
    if (selectedImageryProviderViewModel != null) __obj.updateDynamic("selectedImageryProviderViewModel")(selectedImageryProviderViewModel.asInstanceOf[js.Any])
    if (selectedTerrainProviderViewModel != null) __obj.updateDynamic("selectedTerrainProviderViewModel")(selectedTerrainProviderViewModel.asInstanceOf[js.Any])
    if (terrainProviderViewModels != null) __obj.updateDynamic("terrainProviderViewModels")(terrainProviderViewModels.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Globe]
  }
}

