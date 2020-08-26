package typings.chromeApps.chrome.fileSystemProvider

import typings.chromeApps.chrome.fileSystemProvider.internal.EntryPathRequestedEventOptions
import typings.chromeApps.chrome.integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteEntryRequestedEventOptions extends EntryPathRequestedEventOptions {
  /** Whether the operation is recursive (for directories only). */
  var recursive: Boolean = js.native
}

object DeleteEntryRequestedEventOptions {
  @scala.inline
  def apply(entryPath: String, fileSystemId: String, recursive: Boolean, requestId: integer): DeleteEntryRequestedEventOptions = {
    val __obj = js.Dynamic.literal(entryPath = entryPath.asInstanceOf[js.Any], fileSystemId = fileSystemId.asInstanceOf[js.Any], recursive = recursive.asInstanceOf[js.Any], requestId = requestId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteEntryRequestedEventOptions]
  }
  @scala.inline
  implicit class DeleteEntryRequestedEventOptionsOps[Self <: DeleteEntryRequestedEventOptions] (val x: Self) extends AnyVal {
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
    def setRecursive(value: Boolean): Self = this.set("recursive", value.asInstanceOf[js.Any])
  }
  
}

