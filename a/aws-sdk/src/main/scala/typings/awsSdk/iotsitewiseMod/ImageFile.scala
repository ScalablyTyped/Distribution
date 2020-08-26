package typings.awsSdk.iotsitewiseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ImageFile extends js.Object {
  /**
    * The image file contents, represented as a base64-encoded string. The file size must be less than 1 MB.
    */
  var data: ImageFileData = js.native
  /**
    * The file type of the image.
    */
  var `type`: ImageFileType = js.native
}

object ImageFile {
  @scala.inline
  def apply(data: ImageFileData, `type`: ImageFileType): ImageFile = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImageFile]
  }
  @scala.inline
  implicit class ImageFileOps[Self <: ImageFile] (val x: Self) extends AnyVal {
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
    def setData(value: ImageFileData): Self = this.set("data", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: ImageFileType): Self = this.set("type", value.asInstanceOf[js.Any])
  }
  
}

