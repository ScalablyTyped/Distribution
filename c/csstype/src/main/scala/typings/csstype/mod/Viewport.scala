package typings.csstype.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Viewport[TLength] extends StObject {
  
  var OOrientation: js.UndefOr[ViewportOrientationProperty] = js.undefined
  
  var height: js.UndefOr[ViewportHeightProperty[TLength]] = js.undefined
  
  var maxHeight: js.UndefOr[ViewportMaxHeightProperty[TLength]] = js.undefined
  
  var maxWidth: js.UndefOr[ViewportMaxWidthProperty[TLength]] = js.undefined
  
  var maxZoom: js.UndefOr[ViewportMaxZoomProperty] = js.undefined
  
  var minHeight: js.UndefOr[ViewportMinHeightProperty[TLength]] = js.undefined
  
  var minWidth: js.UndefOr[ViewportMinWidthProperty[TLength]] = js.undefined
  
  var minZoom: js.UndefOr[ViewportMinZoomProperty] = js.undefined
  
  var msHeight: js.UndefOr[ViewportHeightProperty[TLength]] = js.undefined
  
  var msMaxHeight: js.UndefOr[ViewportMaxHeightProperty[TLength]] = js.undefined
  
  var msMaxWidth: js.UndefOr[ViewportMaxWidthProperty[TLength]] = js.undefined
  
  var msMaxZoom: js.UndefOr[ViewportMaxZoomProperty] = js.undefined
  
  var msMinHeight: js.UndefOr[ViewportMinHeightProperty[TLength]] = js.undefined
  
  var msMinWidth: js.UndefOr[ViewportMinWidthProperty[TLength]] = js.undefined
  
  var msMinZoom: js.UndefOr[ViewportMinZoomProperty] = js.undefined
  
  var msOrientation: js.UndefOr[ViewportOrientationProperty] = js.undefined
  
  var msUserZoom: js.UndefOr[ViewportUserZoomProperty] = js.undefined
  
  var msWidth: js.UndefOr[ViewportWidthProperty[TLength]] = js.undefined
  
  var msZoom: js.UndefOr[ViewportZoomProperty] = js.undefined
  
  var orientation: js.UndefOr[ViewportOrientationProperty] = js.undefined
  
  var userZoom: js.UndefOr[ViewportUserZoomProperty] = js.undefined
  
  var width: js.UndefOr[ViewportWidthProperty[TLength]] = js.undefined
  
  var zoom: js.UndefOr[ViewportZoomProperty] = js.undefined
}
object Viewport {
  
  @scala.inline
  def apply[TLength](): Viewport[TLength] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Viewport[TLength]]
  }
  
  @scala.inline
  implicit class ViewportMutableBuilder[Self <: Viewport[?], TLength] (val x: Self & Viewport[TLength]) extends AnyVal {
    
    @scala.inline
    def setHeight(value: ViewportHeightProperty[TLength]): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    @scala.inline
    def setMaxHeight(value: ViewportMaxHeightProperty[TLength]): Self = StObject.set(x, "maxHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxHeightUndefined: Self = StObject.set(x, "maxHeight", js.undefined)
    
    @scala.inline
    def setMaxWidth(value: ViewportMaxWidthProperty[TLength]): Self = StObject.set(x, "maxWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxWidthUndefined: Self = StObject.set(x, "maxWidth", js.undefined)
    
    @scala.inline
    def setMaxZoom(value: ViewportMaxZoomProperty): Self = StObject.set(x, "maxZoom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxZoomUndefined: Self = StObject.set(x, "maxZoom", js.undefined)
    
    @scala.inline
    def setMinHeight(value: ViewportMinHeightProperty[TLength]): Self = StObject.set(x, "minHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinHeightUndefined: Self = StObject.set(x, "minHeight", js.undefined)
    
    @scala.inline
    def setMinWidth(value: ViewportMinWidthProperty[TLength]): Self = StObject.set(x, "minWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinWidthUndefined: Self = StObject.set(x, "minWidth", js.undefined)
    
    @scala.inline
    def setMinZoom(value: ViewportMinZoomProperty): Self = StObject.set(x, "minZoom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinZoomUndefined: Self = StObject.set(x, "minZoom", js.undefined)
    
    @scala.inline
    def setMsHeight(value: ViewportHeightProperty[TLength]): Self = StObject.set(x, "msHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMsHeightUndefined: Self = StObject.set(x, "msHeight", js.undefined)
    
    @scala.inline
    def setMsMaxHeight(value: ViewportMaxHeightProperty[TLength]): Self = StObject.set(x, "msMaxHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMsMaxHeightUndefined: Self = StObject.set(x, "msMaxHeight", js.undefined)
    
    @scala.inline
    def setMsMaxWidth(value: ViewportMaxWidthProperty[TLength]): Self = StObject.set(x, "msMaxWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMsMaxWidthUndefined: Self = StObject.set(x, "msMaxWidth", js.undefined)
    
    @scala.inline
    def setMsMaxZoom(value: ViewportMaxZoomProperty): Self = StObject.set(x, "msMaxZoom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMsMaxZoomUndefined: Self = StObject.set(x, "msMaxZoom", js.undefined)
    
    @scala.inline
    def setMsMinHeight(value: ViewportMinHeightProperty[TLength]): Self = StObject.set(x, "msMinHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMsMinHeightUndefined: Self = StObject.set(x, "msMinHeight", js.undefined)
    
    @scala.inline
    def setMsMinWidth(value: ViewportMinWidthProperty[TLength]): Self = StObject.set(x, "msMinWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMsMinWidthUndefined: Self = StObject.set(x, "msMinWidth", js.undefined)
    
    @scala.inline
    def setMsMinZoom(value: ViewportMinZoomProperty): Self = StObject.set(x, "msMinZoom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMsMinZoomUndefined: Self = StObject.set(x, "msMinZoom", js.undefined)
    
    @scala.inline
    def setMsOrientation(value: ViewportOrientationProperty): Self = StObject.set(x, "msOrientation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMsOrientationUndefined: Self = StObject.set(x, "msOrientation", js.undefined)
    
    @scala.inline
    def setMsUserZoom(value: ViewportUserZoomProperty): Self = StObject.set(x, "msUserZoom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMsUserZoomUndefined: Self = StObject.set(x, "msUserZoom", js.undefined)
    
    @scala.inline
    def setMsWidth(value: ViewportWidthProperty[TLength]): Self = StObject.set(x, "msWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMsWidthUndefined: Self = StObject.set(x, "msWidth", js.undefined)
    
    @scala.inline
    def setMsZoom(value: ViewportZoomProperty): Self = StObject.set(x, "msZoom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMsZoomUndefined: Self = StObject.set(x, "msZoom", js.undefined)
    
    @scala.inline
    def setOOrientation(value: ViewportOrientationProperty): Self = StObject.set(x, "OOrientation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOOrientationUndefined: Self = StObject.set(x, "OOrientation", js.undefined)
    
    @scala.inline
    def setOrientation(value: ViewportOrientationProperty): Self = StObject.set(x, "orientation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrientationUndefined: Self = StObject.set(x, "orientation", js.undefined)
    
    @scala.inline
    def setUserZoom(value: ViewportUserZoomProperty): Self = StObject.set(x, "userZoom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserZoomUndefined: Self = StObject.set(x, "userZoom", js.undefined)
    
    @scala.inline
    def setWidth(value: ViewportWidthProperty[TLength]): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    
    @scala.inline
    def setZoom(value: ViewportZoomProperty): Self = StObject.set(x, "zoom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setZoomUndefined: Self = StObject.set(x, "zoom", js.undefined)
  }
}
