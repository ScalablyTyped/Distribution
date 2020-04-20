package typings.chromeApps.chrome.vpnProvider

import org.scalablytyped.runtime.TopLevel
import typings.chromeApps.AnonDISCONNECTED
import typings.chromeApps.chrome.ToStringLiteral
import typings.chromeApps.chrome.events.Event
import typings.chromeApps.chromeAppsStrings.CONNECTED
import typings.chromeApps.chromeAppsStrings.DISCONNECTED
import typings.chromeApps.chromeAppsStrings.ERROR
import typings.chromeApps.chromeAppsStrings.LINK_CHANGED
import typings.chromeApps.chromeAppsStrings.LINK_DOWN
import typings.chromeApps.chromeAppsStrings.LINK_UP
import typings.chromeApps.chromeAppsStrings.RESUME
import typings.chromeApps.chromeAppsStrings.SUSPEND
import typings.chromeApps.chromeAppsStrings.connected__
import typings.chromeApps.chromeAppsStrings.disconnected__
import typings.chromeApps.chromeAppsStrings.error_
import typings.chromeApps.chromeAppsStrings.linkChanged
import typings.chromeApps.chromeAppsStrings.linkDown
import typings.chromeApps.chromeAppsStrings.linkUp
import typings.chromeApps.chromeAppsStrings.resume_
import typings.chromeApps.chromeAppsStrings.suspend_
import typings.std.Exclude
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Triggered when a message is received from the platform for a VPN configuration owned by the extension. */
@JSGlobal("chrome.vpnProvider.onPlatformMessage")
@js.native
object onPlatformMessage
  extends TopLevel[
      Event[
        js.Function3[
          /* id */ String, 
          /* message */ ToStringLiteral[
            AnonDISCONNECTED, 
            CONNECTED | DISCONNECTED | ERROR | LINK_DOWN | LINK_UP | LINK_CHANGED | SUSPEND | RESUME, 
            Exclude[
              CONNECTED | DISCONNECTED | ERROR | LINK_DOWN | LINK_UP | LINK_CHANGED | SUSPEND | RESUME, 
              linkUp | linkChanged | suspend_ | resume_ | linkDown | connected__ | error_ | disconnected__
            ]
          ], 
          /* error */ String, 
          Unit
        ]
      ]
    ]

