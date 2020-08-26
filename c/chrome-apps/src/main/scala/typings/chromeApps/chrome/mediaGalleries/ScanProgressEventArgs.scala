package typings.chromeApps.chrome.mediaGalleries

import typings.chromeApps.chrome.integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ScanProgressEventArgs extends js.Object {
  /**
    * Appoximate number of media files found;
    * some file types can be either audio or video
    * and are included in both counts.
    */
  var audioCount: js.UndefOr[integer] = js.native
  /** The number of Galleries found. */
  var galleryCount: js.UndefOr[integer] = js.native
  var imageCount: js.UndefOr[integer] = js.native
  /** The type of progress event, i.e. start, finish, etc. */
  var `type`: ScanProgressType = js.native
  var videoCount: js.UndefOr[integer] = js.native
}

object ScanProgressEventArgs {
  @scala.inline
  def apply(`type`: ScanProgressType): ScanProgressEventArgs = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScanProgressEventArgs]
  }
  @scala.inline
  implicit class ScanProgressEventArgsOps[Self <: ScanProgressEventArgs] (val x: Self) extends AnyVal {
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
    def setType(value: ScanProgressType): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setAudioCount(value: integer): Self = this.set("audioCount", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAudioCount: Self = this.set("audioCount", js.undefined)
    @scala.inline
    def setGalleryCount(value: integer): Self = this.set("galleryCount", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGalleryCount: Self = this.set("galleryCount", js.undefined)
    @scala.inline
    def setImageCount(value: integer): Self = this.set("imageCount", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteImageCount: Self = this.set("imageCount", js.undefined)
    @scala.inline
    def setVideoCount(value: integer): Self = this.set("videoCount", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVideoCount: Self = this.set("videoCount", js.undefined)
  }
  
}

