package typings.csstype.mod.AtRule

import typings.std.NonNullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined csstype.csstype.Fallback<csstype.csstype.AtRule.Viewport<TLength, TTime>> */
trait ViewportFallback[TLength, TTime] extends StObject {
  
  var height: js.UndefOr[Height[TLength] | js.Array[NonNullable[js.UndefOr[Height[TLength]]]]] = js.undefined
  
  var maxHeight: js.UndefOr[MaxHeight[TLength] | js.Array[NonNullable[js.UndefOr[MaxHeight[TLength]]]]] = js.undefined
  
  var maxWidth: js.UndefOr[MaxWidth[TLength] | js.Array[NonNullable[js.UndefOr[MaxWidth[TLength]]]]] = js.undefined
  
  var maxZoom: js.UndefOr[MaxZoom | js.Array[NonNullable[js.UndefOr[MaxZoom]]]] = js.undefined
  
  var minHeight: js.UndefOr[MinHeight[TLength] | js.Array[NonNullable[js.UndefOr[MinHeight[TLength]]]]] = js.undefined
  
  var minWidth: js.UndefOr[MinWidth[TLength] | js.Array[NonNullable[js.UndefOr[MinWidth[TLength]]]]] = js.undefined
  
  var minZoom: js.UndefOr[MinZoom | js.Array[NonNullable[js.UndefOr[MinZoom]]]] = js.undefined
  
  var orientation: js.UndefOr[Orientation | js.Array[NonNullable[js.UndefOr[Orientation]]]] = js.undefined
  
  var userZoom: js.UndefOr[UserZoom | js.Array[NonNullable[js.UndefOr[UserZoom]]]] = js.undefined
  
  var viewportFit: js.UndefOr[ViewportFit | js.Array[NonNullable[js.UndefOr[ViewportFit]]]] = js.undefined
  
  var width: js.UndefOr[Width[TLength] | js.Array[NonNullable[js.UndefOr[Width[TLength]]]]] = js.undefined
  
  var zoom: js.UndefOr[Zoom | js.Array[NonNullable[js.UndefOr[Zoom]]]] = js.undefined
}
object ViewportFallback {
  
  inline def apply[TLength, TTime](): ViewportFallback[TLength, TTime] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ViewportFallback[TLength, TTime]]
  }
  
  extension [Self <: ViewportFallback[?, ?], TLength, TTime](x: Self & (ViewportFallback[TLength, TTime])) {
    
    inline def setHeight(value: Height[TLength] | js.Array[NonNullable[js.UndefOr[Height[TLength]]]]): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    inline def setHeightVarargs(value: NonNullable[js.UndefOr[Height[TLength]]]*): Self = StObject.set(x, "height", js.Array(value*))
    
    inline def setMaxHeight(value: MaxHeight[TLength] | js.Array[NonNullable[js.UndefOr[MaxHeight[TLength]]]]): Self = StObject.set(x, "maxHeight", value.asInstanceOf[js.Any])
    
    inline def setMaxHeightUndefined: Self = StObject.set(x, "maxHeight", js.undefined)
    
    inline def setMaxHeightVarargs(value: NonNullable[js.UndefOr[MaxHeight[TLength]]]*): Self = StObject.set(x, "maxHeight", js.Array(value*))
    
    inline def setMaxWidth(value: MaxWidth[TLength] | js.Array[NonNullable[js.UndefOr[MaxWidth[TLength]]]]): Self = StObject.set(x, "maxWidth", value.asInstanceOf[js.Any])
    
    inline def setMaxWidthUndefined: Self = StObject.set(x, "maxWidth", js.undefined)
    
    inline def setMaxWidthVarargs(value: NonNullable[js.UndefOr[MaxWidth[TLength]]]*): Self = StObject.set(x, "maxWidth", js.Array(value*))
    
    inline def setMaxZoom(value: MaxZoom | js.Array[NonNullable[js.UndefOr[MaxZoom]]]): Self = StObject.set(x, "maxZoom", value.asInstanceOf[js.Any])
    
    inline def setMaxZoomUndefined: Self = StObject.set(x, "maxZoom", js.undefined)
    
    inline def setMaxZoomVarargs(value: NonNullable[js.UndefOr[MaxZoom]]*): Self = StObject.set(x, "maxZoom", js.Array(value*))
    
    inline def setMinHeight(value: MinHeight[TLength] | js.Array[NonNullable[js.UndefOr[MinHeight[TLength]]]]): Self = StObject.set(x, "minHeight", value.asInstanceOf[js.Any])
    
    inline def setMinHeightUndefined: Self = StObject.set(x, "minHeight", js.undefined)
    
    inline def setMinHeightVarargs(value: NonNullable[js.UndefOr[MinHeight[TLength]]]*): Self = StObject.set(x, "minHeight", js.Array(value*))
    
    inline def setMinWidth(value: MinWidth[TLength] | js.Array[NonNullable[js.UndefOr[MinWidth[TLength]]]]): Self = StObject.set(x, "minWidth", value.asInstanceOf[js.Any])
    
    inline def setMinWidthUndefined: Self = StObject.set(x, "minWidth", js.undefined)
    
    inline def setMinWidthVarargs(value: NonNullable[js.UndefOr[MinWidth[TLength]]]*): Self = StObject.set(x, "minWidth", js.Array(value*))
    
    inline def setMinZoom(value: MinZoom | js.Array[NonNullable[js.UndefOr[MinZoom]]]): Self = StObject.set(x, "minZoom", value.asInstanceOf[js.Any])
    
    inline def setMinZoomUndefined: Self = StObject.set(x, "minZoom", js.undefined)
    
    inline def setMinZoomVarargs(value: NonNullable[js.UndefOr[MinZoom]]*): Self = StObject.set(x, "minZoom", js.Array(value*))
    
    inline def setOrientation(value: Orientation | js.Array[NonNullable[js.UndefOr[Orientation]]]): Self = StObject.set(x, "orientation", value.asInstanceOf[js.Any])
    
    inline def setOrientationUndefined: Self = StObject.set(x, "orientation", js.undefined)
    
    inline def setOrientationVarargs(value: NonNullable[js.UndefOr[Orientation]]*): Self = StObject.set(x, "orientation", js.Array(value*))
    
    inline def setUserZoom(value: UserZoom | js.Array[NonNullable[js.UndefOr[UserZoom]]]): Self = StObject.set(x, "userZoom", value.asInstanceOf[js.Any])
    
    inline def setUserZoomUndefined: Self = StObject.set(x, "userZoom", js.undefined)
    
    inline def setUserZoomVarargs(value: NonNullable[js.UndefOr[UserZoom]]*): Self = StObject.set(x, "userZoom", js.Array(value*))
    
    inline def setViewportFit(value: ViewportFit | js.Array[NonNullable[js.UndefOr[ViewportFit]]]): Self = StObject.set(x, "viewportFit", value.asInstanceOf[js.Any])
    
    inline def setViewportFitUndefined: Self = StObject.set(x, "viewportFit", js.undefined)
    
    inline def setViewportFitVarargs(value: NonNullable[js.UndefOr[ViewportFit]]*): Self = StObject.set(x, "viewportFit", js.Array(value*))
    
    inline def setWidth(value: Width[TLength] | js.Array[NonNullable[js.UndefOr[Width[TLength]]]]): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    
    inline def setWidthVarargs(value: NonNullable[js.UndefOr[Width[TLength]]]*): Self = StObject.set(x, "width", js.Array(value*))
    
    inline def setZoom(value: Zoom | js.Array[NonNullable[js.UndefOr[Zoom]]]): Self = StObject.set(x, "zoom", value.asInstanceOf[js.Any])
    
    inline def setZoomUndefined: Self = StObject.set(x, "zoom", js.undefined)
    
    inline def setZoomVarargs(value: NonNullable[js.UndefOr[Zoom]]*): Self = StObject.set(x, "zoom", js.Array(value*))
  }
}
