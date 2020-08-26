package typings.chromeApps.chrome.syncFileSystem

import typings.chromeApps.anon.ADDED
import typings.chromeApps.anon.CONFLICTING
import typings.chromeApps.anon.LOCALTOREMOTE
import typings.chromeApps.chrome.ToStringLiteral
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

@js.native
trait FileStatusChangedDetail extends js.Object {
  /**
    * Sync action taken to fire onFileStatusChanged event.
    * Only applies if status is 'synced'.
    * @see SyncAction
    */
  var action: js.UndefOr[
    ToStringLiteral[
      ADDED, 
      /* keyof chrome-apps.anon.ADDED */ typings.chromeApps.chromeAppsStrings.ADDED | UPDATED | DELETED, 
      Exclude[
        /* keyof chrome-apps.anon.ADDED */ typings.chromeApps.chromeAppsStrings.ADDED | UPDATED | DELETED, 
        added_ | updated_ | deleted_
      ]
    ]
  ] = js.native
  /**
    * Sync direction for the onFileStatusChanged event.
    * Only applies if status is 'synced'.
    * @see SyncDirection
    */
  var direction: js.UndefOr[
    ToStringLiteral[
      LOCALTOREMOTE, 
      /* keyof chrome-apps.anon.LOCALTOREMOTE */ LOCAL_TO_REMOTE | REMOTE_TO_LOCAL, 
      Exclude[
        /* keyof chrome-apps.anon.LOCALTOREMOTE */ LOCAL_TO_REMOTE | REMOTE_TO_LOCAL, 
        local_to_remote_ | remote_to_local_
      ]
    ]
  ] = js.native
  /**
    * fileEntry for the target file whose status has changed.
    * Contains name and path information of synchronized file.
    * On file deletion, fileEntry information will still be
    * available but file will no longer exist.
    */
  var fileEntry: FileEntry = js.native
  /**
    * Resulting file status after onFileStatusChanged event.
    * @see FileStatus
    */
  var status: ToStringLiteral[
    CONFLICTING, 
    /* keyof chrome-apps.anon.CONFLICTING */ SYNCED | PENDING | typings.chromeApps.chromeAppsStrings.CONFLICTING, 
    Exclude[
      /* keyof chrome-apps.anon.CONFLICTING */ SYNCED | PENDING | typings.chromeApps.chromeAppsStrings.CONFLICTING, 
      synced_ | pending_ | conflicting_
    ]
  ] = js.native
}

object FileStatusChangedDetail {
  @scala.inline
  def apply(
    fileEntry: FileEntry,
    status: ToStringLiteral[
      CONFLICTING, 
      /* keyof chrome-apps.anon.CONFLICTING */ SYNCED | PENDING | typings.chromeApps.chromeAppsStrings.CONFLICTING, 
      Exclude[
        /* keyof chrome-apps.anon.CONFLICTING */ SYNCED | PENDING | typings.chromeApps.chromeAppsStrings.CONFLICTING, 
        synced_ | pending_ | conflicting_
      ]
    ]
  ): FileStatusChangedDetail = {
    val __obj = js.Dynamic.literal(fileEntry = fileEntry.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[FileStatusChangedDetail]
  }
  @scala.inline
  implicit class FileStatusChangedDetailOps[Self <: FileStatusChangedDetail] (val x: Self) extends AnyVal {
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
    def setFileEntry(value: FileEntry): Self = this.set("fileEntry", value.asInstanceOf[js.Any])
    @scala.inline
    def setStatus(
      value: ToStringLiteral[
          CONFLICTING, 
          /* keyof chrome-apps.anon.CONFLICTING */ SYNCED | PENDING | typings.chromeApps.chromeAppsStrings.CONFLICTING, 
          Exclude[
            /* keyof chrome-apps.anon.CONFLICTING */ SYNCED | PENDING | typings.chromeApps.chromeAppsStrings.CONFLICTING, 
            synced_ | pending_ | conflicting_
          ]
        ]
    ): Self = this.set("status", value.asInstanceOf[js.Any])
    @scala.inline
    def setAction(
      value: ToStringLiteral[
          ADDED, 
          /* keyof chrome-apps.anon.ADDED */ typings.chromeApps.chromeAppsStrings.ADDED | UPDATED | DELETED, 
          Exclude[
            /* keyof chrome-apps.anon.ADDED */ typings.chromeApps.chromeAppsStrings.ADDED | UPDATED | DELETED, 
            added_ | updated_ | deleted_
          ]
        ]
    ): Self = this.set("action", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAction: Self = this.set("action", js.undefined)
    @scala.inline
    def setDirection(
      value: ToStringLiteral[
          LOCALTOREMOTE, 
          /* keyof chrome-apps.anon.LOCALTOREMOTE */ LOCAL_TO_REMOTE | REMOTE_TO_LOCAL, 
          Exclude[
            /* keyof chrome-apps.anon.LOCALTOREMOTE */ LOCAL_TO_REMOTE | REMOTE_TO_LOCAL, 
            local_to_remote_ | remote_to_local_
          ]
        ]
    ): Self = this.set("direction", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDirection: Self = this.set("direction", js.undefined)
  }
  
}

