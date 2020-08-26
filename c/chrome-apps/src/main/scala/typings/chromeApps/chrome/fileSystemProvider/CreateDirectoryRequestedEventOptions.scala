package typings.chromeApps.chrome.fileSystemProvider

import typings.chromeApps.chrome.fileSystemProvider.internal.RequestedEventOptions
import typings.chromeApps.chrome.integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateDirectoryRequestedEventOptions extends RequestedEventOptions {
  /** The path of the directory which is to be operated on. */
  var directoryPath: String = js.native
  /** Whether the operation is recursive (for directories only). */
  var recursive: Boolean = js.native
}

object CreateDirectoryRequestedEventOptions {
  @scala.inline
  def apply(directoryPath: String, fileSystemId: String, recursive: Boolean, requestId: integer): CreateDirectoryRequestedEventOptions = {
    val __obj = js.Dynamic.literal(directoryPath = directoryPath.asInstanceOf[js.Any], fileSystemId = fileSystemId.asInstanceOf[js.Any], recursive = recursive.asInstanceOf[js.Any], requestId = requestId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateDirectoryRequestedEventOptions]
  }
  @scala.inline
  implicit class CreateDirectoryRequestedEventOptionsOps[Self <: CreateDirectoryRequestedEventOptions] (val x: Self) extends AnyVal {
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
    def setDirectoryPath(value: String): Self = this.set("directoryPath", value.asInstanceOf[js.Any])
    @scala.inline
    def setRecursive(value: Boolean): Self = this.set("recursive", value.asInstanceOf[js.Any])
  }
  
}

