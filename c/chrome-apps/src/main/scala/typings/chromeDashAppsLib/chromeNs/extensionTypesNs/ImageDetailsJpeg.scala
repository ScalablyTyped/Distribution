package typings
package chromeDashAppsLib.chromeNs.extensionTypesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ImageDetailsJpeg extends ImageDetails {
  /**
    * The format of the resulting image.
    */
  var format: js.UndefOr[chromeDashAppsLib.chromeDashAppsLibStrings.png] = js.undefined
}

object ImageDetailsJpeg {
  @scala.inline
  def apply(format: chromeDashAppsLib.chromeDashAppsLibStrings.png = null): ImageDetailsJpeg = {
    val __obj = js.Dynamic.literal()
    if (format != null) __obj.updateDynamic("format")(format)
    __obj.asInstanceOf[ImageDetailsJpeg]
  }
}

