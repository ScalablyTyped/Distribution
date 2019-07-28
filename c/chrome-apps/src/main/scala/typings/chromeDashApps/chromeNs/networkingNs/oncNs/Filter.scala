package typings.chromeDashApps.chromeNs.networkingNs.oncNs

import typings.chromeDashApps.chromeNs.integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Describes which networks to return. */
trait Filter extends js.Object {
  /**
    * If true, only include configured (saved) networks.
    * @default false
    */
  var configured: js.UndefOr[Boolean] = js.undefined
  /**
    * Maximum number of networks to return.
    * Use 0 for no limit
    * @default 1000 if unspecified.
    * */
  var limit: js.UndefOr[integer] = js.undefined
  /** The type of networks to return. */
  var networkType: NetworkType
  /**
    * If true, only include visible (physically connected or in-range) networks.
    * @default false
    */
  var visible: js.UndefOr[Boolean] = js.undefined
}

object Filter {
  @scala.inline
  def apply(
    networkType: NetworkType,
    configured: js.UndefOr[Boolean] = js.undefined,
    limit: js.UndefOr[integer] = js.undefined,
    visible: js.UndefOr[Boolean] = js.undefined
  ): Filter = {
    val __obj = js.Dynamic.literal(networkType = networkType)
    if (!js.isUndefined(configured)) __obj.updateDynamic("configured")(configured)
    if (!js.isUndefined(limit)) __obj.updateDynamic("limit")(limit)
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible)
    __obj.asInstanceOf[Filter]
  }
}

