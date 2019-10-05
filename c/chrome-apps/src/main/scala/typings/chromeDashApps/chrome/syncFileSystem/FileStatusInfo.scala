package typings.chromeDashApps.chrome.syncFileSystem

import typings.chromeDashApps.Anon_CONFLICTING
import typings.chromeDashApps.chrome.ToStringLiteral
import typings.chromeDashApps.chromeDashAppsStrings.conflicting
import typings.chromeDashApps.chromeDashAppsStrings.pending
import typings.chromeDashApps.chromeDashAppsStrings.synced
import typings.filesystem.FileEntry
import typings.std.Exclude
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FileStatusInfo extends js.Object {
  /** Optional error that is only returned if there was a problem retrieving the FileStatus for the given file. */
  var error: js.UndefOr[String] = js.undefined
  /** One of the Entry's originally given to getFileStatuses. */
  var fileEntry: FileEntry
  /**
    * Status value
    * @see FileStatus
    */
  var status: ToStringLiteral[Anon_CONFLICTING, String, Exclude[String, synced | pending | conflicting]]
}

object FileStatusInfo {
  @scala.inline
  def apply(
    fileEntry: FileEntry,
    status: ToStringLiteral[Anon_CONFLICTING, String, Exclude[String, synced | pending | conflicting]],
    error: String = null
  ): FileStatusInfo = {
    val __obj = js.Dynamic.literal(fileEntry = fileEntry, status = status.asInstanceOf[js.Any])
    if (error != null) __obj.updateDynamic("error")(error)
    __obj.asInstanceOf[FileStatusInfo]
  }
}

