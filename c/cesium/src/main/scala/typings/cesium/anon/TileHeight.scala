package typings.cesium.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TileHeight extends StObject {
  
  var color: js.UndefOr[typings.cesium.mod.Color] = js.undefined
  
  var ellipsoid: js.UndefOr[typings.cesium.mod.Ellipsoid] = js.undefined
  
  var tileHeight: js.UndefOr[Double] = js.undefined
  
  var tileWidth: js.UndefOr[Double] = js.undefined
  
  var tilingScheme: js.UndefOr[typings.cesium.mod.TilingScheme] = js.undefined
}
object TileHeight {
  
  inline def apply(): TileHeight = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TileHeight]
  }
  
  extension [Self <: TileHeight](x: Self) {
    
    inline def setColor(value: typings.cesium.mod.Color): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    inline def setEllipsoid(value: typings.cesium.mod.Ellipsoid): Self = StObject.set(x, "ellipsoid", value.asInstanceOf[js.Any])
    
    inline def setEllipsoidUndefined: Self = StObject.set(x, "ellipsoid", js.undefined)
    
    inline def setTileHeight(value: Double): Self = StObject.set(x, "tileHeight", value.asInstanceOf[js.Any])
    
    inline def setTileHeightUndefined: Self = StObject.set(x, "tileHeight", js.undefined)
    
    inline def setTileWidth(value: Double): Self = StObject.set(x, "tileWidth", value.asInstanceOf[js.Any])
    
    inline def setTileWidthUndefined: Self = StObject.set(x, "tileWidth", js.undefined)
    
    inline def setTilingScheme(value: typings.cesium.mod.TilingScheme): Self = StObject.set(x, "tilingScheme", value.asInstanceOf[js.Any])
    
    inline def setTilingSchemeUndefined: Self = StObject.set(x, "tilingScheme", js.undefined)
  }
}
