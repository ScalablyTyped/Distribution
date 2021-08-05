package typings.baidumapWebSdk.BMap

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DragAndZoomToolOptions extends StObject {
  
  var autoClose: js.UndefOr[Boolean] = js.undefined
  
  var followText: js.UndefOr[String] = js.undefined
  
  var zoomType: js.UndefOr[ZoomType] = js.undefined
}
object DragAndZoomToolOptions {
  
  inline def apply(): DragAndZoomToolOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DragAndZoomToolOptions]
  }
  
  extension [Self <: DragAndZoomToolOptions](x: Self) {
    
    inline def setAutoClose(value: Boolean): Self = StObject.set(x, "autoClose", value.asInstanceOf[js.Any])
    
    inline def setAutoCloseUndefined: Self = StObject.set(x, "autoClose", js.undefined)
    
    inline def setFollowText(value: String): Self = StObject.set(x, "followText", value.asInstanceOf[js.Any])
    
    inline def setFollowTextUndefined: Self = StObject.set(x, "followText", js.undefined)
    
    inline def setZoomType(value: ZoomType): Self = StObject.set(x, "zoomType", value.asInstanceOf[js.Any])
    
    inline def setZoomTypeUndefined: Self = StObject.set(x, "zoomType", js.undefined)
  }
}
