package typings.braintree.anon

import typings.braintree.mod.PaymentMethod
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CustomerId extends js.Object {
  var customerId: String = js.native
  var revokedPaymentMethod: PaymentMethod = js.native
  var token: String = js.native
}

object CustomerId {
  @scala.inline
  def apply(customerId: String, revokedPaymentMethod: PaymentMethod, token: String): CustomerId = {
    val __obj = js.Dynamic.literal(customerId = customerId.asInstanceOf[js.Any], revokedPaymentMethod = revokedPaymentMethod.asInstanceOf[js.Any], token = token.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomerId]
  }
  @scala.inline
  implicit class CustomerIdOps[Self <: CustomerId] (val x: Self) extends AnyVal {
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
    def setCustomerId(value: String): Self = this.set("customerId", value.asInstanceOf[js.Any])
    @scala.inline
    def setRevokedPaymentMethod(value: PaymentMethod): Self = this.set("revokedPaymentMethod", value.asInstanceOf[js.Any])
    @scala.inline
    def setToken(value: String): Self = this.set("token", value.asInstanceOf[js.Any])
  }
  
}

