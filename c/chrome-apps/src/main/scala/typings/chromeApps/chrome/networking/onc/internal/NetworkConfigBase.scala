package typings.chromeApps.chrome.networking.onc.internal

import typings.chromeApps.anon.Authentication
import typings.chromeApps.anon.SignalStrength
import typings.chromeApps.anon.Type
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

@js.native
trait NetworkConfigBase[M /* <: ManagedObject */, IF /* <: InterfaceType */, OF /* <: ObjectFunction */] extends js.Object {
  /** For cellular networks, cellular network properties. */
  var Cellular: js.UndefOr[CellularProperties[M] | CellularBase] = js.native
  /** For Ethernet networks, the Ethernet network properties. */
  var Ethernet: js.UndefOr[EthernetProperties[M] | Authentication] = js.native
  /** The network GUID. */
  var GUID: js.UndefOr[String] = js.native
  /** The network's IP address configuration type. */
  var IPAddressConfigType: js.UndefOr[IPConfigType | ManagedIPConfigType] = js.native
  /** A user friendly network name. */
  var Name: js.UndefOr[String | ManagedDOMString] = js.native
  /** The IP configuration type for the name servers used by the network. */
  var NameServersConfigType: js.UndefOr[IPConfigType | ManagedIPConfigType] = js.native
  /** The network priority. */
  var Priority: js.UndefOr[integer | ManagedLong] = js.native
  /** The network type. */
  var Type: js.UndefOr[NetworkType] = js.native
  /** For VPN networks, the network VPN properties. */
  var VPN: js.UndefOr[(VPNProperties[M, Boolean | ManagedBoolean, String | ManagedDOMString]) | Type] = js.native
  /** For WiFi networks, the network WiFi properties. */
  var WiFi: js.UndefOr[
    (WiFiProperties[M, OF, Boolean | ManagedBoolean, String | ManagedDOMString, integer | ManagedLong]) | (WiFiPropertiesBase[unmanaged, String | ManagedDOMString])
  ] = js.native
  /** For WiMAX networks, the network WiMAX properties. */
  var WiMAX: js.UndefOr[(WiMAXProperties[M, Boolean | ManagedBoolean]) | SignalStrength] = js.native
}

object NetworkConfigBase {
  @scala.inline
  def apply[/* <: typings.chromeApps.chrome.networking.onc.ManagedObject */ M, /* <: typings.chromeApps.chrome.networking.onc.InterfaceType */ IF, /* <: typings.chromeApps.chrome.networking.onc.internal.ObjectFunction */ OF](): NetworkConfigBase[M, IF, OF] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NetworkConfigBase[M, IF, OF]]
  }
  @scala.inline
  implicit class NetworkConfigBaseOps[Self <: NetworkConfigBase[_, _, _], /* <: typings.chromeApps.chrome.networking.onc.ManagedObject */ M, /* <: typings.chromeApps.chrome.networking.onc.InterfaceType */ IF, /* <: typings.chromeApps.chrome.networking.onc.internal.ObjectFunction */ OF] (val x: Self with (NetworkConfigBase[M, IF, OF])) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCellular(value: CellularProperties[M] | CellularBase): Self = this.set("Cellular", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCellular: Self = this.set("Cellular", js.undefined)
    @scala.inline
    def setEthernet(value: EthernetProperties[M] | Authentication): Self = this.set("Ethernet", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEthernet: Self = this.set("Ethernet", js.undefined)
    @scala.inline
    def setGUID(value: String): Self = this.set("GUID", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGUID: Self = this.set("GUID", js.undefined)
    @scala.inline
    def setIPAddressConfigType(value: IPConfigType | ManagedIPConfigType): Self = this.set("IPAddressConfigType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIPAddressConfigType: Self = this.set("IPAddressConfigType", js.undefined)
    @scala.inline
    def setName(value: String | ManagedDOMString): Self = this.set("Name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("Name", js.undefined)
    @scala.inline
    def setNameServersConfigType(value: IPConfigType | ManagedIPConfigType): Self = this.set("NameServersConfigType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNameServersConfigType: Self = this.set("NameServersConfigType", js.undefined)
    @scala.inline
    def setPriority(value: integer | ManagedLong): Self = this.set("Priority", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePriority: Self = this.set("Priority", js.undefined)
    @scala.inline
    def setType(value: NetworkType): Self = this.set("Type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("Type", js.undefined)
    @scala.inline
    def setVPN(value: (VPNProperties[M, Boolean | ManagedBoolean, String | ManagedDOMString]) | Type): Self = this.set("VPN", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVPN: Self = this.set("VPN", js.undefined)
    @scala.inline
    def setWiFi(
      value: (WiFiProperties[M, OF, Boolean | ManagedBoolean, String | ManagedDOMString, integer | ManagedLong]) | (WiFiPropertiesBase[unmanaged, String | ManagedDOMString])
    ): Self = this.set("WiFi", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWiFi: Self = this.set("WiFi", js.undefined)
    @scala.inline
    def setWiMAX(value: (WiMAXProperties[M, Boolean | ManagedBoolean]) | SignalStrength): Self = this.set("WiMAX", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWiMAX: Self = this.set("WiMAX", js.undefined)
  }
  
}

