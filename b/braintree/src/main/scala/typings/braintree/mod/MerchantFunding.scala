package typings.braintree.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MerchantFunding extends js.Object {
  var accountNumber: js.UndefOr[String] = js.native
  var accountNumberLast4: js.UndefOr[String] = js.native
  var descriptor: js.UndefOr[String] = js.native
  var destination: String = js.native
  var email: js.UndefOr[String] = js.native
  var mobilePhone: js.UndefOr[String] = js.native
  var routingNumber: js.UndefOr[String] = js.native
}

object MerchantFunding {
  @scala.inline
  def apply(destination: String): MerchantFunding = {
    val __obj = js.Dynamic.literal(destination = destination.asInstanceOf[js.Any])
    __obj.asInstanceOf[MerchantFunding]
  }
  @scala.inline
  implicit class MerchantFundingOps[Self <: MerchantFunding] (val x: Self) extends AnyVal {
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
    def setDestination(value: String): Self = this.set("destination", value.asInstanceOf[js.Any])
    @scala.inline
    def setAccountNumber(value: String): Self = this.set("accountNumber", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAccountNumber: Self = this.set("accountNumber", js.undefined)
    @scala.inline
    def setAccountNumberLast4(value: String): Self = this.set("accountNumberLast4", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAccountNumberLast4: Self = this.set("accountNumberLast4", js.undefined)
    @scala.inline
    def setDescriptor(value: String): Self = this.set("descriptor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescriptor: Self = this.set("descriptor", js.undefined)
    @scala.inline
    def setEmail(value: String): Self = this.set("email", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEmail: Self = this.set("email", js.undefined)
    @scala.inline
    def setMobilePhone(value: String): Self = this.set("mobilePhone", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMobilePhone: Self = this.set("mobilePhone", js.undefined)
    @scala.inline
    def setRoutingNumber(value: String): Self = this.set("routingNumber", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRoutingNumber: Self = this.set("routingNumber", js.undefined)
  }
  
}

