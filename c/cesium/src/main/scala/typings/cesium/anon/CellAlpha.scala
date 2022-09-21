package typings.cesium.anon

import typings.cesium.mod.Cartesian2
import typings.cesium.mod.Property
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CellAlpha extends StObject {
  
  var cellAlpha: js.UndefOr[Property | Double] = js.undefined
  
  var color: js.UndefOr[Property | typings.cesium.mod.Color] = js.undefined
  
  var lineCount: js.UndefOr[Property | Cartesian2] = js.undefined
  
  var lineOffset: js.UndefOr[Property | Cartesian2] = js.undefined
  
  var lineThickness: js.UndefOr[Property | Cartesian2] = js.undefined
}
object CellAlpha {
  
  inline def apply(): CellAlpha = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CellAlpha]
  }
  
  extension [Self <: CellAlpha](x: Self) {
    
    inline def setCellAlpha(value: Property | Double): Self = StObject.set(x, "cellAlpha", value.asInstanceOf[js.Any])
    
    inline def setCellAlphaUndefined: Self = StObject.set(x, "cellAlpha", js.undefined)
    
    inline def setColor(value: Property | typings.cesium.mod.Color): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    inline def setLineCount(value: Property | Cartesian2): Self = StObject.set(x, "lineCount", value.asInstanceOf[js.Any])
    
    inline def setLineCountUndefined: Self = StObject.set(x, "lineCount", js.undefined)
    
    inline def setLineOffset(value: Property | Cartesian2): Self = StObject.set(x, "lineOffset", value.asInstanceOf[js.Any])
    
    inline def setLineOffsetUndefined: Self = StObject.set(x, "lineOffset", js.undefined)
    
    inline def setLineThickness(value: Property | Cartesian2): Self = StObject.set(x, "lineThickness", value.asInstanceOf[js.Any])
    
    inline def setLineThicknessUndefined: Self = StObject.set(x, "lineThickness", js.undefined)
  }
}
