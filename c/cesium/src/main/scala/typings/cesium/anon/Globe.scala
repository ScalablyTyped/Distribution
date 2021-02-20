package typings.cesium.anon

import typings.cesium.mod.ProviderViewModel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Globe extends StObject {
  
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
  implicit class GlobeMutableBuilder[Self <: Globe] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGlobe(value: typings.cesium.mod.Globe): Self = StObject.set(x, "globe", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImageryProviderViewModels(value: js.Array[ProviderViewModel]): Self = StObject.set(x, "imageryProviderViewModels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImageryProviderViewModelsUndefined: Self = StObject.set(x, "imageryProviderViewModels", js.undefined)
    
    @scala.inline
    def setImageryProviderViewModelsVarargs(value: ProviderViewModel*): Self = StObject.set(x, "imageryProviderViewModels", js.Array(value :_*))
    
    @scala.inline
    def setSelectedImageryProviderViewModel(value: ProviderViewModel): Self = StObject.set(x, "selectedImageryProviderViewModel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectedImageryProviderViewModelUndefined: Self = StObject.set(x, "selectedImageryProviderViewModel", js.undefined)
    
    @scala.inline
    def setSelectedTerrainProviderViewModel(value: ProviderViewModel): Self = StObject.set(x, "selectedTerrainProviderViewModel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectedTerrainProviderViewModelUndefined: Self = StObject.set(x, "selectedTerrainProviderViewModel", js.undefined)
    
    @scala.inline
    def setTerrainProviderViewModels(value: js.Array[ProviderViewModel]): Self = StObject.set(x, "terrainProviderViewModels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTerrainProviderViewModelsUndefined: Self = StObject.set(x, "terrainProviderViewModels", js.undefined)
    
    @scala.inline
    def setTerrainProviderViewModelsVarargs(value: ProviderViewModel*): Self = StObject.set(x, "terrainProviderViewModels", js.Array(value :_*))
  }
}
