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

