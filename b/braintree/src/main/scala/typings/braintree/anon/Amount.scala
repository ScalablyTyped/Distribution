package typings.braintree.anon

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Amount extends js.Object {
  var amount: String = js.native
  var createdAt: Date = js.native
  var id: String = js.native
  var orderId: String = js.native
  var paymentInstrumentSubtype: String = js.native
  var purchaseOrderNumber: String = js.native
}

object Amount {
  @scala.inline
  def apply(
    amount: String,
    createdAt: Date,
    id: String,
    orderId: String,
    paymentInstrumentSubtype: String,
    purchaseOrderNumber: String
  ): Amount = {
    val __obj = js.Dynamic.literal(amount = amount.asInstanceOf[js.Any], createdAt = createdAt.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], orderId = orderId.asInstanceOf[js.Any], paymentInstrumentSubtype = paymentInstrumentSubtype.asInstanceOf[js.Any], purchaseOrderNumber = purchaseOrderNumber.asInstanceOf[js.Any])
    __obj.asInstanceOf[Amount]
  }
  @scala.inline
  implicit class AmountOps[Self <: Amount] (val x: Self) extends AnyVal {
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
    def setAmount(value: String): Self = this.set("amount", value.asInstanceOf[js.Any])
    @scala.inline
    def setCreatedAt(value: Date): Self = this.set("createdAt", value.asInstanceOf[js.Any])
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setOrderId(value: String): Self = this.set("orderId", value.asInstanceOf[js.Any])
    @scala.inline
    def setPaymentInstrumentSubtype(value: String): Self = this.set("paymentInstrumentSubtype", value.asInstanceOf[js.Any])
    @scala.inline
    def setPurchaseOrderNumber(value: String): Self = this.set("purchaseOrderNumber", value.asInstanceOf[js.Any])
  }
  
}

