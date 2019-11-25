package typings.chromeDashApps

import typings.chromeDashApps.chrome.integer
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
  def apply(productId: integer, vendorId: integer, interfaceId: Int | Double = null): Anon_InterfaceId = {
    val __obj = js.Dynamic.literal(productId = productId.asInstanceOf[js.Any], vendorId = vendorId.asInstanceOf[js.Any])
    if (interfaceId != null) __obj.updateDynamic("interfaceId")(interfaceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_InterfaceId]
  }
}

