package typings.chrome.chrome.downloads

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DownloadFilenameSuggestion extends js.Object {
  /** Optional. The action to take if filename already exists.  */
  var conflictAction: js.UndefOr[String] = js.native
  /** The DownloadItem's new target DownloadItem.filename, as a path relative to the user's default Downloads directory, possibly containing subdirectories. Absolute paths, empty paths, and paths containing back-references ".." will be ignored. */
  var filename: String = js.native
}

object DownloadFilenameSuggestion {
  @scala.inline
  def apply(filename: String): DownloadFilenameSuggestion = {
    val __obj = js.Dynamic.literal(filename = filename.asInstanceOf[js.Any])
    __obj.asInstanceOf[DownloadFilenameSuggestion]
  }
  @scala.inline
  implicit class DownloadFilenameSuggestionOps[Self <: DownloadFilenameSuggestion] (val x: Self) extends AnyVal {
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
    def setFilename(value: String): Self = this.set("filename", value.asInstanceOf[js.Any])
    @scala.inline
    def setConflictAction(value: String): Self = this.set("conflictAction", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConflictAction: Self = this.set("conflictAction", js.undefined)
  }
  
}

