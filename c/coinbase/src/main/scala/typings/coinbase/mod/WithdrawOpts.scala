package typings.coinbase.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WithdrawOpts extends js.Object {
  /**
    * Withdrawal amount
    */
  var amount: String = js.native
  /**
    * If set to false, this withdrawal will not be immediately completed. Use the commit call to complete it. Default value: true
    */
  var commit: js.UndefOr[Boolean] = js.native
  /**
    * Currency for the amount (see Client#getCurrencies() for available strings)
    */
  var currency: String = js.native
  /**
    * The ID of the payment method that should be used for the buy. (todo get payment methods)
    */
  var payment_method: js.UndefOr[String] = js.native
}

object WithdrawOpts {
  @scala.inline
  def apply(amount: String, currency: String): WithdrawOpts = {
    val __obj = js.Dynamic.literal(amount = amount.asInstanceOf[js.Any], currency = currency.asInstanceOf[js.Any])
    __obj.asInstanceOf[WithdrawOpts]
  }
  @scala.inline
  implicit class WithdrawOptsOps[Self <: WithdrawOpts] (val x: Self) extends AnyVal {
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
    def setCurrency(value: String): Self = this.set("currency", value.asInstanceOf[js.Any])
    @scala.inline
    def setCommit(value: Boolean): Self = this.set("commit", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCommit: Self = this.set("commit", js.undefined)
    @scala.inline
    def setPayment_method(value: String): Self = this.set("payment_method", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePayment_method: Self = this.set("payment_method", js.undefined)
  }
  
}

