package typings.cesium.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CanvasSize extends StObject {
  
  var canvasSize: js.UndefOr[Double] = js.undefined
  
  var cells: js.UndefOr[Double] = js.undefined
  
  var color: js.UndefOr[typings.cesium.mod.Color] = js.undefined
  
  var ellipsoid: js.UndefOr[typings.cesium.mod.Ellipsoid] = js.undefined
  
  var glowColor: js.UndefOr[typings.cesium.mod.Color] = js.undefined
  
  var glowWidth: js.UndefOr[Double] = js.undefined
  
  var tileHeight: js.UndefOr[Double] = js.undefined
  
  var tileWidth: js.UndefOr[Double] = js.undefined
  
  var tilingScheme: js.UndefOr[typings.cesium.mod.TilingScheme] = js.undefined
}
object CanvasSize {
  
  inline def apply(): CanvasSize = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CanvasSize]
  }
  
  extension [Self <: CanvasSize](x: Self) {
    
    inline def setCanvasSize(value: Double): Self = StObject.set(x, "canvasSize", value.asInstanceOf[js.Any])
    
    inline def setCanvasSizeUndefined: Self = StObject.set(x, "canvasSize", js.undefined)
    
    inline def setCells(value: Double): Self = StObject.set(x, "cells", value.asInstanceOf[js.Any])
    
    inline def setCellsUndefined: Self = StObject.set(x, "cells", js.undefined)
    
    inline def setColor(value: typings.cesium.mod.Color): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    inline def setEllipsoid(value: typings.cesium.mod.Ellipsoid): Self = StObject.set(x, "ellipsoid", value.asInstanceOf[js.Any])
    
    inline def setEllipsoidUndefined: Self = StObject.set(x, "ellipsoid", js.undefined)
    
    inline def setGlowColor(value: typings.cesium.mod.Color): Self = StObject.set(x, "glowColor", value.asInstanceOf[js.Any])
    
    inline def setGlowColorUndefined: Self = StObject.set(x, "glowColor", js.undefined)
    
    inline def setGlowWidth(value: Double): Self = StObject.set(x, "glowWidth", value.asInstanceOf[js.Any])
    
    inline def setGlowWidthUndefined: Self = StObject.set(x, "glowWidth", js.undefined)
    
    inline def setTileHeight(value: Double): Self = StObject.set(x, "tileHeight", value.asInstanceOf[js.Any])
    
    inline def setTileHeightUndefined: Self = StObject.set(x, "tileHeight", js.undefined)
    
    inline def setTileWidth(value: Double): Self = StObject.set(x, "tileWidth", value.asInstanceOf[js.Any])
    
    inline def setTileWidthUndefined: Self = StObject.set(x, "tileWidth", js.undefined)
    
    inline def setTilingScheme(value: typings.cesium.mod.TilingScheme): Self = StObject.set(x, "tilingScheme", value.asInstanceOf[js.Any])
    
    inline def setTilingSchemeUndefined: Self = StObject.set(x, "tilingScheme", js.undefined)
  }
}
