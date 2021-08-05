package typings.cesium.anon

import typings.cesium.mod.Property
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CellAlpha extends StObject {
  
  var cellAlpha: js.UndefOr[Property] = js.undefined
  
  var color: js.UndefOr[Property] = js.undefined
  
  var lineCount: js.UndefOr[Property] = js.undefined
  
  var lineOffset: js.UndefOr[Property] = js.undefined
  
  var lineThickness: js.UndefOr[Property] = js.undefined
}
object CellAlpha {
  
  inline def apply(): CellAlpha = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CellAlpha]
  }
  
  extension [Self <: CellAlpha](x: Self) {
    
    inline def setCellAlpha(value: Property): Self = StObject.set(x, "cellAlpha", value.asInstanceOf[js.Any])
    
    inline def setCellAlphaUndefined: Self = StObject.set(x, "cellAlpha", js.undefined)
    
    inline def setColor(value: Property): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    inline def setLineCount(value: Property): Self = StObject.set(x, "lineCount", value.asInstanceOf[js.Any])
    
    inline def setLineCountUndefined: Self = StObject.set(x, "lineCount", js.undefined)
    
    inline def setLineOffset(value: Property): Self = StObject.set(x, "lineOffset", value.asInstanceOf[js.Any])
    
    inline def setLineOffsetUndefined: Self = StObject.set(x, "lineOffset", js.undefined)
    
    inline def setLineThickness(value: Property): Self = StObject.set(x, "lineThickness", value.asInstanceOf[js.Any])
    
    inline def setLineThicknessUndefined: Self = StObject.set(x, "lineThickness", js.undefined)
  }
}
