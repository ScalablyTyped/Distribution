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
import typings.std.FileSystem
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
  
  @JSGlobal("chrome.syncFileSystem")
  @js.native
  val ^ : js.Any = js.native
  
  object ConflictResolutionPolicy {
    
    @JSGlobal("chrome.syncFileSystem.ConflictResolutionPolicy")
    @js.native
    val ^ : js.Any = js.native
    
    @JSGlobal("chrome.syncFileSystem.ConflictResolutionPolicy.LAST_WRITE_WIN")
    @js.native
    def LAST_WRITE_WIN: last_write_win_ = js.native
    inline def LAST_WRITE_WIN_=(x: last_write_win_): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("LAST_WRITE_WIN")(x.asInstanceOf[js.Any])
    
    @JSGlobal("chrome.syncFileSystem.ConflictResolutionPolicy.MANUAL")
    @js.native
    def MANUAL: manual__ = js.native
    inline def MANUAL_=(x: manual__): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MANUAL")(x.asInstanceOf[js.Any])
  }
  
  /**
    * 'synced'
    *  - Not conflicting and has no pending local changes.
    * 'pending'
    *  - Has one or more pending local changes that haven't been synchronized.
    * 'conflicting'
    *  - File conflicts with remote version and must be resolved manually.
    */
  object FileStatus {
    
    @JSGlobal("chrome.syncFileSystem.FileStatus")
    @js.native
    val ^ : js.Any = js.native
    
    @JSGlobal("chrome.syncFileSystem.FileStatus.CONFLICTING")
    @js.native
    def CONFLICTING: conflicting_ = js.native
    inline def CONFLICTING_=(x: conflicting_): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CONFLICTING")(x.asInstanceOf[js.Any])
    
    @JSGlobal("chrome.syncFileSystem.FileStatus.PENDING")
    @js.native
    def PENDING: pending_ = js.native
    inline def PENDING_=(x: pending_): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PENDING")(x.asInstanceOf[js.Any])
    
    @JSGlobal("chrome.syncFileSystem.FileStatus.SYNCED")
    @js.native
    def SYNCED: synced_ = js.native
    inline def SYNCED_=(x: synced_): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SYNCED")(x.asInstanceOf[js.Any])
  }
  
  /**
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
  object ServiceStatus {
    
    @JSGlobal("chrome.syncFileSystem.ServiceStatus")
    @js.native
    val ^ : js.Any = js.native
    
    @JSGlobal("chrome.syncFileSystem.ServiceStatus.AUTHENTICATION_REQUIRED")
    @js.native
    def AUTHENTICATION_REQUIRED: authentication_required_ = js.native
    inline def AUTHENTICATION_REQUIRED_=(x: authentication_required_): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("AUTHENTICATION_REQUIRED")(x.asInstanceOf[js.Any])
    
    @JSGlobal("chrome.syncFileSystem.ServiceStatus.DISABLED")
    @js.native
    def DISABLED: disabled__ = js.native
    inline def DISABLED_=(x: disabled__): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DISABLED")(x.asInstanceOf[js.Any])
    
    @JSGlobal("chrome.syncFileSystem.ServiceStatus.INITIALIZING")
    @js.native
    def INITIALIZING: initializing_ = js.native
    inline def INITIALIZING_=(x: initializing_): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("INITIALIZING")(x.asInstanceOf[js.Any])
    
    @JSGlobal("chrome.syncFileSystem.ServiceStatus.RUNNING")
    @js.native
    def RUNNING: running_ = js.native
    inline def RUNNING_=(x: running_): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("RUNNING")(x.asInstanceOf[js.Any])
    
    @JSGlobal("chrome.syncFileSystem.ServiceStatus.TEMPORARY_UNAVAILABLE")
    @js.native
    def TEMPORARY_UNAVAILABLE: temporary_unavailable_ = js.native
    inline def TEMPORARY_UNAVAILABLE_=(x: temporary_unavailable_): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TEMPORARY_UNAVAILABLE")(x.asInstanceOf[js.Any])
  }
  
  object SyncAction {
    
    @JSGlobal("chrome.syncFileSystem.SyncAction")
    @js.native
    val ^ : js.Any = js.native
    
    @JSGlobal("chrome.syncFileSystem.SyncAction.ADDED")
    @js.native
    def ADDED: added_ = js.native
    inline def ADDED_=(x: added_): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ADDED")(x.asInstanceOf[js.Any])
    
    @JSGlobal("chrome.syncFileSystem.SyncAction.DELETED")
    @js.native
    def DELETED: deleted_ = js.native
    inline def DELETED_=(x: deleted_): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DELETED")(x.asInstanceOf[js.Any])
    
    @JSGlobal("chrome.syncFileSystem.SyncAction.UPDATED")
    @js.native
    def UPDATED: updated_ = js.native
    inline def UPDATED_=(x: updated_): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("UPDATED")(x.asInstanceOf[js.Any])
  }
  
  object SyncDirection {
    
    @JSGlobal("chrome.syncFileSystem.SyncDirection")
    @js.native
    val ^ : js.Any = js.native
    
    @JSGlobal("chrome.syncFileSystem.SyncDirection.LOCAL_TO_REMOTE")
    @js.native
    def LOCAL_TO_REMOTE: local_to_remote_ = js.native
    inline def LOCAL_TO_REMOTE_=(x: local_to_remote_): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("LOCAL_TO_REMOTE")(x.asInstanceOf[js.Any])
    
    @JSGlobal("chrome.syncFileSystem.SyncDirection.REMOTE_TO_LOCAL")
    @js.native
    def REMOTE_TO_LOCAL: remote_to_local_ = js.native
    inline def REMOTE_TO_LOCAL_=(x: remote_to_local_): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("REMOTE_TO_LOCAL")(x.asInstanceOf[js.Any])
  }
  
  /**
    * Gets the current conflict resolution policy.
    * @see ConflictResolutionPolicy
    */
  inline def getConflictResolutionPolicy(
    callback: js.Function1[
      /* policy */ ToStringLiteral[
        LASTWRITEWIN, 
        /* keyof chrome-apps.anon.LASTWRITEWIN */ LAST_WRITE_WIN | MANUAL, 
        /* import warning: importer.ImportType#apply Failed type conversion: keyof {  LAST_WRITE_WIN :'last_write_win',   MANUAL :'manual'} extends keyof {  LAST_WRITE_WIN :'last_write_win',   MANUAL :'manual'} ? std.Exclude<keyof {  LAST_WRITE_WIN :'last_write_win',   MANUAL :'manual'}, 'last_write_win' | 'manual'> : never */ js.Any
      ], 
      Unit
    ]
  ): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("getConflictResolutionPolicy")(callback.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /**
    * Returns the FileStatus for the given fileEntry.
    * Note that 'conflicting' state only happens when
    * the service's conflict resolution policy is set to 'manual'.
    * @see FileStatus
    * */
  inline def getFileStatus(
    fileEntry: FileEntry,
    callback: js.Function1[
      /* status */ ToStringLiteral[
        CONFLICTING, 
        /* keyof chrome-apps.anon.CONFLICTING */ SYNCED | PENDING | typings.chromeApps.chromeAppsStrings.CONFLICTING, 
        /* import warning: importer.ImportType#apply Failed type conversion: keyof {  SYNCED :'synced',   PENDING :'pending',   CONFLICTING :'conflicting'} extends keyof {  SYNCED :'synced',   PENDING :'pending',   CONFLICTING :'conflicting'} ? std.Exclude<keyof {  SYNCED :'synced',   PENDING :'pending',   CONFLICTING :'conflicting'}, 'synced' | 'pending' | 'conflicting'> : never */ js.Any
      ], 
      Unit
    ]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("getFileStatus")(fileEntry.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /** Returns each FileStatus for the given fileEntry array. Typically called with the result from dirReader.readEntries(). */
  inline def getFileStatuses(
    fileEntries: js.Array[FileEntry],
    callback: js.Function1[/* status */ js.Array[FileStatusInfo], Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("getFileStatuses")(fileEntries.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /**
    * Returns the current sync backend status.
    * @since Chrome 31.
    * @param callback
    * @see ServiceStatus
    */
  inline def getServiceStatus(
    callback: js.Function1[
      /* status */ ToStringLiteral[
        AUTHENTICATIONREQUIRED, 
        /* keyof chrome-apps.anon.AUTHENTICATIONREQUIRED */ INITIALIZING | RUNNING | AUTHENTICATION_REQUIRED | TEMPORARY_UNAVAILABLE | DISABLED, 
        /* import warning: importer.ImportType#apply Failed type conversion: keyof {  INITIALIZING :'initializing',   RUNNING :'running',   AUTHENTICATION_REQUIRED :'authentication_required',   TEMPORARY_UNAVAILABLE :'temporary_unavailable',   DISABLED :'disabled'} extends keyof {  INITIALIZING :'initializing',   RUNNING :'running',   AUTHENTICATION_REQUIRED :'authentication_required',   TEMPORARY_UNAVAILABLE :'temporary_unavailable',   DISABLED :'disabled'} ? std.Exclude<keyof {  INITIALIZING :'initializing',   RUNNING :'running',   AUTHENTICATION_REQUIRED :'authentication_required',   TEMPORARY_UNAVAILABLE :'temporary_unavailable',   DISABLED :'disabled'}, 'temporary_unavailable' | 'authentication_required' | 'disabled' | 'initializing' | 'running'> : never */ js.Any
      ], 
      Unit
    ]
  ): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("getServiceStatus")(callback.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /**
    * Returns the current usage and quota in bytes for the 'syncable' file storage for the app.
    * @param fileSystem
    * @param callback
    */
  inline def getUsageAndQuota(fileSystem: FileSystem, callback: js.Function1[/* info */ QuotaBytes, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("getUsageAndQuota")(fileSystem.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /** Fired when a file has been updated by the background sync service. */
  @JSGlobal("chrome.syncFileSystem.onFileStatusChanged")
  @js.native
  val onFileStatusChanged: typings.chromeApps.chrome.events.Event[js.Function1[/* detail */ FileStatusChangedDetail, Unit]] = js.native
  
  /**
    * Fired when an error or other status change has happened in the sync backend
    * (for example, when the sync is temporarily disabled due to network or authentication error).
    * @see ServiceStatus
    */
  @JSGlobal("chrome.syncFileSystem.onServiceStatusChanged")
  @js.native
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
  inline def requestFileSystem(callback: js.Function1[/* fileSystem */ FileSystem, Unit]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("requestFileSystem")(callback.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
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
  inline def setConflictResolutionPolicy(
    policy: ToStringLiteral[
      LASTWRITEWIN, 
      /* keyof chrome-apps.anon.LASTWRITEWIN */ LAST_WRITE_WIN | MANUAL, 
      /* import warning: importer.ImportType#apply Failed type conversion: keyof {  LAST_WRITE_WIN :'last_write_win',   MANUAL :'manual'} extends keyof {  LAST_WRITE_WIN :'last_write_win',   MANUAL :'manual'} ? std.Exclude<keyof {  LAST_WRITE_WIN :'last_write_win',   MANUAL :'manual'}, 'last_write_win' | 'manual'> : never */ js.Any
    ]
  ): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setConflictResolutionPolicy")(policy.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def setConflictResolutionPolicy(
    policy: ToStringLiteral[
      LASTWRITEWIN, 
      /* keyof chrome-apps.anon.LASTWRITEWIN */ LAST_WRITE_WIN | MANUAL, 
      /* import warning: importer.ImportType#apply Failed type conversion: keyof {  LAST_WRITE_WIN :'last_write_win',   MANUAL :'manual'} extends keyof {  LAST_WRITE_WIN :'last_write_win',   MANUAL :'manual'} ? std.Exclude<keyof {  LAST_WRITE_WIN :'last_write_win',   MANUAL :'manual'}, 'last_write_win' | 'manual'> : never */ js.Any
    ],
    callback: js.Function0[Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setConflictResolutionPolicy")(policy.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
