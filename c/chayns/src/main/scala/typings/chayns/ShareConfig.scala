package typings.chayns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// chayns.share()
@js.native
trait ShareConfig extends js.Object {
  
  var imageUrl: js.UndefOr[String] = js.native
  
  var sharingAndroidApp: js.UndefOr[String] = js.native
  
  var sharingApp: Double = js.native
  
  var text: String = js.native
  
  var title: js.UndefOr[String] = js.native
}
object ShareConfig {
  
  @scala.inline
  def apply(sharingApp: Double, text: String): ShareConfig = {
    val __obj = js.Dynamic.literal(sharingApp = sharingApp.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[ShareConfig]
  }
  
  @scala.inline
  implicit class ShareConfigOps[Self <: ShareConfig] (val x: Self) extends AnyVal {
    
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
    def setSharingApp(value: Double): Self = this.set("sharingApp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setText(value: String): Self = this.set("text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImageUrl(value: String): Self = this.set("imageUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteImageUrl: Self = this.set("imageUrl", js.undefined)
    
    @scala.inline
    def setSharingAndroidApp(value: String): Self = this.set("sharingAndroidApp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSharingAndroidApp: Self = this.set("sharingAndroidApp", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
  }
}
