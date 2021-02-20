package typings.chromeApps.chrome.networking.onc

import typings.chromeApps.chrome.integer
import typings.chromeApps.chromeAppsStrings.CDMA
import typings.chromeApps.chromeAppsStrings.GSM
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  def apply[M /* <: ManagedObject */](): CellularProperties[M] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CellularProperties[M]]
  }
  
  @scala.inline
  implicit class CellularPropertiesMutableBuilder[Self <: CellularProperties[_], M /* <: ManagedObject */] (val x: Self with CellularProperties[M]) extends AnyVal {
    
    @scala.inline
    def setActivationType(value: String): Self = StObject.set(x, "ActivationType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActivationTypeUndefined: Self = StObject.set(x, "ActivationType", js.undefined)
    
    @scala.inline
    def setAllowRoaming(value: Boolean): Self = StObject.set(x, "AllowRoaming", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowRoamingUndefined: Self = StObject.set(x, "AllowRoaming", js.undefined)
    
    @scala.inline
    def setAutoConnect(value: Boolean | ManagedBoolean): Self = StObject.set(x, "AutoConnect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoConnectUndefined: Self = StObject.set(x, "AutoConnect", js.undefined)
    
    @scala.inline
    def setCarrier(value: String | ManagedDOMString): Self = StObject.set(x, "Carrier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCarrierUndefined: Self = StObject.set(x, "Carrier", js.undefined)
    
    @scala.inline
    def setFamily(value: CDMA | GSM): Self = StObject.set(x, "Family", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFamilyUndefined: Self = StObject.set(x, "Family", js.undefined)
    
    @scala.inline
    def setFirmwareRevision(value: String): Self = StObject.set(x, "FirmwareRevision", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFirmwareRevisionUndefined: Self = StObject.set(x, "FirmwareRevision", js.undefined)
    
    @scala.inline
    def setFoundNetworks(value: js.Array[FoundNetworkProperties]): Self = StObject.set(x, "FoundNetworks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFoundNetworksUndefined: Self = StObject.set(x, "FoundNetworks", js.undefined)
    
    @scala.inline
    def setFoundNetworksVarargs(value: FoundNetworkProperties*): Self = StObject.set(x, "FoundNetworks", js.Array(value :_*))
    
    @scala.inline
    def setHardwareRevision(value: String): Self = StObject.set(x, "HardwareRevision", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHardwareRevisionUndefined: Self = StObject.set(x, "HardwareRevision", js.undefined)
    
    @scala.inline
    def setHomeProvider(value: CellularProviderProperties): Self = StObject.set(x, "HomeProvider", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHomeProviderUndefined: Self = StObject.set(x, "HomeProvider", js.undefined)
    
    @scala.inline
    def setMAnufacturer(value: String): Self = StObject.set(x, "MAnufacturer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMAnufacturerUndefined: Self = StObject.set(x, "MAnufacturer", js.undefined)
    
    @scala.inline
    def setModelID(value: String): Self = StObject.set(x, "ModelID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModelIDUndefined: Self = StObject.set(x, "ModelID", js.undefined)
    
    @scala.inline
    def setPRLVersion(value: integer): Self = StObject.set(x, "PRLVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPRLVersionUndefined: Self = StObject.set(x, "PRLVersion", js.undefined)
    
    @scala.inline
    def setPaymentPortal(value: PaymentPortal | PaymentPortalPost): Self = StObject.set(x, "PaymentPortal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPaymentPortalUndefined: Self = StObject.set(x, "PaymentPortal", js.undefined)
    
    @scala.inline
    def setSIMLockStatus(value: SIMLockStatus): Self = StObject.set(x, "SIMLockStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSIMLockStatusUndefined: Self = StObject.set(x, "SIMLockStatus", js.undefined)
    
    @scala.inline
    def setScanning(value: Boolean): Self = StObject.set(x, "Scanning", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScanningUndefined: Self = StObject.set(x, "Scanning", js.undefined)
    
    @scala.inline
    def setServingOperator(value: CellularProviderProperties): Self = StObject.set(x, "ServingOperator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServingOperatorUndefined: Self = StObject.set(x, "ServingOperator", js.undefined)
    
    @scala.inline
    def setSupportNetworkScan(value: Boolean): Self = StObject.set(x, "SupportNetworkScan", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSupportNetworkScanUndefined: Self = StObject.set(x, "SupportNetworkScan", js.undefined)
    
    @scala.inline
    def setSupportedCarriers(value: js.Array[String]): Self = StObject.set(x, "SupportedCarriers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSupportedCarriersUndefined: Self = StObject.set(x, "SupportedCarriers", js.undefined)
    
    @scala.inline
    def setSupportedCarriersVarargs(value: String*): Self = StObject.set(x, "SupportedCarriers", js.Array(value :_*))
  }
}
