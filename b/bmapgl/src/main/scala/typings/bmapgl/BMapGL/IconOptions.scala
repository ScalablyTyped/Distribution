package typings.bmapgl.BMapGL

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IconOptions extends js.Object {
  
  var anchor: js.UndefOr[Size] = js.native
  
  var imageOffset: js.UndefOr[Size] = js.native
  
  var imageSize: js.UndefOr[Size] = js.native
  
  var infoWindowAnchor: js.UndefOr[Size] = js.native
  
  var printImageUrl: js.UndefOr[String] = js.native
  
  var srcset: js.UndefOr[js.Object] = js.native
}
object IconOptions {
  
  @scala.inline
  def apply(): IconOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IconOptions]
  }
  
  @scala.inline
  implicit class IconOptionsOps[Self <: IconOptions] (val x: Self) extends AnyVal {
    
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
    def setAnchor(value: Size): Self = this.set("anchor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAnchor: Self = this.set("anchor", js.undefined)
    
    @scala.inline
    def setImageOffset(value: Size): Self = this.set("imageOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteImageOffset: Self = this.set("imageOffset", js.undefined)
    
    @scala.inline
    def setImageSize(value: Size): Self = this.set("imageSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteImageSize: Self = this.set("imageSize", js.undefined)
    
    @scala.inline
    def setInfoWindowAnchor(value: Size): Self = this.set("infoWindowAnchor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInfoWindowAnchor: Self = this.set("infoWindowAnchor", js.undefined)
    
    @scala.inline
    def setPrintImageUrl(value: String): Self = this.set("printImageUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrintImageUrl: Self = this.set("printImageUrl", js.undefined)
    
    @scala.inline
    def setSrcset(value: js.Object): Self = this.set("srcset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSrcset: Self = this.set("srcset", js.undefined)
  }
}
