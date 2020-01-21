package typings.chromeApps.chrome.mediaGalleries

import typings.chromeApps.chrome.integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ScanProgressEventArgs extends js.Object {
  /**
    * Appoximate number of media files found;
    * some file types can be either audio or video
    * and are included in both counts.
    */
  var audioCount: js.UndefOr[integer] = js.undefined
  /** The number of Galleries found. */
  var galleryCount: js.UndefOr[integer] = js.undefined
  var imageCount: js.UndefOr[integer] = js.undefined
  /** The type of progress event, i.e. start, finish, etc. */
  var `type`: ScanProgressType
  var videoCount: js.UndefOr[integer] = js.undefined
}

object ScanProgressEventArgs {
  @scala.inline
  def apply(
    `type`: ScanProgressType,
    audioCount: Int | Double = null,
    galleryCount: Int | Double = null,
    imageCount: Int | Double = null,
    videoCount: Int | Double = null
  ): ScanProgressEventArgs = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (audioCount != null) __obj.updateDynamic("audioCount")(audioCount.asInstanceOf[js.Any])
    if (galleryCount != null) __obj.updateDynamic("galleryCount")(galleryCount.asInstanceOf[js.Any])
    if (imageCount != null) __obj.updateDynamic("imageCount")(imageCount.asInstanceOf[js.Any])
    if (videoCount != null) __obj.updateDynamic("videoCount")(videoCount.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScanProgressEventArgs]
  }
}

