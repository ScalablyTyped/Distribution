package typings.chromeDashApps.chrome.networking.onc._internal_

import typings.chromeDashApps.Anon_Authentication
import typings.chromeDashApps.Anon_SignalStrength
import typings.chromeDashApps.Anon_Type
import typings.chromeDashApps.chrome.integer
import typings.chromeDashApps.chrome.networking.onc.CellularBase
import typings.chromeDashApps.chrome.networking.onc.CellularProperties
import typings.chromeDashApps.chrome.networking.onc.EthernetProperties
import typings.chromeDashApps.chrome.networking.onc.IPConfigType
import typings.chromeDashApps.chrome.networking.onc.InterfaceType
import typings.chromeDashApps.chrome.networking.onc.ManagedBoolean
import typings.chromeDashApps.chrome.networking.onc.ManagedDOMString
import typings.chromeDashApps.chrome.networking.onc.ManagedIPConfigType
import typings.chromeDashApps.chrome.networking.onc.ManagedLong
import typings.chromeDashApps.chrome.networking.onc.ManagedObject
import typings.chromeDashApps.chrome.networking.onc.NetworkType
import typings.chromeDashApps.chrome.networking.onc.VPNProperties
import typings.chromeDashApps.chrome.networking.onc.WiFiProperties
import typings.chromeDashApps.chrome.networking.onc.WiFiPropertiesBase
import typings.chromeDashApps.chrome.networking.onc.WiMAXProperties
import typings.chromeDashApps.chromeDashAppsStrings.unmanaged
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NetworkConfigBase[M /* <: ManagedObject */, IF /* <: InterfaceType */, OF /* <: ObjectFunction */] extends js.Object {
  /** For cellular networks, cellular network properties. */
  var Cellular: js.UndefOr[CellularProperties[M] | CellularBase] = js.undefined
  /** For Ethernet networks, the Ethernet network properties. */
  var Ethernet: js.UndefOr[EthernetProperties[M] | Anon_Authentication] = js.undefined
  /** The network GUID. */
  var GUID: js.UndefOr[String] = js.undefined
  /** The network's IP address configuration type. */
  var IPAddressConfigType: js.UndefOr[IPConfigType | ManagedIPConfigType] = js.undefined
  /** A user friendly network name. */
  var Name: js.UndefOr[String | ManagedDOMString] = js.undefined
  /** The IP configuration type for the name servers used by the network. */
  var NameServersConfigType: js.UndefOr[IPConfigType | ManagedIPConfigType] = js.undefined
  /** The network priority. */
  var Priority: js.UndefOr[integer | ManagedLong] = js.undefined
  /** The network type. */
  var Type: js.UndefOr[NetworkType] = js.undefined
  /** For VPN networks, the network VPN properties. */
  var VPN: js.UndefOr[
    (VPNProperties[M, Boolean | ManagedBoolean, String | ManagedDOMString]) | Anon_Type
  ] = js.undefined
  /** For WiFi networks, the network WiFi properties. */
  var WiFi: js.UndefOr[
    (WiFiProperties[M, OF, Boolean | ManagedBoolean, String | ManagedDOMString, integer | ManagedLong]) | (WiFiPropertiesBase[unmanaged, String | ManagedDOMString])
  ] = js.undefined
  /** For WiMAX networks, the network WiMAX properties. */
  var WiMAX: js.UndefOr[(WiMAXProperties[M, Boolean | ManagedBoolean]) | Anon_SignalStrength] = js.undefined
}

object NetworkConfigBase {
  @scala.inline
  def apply[M /* <: ManagedObject */, IF /* <: InterfaceType */, OF /* <: ObjectFunction */](
    Cellular: CellularProperties[M] | CellularBase = null,
    Ethernet: EthernetProperties[M] | Anon_Authentication = null,
    GUID: String = null,
    IPAddressConfigType: IPConfigType | ManagedIPConfigType = null,
    Name: String | ManagedDOMString = null,
    NameServersConfigType: IPConfigType | ManagedIPConfigType = null,
    Priority: integer | ManagedLong = null,
    Type: NetworkType = null,
    VPN: (VPNProperties[M, Boolean | ManagedBoolean, String | ManagedDOMString]) | Anon_Type = null,
    WiFi: (WiFiProperties[M, OF, Boolean | ManagedBoolean, String | ManagedDOMString, integer | ManagedLong]) | (WiFiPropertiesBase[unmanaged, String | ManagedDOMString]) = null,
    WiMAX: (WiMAXProperties[M, Boolean | ManagedBoolean]) | Anon_SignalStrength = null
  ): NetworkConfigBase[M, IF, OF] = {
    val __obj = js.Dynamic.literal()
    if (Cellular != null) __obj.updateDynamic("Cellular")(Cellular.asInstanceOf[js.Any])
    if (Ethernet != null) __obj.updateDynamic("Ethernet")(Ethernet.asInstanceOf[js.Any])
    if (GUID != null) __obj.updateDynamic("GUID")(GUID.asInstanceOf[js.Any])
    if (IPAddressConfigType != null) __obj.updateDynamic("IPAddressConfigType")(IPAddressConfigType.asInstanceOf[js.Any])
    if (Name != null) __obj.updateDynamic("Name")(Name.asInstanceOf[js.Any])
    if (NameServersConfigType != null) __obj.updateDynamic("NameServersConfigType")(NameServersConfigType.asInstanceOf[js.Any])
    if (Priority != null) __obj.updateDynamic("Priority")(Priority.asInstanceOf[js.Any])
    if (Type != null) __obj.updateDynamic("Type")(Type.asInstanceOf[js.Any])
    if (VPN != null) __obj.updateDynamic("VPN")(VPN.asInstanceOf[js.Any])
    if (WiFi != null) __obj.updateDynamic("WiFi")(WiFi.asInstanceOf[js.Any])
    if (WiMAX != null) __obj.updateDynamic("WiMAX")(WiMAX.asInstanceOf[js.Any])
    __obj.asInstanceOf[NetworkConfigBase[M, IF, OF]]
  }
}

