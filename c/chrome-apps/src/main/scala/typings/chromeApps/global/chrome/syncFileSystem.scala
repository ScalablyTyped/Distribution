package typings.chromeApps.global.chrome

import typings.chromeApps.anon.AUTHENTICATIONREQUIRED
import typings.chromeApps.anon.CONFLICTING
import typings.chromeApps.anon.LASTWRITEWIN
import typings.chromeApps.anon.QuotaBytes
import typings.chromeApps.anon.State
import typings.chromeApps.chrome.ToStringLiteral
import typings.chromeApps.chrome.syncFileSystem.FileStatusChangedDetail
import typings.chromeApps.chrome.syncFileSystem.FileStatusInfo
import typings.chromeApps.chromeAppsStrings.AUTHENTICATION_REQUIRED
import typings.chromeApps.chromeAppsStrings.DISABLED
import typings.chromeApps.chromeAppsStrings.INITIALIZING
import typings.chromeApps.chromeAppsStrings.LAST_WRITE_WIN
import typings.chromeApps.chromeAppsStrings.MANUAL
import typings.chromeApps.chromeAppsStrings.PENDING
import typings.chromeApps.chromeAppsStrings.RUNNING
import typings.chromeApps.chromeAppsStrings.SYNCED
import typings.chromeApps.chromeAppsStrings.TEMPORARY_UNAVAILABLE
import typings.chromeApps.chromeAppsStrings.added_
import typings.chromeApps.chromeAppsStrings.authentication_required_
import typings.chromeApps.chromeAppsStrings.conflicting_
import typings.chromeApps.chromeAppsStrings.deleted_
import typings.chromeApps.chromeAppsStrings.disabled__
import typings.chromeApps.chromeAppsStrings.initializing_
import typings.chromeApps.chromeAppsStrings.last_write_win_
import typings.chromeApps.chromeAppsStrings.local_to_remote_
import typings.chromeApps.chromeAppsStrings.manual__
import typings.chromeApps.chromeAppsStrings.pending_
import typings.chromeApps.chromeAppsStrings.remote_to_local_
import typings.chromeApps.chromeAppsStrings.running_
import typings.chromeApps.chromeAppsStrings.synced_
import typings.chromeApps.chromeAppsStrings.temporary_unavailable_
import typings.chromeApps.chromeAppsStrings.updated_
import typings.filesystem.FileEntry
import typings.filesystem.FileSystem
import typings.std.Exclude
import scala.scalajs.js
import scala.scalajs.js.`|`
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
@JSGlobal("chrome.syncFileSystem")
@js.native
object syncFileSystem extends js.Object {
  
  /**
    * Gets the current conflict resolution policy.
    * @see ConflictResolutionPolicy
    */
  def getConflictResolutionPolicy(
    callback: js.Function1[
      /* policy */ ToStringLiteral[
        LASTWRITEWIN, 
        /* keyof chrome-apps.anon.LASTWRITEWIN */ LAST_WRITE_WIN | MANUAL, 
        Exclude[
          /* keyof chrome-apps.anon.LASTWRITEWIN */ LAST_WRITE_WIN | MANUAL, 
          last_write_win_ | manual__
        ]
      ], 
      Unit
    ]
  ): Unit = js.native
  
  /**
    * Returns the FileStatus for the given fileEntry.
    * Note that 'conflicting' state only happens when
    * the service's conflict resolution policy is set to 'manual'.
    * @see FileStatus
    * */
  def getFileStatus(
    fileEntry: FileEntry,
    callback: js.Function1[
      /* status */ ToStringLiteral[
        CONFLICTING, 
        /* keyof chrome-apps.anon.CONFLICTING */ SYNCED | PENDING | typings.chromeApps.chromeAppsStrings.CONFLICTING, 
        Exclude[
          /* keyof chrome-apps.anon.CONFLICTING */ SYNCED | PENDING | typings.chromeApps.chromeAppsStrings.CONFLICTING, 
          synced_ | pending_ | conflicting_
        ]
      ], 
      Unit
    ]
  ): Unit = js.native
  
  /** Returns each FileStatus for the given fileEntry array. Typically called with the result from dirReader.readEntries(). */
  def getFileStatuses(
    fileEntries: js.Array[FileEntry],
    callback: js.Function1[/* status */ js.Array[FileStatusInfo], Unit]
  ): Unit = js.native
  
  /**
    * Returns the current sync backend status.
    * @since Chrome 31.
    * @param callback
    * @see ServiceStatus
    */
  def getServiceStatus(
    callback: js.Function1[
      /* status */ ToStringLiteral[
        AUTHENTICATIONREQUIRED, 
        /* keyof chrome-apps.anon.AUTHENTICATIONREQUIRED */ INITIALIZING | RUNNING | AUTHENTICATION_REQUIRED | TEMPORARY_UNAVAILABLE | DISABLED, 
        Exclude[
          /* keyof chrome-apps.anon.AUTHENTICATIONREQUIRED */ INITIALIZING | RUNNING | AUTHENTICATION_REQUIRED | TEMPORARY_UNAVAILABLE | DISABLED, 
          temporary_unavailable_ | authentication_required_ | disabled__ | initializing_ | running_
        ]
      ], 
      Unit
    ]
  ): Unit = js.native
  
  /**
    * Returns the current usage and quota in bytes for the 'syncable' file storage for the app.
    * @param fileSystem
    * @param callback
    */
  def getUsageAndQuota(fileSystem: FileSystem, callback: js.Function1[/* info */ QuotaBytes, Unit]): Unit = js.native
  
  /** Fired when a file has been updated by the background sync service. */
  val onFileStatusChanged: typings.chromeApps.chrome.events.Event[js.Function1[/* detail */ FileStatusChangedDetail, Unit]] = js.native
  
  /**
    * Fired when an error or other status change has happened in the sync backend
    * (for example, when the sync is temporarily disabled due to network or authentication error).
    * @see ServiceStatus
    */
  val onServiceStatusChanged: typings.chromeApps.chrome.events.Event[js.Function1[/* detail */ State, Unit]] = js.native
  
  /**
    * Returns a syncable filesystem backed by Google Drive.
    * The returned DOMFileSystem instance can be operated on
    * in the same way as the Temporary and Persistant file systems
    * @see[More information]{@link http://dev.w3.org/2009/dap/file-system/file-dir-sys.html}
    * @description
    * Calling this multiple times from the same app will return the same handle to the same file system.
    * Note this call can fail.
    * For example, if the user is not signed in to Chrome
    * or if there is no network operation. To handle these
    * errors it is important chrome.runtime.lastError is
    * checked in the callback.
    * @param callback A callback type for requestFileSystem.
    */
  def requestFileSystem(callback: js.Function1[/* fileSystem */ FileSystem, Unit]): Unit = js.native
  
  /**
    * Sets the default conflict resolution policy for the 'syncable' file storage
    * for the app. By default it is set to 'last_write_win'. When conflict resolution
    * policy is set to 'last_write_win' conflicts for existing files are automatically
    * resolved next time the file is updated. |callback| can be optionally given to
    * know if the request has succeeded or not.
    * @param policy Policy
    * @see ConflictResolutionPolicy
    * @param [callback] A generic result callback to indicate success or failure.
    */
  def setConflictResolutionPolicy(
    policy: ToStringLiteral[
      LASTWRITEWIN, 
      /* keyof chrome-apps.anon.LASTWRITEWIN */ LAST_WRITE_WIN | MANUAL, 
      Exclude[
        /* keyof chrome-apps.anon.LASTWRITEWIN */ LAST_WRITE_WIN | MANUAL, 
        last_write_win_ | manual__
      ]
    ]
  ): Unit = js.native
  def setConflictResolutionPolicy(
    policy: ToStringLiteral[
      LASTWRITEWIN, 
      /* keyof chrome-apps.anon.LASTWRITEWIN */ LAST_WRITE_WIN | MANUAL, 
      Exclude[
        /* keyof chrome-apps.anon.LASTWRITEWIN */ LAST_WRITE_WIN | MANUAL, 
        last_write_win_ | manual__
      ]
    ],
    callback: js.Function0[Unit]
  ): Unit = js.native
  
  @js.native
  object ConflictResolutionPolicy extends js.Object {
    
    var LAST_WRITE_WIN: last_write_win_ = js.native
    
    var MANUAL: manual__ = js.native
  }
  
  /**
    * @enum
    * 'synced'
    *  - Not conflicting and has no pending local changes.
    * 'pending'
    *  - Has one or more pending local changes that haven't been synchronized.
    * 'conflicting'
    *  - File conflicts with remote version and must be resolved manually.
    */
  @js.native
  object FileStatus extends js.Object {
    
    var CONFLICTING: conflicting_ = js.native
    
    var PENDING: pending_ = js.native
    
    var SYNCED: synced_ = js.native
  }
  
  /**
    * @enum
    * 'initializing'
    *  - The sync service is being initialized (e.g. restoring data from the database, checking connectivity and authenticating to the service etc).
    * 'running'
    *  - The sync service is up and running.
    * 'authentication_required'
    *  - The sync service is not synchronizing files because the remote service needs to be authenticated by the user to proceed.
    * 'temporary_unavailable'
    *  - The sync service is not synchronizing files because the remote service is (temporarily) unavailable due to some recoverable errors, e.g. network is offline, the remote service is down or not reachable etc. More details should be given by |description| parameter in OnServiceInfoUpdated (which could contain service-specific details).
    * 'disabled'
    *  - The sync service is disabled and the content will never sync. (E.g. this could happen when the user has no account on the remote service or the sync service has had an unrecoverable error.)
    */
  @js.native
  object ServiceStatus extends js.Object {
    
    var AUTHENTICATION_REQUIRED: authentication_required_ = js.native
    
    var DISABLED: disabled__ = js.native
    
    var INITIALIZING: initializing_ = js.native
    
    var RUNNING: running_ = js.native
    
    var TEMPORARY_UNAVAILABLE: temporary_unavailable_ = js.native
  }
  
  @js.native
  object SyncAction extends js.Object {
    
    var ADDED: added_ = js.native
    
    var DELETED: deleted_ = js.native
    
    var UPDATED: updated_ = js.native
  }
  
  @js.native
  object SyncDirection extends js.Object {
    
    var LOCAL_TO_REMOTE: local_to_remote_ = js.native
    
    var REMOTE_TO_LOCAL: remote_to_local_ = js.native
  }
}
