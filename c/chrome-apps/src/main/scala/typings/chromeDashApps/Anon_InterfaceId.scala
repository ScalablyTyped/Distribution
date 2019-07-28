package typings.chromeDashApps

import typings.chromeDashApps.chromeNs.integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_InterfaceId extends js.Object {
  var interfaceId: js.UndefOr[integer] = js.undefined
  var productId: integer
  var vendorId: integer
}

object Anon_InterfaceId {
  @scala.inline
  def apply(productId: integer, vendorId: integer, interfaceId: js.UndefOr[integer] = js.undefined): Anon_InterfaceId = {
    val __obj = js.Dynamic.literal(productId = productId, vendorId = vendorId)
    if (!js.isUndefined(interfaceId)) __obj.updateDynamic("interfaceId")(interfaceId)
    __obj.asInstanceOf[Anon_InterfaceId]
  }
}

