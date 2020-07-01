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
}

