package typings.bootstrapFileinput.BootstrapFileInput

import typings.bootstrapFileinput.anon.Height
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PreviewSettings extends js.Object {
  
  var audio: js.UndefOr[Height] = js.native
  
  var flash: js.UndefOr[Height] = js.native
  
  var html: js.UndefOr[Height] = js.native
  
  var image: js.UndefOr[Height] = js.native
  
  var `object`: js.UndefOr[Height] = js.native
  
  var other: js.UndefOr[Height] = js.native
  
  var text: js.UndefOr[Height] = js.native
  
  var video: js.UndefOr[Height] = js.native
}
object PreviewSettings {
  
  @scala.inline
  def apply(): PreviewSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PreviewSettings]
  }
  
  @scala.inline
  implicit class PreviewSettingsOps[Self <: PreviewSettings] (val x: Self) extends AnyVal {
    
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
    def setAudio(value: Height): Self = this.set("audio", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAudio: Self = this.set("audio", js.undefined)
    
    @scala.inline
    def setFlash(value: Height): Self = this.set("flash", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFlash: Self = this.set("flash", js.undefined)
    
    @scala.inline
    def setHtml(value: Height): Self = this.set("html", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHtml: Self = this.set("html", js.undefined)
    
    @scala.inline
    def setImage(value: Height): Self = this.set("image", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteImage: Self = this.set("image", js.undefined)
    
    @scala.inline
    def setObject(value: Height): Self = this.set("object", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteObject: Self = this.set("object", js.undefined)
    
    @scala.inline
    def setOther(value: Height): Self = this.set("other", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOther: Self = this.set("other", js.undefined)
    
    @scala.inline
    def setText(value: Height): Self = this.set("text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteText: Self = this.set("text", js.undefined)
    
    @scala.inline
    def setVideo(value: Height): Self = this.set("video", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVideo: Self = this.set("video", js.undefined)
  }
}
