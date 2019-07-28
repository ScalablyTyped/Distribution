package typings.chromeDashApps.chromeNs.vpnProviderNs

import typings.chromeDashApps.Anon_CONNECTEDConnected
import typings.chromeDashApps.Anon_CONNECTEDConnectedDISCONNECTED
import typings.chromeDashApps.Anon_SHOWADDDIALOG
import typings.chromeDashApps.chromeDashAppsStrings.connected
import typings.chromeDashApps.chromeDashAppsStrings.disconnected
import typings.chromeDashApps.chromeDashAppsStrings.error
import typings.chromeDashApps.chromeDashAppsStrings.failure
import typings.chromeDashApps.chromeDashAppsStrings.linkChanged
import typings.chromeDashApps.chromeDashAppsStrings.linkDown
import typings.chromeDashApps.chromeDashAppsStrings.linkUp
import typings.chromeDashApps.chromeDashAppsStrings.resume
import typings.chromeDashApps.chromeDashAppsStrings.showAddDialog
import typings.chromeDashApps.chromeDashAppsStrings.showConfigureDialog
import typings.chromeDashApps.chromeDashAppsStrings.suspend
import typings.chromeDashApps.chromeNs.ToStringLiteral
import typings.std.ArrayBuffer
import typings.std.Exclude
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("chrome.vpnProvider")
@js.native
object ^ extends js.Object {
  /** Triggered when a configuration is created by the platform for the extension. */
  val onConfigCreated: typings.chromeDashApps.chromeNs.eventsNs.Event[js.Function3[/* id */ String, /* name */ String, /* data */ js.Object, Unit]] = js.native
  /** Triggered when a configuration created by the extension is removed by the platform. */
  val onConfigRemoved: typings.chromeDashApps.chromeNs.eventsNs.Event[js.Function1[/* id */ String, Unit]] = js.native
  /** Triggered when an IP packet is received via the tunnel for the VPN session owned by the extension. */
  val onPacketReceived: typings.chromeDashApps.chromeNs.eventsNs.Event[js.Function1[/* data */ ArrayBuffer, Unit]] = js.native
  /** Triggered when a message is received from the platform for a VPN configuration owned by the extension. */
  val onPlatformMessage: typings.chromeDashApps.chromeNs.eventsNs.Event[
    js.Function3[
      /* id */ String, 
      /* message */ ToStringLiteral[
        Anon_CONNECTEDConnectedDISCONNECTED, 
        String, 
        Exclude[
          String, 
          linkChanged | linkUp | suspend | error | connected | resume | disconnected | linkDown
        ]
      ], 
      /* error */ String, 
      Unit
    ]
  ] = js.native
  /**
    * Triggered when there is a UI event for the extension.
    * UI events are signals from the platform that indicate to the app that a UI dialog needs to be shown to the user.
    */
  val onUIEvent: typings.chromeDashApps.chromeNs.eventsNs.Event[
    js.Function2[
      /* event */ ToStringLiteral[Anon_SHOWADDDIALOG, String, Exclude[String, showAddDialog | showConfigureDialog]], 
      /* id */ js.UndefOr[String], 
      Unit
    ]
  ] = js.native
  /**
    * Creates a new VPN configuration that persists across multiple login sessions of the user.
    * @param name The name of the VPN configuration.
    * @param callback Called when the configuration is created or if there is an error.
    * Parameter id: A unique ID for the created configuration, empty string on failure.
    */
  def createConfig(name: String, callback: js.Function1[/* id */ String, Unit]): Unit = js.native
  /**
    * Destroys a VPN configuration created by the extension.
    * @param id ID of the VPN configuration to destroy.
    * @param callback Called when the configuration is destroyed or if there is an error.
    */
  def destroyConfig(id: String): Unit = js.native
  def destroyConfig(id: String, callback: js.Function0[Unit]): Unit = js.native
  /**
    * Notifies the VPN session state to the platform. This will succeed only when the VPN session is owned by the extension.
    * @param state The VPN session state of the VPN client.
    * connected: VPN connection was successful.
    * failure: VPN connection failed.
    * @see enum VpnConnectionState
    * @param callback Called when the notification is complete or if there is an error.
    */
  def notifyConnectionStateChanged(state: ToStringLiteral[Anon_CONNECTEDConnected, String, Exclude[String, connected | failure]]): Unit = js.native
  def notifyConnectionStateChanged(
    state: ToStringLiteral[Anon_CONNECTEDConnected, String, Exclude[String, connected | failure]],
    callback: js.Function0[Unit]
  ): Unit = js.native
  /**
    * Sends an IP packet through the tunnel created for the VPN session. This will succeed only when the VPN session is owned by the extension.
    * @param data The IP packet to be sent to the platform.
    * @param callback Called when the packet is sent or if there is an error.
    */
  def sendPacket(data: ArrayBuffer): Unit = js.native
  def sendPacket(data: ArrayBuffer, callback: js.Function0[Unit]): Unit = js.native
  /**
    * Sets the parameters for the VPN session. This should be called immediately after 'connected' is received from the platform. This will succeed only when the VPN session is owned by the extension.
    * @param parameters The parameters for the VPN session.
    * @param callback Called when the parameters are set or if there is an error.
    */
  def setParameters(parameters: VpnSessionParameters, callback: js.Function0[Unit]): Unit = js.native
}

