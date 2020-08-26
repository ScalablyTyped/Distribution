package typings.braintreeWeb.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MerchantId extends js.Object {
  var merchantId: String = js.native
}

object MerchantId {
  @scala.inline
  def apply(merchantId: String): MerchantId = {
    val __obj = js.Dynamic.literal(merchantId = merchantId.asInstanceOf[js.Any])
    __obj.asInstanceOf[MerchantId]
  }
  @scala.inline
  implicit class MerchantIdOps[Self <: MerchantId] (val x: Self) extends AnyVal {
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
    def setMerchantId(value: String): Self = this.set("merchantId", value.asInstanceOf[js.Any])
  }
  
}

