package typings.chromeApps.chrome.mediaGalleries

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GalleryWatchResult extends js.Object {
  var galleryId: String = js.native
  var success: Boolean = js.native
}

object GalleryWatchResult {
  @scala.inline
  def apply(galleryId: String, success: Boolean): GalleryWatchResult = {
    val __obj = js.Dynamic.literal(galleryId = galleryId.asInstanceOf[js.Any], success = success.asInstanceOf[js.Any])
    __obj.asInstanceOf[GalleryWatchResult]
  }
  @scala.inline
  implicit class GalleryWatchResultOps[Self <: GalleryWatchResult] (val x: Self) extends AnyVal {
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
    def setSuccess(value: Boolean): Self = this.set("success", value.asInstanceOf[js.Any])
  }
  
}

