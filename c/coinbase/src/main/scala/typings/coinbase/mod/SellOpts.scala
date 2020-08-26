package typings.coinbase.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SellOpts extends js.Object {
  /**
    * Whether or not you would still like to sell if you have to wait for your money to arrive to lock in a price
    */
  var agree_btc_amount_varies: js.UndefOr[Boolean] = js.native
  /**
    * Sell amount without fees (alternative to total)
    */
  var amount: js.UndefOr[String] = js.native
  /**
    * If set to false, this sell will not be immediately completed. Use the commit call to complete it. Default value: true
    */
  var commit: js.UndefOr[Boolean] = js.native
  /**
    * Currency for the amount (see Client#getCurrencies() for available strings)
    */
  var currency: String = js.native
  /**
    * The ID of the payment method that should be used for the sell.
    */
  var payment_method: js.UndefOr[String] = js.native
  /**
    * If set to true, response will return an unsave sell for detailed price quote. Default value: false
    */
  var quote: js.UndefOr[Boolean] = js.native
  /**
    * Sell amount with fees (alternative to amount)
    */
  var total: js.UndefOr[String] = js.native
}

object SellOpts {
  @scala.inline
  def apply(currency: String): SellOpts = {
    val __obj = js.Dynamic.literal(currency = currency.asInstanceOf[js.Any])
    __obj.asInstanceOf[SellOpts]
  }
  @scala.inline
  implicit class SellOptsOps[Self <: SellOpts] (val x: Self) extends AnyVal {
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
    def setCurrency(value: String): Self = this.set("currency", value.asInstanceOf[js.Any])
    @scala.inline
    def setAgree_btc_amount_varies(value: Boolean): Self = this.set("agree_btc_amount_varies", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAgree_btc_amount_varies: Self = this.set("agree_btc_amount_varies", js.undefined)
    @scala.inline
    def setAmount(value: String): Self = this.set("amount", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAmount: Self = this.set("amount", js.undefined)
    @scala.inline
    def setCommit(value: Boolean): Self = this.set("commit", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCommit: Self = this.set("commit", js.undefined)
    @scala.inline
    def setPayment_method(value: String): Self = this.set("payment_method", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePayment_method: Self = this.set("payment_method", js.undefined)
    @scala.inline
    def setQuote(value: Boolean): Self = this.set("quote", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteQuote: Self = this.set("quote", js.undefined)
    @scala.inline
    def setTotal(value: String): Self = this.set("total", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTotal: Self = this.set("total", js.undefined)
  }
  
}

