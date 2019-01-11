package typings
package chromeDashAppsLib.chromeNs.vpnProviderNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("chrome.vpnProvider")
@js.native
object ^ extends js.Object {
  /**
    * The enum is used by the platform to notify the client of the VPN session status.
    *
    * **'connected'**
    * VPN configuration connected.
    * **'disconnected'**
    * VPN configuration disconnected.
    * **'error'**
    * An error occurred in VPN connection, for example a timeout. A description
    * of the error is given as the error argument to *onPlatformMessage*.
    * **'linkDown'**
    * The default physical network connection is down.
    * **'linkUp'**
    * The default physical network connection is back up.
    * **'linkChanged'**
    * The default physical network connection changed, e.g. wifi->mobile.
    * **'suspend'**
    * The OS is preparing to suspend, so the VPN should drop its connection.
    * The extension is not guaranteed to receive this event prior to suspending.
    * **'resume'**
    * The OS has resumed and the user has logged back in, so the VPN should try to reconnect.
    * @enum
    */
  val PlatformMessage: chromeDashAppsLib.Anon_CONNECTEDConnected = js.native
  /**
    * The enum is used by the platform to indicate the event that triggered *onUIEvent*
    *
    * **'showAddDialog'**
    * Request the VPN client to show add configuration dialog to the user.
    * **'showConfigureDialog'**
    * Request the VPN client to show configuration settings dialog to the user.
    * @enum
    */
  val UIEvent: chromeDashAppsLib.Anon_SHOWADDDIALOG = js.native
  /**
    * The enum is used by the VPN client to inform the platform of its current state.
    * This helps provide meaningful messages to the user.
    *
    * **'connected'**
    * VPN connection was successful.
    * **'failure'**
    * VPN connection failed.
    * @enum
    */
  val VpnConnectionState: chromeDashAppsLib.Anon_CONNECTEDConnectedFAILURE = js.native
  /** Triggered when a configuration is created by the platform for the extension. */
  val onConfigCreated: chromeDashAppsLib.chromeNs.eventsNs.Event[
    js.Function3[
      /* id */ java.lang.String, 
      /* name */ java.lang.String, 
      /* data */ js.Object, 
      scala.Unit
    ]
  ] = js.native
  /** Triggered when a configuration created by the extension is removed by the platform. */
  val onConfigRemoved: chromeDashAppsLib.chromeNs.eventsNs.Event[js.Function1[/* id */ java.lang.String, scala.Unit]] = js.native
  /** Triggered when an IP packet is received via the tunnel for the VPN session owned by the extension. */
  val onPacketReceived: chromeDashAppsLib.chromeNs.eventsNs.Event[js.Function1[/* data */ stdLib.ArrayBuffer, scala.Unit]] = js.native
  /** Triggered when a message is received from the platform for a VPN configuration owned by the extension. */
  val onPlatformMessage: chromeDashAppsLib.chromeNs.eventsNs.Event[
    js.Function3[
      /* id */ java.lang.String, 
      /* message */ chromeDashAppsLib.chromeNs.ToStringLiteral[
        chromeDashAppsLib.Anon_CONNECTEDConnected, 
        java.lang.String, 
        stdLib.Exclude[
          java.lang.String, 
          /* import warning: ImportType.apply Failed type conversion: chrome-apps.Anon_CONNECTEDConnected[keyof chrome-apps.Anon_CONNECTEDConnected] */ js.Any
        ]
      ], 
      /* error */ java.lang.String, 
      scala.Unit
    ]
  ] = js.native
  /**
    * Triggered when there is a UI event for the extension.
    * UI events are signals from the platform that indicate to the app that a UI dialog needs to be shown to the user.
    */
  val onUIEvent: chromeDashAppsLib.chromeNs.eventsNs.Event[
    js.Function2[
      /* event */ chromeDashAppsLib.chromeNs.ToStringLiteral[
        chromeDashAppsLib.Anon_SHOWADDDIALOG, 
        java.lang.String, 
        stdLib.Exclude[
          java.lang.String, 
          /* import warning: ImportType.apply Failed type conversion: chrome-apps.Anon_SHOWADDDIALOG[keyof chrome-apps.Anon_SHOWADDDIALOG] */ js.Any
        ]
      ], 
      /* id */ js.UndefOr[java.lang.String], 
      scala.Unit
    ]
  ] = js.native
  /**
    * Creates a new VPN configuration that persists across multiple login sessions of the user.
    * @param name The name of the VPN configuration.
    * @param callback Called when the configuration is created or if there is an error.
    * Parameter id: A unique ID for the created configuration, empty string on failure.
    */
  def createConfig(name: java.lang.String, callback: js.Function1[/* id */ java.lang.String, scala.Unit]): scala.Unit = js.native
  /**
    * Destroys a VPN configuration created by the extension.
    * @param id ID of the VPN configuration to destroy.
    * @param callback Called when the configuration is destroyed or if there is an error.
    */
  def destroyConfig(id: java.lang.String): scala.Unit = js.native
  def destroyConfig(id: java.lang.String, callback: js.Function0[scala.Unit]): scala.Unit = js.native
  /**
    * Notifies the VPN session state to the platform. This will succeed only when the VPN session is owned by the extension.
    * @param state The VPN session state of the VPN client.
    * connected: VPN connection was successful.
    * failure: VPN connection failed.
    * @see enum VpnConnectionState
    * @param callback Called when the notification is complete or if there is an error.
    */
  def notifyConnectionStateChanged(
    state: chromeDashAppsLib.chromeNs.ToStringLiteral[
      chromeDashAppsLib.Anon_CONNECTEDConnectedFAILURE, 
      java.lang.String, 
      stdLib.Exclude[
        java.lang.String, 
        /* import warning: ImportType.apply Failed type conversion: chrome-apps.Anon_CONNECTEDConnectedFAILURE[keyof chrome-apps.Anon_CONNECTEDConnectedFAILURE] */ js.Any
      ]
    ]
  ): scala.Unit = js.native
  def notifyConnectionStateChanged(
    state: chromeDashAppsLib.chromeNs.ToStringLiteral[
      chromeDashAppsLib.Anon_CONNECTEDConnectedFAILURE, 
      java.lang.String, 
      stdLib.Exclude[
        java.lang.String, 
        /* import warning: ImportType.apply Failed type conversion: chrome-apps.Anon_CONNECTEDConnectedFAILURE[keyof chrome-apps.Anon_CONNECTEDConnectedFAILURE] */ js.Any
      ]
    ],
    callback: js.Function0[scala.Unit]
  ): scala.Unit = js.native
  /**
    * Sends an IP packet through the tunnel created for the VPN session. This will succeed only when the VPN session is owned by the extension.
    * @param data The IP packet to be sent to the platform.
    * @param callback Called when the packet is sent or if there is an error.
    */
  def sendPacket(data: stdLib.ArrayBuffer): scala.Unit = js.native
  def sendPacket(data: stdLib.ArrayBuffer, callback: js.Function0[scala.Unit]): scala.Unit = js.native
  /**
    * Sets the parameters for the VPN session. This should be called immediately after 'connected' is received from the platform. This will succeed only when the VPN session is owned by the extension.
    * @param parameters The parameters for the VPN session.
    * @param callback Called when the parameters are set or if there is an error.
    */
  def setParameters(
    parameters: chromeDashAppsLib.chromeNs.vpnProviderNs.VpnSessionParameters,
    callback: js.Function0[scala.Unit]
  ): scala.Unit = js.native
}

