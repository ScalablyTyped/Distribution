package typings.chrome.anon

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ImageData extends js.Object {
  var imageData: js.UndefOr[typings.std.ImageData | StringDictionary[typings.std.ImageData]] = js.native
}

object ImageData {
  @scala.inline
  def apply(): ImageData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ImageData]
  }
  @scala.inline
  implicit class ImageDataOps[Self <: ImageData] (val x: Self) extends AnyVal {
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
    def setImageData(value: typings.std.ImageData | StringDictionary[typings.std.ImageData]): Self = this.set("imageData", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteImageData: Self = this.set("imageData", js.undefined)
  }
  
}

