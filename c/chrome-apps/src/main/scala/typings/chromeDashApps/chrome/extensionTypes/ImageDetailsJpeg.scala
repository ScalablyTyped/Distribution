package typings.chromeDashApps.chrome.extensionTypes

import typings.chromeDashApps.chromeDashAppsStrings.png
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
    if (format != null) __obj.updateDynamic("format")(format)
    __obj.asInstanceOf[ImageDetailsJpeg]
  }
}

