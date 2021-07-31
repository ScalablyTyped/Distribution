package typings.baidumapWebSdk.BMap

import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MapPanes extends StObject {
  
  var floatPane: js.UndefOr[HTMLElement] = js.undefined
  
  var floatShadow: js.UndefOr[HTMLElement] = js.undefined
  
  var labelPane: js.UndefOr[HTMLElement] = js.undefined
  
  var mapPane: js.UndefOr[HTMLElement] = js.undefined
  
  var markerMouseTarget: js.UndefOr[HTMLElement] = js.undefined
  
  var markerPane: js.UndefOr[HTMLElement] = js.undefined
  
  var markerShadow: js.UndefOr[HTMLElement] = js.undefined
}
object MapPanes {
  
  @scala.inline
  def apply(): MapPanes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MapPanes]
  }
  
  @scala.inline
  implicit class MapPanesMutableBuilder[Self <: MapPanes] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFloatPane(value: HTMLElement): Self = StObject.set(x, "floatPane", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFloatPaneUndefined: Self = StObject.set(x, "floatPane", js.undefined)
    
    @scala.inline
    def setFloatShadow(value: HTMLElement): Self = StObject.set(x, "floatShadow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFloatShadowUndefined: Self = StObject.set(x, "floatShadow", js.undefined)
    
    @scala.inline
    def setLabelPane(value: HTMLElement): Self = StObject.set(x, "labelPane", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelPaneUndefined: Self = StObject.set(x, "labelPane", js.undefined)
    
    @scala.inline
    def setMapPane(value: HTMLElement): Self = StObject.set(x, "mapPane", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMapPaneUndefined: Self = StObject.set(x, "mapPane", js.undefined)
    
    @scala.inline
    def setMarkerMouseTarget(value: HTMLElement): Self = StObject.set(x, "markerMouseTarget", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMarkerMouseTargetUndefined: Self = StObject.set(x, "markerMouseTarget", js.undefined)
    
    @scala.inline
    def setMarkerPane(value: HTMLElement): Self = StObject.set(x, "markerPane", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMarkerPaneUndefined: Self = StObject.set(x, "markerPane", js.undefined)
    
    @scala.inline
    def setMarkerShadow(value: HTMLElement): Self = StObject.set(x, "markerShadow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMarkerShadowUndefined: Self = StObject.set(x, "markerShadow", js.undefined)
  }
}
