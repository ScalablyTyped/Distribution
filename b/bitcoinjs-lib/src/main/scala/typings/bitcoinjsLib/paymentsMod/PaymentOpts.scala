package typings.bitcoinjsLib.paymentsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PaymentOpts extends js.Object {
  var allowIncomplete: js.UndefOr[Boolean] = js.native
  var validate: js.UndefOr[Boolean] = js.native
}

object PaymentOpts {
  @scala.inline
  def apply(): PaymentOpts = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PaymentOpts]
  }
  @scala.inline
  implicit class PaymentOptsOps[Self <: PaymentOpts] (val x: Self) extends AnyVal {
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
    def setAllowIncomplete(value: Boolean): Self = this.set("allowIncomplete", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAllowIncomplete: Self = this.set("allowIncomplete", js.undefined)
    @scala.inline
    def setValidate(value: Boolean): Self = this.set("validate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValidate: Self = this.set("validate", js.undefined)
  }
  
}

