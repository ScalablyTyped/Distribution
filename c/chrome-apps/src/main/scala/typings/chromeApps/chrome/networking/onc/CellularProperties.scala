package typings.chromeApps.chrome.networking.onc

import typings.chromeApps.chrome.integer
import typings.chromeApps.chromeAppsStrings.CDMA
import typings.chromeApps.chromeAppsStrings.GSM
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CellularProperties[M /* <: ManagedObject */]
  extends StObject
     with CellularBase {
  
  /** The cellular network activation type. */
  var ActivationType: js.UndefOr[String] = js.undefined
  
  /** Whether roaming is allowed for the network. */
  var AllowRoaming: js.UndefOr[Boolean] = js.undefined
  
  /** Whether the cellular network should be connected automatically (when in range). */
  var AutoConnect: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: M extends 'managed' ? chrome-apps.chrome.networking.onc.ManagedBoolean : boolean | undefined */ js.Any
  ] = js.undefined
  
  /** The name of the carrier for which the cellular device is configured. */
  var Carrier: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: M extends 'managed' ? chrome-apps.chrome.networking.onc.ManagedDOMString : string | undefined */ js.Any
  ] = js.undefined
  
  /** Cellular device technology family - CDMA or GSM. */
  var Family: js.UndefOr[CDMA | GSM] = js.undefined
  
  /** The firmware revision loaded in the cellular modem. */
  var FirmwareRevision: js.UndefOr[String] = js.undefined
  
  /** The list of networks found during the most recent network scan. */
  var FoundNetworks: js.UndefOr[js.Array[FoundNetworkProperties]] = js.undefined
  
  /** The cellular modem hardware revision. */
  var HardwareRevision: js.UndefOr[String] = js.undefined
  
  /** Information about the operator that issued the SIM card currently installed in the modem. */
  var HomeProvider: js.UndefOr[CellularProviderProperties] = js.undefined
  
  /** The cellular modem manufacturer. */
  var MAnufacturer: js.UndefOr[String] = js.undefined
  
  /** The cellular modem model ID. */
  var ModelID: js.UndefOr[String] = js.undefined
  
  /** The revision of the Preferred Roaming List loaded in the modem. */
  var PRLVersion: js.UndefOr[integer] = js.undefined
  
  /** Online payment portal a user can use to sign-up for or modify a mobile data plan. */
  var PaymentPortal: js.UndefOr[typings.chromeApps.chrome.networking.onc.PaymentPortal | PaymentPortalPost] = js.undefined
  
  /** The state of SIM lock for GSM family networks. */
  var SIMLockStatus: js.UndefOr[typings.chromeApps.chrome.networking.onc.SIMLockStatus] = js.undefined
  
  /**
    * @since Chrome 63.
    * True when a cellular network scan is in progress.
    */
  var Scanning: js.UndefOr[Boolean] = js.undefined
  
  /** Information about the operator on whose network the modem is currently registered. */
  var ServingOperator: js.UndefOr[CellularProviderProperties] = js.undefined
  
  /** Whether the cellular network supports scanning. */
  var SupportNetworkScan: js.UndefOr[Boolean] = js.undefined
  
  /** A list of supported carriers. */
  var SupportedCarriers: js.UndefOr[js.Array[String]] = js.undefined
}
object CellularProperties {
  
  inline def apply[M /* <: ManagedObject */](): CellularProperties[M] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CellularProperties[M]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CellularProperties[?], M /* <: ManagedObject */] (val x: Self & CellularProperties[M]) extends AnyVal {
    
    inline def setActivationType(value: String): Self = StObject.set(x, "ActivationType", value.asInstanceOf[js.Any])
    
    inline def setActivationTypeUndefined: Self = StObject.set(x, "ActivationType", js.undefined)
    
    inline def setAllowRoaming(value: Boolean): Self = StObject.set(x, "AllowRoaming", value.asInstanceOf[js.Any])
    
    inline def setAllowRoamingUndefined: Self = StObject.set(x, "AllowRoaming", js.undefined)
    
    inline def setAutoConnect(
      value: /* import warning: importer.ImportType#apply Failed type conversion: M extends 'managed' ? chrome-apps.chrome.networking.onc.ManagedBoolean : boolean | undefined */ js.Any
    ): Self = StObject.set(x, "AutoConnect", value.asInstanceOf[js.Any])
    
    inline def setAutoConnectUndefined: Self = StObject.set(x, "AutoConnect", js.undefined)
    
    inline def setCarrier(
      value: /* import warning: importer.ImportType#apply Failed type conversion: M extends 'managed' ? chrome-apps.chrome.networking.onc.ManagedDOMString : string | undefined */ js.Any
    ): Self = StObject.set(x, "Carrier", value.asInstanceOf[js.Any])
    
    inline def setCarrierUndefined: Self = StObject.set(x, "Carrier", js.undefined)
    
    inline def setFamily(value: CDMA | GSM): Self = StObject.set(x, "Family", value.asInstanceOf[js.Any])
    
    inline def setFamilyUndefined: Self = StObject.set(x, "Family", js.undefined)
    
    inline def setFirmwareRevision(value: String): Self = StObject.set(x, "FirmwareRevision", value.asInstanceOf[js.Any])
    
    inline def setFirmwareRevisionUndefined: Self = StObject.set(x, "FirmwareRevision", js.undefined)
    
    inline def setFoundNetworks(value: js.Array[FoundNetworkProperties]): Self = StObject.set(x, "FoundNetworks", value.asInstanceOf[js.Any])
    
    inline def setFoundNetworksUndefined: Self = StObject.set(x, "FoundNetworks", js.undefined)
    
    inline def setFoundNetworksVarargs(value: FoundNetworkProperties*): Self = StObject.set(x, "FoundNetworks", js.Array(value*))
    
    inline def setHardwareRevision(value: String): Self = StObject.set(x, "HardwareRevision", value.asInstanceOf[js.Any])
    
    inline def setHardwareRevisionUndefined: Self = StObject.set(x, "HardwareRevision", js.undefined)
    
    inline def setHomeProvider(value: CellularProviderProperties): Self = StObject.set(x, "HomeProvider", value.asInstanceOf[js.Any])
    
    inline def setHomeProviderUndefined: Self = StObject.set(x, "HomeProvider", js.undefined)
    
    inline def setMAnufacturer(value: String): Self = StObject.set(x, "MAnufacturer", value.asInstanceOf[js.Any])
    
    inline def setMAnufacturerUndefined: Self = StObject.set(x, "MAnufacturer", js.undefined)
    
    inline def setModelID(value: String): Self = StObject.set(x, "ModelID", value.asInstanceOf[js.Any])
    
    inline def setModelIDUndefined: Self = StObject.set(x, "ModelID", js.undefined)
    
    inline def setPRLVersion(value: integer): Self = StObject.set(x, "PRLVersion", value.asInstanceOf[js.Any])
    
    inline def setPRLVersionUndefined: Self = StObject.set(x, "PRLVersion", js.undefined)
    
    inline def setPaymentPortal(value: PaymentPortal | PaymentPortalPost): Self = StObject.set(x, "PaymentPortal", value.asInstanceOf[js.Any])
    
    inline def setPaymentPortalUndefined: Self = StObject.set(x, "PaymentPortal", js.undefined)
    
    inline def setSIMLockStatus(value: SIMLockStatus): Self = StObject.set(x, "SIMLockStatus", value.asInstanceOf[js.Any])
    
    inline def setSIMLockStatusUndefined: Self = StObject.set(x, "SIMLockStatus", js.undefined)
    
    inline def setScanning(value: Boolean): Self = StObject.set(x, "Scanning", value.asInstanceOf[js.Any])
    
    inline def setScanningUndefined: Self = StObject.set(x, "Scanning", js.undefined)
    
    inline def setServingOperator(value: CellularProviderProperties): Self = StObject.set(x, "ServingOperator", value.asInstanceOf[js.Any])
    
    inline def setServingOperatorUndefined: Self = StObject.set(x, "ServingOperator", js.undefined)
    
    inline def setSupportNetworkScan(value: Boolean): Self = StObject.set(x, "SupportNetworkScan", value.asInstanceOf[js.Any])
    
    inline def setSupportNetworkScanUndefined: Self = StObject.set(x, "SupportNetworkScan", js.undefined)
    
    inline def setSupportedCarriers(value: js.Array[String]): Self = StObject.set(x, "SupportedCarriers", value.asInstanceOf[js.Any])
    
    inline def setSupportedCarriersUndefined: Self = StObject.set(x, "SupportedCarriers", js.undefined)
    
    inline def setSupportedCarriersVarargs(value: String*): Self = StObject.set(x, "SupportedCarriers", js.Array(value*))
  }
}
