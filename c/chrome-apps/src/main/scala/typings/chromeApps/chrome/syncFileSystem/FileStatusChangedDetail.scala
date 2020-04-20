package typings.chromeApps.chrome.syncFileSystem

import typings.chromeApps.AnonADDED
import typings.chromeApps.AnonCONFLICTING
import typings.chromeApps.AnonLOCALTOREMOTE
import typings.chromeApps.chrome.ToStringLiteral
import typings.chromeApps.chromeAppsStrings.ADDED
import typings.chromeApps.chromeAppsStrings.CONFLICTING
import typings.chromeApps.chromeAppsStrings.DELETED
import typings.chromeApps.chromeAppsStrings.LOCAL_TO_REMOTE
import typings.chromeApps.chromeAppsStrings.PENDING
import typings.chromeApps.chromeAppsStrings.REMOTE_TO_LOCAL
import typings.chromeApps.chromeAppsStrings.SYNCED
import typings.chromeApps.chromeAppsStrings.UPDATED
import typings.chromeApps.chromeAppsStrings.added_
import typings.chromeApps.chromeAppsStrings.conflicting_
import typings.chromeApps.chromeAppsStrings.deleted_
import typings.chromeApps.chromeAppsStrings.local_to_remote_
import typings.chromeApps.chromeAppsStrings.pending_
import typings.chromeApps.chromeAppsStrings.remote_to_local_
import typings.chromeApps.chromeAppsStrings.synced_
import typings.chromeApps.chromeAppsStrings.updated_
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
  var action: js.UndefOr[
    ToStringLiteral[
      AnonADDED, 
      ADDED | UPDATED | DELETED, 
      Exclude[ADDED | UPDATED | DELETED, added_ | updated_ | deleted_]
    ]
  ] = js.undefined
  /**
    * Sync direction for the onFileStatusChanged event.
    * Only applies if status is 'synced'.
    * @see SyncDirection
    */
  var direction: js.UndefOr[
    ToStringLiteral[
      AnonLOCALTOREMOTE, 
      LOCAL_TO_REMOTE | REMOTE_TO_LOCAL, 
      Exclude[LOCAL_TO_REMOTE | REMOTE_TO_LOCAL, local_to_remote_ | remote_to_local_]
    ]
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
  var status: ToStringLiteral[
    AnonCONFLICTING, 
    SYNCED | PENDING | CONFLICTING, 
    Exclude[SYNCED | PENDING | CONFLICTING, synced_ | pending_ | conflicting_]
  ]
}

object FileStatusChangedDetail {
  @scala.inline
  def apply(
    fileEntry: FileEntry,
    status: ToStringLiteral[
      AnonCONFLICTING, 
      SYNCED | PENDING | CONFLICTING, 
      Exclude[SYNCED | PENDING | CONFLICTING, synced_ | pending_ | conflicting_]
    ],
    action: ToStringLiteral[
      AnonADDED, 
      ADDED | UPDATED | DELETED, 
      Exclude[ADDED | UPDATED | DELETED, added_ | updated_ | deleted_]
    ] = null,
    direction: ToStringLiteral[
      AnonLOCALTOREMOTE, 
      LOCAL_TO_REMOTE | REMOTE_TO_LOCAL, 
      Exclude[LOCAL_TO_REMOTE | REMOTE_TO_LOCAL, local_to_remote_ | remote_to_local_]
    ] = null
  ): FileStatusChangedDetail = {
    val __obj = js.Dynamic.literal(fileEntry = fileEntry.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    if (action != null) __obj.updateDynamic("action")(action.asInstanceOf[js.Any])
    if (direction != null) __obj.updateDynamic("direction")(direction.asInstanceOf[js.Any])
    __obj.asInstanceOf[FileStatusChangedDetail]
  }
}

