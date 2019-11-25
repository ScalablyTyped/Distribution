package typings.chromeDashApps.chrome.syncFileSystem

import typings.chromeDashApps.Anon_ADDED
import typings.chromeDashApps.Anon_CONFLICTING
import typings.chromeDashApps.Anon_LOCALTOREMOTE
import typings.chromeDashApps.chrome.ToStringLiteral
import typings.chromeDashApps.chromeDashAppsStrings.added
import typings.chromeDashApps.chromeDashAppsStrings.conflicting
import typings.chromeDashApps.chromeDashAppsStrings.deleted_
import typings.chromeDashApps.chromeDashAppsStrings.local_to_remote
import typings.chromeDashApps.chromeDashAppsStrings.pending
import typings.chromeDashApps.chromeDashAppsStrings.remote_to_local
import typings.chromeDashApps.chromeDashAppsStrings.synced
import typings.chromeDashApps.chromeDashAppsStrings.updated
import typings.filesystem.FileEntry
import typings.std.Exclude
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FileStatusChangedDetail extends js.Object {
  /**
    * Sync action taken to fire onFileStatusChanged event.
    * Only applies if status is 'synced'.
    * @see SyncAction
    */
  var action: js.UndefOr[ToStringLiteral[Anon_ADDED, String, Exclude[String, added | updated | deleted_]]] = js.undefined
  /**
    * Sync direction for the onFileStatusChanged event.
    * Only applies if status is 'synced'.
    * @see SyncDirection
    */
  var direction: js.UndefOr[
    ToStringLiteral[Anon_LOCALTOREMOTE, String, Exclude[String, local_to_remote | remote_to_local]]
  ] = js.undefined
  /**
    * fileEntry for the target file whose status has changed.
    * Contains name and path information of synchronized file.
    * On file deletion, fileEntry information will still be
    * available but file will no longer exist.
    */
  var fileEntry: FileEntry
  /**
    * Resulting file status after onFileStatusChanged event.
    * @see FileStatus
    */
  var status: ToStringLiteral[Anon_CONFLICTING, String, Exclude[String, synced | pending | conflicting]]
}

object FileStatusChangedDetail {
  @scala.inline
  def apply(
    fileEntry: FileEntry,
    status: ToStringLiteral[Anon_CONFLICTING, String, Exclude[String, synced | pending | conflicting]],
    action: ToStringLiteral[Anon_ADDED, String, Exclude[String, added | updated | deleted_]] = null,
    direction: ToStringLiteral[Anon_LOCALTOREMOTE, String, Exclude[String, local_to_remote | remote_to_local]] = null
  ): FileStatusChangedDetail = {
    val __obj = js.Dynamic.literal(fileEntry = fileEntry.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    if (action != null) __obj.updateDynamic("action")(action.asInstanceOf[js.Any])
    if (direction != null) __obj.updateDynamic("direction")(direction.asInstanceOf[js.Any])
    __obj.asInstanceOf[FileStatusChangedDetail]
  }
}

