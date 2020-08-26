package typings.chromeApps.chrome.networking.onc

import typings.chromeApps.chrome.integer
import typings.chromeApps.chromeAppsStrings.CDMA
import typings.chromeApps.chromeAppsStrings.GSM
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CellularProperties[M /* <: ManagedObject */] extends CellularBase {
  /** The cellular network activation type. */
  var ActivationType: js.UndefOr[String] = js.native
  /** Whether roaming is allowed for the network. */
  var AllowRoaming: js.UndefOr[Boolean] = js.native
  /** Whether the cellular network should be connected automatically (when in range). */
  var AutoConnect: js.UndefOr[Boolean | ManagedBoolean] = js.native
  /** The name of the carrier for which the cellular device is configured. */
  var Carrier: js.UndefOr[String | ManagedDOMString] = js.native
  /** Cellular device technology family - CDMA or GSM. */
  var Family: js.UndefOr[CDMA | GSM] = js.native
  /** The firmware revision loaded in the cellular modem. */
  var FirmwareRevision: js.UndefOr[String] = js.native
  /** The list of networks found during the most recent network scan. */
  var FoundNetworks: js.UndefOr[js.Array[FoundNetworkProperties]] = js.native
  /** The cellular modem hardware revision. */
  var HardwareRevision: js.UndefOr[String] = js.native
  /** Information about the operator that issued the SIM card currently installed in the modem. */
  var HomeProvider: js.UndefOr[CellularProviderProperties] = js.native
  /** The cellular modem manufacturer. */
  var MAnufacturer: js.UndefOr[String] = js.native
  /** The cellular modem model ID. */
  var ModelID: js.UndefOr[String] = js.native
  /** The revision of the Preferred Roaming List loaded in the modem. */
  var PRLVersion: js.UndefOr[integer] = js.native
  /** Online payment portal a user can use to sign-up for or modify a mobile data plan. */
  var PaymentPortal: js.UndefOr[typings.chromeApps.chrome.networking.onc.PaymentPortal | PaymentPortalPost] = js.native
  /** The state of SIM lock for GSM family networks. */
  var SIMLockStatus: js.UndefOr[typings.chromeApps.chrome.networking.onc.SIMLockStatus] = js.native
  /**
    * @since Chrome 63.
    * True when a cellular network scan is in progress.
    */
  var Scanning: js.UndefOr[Boolean] = js.native
  /** Information about the operator on whose network the modem is currently registered. */
  var ServingOperator: js.UndefOr[CellularProviderProperties] = js.native
  /** Whether the cellular network supports scanning. */
  var SupportNetworkScan: js.UndefOr[Boolean] = js.native
  /** A list of supported carriers. */
  var SupportedCarriers: js.UndefOr[js.Array[String]] = js.native
}

object CellularProperties {
  @scala.inline
  def apply[/* <: typings.chromeApps.chrome.networking.onc.ManagedObject */ M](): CellularProperties[M] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CellularProperties[M]]
  }
  @scala.inline
  implicit class CellularPropertiesOps[Self <: CellularProperties[_], /* <: typings.chromeApps.chrome.networking.onc.ManagedObject */ M] (val x: Self with CellularProperties[M]) extends AnyVal {
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
    def setActivationType(value: String): Self = this.set("ActivationType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteActivationType: Self = this.set("ActivationType", js.undefined)
    @scala.inline
    def setAllowRoaming(value: Boolean): Self = this.set("AllowRoaming", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAllowRoaming: Self = this.set("AllowRoaming", js.undefined)
    @scala.inline
    def setAutoConnect(value: Boolean | ManagedBoolean): Self = this.set("AutoConnect", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutoConnect: Self = this.set("AutoConnect", js.undefined)
    @scala.inline
    def setCarrier(value: String | ManagedDOMString): Self = this.set("Carrier", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCarrier: Self = this.set("Carrier", js.undefined)
    @scala.inline
    def setFamily(value: CDMA | GSM): Self = this.set("Family", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFamily: Self = this.set("Family", js.undefined)
    @scala.inline
    def setFirmwareRevision(value: String): Self = this.set("FirmwareRevision", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFirmwareRevision: Self = this.set("FirmwareRevision", js.undefined)
    @scala.inline
    def setFoundNetworksVarargs(value: FoundNetworkProperties*): Self = this.set("FoundNetworks", js.Array(value :_*))
    @scala.inline
    def setFoundNetworks(value: js.Array[FoundNetworkProperties]): Self = this.set("FoundNetworks", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFoundNetworks: Self = this.set("FoundNetworks", js.undefined)
    @scala.inline
    def setHardwareRevision(value: String): Self = this.set("HardwareRevision", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHardwareRevision: Self = this.set("HardwareRevision", js.undefined)
    @scala.inline
    def setHomeProvider(value: CellularProviderProperties): Self = this.set("HomeProvider", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHomeProvider: Self = this.set("HomeProvider", js.undefined)
    @scala.inline
    def setMAnufacturer(value: String): Self = this.set("MAnufacturer", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMAnufacturer: Self = this.set("MAnufacturer", js.undefined)
    @scala.inline
    def setModelID(value: String): Self = this.set("ModelID", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteModelID: Self = this.set("ModelID", js.undefined)
    @scala.inline
    def setPRLVersion(value: integer): Self = this.set("PRLVersion", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePRLVersion: Self = this.set("PRLVersion", js.undefined)
    @scala.inline
    def setPaymentPortal(value: PaymentPortal | PaymentPortalPost): Self = this.set("PaymentPortal", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePaymentPortal: Self = this.set("PaymentPortal", js.undefined)
    @scala.inline
    def setSIMLockStatus(value: SIMLockStatus): Self = this.set("SIMLockStatus", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSIMLockStatus: Self = this.set("SIMLockStatus", js.undefined)
    @scala.inline
    def setScanning(value: Boolean): Self = this.set("Scanning", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScanning: Self = this.set("Scanning", js.undefined)
    @scala.inline
    def setServingOperator(value: CellularProviderProperties): Self = this.set("ServingOperator", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteServingOperator: Self = this.set("ServingOperator", js.undefined)
    @scala.inline
    def setSupportNetworkScan(value: Boolean): Self = this.set("SupportNetworkScan", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSupportNetworkScan: Self = this.set("SupportNetworkScan", js.undefined)
    @scala.inline
    def setSupportedCarriersVarargs(value: String*): Self = this.set("SupportedCarriers", js.Array(value :_*))
    @scala.inline
    def setSupportedCarriers(value: js.Array[String]): Self = this.set("SupportedCarriers", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSupportedCarriers: Self = this.set("SupportedCarriers", js.undefined)
  }
  
}

