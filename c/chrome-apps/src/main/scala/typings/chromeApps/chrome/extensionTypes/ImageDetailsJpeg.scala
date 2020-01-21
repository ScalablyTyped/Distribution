package typings.chromeApps.chrome.extensionTypes

import typings.chromeApps.chromeAppsStrings.png
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ImageDetailsJpeg extends ImageDetails {
  /**
    * The format of the resulting image.
    */
  var format: js.UndefOr[png] = js.undefined
}

object ImageDetailsJpeg {
  @scala.inline
  def apply(format: png = null): ImageDetailsJpeg = {
    val __obj = js.Dynamic.literal()
    if (format != null) __obj.updateDynamic("format")(format.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImageDetailsJpeg]
  }
}

