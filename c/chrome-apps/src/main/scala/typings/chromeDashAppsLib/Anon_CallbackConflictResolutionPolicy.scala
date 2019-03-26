package typings
package chromeDashAppsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_CallbackConflictResolutionPolicy extends js.Object {
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
  val onFileStatusChanged: chromeDashAppsLib.chromeNs.eventsNs.Event[
    js.Function1[
      /* detail */ chromeDashAppsLib.chromeNs.syncFileSystemNs.FileStatusChangedDetail, 
      scala.Unit
    ]
  ] = js.native
  /**
    * Fired when an error or other status change has happened in the sync backend
    * (for example, when the sync is temporarily disabled due to network or authentication error).
    * @see ServiceStatus
    */
  val onServiceStatusChanged: chromeDashAppsLib.chromeNs.eventsNs.Event[js.Function1[/* detail */ Anon_DescriptionState, scala.Unit]] = js.native
  /**
    * Gets the current conflict resolution policy.
    * @see ConflictResolutionPolicy
    */
  def getConflictResolutionPolicy(
    callback: js.Function1[
      /* policy */ chromeDashAppsLib.chromeNs.ToStringLiteral[
        /* import warning: ImportType.apply Failed type conversion: typeof ConflictResolutionPolicy */ js.Any, 
        java.lang.String, 
        stdLib.Exclude[
          java.lang.String, 
          /* import warning: ImportType.apply Failed type conversion: typeof ConflictResolutionPolicy[keyof typeof ConflictResolutionPolicy] */ js.Any
        ]
      ], 
      scala.Unit
    ]
  ): scala.Unit = js.native
  /**
    * Returns the FileStatus for the given fileEntry.
    * Note that 'conflicting' state only happens when
    * the service's conflict resolution policy is set to 'manual'.
    * @see FileStatus
    * */
  def getFileStatus(
    fileEntry: filesystemLib.FileEntry,
    callback: js.Function1[
      /* status */ chromeDashAppsLib.chromeNs.ToStringLiteral[
        /* import warning: ImportType.apply Failed type conversion: typeof FileStatus */ js.Any, 
        java.lang.String, 
        stdLib.Exclude[
          java.lang.String, 
          /* import warning: ImportType.apply Failed type conversion: typeof FileStatus[keyof typeof FileStatus] */ js.Any
        ]
      ], 
      scala.Unit
    ]
  ): scala.Unit = js.native
  /** Returns each FileStatus for the given fileEntry array. Typically called with the result from dirReader.readEntries(). */
  def getFileStatuses(
    fileEntries: js.Array[filesystemLib.FileEntry],
    callback: js.Function1[
      /* status */ js.Array[chromeDashAppsLib.chromeNs.syncFileSystemNs.FileStatusInfo], 
      scala.Unit
    ]
  ): scala.Unit = js.native
  /**
    * Returns the current sync backend status.
    * @since Chrome 31.
    * @param callback
    * @see ServiceStatus
    */
  def getServiceStatus(
    callback: js.Function1[
      /* status */ chromeDashAppsLib.chromeNs.ToStringLiteral[
        /* import warning: ImportType.apply Failed type conversion: typeof ServiceStatus */ js.Any, 
        java.lang.String, 
        stdLib.Exclude[
          java.lang.String, 
          /* import warning: ImportType.apply Failed type conversion: typeof ServiceStatus[keyof typeof ServiceStatus] */ js.Any
        ]
      ], 
      scala.Unit
    ]
  ): scala.Unit = js.native
  /**
    * Returns the current usage and quota in bytes for the 'syncable' file storage for the app.
    * @param fileSystem
    * @param callback
    */
  def getUsageAndQuota(
    fileSystem: filesystemLib.FileSystem,
    callback: js.Function1[/* info */ Anon_QuotaBytes, scala.Unit]
  ): scala.Unit = js.native
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
  def requestFileSystem(callback: js.Function1[/* fileSystem */ filesystemLib.FileSystem, scala.Unit]): scala.Unit = js.native
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
    policy: chromeDashAppsLib.chromeNs.ToStringLiteral[
      /* import warning: ImportType.apply Failed type conversion: typeof ConflictResolutionPolicy */ js.Any, 
      java.lang.String, 
      stdLib.Exclude[
        java.lang.String, 
        /* import warning: ImportType.apply Failed type conversion: typeof ConflictResolutionPolicy[keyof typeof ConflictResolutionPolicy] */ js.Any
      ]
    ]
  ): scala.Unit = js.native
  def setConflictResolutionPolicy(
    policy: chromeDashAppsLib.chromeNs.ToStringLiteral[
      /* import warning: ImportType.apply Failed type conversion: typeof ConflictResolutionPolicy */ js.Any, 
      java.lang.String, 
      stdLib.Exclude[
        java.lang.String, 
        /* import warning: ImportType.apply Failed type conversion: typeof ConflictResolutionPolicy[keyof typeof ConflictResolutionPolicy] */ js.Any
      ]
    ],
    callback: js.Function0[scala.Unit]
  ): scala.Unit = js.native
}

