package typings.coinbase.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SellOpts extends js.Object {
  /**
    * Whether or not you would still like to sell if you have to wait for your money to arrive to lock in a price
    */
  var agree_btc_amount_varies: js.UndefOr[Boolean] = js.undefined
  /**
    * Sell amount without fees (alternative to total)
    */
  var amount: js.UndefOr[String] = js.undefined
  /**
    * If set to false, this sell will not be immediately completed. Use the commit call to complete it. Default value: true
    */
  var commit: js.UndefOr[Boolean] = js.undefined
  /**
    * Currency for the amount (see Client#getCurrencies() for available strings)
    */
  var currency: String
  /**
    * The ID of the payment method that should be used for the sell.
    */
  var payment_method: js.UndefOr[String] = js.undefined
  /**
    * If set to true, response will return an unsave sell for detailed price quote. Default value: false
    */
  var quote: js.UndefOr[Boolean] = js.undefined
  /**
    * Sell amount with fees (alternative to amount)
    */
  var total: js.UndefOr[String] = js.undefined
}

object SellOpts {
  @scala.inline
  def apply(
    currency: String,
    agree_btc_amount_varies: js.UndefOr[Boolean] = js.undefined,
    amount: String = null,
    commit: js.UndefOr[Boolean] = js.undefined,
    payment_method: String = null,
    quote: js.UndefOr[Boolean] = js.undefined,
    total: String = null
  ): SellOpts = {
    val __obj = js.Dynamic.literal(currency = currency.asInstanceOf[js.Any])
    if (!js.isUndefined(agree_btc_amount_varies)) __obj.updateDynamic("agree_btc_amount_varies")(agree_btc_amount_varies.asInstanceOf[js.Any])
    if (amount != null) __obj.updateDynamic("amount")(amount.asInstanceOf[js.Any])
    if (!js.isUndefined(commit)) __obj.updateDynamic("commit")(commit.asInstanceOf[js.Any])
    if (payment_method != null) __obj.updateDynamic("payment_method")(payment_method.asInstanceOf[js.Any])
    if (!js.isUndefined(quote)) __obj.updateDynamic("quote")(quote.asInstanceOf[js.Any])
    if (total != null) __obj.updateDynamic("total")(total.asInstanceOf[js.Any])
    __obj.asInstanceOf[SellOpts]
  }
}

