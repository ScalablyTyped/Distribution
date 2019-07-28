package typings.chromeDashApps.chromeNs.syncFileSystemNs

import typings.chromeDashApps.Anon_AUTHENTICATIONREQUIRED
import typings.chromeDashApps.Anon_Authenticationrequired
import typings.chromeDashApps.Anon_CONFLICTING
import typings.chromeDashApps.Anon_LASTWRITEWIN
import typings.chromeDashApps.Anon_QuotaBytes
import typings.chromeDashApps.chromeDashAppsStrings.authentication_required
import typings.chromeDashApps.chromeDashAppsStrings.conflicting
import typings.chromeDashApps.chromeDashAppsStrings.disabled
import typings.chromeDashApps.chromeDashAppsStrings.initializing
import typings.chromeDashApps.chromeDashAppsStrings.last_write_win
import typings.chromeDashApps.chromeDashAppsStrings.manual
import typings.chromeDashApps.chromeDashAppsStrings.pending
import typings.chromeDashApps.chromeDashAppsStrings.running
import typings.chromeDashApps.chromeDashAppsStrings.synced
import typings.chromeDashApps.chromeDashAppsStrings.temporary_unavailable
import typings.chromeDashApps.chromeNs.ToStringLiteral
import typings.filesystem.FileEntry
import typings.filesystem.FileSystem
import typings.std.Exclude
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("chrome.syncFileSystem")
@js.native
object ^ extends js.Object {
  /** Fired when a file has been updated by the background sync service. */
  val onFileStatusChanged: typings.chromeDashApps.chromeNs.eventsNs.Event[js.Function1[/* detail */ FileStatusChangedDetail, Unit]] = js.native
  /**
    * Fired when an error or other status change has happened in the sync backend
    * (for example, when the sync is temporarily disabled due to network or authentication error).
    * @see ServiceStatus
    */
  val onServiceStatusChanged: typings.chromeDashApps.chromeNs.eventsNs.Event[js.Function1[/* detail */ Anon_Authenticationrequired, Unit]] = js.native
  /**
    * Gets the current conflict resolution policy.
    * @see ConflictResolutionPolicy
    */
  def getConflictResolutionPolicy(
    callback: js.Function1[
      /* policy */ ToStringLiteral[Anon_LASTWRITEWIN, String, Exclude[String, last_write_win | manual]], 
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
      /* status */ ToStringLiteral[Anon_CONFLICTING, String, Exclude[String, synced | pending | conflicting]], 
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
        Anon_AUTHENTICATIONREQUIRED, 
        String, 
        Exclude[
          String, 
          initializing | running | temporary_unavailable | authentication_required | disabled
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
  def setConflictResolutionPolicy(policy: ToStringLiteral[Anon_LASTWRITEWIN, String, Exclude[String, last_write_win | manual]]): Unit = js.native
  def setConflictResolutionPolicy(
    policy: ToStringLiteral[Anon_LASTWRITEWIN, String, Exclude[String, last_write_win | manual]],
    callback: js.Function0[Unit]
  ): Unit = js.native
}

