package typings
package chromeDashAppsLib.chromeNs.mediaGalleriesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GalleryChangedEventArgs extends js.Object {
  var galleryId: java.lang.String
  var `type`: GalleryChangedType
}

object GalleryChangedEventArgs {
  @scala.inline
  def apply(galleryId: java.lang.String, `type`: GalleryChangedType): GalleryChangedEventArgs = {
    val __obj = js.Dynamic.literal(galleryId = galleryId)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[GalleryChangedEventArgs]
  }
}

