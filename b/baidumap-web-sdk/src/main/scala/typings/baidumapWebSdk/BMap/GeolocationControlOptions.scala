package typings.baidumapWebSdk.BMap

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GeolocationControlOptions extends js.Object {
  
  var anchor: js.UndefOr[ControlAnchor] = js.native
  
  var enableAutoLocation: js.UndefOr[Boolean] = js.native
  
  var locationIcon: js.UndefOr[Icon] = js.native
  
  var offset: js.UndefOr[Size] = js.native
  
  var showAddressBar: js.UndefOr[Boolean] = js.native
}
object GeolocationControlOptions {
  
  @scala.inline
  def apply(): GeolocationControlOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GeolocationControlOptions]
  }
  
  @scala.inline
  implicit class GeolocationControlOptionsOps[Self <: GeolocationControlOptions] (val x: Self) extends AnyVal {
    
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
    def setEnableAutoLocation(value: Boolean): Self = this.set("enableAutoLocation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnableAutoLocation: Self = this.set("enableAutoLocation", js.undefined)
    
    @scala.inline
    def setLocationIcon(value: Icon): Self = this.set("locationIcon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLocationIcon: Self = this.set("locationIcon", js.undefined)
    
    @scala.inline
    def setOffset(value: Size): Self = this.set("offset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOffset: Self = this.set("offset", js.undefined)
    
    @scala.inline
    def setShowAddressBar(value: Boolean): Self = this.set("showAddressBar", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowAddressBar: Self = this.set("showAddressBar", js.undefined)
  }
}
