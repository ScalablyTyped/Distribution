package typings.chromeDashApps.chrome.syncFileSystem

import typings.chromeDashApps.Anon_LASTWRITEWIN
import typings.chromeDashApps.chrome.ToStringLiteral
import typings.chromeDashApps.chromeDashAppsStrings.last_write_win
import typings.chromeDashApps.chromeDashAppsStrings.manual
import typings.std.Exclude
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("chrome.syncFileSystem.getConflictResolutionPolicy")
@js.native
object getConflictResolutionPolicy extends js.Object {
  /**
    * Gets the current conflict resolution policy.
    * @see ConflictResolutionPolicy
    */
  def apply(
    callback: js.Function1[
      /* policy */ ToStringLiteral[Anon_LASTWRITEWIN, String, Exclude[String, last_write_win | manual]], 
      Unit
    ]
  ): Unit = js.native
}

