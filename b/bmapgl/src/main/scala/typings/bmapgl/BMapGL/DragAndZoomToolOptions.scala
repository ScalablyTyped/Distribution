package typings.bmapgl.BMapGL

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DragAndZoomToolOptions extends StObject {
  
  var autoClose: js.UndefOr[Boolean] = js.native
  
  var followText: js.UndefOr[String] = js.native
  
  var zoomType: js.UndefOr[ZoomType] = js.native
}
object DragAndZoomToolOptions {
  
  @scala.inline
  def apply(): DragAndZoomToolOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DragAndZoomToolOptions]
  }
  
  @scala.inline
  implicit class DragAndZoomToolOptionsMutableBuilder[Self <: DragAndZoomToolOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAutoClose(value: Boolean): Self = StObject.set(x, "autoClose", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoCloseUndefined: Self = StObject.set(x, "autoClose", js.undefined)
    
    @scala.inline
    def setFollowText(value: String): Self = StObject.set(x, "followText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFollowTextUndefined: Self = StObject.set(x, "followText", js.undefined)
    
    @scala.inline
    def setZoomType(value: ZoomType): Self = StObject.set(x, "zoomType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setZoomTypeUndefined: Self = StObject.set(x, "zoomType", js.undefined)
  }
}
