package typings.baidumapWebSdk.BMap

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MapTypeOptions extends js.Object {
  
  var errorImageUrl: js.UndefOr[String] = js.native
  
  var maxZoom: js.UndefOr[Double] = js.native
  
  var minZoom: js.UndefOr[Double] = js.native
  
  var textColor: js.UndefOr[Double] = js.native
  
  var tips: js.UndefOr[String] = js.native
}
object MapTypeOptions {
  
  @scala.inline
  def apply(): MapTypeOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MapTypeOptions]
  }
  
  @scala.inline
  implicit class MapTypeOptionsOps[Self <: MapTypeOptions] (val x: Self) extends AnyVal {
    
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
    def setErrorImageUrl(value: String): Self = this.set("errorImageUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteErrorImageUrl: Self = this.set("errorImageUrl", js.undefined)
    
    @scala.inline
    def setMaxZoom(value: Double): Self = this.set("maxZoom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxZoom: Self = this.set("maxZoom", js.undefined)
    
    @scala.inline
    def setMinZoom(value: Double): Self = this.set("minZoom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinZoom: Self = this.set("minZoom", js.undefined)
    
    @scala.inline
    def setTextColor(value: Double): Self = this.set("textColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTextColor: Self = this.set("textColor", js.undefined)
    
    @scala.inline
    def setTips(value: String): Self = this.set("tips", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTips: Self = this.set("tips", js.undefined)
  }
}
