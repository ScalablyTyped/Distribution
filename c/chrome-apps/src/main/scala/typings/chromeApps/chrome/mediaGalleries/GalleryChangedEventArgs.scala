package typings.chromeApps.chrome.mediaGalleries

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GalleryChangedEventArgs extends js.Object {
  var galleryId: String
  var `type`: GalleryChangedType
}

object GalleryChangedEventArgs {
  @scala.inline
  def apply(galleryId: String, `type`: GalleryChangedType): GalleryChangedEventArgs = {
    val __obj = js.Dynamic.literal(galleryId = galleryId.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[GalleryChangedEventArgs]
  }
}

