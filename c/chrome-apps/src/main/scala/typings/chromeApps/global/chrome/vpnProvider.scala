package typings.chromeApps.global.chrome

import typings.chromeApps.anon.CONNECTEDFAILURE
import typings.chromeApps.anon.DISCONNECTED
import typings.chromeApps.anon.SHOWADDDIALOG
import typings.chromeApps.chrome.ToStringLiteral
import typings.chromeApps.chrome.vpnProvider.VpnSessionParameters
import typings.chromeApps.chromeAppsStrings.CONNECTED
import typings.chromeApps.chromeAppsStrings.ERROR
import typings.chromeApps.chromeAppsStrings.FAILURE
import typings.chromeApps.chromeAppsStrings.LINK_CHANGED
import typings.chromeApps.chromeAppsStrings.LINK_DOWN
import typings.chromeApps.chromeAppsStrings.LINK_UP
import typings.chromeApps.chromeAppsStrings.RESUME
import typings.chromeApps.chromeAppsStrings.SHOW_ADD_DIALOG
import typings.chromeApps.chromeAppsStrings.SHOW_CONFIGURE_DIALOG
import typings.chromeApps.chromeAppsStrings.SUSPEND
import typings.chromeApps.chromeAppsStrings.connected__
import typings.chromeApps.chromeAppsStrings.disconnected__
import typings.chromeApps.chromeAppsStrings.error_
import typings.chromeApps.chromeAppsStrings.failure_
import typings.chromeApps.chromeAppsStrings.linkChanged
import typings.chromeApps.chromeAppsStrings.linkDown
import typings.chromeApps.chromeAppsStrings.linkUp
import typings.chromeApps.chromeAppsStrings.resume_
import typings.chromeApps.chromeAppsStrings.showAddDialog
import typings.chromeApps.chromeAppsStrings.showConfigureDialog
import typings.chromeApps.chromeAppsStrings.suspend_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// #endregion
// #region chrome.vpnProvider
//////////////////
// VPN Provider //
//////////////////
/**
  * Use the chrome.vpnProvider API to implement a VPN client.
  * @requires(CrOS) Important: This API works only on Chrome OS.
  * @requires Permissions: 'vpnProvider'
  * @since Chrome 43.
  */
object vpnProvider {
  
  @JSGlobal("chrome.vpnProvider")
  @js.native
  val ^ : js.Any = js.native
  
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
    */
  object PlatformMessage {
    
    @JSGlobal("chrome.vpnProvider.PlatformMessage")
    @js.native
    val ^ : js.Any = js.native
    
    @JSGlobal("chrome.vpnProvider.PlatformMessage.CONNECTED")
    @js.native
    def CONNECTED: connected__ = js.native
    inline def CONNECTED_=(x: connected__): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CONNECTED")(x.asInstanceOf[js.Any])
    
    @JSGlobal("chrome.vpnProvider.PlatformMessage.DISCONNECTED")
    @js.native
    def DISCONNECTED: disconnected__ = js.native
    inline def DISCONNECTED_=(x: disconnected__): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DISCONNECTED")(x.asInstanceOf[js.Any])
    
    @JSGlobal("chrome.vpnProvider.PlatformMessage.ERROR")
    @js.native
    def ERROR: error_ = js.native
    inline def ERROR_=(x: error_): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ERROR")(x.asInstanceOf[js.Any])
    
    @JSGlobal("chrome.vpnProvider.PlatformMessage.LINK_CHANGED")
    @js.native
    def LINK_CHANGED: linkChanged = js.native
    inline def LINK_CHANGED_=(x: linkChanged): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("LINK_CHANGED")(x.asInstanceOf[js.Any])
    
    @JSGlobal("chrome.vpnProvider.PlatformMessage.LINK_DOWN")
    @js.native
    def LINK_DOWN: linkDown = js.native
    inline def LINK_DOWN_=(x: linkDown): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("LINK_DOWN")(x.asInstanceOf[js.Any])
    
    @JSGlobal("chrome.vpnProvider.PlatformMessage.LINK_UP")
    @js.native
    def LINK_UP: linkUp = js.native
    inline def LINK_UP_=(x: linkUp): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("LINK_UP")(x.asInstanceOf[js.Any])
    
    @JSGlobal("chrome.vpnProvider.PlatformMessage.RESUME")
    @js.native
    def RESUME: resume_ = js.native
    inline def RESUME_=(x: resume_): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("RESUME")(x.asInstanceOf[js.Any])
    
    @JSGlobal("chrome.vpnProvider.PlatformMessage.SUSPEND")
    @js.native
    def SUSPEND: suspend_ = js.native
    inline def SUSPEND_=(x: suspend_): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SUSPEND")(x.asInstanceOf[js.Any])
  }
  
  /**
    * The enum is used by the platform to indicate the event that triggered *onUIEvent*
    *
    * **'showAddDialog'**
    * Request the VPN client to show add configuration dialog to the user.
    * **'showConfigureDialog'**
    * Request the VPN client to show configuration settings dialog to the user.
    */
  object UIEvent {
    
    @JSGlobal("chrome.vpnProvider.UIEvent")
    @js.native
    val ^ : js.Any = js.native
    
    @JSGlobal("chrome.vpnProvider.UIEvent.SHOW_ADD_DIALOG")
    @js.native
    def SHOW_ADD_DIALOG: showAddDialog = js.native
    inline def SHOW_ADD_DIALOG_=(x: showAddDialog): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SHOW_ADD_DIALOG")(x.asInstanceOf[js.Any])
    
    @JSGlobal("chrome.vpnProvider.UIEvent.SHOW_CONFIGURE_DIALOG")
    @js.native
    def SHOW_CONFIGURE_DIALOG: showConfigureDialog = js.native
    inline def SHOW_CONFIGURE_DIALOG_=(x: showConfigureDialog): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SHOW_CONFIGURE_DIALOG")(x.asInstanceOf[js.Any])
  }
  
  /**
    * The enum is used by the VPN client to inform the platform of its current state.
    * This helps provide meaningful messages to the user.
    *
    * **'connected'**
    * VPN connection was successful.
    * **'failure'**
    * VPN connection failed.
    */
  object VpnConnectionState {
    
    @JSGlobal("chrome.vpnProvider.VpnConnectionState")
    @js.native
    val ^ : js.Any = js.native
    
    @JSGlobal("chrome.vpnProvider.VpnConnectionState.CONNECTED")
    @js.native
    def CONNECTED: connected__ = js.native
    inline def CONNECTED_=(x: connected__): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CONNECTED")(x.asInstanceOf[js.Any])
    
    @JSGlobal("chrome.vpnProvider.VpnConnectionState.FAILURE")
    @js.native
    def FAILURE: failure_ = js.native
    inline def FAILURE_=(x: failure_): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FAILURE")(x.asInstanceOf[js.Any])
  }
  
  /**
    * Creates a new VPN configuration that persists across multiple login sessions of the user.
    * @param name The name of the VPN configuration.
    * @param callback Called when the configuration is created or if there is an error.
    * Parameter id: A unique ID for the created configuration, empty string on failure.
    */
  inline def createConfig(name: String, callback: js.Function1[/* id */ String, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("createConfig")(name.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /**
    * Destroys a VPN configuration created by the extension.
    * @param id ID of the VPN configuration to destroy.
    * @param callback Called when the configuration is destroyed or if there is an error.
    */
  inline def destroyConfig(id: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("destroyConfig")(id.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def destroyConfig(id: String, callback: js.Function0[Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("destroyConfig")(id.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /**
    * Notifies the VPN session state to the platform. This will succeed only when the VPN session is owned by the extension.
    * @param state The VPN session state of the VPN client.
    * connected: VPN connection was successful.
    * failure: VPN connection failed.
    * @see enum VpnConnectionState
    * @param callback Called when the notification is complete or if there is an error.
    */
  inline def notifyConnectionStateChanged(
    state: ToStringLiteral[
      CONNECTEDFAILURE, 
      /* keyof chrome-apps.anon.CONNECTEDFAILURE */ CONNECTED | FAILURE, 
      /* import warning: importer.ImportType#apply Failed type conversion: keyof {  CONNECTED :'connected',   FAILURE :'failure'} extends keyof {  CONNECTED :'connected',   FAILURE :'failure'} ? std.Exclude<keyof {  CONNECTED :'connected',   FAILURE :'failure'}, 'connected' | 'failure'> : never */ js.Any
    ]
  ): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("notifyConnectionStateChanged")(state.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def notifyConnectionStateChanged(
    state: ToStringLiteral[
      CONNECTEDFAILURE, 
      /* keyof chrome-apps.anon.CONNECTEDFAILURE */ CONNECTED | FAILURE, 
      /* import warning: importer.ImportType#apply Failed type conversion: keyof {  CONNECTED :'connected',   FAILURE :'failure'} extends keyof {  CONNECTED :'connected',   FAILURE :'failure'} ? std.Exclude<keyof {  CONNECTED :'connected',   FAILURE :'failure'}, 'connected' | 'failure'> : never */ js.Any
    ],
    callback: js.Function0[Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("notifyConnectionStateChanged")(state.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /** Triggered when a configuration is created by the platform for the extension. */
  @JSGlobal("chrome.vpnProvider.onConfigCreated")
  @js.native
  val onConfigCreated: typings.chromeApps.chrome.events.Event[js.Function3[/* id */ String, /* name */ String, /* data */ js.Object, Unit]] = js.native
  
  /** Triggered when a configuration created by the extension is removed by the platform. */
  @JSGlobal("chrome.vpnProvider.onConfigRemoved")
  @js.native
  val onConfigRemoved: typings.chromeApps.chrome.events.Event[js.Function1[/* id */ String, Unit]] = js.native
  
  /** Triggered when an IP packet is received via the tunnel for the VPN session owned by the extension. */
  @JSGlobal("chrome.vpnProvider.onPacketReceived")
  @js.native
  val onPacketReceived: typings.chromeApps.chrome.events.Event[js.Function1[/* data */ js.typedarray.ArrayBuffer, Unit]] = js.native
  
  /** Triggered when a message is received from the platform for a VPN configuration owned by the extension. */
  @JSGlobal("chrome.vpnProvider.onPlatformMessage")
  @js.native
  val onPlatformMessage: typings.chromeApps.chrome.events.Event[
    js.Function3[
      /* id */ String, 
      /* message */ ToStringLiteral[
        DISCONNECTED, 
        /* keyof chrome-apps.anon.DISCONNECTED */ CONNECTED | typings.chromeApps.chromeAppsStrings.DISCONNECTED | ERROR | LINK_DOWN | LINK_UP | LINK_CHANGED | SUSPEND | RESUME, 
        /* import warning: importer.ImportType#apply Failed type conversion: keyof {  CONNECTED :'connected',   DISCONNECTED :'disconnected',   ERROR :'error',   LINK_DOWN :'linkDown',   LINK_UP :'linkUp',   LINK_CHANGED :'linkChanged',   SUSPEND :'suspend',   RESUME :'resume'} extends keyof {  CONNECTED :'connected',   DISCONNECTED :'disconnected',   ERROR :'error',   LINK_DOWN :'linkDown',   LINK_UP :'linkUp',   LINK_CHANGED :'linkChanged',   SUSPEND :'suspend',   RESUME :'resume'} ? std.Exclude<keyof {  CONNECTED :'connected',   DISCONNECTED :'disconnected',   ERROR :'error',   LINK_DOWN :'linkDown',   LINK_UP :'linkUp',   LINK_CHANGED :'linkChanged',   SUSPEND :'suspend',   RESUME :'resume'}, 'linkUp' | 'linkChanged' | 'suspend' | 'resume' | 'linkDown' | 'connected' | 'error' | 'disconnected'> : never */ js.Any
      ], 
      /* error */ String, 
      Unit
    ]
  ] = js.native
  
  /**
    * Triggered when there is a UI event for the extension.
    * UI events are signals from the platform that indicate to the app that a UI dialog needs to be shown to the user.
    */
  @JSGlobal("chrome.vpnProvider.onUIEvent")
  @js.native
  val onUIEvent: typings.chromeApps.chrome.events.Event[
    js.Function2[
      /* event */ ToStringLiteral[
        SHOWADDDIALOG, 
        /* keyof chrome-apps.anon.SHOWADDDIALOG */ SHOW_ADD_DIALOG | SHOW_CONFIGURE_DIALOG, 
        /* import warning: importer.ImportType#apply Failed type conversion: keyof {  SHOW_ADD_DIALOG :'showAddDialog',   SHOW_CONFIGURE_DIALOG :'showConfigureDialog'} extends keyof {  SHOW_ADD_DIALOG :'showAddDialog',   SHOW_CONFIGURE_DIALOG :'showConfigureDialog'} ? std.Exclude<keyof {  SHOW_ADD_DIALOG :'showAddDialog',   SHOW_CONFIGURE_DIALOG :'showConfigureDialog'}, 'showAddDialog' | 'showConfigureDialog'> : never */ js.Any
      ], 
      /* id */ js.UndefOr[String], 
      Unit
    ]
  ] = js.native
  
  /**
    * Sends an IP packet through the tunnel created for the VPN session. This will succeed only when the VPN session is owned by the extension.
    * @param data The IP packet to be sent to the platform.
    * @param callback Called when the packet is sent or if there is an error.
    */
  inline def sendPacket(data: js.typedarray.ArrayBuffer): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("sendPacket")(data.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def sendPacket(data: js.typedarray.ArrayBuffer, callback: js.Function0[Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("sendPacket")(data.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /**
    * Sets the parameters for the VPN session. This should be called immediately after 'connected' is received from the platform. This will succeed only when the VPN session is owned by the extension.
    * @param parameters The parameters for the VPN session.
    * @param callback Called when the parameters are set or if there is an error.
    */
  inline def setParameters(parameters: VpnSessionParameters, callback: js.Function0[Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setParameters")(parameters.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
