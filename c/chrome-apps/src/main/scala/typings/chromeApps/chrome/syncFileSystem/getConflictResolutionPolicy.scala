package typings.chromeApps.chrome.syncFileSystem

import typings.chromeApps.AnonLASTWRITEWIN
import typings.chromeApps.chrome.ToStringLiteral
import typings.chromeApps.chromeAppsStrings.LAST_WRITE_WIN
import typings.chromeApps.chromeAppsStrings.MANUAL
import typings.chromeApps.chromeAppsStrings.last_write_win_
import typings.chromeApps.chromeAppsStrings.manual__
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
      /* policy */ ToStringLiteral[
        AnonLASTWRITEWIN, 
        LAST_WRITE_WIN | MANUAL, 
        Exclude[LAST_WRITE_WIN | MANUAL, last_write_win_ | manual__]
      ], 
      Unit
    ]
  ): Unit = js.native
}

