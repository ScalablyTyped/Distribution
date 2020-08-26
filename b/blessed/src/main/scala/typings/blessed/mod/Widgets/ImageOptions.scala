package typings.blessed.mod.Widgets

import typings.blessed.blessedStrings.ansi
import typings.blessed.blessedStrings.overlay
import typings.blessed.blessedStrings.w3m
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ImageOptions extends BoxOptions {
  /**
    * path to image.
    */
  var file: String = js.native
  /**
    * path to w3mimgdisplay. if a proper w3mimgdisplay path is not given, blessed will search the
    * entire disk for the binary.
    */
  var `type`: ansi | overlay | w3m = js.native
}

object ImageOptions {
  @scala.inline
  def apply(file: String, `type`: ansi | overlay | w3m): ImageOptions = {
    val __obj = js.Dynamic.literal(file = file.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImageOptions]
  }
  @scala.inline
  implicit class ImageOptionsOps[Self <: ImageOptions] (val x: Self) extends AnyVal {
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
    def setFile(value: String): Self = this.set("file", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: ansi | overlay | w3m): Self = this.set("type", value.asInstanceOf[js.Any])
  }
  
}

