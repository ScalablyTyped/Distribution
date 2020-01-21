package typings.chromeApps.chrome.syncFileSystem

import typings.chromeApps.AnonLASTWRITEWIN
import typings.chromeApps.chrome.ToStringLiteral
import typings.chromeApps.chromeAppsStrings.last_write_win
import typings.chromeApps.chromeAppsStrings.manual_
import typings.std.Exclude
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("chrome.syncFileSystem.setConflictResolutionPolicy")
@js.native
object setConflictResolutionPolicy extends js.Object {
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
  def apply(policy: ToStringLiteral[AnonLASTWRITEWIN, String, Exclude[String, last_write_win | manual_]]): Unit = js.native
  def apply(
    policy: ToStringLiteral[AnonLASTWRITEWIN, String, Exclude[String, last_write_win | manual_]],
    callback: js.Function0[Unit]
  ): Unit = js.native
}

