package typings.braintreeWebDropIn.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait applePayCreateOptions extends js.Object {
  var applePaySessionVersion: js.UndefOr[Double] = js.native
  var buttonStyle: js.UndefOr[String] = js.native
  var displayName: String = js.native
  var paymentRequest: js.Any = js.native
}

object applePayCreateOptions {
  @scala.inline
  def apply(displayName: String, paymentRequest: js.Any): applePayCreateOptions = {
    val __obj = js.Dynamic.literal(displayName = displayName.asInstanceOf[js.Any], paymentRequest = paymentRequest.asInstanceOf[js.Any])
    __obj.asInstanceOf[applePayCreateOptions]
  }
  @scala.inline
  implicit class applePayCreateOptionsOps[Self <: applePayCreateOptions] (val x: Self) extends AnyVal {
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
    def setDisplayName(value: String): Self = this.set("displayName", value.asInstanceOf[js.Any])
    @scala.inline
    def setPaymentRequest(value: js.Any): Self = this.set("paymentRequest", value.asInstanceOf[js.Any])
    @scala.inline
    def setApplePaySessionVersion(value: Double): Self = this.set("applePaySessionVersion", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteApplePaySessionVersion: Self = this.set("applePaySessionVersion", js.undefined)
    @scala.inline
    def setButtonStyle(value: String): Self = this.set("buttonStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteButtonStyle: Self = this.set("buttonStyle", js.undefined)
  }
  
}

