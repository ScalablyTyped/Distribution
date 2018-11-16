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

