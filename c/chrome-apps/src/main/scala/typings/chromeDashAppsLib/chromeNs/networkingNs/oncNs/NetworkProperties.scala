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

