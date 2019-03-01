package typings
package chromeDashAppsLib.chromeNs.networkingNs.oncNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NetworkProperties[M /* <: ManagedObject */, IF /* <: InterfaceType */]
  extends chromeDashAppsLib.chromeNs.networkingNs.oncNs.underscoreInternalUnderscoreNs.NetworkConfigBase[M, IF, chromeDashAppsLib.chromeDashAppsLibStrings.getter] {
  /** Whether the network is connectable. */
  var Connectable: js.UndefOr[scala.Boolean] = js.undefined
  /** The network's current connection state. */
  var ConnectionState: js.UndefOr[ConnectionStateType] = js.undefined
  /** The last recorded network error state. */
  var ErrorState: js.UndefOr[java.lang.String] = js.undefined
  /** The network's IP configuration. */
  var IPConfigs: js.UndefOr[
    js.Array[
      IPConfigProperties[
        chromeDashAppsLib.chromeDashAppsLibStrings.unmanaged, 
        scala.Boolean | ManagedBoolean, 
        java.lang.String | ManagedDOMString, 
        js.Array[java.lang.String] | ManagedDOMStringList, 
        chromeDashAppsLib.chromeNs.integer | ManagedLong
      ]
    ]
  ] = js.undefined
  /** The network's MAC address. */
  var MacAddress: js.UndefOr[java.lang.String] = js.undefined
  /** The network's proxy settings. */
  var ProxySettings: js.UndefOr[
    ProxySettings[
      chromeDashAppsLib.chromeDashAppsLibStrings.unmanaged, 
      java.lang.String | ManagedDOMString, 
      js.Array[java.lang.String] | ManagedDOMStringList
    ]
  ] = js.undefined
  /**
    * For a connected network, whether the network connectivity to the Internet is limited,
    * e.g. if the network is behind a portal, or a cellular network is not activated.
    */
  var RestrictedConnectivity: js.UndefOr[scala.Boolean] = js.undefined
  /** IP configuration that was received from the DHCP server before applying static IP configuration. */
  var SavedIPConfig: js.UndefOr[
    IPConfigProperties[
      chromeDashAppsLib.chromeDashAppsLibStrings.unmanaged, 
      scala.Boolean | ManagedBoolean, 
      java.lang.String | ManagedDOMString, 
      js.Array[java.lang.String] | ManagedDOMStringList, 
      chromeDashAppsLib.chromeNs.integer | ManagedLong
    ]
  ] = js.undefined
  /**
    * Indicates whether and how the network is configured.
    * 'None' conflicts with extension code generation,
    * so we must use a string for 'Source' instead of a SourceType enum.
    */
  var Source: js.UndefOr[
    chromeDashAppsLib.chromeDashAppsLibStrings.Device | chromeDashAppsLib.chromeDashAppsLibStrings.DevicePolicy | chromeDashAppsLib.chromeDashAppsLibStrings.User | chromeDashAppsLib.chromeDashAppsLibStrings.UserPolicy | chromeDashAppsLib.chromeDashAppsLibStrings.None
  ] = js.undefined
  /** The network's static IP configuration. */
  var StaticIPConfig: js.UndefOr[
    IPConfigProperties[
      M, 
      scala.Boolean | ManagedBoolean, 
      java.lang.String | ManagedDOMString, 
      js.Array[java.lang.String] | ManagedDOMStringList, 
      chromeDashAppsLib.chromeNs.integer | ManagedLong
    ]
  ] = js.undefined
}

object NetworkProperties {
  @scala.inline
  def apply[M /* <: ManagedObject */, IF /* <: InterfaceType */](
    Cellular: CellularProperties[M] | CellularBase = null,
    Connectable: js.UndefOr[scala.Boolean] = js.undefined,
    ConnectionState: ConnectionStateType = null,
    ErrorState: java.lang.String = null,
    Ethernet: EthernetProperties[M] | chromeDashAppsLib.Anon_Authentication = null,
    GUID: java.lang.String = null,
    IPAddressConfigType: IPConfigType | ManagedIPConfigType = null,
    IPConfigs: js.Array[
      IPConfigProperties[
        chromeDashAppsLib.chromeDashAppsLibStrings.unmanaged, 
        scala.Boolean | ManagedBoolean, 
        java.lang.String | ManagedDOMString, 
        js.Array[java.lang.String] | ManagedDOMStringList, 
        chromeDashAppsLib.chromeNs.integer | ManagedLong
      ]
    ] = null,
    MacAddress: java.lang.String = null,
    Name: java.lang.String | ManagedDOMString = null,
    NameServersConfigType: IPConfigType | ManagedIPConfigType = null,
    Priority: chromeDashAppsLib.chromeNs.integer | ManagedLong = null,
    ProxySettings: ProxySettings[
      chromeDashAppsLib.chromeDashAppsLibStrings.unmanaged, 
      java.lang.String | ManagedDOMString, 
      js.Array[java.lang.String] | ManagedDOMStringList
    ] = null,
    RestrictedConnectivity: js.UndefOr[scala.Boolean] = js.undefined,
    SavedIPConfig: IPConfigProperties[
      chromeDashAppsLib.chromeDashAppsLibStrings.unmanaged, 
      scala.Boolean | ManagedBoolean, 
      java.lang.String | ManagedDOMString, 
      js.Array[java.lang.String] | ManagedDOMStringList, 
      chromeDashAppsLib.chromeNs.integer | ManagedLong
    ] = null,
    Source: chromeDashAppsLib.chromeDashAppsLibStrings.Device | chromeDashAppsLib.chromeDashAppsLibStrings.DevicePolicy | chromeDashAppsLib.chromeDashAppsLibStrings.User | chromeDashAppsLib.chromeDashAppsLibStrings.UserPolicy | chromeDashAppsLib.chromeDashAppsLibStrings.None = null,
    StaticIPConfig: IPConfigProperties[
      M, 
      scala.Boolean | ManagedBoolean, 
      java.lang.String | ManagedDOMString, 
      js.Array[java.lang.String] | ManagedDOMStringList, 
      chromeDashAppsLib.chromeNs.integer | ManagedLong
    ] = null,
    Type: NetworkType = null,
    VPN: (VPNProperties[M, scala.Boolean | ManagedBoolean, java.lang.String | ManagedDOMString]) | chromeDashAppsLib.Anon_Type = null,
    WiFi: (WiFiProperties[
      M, 
      chromeDashAppsLib.chromeDashAppsLibStrings.getter, 
      scala.Boolean | ManagedBoolean, 
      java.lang.String | ManagedDOMString, 
      chromeDashAppsLib.chromeNs.integer | ManagedLong
    ]) | (WiFiPropertiesBase[
      chromeDashAppsLib.chromeDashAppsLibStrings.unmanaged, 
      java.lang.String | ManagedDOMString
    ]) = null,
    WiMAX: (WiMAXProperties[M, scala.Boolean | ManagedBoolean]) | chromeDashAppsLib.Anon_SignalStrength = null
  ): NetworkProperties[M, IF] = {
    val __obj = js.Dynamic.literal()
    if (Cellular != null) __obj.updateDynamic("Cellular")(Cellular.asInstanceOf[js.Any])
    if (!js.isUndefined(Connectable)) __obj.updateDynamic("Connectable")(Connectable)
    if (ConnectionState != null) __obj.updateDynamic("ConnectionState")(ConnectionState)
    if (ErrorState != null) __obj.updateDynamic("ErrorState")(ErrorState)
    if (Ethernet != null) __obj.updateDynamic("Ethernet")(Ethernet.asInstanceOf[js.Any])
    if (GUID != null) __obj.updateDynamic("GUID")(GUID)
    if (IPAddressConfigType != null) __obj.updateDynamic("IPAddressConfigType")(IPAddressConfigType.asInstanceOf[js.Any])
    if (IPConfigs != null) __obj.updateDynamic("IPConfigs")(IPConfigs)
    if (MacAddress != null) __obj.updateDynamic("MacAddress")(MacAddress)
    if (Name != null) __obj.updateDynamic("Name")(Name.asInstanceOf[js.Any])
    if (NameServersConfigType != null) __obj.updateDynamic("NameServersConfigType")(NameServersConfigType.asInstanceOf[js.Any])
    if (Priority != null) __obj.updateDynamic("Priority")(Priority.asInstanceOf[js.Any])
    if (ProxySettings != null) __obj.updateDynamic("ProxySettings")(ProxySettings)
    if (!js.isUndefined(RestrictedConnectivity)) __obj.updateDynamic("RestrictedConnectivity")(RestrictedConnectivity)
    if (SavedIPConfig != null) __obj.updateDynamic("SavedIPConfig")(SavedIPConfig)
    if (Source != null) __obj.updateDynamic("Source")(Source.asInstanceOf[js.Any])
    if (StaticIPConfig != null) __obj.updateDynamic("StaticIPConfig")(StaticIPConfig)
    if (Type != null) __obj.updateDynamic("Type")(Type)
    if (VPN != null) __obj.updateDynamic("VPN")(VPN.asInstanceOf[js.Any])
    if (WiFi != null) __obj.updateDynamic("WiFi")(WiFi.asInstanceOf[js.Any])
    if (WiMAX != null) __obj.updateDynamic("WiMAX")(WiMAX.asInstanceOf[js.Any])
    __obj.asInstanceOf[NetworkProperties[M, IF]]
  }
}

