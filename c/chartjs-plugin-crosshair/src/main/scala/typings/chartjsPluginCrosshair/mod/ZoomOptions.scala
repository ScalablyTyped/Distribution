package typings.chartjsPluginCrosshair.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ZoomOptions extends js.Object {
  
  var enabled: js.UndefOr[Boolean] = js.native
  
  var zoomButtonClass: js.UndefOr[String] = js.native
  
  var zoomButtonText: js.UndefOr[String] = js.native
  
  var zoomboxBackgroundColor: js.UndefOr[String] = js.native
  
  var zoomboxBorderColor: js.UndefOr[String] = js.native
}
object ZoomOptions {
  
  @scala.inline
  def apply(): ZoomOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ZoomOptions]
  }
  
  @scala.inline
  implicit class ZoomOptionsOps[Self <: ZoomOptions] (val x: Self) extends AnyVal {
    
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
    def setEnabled(value: Boolean): Self = this.set("enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnabled: Self = this.set("enabled", js.undefined)
    
    @scala.inline
    def setZoomButtonClass(value: String): Self = this.set("zoomButtonClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteZoomButtonClass: Self = this.set("zoomButtonClass", js.undefined)
    
    @scala.inline
    def setZoomButtonText(value: String): Self = this.set("zoomButtonText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteZoomButtonText: Self = this.set("zoomButtonText", js.undefined)
    
    @scala.inline
    def setZoomboxBackgroundColor(value: String): Self = this.set("zoomboxBackgroundColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteZoomboxBackgroundColor: Self = this.set("zoomboxBackgroundColor", js.undefined)
    
    @scala.inline
    def setZoomboxBorderColor(value: String): Self = this.set("zoomboxBorderColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteZoomboxBorderColor: Self = this.set("zoomboxBorderColor", js.undefined)
  }
}
