package typings
package chromeDashAppsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_InterfaceId extends js.Object {
  var interfaceId: js.UndefOr[chromeDashAppsLib.chromeNs.integer] = js.undefined
  var productId: chromeDashAppsLib.chromeNs.integer
  var vendorId: chromeDashAppsLib.chromeNs.integer
}

object Anon_InterfaceId {
  @scala.inline
  def apply(
    productId: chromeDashAppsLib.chromeNs.integer,
    vendorId: chromeDashAppsLib.chromeNs.integer,
    interfaceId: js.UndefOr[chromeDashAppsLib.chromeNs.integer] = js.undefined
  ): Anon_InterfaceId = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("productId")(productId)
    __obj.updateDynamic("vendorId")(vendorId)
    if (!js.isUndefined(interfaceId)) __obj.updateDynamic("interfaceId")(interfaceId)
    __obj.asInstanceOf[Anon_InterfaceId]
  }
}

