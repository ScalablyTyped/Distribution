package typings.chromeDashApps.chrome.networking.config

import org.scalablytyped.runtime.TopLevel
import typings.chromeDashApps.chrome.events.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This event fires everytime a captive portal is detected on a network
  * matching any of the currently registered network filters and the user
  * consents to use the extension for authentication. Network filters may be
  * set using the *setNetworkFilter*.
  * Upon receiving this event the extension should start its authentication
  * attempt with the captive portal. When the extension finishes its attempt,
  * it must call *finishAuthentication* with the *GUID*.
  * received with this event and the appropriate authentication result.
  * @param networkInfo Information about the network on which a captive portal was detected.
  */
@JSGlobal("chrome.networking.config.onCaptivePortalDetected")
@js.native
object onCaptivePortalDetected
  extends TopLevel[Event[js.Function1[/* networkInfo */ NetworkInfo, Unit]]]

