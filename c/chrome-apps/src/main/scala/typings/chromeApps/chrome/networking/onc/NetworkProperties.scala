package typings.chromeApps.chrome.networking.onc

import typings.chromeApps.chrome.integer
import typings.chromeApps.chrome.networking.onc.internal.NetworkConfigBase
import typings.chromeApps.chromeAppsStrings.DevicePolicy
import typings.chromeApps.chromeAppsStrings.Device_
import typings.chromeApps.chromeAppsStrings.None
import typings.chromeApps.chromeAppsStrings.User
import typings.chromeApps.chromeAppsStrings.UserPolicy
import typings.chromeApps.chromeAppsStrings.getter
import typings.chromeApps.chromeAppsStrings.unmanaged
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NetworkProperties[M /* <: ManagedObject */, IF /* <: InterfaceType */] extends NetworkConfigBase[M, IF, getter] {
  
  /** Whether the network is connectable. */
  var Connectable: js.UndefOr[Boolean] = js.native
  
  /** The network's current connection state. */
  var ConnectionState: js.UndefOr[ConnectionStateType] = js.native
  
  /** The last recorded network error state. */
  var ErrorState: js.UndefOr[String] = js.native
  
  /** The network's IP configuration. */
  var IPConfigs: js.UndefOr[
    js.Array[
      IPConfigProperties[
        unmanaged, 
        Boolean | ManagedBoolean, 
        String | ManagedDOMString, 
        js.Array[String] | ManagedDOMStringList, 
        integer | ManagedLong
      ]
    ]
  ] = js.native
  
  /** The network's MAC address. */
  var MacAddress: js.UndefOr[String] = js.native
  
  /** The network's proxy settings. */
  var ProxySettings: js.UndefOr[
    typings.chromeApps.chrome.networking.onc.ProxySettings[unmanaged, String | ManagedDOMString, js.Array[String] | ManagedDOMStringList]
  ] = js.native
  
  /**
    * For a connected network, whether the network connectivity to the Internet is limited,
    * e.g. if the network is behind a portal, or a cellular network is not activated.
    */
  var RestrictedConnectivity: js.UndefOr[Boolean] = js.native
  
  /** IP configuration that was received from the DHCP server before applying static IP configuration. */
  var SavedIPConfig: js.UndefOr[
    IPConfigProperties[
      unmanaged, 
      Boolean | ManagedBoolean, 
      String | ManagedDOMString, 
      js.Array[String] | ManagedDOMStringList, 
      integer | ManagedLong
    ]
  ] = js.native
  
  /**
    * Indicates whether and how the network is configured.
    * 'None' conflicts with extension code generation,
    * so we must use a string for 'Source' instead of a SourceType enum.
    */
  var Source: js.UndefOr[Device_ | DevicePolicy | User | UserPolicy | None] = js.native
  
  /** The network's static IP configuration. */
  var StaticIPConfig: js.UndefOr[
    IPConfigProperties[
      M, 
      Boolean | ManagedBoolean, 
      String | ManagedDOMString, 
      js.Array[String] | ManagedDOMStringList, 
      integer | ManagedLong
    ]
  ] = js.native
}
object NetworkProperties {
  
  @scala.inline
  def apply[M /* <: ManagedObject */, IF /* <: InterfaceType */](): NetworkProperties[M, IF] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NetworkProperties[M, IF]]
  }
  
  @scala.inline
  implicit class NetworkPropertiesMutableBuilder[Self <: NetworkProperties[_, _], M /* <: ManagedObject */, IF /* <: InterfaceType */] (val x: Self with (NetworkProperties[M, IF])) extends AnyVal {
    
    @scala.inline
    def setConnectable(value: Boolean): Self = StObject.set(x, "Connectable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConnectableUndefined: Self = StObject.set(x, "Connectable", js.undefined)
    
    @scala.inline
    def setConnectionState(value: ConnectionStateType): Self = StObject.set(x, "ConnectionState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConnectionStateUndefined: Self = StObject.set(x, "ConnectionState", js.undefined)
    
    @scala.inline
    def setErrorState(value: String): Self = StObject.set(x, "ErrorState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorStateUndefined: Self = StObject.set(x, "ErrorState", js.undefined)
    
    @scala.inline
    def setIPConfigs(
      value: js.Array[
          IPConfigProperties[
            unmanaged, 
            Boolean | ManagedBoolean, 
            String | ManagedDOMString, 
            js.Array[String] | ManagedDOMStringList, 
            integer | ManagedLong
          ]
        ]
    ): Self = StObject.set(x, "IPConfigs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIPConfigsUndefined: Self = StObject.set(x, "IPConfigs", js.undefined)
    
    @scala.inline
    def setIPConfigsVarargs(
      value: (IPConfigProperties[
          unmanaged, 
          Boolean | ManagedBoolean, 
          String | ManagedDOMString, 
          js.Array[String] | ManagedDOMStringList, 
          integer | ManagedLong
        ])*
    ): Self = StObject.set(x, "IPConfigs", js.Array(value :_*))
    
    @scala.inline
    def setMacAddress(value: String): Self = StObject.set(x, "MacAddress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMacAddressUndefined: Self = StObject.set(x, "MacAddress", js.undefined)
    
    @scala.inline
    def setProxySettings(
      value: ProxySettings[unmanaged, String | ManagedDOMString, js.Array[String] | ManagedDOMStringList]
    ): Self = StObject.set(x, "ProxySettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProxySettingsUndefined: Self = StObject.set(x, "ProxySettings", js.undefined)
    
    @scala.inline
    def setRestrictedConnectivity(value: Boolean): Self = StObject.set(x, "RestrictedConnectivity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRestrictedConnectivityUndefined: Self = StObject.set(x, "RestrictedConnectivity", js.undefined)
    
    @scala.inline
    def setSavedIPConfig(
      value: IPConfigProperties[
          unmanaged, 
          Boolean | ManagedBoolean, 
          String | ManagedDOMString, 
          js.Array[String] | ManagedDOMStringList, 
          integer | ManagedLong
        ]
    ): Self = StObject.set(x, "SavedIPConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSavedIPConfigUndefined: Self = StObject.set(x, "SavedIPConfig", js.undefined)
    
    @scala.inline
    def setSource(value: Device_ | DevicePolicy | User | UserPolicy | None): Self = StObject.set(x, "Source", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceUndefined: Self = StObject.set(x, "Source", js.undefined)
    
    @scala.inline
    def setStaticIPConfig(
      value: IPConfigProperties[
          M, 
          Boolean | ManagedBoolean, 
          String | ManagedDOMString, 
          js.Array[String] | ManagedDOMStringList, 
          integer | ManagedLong
        ]
    ): Self = StObject.set(x, "StaticIPConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStaticIPConfigUndefined: Self = StObject.set(x, "StaticIPConfig", js.undefined)
  }
}
