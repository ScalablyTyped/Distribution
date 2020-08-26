package typings.braintree.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CustomerRiskData extends js.Object {
  var customerBrowser: js.UndefOr[String] = js.native
  var customerIp: js.UndefOr[String] = js.native
}

object CustomerRiskData {
  @scala.inline
  def apply(): CustomerRiskData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CustomerRiskData]
  }
  @scala.inline
  implicit class CustomerRiskDataOps[Self <: CustomerRiskData] (val x: Self) extends AnyVal {
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
    def setCustomerBrowser(value: String): Self = this.set("customerBrowser", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCustomerBrowser: Self = this.set("customerBrowser", js.undefined)
    @scala.inline
    def setCustomerIp(value: String): Self = this.set("customerIp", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCustomerIp: Self = this.set("customerIp", js.undefined)
  }
  
}

