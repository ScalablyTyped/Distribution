package typings.csstype.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ViewportFallback[TLength] extends StObject {
  
  var OOrientation: js.UndefOr[ViewportOrientationProperty | js.Array[ViewportOrientationProperty]] = js.native
  
  var height: js.UndefOr[ViewportHeightProperty[TLength] | js.Array[ViewportHeightProperty[TLength]]] = js.native
  
  var maxHeight: js.UndefOr[
    ViewportMaxHeightProperty[TLength] | js.Array[ViewportMaxHeightProperty[TLength]]
  ] = js.native
  
  var maxWidth: js.UndefOr[ViewportMaxWidthProperty[TLength] | js.Array[ViewportMaxWidthProperty[TLength]]] = js.native
  
  var maxZoom: js.UndefOr[ViewportMaxZoomProperty | js.Array[ViewportMaxZoomProperty]] = js.native
  
  var minHeight: js.UndefOr[
    ViewportMinHeightProperty[TLength] | js.Array[ViewportMinHeightProperty[TLength]]
  ] = js.native
  
  var minWidth: js.UndefOr[ViewportMinWidthProperty[TLength] | js.Array[ViewportMinWidthProperty[TLength]]] = js.native
  
  var minZoom: js.UndefOr[ViewportMinZoomProperty | js.Array[ViewportMinZoomProperty]] = js.native
  
  var msHeight: js.UndefOr[ViewportHeightProperty[TLength] | js.Array[ViewportHeightProperty[TLength]]] = js.native
  
  var msMaxHeight: js.UndefOr[
    ViewportMaxHeightProperty[TLength] | js.Array[ViewportMaxHeightProperty[TLength]]
  ] = js.native
  
  var msMaxWidth: js.UndefOr[ViewportMaxWidthProperty[TLength] | js.Array[ViewportMaxWidthProperty[TLength]]] = js.native
  
  var msMaxZoom: js.UndefOr[ViewportMaxZoomProperty | js.Array[ViewportMaxZoomProperty]] = js.native
  
  var msMinHeight: js.UndefOr[
    ViewportMinHeightProperty[TLength] | js.Array[ViewportMinHeightProperty[TLength]]
  ] = js.native
  
  var msMinWidth: js.UndefOr[ViewportMinWidthProperty[TLength] | js.Array[ViewportMinWidthProperty[TLength]]] = js.native
  
  var msMinZoom: js.UndefOr[ViewportMinZoomProperty | js.Array[ViewportMinZoomProperty]] = js.native
  
  var msOrientation: js.UndefOr[ViewportOrientationProperty | js.Array[ViewportOrientationProperty]] = js.native
  
  var msUserZoom: js.UndefOr[ViewportUserZoomProperty | js.Array[ViewportUserZoomProperty]] = js.native
  
  var msWidth: js.UndefOr[ViewportWidthProperty[TLength] | js.Array[ViewportWidthProperty[TLength]]] = js.native
  
  var msZoom: js.UndefOr[ViewportZoomProperty | js.Array[ViewportZoomProperty]] = js.native
  
  var orientation: js.UndefOr[ViewportOrientationProperty | js.Array[ViewportOrientationProperty]] = js.native
  
  var userZoom: js.UndefOr[ViewportUserZoomProperty | js.Array[ViewportUserZoomProperty]] = js.native
  
  var width: js.UndefOr[ViewportWidthProperty[TLength] | js.Array[ViewportWidthProperty[TLength]]] = js.native
  
  var zoom: js.UndefOr[ViewportZoomProperty | js.Array[ViewportZoomProperty]] = js.native
}
object ViewportFallback {
  
  @scala.inline
  def apply[TLength](): ViewportFallback[TLength] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ViewportFallback[TLength]]
  }
  
  @scala.inline
  implicit class ViewportFallbackMutableBuilder[Self <: ViewportFallback[_], TLength] (val x: Self with ViewportFallback[TLength]) extends AnyVal {
    
    @scala.inline
    def setHeight(value: ViewportHeightProperty[TLength] | js.Array[ViewportHeightProperty[TLength]]): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    @scala.inline
    def setHeightVarargs(value: ViewportHeightProperty[TLength]*): Self = StObject.set(x, "height", js.Array(value :_*))
    
    @scala.inline
    def setMaxHeight(value: ViewportMaxHeightProperty[TLength] | js.Array[ViewportMaxHeightProperty[TLength]]): Self = StObject.set(x, "maxHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxHeightUndefined: Self = StObject.set(x, "maxHeight", js.undefined)
    
    @scala.inline
    def setMaxHeightVarargs(value: ViewportMaxHeightProperty[TLength]*): Self = StObject.set(x, "maxHeight", js.Array(value :_*))
    
    @scala.inline
    def setMaxWidth(value: ViewportMaxWidthProperty[TLength] | js.Array[ViewportMaxWidthProperty[TLength]]): Self = StObject.set(x, "maxWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxWidthUndefined: Self = StObject.set(x, "maxWidth", js.undefined)
    
    @scala.inline
    def setMaxWidthVarargs(value: ViewportMaxWidthProperty[TLength]*): Self = StObject.set(x, "maxWidth", js.Array(value :_*))
    
    @scala.inline
    def setMaxZoom(value: ViewportMaxZoomProperty | js.Array[ViewportMaxZoomProperty]): Self = StObject.set(x, "maxZoom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxZoomUndefined: Self = StObject.set(x, "maxZoom", js.undefined)
    
    @scala.inline
    def setMaxZoomVarargs(value: ViewportMaxZoomProperty*): Self = StObject.set(x, "maxZoom", js.Array(value :_*))
    
    @scala.inline
    def setMinHeight(value: ViewportMinHeightProperty[TLength] | js.Array[ViewportMinHeightProperty[TLength]]): Self = StObject.set(x, "minHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinHeightUndefined: Self = StObject.set(x, "minHeight", js.undefined)
    
    @scala.inline
    def setMinHeightVarargs(value: ViewportMinHeightProperty[TLength]*): Self = StObject.set(x, "minHeight", js.Array(value :_*))
    
    @scala.inline
    def setMinWidth(value: ViewportMinWidthProperty[TLength] | js.Array[ViewportMinWidthProperty[TLength]]): Self = StObject.set(x, "minWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinWidthUndefined: Self = StObject.set(x, "minWidth", js.undefined)
    
    @scala.inline
    def setMinWidthVarargs(value: ViewportMinWidthProperty[TLength]*): Self = StObject.set(x, "minWidth", js.Array(value :_*))
    
    @scala.inline
    def setMinZoom(value: ViewportMinZoomProperty | js.Array[ViewportMinZoomProperty]): Self = StObject.set(x, "minZoom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinZoomUndefined: Self = StObject.set(x, "minZoom", js.undefined)
    
    @scala.inline
    def setMinZoomVarargs(value: ViewportMinZoomProperty*): Self = StObject.set(x, "minZoom", js.Array(value :_*))
    
    @scala.inline
    def setMsHeight(value: ViewportHeightProperty[TLength] | js.Array[ViewportHeightProperty[TLength]]): Self = StObject.set(x, "msHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMsHeightUndefined: Self = StObject.set(x, "msHeight", js.undefined)
    
    @scala.inline
    def setMsHeightVarargs(value: ViewportHeightProperty[TLength]*): Self = StObject.set(x, "msHeight", js.Array(value :_*))
    
    @scala.inline
    def setMsMaxHeight(value: ViewportMaxHeightProperty[TLength] | js.Array[ViewportMaxHeightProperty[TLength]]): Self = StObject.set(x, "msMaxHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMsMaxHeightUndefined: Self = StObject.set(x, "msMaxHeight", js.undefined)
    
    @scala.inline
    def setMsMaxHeightVarargs(value: ViewportMaxHeightProperty[TLength]*): Self = StObject.set(x, "msMaxHeight", js.Array(value :_*))
    
    @scala.inline
    def setMsMaxWidth(value: ViewportMaxWidthProperty[TLength] | js.Array[ViewportMaxWidthProperty[TLength]]): Self = StObject.set(x, "msMaxWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMsMaxWidthUndefined: Self = StObject.set(x, "msMaxWidth", js.undefined)
    
    @scala.inline
    def setMsMaxWidthVarargs(value: ViewportMaxWidthProperty[TLength]*): Self = StObject.set(x, "msMaxWidth", js.Array(value :_*))
    
    @scala.inline
    def setMsMaxZoom(value: ViewportMaxZoomProperty | js.Array[ViewportMaxZoomProperty]): Self = StObject.set(x, "msMaxZoom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMsMaxZoomUndefined: Self = StObject.set(x, "msMaxZoom", js.undefined)
    
    @scala.inline
    def setMsMaxZoomVarargs(value: ViewportMaxZoomProperty*): Self = StObject.set(x, "msMaxZoom", js.Array(value :_*))
    
    @scala.inline
    def setMsMinHeight(value: ViewportMinHeightProperty[TLength] | js.Array[ViewportMinHeightProperty[TLength]]): Self = StObject.set(x, "msMinHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMsMinHeightUndefined: Self = StObject.set(x, "msMinHeight", js.undefined)
    
    @scala.inline
    def setMsMinHeightVarargs(value: ViewportMinHeightProperty[TLength]*): Self = StObject.set(x, "msMinHeight", js.Array(value :_*))
    
    @scala.inline
    def setMsMinWidth(value: ViewportMinWidthProperty[TLength] | js.Array[ViewportMinWidthProperty[TLength]]): Self = StObject.set(x, "msMinWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMsMinWidthUndefined: Self = StObject.set(x, "msMinWidth", js.undefined)
    
    @scala.inline
    def setMsMinWidthVarargs(value: ViewportMinWidthProperty[TLength]*): Self = StObject.set(x, "msMinWidth", js.Array(value :_*))
    
    @scala.inline
    def setMsMinZoom(value: ViewportMinZoomProperty | js.Array[ViewportMinZoomProperty]): Self = StObject.set(x, "msMinZoom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMsMinZoomUndefined: Self = StObject.set(x, "msMinZoom", js.undefined)
    
    @scala.inline
    def setMsMinZoomVarargs(value: ViewportMinZoomProperty*): Self = StObject.set(x, "msMinZoom", js.Array(value :_*))
    
    @scala.inline
    def setMsOrientation(value: ViewportOrientationProperty | js.Array[ViewportOrientationProperty]): Self = StObject.set(x, "msOrientation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMsOrientationUndefined: Self = StObject.set(x, "msOrientation", js.undefined)
    
    @scala.inline
    def setMsOrientationVarargs(value: ViewportOrientationProperty*): Self = StObject.set(x, "msOrientation", js.Array(value :_*))
    
    @scala.inline
    def setMsUserZoom(value: ViewportUserZoomProperty | js.Array[ViewportUserZoomProperty]): Self = StObject.set(x, "msUserZoom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMsUserZoomUndefined: Self = StObject.set(x, "msUserZoom", js.undefined)
    
    @scala.inline
    def setMsUserZoomVarargs(value: ViewportUserZoomProperty*): Self = StObject.set(x, "msUserZoom", js.Array(value :_*))
    
    @scala.inline
    def setMsWidth(value: ViewportWidthProperty[TLength] | js.Array[ViewportWidthProperty[TLength]]): Self = StObject.set(x, "msWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMsWidthUndefined: Self = StObject.set(x, "msWidth", js.undefined)
    
    @scala.inline
    def setMsWidthVarargs(value: ViewportWidthProperty[TLength]*): Self = StObject.set(x, "msWidth", js.Array(value :_*))
    
    @scala.inline
    def setMsZoom(value: ViewportZoomProperty | js.Array[ViewportZoomProperty]): Self = StObject.set(x, "msZoom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMsZoomUndefined: Self = StObject.set(x, "msZoom", js.undefined)
    
    @scala.inline
    def setMsZoomVarargs(value: ViewportZoomProperty*): Self = StObject.set(x, "msZoom", js.Array(value :_*))
    
    @scala.inline
    def setOOrientation(value: ViewportOrientationProperty | js.Array[ViewportOrientationProperty]): Self = StObject.set(x, "OOrientation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOOrientationUndefined: Self = StObject.set(x, "OOrientation", js.undefined)
    
    @scala.inline
    def setOOrientationVarargs(value: ViewportOrientationProperty*): Self = StObject.set(x, "OOrientation", js.Array(value :_*))
    
    @scala.inline
    def setOrientation(value: ViewportOrientationProperty | js.Array[ViewportOrientationProperty]): Self = StObject.set(x, "orientation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrientationUndefined: Self = StObject.set(x, "orientation", js.undefined)
    
    @scala.inline
    def setOrientationVarargs(value: ViewportOrientationProperty*): Self = StObject.set(x, "orientation", js.Array(value :_*))
    
    @scala.inline
    def setUserZoom(value: ViewportUserZoomProperty | js.Array[ViewportUserZoomProperty]): Self = StObject.set(x, "userZoom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserZoomUndefined: Self = StObject.set(x, "userZoom", js.undefined)
    
    @scala.inline
    def setUserZoomVarargs(value: ViewportUserZoomProperty*): Self = StObject.set(x, "userZoom", js.Array(value :_*))
    
    @scala.inline
    def setWidth(value: ViewportWidthProperty[TLength] | js.Array[ViewportWidthProperty[TLength]]): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    
    @scala.inline
    def setWidthVarargs(value: ViewportWidthProperty[TLength]*): Self = StObject.set(x, "width", js.Array(value :_*))
    
    @scala.inline
    def setZoom(value: ViewportZoomProperty | js.Array[ViewportZoomProperty]): Self = StObject.set(x, "zoom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setZoomUndefined: Self = StObject.set(x, "zoom", js.undefined)
    
    @scala.inline
    def setZoomVarargs(value: ViewportZoomProperty*): Self = StObject.set(x, "zoom", js.Array(value :_*))
  }
}
