package typings.chrome.chrome.fileSystemProvider

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FilePathLengthRequestedEventOptions extends FilePathRequestedEventOptions {
  /** Number of bytes to be retained after the operation completes. */
  var length: Double = js.native
}

object FilePathLengthRequestedEventOptions {
  @scala.inline
  def apply(filePath: String, fileSystemId: String, length: Double, requestId: Double): FilePathLengthRequestedEventOptions = {
    val __obj = js.Dynamic.literal(filePath = filePath.asInstanceOf[js.Any], fileSystemId = fileSystemId.asInstanceOf[js.Any], length = length.asInstanceOf[js.Any], requestId = requestId.asInstanceOf[js.Any])
    __obj.asInstanceOf[FilePathLengthRequestedEventOptions]
  }
  @scala.inline
  implicit class FilePathLengthRequestedEventOptionsOps[Self <: FilePathLengthRequestedEventOptions] (val x: Self) extends AnyVal {
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
    def setLength(value: Double): Self = this.set("length", value.asInstanceOf[js.Any])
  }
  
}

