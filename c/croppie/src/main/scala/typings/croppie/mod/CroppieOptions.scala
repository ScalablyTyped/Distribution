package typings.croppie.mod

import typings.croppie.anon.Height
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CroppieOptions extends js.Object {
  
  var boundary: js.UndefOr[Height] = js.native
  
  var customClass: js.UndefOr[String] = js.native
  
  var enableExif: js.UndefOr[Boolean] = js.native
  
  var enableOrientation: js.UndefOr[Boolean] = js.native
  
  var enableZoom: js.UndefOr[Boolean] = js.native
  
  var enforceBoundary: js.UndefOr[Boolean] = js.native
  
  var mouseWheelZoom: js.UndefOr[Boolean] = js.native
  
  var showZoomer: js.UndefOr[Boolean] = js.native
  
  var viewport: js.UndefOr[typings.croppie.anon.Type] = js.native
}
object CroppieOptions {
  
  @scala.inline
  def apply(): CroppieOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CroppieOptions]
  }
  
  @scala.inline
  implicit class CroppieOptionsOps[Self <: CroppieOptions] (val x: Self) extends AnyVal {
    
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
    def setBoundary(value: Height): Self = this.set("boundary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBoundary: Self = this.set("boundary", js.undefined)
    
    @scala.inline
    def setCustomClass(value: String): Self = this.set("customClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCustomClass: Self = this.set("customClass", js.undefined)
    
    @scala.inline
    def setEnableExif(value: Boolean): Self = this.set("enableExif", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnableExif: Self = this.set("enableExif", js.undefined)
    
    @scala.inline
    def setEnableOrientation(value: Boolean): Self = this.set("enableOrientation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnableOrientation: Self = this.set("enableOrientation", js.undefined)
    
    @scala.inline
    def setEnableZoom(value: Boolean): Self = this.set("enableZoom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnableZoom: Self = this.set("enableZoom", js.undefined)
    
    @scala.inline
    def setEnforceBoundary(value: Boolean): Self = this.set("enforceBoundary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnforceBoundary: Self = this.set("enforceBoundary", js.undefined)
    
    @scala.inline
    def setMouseWheelZoom(value: Boolean): Self = this.set("mouseWheelZoom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMouseWheelZoom: Self = this.set("mouseWheelZoom", js.undefined)
    
    @scala.inline
    def setShowZoomer(value: Boolean): Self = this.set("showZoomer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowZoomer: Self = this.set("showZoomer", js.undefined)
    
    @scala.inline
    def setViewport(value: typings.croppie.anon.Type): Self = this.set("viewport", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteViewport: Self = this.set("viewport", js.undefined)
  }
}
