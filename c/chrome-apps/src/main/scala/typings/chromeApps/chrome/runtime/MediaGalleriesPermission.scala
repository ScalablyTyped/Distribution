package typings.chromeApps.chrome.runtime

import typings.chromeApps.chromeAppsStrings.allAutoDetected
import typings.chromeApps.chromeAppsStrings.read_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MediaGalleriesPermission extends Permission {
  
  var mediaGalleries: js.Array[read_ | allAutoDetected] = js.native
}
object MediaGalleriesPermission {
  
  @scala.inline
  def apply(mediaGalleries: js.Array[read_ | allAutoDetected]): MediaGalleriesPermission = {
    val __obj = js.Dynamic.literal(mediaGalleries = mediaGalleries.asInstanceOf[js.Any])
    __obj.asInstanceOf[MediaGalleriesPermission]
  }
  
  @scala.inline
  implicit class MediaGalleriesPermissionOps[Self <: MediaGalleriesPermission] (val x: Self) extends AnyVal {
    
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
    def setMediaGalleriesVarargs(value: (read_ | allAutoDetected)*): Self = this.set("mediaGalleries", js.Array(value :_*))
    
    @scala.inline
    def setMediaGalleries(value: js.Array[read_ | allAutoDetected]): Self = this.set("mediaGalleries", value.asInstanceOf[js.Any])
  }
}
