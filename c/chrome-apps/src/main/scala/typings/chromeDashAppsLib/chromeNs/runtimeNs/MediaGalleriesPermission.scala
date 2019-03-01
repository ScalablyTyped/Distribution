package typings
package chromeDashAppsLib.chromeNs.runtimeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MediaGalleriesPermission extends Permission {
  var mediaGalleries: js.Array[
    chromeDashAppsLib.chromeDashAppsLibStrings.read | chromeDashAppsLib.chromeDashAppsLibStrings.allAutoDetected
  ]
}

object MediaGalleriesPermission {
  @scala.inline
  def apply(
    mediaGalleries: js.Array[
      chromeDashAppsLib.chromeDashAppsLibStrings.read | chromeDashAppsLib.chromeDashAppsLibStrings.allAutoDetected
    ]
  ): MediaGalleriesPermission = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("mediaGalleries")(mediaGalleries)
    __obj.asInstanceOf[MediaGalleriesPermission]
  }
}

