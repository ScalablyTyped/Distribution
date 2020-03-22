package typings.chromeApps.chrome.syncFileSystem

import typings.chromeApps.AnonAUTHENTICATIONREQUIRED
import typings.chromeApps.chrome.ToStringLiteral
import typings.chromeApps.chromeAppsStrings.authentication_required
import typings.chromeApps.chromeAppsStrings.disabled_
import typings.chromeApps.chromeAppsStrings.initializing
import typings.chromeApps.chromeAppsStrings.running
import typings.chromeApps.chromeAppsStrings.temporary_unavailable
import typings.std.Exclude
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("chrome.syncFileSystem.getServiceStatus")
@js.native
object getServiceStatus extends js.Object {
  /**
    * Returns the current sync backend status.
    * @since Chrome 31.
    * @param callback
    * @see ServiceStatus
    */
  def apply(
    callback: js.Function1[
      /* status */ ToStringLiteral[
        AnonAUTHENTICATIONREQUIRED, 
        String, 
        Exclude[
          String, 
          temporary_unavailable | authentication_required | disabled_ | initializing | running
        ]
      ], 
      Unit
    ]
  ): Unit = js.native
}

