package typings
package chromeDashAppsLib.chromeNs.mediaGalleriesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GalleryWatchResult extends js.Object {
  var galleryId: java.lang.String
  var success: scala.Boolean
}

object GalleryWatchResult {
  @scala.inline
  def apply(galleryId: java.lang.String, success: scala.Boolean): GalleryWatchResult = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("galleryId")(galleryId)
    __obj.updateDynamic("success")(success)
    __obj.asInstanceOf[GalleryWatchResult]
  }
}

