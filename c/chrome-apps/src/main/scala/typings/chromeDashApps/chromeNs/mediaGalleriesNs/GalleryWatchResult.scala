package typings.chromeDashApps.chromeNs.mediaGalleriesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GalleryWatchResult extends js.Object {
  var galleryId: String
  var success: Boolean
}

object GalleryWatchResult {
  @scala.inline
  def apply(galleryId: String, success: Boolean): GalleryWatchResult = {
    val __obj = js.Dynamic.literal(galleryId = galleryId, success = success)
  
    __obj.asInstanceOf[GalleryWatchResult]
  }
}

