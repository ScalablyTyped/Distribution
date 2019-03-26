package typings
package chromeDashAppsLib.chromeNs.syncFileSystemNs

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
    chromeDashAppsLib.chromeNs.ToStringLiteral[
      chromeDashAppsLib.Anon_ADDED, 
      java.lang.String, 
      stdLib.Exclude[
        java.lang.String, 
        chromeDashAppsLib.chromeDashAppsLibStrings.added | chromeDashAppsLib.chromeDashAppsLibStrings.updated | chromeDashAppsLib.chromeDashAppsLibStrings.deleted
      ]
    ]
  ] = js.undefined
  /**
    * Sync direction for the onFileStatusChanged event.
    * Only applies if status is 'synced'.
    * @see SyncDirection
    */
  var direction: js.UndefOr[
    chromeDashAppsLib.chromeNs.ToStringLiteral[
      chromeDashAppsLib.Anon_LOCALTOREMOTE, 
      java.lang.String, 
      stdLib.Exclude[
        java.lang.String, 
        chromeDashAppsLib.chromeDashAppsLibStrings.local_to_remote | chromeDashAppsLib.chromeDashAppsLibStrings.remote_to_local
      ]
    ]
  ] = js.undefined
  /**
    * fileEntry for the target file whose status has changed.
    * Contains name and path information of synchronized file.
    * On file deletion, fileEntry information will still be
    * available but file will no longer exist.
    */
  var fileEntry: filesystemLib.FileEntry
  /**
    * Resulting file status after onFileStatusChanged event.
    * @see FileStatus
    */
  var status: chromeDashAppsLib.chromeNs.ToStringLiteral[
    chromeDashAppsLib.Anon_CONFLICTING, 
    java.lang.String, 
    stdLib.Exclude[
      java.lang.String, 
      chromeDashAppsLib.chromeDashAppsLibStrings.synced | chromeDashAppsLib.chromeDashAppsLibStrings.pending | chromeDashAppsLib.chromeDashAppsLibStrings.conflicting
    ]
  ]
}

object FileStatusChangedDetail {
  @scala.inline
  def apply(
    fileEntry: filesystemLib.FileEntry,
    status: chromeDashAppsLib.chromeNs.ToStringLiteral[
      chromeDashAppsLib.Anon_CONFLICTING, 
      java.lang.String, 
      stdLib.Exclude[
        java.lang.String, 
        chromeDashAppsLib.chromeDashAppsLibStrings.synced | chromeDashAppsLib.chromeDashAppsLibStrings.pending | chromeDashAppsLib.chromeDashAppsLibStrings.conflicting
      ]
    ],
    action: chromeDashAppsLib.chromeNs.ToStringLiteral[
      chromeDashAppsLib.Anon_ADDED, 
      java.lang.String, 
      stdLib.Exclude[
        java.lang.String, 
        chromeDashAppsLib.chromeDashAppsLibStrings.added | chromeDashAppsLib.chromeDashAppsLibStrings.updated | chromeDashAppsLib.chromeDashAppsLibStrings.deleted
      ]
    ] = null,
    direction: chromeDashAppsLib.chromeNs.ToStringLiteral[
      chromeDashAppsLib.Anon_LOCALTOREMOTE, 
      java.lang.String, 
      stdLib.Exclude[
        java.lang.String, 
        chromeDashAppsLib.chromeDashAppsLibStrings.local_to_remote | chromeDashAppsLib.chromeDashAppsLibStrings.remote_to_local
      ]
    ] = null
  ): FileStatusChangedDetail = {
    val __obj = js.Dynamic.literal(fileEntry = fileEntry, status = status.asInstanceOf[js.Any])
    if (action != null) __obj.updateDynamic("action")(action.asInstanceOf[js.Any])
    if (direction != null) __obj.updateDynamic("direction")(direction.asInstanceOf[js.Any])
    __obj.asInstanceOf[FileStatusChangedDetail]
  }
}

