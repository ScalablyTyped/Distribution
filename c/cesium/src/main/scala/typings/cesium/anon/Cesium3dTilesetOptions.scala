package typings.cesium.anon

import typings.cesium.mod.ArcGISTiledElevationTerrainProvider
import typings.cesium.mod.Resource
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Cesium3dTilesetOptions extends StObject {
  
  var cesium3dTilesetOptions: js.UndefOr[Any] = js.undefined
  
  var geoidTiledTerrainProvider: js.UndefOr[ArcGISTiledElevationTerrainProvider] = js.undefined
  
  var name: js.UndefOr[String] = js.undefined
  
  var show: js.UndefOr[Boolean] = js.undefined
  
  var traceFetches: js.UndefOr[Boolean] = js.undefined
  
  var url: Resource | String
}
object Cesium3dTilesetOptions {
  
  inline def apply(url: Resource | String): Cesium3dTilesetOptions = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[Cesium3dTilesetOptions]
  }
  
  extension [Self <: Cesium3dTilesetOptions](x: Self) {
    
    inline def setCesium3dTilesetOptions(value: Any): Self = StObject.set(x, "cesium3dTilesetOptions", value.asInstanceOf[js.Any])
    
    inline def setCesium3dTilesetOptionsUndefined: Self = StObject.set(x, "cesium3dTilesetOptions", js.undefined)
    
    inline def setGeoidTiledTerrainProvider(value: ArcGISTiledElevationTerrainProvider): Self = StObject.set(x, "geoidTiledTerrainProvider", value.asInstanceOf[js.Any])
    
    inline def setGeoidTiledTerrainProviderUndefined: Self = StObject.set(x, "geoidTiledTerrainProvider", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setShow(value: Boolean): Self = StObject.set(x, "show", value.asInstanceOf[js.Any])
    
    inline def setShowUndefined: Self = StObject.set(x, "show", js.undefined)
    
    inline def setTraceFetches(value: Boolean): Self = StObject.set(x, "traceFetches", value.asInstanceOf[js.Any])
    
    inline def setTraceFetchesUndefined: Self = StObject.set(x, "traceFetches", js.undefined)
    
    inline def setUrl(value: Resource | String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
