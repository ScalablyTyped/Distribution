package typings.chromeApps.chrome.mediaGalleries

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GalleryChangedEventArgs extends js.Object {
  var galleryId: String = js.native
  var `type`: GalleryChangedType = js.native
}

object GalleryChangedEventArgs {
  @scala.inline
  def apply(galleryId: String, `type`: GalleryChangedType): GalleryChangedEventArgs = {
    val __obj = js.Dynamic.literal(galleryId = galleryId.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[GalleryChangedEventArgs]
  }
  @scala.inline
  implicit class GalleryChangedEventArgsOps[Self <: GalleryChangedEventArgs] (val x: Self) extends AnyVal {
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
    def setGalleryId(value: String): Self = this.set("galleryId", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: GalleryChangedType): Self = this.set("type", value.asInstanceOf[js.Any])
  }
  
}

