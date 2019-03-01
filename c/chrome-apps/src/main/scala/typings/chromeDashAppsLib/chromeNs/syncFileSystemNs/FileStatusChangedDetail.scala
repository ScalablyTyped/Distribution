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
        /* import warning: ImportType.apply Failed type conversion: chrome-apps.Anon_ADDED[keyof chrome-apps.Anon_ADDED] */ js.Any
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
        /* import warning: ImportType.apply Failed type conversion: chrome-apps.Anon_LOCALTOREMOTE[keyof chrome-apps.Anon_LOCALTOREMOTE] */ js.Any
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
      /* import warning: ImportType.apply Failed type conversion: chrome-apps.Anon_CONFLICTING[keyof chrome-apps.Anon_CONFLICTING] */ js.Any
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
        /* import warning: ImportType.apply Failed type conversion: chrome-apps.Anon_CONFLICTING[keyof chrome-apps.Anon_CONFLICTING] */ js.Any
      ]
    ],
    action: chromeDashAppsLib.chromeNs.ToStringLiteral[
      chromeDashAppsLib.Anon_ADDED, 
      java.lang.String, 
      stdLib.Exclude[
        java.lang.String, 
        /* import warning: ImportType.apply Failed type conversion: chrome-apps.Anon_ADDED[keyof chrome-apps.Anon_ADDED] */ js.Any
      ]
    ] = null,
    direction: chromeDashAppsLib.chromeNs.ToStringLiteral[
      chromeDashAppsLib.Anon_LOCALTOREMOTE, 
      java.lang.String, 
      stdLib.Exclude[
        java.lang.String, 
        /* import warning: ImportType.apply Failed type conversion: chrome-apps.Anon_LOCALTOREMOTE[keyof chrome-apps.Anon_LOCALTOREMOTE] */ js.Any
      ]
    ] = null
  ): FileStatusChangedDetail = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("fileEntry")(fileEntry)
    __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    if (action != null) __obj.updateDynamic("action")(action.asInstanceOf[js.Any])
    if (direction != null) __obj.updateDynamic("direction")(direction.asInstanceOf[js.Any])
    __obj.asInstanceOf[FileStatusChangedDetail]
  }
}

