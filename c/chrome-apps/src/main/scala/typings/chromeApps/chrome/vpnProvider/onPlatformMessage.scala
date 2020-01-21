package typings.chromeApps.chrome.vpnProvider

import org.scalablytyped.runtime.TopLevel
import typings.chromeApps.AnonCONNECTEDConnectedDISCONNECTED
import typings.chromeApps.chrome.ToStringLiteral
import typings.chromeApps.chrome.events.Event
import typings.chromeApps.chromeAppsStrings.connected_
import typings.chromeApps.chromeAppsStrings.disconnected_
import typings.chromeApps.chromeAppsStrings.error
import typings.chromeApps.chromeAppsStrings.linkChanged
import typings.chromeApps.chromeAppsStrings.linkDown
import typings.chromeApps.chromeAppsStrings.linkUp
import typings.chromeApps.chromeAppsStrings.resume
import typings.chromeApps.chromeAppsStrings.suspend
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
            AnonCONNECTEDConnectedDISCONNECTED, 
            String, 
            Exclude[
              String, 
              linkUp | linkChanged | suspend | resume | linkDown | connected_ | error | disconnected_
            ]
          ], 
          /* error */ String, 
          Unit
        ]
      ]
    ]

