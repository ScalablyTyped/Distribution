package typings.chromeDashApps

import typings.chromeDashApps.chrome.ToStringLiteral
import typings.chromeDashApps.chrome.events.Event
import typings.chromeDashApps.chrome.syncFileSystem.FileStatusChangedDetail
import typings.chromeDashApps.chrome.syncFileSystem.FileStatusInfo
import typings.filesystem.FileEntry
import typings.filesystem.FileSystem
import typings.std.Exclude
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypeofsyncFileSystem extends js.Object {
  val ConflictResolutionPolicy: Anon_LASTWRITEWIN = js.native
  /**
    * @enum
    * 'synced'
    *  - Not conflicting and has no pending local changes.
    * 'pending'
    *  - Has one or more pending local changes that haven't been synchronized.
    * 'conflicting'
    *  - File conflicts with remote version and must be resolved manually.
    */
  val FileStatus: Anon_CONFLICTING = js.native
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
  val ServiceStatus: Anon_AUTHENTICATIONREQUIRED = js.native
  val SyncAction: Anon_ADDED = js.native
  val SyncDirection: Anon_LOCALTOREMOTE = js.native
  /** Fired when a file has been updated by the background sync service. */
  val onFileStatusChanged: Event[js.Function1[/* detail */ FileStatusChangedDetail, Unit]] = js.native
  /**
    * Fired when an error or other status change has happened in the sync backend
    * (for example, when the sync is temporarily disabled due to network or authentication error).
    * @see ServiceStatus
    */
  val onServiceStatusChanged: Event[js.Function1[/* detail */ Anon_DescriptionState, Unit]] = js.native
  /**
    * Gets the current conflict resolution policy.
    * @see ConflictResolutionPolicy
    */
  def getConflictResolutionPolicy(
    callback: js.Function1[
      /* policy */ ToStringLiteral[
        /* import warning: ImportType.apply Failed type conversion: typeof ConflictResolutionPolicy */ js.Any, 
        String, 
        Exclude[
          String, 
          /* import warning: ImportType.apply Failed type conversion: typeof ConflictResolutionPolicy[keyof typeof ConflictResolutionPolicy] */ js.Any
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
        /* import warning: ImportType.apply Failed type conversion: typeof FileStatus */ js.Any, 
        String, 
        Exclude[
          String, 
          /* import warning: ImportType.apply Failed type conversion: typeof FileStatus[keyof typeof FileStatus] */ js.Any
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
        /* import warning: ImportType.apply Failed type conversion: typeof ServiceStatus */ js.Any, 
        String, 
        Exclude[
          String, 
          /* import warning: ImportType.apply Failed type conversion: typeof ServiceStatus[keyof typeof ServiceStatus] */ js.Any
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
  def getUsageAndQuota(fileSystem: FileSystem, callback: js.Function1[/* info */ Anon_QuotaBytes, Unit]): Unit = js.native
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
      /* import warning: ImportType.apply Failed type conversion: typeof ConflictResolutionPolicy */ js.Any, 
      String, 
      Exclude[
        String, 
        /* import warning: ImportType.apply Failed type conversion: typeof ConflictResolutionPolicy[keyof typeof ConflictResolutionPolicy] */ js.Any
      ]
    ]
  ): Unit = js.native
  def setConflictResolutionPolicy(
    policy: ToStringLiteral[
      /* import warning: ImportType.apply Failed type conversion: typeof ConflictResolutionPolicy */ js.Any, 
      String, 
      Exclude[
        String, 
        /* import warning: ImportType.apply Failed type conversion: typeof ConflictResolutionPolicy[keyof typeof ConflictResolutionPolicy] */ js.Any
      ]
    ],
    callback: js.Function0[Unit]
  ): Unit = js.native
}

