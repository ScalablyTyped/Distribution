package typings.cesium.anon

import typings.cesium.mod.ProviderViewModel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Globe extends js.Object {
  
  var globe: typings.cesium.mod.Globe = js.native
  
  var imageryProviderViewModels: js.UndefOr[js.Array[ProviderViewModel]] = js.native
  
  var selectedImageryProviderViewModel: js.UndefOr[ProviderViewModel] = js.native
  
  var selectedTerrainProviderViewModel: js.UndefOr[ProviderViewModel] = js.native
  
  var terrainProviderViewModels: js.UndefOr[js.Array[ProviderViewModel]] = js.native
}
object Globe {
  
  @scala.inline
  def apply(globe: typings.cesium.mod.Globe): Globe = {
    val __obj = js.Dynamic.literal(globe = globe.asInstanceOf[js.Any])
    __obj.asInstanceOf[Globe]
  }
  
  @scala.inline
  implicit class GlobeOps[Self <: Globe] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setGlobe(value: typings.cesium.mod.Globe): Self = this.set("globe", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImageryProviderViewModelsVarargs(value: ProviderViewModel*): Self = this.set("imageryProviderViewModels", js.Array(value :_*))
    
    @scala.inline
    def setImageryProviderViewModels(value: js.Array[ProviderViewModel]): Self = this.set("imageryProviderViewModels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteImageryProviderViewModels: Self = this.set("imageryProviderViewModels", js.undefined)
    
    @scala.inline
    def setSelectedImageryProviderViewModel(value: ProviderViewModel): Self = this.set("selectedImageryProviderViewModel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSelectedImageryProviderViewModel: Self = this.set("selectedImageryProviderViewModel", js.undefined)
    
    @scala.inline
    def setSelectedTerrainProviderViewModel(value: ProviderViewModel): Self = this.set("selectedTerrainProviderViewModel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSelectedTerrainProviderViewModel: Self = this.set("selectedTerrainProviderViewModel", js.undefined)
    
    @scala.inline
    def setTerrainProviderViewModelsVarargs(value: ProviderViewModel*): Self = this.set("terrainProviderViewModels", js.Array(value :_*))
    
    @scala.inline
    def setTerrainProviderViewModels(value: js.Array[ProviderViewModel]): Self = this.set("terrainProviderViewModels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTerrainProviderViewModels: Self = this.set("terrainProviderViewModels", js.undefined)
  }
}
