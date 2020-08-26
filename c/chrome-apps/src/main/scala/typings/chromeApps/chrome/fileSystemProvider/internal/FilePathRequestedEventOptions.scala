package typings.chromeApps.chrome.fileSystemProvider.internal

import typings.chromeApps.chrome.integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @private
  * @internal
  */
@js.native
trait FilePathRequestedEventOptions extends RequestedEventOptions {
  /** The path of the entry for the operation */
  var filePath: String = js.native
}

object FilePathRequestedEventOptions {
  @scala.inline
  def apply(filePath: String, fileSystemId: String, requestId: integer): FilePathRequestedEventOptions = {
    val __obj = js.Dynamic.literal(filePath = filePath.asInstanceOf[js.Any], fileSystemId = fileSystemId.asInstanceOf[js.Any], requestId = requestId.asInstanceOf[js.Any])
    __obj.asInstanceOf[FilePathRequestedEventOptions]
  }
  @scala.inline
  implicit class FilePathRequestedEventOptionsOps[Self <: FilePathRequestedEventOptions] (val x: Self) extends AnyVal {
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
    def setFilePath(value: String): Self = this.set("filePath", value.asInstanceOf[js.Any])
  }
  
}

