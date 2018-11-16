package typings
package chromeDashAppsLib.chromeNs.networkingNs.oncNs.underscoreInternalUnderscoreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait NetworkConfigBase[M /* <: chromeDashAppsLib.chromeNs.networkingNs.oncNs.ManagedObject */, IF /* <: chromeDashAppsLib.chromeNs.networkingNs.oncNs.InterfaceType */, OF /* <: ObjectFunction */] extends js.Object {
  /** For cellular networks, cellular network properties. */
  var Cellular: js.UndefOr[
    chromeDashAppsLib.chromeNs.networkingNs.oncNs.CellularProperties[M] | chromeDashAppsLib.chromeNs.networkingNs.oncNs.CellularBase
  ] = js.undefined
  /** For Ethernet networks, the Ethernet network properties. */
  var Ethernet: js.UndefOr[
    chromeDashAppsLib.chromeNs.networkingNs.oncNs.EthernetProperties[M] | chromeDashAppsLib.Anon_Authentication
  ] = js.undefined
  /** The network GUID. */
  var GUID: js.UndefOr[java.lang.String] = js.undefined
  /** The network's IP address configuration type. */
  var IPAddressConfigType: js.UndefOr[
    chromeDashAppsLib.chromeNs.networkingNs.oncNs.IPConfigType | chromeDashAppsLib.chromeNs.networkingNs.oncNs.ManagedIPConfigType
  ] = js.undefined
  /** A user friendly network name. */
  var Name: js.UndefOr[
    java.lang.String | chromeDashAppsLib.chromeNs.networkingNs.oncNs.ManagedDOMString
  ] = js.undefined
  /** The IP configuration type for the name servers used by the network. */
  var NameServersConfigType: js.UndefOr[
    chromeDashAppsLib.chromeNs.networkingNs.oncNs.IPConfigType | chromeDashAppsLib.chromeNs.networkingNs.oncNs.ManagedIPConfigType
  ] = js.undefined
  /** The network priority. */
  var Priority: js.UndefOr[
    chromeDashAppsLib.chromeNs.integer | chromeDashAppsLib.chromeNs.networkingNs.oncNs.ManagedLong
  ] = js.undefined
  /** The network type. */
  var Type: js.UndefOr[chromeDashAppsLib.chromeNs.networkingNs.oncNs.NetworkType] = js.undefined
  /** For VPN networks, the network VPN properties. */
  var VPN: js.UndefOr[
    (chromeDashAppsLib.chromeNs.networkingNs.oncNs.VPNProperties[
      M, 
      scala.Boolean | chromeDashAppsLib.chromeNs.networkingNs.oncNs.ManagedBoolean, 
      java.lang.String | chromeDashAppsLib.chromeNs.networkingNs.oncNs.ManagedDOMString
    ]) | chromeDashAppsLib.Anon_Type
  ] = js.undefined
  /** For WiFi networks, the network WiFi properties. */
  var WiFi: js.UndefOr[
    (chromeDashAppsLib.chromeNs.networkingNs.oncNs.WiFiProperties[
      M, 
      OF, 
      scala.Boolean | chromeDashAppsLib.chromeNs.networkingNs.oncNs.ManagedBoolean, 
      java.lang.String | chromeDashAppsLib.chromeNs.networkingNs.oncNs.ManagedDOMString, 
      chromeDashAppsLib.chromeNs.integer | chromeDashAppsLib.chromeNs.networkingNs.oncNs.ManagedLong
    ]) | (chromeDashAppsLib.chromeNs.networkingNs.oncNs.WiFiPropertiesBase[
      chromeDashAppsLib.chromeDashAppsLibStrings.unmanaged, 
      java.lang.String | chromeDashAppsLib.chromeNs.networkingNs.oncNs.ManagedDOMString
    ])
  ] = js.undefined
  /** For WiMAX networks, the network WiMAX properties. */
  var WiMAX: js.UndefOr[
    (chromeDashAppsLib.chromeNs.networkingNs.oncNs.WiMAXProperties[M, scala.Boolean | chromeDashAppsLib.chromeNs.networkingNs.oncNs.ManagedBoolean]) | chromeDashAppsLib.Anon_SignalStrength
  ] = js.undefined
}

