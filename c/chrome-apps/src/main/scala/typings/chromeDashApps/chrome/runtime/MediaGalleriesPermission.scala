package typings.chromeDashApps.chrome.runtime

import typings.chromeDashApps.chromeDashAppsStrings.allAutoDetected
import typings.chromeDashApps.chromeDashAppsStrings.read
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MediaGalleriesPermission extends Permission {
  var mediaGalleries: js.Array[read | allAutoDetected]
}

object MediaGalleriesPermission {
  @scala.inline
  def apply(mediaGalleries: js.Array[read | allAutoDetected]): MediaGalleriesPermission = {
    val __obj = js.Dynamic.literal(mediaGalleries = mediaGalleries)
  
    __obj.asInstanceOf[MediaGalleriesPermission]
  }
}

