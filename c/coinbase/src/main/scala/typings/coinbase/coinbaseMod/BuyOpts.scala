package typings.coinbase.coinbaseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BuyOpts extends js.Object {
  /**
    * Whether or not you would still like to buy if you have to wait for your money to arrive to lock in a price
    */
  var agree_btc_amount_varies: js.UndefOr[Boolean] = js.undefined
  /**
    * Buy amount without fees (alternative to total)
    */
  var amount: js.UndefOr[String] = js.undefined
  /**
    * If set to false, this buy will not be immediately completed. Use the commit call to complete it. Default value: true
    */
  var commit: js.UndefOr[Boolean] = js.undefined
  /**
    * Currency for the amount (see Client#getCurrencies() for available strings)
    */
  var currency: String
  /**
    * The ID of the payment method that should be used for the buy. (todo get payment methods)
    */
  var payment_method: js.UndefOr[String] = js.undefined
  /**
    * If set to true, response will return an unsave buy for detailed price quote. Default value: false
    */
  var quote: js.UndefOr[Boolean] = js.undefined
  /**
    * Buy amount with fees (alternative to amount)
    */
  var total: js.UndefOr[String] = js.undefined
}

object BuyOpts {
  @scala.inline
  def apply(
    currency: String,
    agree_btc_amount_varies: js.UndefOr[Boolean] = js.undefined,
    amount: String = null,
    commit: js.UndefOr[Boolean] = js.undefined,
    payment_method: String = null,
    quote: js.UndefOr[Boolean] = js.undefined,
    total: String = null
  ): BuyOpts = {
    val __obj = js.Dynamic.literal(currency = currency)
    if (!js.isUndefined(agree_btc_amount_varies)) __obj.updateDynamic("agree_btc_amount_varies")(agree_btc_amount_varies)
    if (amount != null) __obj.updateDynamic("amount")(amount)
    if (!js.isUndefined(commit)) __obj.updateDynamic("commit")(commit)
    if (payment_method != null) __obj.updateDynamic("payment_method")(payment_method)
    if (!js.isUndefined(quote)) __obj.updateDynamic("quote")(quote)
    if (total != null) __obj.updateDynamic("total")(total)
    __obj.asInstanceOf[BuyOpts]
  }
}

