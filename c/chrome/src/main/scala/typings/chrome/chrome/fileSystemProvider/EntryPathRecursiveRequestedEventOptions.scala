package typings.chrome.chrome.fileSystemProvider

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EntryPathRecursiveRequestedEventOptions extends EntryPathRequestedEventOptions {
  /** Whether the operation is recursive (for directories only). */
  var recursive: Boolean = js.native
}

object EntryPathRecursiveRequestedEventOptions {
  @scala.inline
  def apply(entryPath: String, fileSystemId: String, recursive: Boolean, requestId: Double): EntryPathRecursiveRequestedEventOptions = {
    val __obj = js.Dynamic.literal(entryPath = entryPath.asInstanceOf[js.Any], fileSystemId = fileSystemId.asInstanceOf[js.Any], recursive = recursive.asInstanceOf[js.Any], requestId = requestId.asInstanceOf[js.Any])
    __obj.asInstanceOf[EntryPathRecursiveRequestedEventOptions]
  }
  @scala.inline
  implicit class EntryPathRecursiveRequestedEventOptionsOps[Self <: EntryPathRecursiveRequestedEventOptions] (val x: Self) extends AnyVal {
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

