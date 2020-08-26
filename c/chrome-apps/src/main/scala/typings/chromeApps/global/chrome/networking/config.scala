package typings.chromeApps.global.chrome.networking

import typings.chromeApps.anon.FAILED
import typings.chromeApps.chrome.ToStringLiteral
import typings.chromeApps.chrome.events.Event
import typings.chromeApps.chrome.networking.config.NetworkInfo
import typings.chromeApps.chrome.networking.config.NetworkInfoFilterHexSSID
import typings.chromeApps.chrome.networking.config.NetworkInfoFilterSSID
import typings.chromeApps.chromeAppsStrings.REJECTED
import typings.chromeApps.chromeAppsStrings.SUCCEEDED
import typings.chromeApps.chromeAppsStrings.UNHANDLED
import typings.chromeApps.chromeAppsStrings.WiFi
import typings.chromeApps.chromeAppsStrings.failed_
import typings.chromeApps.chromeAppsStrings.rejected_
import typings.chromeApps.chromeAppsStrings.succeeded_
import typings.chromeApps.chromeAppsStrings.unhandled_
import typings.std.Exclude
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// #endregion
// #region chrome.networking.*
///////////////////////
// NETWORKING CONFIG //
///////////////////////
/**
  * @requires(CrOS) Chrome OS only.
  * @requires Permissions: 'networking.config'
  * @description
  * Use the *networking.config* API to authenticate to captive portals.
  */
@JSGlobal("chrome.networking.config")
@js.native
object config extends js.Object {
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
  val onCaptivePortalDetected: Event[js.Function1[/* networkInfo */ NetworkInfo, Unit]] = js.native
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
    result: ToStringLiteral[
      FAILED, 
      /* keyof chrome-apps.anon.FAILED */ UNHANDLED | SUCCEEDED | REJECTED | typings.chromeApps.chromeAppsStrings.FAILED, 
      Exclude[
        /* keyof chrome-apps.anon.FAILED */ UNHANDLED | SUCCEEDED | REJECTED | typings.chromeApps.chromeAppsStrings.FAILED, 
        unhandled_ | succeeded_ | rejected_ | failed_
      ]
    ]
  ): Unit = js.native
  def finishAuthentication(
    GUID: String,
    result: ToStringLiteral[
      FAILED, 
      /* keyof chrome-apps.anon.FAILED */ UNHANDLED | SUCCEEDED | REJECTED | typings.chromeApps.chromeAppsStrings.FAILED, 
      Exclude[
        /* keyof chrome-apps.anon.FAILED */ UNHANDLED | SUCCEEDED | REJECTED | typings.chromeApps.chromeAppsStrings.FAILED, 
        unhandled_ | succeeded_ | rejected_ | failed_
      ]
    ],
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
  /**
    * Argument to finishAuthentication indicating the result of the captive portal authentication attempt.
    * **'unhandled':** - The extension does not handle this network or captive portal (e.g. server end-point not found or not compatible).
    * **'succeeded':** - The extension handled this network and authenticated successfully.
    * **'rejected':** - The extension handled this network, tried to authenticate, however was rejected by the server.
    * **'failed':** - The extension handled this network, tried to authenticate, however failed due to an unspecified error.
    */
  @js.native
  object AuthenticationResult extends js.Object {
    var FAILED: failed_ = js.native
    var REJECTED: rejected_ = js.native
    var SUCCEEDED: succeeded_ = js.native
    var UNHANDLED: unhandled_ = js.native
  }
  
  /** Indicator for the type of network used */
  @js.native
  object NetworkType extends js.Object {
    var WI_FI: WiFi = js.native
  }
  
}

