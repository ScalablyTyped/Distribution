package typings
package chromeDashAppsLib.chromeNs.syncFileSystemNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("chrome.syncFileSystem")
@js.native
object ^ extends js.Object {
  /** Fired when a file has been updated by the background sync service. */
  val onFileStatusChanged: chromeDashAppsLib.chromeNs.eventsNs.Event[js.Function1[/* detail */ FileStatusChangedDetail, scala.Unit]] = js.native
  /**
    * Fired when an error or other status change has happened in the sync backend
    * (for example, when the sync is temporarily disabled due to network or authentication error).
    * @see ServiceStatus
    */
  val onServiceStatusChanged: chromeDashAppsLib.chromeNs.eventsNs.Event[
    js.Function1[/* detail */ chromeDashAppsLib.Anon_Authenticationrequired, scala.Unit]
  ] = js.native
  /**
    * Gets the current conflict resolution policy.
    * @see ConflictResolutionPolicy
    */
  def getConflictResolutionPolicy(
    callback: js.Function1[
      /* policy */ chromeDashAppsLib.chromeNs.ToStringLiteral[
        chromeDashAppsLib.Anon_LASTWRITEWIN, 
        java.lang.String, 
        stdLib.Exclude[
          java.lang.String, 
          chromeDashAppsLib.chromeDashAppsLibStrings.last_write_win | chromeDashAppsLib.chromeDashAppsLibStrings.manual
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
        chromeDashAppsLib.Anon_CONFLICTING, 
        java.lang.String, 
        stdLib.Exclude[
          java.lang.String, 
          chromeDashAppsLib.chromeDashAppsLibStrings.synced | chromeDashAppsLib.chromeDashAppsLibStrings.pending | chromeDashAppsLib.chromeDashAppsLibStrings.conflicting
        ]
      ], 
      scala.Unit
    ]
  ): scala.Unit = js.native
  /** Returns each FileStatus for the given fileEntry array. Typically called with the result from dirReader.readEntries(). */
  def getFileStatuses(
    fileEntries: js.Array[filesystemLib.FileEntry],
    callback: js.Function1[/* status */ js.Array[FileStatusInfo], scala.Unit]
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
        chromeDashAppsLib.Anon_AUTHENTICATIONREQUIRED, 
        java.lang.String, 
        stdLib.Exclude[
          java.lang.String, 
          chromeDashAppsLib.chromeDashAppsLibStrings.initializing | chromeDashAppsLib.chromeDashAppsLibStrings.running | chromeDashAppsLib.chromeDashAppsLibStrings.temporary_unavailable | chromeDashAppsLib.chromeDashAppsLibStrings.authentication_required | chromeDashAppsLib.chromeDashAppsLibStrings.disabled
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
    callback: js.Function1[/* info */ chromeDashAppsLib.Anon_QuotaBytes, scala.Unit]
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
      chromeDashAppsLib.Anon_LASTWRITEWIN, 
      java.lang.String, 
      stdLib.Exclude[
        java.lang.String, 
        chromeDashAppsLib.chromeDashAppsLibStrings.last_write_win | chromeDashAppsLib.chromeDashAppsLibStrings.manual
      ]
    ]
  ): scala.Unit = js.native
  def setConflictResolutionPolicy(
    policy: chromeDashAppsLib.chromeNs.ToStringLiteral[
      chromeDashAppsLib.Anon_LASTWRITEWIN, 
      java.lang.String, 
      stdLib.Exclude[
        java.lang.String, 
        chromeDashAppsLib.chromeDashAppsLibStrings.last_write_win | chromeDashAppsLib.chromeDashAppsLibStrings.manual
      ]
    ],
    callback: js.Function0[scala.Unit]
  ): scala.Unit = js.native
}

