package typings.cesium.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClampToGround extends StObject {
  
  var clampToGround: js.UndefOr[Boolean] = js.undefined
  
  var fill: js.UndefOr[typings.cesium.mod.Color] = js.undefined
  
  var markerColor: js.UndefOr[typings.cesium.mod.Color] = js.undefined
  
  var markerSize: js.UndefOr[Double] = js.undefined
  
  var markerSymbol: js.UndefOr[String] = js.undefined
  
  var sourceUri: js.UndefOr[String] = js.undefined
  
  var stroke: js.UndefOr[typings.cesium.mod.Color] = js.undefined
  
  var strokeWidth: js.UndefOr[Double] = js.undefined
}
object ClampToGround {
  
  inline def apply(): ClampToGround = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClampToGround]
  }
  
  extension [Self <: ClampToGround](x: Self) {
    
    inline def setClampToGround(value: Boolean): Self = StObject.set(x, "clampToGround", value.asInstanceOf[js.Any])
    
    inline def setClampToGroundUndefined: Self = StObject.set(x, "clampToGround", js.undefined)
    
    inline def setFill(value: typings.cesium.mod.Color): Self = StObject.set(x, "fill", value.asInstanceOf[js.Any])
    
    inline def setFillUndefined: Self = StObject.set(x, "fill", js.undefined)
    
    inline def setMarkerColor(value: typings.cesium.mod.Color): Self = StObject.set(x, "markerColor", value.asInstanceOf[js.Any])
    
    inline def setMarkerColorUndefined: Self = StObject.set(x, "markerColor", js.undefined)
    
    inline def setMarkerSize(value: Double): Self = StObject.set(x, "markerSize", value.asInstanceOf[js.Any])
    
    inline def setMarkerSizeUndefined: Self = StObject.set(x, "markerSize", js.undefined)
    
    inline def setMarkerSymbol(value: String): Self = StObject.set(x, "markerSymbol", value.asInstanceOf[js.Any])
    
    inline def setMarkerSymbolUndefined: Self = StObject.set(x, "markerSymbol", js.undefined)
    
    inline def setSourceUri(value: String): Self = StObject.set(x, "sourceUri", value.asInstanceOf[js.Any])
    
    inline def setSourceUriUndefined: Self = StObject.set(x, "sourceUri", js.undefined)
    
    inline def setStroke(value: typings.cesium.mod.Color): Self = StObject.set(x, "stroke", value.asInstanceOf[js.Any])
    
    inline def setStrokeUndefined: Self = StObject.set(x, "stroke", js.undefined)
    
    inline def setStrokeWidth(value: Double): Self = StObject.set(x, "strokeWidth", value.asInstanceOf[js.Any])
    
    inline def setStrokeWidthUndefined: Self = StObject.set(x, "strokeWidth", js.undefined)
  }
}
