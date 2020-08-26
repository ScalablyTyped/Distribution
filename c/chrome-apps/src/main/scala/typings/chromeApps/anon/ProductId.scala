package typings.chromeApps.anon

import typings.chromeApps.chrome.integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ProductId extends js.Object {
  var productId: integer = js.native
  var vendorId: integer = js.native
}

object ProductId {
  @scala.inline
  def apply(productId: integer, vendorId: integer): ProductId = {
    val __obj = js.Dynamic.literal(productId = productId.asInstanceOf[js.Any], vendorId = vendorId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProductId]
  }
  @scala.inline
  implicit class ProductIdOps[Self <: ProductId] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setProductId(value: integer): Self = this.set("productId", value.asInstanceOf[js.Any])
    @scala.inline
    def setVendorId(value: integer): Self = this.set("vendorId", value.asInstanceOf[js.Any])
  }
  
}

