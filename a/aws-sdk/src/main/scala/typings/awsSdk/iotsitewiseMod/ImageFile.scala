package typings.awsSdk.iotsitewiseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ImageFile extends js.Object {
  /**
    * The image file contents, represented as a base64-encoded string. The file size must be less than 1 MB.
    */
  var encodedString: ImageFileData = js.native
  /**
    * The file type of the image.
    */
  var fileType: ImageFileType = js.native
}

object ImageFile {
  @scala.inline
  def apply(encodedString: ImageFileData, fileType: ImageFileType): ImageFile = {
    val __obj = js.Dynamic.literal(encodedString = encodedString.asInstanceOf[js.Any], fileType = fileType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImageFile]
  }
}

