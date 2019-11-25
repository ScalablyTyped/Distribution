package typings.chromeDashApps.chrome.networking.onc

import typings.chromeDashApps.Anon_Authentication
import typings.chromeDashApps.Anon_SignalStrength
import typings.chromeDashApps.Anon_Type
import typings.chromeDashApps.chrome.integer
import typings.chromeDashApps.chrome.networking.onc._internal_.NetworkConfigBase
import typings.chromeDashApps.chromeDashAppsStrings.Device
import typings.chromeDashApps.chromeDashAppsStrings.DevicePolicy
import typings.chromeDashApps.chromeDashAppsStrings.None
import typings.chromeDashApps.chromeDashAppsStrings.User
import typings.chromeDashApps.chromeDashAppsStrings.UserPolicy
import typings.chromeDashApps.chromeDashAppsStrings.getter
import typings.chromeDashApps.chromeDashAppsStrings.unmanaged
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NetworkProperties[M /* <: ManagedObject */, IF /* <: InterfaceType */] extends NetworkConfigBase[M, IF, getter] {
  /** Whether the network is connectable. */
  var Connectable: js.UndefOr[Boolean] = js.undefined
  /** The network's current connection state. */
  var ConnectionState: js.UndefOr[ConnectionStateType] = js.undefined
  /** The last recorded network error state. */
  var ErrorState: js.UndefOr[String] = js.undefined
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
  ] = js.undefined
  /** The network's MAC address. */
  var MacAddress: js.UndefOr[String] = js.undefined
  /** The network's proxy settings. */
  var ProxySettings: js.UndefOr[
    typings.chromeDashApps.chrome.networking.onc.ProxySettings[unmanaged, String | ManagedDOMString, js.Array[String] | ManagedDOMStringList]
  ] = js.undefined
  /**
    * For a connected network, whether the network connectivity to the Internet is limited,
    * e.g. if the network is behind a portal, or a cellular network is not activated.
    */
  var RestrictedConnectivity: js.UndefOr[Boolean] = js.undefined
  /** IP configuration that was received from the DHCP server before applying static IP configuration. */
  var SavedIPConfig: js.UndefOr[
    IPConfigProperties[
      unmanaged, 
      Boolean | ManagedBoolean, 
      String | ManagedDOMString, 
      js.Array[String] | ManagedDOMStringList, 
      integer | ManagedLong
    ]
  ] = js.undefined
  /**
    * Indicates whether and how the network is configured.
    * 'None' conflicts with extension code generation,
    * so we must use a string for 'Source' instead of a SourceType enum.
    */
  var Source: js.UndefOr[Device | DevicePolicy | User | UserPolicy | None] = js.undefined
  /** The network's static IP configuration. */
  var StaticIPConfig: js.UndefOr[
    IPConfigProperties[
      M, 
      Boolean | ManagedBoolean, 
      String | ManagedDOMString, 
      js.Array[String] | ManagedDOMStringList, 
      integer | ManagedLong
    ]
  ] = js.undefined
}

object NetworkProperties {
  @scala.inline
  def apply[M /* <: ManagedObject */, IF /* <: InterfaceType */](
    Cellular: CellularProperties[M] | CellularBase = null,
    Connectable: js.UndefOr[Boolean] = js.undefined,
    ConnectionState: ConnectionStateType = null,
    ErrorState: String = null,
    Ethernet: EthernetProperties[M] | Anon_Authentication = null,
    GUID: String = null,
    IPAddressConfigType: IPConfigType | ManagedIPConfigType = null,
    IPConfigs: js.Array[
      IPConfigProperties[
        unmanaged, 
        Boolean | ManagedBoolean, 
        String | ManagedDOMString, 
        js.Array[String] | ManagedDOMStringList, 
        integer | ManagedLong
      ]
    ] = null,
    MacAddress: String = null,
    Name: String | ManagedDOMString = null,
    NameServersConfigType: IPConfigType | ManagedIPConfigType = null,
    Priority: integer | ManagedLong = null,
    ProxySettings: ProxySettings[unmanaged, String | ManagedDOMString, js.Array[String] | ManagedDOMStringList] = null,
    RestrictedConnectivity: js.UndefOr[Boolean] = js.undefined,
    SavedIPConfig: IPConfigProperties[
      unmanaged, 
      Boolean | ManagedBoolean, 
      String | ManagedDOMString, 
      js.Array[String] | ManagedDOMStringList, 
      integer | ManagedLong
    ] = null,
    Source: Device | DevicePolicy | User | UserPolicy | None = null,
    StaticIPConfig: IPConfigProperties[
      M, 
      Boolean | ManagedBoolean, 
      String | ManagedDOMString, 
      js.Array[String] | ManagedDOMStringList, 
      integer | ManagedLong
    ] = null,
    Type: NetworkType = null,
    VPN: (VPNProperties[M, Boolean | ManagedBoolean, String | ManagedDOMString]) | Anon_Type = null,
    WiFi: (WiFiProperties[M, getter, Boolean | ManagedBoolean, String | ManagedDOMString, integer | ManagedLong]) | (WiFiPropertiesBase[unmanaged, String | ManagedDOMString]) = null,
    WiMAX: (WiMAXProperties[M, Boolean | ManagedBoolean]) | Anon_SignalStrength = null
  ): NetworkProperties[M, IF] = {
    val __obj = js.Dynamic.literal()
    if (Cellular != null) __obj.updateDynamic("Cellular")(Cellular.asInstanceOf[js.Any])
    if (!js.isUndefined(Connectable)) __obj.updateDynamic("Connectable")(Connectable.asInstanceOf[js.Any])
    if (ConnectionState != null) __obj.updateDynamic("ConnectionState")(ConnectionState.asInstanceOf[js.Any])
    if (ErrorState != null) __obj.updateDynamic("ErrorState")(ErrorState.asInstanceOf[js.Any])
    if (Ethernet != null) __obj.updateDynamic("Ethernet")(Ethernet.asInstanceOf[js.Any])
    if (GUID != null) __obj.updateDynamic("GUID")(GUID.asInstanceOf[js.Any])
    if (IPAddressConfigType != null) __obj.updateDynamic("IPAddressConfigType")(IPAddressConfigType.asInstanceOf[js.Any])
    if (IPConfigs != null) __obj.updateDynamic("IPConfigs")(IPConfigs.asInstanceOf[js.Any])
    if (MacAddress != null) __obj.updateDynamic("MacAddress")(MacAddress.asInstanceOf[js.Any])
    if (Name != null) __obj.updateDynamic("Name")(Name.asInstanceOf[js.Any])
    if (NameServersConfigType != null) __obj.updateDynamic("NameServersConfigType")(NameServersConfigType.asInstanceOf[js.Any])
    if (Priority != null) __obj.updateDynamic("Priority")(Priority.asInstanceOf[js.Any])
    if (ProxySettings != null) __obj.updateDynamic("ProxySettings")(ProxySettings.asInstanceOf[js.Any])
    if (!js.isUndefined(RestrictedConnectivity)) __obj.updateDynamic("RestrictedConnectivity")(RestrictedConnectivity.asInstanceOf[js.Any])
    if (SavedIPConfig != null) __obj.updateDynamic("SavedIPConfig")(SavedIPConfig.asInstanceOf[js.Any])
    if (Source != null) __obj.updateDynamic("Source")(Source.asInstanceOf[js.Any])
    if (StaticIPConfig != null) __obj.updateDynamic("StaticIPConfig")(StaticIPConfig.asInstanceOf[js.Any])
    if (Type != null) __obj.updateDynamic("Type")(Type.asInstanceOf[js.Any])
    if (VPN != null) __obj.updateDynamic("VPN")(VPN.asInstanceOf[js.Any])
    if (WiFi != null) __obj.updateDynamic("WiFi")(WiFi.asInstanceOf[js.Any])
    if (WiMAX != null) __obj.updateDynamic("WiMAX")(WiMAX.asInstanceOf[js.Any])
    __obj.asInstanceOf[NetworkProperties[M, IF]]
  }
}

