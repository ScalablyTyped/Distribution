package typings.chromeApps.chrome.networking.onc.internal

import typings.chromeApps.AnonAuthentication
import typings.chromeApps.AnonSignalStrength
import typings.chromeApps.AnonType
import typings.chromeApps.chrome.integer
import typings.chromeApps.chrome.networking.onc.CellularBase
import typings.chromeApps.chrome.networking.onc.CellularProperties
import typings.chromeApps.chrome.networking.onc.EthernetProperties
import typings.chromeApps.chrome.networking.onc.IPConfigType
import typings.chromeApps.chrome.networking.onc.InterfaceType
import typings.chromeApps.chrome.networking.onc.ManagedBoolean
import typings.chromeApps.chrome.networking.onc.ManagedDOMString
import typings.chromeApps.chrome.networking.onc.ManagedIPConfigType
import typings.chromeApps.chrome.networking.onc.ManagedLong
import typings.chromeApps.chrome.networking.onc.ManagedObject
import typings.chromeApps.chrome.networking.onc.NetworkType
import typings.chromeApps.chrome.networking.onc.VPNProperties
import typings.chromeApps.chrome.networking.onc.WiFiProperties
import typings.chromeApps.chrome.networking.onc.WiFiPropertiesBase
import typings.chromeApps.chrome.networking.onc.WiMAXProperties
import typings.chromeApps.chromeAppsStrings.unmanaged
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NetworkConfigBase[M /* <: ManagedObject */, IF /* <: InterfaceType */, OF /* <: ObjectFunction */] extends js.Object {
  /** For cellular networks, cellular network properties. */
  var Cellular: js.UndefOr[CellularProperties[M] | CellularBase] = js.undefined
  /** For Ethernet networks, the Ethernet network properties. */
  var Ethernet: js.UndefOr[EthernetProperties[M] | AnonAuthentication] = js.undefined
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
    (VPNProperties[M, Boolean | ManagedBoolean, String | ManagedDOMString]) | AnonType
  ] = js.undefined
  /** For WiFi networks, the network WiFi properties. */
  var WiFi: js.UndefOr[
    (WiFiProperties[M, OF, Boolean | ManagedBoolean, String | ManagedDOMString, integer | ManagedLong]) | (WiFiPropertiesBase[unmanaged, String | ManagedDOMString])
  ] = js.undefined
  /** For WiMAX networks, the network WiMAX properties. */
  var WiMAX: js.UndefOr[(WiMAXProperties[M, Boolean | ManagedBoolean]) | AnonSignalStrength] = js.undefined
}

object NetworkConfigBase {
  @scala.inline
  def apply[M /* <: ManagedObject */, IF /* <: InterfaceType */, OF /* <: ObjectFunction */](
    Cellular: CellularProperties[M] | CellularBase = null,
    Ethernet: EthernetProperties[M] | AnonAuthentication = null,
    GUID: String = null,
    IPAddressConfigType: IPConfigType | ManagedIPConfigType = null,
    Name: String | ManagedDOMString = null,
    NameServersConfigType: IPConfigType | ManagedIPConfigType = null,
    Priority: integer | ManagedLong = null,
    Type: NetworkType = null,
    VPN: (VPNProperties[M, Boolean | ManagedBoolean, String | ManagedDOMString]) | AnonType = null,
    WiFi: (WiFiProperties[M, OF, Boolean | ManagedBoolean, String | ManagedDOMString, integer | ManagedLong]) | (WiFiPropertiesBase[unmanaged, String | ManagedDOMString]) = null,
    WiMAX: (WiMAXProperties[M, Boolean | ManagedBoolean]) | AnonSignalStrength = null
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

