package typings.baidumapWebSdk.BMap

import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RenderOptions extends StObject {
  
  var autoViewport: js.UndefOr[Boolean] = js.native
  
  var highlightMode: js.UndefOr[HighlightModes] = js.native
  
  var map: Map = js.native
  
  var panel: js.UndefOr[String | HTMLElement] = js.native
  
  var selectFirstResult: js.UndefOr[Boolean] = js.native
}
object RenderOptions {
  
  @scala.inline
  def apply(map: Map): RenderOptions = {
    val __obj = js.Dynamic.literal(map = map.asInstanceOf[js.Any])
    __obj.asInstanceOf[RenderOptions]
  }
  
  @scala.inline
  implicit class RenderOptionsMutableBuilder[Self <: RenderOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAutoViewport(value: Boolean): Self = StObject.set(x, "autoViewport", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoViewportUndefined: Self = StObject.set(x, "autoViewport", js.undefined)
    
    @scala.inline
    def setHighlightMode(value: HighlightModes): Self = StObject.set(x, "highlightMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHighlightModeUndefined: Self = StObject.set(x, "highlightMode", js.undefined)
    
    @scala.inline
    def setMap(value: Map): Self = StObject.set(x, "map", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPanel(value: String | HTMLElement): Self = StObject.set(x, "panel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPanelUndefined: Self = StObject.set(x, "panel", js.undefined)
    
    @scala.inline
    def setSelectFirstResult(value: Boolean): Self = StObject.set(x, "selectFirstResult", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectFirstResultUndefined: Self = StObject.set(x, "selectFirstResult", js.undefined)
  }
}
