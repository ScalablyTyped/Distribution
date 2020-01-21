package typings.chromeApps.chrome.vpnProvider

import org.scalablytyped.runtime.TopLevel
import typings.chromeApps.chrome.events.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Triggered when a configuration is created by the platform for the extension. */
@JSGlobal("chrome.vpnProvider.onConfigCreated")
@js.native
object onConfigCreated
  extends TopLevel[
      Event[js.Function3[/* id */ String, /* name */ String, /* data */ js.Object, Unit]]
    ]

