package typings
package chromeDashAppsLib.chromeNs.hidNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeviceOptions extends js.Object {
  /**
    * A device matching any given filter will be returned.
    * An empty filter list will return all devices the app has permission for.
    * @since Chrome 39
    */
  var filters: js.UndefOr[js.Array[DeviceFilter]] = js.undefined
  /**
    * Equivalent to setting DeviceFilter.productId.
    * @deprecated Deprecated since Chrome 39.
    */
  var productId: js.UndefOr[chromeDashAppsLib.chromeNs.deprecated] = js.undefined
  /**
    * Equivalent to setting DeviceFilter.vendorId.
    * @deprecated Deprecated since Chrome 39
    */
  var vendorId: js.UndefOr[chromeDashAppsLib.chromeNs.deprecated] = js.undefined
}

object DeviceOptions {
  @scala.inline
  def apply(
    filters: js.Array[DeviceFilter] = null,
    productId: js.UndefOr[chromeDashAppsLib.chromeNs.deprecated] = js.undefined,
    vendorId: js.UndefOr[chromeDashAppsLib.chromeNs.deprecated] = js.undefined
  ): DeviceOptions = {
    val __obj = js.Dynamic.literal()
    if (filters != null) __obj.updateDynamic("filters")(filters)
    if (!js.isUndefined(productId)) __obj.updateDynamic("productId")(productId)
    if (!js.isUndefined(vendorId)) __obj.updateDynamic("vendorId")(vendorId)
    __obj.asInstanceOf[DeviceOptions]
  }
}

