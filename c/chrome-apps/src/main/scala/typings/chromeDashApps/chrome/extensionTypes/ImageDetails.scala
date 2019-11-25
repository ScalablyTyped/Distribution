package typings.chromeDashApps.chrome.extensionTypes

import typings.chromeDashApps.chromeDashAppsStrings.jpeg
import typings.chromeDashApps.chromeDashAppsStrings.png
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Details about the format and quality of an image.
  */
/* Rewritten from type alias, can be one of: 
  - typings.chromeDashApps.chrome.extensionTypes.ImageDetailsJpeg
  - typings.chromeDashApps.chrome.extensionTypes.ImageDetailsPng
*/
trait ImageDetails extends js.Object

object ImageDetails {
  @scala.inline
  def ImageDetailsJpeg(format: png = null): ImageDetails = {
    val __obj = js.Dynamic.literal()
    if (format != null) __obj.updateDynamic("format")(format.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImageDetails]
  }
  @scala.inline
  def ImageDetailsPng(format: jpeg = null, quality: Int | Double = null): ImageDetails = {
    val __obj = js.Dynamic.literal()
    if (format != null) __obj.updateDynamic("format")(format.asInstanceOf[js.Any])
    if (quality != null) __obj.updateDynamic("quality")(quality.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImageDetails]
  }
}

