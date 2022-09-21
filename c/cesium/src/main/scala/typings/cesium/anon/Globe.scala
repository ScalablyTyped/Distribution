package typings.cesium.anon

import typings.cesium.mod.ProviderViewModel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Globe extends StObject {
  
  var globe: typings.cesium.mod.Globe
  
  var imageryProviderViewModels: js.UndefOr[js.Array[ProviderViewModel]] = js.undefined
  
  var selectedImageryProviderViewModel: js.UndefOr[ProviderViewModel] = js.undefined
  
  var selectedTerrainProviderViewModel: js.UndefOr[ProviderViewModel] = js.undefined
  
  var terrainProviderViewModels: js.UndefOr[js.Array[ProviderViewModel]] = js.undefined
}
object Globe {
  
  inline def apply(globe: typings.cesium.mod.Globe): Globe = {
    val __obj = js.Dynamic.literal(globe = globe.asInstanceOf[js.Any])
    __obj.asInstanceOf[Globe]
  }
  
  extension [Self <: Globe](x: Self) {
    
    inline def setGlobe(value: typings.cesium.mod.Globe): Self = StObject.set(x, "globe", value.asInstanceOf[js.Any])
    
    inline def setImageryProviderViewModels(value: js.Array[ProviderViewModel]): Self = StObject.set(x, "imageryProviderViewModels", value.asInstanceOf[js.Any])
    
    inline def setImageryProviderViewModelsUndefined: Self = StObject.set(x, "imageryProviderViewModels", js.undefined)
    
    inline def setImageryProviderViewModelsVarargs(value: ProviderViewModel*): Self = StObject.set(x, "imageryProviderViewModels", js.Array(value*))
    
    inline def setSelectedImageryProviderViewModel(value: ProviderViewModel): Self = StObject.set(x, "selectedImageryProviderViewModel", value.asInstanceOf[js.Any])
    
    inline def setSelectedImageryProviderViewModelUndefined: Self = StObject.set(x, "selectedImageryProviderViewModel", js.undefined)
    
    inline def setSelectedTerrainProviderViewModel(value: ProviderViewModel): Self = StObject.set(x, "selectedTerrainProviderViewModel", value.asInstanceOf[js.Any])
    
    inline def setSelectedTerrainProviderViewModelUndefined: Self = StObject.set(x, "selectedTerrainProviderViewModel", js.undefined)
    
    inline def setTerrainProviderViewModels(value: js.Array[ProviderViewModel]): Self = StObject.set(x, "terrainProviderViewModels", value.asInstanceOf[js.Any])
    
    inline def setTerrainProviderViewModelsUndefined: Self = StObject.set(x, "terrainProviderViewModels", js.undefined)
    
    inline def setTerrainProviderViewModelsVarargs(value: ProviderViewModel*): Self = StObject.set(x, "terrainProviderViewModels", js.Array(value*))
  }
}
