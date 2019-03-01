package typings
package chromeDashAppsLib.chromeNs.networkingNs.oncNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CellularProperties[M /* <: ManagedObject */] extends CellularBase {
  /** The cellular network activation type. */
  var ActivationType: js.UndefOr[java.lang.String] = js.undefined
  /** Whether roaming is allowed for the network. */
  var AllowRoaming: js.UndefOr[scala.Boolean] = js.undefined
  /** Whether the cellular network should be connected automatically (when in range). */
  var AutoConnect: js.UndefOr[scala.Boolean | ManagedBoolean] = js.undefined
  /** The name of the carrier for which the cellular device is configured. */
  var Carrier: js.UndefOr[java.lang.String | ManagedDOMString] = js.undefined
  /** Cellular device technology family - CDMA or GSM. */
  var Family: js.UndefOr[
    chromeDashAppsLib.chromeDashAppsLibStrings.CDMA | chromeDashAppsLib.chromeDashAppsLibStrings.GSM
  ] = js.undefined
  /** The firmware revision loaded in the cellular modem. */
  var FirmwareRevision: js.UndefOr[java.lang.String] = js.undefined
  /** The list of networks found during the most recent network scan. */
  var FoundNetworks: js.UndefOr[js.Array[FoundNetworkProperties]] = js.undefined
  /** The cellular modem hardware revision. */
  var HardwareRevision: js.UndefOr[java.lang.String] = js.undefined
  /** Information about the operator that issued the SIM card currently installed in the modem. */
  var HomeProvider: js.UndefOr[CellularProviderProperties] = js.undefined
  /** The cellular modem manufacturer. */
  var MAnufacturer: js.UndefOr[java.lang.String] = js.undefined
  /** The cellular modem model ID. */
  var ModelID: js.UndefOr[java.lang.String] = js.undefined
  /** The revision of the Preferred Roaming List loaded in the modem. */
  var PRLVersion: js.UndefOr[chromeDashAppsLib.chromeNs.integer] = js.undefined
  /** Online payment portal a user can use to sign-up for or modify a mobile data plan. */
  var PaymentPortal: js.UndefOr[PaymentPortal | PaymentPortalPost] = js.undefined
  /** The state of SIM lock for GSM family networks. */
  var SIMLockStatus: js.UndefOr[SIMLockStatus] = js.undefined
  /**
    * @since Chrome 63.
    * True when a cellular network scan is in progress.
    */
  var Scanning: js.UndefOr[scala.Boolean] = js.undefined
  /** Information about the operator on whose network the modem is currently registered. */
  var ServingOperator: js.UndefOr[CellularProviderProperties] = js.undefined
  /** Whether the cellular network supports scanning. */
  var SupportNetworkScan: js.UndefOr[scala.Boolean] = js.undefined
  /** A list of supported carriers. */
  var SupportedCarriers: js.UndefOr[js.Array[java.lang.String]] = js.undefined
}

object CellularProperties {
  @scala.inline
  def apply[M /* <: ManagedObject */](
    ActivationState: ActivationStateType = null,
    ActivationType: java.lang.String = null,
    AllowRoaming: js.UndefOr[scala.Boolean] = js.undefined,
    AutoConnect: scala.Boolean | ManagedBoolean = null,
    Carrier: java.lang.String | ManagedDOMString = null,
    Family: chromeDashAppsLib.chromeDashAppsLibStrings.CDMA | chromeDashAppsLib.chromeDashAppsLibStrings.GSM = null,
    FirmwareRevision: java.lang.String = null,
    FoundNetworks: js.Array[FoundNetworkProperties] = null,
    HardwareRevision: java.lang.String = null,
    HomeProvider: CellularProviderProperties = null,
    MAnufacturer: java.lang.String = null,
    ModelID: java.lang.String = null,
    NetworkTechnology: java.lang.String = null,
    PRLVersion: js.UndefOr[chromeDashAppsLib.chromeNs.integer] = js.undefined,
    PaymentPortal: PaymentPortal | PaymentPortalPost = null,
    RoamingState: java.lang.String = null,
    SIMLockStatus: SIMLockStatus = null,
    SIMPresent: js.UndefOr[scala.Boolean] = js.undefined,
    Scanning: js.UndefOr[scala.Boolean] = js.undefined,
    ServingOperator: CellularProviderProperties = null,
    SignalStrength: js.UndefOr[chromeDashAppsLib.chromeNs.integer] = js.undefined,
    SupportNetworkScan: js.UndefOr[scala.Boolean] = js.undefined,
    SupportedCarriers: js.Array[java.lang.String] = null
  ): CellularProperties[M] = {
    val __obj = js.Dynamic.literal()
    if (ActivationState != null) __obj.updateDynamic("ActivationState")(ActivationState)
    if (ActivationType != null) __obj.updateDynamic("ActivationType")(ActivationType)
    if (!js.isUndefined(AllowRoaming)) __obj.updateDynamic("AllowRoaming")(AllowRoaming)
    if (AutoConnect != null) __obj.updateDynamic("AutoConnect")(AutoConnect.asInstanceOf[js.Any])
    if (Carrier != null) __obj.updateDynamic("Carrier")(Carrier.asInstanceOf[js.Any])
    if (Family != null) __obj.updateDynamic("Family")(Family.asInstanceOf[js.Any])
    if (FirmwareRevision != null) __obj.updateDynamic("FirmwareRevision")(FirmwareRevision)
    if (FoundNetworks != null) __obj.updateDynamic("FoundNetworks")(FoundNetworks)
    if (HardwareRevision != null) __obj.updateDynamic("HardwareRevision")(HardwareRevision)
    if (HomeProvider != null) __obj.updateDynamic("HomeProvider")(HomeProvider)
    if (MAnufacturer != null) __obj.updateDynamic("MAnufacturer")(MAnufacturer)
    if (ModelID != null) __obj.updateDynamic("ModelID")(ModelID)
    if (NetworkTechnology != null) __obj.updateDynamic("NetworkTechnology")(NetworkTechnology)
    if (!js.isUndefined(PRLVersion)) __obj.updateDynamic("PRLVersion")(PRLVersion)
    if (PaymentPortal != null) __obj.updateDynamic("PaymentPortal")(PaymentPortal.asInstanceOf[js.Any])
    if (RoamingState != null) __obj.updateDynamic("RoamingState")(RoamingState)
    if (SIMLockStatus != null) __obj.updateDynamic("SIMLockStatus")(SIMLockStatus)
    if (!js.isUndefined(SIMPresent)) __obj.updateDynamic("SIMPresent")(SIMPresent)
    if (!js.isUndefined(Scanning)) __obj.updateDynamic("Scanning")(Scanning)
    if (ServingOperator != null) __obj.updateDynamic("ServingOperator")(ServingOperator)
    if (!js.isUndefined(SignalStrength)) __obj.updateDynamic("SignalStrength")(SignalStrength)
    if (!js.isUndefined(SupportNetworkScan)) __obj.updateDynamic("SupportNetworkScan")(SupportNetworkScan)
    if (SupportedCarriers != null) __obj.updateDynamic("SupportedCarriers")(SupportedCarriers)
    __obj.asInstanceOf[CellularProperties[M]]
  }
}

