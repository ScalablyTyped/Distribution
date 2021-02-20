package typings.chromeApps.chrome.runtime

import typings.chromeApps.chromeAppsStrings.allAutoDetected
import typings.chromeApps.chromeAppsStrings.read_
import org.scalablytyped.runtime.StObject
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
  implicit class MediaGalleriesPermissionMutableBuilder[Self <: MediaGalleriesPermission] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMediaGalleries(value: js.Array[read_ | allAutoDetected]): Self = StObject.set(x, "mediaGalleries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMediaGalleriesVarargs(value: (read_ | allAutoDetected)*): Self = StObject.set(x, "mediaGalleries", js.Array(value :_*))
  }
}
