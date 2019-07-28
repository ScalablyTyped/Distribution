package typings.chrome.chromeNs.downloadsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DownloadFilenameSuggestion extends js.Object {
  /** Optional. The action to take if filename already exists.  */
  var conflictAction: js.UndefOr[String] = js.undefined
  /** The DownloadItem's new target DownloadItem.filename, as a path relative to the user's default Downloads directory, possibly containing subdirectories. Absolute paths, empty paths, and paths containing back-references ".." will be ignored. */
  var filename: String
}

object DownloadFilenameSuggestion {
  @scala.inline
  def apply(filename: String, conflictAction: String = null): DownloadFilenameSuggestion = {
    val __obj = js.Dynamic.literal(filename = filename)
    if (conflictAction != null) __obj.updateDynamic("conflictAction")(conflictAction)
    __obj.asInstanceOf[DownloadFilenameSuggestion]
  }
}

