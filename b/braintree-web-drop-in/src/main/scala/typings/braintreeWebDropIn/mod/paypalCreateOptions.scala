package typings.braintreeWebDropIn.mod

import typings.braintreeWebDropIn.braintreeWebDropInStrings.checkout
import typings.braintreeWebDropIn.braintreeWebDropInStrings.vault
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait paypalCreateOptions extends js.Object {
  var amount: js.UndefOr[String | Double] = js.native
  var buttonStyle: js.UndefOr[String] = js.native
  var commit: js.UndefOr[Boolean] = js.native
  var currency: js.UndefOr[String] = js.native
  var flow: checkout | vault = js.native
}

object paypalCreateOptions {
  @scala.inline
  def apply(flow: checkout | vault): paypalCreateOptions = {
    val __obj = js.Dynamic.literal(flow = flow.asInstanceOf[js.Any])
    __obj.asInstanceOf[paypalCreateOptions]
  }
  @scala.inline
  implicit class paypalCreateOptionsOps[Self <: paypalCreateOptions] (val x: Self) extends AnyVal {
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
    def setFlow(value: checkout | vault): Self = this.set("flow", value.asInstanceOf[js.Any])
    @scala.inline
    def setAmount(value: String | Double): Self = this.set("amount", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAmount: Self = this.set("amount", js.undefined)
    @scala.inline
    def setButtonStyle(value: String): Self = this.set("buttonStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteButtonStyle: Self = this.set("buttonStyle", js.undefined)
    @scala.inline
    def setCommit(value: Boolean): Self = this.set("commit", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCommit: Self = this.set("commit", js.undefined)
    @scala.inline
    def setCurrency(value: String): Self = this.set("currency", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCurrency: Self = this.set("currency", js.undefined)
  }
  
}

