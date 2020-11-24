package typings.bmapgl.BMapGL

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DragAndZoomToolOptions extends js.Object {
  
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
  implicit class DragAndZoomToolOptionsOps[Self <: DragAndZoomToolOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAutoClose(value: Boolean): Self = this.set("autoClose", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoClose: Self = this.set("autoClose", js.undefined)
    
    @scala.inline
    def setFollowText(value: String): Self = this.set("followText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFollowText: Self = this.set("followText", js.undefined)
    
    @scala.inline
    def setZoomType(value: ZoomType): Self = this.set("zoomType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteZoomType: Self = this.set("zoomType", js.undefined)
  }
}
