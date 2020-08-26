package typings.chrome.chrome.fileSystemProvider

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EntryPathRequestedEventOptions extends RequestedEventOptions {
  /** The path of the entry to which this operation is related to. */
  var entryPath: String = js.native
}

object EntryPathRequestedEventOptions {
  @scala.inline
  def apply(entryPath: String, fileSystemId: String, requestId: Double): EntryPathRequestedEventOptions = {
    val __obj = js.Dynamic.literal(entryPath = entryPath.asInstanceOf[js.Any], fileSystemId = fileSystemId.asInstanceOf[js.Any], requestId = requestId.asInstanceOf[js.Any])
    __obj.asInstanceOf[EntryPathRequestedEventOptions]
  }
  @scala.inline
  implicit class EntryPathRequestedEventOptionsOps[Self <: EntryPathRequestedEventOptions] (val x: Self) extends AnyVal {
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
    def setEntryPath(value: String): Self = this.set("entryPath", value.asInstanceOf[js.Any])
  }
  
}

