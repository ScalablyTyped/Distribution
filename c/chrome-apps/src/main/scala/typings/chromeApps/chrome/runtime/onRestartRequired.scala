package typings.chromeApps.chrome.runtime

import org.scalablytyped.runtime.TopLevel
import typings.chromeApps.AnonAPPUPDATE
import typings.chromeApps.chrome.ToStringLiteral
import typings.chromeApps.chrome.events.Event
import typings.chromeApps.chromeAppsStrings.APP_UPDATE
import typings.chromeApps.chromeAppsStrings.OS_UPDATE
import typings.chromeApps.chromeAppsStrings.PERIODIC
import typings.chromeApps.chromeAppsStrings.app_update_
import typings.chromeApps.chromeAppsStrings.os_update_
import typings.chromeApps.chromeAppsStrings.periodic_
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
      Event[
        js.Function1[
          /* reason */ ToStringLiteral[
            AnonAPPUPDATE, 
            APP_UPDATE | OS_UPDATE | PERIODIC, 
            Exclude[APP_UPDATE | OS_UPDATE | PERIODIC, app_update_ | os_update_ | periodic_]
          ], 
          Unit
        ]
      ]
    ]

