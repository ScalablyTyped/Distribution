package typings.bmapgl.BMapGL

import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DrawingToolOptions extends StObject {
  
  var anchor: js.UndefOr[ControlAnchor] = js.undefined
  
  var customContainer: js.UndefOr[String | HTMLElement] = js.undefined
  
  var drawingModes: js.UndefOr[js.Array[DrawingType]] = js.undefined
  
  var enableTips: js.UndefOr[Boolean] = js.undefined
  
  var hasCustomStyle: js.UndefOr[Boolean] = js.undefined
  
  var offset: js.UndefOr[Size] = js.undefined
  
  var scale: js.UndefOr[Double] = js.undefined
}
object DrawingToolOptions {
  
  inline def apply(): DrawingToolOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DrawingToolOptions]
  }
  
  extension [Self <: DrawingToolOptions](x: Self) {
    
    inline def setAnchor(value: ControlAnchor): Self = StObject.set(x, "anchor", value.asInstanceOf[js.Any])
    
    inline def setAnchorUndefined: Self = StObject.set(x, "anchor", js.undefined)
    
    inline def setCustomContainer(value: String | HTMLElement): Self = StObject.set(x, "customContainer", value.asInstanceOf[js.Any])
    
    inline def setCustomContainerUndefined: Self = StObject.set(x, "customContainer", js.undefined)
    
    inline def setDrawingModes(value: js.Array[DrawingType]): Self = StObject.set(x, "drawingModes", value.asInstanceOf[js.Any])
    
    inline def setDrawingModesUndefined: Self = StObject.set(x, "drawingModes", js.undefined)
    
    inline def setDrawingModesVarargs(value: DrawingType*): Self = StObject.set(x, "drawingModes", js.Array(value :_*))
    
    inline def setEnableTips(value: Boolean): Self = StObject.set(x, "enableTips", value.asInstanceOf[js.Any])
    
    inline def setEnableTipsUndefined: Self = StObject.set(x, "enableTips", js.undefined)
    
    inline def setHasCustomStyle(value: Boolean): Self = StObject.set(x, "hasCustomStyle", value.asInstanceOf[js.Any])
    
    inline def setHasCustomStyleUndefined: Self = StObject.set(x, "hasCustomStyle", js.undefined)
    
    inline def setOffset(value: Size): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    
    inline def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
    
    inline def setScale(value: Double): Self = StObject.set(x, "scale", value.asInstanceOf[js.Any])
    
    inline def setScaleUndefined: Self = StObject.set(x, "scale", js.undefined)
  }
}
