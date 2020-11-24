package typings.bmapgl.BMapGL

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MapOptions extends js.Object {
  
  var enableAutoResize: js.UndefOr[Boolean] = js.native
  
  var enableHighResolution: js.UndefOr[Boolean] = js.native
  
  var enableMapClick: js.UndefOr[Boolean] = js.native
  
  var mapType: js.UndefOr[MapType] = js.native
  
  var maxZoom: js.UndefOr[Double] = js.native
  
  var minZoom: js.UndefOr[Double] = js.native
}
object MapOptions {
  
  @scala.inline
  def apply(): MapOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MapOptions]
  }
  
  @scala.inline
  implicit class MapOptionsOps[Self <: MapOptions] (val x: Self) extends AnyVal {
    
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
    def setEnableAutoResize(value: Boolean): Self = this.set("enableAutoResize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnableAutoResize: Self = this.set("enableAutoResize", js.undefined)
    
    @scala.inline
    def setEnableHighResolution(value: Boolean): Self = this.set("enableHighResolution", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnableHighResolution: Self = this.set("enableHighResolution", js.undefined)
    
    @scala.inline
    def setEnableMapClick(value: Boolean): Self = this.set("enableMapClick", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnableMapClick: Self = this.set("enableMapClick", js.undefined)
    
    @scala.inline
    def setMapType(value: MapType): Self = this.set("mapType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMapType: Self = this.set("mapType", js.undefined)
    
    @scala.inline
    def setMaxZoom(value: Double): Self = this.set("maxZoom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxZoom: Self = this.set("maxZoom", js.undefined)
    
    @scala.inline
    def setMinZoom(value: Double): Self = this.set("minZoom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinZoom: Self = this.set("minZoom", js.undefined)
  }
}
