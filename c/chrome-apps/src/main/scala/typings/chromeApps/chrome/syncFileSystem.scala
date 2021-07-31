package typings.chromeApps.chrome

import typings.chromeApps.anon.ADDED
import typings.chromeApps.anon.CONFLICTING
import typings.chromeApps.anon.LOCALTOREMOTE
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
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// #endregion
// #region chrome.syncFileSystem
////////////////////
// SyncFileSystem //
////////////////////
/**
  * Use the chrome.syncFileSystem API to save and synchronize data on Google Drive.
  * This API is NOT for accessing arbitrary user docs stored in Google Drive.
  * It provides app-specific syncable storage for offline and caching usage so that
  * the same data can be available across different clients. Read Manage Data for
  * more on using this API.
  *
  * @requires[Permissions: 'syncFileSystem']
  * @see[Learn more: Manage Data]{@link https://developer.chrome.com/apps/app_storage}
  * @since Chrome 27
  */
object syncFileSystem {
  
  trait FileStatusChangedDetail extends StObject {
    
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
      ] = js.undefined
    
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
        CONFLICTING, 
        /* keyof chrome-apps.anon.CONFLICTING */ SYNCED | PENDING | typings.chromeApps.chromeAppsStrings.CONFLICTING, 
        Exclude[
          /* keyof chrome-apps.anon.CONFLICTING */ SYNCED | PENDING | typings.chromeApps.chromeAppsStrings.CONFLICTING, 
          synced_ | pending_ | conflicting_
        ]
      ]
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
    implicit class FileStatusChangedDetailMutableBuilder[Self <: FileStatusChangedDetail] (val x: Self) extends AnyVal {
      
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
      ): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setActionUndefined: Self = StObject.set(x, "action", js.undefined)
      
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
      ): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDirectionUndefined: Self = StObject.set(x, "direction", js.undefined)
      
      @scala.inline
      def setFileEntry(value: FileEntry): Self = StObject.set(x, "fileEntry", value.asInstanceOf[js.Any])
      
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
      ): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    }
  }
  
  trait FileStatusInfo extends StObject {
    
    /** Optional error that is only returned if there was a problem retrieving the FileStatus for the given file. */
    var error: js.UndefOr[String] = js.undefined
    
    /** One of the Entry's originally given to getFileStatuses. */
    var fileEntry: FileEntry
    
    /**
      * Status value
      * @see FileStatus
      */
    var status: ToStringLiteral[
        CONFLICTING, 
        /* keyof chrome-apps.anon.CONFLICTING */ SYNCED | PENDING | typings.chromeApps.chromeAppsStrings.CONFLICTING, 
        Exclude[
          /* keyof chrome-apps.anon.CONFLICTING */ SYNCED | PENDING | typings.chromeApps.chromeAppsStrings.CONFLICTING, 
          synced_ | pending_ | conflicting_
        ]
      ]
  }
  object FileStatusInfo {
    
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
    ): FileStatusInfo = {
      val __obj = js.Dynamic.literal(fileEntry = fileEntry.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
      __obj.asInstanceOf[FileStatusInfo]
    }
    
    @scala.inline
    implicit class FileStatusInfoMutableBuilder[Self <: FileStatusInfo] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setError(value: String): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
      
      @scala.inline
      def setFileEntry(value: FileEntry): Self = StObject.set(x, "fileEntry", value.asInstanceOf[js.Any])
      
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
      ): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    }
  }
}
