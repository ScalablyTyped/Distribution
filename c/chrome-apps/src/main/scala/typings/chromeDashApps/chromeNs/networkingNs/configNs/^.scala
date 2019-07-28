package typings.chromeDashApps.chromeNs.networkingNs.configNs

import typings.chromeDashApps.Anon_FAILED
import typings.chromeDashApps.chromeDashAppsStrings.failed
import typings.chromeDashApps.chromeDashAppsStrings.rejected
import typings.chromeDashApps.chromeDashAppsStrings.succeeded
import typings.chromeDashApps.chromeDashAppsStrings.unhandled
import typings.chromeDashApps.chromeNs.ToStringLiteral
import typings.std.Exclude
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("chrome.networking.config")
@js.native
object ^ extends js.Object {
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
  val onCaptivePortalDetected: typings.chromeDashApps.chromeNs.eventsNs.Event[js.Function1[/* networkInfo */ NetworkInfo, Unit]] = js.native
  /**
    * Called by the app to notify the network config API that it finished
    * a captive portal authentication attempt and hand over the result of the attempt.
    * This function must only be called with the GUID of the latest *onCaptivePortalDetected* event.
    * @param GUID Unique network identifier obtained from *onCaptivePortalDetected*.
    * @param result The result of the authentication attempt.
    * @param [callback] Called back when this operation is finished.
    */
  def finishAuthentication(
    GUID: String,
    result: ToStringLiteral[Anon_FAILED, String, Exclude[String, unhandled | succeeded | rejected | failed]]
  ): Unit = js.native
  def finishAuthentication(
    GUID: String,
    result: ToStringLiteral[Anon_FAILED, String, Exclude[String, unhandled | succeeded | rejected | failed]],
    callback: js.Function0[Unit]
  ): Unit = js.native
  /**
    * Allows an extension to define network filters for the networks it can handle.
    * A call to this function will remove all filters previously
    * installed by the extension before setting the new list.
    * @param networks Network filters to set. Array of objects with either HexSSID or SSID set.
    * @param callback Called back when this operation is finished.
    */
  def setNetworkFilter(networks: js.Array[NetworkInfoFilterHexSSID | NetworkInfoFilterSSID], callback: js.Function0[Unit]): Unit = js.native
}

