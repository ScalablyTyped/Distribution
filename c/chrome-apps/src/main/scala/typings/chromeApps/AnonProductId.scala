package typings.chromeApps

import typings.chromeApps.chrome.integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonProductId extends js.Object {
  var productId: integer
  var vendorId: integer
}

object AnonProductId {
  @scala.inline
  def apply(productId: integer, vendorId: integer): AnonProductId = {
    val __obj = js.Dynamic.literal(productId = productId.asInstanceOf[js.Any], vendorId = vendorId.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonProductId]
  }
}

