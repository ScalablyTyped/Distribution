package typings.chromeApps.chrome.vpnProvider

import org.scalablytyped.runtime.TopLevel
import typings.chromeApps.AnonSHOWADDDIALOG
import typings.chromeApps.chrome.ToStringLiteral
import typings.chromeApps.chrome.events.Event
import typings.chromeApps.chromeAppsStrings.showAddDialog
import typings.chromeApps.chromeAppsStrings.showConfigureDialog
import typings.std.Exclude
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Triggered when there is a UI event for the extension.
  * UI events are signals from the platform that indicate to the app that a UI dialog needs to be shown to the user.
  */
@JSGlobal("chrome.vpnProvider.onUIEvent")
@js.native
object onUIEvent
  extends TopLevel[
      Event[
        js.Function2[
          /* event */ ToStringLiteral[AnonSHOWADDDIALOG, String, Exclude[String, showAddDialog | showConfigureDialog]], 
          /* id */ js.UndefOr[String], 
          Unit
        ]
      ]
    ]

