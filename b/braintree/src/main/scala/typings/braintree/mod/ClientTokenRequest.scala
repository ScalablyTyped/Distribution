package typings.braintree.mod

import typings.braintree.anon.FailOnDuplicatePaymentMethod
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClientTokenRequest extends js.Object {
  var customerId: js.UndefOr[String] = js.native
  var merchantAccountId: js.UndefOr[String] = js.native
  var options: js.UndefOr[FailOnDuplicatePaymentMethod] = js.native
  var version: js.UndefOr[String] = js.native
}

object ClientTokenRequest {
  @scala.inline
  def apply(): ClientTokenRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClientTokenRequest]
  }
  @scala.inline
  implicit class ClientTokenRequestOps[Self <: ClientTokenRequest] (val x: Self) extends AnyVal {
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
    def deleteCustomerId: Self = this.set("customerId", js.undefined)
    @scala.inline
    def setMerchantAccountId(value: String): Self = this.set("merchantAccountId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMerchantAccountId: Self = this.set("merchantAccountId", js.undefined)
    @scala.inline
    def setOptions(value: FailOnDuplicatePaymentMethod): Self = this.set("options", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOptions: Self = this.set("options", js.undefined)
    @scala.inline
    def setVersion(value: String): Self = this.set("version", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVersion: Self = this.set("version", js.undefined)
  }
  
}

