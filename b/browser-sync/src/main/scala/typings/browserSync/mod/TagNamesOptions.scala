package typings.browserSync.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TagNamesOptions extends js.Object {
  
  var css: js.UndefOr[String] = js.native
  
  var gif: js.UndefOr[String] = js.native
  
  var jpeg: js.UndefOr[String] = js.native
  
  var jpg: js.UndefOr[String] = js.native
  
  @JSName("js")
  var js_ : js.UndefOr[String] = js.native
  
  var less: js.UndefOr[String] = js.native
  
  var png: js.UndefOr[String] = js.native
  
  var scss: js.UndefOr[String] = js.native
  
  var svg: js.UndefOr[String] = js.native
}
object TagNamesOptions {
  
  @scala.inline
  def apply(): TagNamesOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TagNamesOptions]
  }
  
  @scala.inline
  implicit class TagNamesOptionsOps[Self <: TagNamesOptions] (val x: Self) extends AnyVal {
    
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
    def setCss(value: String): Self = this.set("css", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCss: Self = this.set("css", js.undefined)
    
    @scala.inline
    def setGif(value: String): Self = this.set("gif", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGif: Self = this.set("gif", js.undefined)
    
    @scala.inline
    def setJpeg(value: String): Self = this.set("jpeg", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteJpeg: Self = this.set("jpeg", js.undefined)
    
    @scala.inline
    def setJpg(value: String): Self = this.set("jpg", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteJpg: Self = this.set("jpg", js.undefined)
    
    @scala.inline
    def setJs_(value: String): Self = this.set("js", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteJs_ : Self = this.set("js", js.undefined)
    
    @scala.inline
    def setLess(value: String): Self = this.set("less", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLess: Self = this.set("less", js.undefined)
    
    @scala.inline
    def setPng(value: String): Self = this.set("png", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePng: Self = this.set("png", js.undefined)
    
    @scala.inline
    def setScss(value: String): Self = this.set("scss", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScss: Self = this.set("scss", js.undefined)
    
    @scala.inline
    def setSvg(value: String): Self = this.set("svg", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSvg: Self = this.set("svg", js.undefined)
  }
}
