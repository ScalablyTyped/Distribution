package typings.chromeDashApps.chrome.runtime

import org.scalablytyped.runtime.TopLevel
import typings.chromeDashApps.Anon_APPUPDATE
import typings.chromeDashApps.chrome.ToStringLiteral
import typings.chromeDashApps.chromeDashAppsStrings.app_update
import typings.chromeDashApps.chromeDashAppsStrings.os_update
import typings.chromeDashApps.chromeDashAppsStrings.periodic
import typings.std.Exclude
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @required(Chrome OS Kiosk app) Currently, this event is only fired for Chrome OS kiosk apps.
  * Fired when an app or the device that it runs on needs to be restarted.
  * The app should close all its windows at its earliest convenient time to let the restart to happen.
  * If the app does nothing, a restart will be enforced after a 24-hour grace period has passed.
  * @since Chrome 29.
  */
@JSGlobal("chrome.runtime.onRestartRequired")
@js.native
object onRestartRequired
  extends TopLevel[
      typings.chromeDashApps.chrome.events.Event[
        js.Function1[
          /* reason */ ToStringLiteral[Anon_APPUPDATE, String, Exclude[String, app_update | os_update | periodic]], 
          Unit
        ]
      ]
    ]

