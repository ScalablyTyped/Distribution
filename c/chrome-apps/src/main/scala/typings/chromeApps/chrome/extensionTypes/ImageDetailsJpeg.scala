package typings.chromeApps.chrome.extensionTypes

import typings.chromeApps.chromeAppsStrings.png
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ImageDetailsJpeg extends ImageDetails {
  /**
    * The format of the resulting image.
    */
  var format: js.UndefOr[png] = js.native
}

object ImageDetailsJpeg {
  @scala.inline
  def apply(): ImageDetailsJpeg = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ImageDetailsJpeg]
  }
  @scala.inline
  implicit class ImageDetailsJpegOps[Self <: ImageDetailsJpeg] (val x: Self) extends AnyVal {
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
    def setFormat(value: png): Self = this.set("format", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFormat: Self = this.set("format", js.undefined)
  }
  
}

