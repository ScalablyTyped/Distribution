package typings.chromeDashApps.chromeNs.extensionTypesNs

import typings.chromeDashApps.chromeDashAppsStrings.jpeg
import typings.chromeDashApps.chromeNs.integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ImageDetailsPng extends ImageDetails {
  /**
    * The format of the resulting image.
    * @default 'jpeg'
    */
  var format: js.UndefOr[jpeg] = js.undefined
  /**
    * Controls the quality of the resulting image.
    * As quality is decreased, the resulting image
    * will have more visual artifacts, and the number
    * of bytes needed to store it will decrease.
    */
  var quality: js.UndefOr[integer] = js.undefined
}

object ImageDetailsPng {
  @scala.inline
  def apply(format: jpeg = null, quality: js.UndefOr[integer] = js.undefined): ImageDetailsPng = {
    val __obj = js.Dynamic.literal()
    if (format != null) __obj.updateDynamic("format")(format)
    if (!js.isUndefined(quality)) __obj.updateDynamic("quality")(quality)
    __obj.asInstanceOf[ImageDetailsPng]
  }
}

