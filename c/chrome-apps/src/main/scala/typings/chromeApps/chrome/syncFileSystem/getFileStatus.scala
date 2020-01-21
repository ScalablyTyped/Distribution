package typings.chromeApps.chrome.syncFileSystem

import typings.chromeApps.AnonCONFLICTING
import typings.chromeApps.chrome.ToStringLiteral
import typings.chromeApps.chromeAppsStrings.conflicting
import typings.chromeApps.chromeAppsStrings.pending
import typings.chromeApps.chromeAppsStrings.synced
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
      /* status */ ToStringLiteral[AnonCONFLICTING, String, Exclude[String, synced | pending | conflicting]], 
      Unit
    ]
  ): Unit = js.native
}

