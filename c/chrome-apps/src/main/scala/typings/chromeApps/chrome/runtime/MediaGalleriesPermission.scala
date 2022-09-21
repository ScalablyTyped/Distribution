package typings.chromeApps.chrome.runtime

import typings.chromeApps.chromeAppsStrings.allAutoDetected
import typings.chromeApps.chromeAppsStrings.read_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MediaGalleriesPermission
  extends StObject
     with Permission {
  
  var mediaGalleries: js.Array[read_ | allAutoDetected]
}
object MediaGalleriesPermission {
  
  inline def apply(mediaGalleries: js.Array[read_ | allAutoDetected]): MediaGalleriesPermission = {
    val __obj = js.Dynamic.literal(mediaGalleries = mediaGalleries.asInstanceOf[js.Any])
    __obj.asInstanceOf[MediaGalleriesPermission]
  }
  
  extension [Self <: MediaGalleriesPermission](x: Self) {
    
    inline def setMediaGalleries(value: js.Array[read_ | allAutoDetected]): Self = StObject.set(x, "mediaGalleries", value.asInstanceOf[js.Any])
    
    inline def setMediaGalleriesVarargs(value: (read_ | allAutoDetected)*): Self = StObject.set(x, "mediaGalleries", js.Array(value*))
  }
}
