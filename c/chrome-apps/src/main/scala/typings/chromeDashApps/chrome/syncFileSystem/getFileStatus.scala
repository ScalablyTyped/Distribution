package typings.chromeDashApps.chrome.syncFileSystem

import typings.chromeDashApps.Anon_CONFLICTING
import typings.chromeDashApps.chrome.ToStringLiteral
import typings.chromeDashApps.chromeDashAppsStrings.conflicting
import typings.chromeDashApps.chromeDashAppsStrings.pending
import typings.chromeDashApps.chromeDashAppsStrings.synced
import typings.filesystem.FileEntry
import typings.std.Exclude
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("chrome.syncFileSystem.getFileStatus")
@js.native
object getFileStatus extends js.Object {
  /**
    * Returns the FileStatus for the given fileEntry.
    * Note that 'conflicting' state only happens when
    * the service's conflict resolution policy is set to 'manual'.
    * @see FileStatus
    * */
  def apply(
    fileEntry: FileEntry,
    callback: js.Function1[
      /* status */ ToStringLiteral[Anon_CONFLICTING, String, Exclude[String, synced | pending | conflicting]], 
      Unit
    ]
  ): Unit = js.native
}

