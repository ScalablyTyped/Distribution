package typings.bmapgl.BMapGL

import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RenderOptions extends StObject {
  
  var autoViewport: js.UndefOr[Boolean] = js.undefined
  
  var highlightMode: js.UndefOr[HighlightModes] = js.undefined
  
  var map: Map
  
  var panel: js.UndefOr[String | HTMLElement] = js.undefined
  
  var selectFirstResult: js.UndefOr[Boolean] = js.undefined
}
object RenderOptions {
  
  inline def apply(map: Map): RenderOptions = {
    val __obj = js.Dynamic.literal(map = map.asInstanceOf[js.Any])
    __obj.asInstanceOf[RenderOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RenderOptions] (val x: Self) extends AnyVal {
    
    inline def setAutoViewport(value: Boolean): Self = StObject.set(x, "autoViewport", value.asInstanceOf[js.Any])
    
    inline def setAutoViewportUndefined: Self = StObject.set(x, "autoViewport", js.undefined)
    
    inline def setHighlightMode(value: HighlightModes): Self = StObject.set(x, "highlightMode", value.asInstanceOf[js.Any])
    
    inline def setHighlightModeUndefined: Self = StObject.set(x, "highlightMode", js.undefined)
    
    inline def setMap(value: Map): Self = StObject.set(x, "map", value.asInstanceOf[js.Any])
    
    inline def setPanel(value: String | HTMLElement): Self = StObject.set(x, "panel", value.asInstanceOf[js.Any])
    
    inline def setPanelUndefined: Self = StObject.set(x, "panel", js.undefined)
    
    inline def setSelectFirstResult(value: Boolean): Self = StObject.set(x, "selectFirstResult", value.asInstanceOf[js.Any])
    
    inline def setSelectFirstResultUndefined: Self = StObject.set(x, "selectFirstResult", js.undefined)
  }
}
