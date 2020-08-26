package typings.braintreeWeb.clientMod

import typings.braintreeWeb.anon.PostalCode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreditCardInfo extends js.Object {
  var billingAddress: PostalCode = js.native
  var cvv: String = js.native
  var expirationDate: String = js.native
  var number: String = js.native
}

object CreditCardInfo {
  @scala.inline
  def apply(billingAddress: PostalCode, cvv: String, expirationDate: String, number: String): CreditCardInfo = {
    val __obj = js.Dynamic.literal(billingAddress = billingAddress.asInstanceOf[js.Any], cvv = cvv.asInstanceOf[js.Any], expirationDate = expirationDate.asInstanceOf[js.Any], number = number.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreditCardInfo]
  }
  @scala.inline
  implicit class CreditCardInfoOps[Self <: CreditCardInfo] (val x: Self) extends AnyVal {
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
    def setBillingAddress(value: PostalCode): Self = this.set("billingAddress", value.asInstanceOf[js.Any])
    @scala.inline
    def setCvv(value: String): Self = this.set("cvv", value.asInstanceOf[js.Any])
    @scala.inline
    def setExpirationDate(value: String): Self = this.set("expirationDate", value.asInstanceOf[js.Any])
    @scala.inline
    def setNumber(value: String): Self = this.set("number", value.asInstanceOf[js.Any])
  }
  
}

