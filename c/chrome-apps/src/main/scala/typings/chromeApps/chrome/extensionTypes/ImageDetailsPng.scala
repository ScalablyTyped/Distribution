package typings.chromeApps.chrome.extensionTypes

import typings.chromeApps.chrome.integer
import typings.chromeApps.chromeAppsStrings.jpeg
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
  def apply(format: jpeg = null, quality: Int | Double = null): ImageDetailsPng = {
    val __obj = js.Dynamic.literal()
    if (format != null) __obj.updateDynamic("format")(format.asInstanceOf[js.Any])
    if (quality != null) __obj.updateDynamic("quality")(quality.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImageDetailsPng]
  }
}

