package typings.csstype.mod.AtRule

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Viewport[TLength, TTime] extends StObject {
  
  var height: js.UndefOr[Height[TLength]] = js.undefined
  
  var maxHeight: js.UndefOr[MaxHeight[TLength]] = js.undefined
  
  var maxWidth: js.UndefOr[MaxWidth[TLength]] = js.undefined
  
  var maxZoom: js.UndefOr[MaxZoom] = js.undefined
  
  var minHeight: js.UndefOr[MinHeight[TLength]] = js.undefined
  
  var minWidth: js.UndefOr[MinWidth[TLength]] = js.undefined
  
  var minZoom: js.UndefOr[MinZoom] = js.undefined
  
  var orientation: js.UndefOr[Orientation] = js.undefined
  
  var userZoom: js.UndefOr[UserZoom] = js.undefined
  
  var viewportFit: js.UndefOr[ViewportFit] = js.undefined
  
  var width: js.UndefOr[Width[TLength]] = js.undefined
  
  var zoom: js.UndefOr[Zoom] = js.undefined
}
object Viewport {
  
  inline def apply[TLength, TTime](): Viewport[TLength, TTime] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Viewport[TLength, TTime]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Viewport[?, ?], TLength, TTime] (val x: Self & (Viewport[TLength, TTime])) extends AnyVal {
    
    inline def setHeight(value: Height[TLength]): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    inline def setMaxHeight(value: MaxHeight[TLength]): Self = StObject.set(x, "maxHeight", value.asInstanceOf[js.Any])
    
    inline def setMaxHeightUndefined: Self = StObject.set(x, "maxHeight", js.undefined)
    
    inline def setMaxWidth(value: MaxWidth[TLength]): Self = StObject.set(x, "maxWidth", value.asInstanceOf[js.Any])
    
    inline def setMaxWidthUndefined: Self = StObject.set(x, "maxWidth", js.undefined)
    
    inline def setMaxZoom(value: MaxZoom): Self = StObject.set(x, "maxZoom", value.asInstanceOf[js.Any])
    
    inline def setMaxZoomUndefined: Self = StObject.set(x, "maxZoom", js.undefined)
    
    inline def setMinHeight(value: MinHeight[TLength]): Self = StObject.set(x, "minHeight", value.asInstanceOf[js.Any])
    
    inline def setMinHeightUndefined: Self = StObject.set(x, "minHeight", js.undefined)
    
    inline def setMinWidth(value: MinWidth[TLength]): Self = StObject.set(x, "minWidth", value.asInstanceOf[js.Any])
    
    inline def setMinWidthUndefined: Self = StObject.set(x, "minWidth", js.undefined)
    
    inline def setMinZoom(value: MinZoom): Self = StObject.set(x, "minZoom", value.asInstanceOf[js.Any])
    
    inline def setMinZoomUndefined: Self = StObject.set(x, "minZoom", js.undefined)
    
    inline def setOrientation(value: Orientation): Self = StObject.set(x, "orientation", value.asInstanceOf[js.Any])
    
    inline def setOrientationUndefined: Self = StObject.set(x, "orientation", js.undefined)
    
    inline def setUserZoom(value: UserZoom): Self = StObject.set(x, "userZoom", value.asInstanceOf[js.Any])
    
    inline def setUserZoomUndefined: Self = StObject.set(x, "userZoom", js.undefined)
    
    inline def setViewportFit(value: ViewportFit): Self = StObject.set(x, "viewportFit", value.asInstanceOf[js.Any])
    
    inline def setViewportFitUndefined: Self = StObject.set(x, "viewportFit", js.undefined)
    
    inline def setWidth(value: Width[TLength]): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    
    inline def setZoom(value: Zoom): Self = StObject.set(x, "zoom", value.asInstanceOf[js.Any])
    
    inline def setZoomUndefined: Self = StObject.set(x, "zoom", js.undefined)
  }
}
