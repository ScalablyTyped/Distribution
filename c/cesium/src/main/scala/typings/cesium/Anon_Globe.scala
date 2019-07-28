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
    val __obj = js.Dynamic.literal(globe = globe)
    if (imageryProviderViewModels != null) __obj.updateDynamic("imageryProviderViewModels")(imageryProviderViewModels)
    if (selectedImageryProviderViewModel != null) __obj.updateDynamic("selectedImageryProviderViewModel")(selectedImageryProviderViewModel)
    if (selectedTerrainProviderViewModel != null) __obj.updateDynamic("selectedTerrainProviderViewModel")(selectedTerrainProviderViewModel)
    if (terrainProviderViewModels != null) __obj.updateDynamic("terrainProviderViewModels")(terrainProviderViewModels)
    __obj.asInstanceOf[Anon_Globe]
  }
}

