package typings.chromeApps.chrome.fileSystemProvider

import typings.chromeApps.chrome.fileSystemProvider.internal.RequestedEventOptions
import typings.chromeApps.chrome.integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CopyEntryRequestedEventOptions extends RequestedEventOptions {
  /** The source path for the operation. */
  var sourcePath: String = js.native
  /** The destination path for the operation. */
  var targetPath: String = js.native
}

object CopyEntryRequestedEventOptions {
  @scala.inline
  def apply(fileSystemId: String, requestId: integer, sourcePath: String, targetPath: String): CopyEntryRequestedEventOptions = {
    val __obj = js.Dynamic.literal(fileSystemId = fileSystemId.asInstanceOf[js.Any], requestId = requestId.asInstanceOf[js.Any], sourcePath = sourcePath.asInstanceOf[js.Any], targetPath = targetPath.asInstanceOf[js.Any])
    __obj.asInstanceOf[CopyEntryRequestedEventOptions]
  }
  @scala.inline
  implicit class CopyEntryRequestedEventOptionsOps[Self <: CopyEntryRequestedEventOptions] (val x: Self) extends AnyVal {
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
    def setSourcePath(value: String): Self = this.set("sourcePath", value.asInstanceOf[js.Any])
    @scala.inline
    def setTargetPath(value: String): Self = this.set("targetPath", value.asInstanceOf[js.Any])
  }
  
}

