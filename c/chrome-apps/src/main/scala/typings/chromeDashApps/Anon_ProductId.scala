package typings.chromeDashApps

import typings.chromeDashApps.chrome.integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ProductId extends js.Object {
  var productId: integer
  var vendorId: integer
}

object Anon_ProductId {
  @scala.inline
  def apply(productId: integer, vendorId: integer): Anon_ProductId = {
    val __obj = js.Dynamic.literal(productId = productId, vendorId = vendorId)
  
    __obj.asInstanceOf[Anon_ProductId]
  }
}

