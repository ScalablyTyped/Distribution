package typings
package chromeDashAppsLib.chromeNs.mediaGalleriesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ScanProgressEventArgs extends js.Object {
  /**
    * Appoximate number of media files found;
    * some file types can be either audio or video
    * and are included in both counts.
    */
  var audioCount: js.UndefOr[chromeDashAppsLib.chromeNs.integer] = js.undefined
  /** The number of Galleries found. */
  var galleryCount: js.UndefOr[chromeDashAppsLib.chromeNs.integer] = js.undefined
  var imageCount: js.UndefOr[chromeDashAppsLib.chromeNs.integer] = js.undefined
  /** The type of progress event, i.e. start, finish, etc. */
  var `type`: ScanProgressType
  var videoCount: js.UndefOr[chromeDashAppsLib.chromeNs.integer] = js.undefined
}

object ScanProgressEventArgs {
  @scala.inline
  def apply(
    `type`: ScanProgressType,
    audioCount: js.UndefOr[chromeDashAppsLib.chromeNs.integer] = js.undefined,
    galleryCount: js.UndefOr[chromeDashAppsLib.chromeNs.integer] = js.undefined,
    imageCount: js.UndefOr[chromeDashAppsLib.chromeNs.integer] = js.undefined,
    videoCount: js.UndefOr[chromeDashAppsLib.chromeNs.integer] = js.undefined
  ): ScanProgressEventArgs = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    if (!js.isUndefined(audioCount)) __obj.updateDynamic("audioCount")(audioCount)
    if (!js.isUndefined(galleryCount)) __obj.updateDynamic("galleryCount")(galleryCount)
    if (!js.isUndefined(imageCount)) __obj.updateDynamic("imageCount")(imageCount)
    if (!js.isUndefined(videoCount)) __obj.updateDynamic("videoCount")(videoCount)
    __obj.asInstanceOf[ScanProgressEventArgs]
  }
}

