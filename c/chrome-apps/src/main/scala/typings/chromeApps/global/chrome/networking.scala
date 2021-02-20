package typings.chromeApps.global.chrome

import typings.chromeApps.anon.FAILED
import typings.chromeApps.chrome.ToStringLiteral
import typings.chromeApps.chrome.networking.config.NetworkInfo
import typings.chromeApps.chrome.networking.config.NetworkInfoFilterHexSSID
import typings.chromeApps.chrome.networking.config.NetworkInfoFilterSSID
import typings.chromeApps.chrome.networking.onc.CaptivePortalStatus
import typings.chromeApps.chrome.networking.onc.DeviceStates
import typings.chromeApps.chrome.networking.onc.Filter
import typings.chromeApps.chrome.networking.onc.GlobalPolicy
import typings.chromeApps.chrome.networking.onc.ManagedProperties
import typings.chromeApps.chrome.networking.onc.NetworkConfigProperties
import typings.chromeApps.chrome.networking.onc.NetworkProperties
import typings.chromeApps.chrome.networking.onc.NetworkStateProperties
import typings.chromeApps.chrome.networking.onc.NetworkType
import typings.chromeApps.chromeAppsBooleans.`false`
import typings.chromeApps.chromeAppsStrings.REJECTED
import typings.chromeApps.chromeAppsStrings.SUCCEEDED
import typings.chromeApps.chromeAppsStrings.UNHANDLED
import typings.chromeApps.chromeAppsStrings.WiFi
import typings.chromeApps.chromeAppsStrings.failed_
import typings.chromeApps.chromeAppsStrings.full
import typings.chromeApps.chromeAppsStrings.rejected_
import typings.chromeApps.chromeAppsStrings.setter
import typings.chromeApps.chromeAppsStrings.succeeded_
import typings.chromeApps.chromeAppsStrings.unhandled_
import typings.chromeApps.chromeAppsStrings.unmanaged
import typings.std.Exclude
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object networking {
  
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
  object config {
    
    /**
      * Argument to finishAuthentication indicating the result of the captive portal authentication attempt.
      * **'unhandled':** - The extension does not handle this network or captive portal (e.g. server end-point not found or not compatible).
      * **'succeeded':** - The extension handled this network and authenticated successfully.
      * **'rejected':** - The extension handled this network, tried to authenticate, however was rejected by the server.
      * **'failed':** - The extension handled this network, tried to authenticate, however failed due to an unspecified error.
      */
    object AuthenticationResult {
      
      @JSGlobal("chrome.networking.config.AuthenticationResult")
      @js.native
      val ^ : js.Any = js.native
      
      @JSGlobal("chrome.networking.config.AuthenticationResult.FAILED")
      @js.native
      def FAILED: failed_ = js.native
      @scala.inline
      def FAILED_=(x: failed_): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FAILED")(x.asInstanceOf[js.Any])
      
      @JSGlobal("chrome.networking.config.AuthenticationResult.REJECTED")
      @js.native
      def REJECTED: rejected_ = js.native
      @scala.inline
      def REJECTED_=(x: rejected_): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("REJECTED")(x.asInstanceOf[js.Any])
      
      @JSGlobal("chrome.networking.config.AuthenticationResult.SUCCEEDED")
      @js.native
      def SUCCEEDED: succeeded_ = js.native
      @scala.inline
      def SUCCEEDED_=(x: succeeded_): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SUCCEEDED")(x.asInstanceOf[js.Any])
      
      @JSGlobal("chrome.networking.config.AuthenticationResult.UNHANDLED")
      @js.native
      def UNHANDLED: unhandled_ = js.native
      @scala.inline
      def UNHANDLED_=(x: unhandled_): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("UNHANDLED")(x.asInstanceOf[js.Any])
    }
    
    /** Indicator for the type of network used */
    object NetworkType {
      
      @JSGlobal("chrome.networking.config.NetworkType")
      @js.native
      val ^ : js.Any = js.native
      
      @JSGlobal("chrome.networking.config.NetworkType.WI_FI")
      @js.native
      def WI_FI: WiFi = js.native
      @scala.inline
      def WI_FI_=(x: WiFi): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("WI_FI")(x.asInstanceOf[js.Any])
    }
    
    /**
      * Called by the app to notify the network config API that it finished
      * a captive portal authentication attempt and hand over the result of the attempt.
      * This function must only be called with the GUID of the latest *onCaptivePortalDetected* event.
      * @param GUID Unique network identifier obtained from *onCaptivePortalDetected*.
      * @param result The result of the authentication attempt.
      * @param [callback] Called back when this operation is finished.
      */
    @JSGlobal("chrome.networking.config.finishAuthentication")
    @js.native
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
    @JSGlobal("chrome.networking.config.finishAuthentication")
    @js.native
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
    val onCaptivePortalDetected: typings.chromeApps.chrome.events.Event[js.Function1[/* networkInfo */ NetworkInfo, Unit]] = js.native
    
    /**
      * Allows an extension to define network filters for the networks it can handle.
      * A call to this function will remove all filters previously
      * installed by the extension before setting the new list.
      * @param networks Network filters to set. Array of objects with either HexSSID or SSID set.
      * @param callback Called back when this operation is finished.
      */
    @JSGlobal("chrome.networking.config.setNetworkFilter")
    @js.native
    def setNetworkFilter(networks: js.Array[NetworkInfoFilterHexSSID | NetworkInfoFilterSSID], callback: js.Function0[Unit]): Unit = js.native
  }
  
  //////////////////////////////////////
  // Open Network Configuration (ONC) //
  //////////////////////////////////////
  /**
    * @requires(CrOS kiosk mode) This API is available in Chrome OS kiosk sessions.
    * @requires Permissions: 'networking.onc'
    * @since Chrome 59
    * @description
    * The chrome.networking.onc API is used for configuring network connections
    * (Cellular, Ethernet, VPN, WiFi or WiMAX).
    * Network connection configurations are specified following
    * @see[Open Network Configuration (ONC) specification.]{@link https://chromium.googlesource.com/chromium/src/+/master/components/onc/docs/onc_spec.md}
    * @description
    * **NOTE**
    * Most interface properties and type values use UpperCamelCase to match
    * the ONC specification instead of the JavaScript lowerCamelCase convention.
    */
  object onc {
    
    /**
      * Creates a new network configuration from properties.
      * If a matching configured network already exists, this will fail.
      * Otherwise returns the GUID of the new network.
      * @param shared If true, share this network configuration with other users.
      *               Note: This option is exposed only to Chrome's Web UI.
      *               When called by apps, false is the only allowed value.
      * @param properties The properties to configure the new network with.
      * @param [callback] Called with the GUID for the new network configuration once the network has been created.
      */
    @JSGlobal("chrome.networking.onc.createNetwork")
    @js.native
    def createNetwork(shared: `false`, properties: NetworkConfigProperties[setter]): Unit = js.native
    @JSGlobal("chrome.networking.onc.createNetwork")
    @js.native
    def createNetwork(shared: `false`, properties: NetworkConfigProperties[setter], callback: js.Function0[Unit]): Unit = js.native
    
    /**
      * Disables any devices matching the specified network type.
      * Note, the type might represent multiple network types (e.g. 'Wireless').
      * @param networkType The type of network to disable.
      */
    @JSGlobal("chrome.networking.onc.disableNetworkType")
    @js.native
    def disableNetworkType(networkType: NetworkType): Unit = js.native
    
    /**
      * Enables any devices matching the specified network type.
      * Note, the type might represent multiple network types (e.g. 'Wireless').
      * @param networkType The type of network to enable.
      */
    @JSGlobal("chrome.networking.onc.enableNetworkType")
    @js.native
    def enableNetworkType(networkType: NetworkType): Unit = js.native
    
    /**
      * Forgets a network configuration by clearing any configured properties for the network with GUID networkGuid.
      * This may also include any other networks with matching identifiers (e.g. WiFi SSID and Security).
      * If no such configuration exists, an error will be set and the operation will fail.
      * **In kiosk sessions, this method will not be able to forget shared network configurations.**
      * @param networkGuid The GUID of the network to forget.
      * @param [callback] Called when the operation has completed.
      */
    @JSGlobal("chrome.networking.onc.forgetNetwork")
    @js.native
    def forgetNetwork(networkGuid: String): Unit = js.native
    @JSGlobal("chrome.networking.onc.forgetNetwork")
    @js.native
    def forgetNetwork(networkGuid: String, callback: js.Function0[Unit]): Unit = js.native
    
    /**
      * Returns captive portal status for the network matching 'networkGuid'.
      * @param networkGuid The GUID of the network to get captive portal status for.
      * @param callback A callback function that returns the results of the query for network captive portal status.
      */
    @JSGlobal("chrome.networking.onc.getCaptivePortalStatus")
    @js.native
    def getCaptivePortalStatus(networkGuid: String, callback: js.Function1[/* result */ CaptivePortalStatus, Unit]): Unit = js.native
    
    /**
      * Returns states of available networking devices.
      * @param callback Called with a list of devices and their state.
      */
    @JSGlobal("chrome.networking.onc.getDeviceStates")
    @js.native
    def getDeviceStates(callback: js.Function1[/* result */ js.Array[DeviceStates], Unit]): Unit = js.native
    
    /**
      * Gets the global policy properties.
      * These properties are not expected to change during a session.
      */
    @JSGlobal("chrome.networking.onc.getGlobalPolicy")
    @js.native
    def getGlobalPolicy(callback: js.Function1[/* result */ GlobalPolicy, Unit]): Unit = js.native
    
    /**
      * Gets the merged properties of the network with id networkGuid from the sources:
      * User settings, shared settings, user policy, device policy and the currently active settings.
      * @param networkGuid The GUID of the network to get properties for.
      * @param callback Called with the managed network properties when received.
      */
    @JSGlobal("chrome.networking.onc.getManagedProperties")
    @js.native
    def getManagedProperties(networkGuid: String, callback: js.Function1[/* result */ ManagedProperties, Unit]): Unit = js.native
    
    /**
      * Returns a list of network objects with the same properties provided by *getState*.
      * A filter is provided to specify the type of networks returned and to limit the number of networks.
      * Networks are ordered by the system based on their priority, with connected or connecting networks listed first.
      * @param callback Called with a interface of networks and their state properties when received.
      */
    @JSGlobal("chrome.networking.onc.getNetworks")
    @js.native
    def getNetworks(filter: Filter, callback: js.Function1[/* result */ js.Array[NetworkStateProperties], Unit]): Unit = js.native
    
    /**
      * Gets all the properties of the network with id *networkGuid*.
      * Includes all properties of the network (read-only and read/write values).
      * @param networkGuid The GUID of the network to get properties for.
      * @param callback Called with the network properties when received.
      */
    @JSGlobal("chrome.networking.onc.getProperties")
    @js.native
    def getProperties(networkGuid: String, callback: js.Function1[/* result */ NetworkProperties[unmanaged, full], Unit]): Unit = js.native
    
    /**
      * Gets the cached read-only properties of the network with id *networkGuid*.
      * This is meant to be a higher performance function than *getProperties*,
      * which requires a round trip to query the networking subsystem.
      * The following properties are returned for all networks:
      * GUID, Type, Name, WiFi.Security.
      * Additional properties are provided for visible networks:
      * ConnectionState, ErrorState, WiFi.SignalStrength,
      * Cellular.NetworkTechnology, Cellular.ActivationState, Cellular.RoamingState.
      * @param networkGuid The GUID of the network to get properties for.
      * @param callback Called immediately with the network state properties.
      */
    @JSGlobal("chrome.networking.onc.getState")
    @js.native
    def getState(networkGuid: String, callback: js.Function1[/* result */ NetworkStateProperties, Unit]): Unit = js.native
    
    /**
      * Fired when the list of devices has changed or any device state properties have changed.
      */
    @JSGlobal("chrome.networking.onc.onDeviceStateListChanged")
    @js.native
    val onDeviceStateListChanged: typings.chromeApps.chrome.events.Event[js.Function0[Unit]] = js.native
    
    /**
      * Fired when the list of networks has changed. Sends a complete list of GUIDs for all the current networks.
      */
    @JSGlobal("chrome.networking.onc.onNetworkListChanged")
    @js.native
    val onNetworkListChanged: typings.chromeApps.chrome.events.Event[js.Function1[/* changes */ js.Array[String], Unit]] = js.native
    
    //
    // EVENTS
    //
    /**
      * Fired when the properties change on any of the networks.
      * Sends a list of GUIDs for networks whose properties have changed.
      */
    @JSGlobal("chrome.networking.onc.onNetworksChanged")
    @js.native
    val onNetworksChanged: typings.chromeApps.chrome.events.Event[js.Function1[/* changes */ js.Array[String], Unit]] = js.native
    
    /**
      * Fired when a portal detection for a network completes.
      * Sends the GUID of the network and the corresponding captive portal status.
      */
    @JSGlobal("chrome.networking.onc.onPortalDetectionCompleted")
    @js.native
    val onPortalDetectionCompleted: typings.chromeApps.chrome.events.Event[js.Function2[/* networkGuid */ String, /* status */ CaptivePortalStatus, Unit]] = js.native
    
    /**
      * Requests that the networking subsystem scan for new networks and update the list returned by *getVisibleNetworks*.
      * This is only a request: the network subsystem can choose to ignore it.
      * If the list is updated, then the *onNetworkListChanged* event will be fired.
      */
    @JSGlobal("chrome.networking.onc.requestNetworkScan")
    @js.native
    def requestNetworkScan(): Unit = js.native
    /**
      * Requests that the networking subsystem scan for new networks and update the list returned by *getVisibleNetworks*.
      * This is only a request: the network subsystem can choose to ignore it.
      * If the list is updated, then the *onNetworkListChanged* event will be fired.
      * @param networkType If provided, requests a scan specific to the type. For Cellular a mobile network scan will be requested if supported.
      * @since Chrome 63.
      */
    @JSGlobal("chrome.networking.onc.requestNetworkScan")
    @js.native
    def requestNetworkScan(networkType: NetworkType): Unit = js.native
    
    /**
      * Sets the properties of the network with id *networkGuid*.
      * This is only valid for configured networks (Source != None).
      * Unconfigured visible networks should use **createNetwork** instead.
      * **In kiosk sessions, calling this method on a shared network will fail.**
      * @param networkGuid The GUID of the network to set properties for.
      * @param properties The properties to set.
      * @param [callback] Called when the operation has completed.
      */
    @JSGlobal("chrome.networking.onc.setProperties")
    @js.native
    def setProperties_setter(networkGuid: String, properties: NetworkConfigProperties[setter]): Unit = js.native
    @JSGlobal("chrome.networking.onc.setProperties")
    @js.native
    def setProperties_setter(networkGuid: String, properties: NetworkConfigProperties[setter], callback: js.Function0[Unit]): Unit = js.native
    
    /**
      * @description Starts a connection to the network with networkGuid.
      * @param networkGuid The GUID of the network to connect to.
      * @param [callback] Creates a new network configuration from properties.
      *                   If a matching configured network already exists, this will fail.
      *                   Otherwise returns the GUID of the new network.
      */
    @JSGlobal("chrome.networking.onc.startConnect")
    @js.native
    def startConnect(networkGuid: String): Unit = js.native
    @JSGlobal("chrome.networking.onc.startConnect")
    @js.native
    def startConnect(networkGuid: String, callback: js.Function0[Unit]): Unit = js.native
    
    /**
      * @description Starts a disconnect from the network with networkGuid.
      * @param networkGuid The GUID of the network to connect to.
      * @param [callback] Called when the disconnect request has been sent. See note for *startConnect*.
      */
    @JSGlobal("chrome.networking.onc.startDisconnect")
    @js.native
    def startDisconnect(networkGuid: String): Unit = js.native
    @JSGlobal("chrome.networking.onc.startDisconnect")
    @js.native
    def startDisconnect(networkGuid: String, callback: js.Function0[Unit]): Unit = js.native
    
    /**
      * Partial classes for internal use
      * @internal
      * @private
      */
    object internal
  }
}
