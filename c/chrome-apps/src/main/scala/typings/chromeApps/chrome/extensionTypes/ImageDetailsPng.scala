package typings.chromeApps.chrome.extensionTypes

import typings.chromeApps.chrome.integer
import typings.chromeApps.chromeAppsStrings.jpeg
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ImageDetailsPng extends ImageDetails {
  /**
    * The format of the resulting image.
    * @default 'jpeg'
    */
  var format: js.UndefOr[jpeg] = js.native
  /**
    * Controls the quality of the resulting image.
    * As quality is decreased, the resulting image
    * will have more visual artifacts, and the number
    * of bytes needed to store it will decrease.
    */
  var quality: js.UndefOr[integer] = js.native
}

object ImageDetailsPng {
  @scala.inline
  def apply(): ImageDetailsPng = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ImageDetailsPng]
  }
  @scala.inline
  implicit class ImageDetailsPngOps[Self <: ImageDetailsPng] (val x: Self) extends AnyVal {
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
    def setFormat(value: jpeg): Self = this.set("format", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFormat: Self = this.set("format", js.undefined)
    @scala.inline
    def setQuality(value: integer): Self = this.set("quality", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteQuality: Self = this.set("quality", js.undefined)
  }
  
}

