package typings.bmapgl.BMapGL

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NavigationControlOptions extends js.Object {
  
  var anchor: js.UndefOr[ControlAnchor] = js.native
  
  var enableGeolocation: js.UndefOr[Boolean] = js.native
  
  var offset: js.UndefOr[Size] = js.native
  
  var showZoomInfo: js.UndefOr[Boolean] = js.native
  
  var `type`: js.UndefOr[NavigationControlType] = js.native
}
object NavigationControlOptions {
  
  @scala.inline
  def apply(): NavigationControlOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NavigationControlOptions]
  }
  
  @scala.inline
  implicit class NavigationControlOptionsOps[Self <: NavigationControlOptions] (val x: Self) extends AnyVal {
    
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
    def setAnchor(value: ControlAnchor): Self = this.set("anchor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAnchor: Self = this.set("anchor", js.undefined)
    
    @scala.inline
    def setEnableGeolocation(value: Boolean): Self = this.set("enableGeolocation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnableGeolocation: Self = this.set("enableGeolocation", js.undefined)
    
    @scala.inline
    def setOffset(value: Size): Self = this.set("offset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOffset: Self = this.set("offset", js.undefined)
    
    @scala.inline
    def setShowZoomInfo(value: Boolean): Self = this.set("showZoomInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowZoomInfo: Self = this.set("showZoomInfo", js.undefined)
    
    @scala.inline
    def setType(value: NavigationControlType): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
}
