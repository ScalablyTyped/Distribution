package typings.cesium.anon

import typings.cesium.mod.Command
import typings.cesium.mod.ImageryProvider
import typings.cesium.mod.ProviderViewModel.CreationFunction
import typings.cesium.mod.TerrainProvider
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Category extends StObject {
  
  var category: js.UndefOr[String] = js.undefined
  
  var creationFunction: CreationFunction | Command
  
  var iconUrl: String
  
  var name: String
  
  var tooltip: String
}
object Category {
  
  inline def apply(creationFunction: CreationFunction | Command, iconUrl: String, name: String, tooltip: String): Category = {
    val __obj = js.Dynamic.literal(creationFunction = creationFunction.asInstanceOf[js.Any], iconUrl = iconUrl.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], tooltip = tooltip.asInstanceOf[js.Any])
    __obj.asInstanceOf[Category]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Category] (val x: Self) extends AnyVal {
    
    inline def setCategory(value: String): Self = StObject.set(x, "category", value.asInstanceOf[js.Any])
    
    inline def setCategoryUndefined: Self = StObject.set(x, "category", js.undefined)
    
    inline def setCreationFunction(value: CreationFunction | Command): Self = StObject.set(x, "creationFunction", value.asInstanceOf[js.Any])
    
    inline def setCreationFunctionFunction0(
      value: () => ImageryProvider | TerrainProvider | (js.Array[ImageryProvider | TerrainProvider]) | (js.Promise[js.Array[TerrainProvider] | TerrainProvider])
    ): Self = StObject.set(x, "creationFunction", js.Any.fromFunction0(value))
    
    inline def setIconUrl(value: String): Self = StObject.set(x, "iconUrl", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setTooltip(value: String): Self = StObject.set(x, "tooltip", value.asInstanceOf[js.Any])
  }
}
