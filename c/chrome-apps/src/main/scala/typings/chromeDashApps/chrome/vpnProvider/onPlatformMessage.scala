package typings.chromeDashApps.chrome.vpnProvider

import org.scalablytyped.runtime.TopLevel
import typings.chromeDashApps.Anon_CONNECTEDConnectedDISCONNECTED
import typings.chromeDashApps.chrome.ToStringLiteral
import typings.chromeDashApps.chromeDashAppsStrings.connected_
import typings.chromeDashApps.chromeDashAppsStrings.disconnected_
import typings.chromeDashApps.chromeDashAppsStrings.error
import typings.chromeDashApps.chromeDashAppsStrings.linkChanged
import typings.chromeDashApps.chromeDashAppsStrings.linkDown
import typings.chromeDashApps.chromeDashAppsStrings.linkUp
import typings.chromeDashApps.chromeDashAppsStrings.resume
import typings.chromeDashApps.chromeDashAppsStrings.suspend
import typings.std.Exclude
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Triggered when a message is received from the platform for a VPN configuration owned by the extension. */
@JSGlobal("chrome.vpnProvider.onPlatformMessage")
@js.native
object onPlatformMessage
  extends TopLevel[
      typings.chromeDashApps.chrome.events.Event[
        js.Function3[
          /* id */ String, 
          /* message */ ToStringLiteral[
            Anon_CONNECTEDConnectedDISCONNECTED, 
            String, 
            Exclude[
              String, 
              linkChanged | linkUp | suspend | error | connected_ | resume | disconnected_ | linkDown
            ]
          ], 
          /* error */ String, 
          Unit
        ]
      ]
    ]

