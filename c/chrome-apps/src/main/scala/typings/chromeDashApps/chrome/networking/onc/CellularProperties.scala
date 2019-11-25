package typings.chromeDashApps.chrome.networking.onc

import typings.chromeDashApps.chrome.integer
import typings.chromeDashApps.chromeDashAppsStrings.CDMA
import typings.chromeDashApps.chromeDashAppsStrings.GSM
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CellularProperties[M /* <: ManagedObject */] extends CellularBase {
  /** The cellular network activation type. */
  var ActivationType: js.UndefOr[String] = js.undefined
  /** Whether roaming is allowed for the network. */
  var AllowRoaming: js.UndefOr[Boolean] = js.undefined
  /** Whether the cellular network should be connected automatically (when in range). */
  var AutoConnect: js.UndefOr[Boolean | ManagedBoolean] = js.undefined
  /** The name of the carrier for which the cellular device is configured. */
  var Carrier: js.UndefOr[String | ManagedDOMString] = js.undefined
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
  var PaymentPortal: js.UndefOr[typings.chromeDashApps.chrome.networking.onc.PaymentPortal | PaymentPortalPost] = js.undefined
  /** The state of SIM lock for GSM family networks. */
  var SIMLockStatus: js.UndefOr[typings.chromeDashApps.chrome.networking.onc.SIMLockStatus] = js.undefined
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
  @scala.inline
  def apply[M /* <: ManagedObject */](
    ActivationState: ActivationStateType = null,
    ActivationType: String = null,
    AllowRoaming: js.UndefOr[Boolean] = js.undefined,
    AutoConnect: Boolean | ManagedBoolean = null,
    Carrier: String | ManagedDOMString = null,
    Family: CDMA | GSM = null,
    FirmwareRevision: String = null,
    FoundNetworks: js.Array[FoundNetworkProperties] = null,
    HardwareRevision: String = null,
    HomeProvider: CellularProviderProperties = null,
    MAnufacturer: String = null,
    ModelID: String = null,
    NetworkTechnology: String = null,
    PRLVersion: Int | Double = null,
    PaymentPortal: PaymentPortal | PaymentPortalPost = null,
    RoamingState: String = null,
    SIMLockStatus: SIMLockStatus = null,
    SIMPresent: js.UndefOr[Boolean] = js.undefined,
    Scanning: js.UndefOr[Boolean] = js.undefined,
    ServingOperator: CellularProviderProperties = null,
    SignalStrength: Int | Double = null,
    SupportNetworkScan: js.UndefOr[Boolean] = js.undefined,
    SupportedCarriers: js.Array[String] = null
  ): CellularProperties[M] = {
    val __obj = js.Dynamic.literal()
    if (ActivationState != null) __obj.updateDynamic("ActivationState")(ActivationState.asInstanceOf[js.Any])
    if (ActivationType != null) __obj.updateDynamic("ActivationType")(ActivationType.asInstanceOf[js.Any])
    if (!js.isUndefined(AllowRoaming)) __obj.updateDynamic("AllowRoaming")(AllowRoaming.asInstanceOf[js.Any])
    if (AutoConnect != null) __obj.updateDynamic("AutoConnect")(AutoConnect.asInstanceOf[js.Any])
    if (Carrier != null) __obj.updateDynamic("Carrier")(Carrier.asInstanceOf[js.Any])
    if (Family != null) __obj.updateDynamic("Family")(Family.asInstanceOf[js.Any])
    if (FirmwareRevision != null) __obj.updateDynamic("FirmwareRevision")(FirmwareRevision.asInstanceOf[js.Any])
    if (FoundNetworks != null) __obj.updateDynamic("FoundNetworks")(FoundNetworks.asInstanceOf[js.Any])
    if (HardwareRevision != null) __obj.updateDynamic("HardwareRevision")(HardwareRevision.asInstanceOf[js.Any])
    if (HomeProvider != null) __obj.updateDynamic("HomeProvider")(HomeProvider.asInstanceOf[js.Any])
    if (MAnufacturer != null) __obj.updateDynamic("MAnufacturer")(MAnufacturer.asInstanceOf[js.Any])
    if (ModelID != null) __obj.updateDynamic("ModelID")(ModelID.asInstanceOf[js.Any])
    if (NetworkTechnology != null) __obj.updateDynamic("NetworkTechnology")(NetworkTechnology.asInstanceOf[js.Any])
    if (PRLVersion != null) __obj.updateDynamic("PRLVersion")(PRLVersion.asInstanceOf[js.Any])
    if (PaymentPortal != null) __obj.updateDynamic("PaymentPortal")(PaymentPortal.asInstanceOf[js.Any])
    if (RoamingState != null) __obj.updateDynamic("RoamingState")(RoamingState.asInstanceOf[js.Any])
    if (SIMLockStatus != null) __obj.updateDynamic("SIMLockStatus")(SIMLockStatus.asInstanceOf[js.Any])
    if (!js.isUndefined(SIMPresent)) __obj.updateDynamic("SIMPresent")(SIMPresent.asInstanceOf[js.Any])
    if (!js.isUndefined(Scanning)) __obj.updateDynamic("Scanning")(Scanning.asInstanceOf[js.Any])
    if (ServingOperator != null) __obj.updateDynamic("ServingOperator")(ServingOperator.asInstanceOf[js.Any])
    if (SignalStrength != null) __obj.updateDynamic("SignalStrength")(SignalStrength.asInstanceOf[js.Any])
    if (!js.isUndefined(SupportNetworkScan)) __obj.updateDynamic("SupportNetworkScan")(SupportNetworkScan.asInstanceOf[js.Any])
    if (SupportedCarriers != null) __obj.updateDynamic("SupportedCarriers")(SupportedCarriers.asInstanceOf[js.Any])
    __obj.asInstanceOf[CellularProperties[M]]
  }
}

